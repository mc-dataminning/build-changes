import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class eze extends esy<eze.b> {
   final ezf a;
   int m;

   public eze(ezf $$0, eqx $$1) {
      super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
      this.a = $$0;
      eqv[] $$2 = (eqv[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (eqv $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new eze.a(tn.c($$5)));
         }

         tn $$6 = tn.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new eze.c($$4, $$6));
      }
   }

   public void d() {
      eqv.d();
      this.e();
   }

   public void e() {
      this.i().forEach(eze.b::d);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends eze.b {
      final tn b;
      private final int c;

      public a(tn $$1) {
         this.b = $$1;
         this.c = eze.this.c.h.a(this.b);
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eze.this.c.h, this.b, eze.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public ese a(ewq $$0) {
         return null;
      }

      @Override
      public List<? extends eum> i() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends ewi> b() {
         return ImmutableList.of(new ewi() {
            @Override
            public ewi.a q() {
               return ewi.a.b;
            }

            @Override
            public void b(ewk $$0) {
               $$0.a(ewj.a, a.this.b);
            }
         });
      }

      @Override
      protected void d() {
      }
   }

   public abstract static class b extends esy.a<eze.b> {
      abstract void d();
   }

   public class c extends eze.b {
      private final eqv b;
      private final tn c;
      private final ess d;
      private final ess e;
      private boolean f = false;

      c(eqv $$1, tn $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = ess.a($$2, $$1x -> {
            eze.this.a.c = $$1;
            eze.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? tn.a("narrator.controls.unbound", $$2) : tn.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = ess.a(tn.c("controls.reset"), $$1x -> {
            eze.this.c.m.a($$1, $$1.i());
            eze.this.d();
         }).a(0, 0, 50, 20).a($$1x -> tn.a("narrator.controls.reset", $$2)).a();
         this.d();
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - eze.this.m;
         $$0.a(eze.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.f($$3 + 190);
         this.e.g($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.f($$3 + 105);
         this.d.g($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.r() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends eum> i() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends ewi> b() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void d() {
         this.d.b(this.b.k());
         this.e.i = !this.b.l();
         this.f = false;
         ua $$0 = tn.h();
         if (!this.b.j()) {
            for (eqv $$1 : eze.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(tn.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(tn.b("[ ").b(this.d.m().e().a(n.p)).f(" ]").a(n.m));
            this.d.a(euc.a(tn.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (eze.this.a.c == this.b) {
            this.d.b(tn.b("> ").b(this.d.m().e().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
