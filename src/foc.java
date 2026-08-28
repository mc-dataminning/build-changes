import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class foc extends fod {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wz c = wz.c("recover_world.title").a(n.r);
   private static final wz r = wz.c("recover_world.bug_tracker");
   private static final wz s = wz.c("recover_world.restore");
   private static final wz u = wz.c("recover_world.no_fallback");
   private static final wz v = wz.c("recover_world.done.title");
   private static final wz w = wz.c("recover_world.done.success");
   private static final wz x = wz.c("recover_world.done.failed");
   private static final wz y = wz.c("recover_world.issue.none").a(n.k);
   private static final wz z = wz.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final fmd B = fmd.d().a(8);
   private final wz C;
   private final fjg D;
   private final fjg E;
   private final erf.c F;

   public foc(fgo $$0, BooleanConsumer $$1, erf.c $$2) {
      super(c);
      this.A = $$1;
      this.C = wz.a("recover_world.message", wz.b($$2.f()).a(n.h));
      this.D = new fjg(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wz $$5 = wz.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fjg($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fjt(this.k, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fmd $$7 = fmd.e().a(5);
      $$7.a(fim.a(r, fna.b(this, axj.j)).b(120, 20).a());
      $$7.a(fim.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fjx.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fim.a(wy.k, $$0x -> this.d()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fgo $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fno(wz.c("recover_world.restoring")));
         fte.a(this.F);
         if (this.F.n()) {
            $$0.a(new fnb(this.A, v, w, wy.j, wy.k));
         } else {
            $$0.a(new fmw(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fmw(() -> this.A.accept(false), v, x));
      }
   }

   private wz a(erf.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wz.i();
      } else {
         xn $$3 = wz.i();
         Instant $$4 = $$0.a($$1);
         xn $$5 = $$4 != null ? wz.b(ftn.a.format($$4)) : wz.c("recover_world.state_entry.unknown");
         $$3.b(wz.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof us) {
            $$3.b(wz.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(wz.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(erf.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (um | us | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.c();
   }

   @Override
   protected void c() {
      this.E.d(this.m - 50);
      this.D.d(this.m - 50);
      this.B.a();
      flx.a(this.B, this.H());
   }

   @Override
   public wz i() {
      return wy.a(super.i(), this.C);
   }

   @Override
   public void d() {
      this.A.accept(false);
   }
}
