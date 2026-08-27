import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhg extends fhh {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final vu c = vu.c("recover_world.title").a(n.r);
   private static final vu k = vu.c("recover_world.bug_tracker");
   private static final vu l = vu.c("recover_world.restore");
   private static final vu m = vu.c("recover_world.no_fallback");
   private static final vu n = vu.c("recover_world.done.title");
   private static final vu o = vu.c("recover_world.done.success");
   private static final vu p = vu.c("recover_world.done.failed");
   private static final vu q = vu.c("recover_world.issue.none").a(n.k);
   private static final vu r = vu.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer t;
   private final fez u = fez.d().a(10);
   private final vu v;
   private final fcc w;
   private final fcc x;
   private final ekm.c y;

   public fhg(ezi $$0, BooleanConsumer $$1, ekm.c $$2) {
      super(c);
      this.t = $$1;
      this.v = vu.a("recover_world.message", vu.b($$2.d()).a(n.h));
      this.w = new fcc(this.v, $$0.h);
      this.y = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      vu $$5 = vu.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.x = new fcc($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.u.c().b();
      this.u.a(new fcp(this.e, $$0.h));
      this.u.a(this.w.b(true));
      this.u.a(this.x);
      fez $$7 = fez.e().a(5);
      $$7.a(fbi.a(k, ffy.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(fbi.a(l, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fct.a(m)).a()).j = $$6;
      this.u.a($$7);
      this.u.a(fbi.a(vt.k, $$0x -> this.d()).b(120, 20).a());
      this.u.a(this::c);
   }

   private void a(ezi $$0) {
      Exception $$1 = this.a(this.y, false);
      Exception $$2 = this.a(this.y, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fgn(vu.c("recover_world.restoring")));
         flz.a(this.y);
         if (this.y.l()) {
            $$0.a(new ffz(this.t, n, o, vt.j, vt.k));
         } else {
            $$0.a(new fft(() -> this.t.accept(false), n, p));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fft(() -> this.t.accept(false), n, p));
      }
   }

   private vu a(ekm.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return vu.i();
      } else {
         wi $$3 = vu.i();
         Instant $$4 = $$0.a($$1);
         wi $$5 = $$4 != null ? vu.b(fmi.a.format($$4)) : vu.c("recover_world.state_entry.unknown");
         $$3.b(vu.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(q);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(r);
         } else if ($$2 instanceof tr) {
            $$3.b(vu.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(vu.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(ekm.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.f());
         } else {
            $$0.a($$0.g());
         }

         return null;
      } catch (tl | tr | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.c();
   }

   @Override
   protected void c() {
      this.x.c(this.g - 50);
      this.w.c(this.g - 50);
      this.u.a();
      fet.a(this.u, this.F());
   }

   @Override
   public vu i() {
      return vt.a(super.i(), this.v);
   }

   @Override
   public void d() {
      this.t.accept(false);
   }
}
