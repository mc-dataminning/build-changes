import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class eyx extends esq<eyx.b> {
   final eyy a;
   int m;

   public eyx(eyy $$0, eqp $$1) {
      super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
      this.a = $$0;
      eqn[] $$2 = (eqn[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (eqn $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new eyx.a(tl.c($$5)));
         }

         tl $$6 = tl.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new eyx.c($$4, $$6));
      }
   }

   public void d() {
      eqn.d();
      this.e();
   }

   public void e() {
      this.i().forEach(eyx.b::d);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends eyx.b {
      final tl b;
      private final int c;

      public a(tl $$1) {
         this.b = $$1;
         this.c = eyx.this.c.h.a(this.b);
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eyx.this.c.h, this.b, eyx.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public erw a(ewj $$0) {
         return null;
      }

      @Override
      public List<? extends euf> i() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends ewb> b() {
         return ImmutableList.of(new ewb() {
            @Override
            public ewb.a q() {
               return ewb.a.b;
            }

            @Override
            public void b(ewd $$0) {
               $$0.a(ewc.a, a.this.b);
            }
         });
      }

      @Override
      protected void d() {
      }
   }

   public abstract static class b extends esq.a<eyx.b> {
      abstract void d();
   }

   public class c extends eyx.b {
      private final eqn b;
      private final tl c;
      private final esk d;
      private final esk e;
      private boolean f = false;

      c(eqn $$1, tl $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = esk.a($$2, $$1x -> {
            eyx.this.a.c = $$1;
            eyx.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? tl.a("narrator.controls.unbound", $$2) : tl.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = esk.a(tl.c("controls.reset"), $$1x -> {
            eyx.this.c.m.a($$1, $$1.i());
            eyx.this.d();
         }).a(0, 0, 50, 20).a($$1x -> tl.a("narrator.controls.reset", $$2)).a();
         this.d();
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - eyx.this.m;
         $$0.a(eyx.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
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
      public List<? extends euf> i() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends ewb> b() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void d() {
         this.d.b(this.b.k());
         this.e.i = !this.b.l();
         this.f = false;
         tz $$0 = tl.i();
         if (!this.b.j()) {
            for (eqn $$1 : eyx.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(tl.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(tl.b("[ ").b(this.d.m().f().a(n.p)).f(" ]").a(n.m));
            this.d.a(etv.a(tl.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (eyx.this.a.c == this.b) {
            this.d.b(tl.b("> ").b(this.d.m().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
