import javax.annotation.Nullable;

public class cug extends crz {
   public static final dga a = dfq.aT;
   public static final dfr b = dfq.p;
   protected static final ehx c = csm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public cug(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return c;
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(a);
   }

   private static void d(dfa $$0, cpm $$1, gu $$2) {
      int $$3 = $$1.a(cpv.a, $$2) - $$1.v_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(b);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * arp.b($$4));
      }

      $$3 = arp.a($$3, 0, 15);
      if ($$0.c(a) != $$3) {
         $$1.a($$2, $$0.a(a, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$3.gc()) {
         if ($$1.B) {
            return bgq.a;
         } else {
            dfa $$6 = $$0.a(b);
            $$1.a($$2, $$6, 4);
            $$1.a(djk.c, $$2, djk.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bgq.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dda($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return !$$0.B && $$0.x_().g() ? a($$2, dco.q, cug::a) : null;
   }

   private static void a(cpm $$0, gu $$1, dfa $$2, dda $$3) {
      if ($$0.V() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b);
   }
}
