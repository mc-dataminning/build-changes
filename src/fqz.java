import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqz extends fra {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xi c = xi.c("recover_world.title").a(n.r);
   private static final xi d = xi.c("recover_world.bug_tracker");
   private static final xi s = xi.c("recover_world.restore");
   private static final xi u = xi.c("recover_world.no_fallback");
   private static final xi v = xi.c("recover_world.done.title");
   private static final xi w = xi.c("recover_world.done.success");
   private static final xi x = xi.c("recover_world.done.failed");
   private static final xi y = xi.c("recover_world.issue.none").a(n.k);
   private static final xi z = xi.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final fpa B = fpa.d().a(8);
   private final xi C;
   private final fmb D;
   private final fmb E;
   private final etq.c F;

   public fqz(fji $$0, BooleanConsumer $$1, etq.c $$2) {
      super(c);
      this.A = $$1;
      this.C = xi.a("recover_world.message", xi.b($$2.f()).a(n.h));
      this.D = new fmb(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xi $$5 = xi.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fmb($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fmo(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fpa $$7 = fpa.e().a(5);
      $$7.a(flh.a(d, fpx.b(this, ayg.j)).b(120, 20).a());
      $$7.a(flh.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fms.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(flh.a(xh.k, $$0x -> this.d()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fji $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fql(xi.c("recover_world.restoring")));
         fwa.a(this.F);
         if (this.F.n()) {
            $$0.a(new fpy(this.A, v, w, xh.j, xh.k));
         } else {
            $$0.a(new fpt(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fpt(() -> this.A.accept(false), v, x));
      }
   }

   private xi a(etq.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xi.i();
      } else {
         xw $$3 = xi.i();
         Instant $$4 = $$0.a($$1);
         xw $$5 = $$4 != null ? xi.b(fwl.a.format($$4)) : xi.c("recover_world.state_entry.unknown");
         $$3.b(xi.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof vb) {
            $$3.b(xi.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(xi.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(etq.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (uv | vb | IOException var4) {
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
      fou.a(this.B, this.H());
   }

   @Override
   public xi i() {
      return xh.a(super.i(), this.C);
   }

   @Override
   public void d() {
      this.A.accept(false);
   }
}
