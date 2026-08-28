import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnb extends fnc {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xo c = xo.c("recover_world.title").a(n.r);
   private static final xo d = xo.c("recover_world.bug_tracker");
   private static final xo r = xo.c("recover_world.restore");
   private static final xo s = xo.c("recover_world.no_fallback");
   private static final xo u = xo.c("recover_world.done.title");
   private static final xo v = xo.c("recover_world.done.success");
   private static final xo w = xo.c("recover_world.done.failed");
   private static final xo x = xo.c("recover_world.issue.none").a(n.k);
   private static final xo y = xo.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer z;
   private final fku A = fku.d().a(8);
   private final xo B;
   private final fhx C;
   private final fhx D;
   private final epv.c E;

   public fnb(ffe $$0, BooleanConsumer $$1, epv.c $$2) {
      super(c);
      this.z = $$1;
      this.B = xo.a("recover_world.message", xo.b($$2.f()).a(n.h));
      this.C = new fhx(this.B, $$0.h);
      this.E = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xo $$5 = xo.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.D = new fhx($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.A.c().b();
      this.A.a(new fik(this.l, $$0.h));
      this.A.a(this.C.b(true));
      this.A.a(this.D);
      fku $$7 = fku.e().a(5);
      $$7.a(fhd.a(d, flt.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(fhd.a(r, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fio.a(s)).a()).j = $$6;
      this.A.a($$7);
      this.A.a(fhd.a(xn.k, $$0x -> this.d()).b(120, 20).a());
      this.A.a(this::c);
   }

   private void a(ffe $$0) {
      Exception $$1 = this.a(this.E, false);
      Exception $$2 = this.a(this.E, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fmi(xo.c("recover_world.restoring")));
         frt.a(this.E);
         if (this.E.n()) {
            $$0.a(new flu(this.z, u, v, xn.j, xn.k));
         } else {
            $$0.a(new flo(() -> this.z.accept(false), u, w));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new flo(() -> this.z.accept(false), u, w));
      }
   }

   private xo a(epv.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xo.i();
      } else {
         yc $$3 = xo.i();
         Instant $$4 = $$0.a($$1);
         yc $$5 = $$4 != null ? xo.b(fsc.a.format($$4)) : xo.c("recover_world.state_entry.unknown");
         $$3.b(xo.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(x);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(y);
         } else if ($$2 instanceof vi) {
            $$3.b(xo.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(xo.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(epv.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (vc | vi | IOException var4) {
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
      fko.a(this.A, this.G());
   }

   @Override
   public xo i() {
      return xn.a(super.i(), this.B);
   }

   @Override
   public void d() {
      this.z.accept(false);
   }
}
