import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqr extends fqs {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xh c = xh.c("recover_world.title").a(n.r);
   private static final xh d = xh.c("recover_world.bug_tracker");
   private static final xh s = xh.c("recover_world.restore");
   private static final xh u = xh.c("recover_world.no_fallback");
   private static final xh v = xh.c("recover_world.done.title");
   private static final xh w = xh.c("recover_world.done.success");
   private static final xh x = xh.c("recover_world.done.failed");
   private static final xh y = xh.c("recover_world.issue.none").a(n.k);
   private static final xh z = xh.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final fos B = fos.d().a(8);
   private final xh C;
   private final flt D;
   private final flt E;
   private final etk.c F;

   public fqr(fja $$0, BooleanConsumer $$1, etk.c $$2) {
      super(c);
      this.A = $$1;
      this.C = xh.a("recover_world.message", xh.b($$2.f()).a(n.h));
      this.D = new flt(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xh $$5 = xh.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new flt($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fmg(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fos $$7 = fos.e().a(5);
      $$7.a(fkz.a(d, fpp.b(this, ayf.j)).b(120, 20).a());
      $$7.a(fkz.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fmk.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fkz.a(xg.k, $$0x -> this.d()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fja $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fqd(xh.c("recover_world.restoring")));
         fvr.a(this.F);
         if (this.F.n()) {
            $$0.a(new fpq(this.A, v, w, xg.j, xg.k));
         } else {
            $$0.a(new fpl(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fpl(() -> this.A.accept(false), v, x));
      }
   }

   private xh a(etk.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xh.i();
      } else {
         xv $$3 = xh.i();
         Instant $$4 = $$0.a($$1);
         xv $$5 = $$4 != null ? xh.b(fwa.a.format($$4)) : xh.c("recover_world.state_entry.unknown");
         $$3.b(xh.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof va) {
            $$3.b(xh.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(xh.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(etk.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (uu | va | IOException var4) {
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
      fol.a(this.B, this.H());
   }

   @Override
   public xh i() {
      return xg.a(super.i(), this.C);
   }

   @Override
   public void d() {
      this.A.accept(false);
   }
}
