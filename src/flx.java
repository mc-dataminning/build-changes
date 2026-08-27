import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flx extends fly {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wx c = wx.c("recover_world.title").a(n.r);
   private static final wx d = wx.c("recover_world.bug_tracker");
   private static final wx r = wx.c("recover_world.restore");
   private static final wx s = wx.c("recover_world.no_fallback");
   private static final wx u = wx.c("recover_world.done.title");
   private static final wx v = wx.c("recover_world.done.success");
   private static final wx w = wx.c("recover_world.done.failed");
   private static final wx x = wx.c("recover_world.issue.none").a(n.k);
   private static final wx y = wx.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer z;
   private final fjq A = fjq.d().a(8);
   private final wx B;
   private final fgt C;
   private final fgt D;
   private final eov.c E;

   public flx(fdz $$0, BooleanConsumer $$1, eov.c $$2) {
      super(c);
      this.z = $$1;
      this.B = wx.a("recover_world.message", wx.b($$2.f()).a(n.h));
      this.C = new fgt(this.B, $$0.h);
      this.E = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wx $$5 = wx.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.D = new fgt($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.A.c().b();
      this.A.a(new fhg(this.l, $$0.h));
      this.A.a(this.C.b(true));
      this.A.a(this.D);
      fjq $$7 = fjq.e().a(5);
      $$7.a(ffz.a(d, fkp.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(ffz.a(r, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fhk.a(s)).a()).j = $$6;
      this.A.a($$7);
      this.A.a(ffz.a(ww.k, $$0x -> this.d()).b(120, 20).a());
      this.A.a(this::c);
   }

   private void a(fdz $$0) {
      Exception $$1 = this.a(this.E, false);
      Exception $$2 = this.a(this.E, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fle(wx.c("recover_world.restoring")));
         fqq.a(this.E);
         if (this.E.n()) {
            $$0.a(new fkq(this.z, u, v, ww.j, ww.k));
         } else {
            $$0.a(new fkk(() -> this.z.accept(false), u, w));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fkk(() -> this.z.accept(false), u, w));
      }
   }

   private wx a(eov.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wx.i();
      } else {
         xl $$3 = wx.i();
         Instant $$4 = $$0.a($$1);
         xl $$5 = $$4 != null ? wx.b(fqz.a.format($$4)) : wx.c("recover_world.state_entry.unknown");
         $$3.b(wx.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(x);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(y);
         } else if ($$2 instanceof uu) {
            $$3.b(wx.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(wx.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(eov.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (uo | uu | IOException var4) {
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
      fjk.a(this.A, this.G());
   }

   @Override
   public wx i() {
      return ww.a(super.i(), this.B);
   }

   @Override
   public void d() {
      this.z.accept(false);
   }
}
