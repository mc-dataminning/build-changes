import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class eyr extends esn<eyr.b> {
   final eys a;
   int m;

   public eyr(eys $$0, eqm $$1) {
      super($$1, $$0.g + 45, $$0.h, 20, $$0.h - 32, 20);
      this.a = $$0;
      eqk[] $$2 = (eqk[])ArrayUtils.clone($$1.m.X);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (eqk $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new eyr.a(tf.c($$5)));
         }

         tf $$6 = tf.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.m) {
            this.m = $$7;
         }

         this.b(new eyr.c($$4, $$6));
      }
   }

   public void d() {
      eqk.d();
      this.e();
   }

   public void e() {
      this.i().forEach(eyr.b::d);
   }

   @Override
   protected int c() {
      return super.c() + 15;
   }

   @Override
   public int b() {
      return super.b() + 32;
   }

   public class a extends eyr.b {
      final tf b;
      private final int c;

      public a(tf $$1) {
         this.b = $$1;
         this.c = eyr.this.c.h.a(this.b);
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eyr.this.c.h, this.b, eyr.this.c.B.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, 16777215, false);
      }

      @Nullable
      @Override
      public ert a(ewd $$0) {
         return null;
      }

      @Override
      public List<? extends eua> i() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends evv> b() {
         return ImmutableList.of(new evv() {
            @Override
            public evv.a q() {
               return evv.a.b;
            }

            @Override
            public void b(evx $$0) {
               $$0.a(evw.a, a.this.b);
            }
         });
      }

      @Override
      protected void d() {
      }
   }

   public abstract static class b extends esn.a<eyr.b> {
      abstract void d();
   }

   public class c extends eyr.b {
      private final eqk b;
      private final tf c;
      private final esh d;
      private final esh e;
      private boolean f = false;

      c(eqk $$1, tf $$2) {
         this.b = $$1;
         this.c = $$2;
         this.d = esh.a($$2, $$1x -> {
            eyr.this.a.c = $$1;
            eyr.this.d();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? tf.a("narrator.controls.unbound", $$2) : tf.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.e = esh.a(tf.c("controls.reset"), $$1x -> {
            eyr.this.c.m.a($$1, $$1.i());
            eyr.this.d();
         }).a(0, 0, 50, 20).a($$1x -> tf.a("narrator.controls.reset", $$2)).a();
         this.d();
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int var10003 = $$3 + 90 - eyr.this.m;
         $$0.a(eyr.this.c.h, this.c, var10003, $$2 + $$5 / 2 - 9 / 2, 16777215, false);
         this.e.e($$3 + 190);
         this.e.f($$2);
         this.e.a($$0, $$6, $$7, $$9);
         this.d.e($$3 + 105);
         this.d.f($$2);
         if (this.f) {
            int $$10 = 3;
            int $$11 = this.d.p() - 6;
            $$0.a($$11, $$2 + 2, $$11 + 3, $$2 + $$5 + 2, n.m.f() | 0xFF000000);
         }

         this.d.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends eua> i() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      public List<? extends evv> b() {
         return ImmutableList.of(this.d, this.e);
      }

      @Override
      protected void d() {
         this.d.b(this.b.k());
         this.e.i = !this.b.l();
         this.f = false;
         ts $$0 = tf.h();
         if (!this.b.j()) {
            for (eqk $$1 : eyr.this.c.m.X) {
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
            this.d.b(tf.b("[ ").b(this.d.l().e().a(n.p)).f(" ]").a(n.m));
            this.d.a(etq.a(tf.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.d.a(null);
         }

         if (eyr.this.a.c == this.b) {
            this.d.b(tf.b("> ").b(this.d.l().e().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
