import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fro implements frn.a {
   private final eqv a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<fro.a> d = Lists.newArrayList();
   private final List<fro.b> e = Lists.newArrayList();

   public fro(eqv $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elp $$0, foe $$1, double $$2, double $$3, double $$4) {
      cpv $$5 = this.a.r;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         ehn $$6 = new ehn($$2, 0.0, $$4);
         this.d.removeIf(fro.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         elt $$7 = $$1.getBuffer(fom.x());

         for (fro.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               foc.a($$0, $$7, eid.a(new ehi($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         elt $$9 = $$1.getBuffer(fom.z());

         for (fro.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> foc.b(
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

         for (fro.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               frn.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               frn.a($$0, $$1, gw.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (fro.a $$12 : this.d) {
            ehn $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new ehi($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            frn.a($$0, $$1, $$12.b.a().toString(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(elp $$0, foe $$1, ehi $$2, float $$3, float $$4, float $$5, float $$6) {
      eqg $$7 = eqv.O().j.m();
      if ($$7.h()) {
         ehn $$8 = $$7.b().e();
         frn.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(aew<djt> $$0, ehn $$1) {
      this.d.add(new fro.a(ac.b(), $$0, $$1));
   }

   public void a(djx $$0, int $$1) {
      this.e.add(new fro.b($$0, $$1));
   }

   static record a(long a, aew<djt> b, ehn c) {

      public boolean a() {
         return ac.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public aew<djt> c() {
         return this.b;
      }

      public ehn d() {
         return this.c;
      }
   }

   static class b implements djv {
      public final djx a;
      public final int b;

      public b(djx $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(cpv $$0, ehn $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<ehn> a(cpv $$0) {
         return this.a.a($$0);
      }

      @Override
      public djx a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(akr $$0, djt $$1, djt.a $$2, ehn $$3) {
         return false;
      }
   }
}
