import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ftq extends ftr {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xk c = xk.c("recover_world.title").a(n.r);
   private static final xk d = xk.c("recover_world.bug_tracker");
   private static final xk s = xk.c("recover_world.restore");
   private static final xk u = xk.c("recover_world.no_fallback");
   private static final xk v = xk.c("recover_world.done.title");
   private static final xk w = xk.c("recover_world.done.success");
   private static final xk x = xk.c("recover_world.done.failed");
   private static final xk y = xk.c("recover_world.issue.none").a(n.k);
   private static final xk z = xk.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final frr B = frr.d().a(8);
   private final xk C;
   private final fot D;
   private final fot E;
   private final evw.c F;

   public ftq(flz $$0, BooleanConsumer $$1, evw.c $$2) {
      super(c);
      this.A = $$1;
      this.C = xk.a("recover_world.message", xk.b($$2.f()).a(n.h));
      this.D = new fot(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xk $$5 = xk.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fot($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fpg(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      frr $$7 = frr.e().a(5);
      $$7.a(fny.a(d, fso.b(this, ayq.j)).b(120, 20).a());
      $$7.a(fny.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fpk.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fny.a(xj.k, $$0x -> this.aP_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(flz $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new ftc(xk.c("recover_world.restoring")));
         fyt.a(this.F);
         if (this.F.n()) {
            $$0.a(new fsp(this.A, v, w, xj.j, xj.k));
         } else {
            $$0.a(new fsk(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fsk(() -> this.A.accept(false), v, x));
      }
   }

   private xk a(evw.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xk.i();
      } else {
         xy $$3 = xk.i();
         Instant $$4 = $$0.a($$1);
         xy $$5 = $$4 != null ? xk.b(fze.a.format($$4)) : xk.c("recover_world.state_entry.unknown");
         $$3.b(xk.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof vd) {
            $$3.b(xk.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(xk.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(evw.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (ux | vd | IOException var4) {
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
      this.E.d(this.n - 50);
      this.D.d(this.n - 50);
      this.B.a();
      frl.a(this.B, this.H());
   }

   @Override
   public xk i() {
      return xj.a(super.i(), this.C);
   }

   @Override
   public void aP_() {
      this.A.accept(false);
   }
}
