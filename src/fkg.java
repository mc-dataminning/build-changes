import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fkg extends fdv<fkg.b> {
   private static final int a = 20;
   final fkh m;
   private int n;

   public fkg(fkh $$0, fbp $$1) {
      super($$1, $$0.k, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      fbn[] $$2 = (fbn[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fbn $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fkg.a(wg.c($$5)));
         }

         wg $$6 = wg.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fkg.c($$4, $$6));
      }
   }

   public void d() {
      fbn.d();
      this.I();
   }

   public void I() {
      this.aF_().forEach(fkg.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fkg.b {
      final wg b;
      private final int c;

      public a(wg $$1) {
         this.b = $$1;
         this.c = fkg.this.c.h.a(this.b);
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fkg.this.c.h, this.b, fkg.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fcz a(fhr $$0) {
         return null;
      }

      @Override
      public List<? extends ffl> aF_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fhj> b() {
         return ImmutableList.of(new fhj() {
            @Override
            public fhj.a t() {
               return fhj.a.b;
            }

            @Override
            public void b(fhl $$0) {
               $$0.a(fhk.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fdv.a<fkg.b> {
      abstract void c();
   }

   public class c extends fkg.b {
      private static final wg b = wg.c("controls.reset");
      private static final int c = 10;
      private final fbn d;
      private final wg e;
      private final fdp f;
      private final fdp g;
      private boolean h = false;

      c(fbn $$1, wg $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fdp.a($$2, $$1x -> {
            fkg.this.m.a = $$1;
            fkg.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wg.a("narrator.controls.unbound", $$2) : wg.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fdp.a(b, $$1x -> {
            fkg.this.c.m.a($$1, $$1.i());
            fkg.this.d();
         }).a(0, 0, 50, 20).a($$1x -> wg.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fkg.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fkg.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends ffl> aF_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fhj> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         wu $$0 = wg.i();
         if (!this.d.j()) {
            for (fbn $$1 : fkg.this.c.m.X) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wg.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wg.b("[ ").b(this.f.y().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(ffa.a(wg.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fkg.this.m.a == this.d) {
            this.f.b(wg.b("> ").b(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
