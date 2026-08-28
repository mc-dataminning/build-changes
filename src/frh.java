import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class frh extends fim<frh.b> {
   private static final int a = 20;
   final fri m;
   private int n;

   public frh(fri $$0, fgi $$1) {
      super($$1, $$0.m, $$0.r.d(), $$0.r.c(), 20);
      this.m = $$0;
      fgg[] $$2 = (fgg[])ArrayUtils.clone($$1.m.W);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fgg $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new frh.a(wy.c($$5)));
         }

         wy $$6 = wy.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new frh.c($$4, $$6));
      }
   }

   public void c() {
      fgg.d();
      this.J();
   }

   public void J() {
      this.aG_().forEach(frh.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends frh.b {
      final wy b;
      private final int c;

      public a(final wy $$1) {
         this.b = $$1;
         this.c = frh.this.c.h.a(this.b);
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(frh.this.c.h, this.b, frh.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fhq a(fmi $$0) {
         return null;
      }

      @Override
      public List<? extends fkc> aG_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fma> b() {
         return ImmutableList.of(new fma() {
            @Override
            public fma.a u() {
               return fma.a.b;
            }

            @Override
            public void b(fmc $$0) {
               $$0.a(fmb.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fim.a<frh.b> {
      abstract void c();
   }

   public class c extends frh.b {
      private static final wy b = wy.c("controls.reset");
      private static final int c = 10;
      private final fgg d;
      private final wy e;
      private final fig f;
      private final fig g;
      private boolean h = false;

      c(final fgg $$1, final wy $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fig.a($$2, $$1x -> {
            frh.this.m.a = $$1;
            frh.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wy.a("narrator.controls.unbound", $$2) : wy.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fig.a(b, $$1x -> {
            frh.this.c.m.a($$1, $$1.i());
            frh.this.c();
         }).a(0, 0, 50, 20).a($$1x -> wy.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = frh.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(frh.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fkc> aG_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fma> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xm $$0 = wy.i();
         if (!this.d.j()) {
            for (fgg $$1 : frh.this.c.m.W) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wy.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wy.b("[ ").b(this.f.z().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fjr.a(wy.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (frh.this.m.a == this.d) {
            this.f.b(wy.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
