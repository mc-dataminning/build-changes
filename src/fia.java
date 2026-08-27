import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fia extends fbo<fia.b> {
   final fib a;
   int m;

   public fia(fib $$0, ezi $$1) {
      super($$1, $$0.g + 45, $$0.h - 52, 20, 20);
      this.a = $$0;
      ezg[] $$2 = (ezg[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (ezg $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fia.a(vu.c($$5)));
         }

         vu $$6 = vu.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new fia.c($$4, $$6));
      }
   }

   public void d() {
      ezg.d();
      this.e();
   }

   public void e() {
      this.l().forEach(fia.b::b);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends fia.b {
      final vu b;
      private final int c;

      public a(vu $$1) {
         this.b = $$1;
         this.c = fia.this.c.h.a(this.b);
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fia.this.c.h, this.b, fia.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public fas a(ffk $$0) {
         return null;
      }

      @Override
      public List<? extends fde> l() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends ffc> a() {
         return ImmutableList.of(new ffc() {
            @Override
            public ffc.a s() {
               return ffc.a.b;
            }

            @Override
            public void b(ffe $$0) {
               $$0.a(ffd.a, a.this.b);
            }
         });
      }

      @Override
      protected void b() {
      }
   }

   public abstract static class b extends fbo.a<fia.b> {
      abstract void b();
   }

   public class c extends fia.b {
      private final ezg b;
      private final vu c;
      private final fbi d;
      private final fbi e;
      private boolean f = false;

      c(ezg $$1, vu $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = fbi.a($$2, $$1x -> {
            fia.this.a.c = $$1;
            fia.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? vu.a("narrator.controls.unbound", $$2) : vu.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = fbi.a(vu.c("controls.reset"), $$1x -> {
            fia.this.c.m.a($$1, $$1.i());
            fia.this.d();
         }).a(0, 0, 50, 20).a($$1x -> vu.a("narrator.controls.reset", $$2)).a();
         this.b();
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - fia.this.m;
         $$0.a(fia.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.m($$3 + 190);
         this.e.n($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.m($$3 + 105);
         this.d.n($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.B() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fde> l() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends ffc> a() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void b() {
         this.d.b(this.b.k());
         this.e.j = !this.b.l();
         this.f = false;
         wi $$0 = vu.i();
         if (!this.b.j()) {
            for (ezg $$1 : fia.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(vu.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(vu.b("[ ").b(this.d.x().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(fct.a(vu.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (fia.this.a.c == this.b) {
            this.d.b(vu.b("> ").b(this.d.x().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
