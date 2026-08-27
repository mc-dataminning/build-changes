import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fne implements fnd.a {
   private final enn a;
   private static final int b = 32;
   private static final float c = 1.0F;
   private final List<fne.a> d = Lists.newArrayList();
   private final List<fne.b> e = Lists.newArrayList();

   public fne(enn $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
      cmm $$5 = this.a.s;
      if ($$5 == null) {
         this.d.clear();
         this.e.clear();
      } else {
         eei $$6 = new eei($$2, 0.0, $$4);
         this.d.removeIf(fne.a::a);
         this.e.removeIf($$2x -> $$2x.a($$5, $$6));
         ein $$7 = $$1.getBuffer(fkf.x());

         for (fne.b $$8 : this.e) {
            $$8.a($$5).ifPresent($$6x -> {
               double $$7x = $$6x.a() - (double)$$8.b();
               double $$8x = $$6x.b() - (double)$$8.b();
               double $$9 = $$6x.c() - (double)$$8.b();
               double $$10 = $$6x.a() + (double)$$8.b();
               double $$11 = $$6x.b() + (double)$$8.b();
               double $$12x = $$6x.c() + (double)$$8.b();
               fjv.a($$0, $$7, eey.a(new eed($$7x, $$8x, $$9, $$10, $$11, $$12x)), -$$2, -$$3, -$$4, 1.0F, 1.0F, 0.0F, 0.35F, true);
            });
         }

         ein $$9 = $$1.getBuffer(fkf.z());

         for (fne.b $$10 : this.e) {
            $$10.a($$5)
               .ifPresent(
                  $$5x -> fjv.b(
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

         for (fne.b $$11 : this.e) {
            $$11.a($$5).ifPresent($$2x -> {
               fnd.a($$0, $$1, "Listener Origin", $$2x.a(), $$2x.b() + 1.8F, $$2x.c(), -1, 0.025F);
               fnd.a($$0, $$1, gu.a($$2x).toString(), $$2x.a(), $$2x.b() + 1.5, $$2x.c(), -6959665, 0.025F);
            });
         }

         for (fne.a $$12 : this.d) {
            eei $$13 = $$12.c;
            double $$14 = 0.2F;
            double $$15 = $$13.c - 0.2F;
            double $$16 = $$13.d - 0.2F;
            double $$17 = $$13.e - 0.2F;
            double $$18 = $$13.c + 0.2F;
            double $$19 = $$13.d + 0.2F + 0.5;
            double $$20 = $$13.e + 0.2F;
            a($$0, $$1, new eed($$15, $$16, $$17, $$18, $$19, $$20), 1.0F, 1.0F, 1.0F, 0.2F);
            fnd.a($$0, $$1, $$12.b.a(), $$13.c, $$13.d + 0.85F, $$13.e, -7564911, 0.0075F);
         }
      }
   }

   private static void a(eij $$0, fjx $$1, eed $$2, float $$3, float $$4, float $$5, float $$6) {
      emz $$7 = enn.N().j.m();
      if ($$7.h()) {
         eei $$8 = $$7.b().e();
         fnd.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
      }
   }

   public void a(dgl $$0, eei $$1) {
      this.d.add(new fne.a(ac.b(), $$0, $$1));
   }

   public void a(dgp $$0, int $$1) {
      this.e.add(new fne.b($$0, $$1));
   }

   static record a(long a, dgl b, eei c) {

      public boolean a() {
         return ac.b() - this.a > 3000L;
      }

      public long b() {
         return this.a;
      }

      public dgl c() {
         return this.b;
      }

      public eei d() {
         return this.c;
      }
   }

   static class b implements dgn {
      public final dgp a;
      public final int b;

      public b(dgp $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public boolean a(cmm $$0, eei $$1) {
         return this.a.a($$0).filter($$1x -> $$1x.g($$1) <= 1024.0).isPresent();
      }

      public Optional<eei> a(cmm $$0) {
         return this.a.a($$0);
      }

      @Override
      public dgp a() {
         return this.a;
      }

      @Override
      public int b() {
         return this.b;
      }

      @Override
      public boolean a(aif $$0, dgl $$1, dgl.a $$2, eei $$3) {
         return false;
      }
   }
}
