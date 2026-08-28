import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuh extends fui {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wo c = wo.c("recover_world.title").a(n.r);
   private static final wo d = wo.c("recover_world.bug_tracker");
   private static final wo s = wo.c("recover_world.restore");
   private static final wo u = wo.c("recover_world.no_fallback");
   private static final wo v = wo.c("recover_world.done.title");
   private static final wo w = wo.c("recover_world.done.success");
   private static final wo x = wo.c("recover_world.done.failed");
   private static final wo y = wo.c("recover_world.issue.none").a(n.k);
   private static final wo z = wo.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final fsi B = fsi.d().a(8);
   private final wo C;
   private final fpk D;
   private final fpk E;
   private final evd.c F;

   public fuh(flh $$0, BooleanConsumer $$1, evd.c $$2) {
      super(c);
      this.A = $$1;
      this.C = wo.a("recover_world.message", wo.b($$2.f()).a(n.h));
      this.D = new fpk(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wo $$5 = wo.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fpk($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fpx(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fsi $$7 = fsi.e().a(5);
      $$7.a(fop.a(d, ftf.b(this, axu.j)).b(120, 20).a());
      $$7.a(fop.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fqb.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fop.a(wn.k, $$0x -> this.aO_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(flh $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new ftt(wo.c("recover_world.restoring")));
         fzk.a(this.F);
         if (this.F.n()) {
            $$0.a(new ftg(this.A, v, w, wn.j, wn.k));
         } else {
            $$0.a(new ftb(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new ftb(() -> this.A.accept(false), v, x));
      }
   }

   private wo a(evd.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wo.i();
      } else {
         xc $$3 = wo.i();
         Instant $$4 = $$0.a($$1);
         xc $$5 = $$4 != null ? wo.b(fzv.a.format($$4)) : wo.c("recover_world.state_entry.unknown");
         $$3.b(wo.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof uh) {
            $$3.b(wo.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(wo.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(evd.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (ub | uh | IOException var4) {
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
      fsc.a(this.B, this.J());
   }

   @Override
   public wo i() {
      return wn.a(super.i(), this.C);
   }

   @Override
   public void aO_() {
      this.A.accept(false);
   }
}
