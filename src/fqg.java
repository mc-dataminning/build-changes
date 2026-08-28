import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqg extends fqh {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xe c = xe.c("recover_world.title").a(n.r);
   private static final xe d = xe.c("recover_world.bug_tracker");
   private static final xe s = xe.c("recover_world.restore");
   private static final xe u = xe.c("recover_world.no_fallback");
   private static final xe v = xe.c("recover_world.done.title");
   private static final xe w = xe.c("recover_world.done.success");
   private static final xe x = xe.c("recover_world.done.failed");
   private static final xe y = xe.c("recover_world.issue.none").a(n.k);
   private static final xe z = xe.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final fog B = fog.d().a(8);
   private final xe C;
   private final fli D;
   private final fli E;
   private final esz.c F;

   public fqg(fip $$0, BooleanConsumer $$1, esz.c $$2) {
      super(c);
      this.A = $$1;
      this.C = xe.a("recover_world.message", xe.b($$2.f()).a(n.h));
      this.D = new fli(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xe $$5 = xe.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fli($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new flv(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fog $$7 = fog.e().a(5);
      $$7.a(fko.a(d, fpe.b(this, ayb.j)).b(120, 20).a());
      $$7.a(fko.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : flz.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fko.a(xd.k, $$0x -> this.d()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fip $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fps(xe.c("recover_world.restoring")));
         fvg.a(this.F);
         if (this.F.n()) {
            $$0.a(new fpf(this.A, v, w, xd.j, xd.k));
         } else {
            $$0.a(new fpa(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fpa(() -> this.A.accept(false), v, x));
      }
   }

   private xe a(esz.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xe.i();
      } else {
         xs $$3 = xe.i();
         Instant $$4 = $$0.a($$1);
         xs $$5 = $$4 != null ? xe.b(fvp.a.format($$4)) : xe.c("recover_world.state_entry.unknown");
         $$3.b(xe.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof ux) {
            $$3.b(xe.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(xe.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(esz.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (ur | ux | IOException var4) {
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
      foa.a(this.B, this.H());
   }

   @Override
   public xe i() {
      return xd.a(super.i(), this.C);
   }

   @Override
   public void d() {
      this.A.accept(false);
   }
}
