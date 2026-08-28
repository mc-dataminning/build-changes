import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fub extends flf<fub.b> {
   private static final int a = 20;
   final fuc m;
   private int n;

   public fub(fuc $$0, fja $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fiy[] $$2 = (fiy[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fiy $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fub.a(xh.c($$5)));
         }

         xh $$6 = xh.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fub.c($$4, $$6));
      }
   }

   public void c() {
      fiy.d();
      this.J();
   }

   public void J() {
      this.aJ_().forEach(fub.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fub.b {
      final xh b;
      private final int c;

      public a(final xh $$1) {
         this.b = $$1;
         this.c = fub.this.c.h.a(this.b);
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fub.this.c.h, this.b, fub.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fkj a(fpd $$0) {
         return null;
      }

      @Override
      public List<? extends fmw> aJ_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fov> b() {
         return ImmutableList.of(new fov() {
            @Override
            public fov.a u() {
               return fov.a.b;
            }

            @Override
            public void b(fox $$0) {
               $$0.a(fow.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends flf.a<fub.b> {
      abstract void c();
   }

   public class c extends fub.b {
      private static final xh b = xh.c("controls.reset");
      private static final int c = 10;
      private final fiy d;
      private final xh e;
      private final fkz f;
      private final fkz g;
      private boolean h = false;

      c(final fiy $$1, final xh $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fkz.a($$2, $$1x -> {
            fub.this.m.a = $$1;
            fub.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xh.a("narrator.controls.unbound", $$2) : xh.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fkz.a(b, $$1x -> {
            $$1.b($$1.i());
            fub.this.c();
         }).a(0, 0, 50, 20).a($$1x -> xh.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fub.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fub.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fmw> aJ_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fov> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xv $$0 = xh.i();
         if (!this.d.j()) {
            for (fiy $$1 : fub.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xh.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xh.b("[ ").b(this.f.z().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fmk.a(xh.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fub.this.m.a == this.d) {
            this.f.b(xh.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
