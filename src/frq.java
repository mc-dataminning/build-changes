import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class frq implements frp.a {
   private final eqx a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<frq.a> d = Lists.newArrayList();
   private final List<frq.b> e = Lists.newArrayList();

   public frq(eqx $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elr $$0, fog $$1, double $$2, double $$3, double $$4) {
      cpx $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         ehp $$6 = new ehp($$2, 0.0, $$4);
         this.d.removeIf(frq.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         elv $$7 = $$1.getBuffer(foo.x());

         for (frq.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               foe.a($$0, $$7, eif.a(new ehk($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         elv $$9 = $$1.getBuffer(foo.z());

         for (frq.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> foe.b(
                        $$0,
                        $$9,
                        $$5x.a() - 0.25 - $$2,
                        $$5x.b() - $$3,
                        $$5x.c() - 0.25 - $$4,
                        $$5x.a() + 0.25 - $$2,
                        $$5x.b() - $$3 + 1.0,
                        $$5x.c() + 0.25 - $$4,
                        1.0F,
                        1.0F,
                        0.0F,
                        0.35F
                     )
               );
         }

         for (frq.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               frp.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               frp.a($$0, $$1, gw.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (frq.a $$12 : this.d) {
            ehp $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new ehk($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            frp.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(elr $$0, fog $$1, ehk $$2, float $$3, float $$4, float $$5, float $$6) {
      eqi $$7 = eqx.O().j.m();
      if ($$7.h()) {
         ehp $$8 = $$7.b().e();
         frp.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(aex<djv> $$0, ehp $$1) {
      this.d.add(new frq.a(ac.b(), $$0, $$1));
   }

   public void a(djz $$0, int $$1) {
      this.e.add(new frq.b($$0, $$1));
   }

   static record a(long a, aex<djv> b, ehp c) {

      public boolean a() {
         return ac.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public aex<djv> c() {
         return this.b;
      }

      public ehp d() {
         return this.c;
      }
   }

   static class b implements djx {
      public final djz a;
      public final int b;

      public b(djz $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(cpx $$0, ehp $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<ehp> a(cpx $$0) {
         return this.a.a($$0);
      }

      @Override
      public djz a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(aks $$0, djv $$1, djv.a $$2, ehp $$3) {
         return false;
      }
   }
}
