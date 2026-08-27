import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class flv extends ffk<flv.b> {
   private static final int a = 20;
   final flw m;
   private int n;

   public flv(flw $$0, fde $$1) {
      super($$1, $$0.n, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      fdc[] $$2 = (fdc[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fdc $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new flv.a(wu.c($$5)));
         }

         wu $$6 = wu.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new flv.c($$4, $$6));
      }
   }

   public void d() {
      fdc.d();
      this.I();
   }

   public void I() {
      this.aE_().forEach(flv.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends flv.b {
      final wu b;
      private final int c;

      public a(wu $$1) {
         this.b = $$1;
         this.c = flv.this.c.h.a(this.b);
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(flv.this.c.h, this.b, flv.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public feo a(fjg $$0) {
         return null;
      }

      @Override
      public List<? extends fha> aE_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fiy> b() {
         return ImmutableList.of(new fiy() {
            @Override
            public fiy.a t() {
               return fiy.a.b;
            }

            @Override
            public void b(fja $$0) {
               $$0.a(fiz.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends ffk.a<flv.b> {
      abstract void c();
   }

   public class c extends flv.b {
      private static final wu b = wu.c("controls.reset");
      private static final int c = 10;
      private final fdc d;
      private final wu e;
      private final ffe f;
      private final ffe g;
      private boolean h = false;

      c(fdc $$1, wu $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = ffe.a($$2, $$1x -> {
            flv.this.m.a = $$1;
            flv.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wu.a("narrator.controls.unbound", $$2) : wu.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = ffe.a(b, $$1x -> {
            flv.this.c.m.a($$1, $$1.i());
            flv.this.d();
         }).a(0, 0, 50, 20).a($$1x -> wu.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = flv.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(flv.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fha> aE_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fiy> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xi $$0 = wu.i();
         if (!this.d.j()) {
            for (fdc $$1 : flv.this.c.m.X) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wu.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wu.b("[ ").b(this.f.y().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fgp.a(wu.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (flv.this.m.a == this.d) {
            this.f.b(wu.b("> ").b(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
