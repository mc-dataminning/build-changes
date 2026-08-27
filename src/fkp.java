import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fkp extends fee<fkp.b> {
   private static final int a = 20;
   final fkq m;
   private int n;

   public fkp(fkq $$0, fby $$1) {
      super($$1, $$0.k, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      fbw[] $$2 = (fbw[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fbw $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fkp.a(wi.c($$5)));
         }

         wi $$6 = wi.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fkp.c($$4, $$6));
      }
   }

   public void d() {
      fbw.d();
      this.I();
   }

   public void I() {
      this.aE_().forEach(fkp.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fkp.b {
      final wi b;
      private final int c;

      public a(wi $$1) {
         this.b = $$1;
         this.c = fkp.this.c.h.a(this.b);
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fkp.this.c.h, this.b, fkp.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fdi a(fia $$0) {
         return null;
      }

      @Override
      public List<? extends ffu> aE_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fhs> b() {
         return ImmutableList.of(new fhs() {
            @Override
            public fhs.a t() {
               return fhs.a.b;
            }

            @Override
            public void b(fhu $$0) {
               $$0.a(fht.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fee.a<fkp.b> {
      abstract void c();
   }

   public class c extends fkp.b {
      private static final wi b = wi.c("controls.reset");
      private static final int c = 10;
      private final fbw d;
      private final wi e;
      private final fdy f;
      private final fdy g;
      private boolean h = false;

      c(fbw $$1, wi $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fdy.a($$2, $$1x -> {
            fkp.this.m.a = $$1;
            fkp.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wi.a("narrator.controls.unbound", $$2) : wi.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fdy.a(b, $$1x -> {
            fkp.this.c.m.a($$1, $$1.i());
            fkp.this.d();
         }).a(0, 0, 50, 20).a($$1x -> wi.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fkp.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fkp.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends ffu> aE_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fhs> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         ww $$0 = wi.i();
         if (!this.d.j()) {
            for (fbw $$1 : fkp.this.c.m.X) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wi.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wi.b("[ ").b(this.f.y().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(ffj.a(wi.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fkp.this.m.a == this.d) {
            this.f.b(wi.b("> ").b(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
