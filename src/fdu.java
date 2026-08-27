import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fdu extends exm<fdu.b> {
   final fdv a;
   int m;

   public fdu(fdv $$0, evi $$1) {
      super($$1, $$0.g + 45, $$0.h - 52, 20, 20);
      this.a = $$0;
      evg[] $$2 = (evg[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (evg $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fdu.a(vf.c($$5)));
         }

         vf $$6 = vf.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new fdu.c($$4, $$6));
      }
   }

   public void d() {
      evg.d();
      this.e();
   }

   public void e() {
      this.l().forEach(fdu.b::b);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends fdu.b {
      final vf b;
      private final int c;

      public a(vf $$1) {
         this.b = $$1;
         this.c = fdu.this.c.h.a(this.b);
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fdu.this.c.h, this.b, fdu.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public ewr a(fbf $$0) {
         return null;
      }

      @Override
      public List<? extends ezb> l() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fax> a() {
         return ImmutableList.of(new fax() {
            @Override
            public fax.a s() {
               return fax.a.b;
            }

            @Override
            public void b(faz $$0) {
               $$0.a(fay.a, a.this.b);
            }
         });
      }

      @Override
      protected void b() {
      }
   }

   public abstract static class b extends exm.a<fdu.b> {
      abstract void b();
   }

   public class c extends fdu.b {
      private final evg b;
      private final vf c;
      private final exg d;
      private final exg e;
      private boolean f = false;

      c(evg $$1, vf $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = exg.a($$2, $$1x -> {
            fdu.this.a.c = $$1;
            fdu.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? vf.a("narrator.controls.unbound", $$2) : vf.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = exg.a(vf.c("controls.reset"), $$1x -> {
            fdu.this.c.m.a($$1, $$1.i());
            fdu.this.d();
         }).a(0, 0, 50, 20).a($$1x -> vf.a("narrator.controls.reset", $$2)).a();
         this.b();
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - fdu.this.m;
         $$0.a(fdu.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
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
      public List<? extends ezb> l() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends fax> a() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void b() {
         this.d.b(this.b.k());
         this.e.j = !this.b.l();
         this.f = false;
         vt $$0 = vf.i();
         if (!this.b.j()) {
            for (evg $$1 : fdu.this.c.m.X) {
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
            this.d.a(eyr.a(vf.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (fdu.this.a.c == this.b) {
            this.d.b(vf.b("> ").b(this.d.x().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
