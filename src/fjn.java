import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjn extends fjo {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wg c = wg.c("recover_world.title").a(n.r);
   private static final wg d = wg.c("recover_world.bug_tracker");
   private static final wg o = wg.c("recover_world.restore");
   private static final wg p = wg.c("recover_world.no_fallback");
   private static final wg q = wg.c("recover_world.done.title");
   private static final wg r = wg.c("recover_world.done.success");
   private static final wg s = wg.c("recover_world.done.failed");
   private static final wg u = wg.c("recover_world.issue.none").a(n.k);
   private static final wg v = wg.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer w;
   private final fhg x = fhg.d().a(8);
   private final wg y;
   private final fej z;
   private final fej A;
   private final emr.c B;

   public fjn(fbp $$0, BooleanConsumer $$1, emr.c $$2) {
      super(c);
      this.w = $$1;
      this.y = wg.a("recover_world.message", wg.b($$2.f()).a(n.h));
      this.z = new fej(this.y, $$0.h);
      this.B = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wg $$5 = wg.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.A = new fej($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.x.c().b();
      this.x.a(new few(this.i, $$0.h));
      this.x.a(this.z.b(true));
      this.x.a(this.A);
      fhg $$7 = fhg.e().a(5);
      $$7.a(fdp.a(d, fif.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(fdp.a(o, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : ffa.a(p)).a()).j = $$6;
      this.x.a($$7);
      this.x.a(fdp.a(wf.k, $$0x -> this.d()).b(120, 20).a());
      this.x.a(this::c);
   }

   private void a(fbp $$0) {
      Exception $$1 = this.a(this.B, false);
      Exception $$2 = this.a(this.B, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fiu(wg.c("recover_world.restoring")));
         fof.a(this.B);
         if (this.B.n()) {
            $$0.a(new fig(this.w, q, r, wf.j, wf.k));
         } else {
            $$0.a(new fia(() -> this.w.accept(false), q, s));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fia(() -> this.w.accept(false), q, s));
      }
   }

   private wg a(emr.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wg.i();
      } else {
         wu $$3 = wg.i();
         Instant $$4 = $$0.a($$1);
         wu $$5 = $$4 != null ? wg.b(foo.a.format($$4)) : wg.c("recover_world.state_entry.unknown");
         $$3.b(wg.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(u);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(v);
         } else if ($$2 instanceof ud) {
            $$3.b(wg.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(wg.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(emr.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (tx | ud | IOException var4) {
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
      this.A.d(this.k - 50);
      this.z.d(this.k - 50);
      this.x.a();
      fha.a(this.x, this.G());
   }

   @Override
   public wg i() {
      return wf.a(super.i(), this.y);
   }

   @Override
   public void d() {
      this.w.accept(false);
   }
}
