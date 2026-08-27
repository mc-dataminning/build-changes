import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fmq extends fgf<fmq.b> {
   private static final int a = 20;
   final fmr m;
   private int n;

   public fmq(fmr $$0, fdz $$1) {
      super($$1, $$0.n, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      fdx[] $$2 = (fdx[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fdx $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fmq.a(wx.c($$5)));
         }

         wx $$6 = wx.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fmq.c($$4, $$6));
      }
   }

   public void d() {
      fdx.d();
      this.I();
   }

   public void I() {
      this.aE_().forEach(fmq.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fmq.b {
      final wx b;
      private final int c;

      public a(wx $$1) {
         this.b = $$1;
         this.c = fmq.this.c.h.a(this.b);
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fmq.this.c.h, this.b, fmq.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public ffj a(fkb $$0) {
         return null;
      }

      @Override
      public List<? extends fhv> aE_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fjt> b() {
         return ImmutableList.of(new fjt() {
            @Override
            public fjt.a t() {
               return fjt.a.b;
            }

            @Override
            public void b(fjv $$0) {
               $$0.a(fju.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fgf.a<fmq.b> {
      abstract void c();
   }

   public class c extends fmq.b {
      private static final wx b = wx.c("controls.reset");
      private static final int c = 10;
      private final fdx d;
      private final wx e;
      private final ffz f;
      private final ffz g;
      private boolean h = false;

      c(fdx $$1, wx $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = ffz.a($$2, $$1x -> {
            fmq.this.m.a = $$1;
            fmq.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wx.a("narrator.controls.unbound", $$2) : wx.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = ffz.a(b, $$1x -> {
            fmq.this.c.m.a($$1, $$1.i());
            fmq.this.d();
         }).a(0, 0, 50, 20).a($$1x -> wx.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fmq.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fmq.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fhv> aE_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fjt> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xl $$0 = wx.i();
         if (!this.d.j()) {
            for (fdx $$1 : fmq.this.c.m.X) {
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
            this.f.a(fhk.a(wx.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fmq.this.m.a == this.d) {
            this.f.b(wx.b("> ").b(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
