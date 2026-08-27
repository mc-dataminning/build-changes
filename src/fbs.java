import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fbs extends evk<fbs.b> {
   final fbt a;
   int m;

   public fbs(fbt $$0, eti $$1) {
      super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
      this.a = $$0;
      etg[] $$2 = (etg[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (etg $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fbs.a(uv.c($$5)));
         }

         uv $$6 = uv.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new fbs.c($$4, $$6));
      }
   }

   public void e() {
      etg.d();
      this.v();
   }

   public void v() {
      this.i().forEach(fbs.b::c);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends fbs.b {
      final uv b;
      private final int c;

      public a(uv $$1) {
         this.b = $$1;
         this.c = fbs.this.c.h.a(this.b);
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fbs.this.c.h, this.b, fbs.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public euq a(ezd $$0) {
         return null;
      }

      @Override
      public List<? extends ewz> i() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends eyv> b() {
         return ImmutableList.of(new eyv() {
            @Override
            public eyv.a q() {
               return eyv.a.b;
            }

            @Override
            public void b(eyx $$0) {
               $$0.a(eyw.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends evk.a<fbs.b> {
      abstract void c();
   }

   public class c extends fbs.b {
      private final etg b;
      private final uv c;
      private final eve d;
      private final eve e;
      private boolean f = false;

      c(etg $$1, uv $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = eve.a($$2, $$1x -> {
            fbs.this.a.c = $$1;
            fbs.this.e();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? uv.a("narrator.controls.unbound", $$2) : uv.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = eve.a(uv.c("controls.reset"), $$1x -> {
            fbs.this.c.m.a($$1, $$1.i());
            fbs.this.e();
         }).a(0, 0, 50, 20).a($$1x -> uv.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - fbs.this.m;
         $$0.a(fbs.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.f($$3 + 190);
         this.e.g($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.f($$3 + 105);
         this.d.g($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.p() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends ewz> i() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends eyv> b() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void c() {
         this.d.b(this.b.k());
         this.e.i = !this.b.l();
         this.f = false;
         vj $$0 = uv.i();
         if (!this.b.j()) {
            for (etg $$1 : fbs.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(uv.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(uv.b("[ ").b(this.d.l().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(ewp.a(uv.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (fbs.this.a.c == this.b) {
            this.d.b(uv.b("> ").b(this.d.l().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
