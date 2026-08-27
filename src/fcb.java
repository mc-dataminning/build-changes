import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcb extends fcc {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final vb c = vb.c("recover_world.title").a(n.r);
   private static final vb k = vb.c("recover_world.bug_tracker");
   private static final vb l = vb.c("recover_world.restore");
   private static final vb m = vb.c("recover_world.no_fallback");
   private static final vb n = vb.c("recover_world.done.title");
   private static final vb o = vb.c("recover_world.done.success");
   private static final vb p = vb.c("recover_world.done.failed");
   private static final vb q = vb.c("recover_world.issue.none").a(n.k);
   private static final vb r = vb.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer t;
   private final ezv u = ezv.d().a(10);
   private final vb v;
   private final exb w;
   private final exb x;
   private final efu.c y;

   public fcb(euk $$0, BooleanConsumer $$1, efu.c $$2) {
      super(c);
      this.t = $$1;
      this.v = vb.a("recover_world.message", vb.b($$2.d()).a(n.h));
      this.w = new exb(this.v, $$0.h);
      this.y = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      vb $$5 = vb.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.x = new exb($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.u.c().b();
      this.u.a(new exo(this.e, $$0.h));
      this.u.a(this.w.b(true));
      this.u.a(this.x);
      ezv $$7 = ezv.e().a(5);
      $$7.a(ewh.a(k, fau.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(ewh.a(l, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : exs.a(m)).a()).i = $$6;
      this.u.a($$7);
      this.u.a(ewh.a(va.k, $$0x -> this.aF_()).b(120, 20).a());
      this.u.a(this::d);
   }

   private void a(euk $$0) {
      Exception $$1 = this.a(this.y, false);
      Exception $$2 = this.a(this.y, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fbi(vb.c("recover_world.restoring")));
         fgu.a(this.y);
         if (this.y.l()) {
            $$0.a(new fav(this.t, n, o, va.j, va.k));
         } else {
            $$0.a(new fap(() -> this.t.accept(false), n, p));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fap(() -> this.t.accept(false), n, p));
      }
   }

   private vb a(efu.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return vb.i();
      } else {
         vp $$3 = vb.i();
         Instant $$4 = $$0.a($$1);
         vp $$5 = $$4 != null ? vb.b(fhd.a.format($$4)) : vb.c("recover_world.state_entry.unknown");
         $$3.b(vb.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(q);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(r);
         } else if ($$2 instanceof ta) {
            $$3.b(vb.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(vb.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(efu.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.f());
         } else {
            $$0.a($$0.g());
         }

         return null;
      } catch (su | ta | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c();
   }

   @Override
   protected void c() {
      this.x.j(this.g - 50);
      this.w.j(this.g - 50);
      this.u.a();
      ezp.a(this.u, this.s());
   }

   @Override
   public vb h() {
      return va.a(super.h(), this.v);
   }

   @Override
   public void aF_() {
      this.t.accept(false);
   }
}
