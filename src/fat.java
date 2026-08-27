import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fat extends fau {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final ur c = ur.c("recover_world.title").a(n.r);
   private static final ur k = ur.c("recover_world.bug_tracker");
   private static final ur l = ur.c("recover_world.restore");
   private static final ur m = ur.c("recover_world.no_fallback");
   private static final ur n = ur.c("recover_world.done.title");
   private static final ur o = ur.c("recover_world.done.success");
   private static final ur p = ur.c("recover_world.done.failed");
   private static final ur q = ur.c("recover_world.issue.none").a(n.k);
   private static final ur r = ur.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer t;
   private final eyn u = eyn.d().a(10);
   private final ur v;
   private final evt w;
   private final evt x;
   private final een.c y;

   public fat(etd $$0, BooleanConsumer $$1, een.c $$2) {
      super(c);
      this.t = $$1;
      this.v = ur.a("recover_world.message", ur.b($$2.d()).a(n.h));
      this.w = new evt(this.v, $$0.h);
      this.y = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      ur $$5 = ur.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.x = new evt($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.u.c().b();
      this.u.a(new ewg(this.e, $$0.h));
      this.u.a(this.w.b(true));
      this.u.a(this.x);
      eyn $$7 = eyn.e().a(5);
      $$7.a(euz.a(k, ezm.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(euz.a(l, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : ewk.a(m)).a()).i = $$6;
      this.u.a($$7);
      this.u.a(euz.a(uq.k, $$0x -> this.aF_()).b(120, 20).a());
      this.u.a(this::d);
   }

   private void a(etd $$0) {
      Exception $$1 = this.a(this.y, false);
      Exception $$2 = this.a(this.y, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new faa(ur.c("recover_world.restoring")));
         ffm.a(this.y);
         if (this.y.l()) {
            $$0.a(new ezn(this.t, n, o, uq.j, uq.k));
         } else {
            $$0.a(new ezh(() -> this.t.accept(false), n, p));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new ezh(() -> this.t.accept(false), n, p));
      }
   }

   private ur a(een.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return ur.i();
      } else {
         vf $$3 = ur.i();
         Instant $$4 = $$0.a($$1);
         vf $$5 = $$4 != null ? ur.b(ffv.a.format($$4)) : ur.c("recover_world.state_entry.unknown");
         $$3.b(ur.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(q);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(r);
         } else if ($$2 instanceof sq) {
            $$3.b(ur.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(ur.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(een.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.f());
         } else {
            $$0.a($$0.g());
         }

         return null;
      } catch (sk | sq | IOException var4) {
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
      this.x.j(this.g - 50);
      this.w.j(this.g - 50);
      this.u.a();
      eyh.a(this.u, this.s());
   }

   @Override
   public ur h() {
      return uq.a(super.h(), this.v);
   }

   @Override
   public void aF_() {
      this.t.accept(false);
   }
}
