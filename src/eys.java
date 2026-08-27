import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class eys extends esm<eys.b> {
   final eyt a;
   int m;

   public eys(eyt $$0, eql $$1) {
      super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
      this.a = $$0;
      eqj[] $$2 = (eqj[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (eqj $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new eys.a(tf.c($$5)));
         }

         tf $$6 = tf.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new eys.c($$4, $$6));
      }
   }

   public void d() {
      eqj.d();
      this.e();
   }

   public void e() {
      this.i().forEach(eys.b::d);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends eys.b {
      final tf b;
      private final int c;

      public a(tf $$1) {
         this.b = $$1;
         this.c = eys.this.c.h.a(this.b);
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eys.this.c.h, this.b, eys.this.c.y.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public ers a(ewe $$0) {
         return null;
      }

      @Override
      public List<? extends eua> i() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends evw> b() {
         return ImmutableList.of(new evw() {
            @Override
            public evw.a q() {
               return evw.a.b;
            }

            @Override
            public void b(evy $$0) {
               $$0.a(evx.a, a.this.b);
            }
         });
      }

      @Override
      protected void d() {
      }
   }

   public abstract static class b extends esm.a<eys.b> {
      abstract void d();
   }

   public class c extends eys.b {
      private final eqj b;
      private final tf c;
      private final esg d;
      private final esg e;
      private boolean f = false;

      c(eqj $$1, tf $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = esg.a($$2, $$1x -> {
            eys.this.a.c = $$1;
            eys.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? tf.a("narrator.controls.unbound", $$2) : tf.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = esg.a(tf.c("controls.reset"), $$1x -> {
            eys.this.c.m.a($$1, $$1.i());
            eys.this.d();
         }).a(0, 0, 50, 20).a($$1x -> tf.a("narrator.controls.reset", $$2)).a();
         this.d();
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - eys.this.m;
         $$0.a(eys.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
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
      public List<? extends eua> i() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends evw> b() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void d() {
         this.d.b(this.b.k());
         this.e.i = !this.b.l();
         this.f = false;
         ts $$0 = tf.h();
         if (!this.b.j()) {
            for (eqj $$1 : eys.this.c.m.X) {
               if ($$1 != this.b && this.b.b($$1)) {
                  if (this.f) {
                     $$0.f(", ");
                  }

                  this.f = true;
                  $$0.b(tf.c($$1.h()));
               }
            }
         }

         if (this.f) {
            this.d.b(tf.b("[ ").b(this.d.m().e().a(n.p)).f(" ]").a(n.m));
            this.d.a(etq.a(tf.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (eys.this.a.c == this.b) {
            this.d.b(tf.b("> ").b(this.d.m().e().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
