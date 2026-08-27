import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdl extends fdm {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final vg c = vg.c("recover_world.title").a(n.r);
   private static final vg k = vg.c("recover_world.bug_tracker");
   private static final vg l = vg.c("recover_world.restore");
   private static final vg m = vg.c("recover_world.no_fallback");
   private static final vg n = vg.c("recover_world.done.title");
   private static final vg o = vg.c("recover_world.done.success");
   private static final vg p = vg.c("recover_world.done.failed");
   private static final vg q = vg.c("recover_world.issue.none").a(n.k);
   private static final vg r = vg.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer t;
   private final fbf u = fbf.d().a(10);
   private final vg v;
   private final eyl w;
   private final eyl x;
   private final egv.c y;

   public fdl(evr $$0, BooleanConsumer $$1, egv.c $$2) {
      super(c);
      this.t = $$1;
      this.v = vg.a("recover_world.message", vg.b($$2.d()).a(n.h));
      this.w = new eyl(this.v, $$0.h);
      this.y = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      vg $$5 = vg.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.x = new eyl($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.u.c().b();
      this.u.a(new eyy(this.e, $$0.h));
      this.u.a(this.w.b(true));
      this.u.a(this.x);
      fbf $$7 = fbf.e().a(5);
      $$7.a(exr.a(k, fce.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(exr.a(l, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : ezc.a(m)).a()).j = $$6;
      this.u.a($$7);
      this.u.a(exr.a(vf.k, $$0x -> this.d()).b(120, 20).a());
      this.u.a(this::d);
   }

   private void a(evr $$0) {
      Exception $$1 = this.a(this.y, false);
      Exception $$2 = this.a(this.y, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fcs(vg.c("recover_world.restoring")));
         fie.a(this.y);
         if (this.y.l()) {
            $$0.a(new fcf(this.t, n, o, vf.j, vf.k));
         } else {
            $$0.a(new fbz(() -> this.t.accept(false), n, p));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fbz(() -> this.t.accept(false), n, p));
      }
   }

   private vg a(egv.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return vg.i();
      } else {
         vu $$3 = vg.i();
         Instant $$4 = $$0.a($$1);
         vu $$5 = $$4 != null ? vg.b(fin.a.format($$4)) : vg.c("recover_world.state_entry.unknown");
         $$3.b(vg.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(q);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(r);
         } else if ($$2 instanceof tf) {
            $$3.b(vg.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(vg.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(egv.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.f());
         } else {
            $$0.a($$0.g());
         }

         return null;
      } catch (sz | tf | IOException var4) {
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
      this.x.c(this.g - 50);
      this.w.c(this.g - 50);
      this.u.a();
      faz.a(this.u, this.F());
   }

   @Override
   public vg i() {
      return vf.a(super.i(), this.v);
   }

   @Override
   public void d() {
      this.t.accept(false);
   }
}
