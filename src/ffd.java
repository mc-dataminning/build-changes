import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffd extends ffe {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final vq c = vq.c("recover_world.title").a(n.r);
   private static final vq k = vq.c("recover_world.bug_tracker");
   private static final vq l = vq.c("recover_world.restore");
   private static final vq m = vq.c("recover_world.no_fallback");
   private static final vq n = vq.c("recover_world.done.title");
   private static final vq o = vq.c("recover_world.done.success");
   private static final vq p = vq.c("recover_world.done.failed");
   private static final vq q = vq.c("recover_world.issue.none").a(n.k);
   private static final vq r = vq.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer t;
   private final fcx u = fcx.d().a(10);
   private final vq v;
   private final fab w;
   private final fab x;
   private final eil.c y;

   public ffd(exh $$0, BooleanConsumer $$1, eil.c $$2) {
      super(c);
      this.t = $$1;
      this.v = vq.a("recover_world.message", vq.b($$2.d()).a(n.h));
      this.w = new fab(this.v, $$0.h);
      this.y = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      vq $$5 = vq.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.x = new fab($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.u.c().b();
      this.u.a(new fao(this.e, $$0.h));
      this.u.a(this.w.b(true));
      this.u.a(this.x);
      fcx $$7 = fcx.e().a(5);
      $$7.a(ezh.a(k, fdw.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(ezh.a(l, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fas.a(m)).a()).j = $$6;
      this.u.a($$7);
      this.u.a(ezh.a(vp.k, $$0x -> this.d()).b(120, 20).a());
      this.u.a(this::d);
   }

   private void a(exh $$0) {
      Exception $$1 = this.a(this.y, false);
      Exception $$2 = this.a(this.y, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fek(vq.c("recover_world.restoring")));
         fjw.a(this.y);
         if (this.y.l()) {
            $$0.a(new fdx(this.t, n, o, vp.j, vp.k));
         } else {
            $$0.a(new fdr(() -> this.t.accept(false), n, p));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fdr(() -> this.t.accept(false), n, p));
      }
   }

   private vq a(eil.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return vq.i();
      } else {
         we $$3 = vq.i();
         Instant $$4 = $$0.a($$1);
         we $$5 = $$4 != null ? vq.b(fkf.a.format($$4)) : vq.c("recover_world.state_entry.unknown");
         $$3.b(vq.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(q);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(r);
         } else if ($$2 instanceof tn) {
            $$3.b(vq.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(vq.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(eil.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.f());
         } else {
            $$0.a($$0.g());
         }

         return null;
      } catch (th | tn | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.c();
   }

   @Override
   protected void c() {
      this.x.c(this.g - 50);
      this.w.c(this.g - 50);
      this.u.a();
      fcr.a(this.u, this.F());
   }

   @Override
   public vq i() {
      return vp.a(super.i(), this.v);
   }

   @Override
   public void d() {
      this.t.accept(false);
   }
}
