import javax.annotation.Nullable;

public class cuf extends cry {
   public static final dfz a = dfp.aT;
   public static final dfq b = dfp.p;
   protected static final ehw c = csl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public cuf(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return c;
   }

   @Override
   public boolean g_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(a);
   }

   private static void d(dez $$0, cpl $$1, gu $$2) {
      int $$3 = $$1.a(cpu.a, $$2) - $$1.v_();
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
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$3.gc()) {
         if ($$1.B) {
            return bgq.a;
         } else {
            dez $$6 = $$0.a(b);
            $$1.a($$2, $$6, 4);
            $$1.a(djj.c, $$2, djj.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bgq.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dcz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return !$$0.B && $$0.x_().g() ? a($$2, dcn.q, cuf::a) : null;
   }

   private static void a(cpl $$0, gu $$1, dez $$2, dcz $$3) {
      if ($$0.V() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }
}
