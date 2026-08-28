import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnd extends fne {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xp c = xp.c("recover_world.title").a(n.r);
   private static final xp d = xp.c("recover_world.bug_tracker");
   private static final xp r = xp.c("recover_world.restore");
   private static final xp s = xp.c("recover_world.no_fallback");
   private static final xp u = xp.c("recover_world.done.title");
   private static final xp v = xp.c("recover_world.done.success");
   private static final xp w = xp.c("recover_world.done.failed");
   private static final xp x = xp.c("recover_world.issue.none").a(n.k);
   private static final xp y = xp.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer z;
   private final fkw A = fkw.d().a(8);
   private final xp B;
   private final fhz C;
   private final fhz D;
   private final epx.c E;

   public fnd(ffg $$0, BooleanConsumer $$1, epx.c $$2) {
      super(c);
      this.z = $$1;
      this.B = xp.a("recover_world.message", xp.b($$2.f()).a(n.h));
      this.C = new fhz(this.B, $$0.h);
      this.E = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xp $$5 = xp.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.D = new fhz($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.A.c().b();
      this.A.a(new fim(this.l, $$0.h));
      this.A.a(this.C.b(true));
      this.A.a(this.D);
      fkw $$7 = fkw.e().a(5);
      $$7.a(fhf.a(d, flv.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(fhf.a(r, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fiq.a(s)).a()).j = $$6;
      this.A.a($$7);
      this.A.a(fhf.a(xo.k, $$0x -> this.d()).b(120, 20).a());
      this.A.a(this::c);
   }

   private void a(ffg $$0) {
      Exception $$1 = this.a(this.E, false);
      Exception $$2 = this.a(this.E, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fmk(xp.c("recover_world.restoring")));
         frv.a(this.E);
         if (this.E.n()) {
            $$0.a(new flw(this.z, u, v, xo.j, xo.k));
         } else {
            $$0.a(new flq(() -> this.z.accept(false), u, w));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new flq(() -> this.z.accept(false), u, w));
      }
   }

   private xp a(epx.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xp.i();
      } else {
         yd $$3 = xp.i();
         Instant $$4 = $$0.a($$1);
         yd $$5 = $$4 != null ? xp.b(fse.a.format($$4)) : xp.c("recover_world.state_entry.unknown");
         $$3.b(xp.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(x);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(y);
         } else if ($$2 instanceof vj) {
            $$3.b(xp.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(xp.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(epx.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (vd | vj | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c();
   }

   @Override
   protected void c() {
      this.D.d(this.n - 50);
      this.C.d(this.n - 50);
      this.A.a();
      fkq.a(this.A, this.G());
   }

   @Override
   public xp i() {
      return xo.a(super.i(), this.B);
   }

   @Override
   public void d() {
      this.z.accept(false);
   }
}
