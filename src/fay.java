import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fay extends faz {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final uv c = uv.c("recover_world.title").a(n.r);
   private static final uv k = uv.c("recover_world.bug_tracker");
   private static final uv l = uv.c("recover_world.restore");
   private static final uv m = uv.c("recover_world.no_fallback");
   private static final uv n = uv.c("recover_world.done.title");
   private static final uv o = uv.c("recover_world.done.success");
   private static final uv p = uv.c("recover_world.done.failed");
   private static final uv q = uv.c("recover_world.issue.none").a(n.k);
   private static final uv r = uv.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer t;
   private final eys u = eys.d().a(10);
   private final uv v;
   private final evy w;
   private final evy x;
   private final ees.c y;

   public fay(eti $$0, BooleanConsumer $$1, ees.c $$2) {
      super(c);
      this.t = $$1;
      this.v = uv.a("recover_world.message", uv.b($$2.d()).a(n.h));
      this.w = new evy(this.v, $$0.h);
      this.y = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      uv $$5 = uv.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.x = new evy($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.u.c().b();
      this.u.a(new ewl(this.e, $$0.h));
      this.u.a(this.w.b(true));
      this.u.a(this.x);
      eys $$7 = eys.e().a(5);
      $$7.a(eve.a(k, ezr.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(eve.a(l, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : ewp.a(m)).a()).i = $$6;
      this.u.a($$7);
      this.u.a(eve.a(uu.k, $$0x -> this.aG_()).b(120, 20).a());
      this.u.a(this::d);
   }

   private void a(eti $$0) {
      Exception $$1 = this.a(this.y, false);
      Exception $$2 = this.a(this.y, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new faf(uv.c("recover_world.restoring")));
         ffr.a(this.y);
         if (this.y.l()) {
            $$0.a(new ezs(this.t, n, o, uu.j, uu.k));
         } else {
            $$0.a(new ezm(() -> this.t.accept(false), n, p));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new ezm(() -> this.t.accept(false), n, p));
      }
   }

   private uv a(ees.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return uv.i();
      } else {
         vj $$3 = uv.i();
         Instant $$4 = $$0.a($$1);
         vj $$5 = $$4 != null ? uv.b(fga.a.format($$4)) : uv.c("recover_world.state_entry.unknown");
         $$3.b(uv.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(q);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(r);
         } else if ($$2 instanceof su) {
            $$3.b(uv.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(uv.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(ees.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.f());
         } else {
            $$0.a($$0.g());
         }

         return null;
      } catch (so | su | IOException var4) {
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
      this.x.j(this.g - 50);
      this.w.j(this.g - 50);
      this.u.a();
      eym.a(this.u, this.s());
   }

   @Override
   public uv h() {
      return uu.a(super.h(), this.v);
   }

   @Override
   public void aG_() {
      this.t.accept(false);
   }
}
