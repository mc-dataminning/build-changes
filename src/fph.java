import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fph extends fit<fph.b> {
   private static final int a = 20;
   final fpi m;
   private int n;

   public fph(fpi $$0, fgj $$1) {
      super($$1, $$0.n, $$0.d.d(), $$0.d.c(), 20);
      this.m = $$0;
      fgh[] $$2 = (fgh[])ArrayUtils.clone($$1.m.Y);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fgh $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fph.a(xe.c($$5)));
         }

         xe $$6 = xe.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fph.c($$4, $$6));
      }
   }

   public void d() {
      fgh.d();
      this.I();
   }

   public void I() {
      this.aE_().forEach(fph.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fph.b {
      final xe b;
      private final int c;

      public a(xe $$1) {
         this.b = $$1;
         this.c = fph.this.c.h.a(this.b);
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fph.this.c.h, this.b, fph.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fhx a(fmp $$0) {
         return null;
      }

      @Override
      public List<? extends fkj> aE_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fmh> b() {
         return ImmutableList.of(new fmh() {
            @Override
            public fmh.a t() {
               return fmh.a.b;
            }

            @Override
            public void b(fmj $$0) {
               $$0.a(fmi.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fit.a<fph.b> {
      abstract void c();
   }

   public class c extends fph.b {
      private static final xe b = xe.c("controls.reset");
      private static final int c = 10;
      private final fgh d;
      private final xe e;
      private final fin f;
      private final fin g;
      private boolean h = false;

      c(fgh $$1, xe $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fin.a($$2, $$1x -> {
            fph.this.m.a = $$1;
            fph.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xe.a("narrator.controls.unbound", $$2) : xe.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fin.a(b, $$1x -> {
            fph.this.c.m.a($$1, $$1.i());
            fph.this.d();
         }).a(0, 0, 50, 20).a($$1x -> xe.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fph.this.p() - this.g.x() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.x();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fph.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.C() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fkj> aE_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fmh> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xs $$0 = xe.i();
         if (!this.d.j()) {
            for (fgh $$1 : fph.this.c.m.Y) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.a(xe.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xe.b("[ ").a(this.f.y().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fjy.a(xe.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fph.this.m.a == this.d) {
            this.f.b(xe.b("> ").a(this.f.y().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
