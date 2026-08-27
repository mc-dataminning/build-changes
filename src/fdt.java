import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fdt extends exl<fdt.b> {
   final fdu a;
   int m;

   public fdt(fdu $$0, evh $$1) {
      super($$1, $$0.g + 45, $$0.h - 52, 20, 20);
      this.a = $$0;
      evf[] $$2 = (evf[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (evf $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fdt.a(vf.c($$5)));
         }

         vf $$6 = vf.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new fdt.c($$4, $$6));
      }
   }

   public void d() {
      evf.d();
      this.e();
   }

   public void e() {
      this.l().forEach(fdt.b::b);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends fdt.b {
      final vf b;
      private final int c;

      public a(vf $$1) {
         this.b = $$1;
         this.c = fdt.this.c.h.a(this.b);
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fdt.this.c.h, this.b, fdt.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public ewq a(fbe $$0) {
         return null;
      }

      @Override
      public List<? extends eza> l() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends faw> a() {
         return ImmutableList.of(new faw() {
            @Override
            public faw.a s() {
               return faw.a.b;
            }

            @Override
            public void b(fay $$0) {
               $$0.a(fax.a, a.this.b);
            }
         });
      }

      @Override
      protected void b() {
      }
   }

   public abstract static class b extends exl.a<fdt.b> {
      abstract void b();
   }

   public class c extends fdt.b {
      private final evf b;
      private final vf c;
      private final exf d;
      private final exf e;
      private boolean f = false;

      c(evf $$1, vf $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = exf.a($$2, $$1x -> {
            fdt.this.a.c = $$1;
            fdt.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? vf.a("narrator.controls.unbound", $$2) : vf.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = exf.a(vf.c("controls.reset"), $$1x -> {
            fdt.this.c.m.a($$1, $$1.i());
            fdt.this.d();
         }).a(0, 0, 50, 20).a($$1x -> vf.a("narrator.controls.reset", $$2)).a();
         this.b();
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - fdt.this.m;
         $$0.a(fdt.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.n($$3 + 190);
         this.e.o($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.n($$3 + 105);
         this.d.o($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.B() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends eza> l() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends faw> a() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void b() {
         this.d.b(this.b.k());
         this.e.j = !this.b.l();
         this.f = false;
         vt $$0 = vf.i();
         if (!this.b.j()) {
            for (evf $$1 : fdt.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(vf.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(vf.b("[ ").b(this.d.x().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(eyq.a(vf.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (fdt.this.a.c == this.b) {
            this.d.b(vf.b("> ").b(this.d.x().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
