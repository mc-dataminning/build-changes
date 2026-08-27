import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fmr extends fgg<fmr.b> {
   private static final int a = 20;
   final fms m;
   private int n;

   public fmr(fms $$0, feb $$1) {
      super($$1, $$0.n, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      fdz[] $$2 = (fdz[])ArrayUtils.clone($$1.m.W);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fdz $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fmr.a(wx.c($$5)));
         }

         wx $$6 = wx.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fmr.c($$4, $$6));
      }
   }

   public void d() {
      fdz.d();
      this.I();
   }

   public void I() {
      this.aF_().forEach(fmr.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fmr.b {
      final wx b;
      private final int c;

      public a(wx $$1) {
         this.b = $$1;
         this.c = fmr.this.c.h.a(this.b);
      }

      @Override
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fmr.this.c.h, this.b, fmr.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public ffk a(fkc $$0) {
         return null;
      }

      @Override
      public List<? extends fhw> aF_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fju> b() {
         return ImmutableList.of(new fju() {
            @Override
            public fju.a t() {
               return fju.a.b;
            }

            @Override
            public void b(fjw $$0) {
               $$0.a(fjv.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fgg.a<fmr.b> {
      abstract void c();
   }

   public class c extends fmr.b {
      private static final wx b = wx.c("controls.reset");
      private static final int c = 10;
      private final fdz d;
      private final wx e;
      private final fga f;
      private final fga g;
      private boolean h = false;

      c(fdz $$1, wx $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fga.a($$2, $$1x -> {
            fmr.this.m.a = $$1;
            fmr.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wx.a("narrator.controls.unbound", $$2) : wx.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fga.a(b, $$1x -> {
            fmr.this.c.m.a($$1, $$1.i());
            fmr.this.d();
         }).a(0, 0, 50, 20).a($$1x -> wx.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fmr.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fmr.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fhw> aF_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fju> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xl $$0 = wx.i();
         if (!this.d.j()) {
            for (fdz $$1 : fmr.this.c.m.W) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wx.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wx.b("[ ").b(this.f.y().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fhl.a(wx.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fmr.this.m.a == this.d) {
            this.f.b(wx.b("> ").b(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
