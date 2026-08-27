import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fom extends fon {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xe c = xe.c("recover_world.title").a(n.r);
   private static final xe d = xe.c("recover_world.bug_tracker");
   private static final xe r = xe.c("recover_world.restore");
   private static final xe s = xe.c("recover_world.no_fallback");
   private static final xe u = xe.c("recover_world.done.title");
   private static final xe v = xe.c("recover_world.done.success");
   private static final xe w = xe.c("recover_world.done.failed");
   private static final xe x = xe.c("recover_world.issue.none").a(n.k);
   private static final xe y = xe.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer z;
   private final fme A = fme.d().a(8);
   private final xe B;
   private final fjh C;
   private final fjh D;
   private final erf.c E;

   public fom(fgj $$0, BooleanConsumer $$1, erf.c $$2) {
      super(c);
      this.z = $$1;
      this.B = xe.a("recover_world.message", xe.b($$2.f()).a(n.h));
      this.C = new fjh(this.B, $$0.h);
      this.E = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xe $$5 = xe.i().a(this.a($$2, false, $$3)).f("\n").a(this.a($$2, true, $$4));
      this.D = new fjh($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.A.c().b();
      this.A.a(new fju(this.l, $$0.h));
      this.A.a(this.C.b(true));
      this.A.a(this.D);
      fme $$7 = fme.e().a(5);
      $$7.a(fin.a(d, fnd.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(fin.a(r, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fjy.a(s)).a()).j = $$6;
      this.A.a($$7);
      this.A.a(fin.a(xd.k, $$0x -> this.d()).b(120, 20).a());
      this.A.a(this::c);
   }

   private void a(fgj $$0) {
      Exception $$1 = this.a(this.E, false);
      Exception $$2 = this.a(this.E, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fns(xe.c("recover_world.restoring")));
         ftj.a(this.E);
         if (this.E.n()) {
            $$0.a(new fne(this.z, u, v, xd.j, xd.k));
         } else {
            $$0.a(new fmy(() -> this.z.accept(false), u, w));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fmy(() -> this.z.accept(false), u, w));
      }
   }

   private xe a(erf.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xe.i();
      } else {
         xs $$3 = xe.i();
         Instant $$4 = $$0.a($$1);
         xs $$5 = $$4 != null ? xe.b(fts.a.format($$4)) : xe.c("recover_world.state_entry.unknown");
         $$3.a(xe.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.a(x);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.a(y);
         } else if ($$2 instanceof vb) {
            $$3.a(xe.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.a(xe.b($$2.toString()).a(n.m));
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
      } catch (uv | vb | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c();
   }

   @Override
   protected void c() {
      this.D.d(this.n - 50);
      this.C.d(this.n - 50);
      this.A.a();
      fly.a(this.A, this.G());
   }

   @Override
   public xe i() {
      return xd.a(super.i(), this.B);
   }

   @Override
   public void d() {
      this.z.accept(false);
   }
}
