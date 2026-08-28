import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqc extends fqd {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xd c = xd.c("recover_world.title").a(n.r);
   private static final xd d = xd.c("recover_world.bug_tracker");
   private static final xd s = xd.c("recover_world.restore");
   private static final xd u = xd.c("recover_world.no_fallback");
   private static final xd v = xd.c("recover_world.done.title");
   private static final xd w = xd.c("recover_world.done.success");
   private static final xd x = xd.c("recover_world.done.failed");
   private static final xd y = xd.c("recover_world.issue.none").a(n.k);
   private static final xd z = xd.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final foc B = foc.d().a(8);
   private final xd C;
   private final fle D;
   private final fle E;
   private final esv.c F;

   public fqc(fil $$0, BooleanConsumer $$1, esv.c $$2) {
      super(c);
      this.A = $$1;
      this.C = xd.a("recover_world.message", xd.b($$2.f()).a(n.h));
      this.D = new fle(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xd $$5 = xd.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fle($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new flr(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      foc $$7 = foc.e().a(5);
      $$7.a(fkk.a(d, fpa.b(this, axz.j)).b(120, 20).a());
      $$7.a(fkk.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : flv.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fkk.a(xc.k, $$0x -> this.d()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fil $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fpo(xd.c("recover_world.restoring")));
         fvc.a(this.F);
         if (this.F.n()) {
            $$0.a(new fpb(this.A, v, w, xc.j, xc.k));
         } else {
            $$0.a(new fow(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fow(() -> this.A.accept(false), v, x));
      }
   }

   private xd a(esv.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xd.i();
      } else {
         xr $$3 = xd.i();
         Instant $$4 = $$0.a($$1);
         xr $$5 = $$4 != null ? xd.b(fvl.a.format($$4)) : xd.c("recover_world.state_entry.unknown");
         $$3.b(xd.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof uw) {
            $$3.b(xd.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(xd.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(esv.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (uq | uw | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.c();
   }

   @Override
   protected void c() {
      this.E.d(this.n - 50);
      this.D.d(this.n - 50);
      this.B.a();
      fnw.a(this.B, this.H());
   }

   @Override
   public xd i() {
      return xc.a(super.i(), this.C);
   }

   @Override
   public void d() {
      this.A.accept(false);
   }
}
