import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgg extends fgh {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final vs c = vs.c("recover_world.title").a(n.r);
   private static final vs k = vs.c("recover_world.bug_tracker");
   private static final vs l = vs.c("recover_world.restore");
   private static final vs m = vs.c("recover_world.no_fallback");
   private static final vs n = vs.c("recover_world.done.title");
   private static final vs o = vs.c("recover_world.done.success");
   private static final vs p = vs.c("recover_world.done.failed");
   private static final vs q = vs.c("recover_world.issue.none").a(n.k);
   private static final vs r = vs.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer t;
   private final fea u = fea.d().a(10);
   private final vs v;
   private final fbe w;
   private final fbe x;
   private final ejo.c y;

   public fgg(eyk $$0, BooleanConsumer $$1, ejo.c $$2) {
      super(c);
      this.t = $$1;
      this.v = vs.a("recover_world.message", vs.b($$2.d()).a(n.h));
      this.w = new fbe(this.v, $$0.h);
      this.y = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      vs $$5 = vs.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.x = new fbe($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.u.c().b();
      this.u.a(new fbr(this.e, $$0.h));
      this.u.a(this.w.b(true));
      this.u.a(this.x);
      fea $$7 = fea.e().a(5);
      $$7.a(fak.a(k, fez.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(fak.a(l, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fbv.a(m)).a()).j = $$6;
      this.u.a($$7);
      this.u.a(fak.a(vr.k, $$0x -> this.d()).b(120, 20).a());
      this.u.a(this::c);
   }

   private void a(eyk $$0) {
      Exception $$1 = this.a(this.y, false);
      Exception $$2 = this.a(this.y, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new ffn(vs.c("recover_world.restoring")));
         fkz.a(this.y);
         if (this.y.l()) {
            $$0.a(new ffa(this.t, n, o, vr.j, vr.k));
         } else {
            $$0.a(new feu(() -> this.t.accept(false), n, p));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new feu(() -> this.t.accept(false), n, p));
      }
   }

   private vs a(ejo.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return vs.i();
      } else {
         wg $$3 = vs.i();
         Instant $$4 = $$0.a($$1);
         wg $$5 = $$4 != null ? vs.b(fli.a.format($$4)) : vs.c("recover_world.state_entry.unknown");
         $$3.b(vs.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(q);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(r);
         } else if ($$2 instanceof tp) {
            $$3.b(vs.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(vs.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(ejo.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.f());
         } else {
            $$0.a($$0.g());
         }

         return null;
      } catch (tj | tp | IOException var4) {
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
      this.x.c(this.g - 50);
      this.w.c(this.g - 50);
      this.u.a();
      fdu.a(this.u, this.F());
   }

   @Override
   public vs i() {
      return vr.a(super.i(), this.v);
   }

   @Override
   public void d() {
      this.t.accept(false);
   }
}
