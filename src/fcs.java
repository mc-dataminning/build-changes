import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcs extends fct {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final vd c = vd.c("recover_world.title").a(n.r);
   private static final vd k = vd.c("recover_world.bug_tracker");
   private static final vd l = vd.c("recover_world.restore");
   private static final vd m = vd.c("recover_world.no_fallback");
   private static final vd n = vd.c("recover_world.done.title");
   private static final vd o = vd.c("recover_world.done.success");
   private static final vd p = vd.c("recover_world.done.failed");
   private static final vd q = vd.c("recover_world.issue.none").a(n.k);
   private static final vd r = vd.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer t;
   private final fam u = fam.d().a(10);
   private final vd v;
   private final exs w;
   private final exs x;
   private final egf.c y;

   public fcs(eva $$0, BooleanConsumer $$1, egf.c $$2) {
      super(c);
      this.t = $$1;
      this.v = vd.a("recover_world.message", vd.b($$2.d()).a(n.h));
      this.w = new exs(this.v, $$0.h);
      this.y = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      vd $$5 = vd.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.x = new exs($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.u.c().b();
      this.u.a(new eyf(this.e, $$0.h));
      this.u.a(this.w.b(true));
      this.u.a(this.x);
      fam $$7 = fam.e().a(5);
      $$7.a(ewy.a(k, fbl.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(ewy.a(l, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : eyj.a(m)).a()).j = $$6;
      this.u.a($$7);
      this.u.a(ewy.a(vc.k, $$0x -> this.aE_()).b(120, 20).a());
      this.u.a(this::d);
   }

   private void a(eva $$0) {
      Exception $$1 = this.a(this.y, false);
      Exception $$2 = this.a(this.y, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fbz(vd.c("recover_world.restoring")));
         fhl.a(this.y);
         if (this.y.l()) {
            $$0.a(new fbm(this.t, n, o, vc.j, vc.k));
         } else {
            $$0.a(new fbg(() -> this.t.accept(false), n, p));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fbg(() -> this.t.accept(false), n, p));
      }
   }

   private vd a(egf.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return vd.i();
      } else {
         vr $$3 = vd.i();
         Instant $$4 = $$0.a($$1);
         vr $$5 = $$4 != null ? vd.b(fhu.a.format($$4)) : vd.c("recover_world.state_entry.unknown");
         $$3.b(vd.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(q);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(r);
         } else if ($$2 instanceof tc) {
            $$3.b(vd.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(vd.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(egf.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.f());
         } else {
            $$0.a($$0.g());
         }

         return null;
      } catch (sw | tc | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c();
   }

   @Override
   protected void c() {
      this.x.c(this.g - 50);
      this.w.c(this.g - 50);
      this.u.a();
      fag.a(this.u, this.F());
   }

   @Override
   public vd h() {
      return vc.a(super.h(), this.v);
   }

   @Override
   public void aE_() {
      this.t.accept(false);
   }
}
