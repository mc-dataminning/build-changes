import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnw extends fnx {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wy c = wy.c("recover_world.title").a(n.r);
   private static final wy q = wy.c("recover_world.bug_tracker");
   private static final wy r = wy.c("recover_world.restore");
   private static final wy s = wy.c("recover_world.no_fallback");
   private static final wy u = wy.c("recover_world.done.title");
   private static final wy v = wy.c("recover_world.done.success");
   private static final wy w = wy.c("recover_world.done.failed");
   private static final wy x = wy.c("recover_world.issue.none").a(n.k);
   private static final wy y = wy.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer z;
   private final flx A = flx.d().a(8);
   private final wy B;
   private final fja C;
   private final fja D;
   private final eqz.c E;

   public fnw(fgi $$0, BooleanConsumer $$1, eqz.c $$2) {
      super(c);
      this.z = $$1;
      this.B = wy.a("recover_world.message", wy.b($$2.f()).a(n.h));
      this.C = new fja(this.B, $$0.h);
      this.E = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wy $$5 = wy.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.D = new fja($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.A.c().b();
      this.A.a(new fjn(this.k, $$0.h));
      this.A.a(this.C.b(true));
      this.A.a(this.D);
      flx $$7 = flx.e().a(5);
      $$7.a(fig.a(q, fmu.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(fig.a(r, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fjr.a(s)).a()).j = $$6;
      this.A.a($$7);
      this.A.a(fig.a(wx.k, $$0x -> this.d()).b(120, 20).a());
      this.A.a(this::c);
   }

   private void a(fgi $$0) {
      Exception $$1 = this.a(this.E, false);
      Exception $$2 = this.a(this.E, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fni(wy.c("recover_world.restoring")));
         fsy.a(this.E);
         if (this.E.n()) {
            $$0.a(new fmv(this.z, u, v, wx.j, wx.k));
         } else {
            $$0.a(new fmq(() -> this.z.accept(false), u, w));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fmq(() -> this.z.accept(false), u, w));
      }
   }

   private wy a(eqz.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wy.i();
      } else {
         xm $$3 = wy.i();
         Instant $$4 = $$0.a($$1);
         xm $$5 = $$4 != null ? wy.b(fth.a.format($$4)) : wy.c("recover_world.state_entry.unknown");
         $$3.b(wy.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(x);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(y);
         } else if ($$2 instanceof ur) {
            $$3.b(wy.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(wy.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(eqz.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (ul | ur | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c();
   }

   @Override
   protected void c() {
      this.D.d(this.m - 50);
      this.C.d(this.m - 50);
      this.A.a();
      flr.a(this.A, this.H());
   }

   @Override
   public wy i() {
      return wx.a(super.i(), this.B);
   }

   @Override
   public void d() {
      this.z.accept(false);
   }
}
