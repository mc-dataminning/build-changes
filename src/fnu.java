import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fnu extends fhj<fnu.b> {
   private static final int a = 20;
   final fnv m;
   private int n;

   public fnu(fnv $$0, ffe $$1) {
      super($$1, $$0.n, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      ffc[] $$2 = (ffc[])ArrayUtils.clone($$1.m.W);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (ffc $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fnu.a(xo.c($$5)));
         }

         xo $$6 = xo.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fnu.c($$4, $$6));
      }
   }

   public void c() {
      ffc.d();
      this.I();
   }

   public void I() {
      this.aD_().forEach(fnu.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fnu.b {
      final xo b;
      private final int c;

      public a(final xo $$1) {
         this.b = $$1;
         this.c = fnu.this.c.h.a(this.b);
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fnu.this.c.h, this.b, fnu.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fgn a(flf $$0) {
         return null;
      }

      @Override
      public List<? extends fiz> aD_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fkx> b() {
         return ImmutableList.of(new fkx() {
            @Override
            public fkx.a t() {
               return fkx.a.b;
            }

            @Override
            public void b(fkz $$0) {
               $$0.a(fky.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fhj.a<fnu.b> {
      abstract void c();
   }

   public class c extends fnu.b {
      private static final xo b = xo.c("controls.reset");
      private static final int c = 10;
      private final ffc d;
      private final xo e;
      private final fhd f;
      private final fhd g;
      private boolean h = false;

      c(final ffc $$1, final xo $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fhd.a($$2, $$1x -> {
            fnu.this.m.a = $$1;
            fnu.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xo.a("narrator.controls.unbound", $$2) : xo.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fhd.a(b, $$1x -> {
            fnu.this.c.m.a($$1, $$1.i());
            fnu.this.c();
         }).a(0, 0, 50, 20).a($$1x -> xo.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fnu.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fnu.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fiz> aD_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fkx> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         yc $$0 = xo.i();
         if (!this.d.j()) {
            for (ffc $$1 : fnu.this.c.m.W) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xo.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xo.b("[ ").b(this.f.y().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fio.a(xo.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fnu.this.m.a == this.d) {
            this.f.b(xo.b("> ").b(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
