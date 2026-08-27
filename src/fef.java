import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fef extends exx<fef.b> {
   final feg a;
   int m;

   public fef(feg $$0, evr $$1) {
      super($$1, $$0.g + 45, $$0.h - 52, 20, 20);
      this.a = $$0;
      evp[] $$2 = (evp[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (evp $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fef.a(vg.c($$5)));
         }

         vg $$6 = vg.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new fef.c($$4, $$6));
      }
   }

   public void d() {
      evp.d();
      this.e();
   }

   public void e() {
      this.l().forEach(fef.b::b);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends fef.b {
      final vg b;
      private final int c;

      public a(vg $$1) {
         this.b = $$1;
         this.c = fef.this.c.h.a(this.b);
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fef.this.c.h, this.b, fef.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public exb a(fbq $$0) {
         return null;
      }

      @Override
      public List<? extends ezm> l() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fbi> a() {
         return ImmutableList.of(new fbi() {
            @Override
            public fbi.a s() {
               return fbi.a.b;
            }

            @Override
            public void b(fbk $$0) {
               $$0.a(fbj.a, a.this.b);
            }
         });
      }

      @Override
      protected void b() {
      }
   }

   public abstract static class b extends exx.a<fef.b> {
      abstract void b();
   }

   public class c extends fef.b {
      private final evp b;
      private final vg c;
      private final exr d;
      private final exr e;
      private boolean f = false;

      c(evp $$1, vg $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = exr.a($$2, $$1x -> {
            fef.this.a.c = $$1;
            fef.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? vg.a("narrator.controls.unbound", $$2) : vg.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = exr.a(vg.c("controls.reset"), $$1x -> {
            fef.this.c.m.a($$1, $$1.i());
            fef.this.d();
         }).a(0, 0, 50, 20).a($$1x -> vg.a("narrator.controls.reset", $$2)).a();
         this.b();
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - fef.this.m;
         $$0.a(fef.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
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
      public List<? extends ezm> l() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends fbi> a() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void b() {
         this.d.b(this.b.k());
         this.e.j = !this.b.l();
         this.f = false;
         vu $$0 = vg.i();
         if (!this.b.j()) {
            for (evp $$1 : fef.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(vg.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(vg.b("[ ").b(this.d.x().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(ezc.a(vg.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (fef.this.a.c == this.b) {
            this.d.b(vg.b("> ").b(this.d.x().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
