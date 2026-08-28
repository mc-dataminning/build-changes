import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fro extends frp {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xl c = xl.c("recover_world.title").a(n.r);
   private static final xl d = xl.c("recover_world.bug_tracker");
   private static final xl s = xl.c("recover_world.restore");
   private static final xl u = xl.c("recover_world.no_fallback");
   private static final xl v = xl.c("recover_world.done.title");
   private static final xl w = xl.c("recover_world.done.success");
   private static final xl x = xl.c("recover_world.done.failed");
   private static final xl y = xl.c("recover_world.issue.none").a(n.k);
   private static final xl z = xl.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final fpp B = fpp.d().a(8);
   private final xl C;
   private final fmq D;
   private final fmq E;
   private final etu.c F;

   public fro(fjx $$0, BooleanConsumer $$1, etu.c $$2) {
      super(c);
      this.A = $$1;
      this.C = xl.a("recover_world.message", xl.b($$2.f()).a(n.h));
      this.D = new fmq(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xl $$5 = xl.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fmq($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fnd(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fpp $$7 = fpp.e().a(5);
      $$7.a(flw.a(d, fqm.b(this, ayj.j)).b(120, 20).a());
      $$7.a(flw.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fnh.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(flw.a(xk.k, $$0x -> this.aP_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fjx $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fra(xl.c("recover_world.restoring")));
         fwq.a(this.F);
         if (this.F.n()) {
            $$0.a(new fqn(this.A, v, w, xk.j, xk.k));
         } else {
            $$0.a(new fqi(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fqi(() -> this.A.accept(false), v, x));
      }
   }

   private xl a(etu.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xl.i();
      } else {
         xz $$3 = xl.i();
         Instant $$4 = $$0.a($$1);
         xz $$5 = $$4 != null ? xl.b(fxb.a.format($$4)) : xl.c("recover_world.state_entry.unknown");
         $$3.b(xl.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof ve) {
            $$3.b(xl.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(xl.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(etu.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (uy | ve | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.c();
   }

   @Override
   protected void c() {
      this.E.d(this.n - 50);
      this.D.d(this.n - 50);
      this.B.a();
      fpj.a(this.B, this.H());
   }

   @Override
   public xl i() {
      return xk.a(super.i(), this.C);
   }

   @Override
   public void aP_() {
      this.A.accept(false);
   }
}
