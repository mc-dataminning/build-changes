import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcy extends fcz {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final vf c = vf.c("recover_world.title").a(n.r);
   private static final vf k = vf.c("recover_world.bug_tracker");
   private static final vf l = vf.c("recover_world.restore");
   private static final vf m = vf.c("recover_world.no_fallback");
   private static final vf n = vf.c("recover_world.done.title");
   private static final vf o = vf.c("recover_world.done.success");
   private static final vf p = vf.c("recover_world.done.failed");
   private static final vf q = vf.c("recover_world.issue.none").a(n.k);
   private static final vf r = vf.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer t;
   private final fas u = fas.d().a(10);
   private final vf v;
   private final exy w;
   private final exy x;
   private final egl.c y;

   public fcy(evg $$0, BooleanConsumer $$1, egl.c $$2) {
      super(c);
      this.t = $$1;
      this.v = vf.a("recover_world.message", vf.b($$2.d()).a(n.h));
      this.w = new exy(this.v, $$0.h);
      this.y = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      vf $$5 = vf.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.x = new exy($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.u.c().b();
      this.u.a(new eyl(this.e, $$0.h));
      this.u.a(this.w.b(true));
      this.u.a(this.x);
      fas $$7 = fas.e().a(5);
      $$7.a(exe.a(k, fbr.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(exe.a(l, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : eyp.a(m)).a()).j = $$6;
      this.u.a($$7);
      this.u.a(exe.a(ve.k, $$0x -> this.aE_()).b(120, 20).a());
      this.u.a(this::d);
   }

   private void a(evg $$0) {
      Exception $$1 = this.a(this.y, false);
      Exception $$2 = this.a(this.y, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fcf(vf.c("recover_world.restoring")));
         fhr.a(this.y);
         if (this.y.l()) {
            $$0.a(new fbs(this.t, n, o, ve.j, ve.k));
         } else {
            $$0.a(new fbm(() -> this.t.accept(false), n, p));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fbm(() -> this.t.accept(false), n, p));
      }
   }

   private vf a(egl.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return vf.i();
      } else {
         vt $$3 = vf.i();
         Instant $$4 = $$0.a($$1);
         vt $$5 = $$4 != null ? vf.b(fia.a.format($$4)) : vf.c("recover_world.state_entry.unknown");
         $$3.b(vf.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(q);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(r);
         } else if ($$2 instanceof te) {
            $$3.b(vf.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(vf.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(egl.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.f());
         } else {
            $$0.a($$0.g());
         }

         return null;
      } catch (sy | te | IOException var4) {
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
      this.x.c(this.g - 50);
      this.w.c(this.g - 50);
      this.u.a();
      fam.a(this.u, this.F());
   }

   @Override
   public vf h() {
      return ve.a(super.h(), this.v);
   }

   @Override
   public void aE_() {
      this.t.accept(false);
   }
}
