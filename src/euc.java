import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class euc {
   public static final int a = 90;
   static final alk b = alk.b("igloo/top");
   private static final alk c = alk.b("igloo/middle");
   private static final alk d = alk.b("igloo/bottom");
   static final Map<alk, iw> e = ImmutableMap.of(b, new iw(3, 5, 5), c, new iw(1, 3, 1), d, new iw(3, 6, 7));
   static final Map<alk, iw> f = ImmutableMap.of(b, iw.c, c, new iw(2, -3, 4), d, new iw(0, -3, -2));

   public static void a(ewg $$0, iw $$1, dty $$2, esi $$3, azz $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new euc.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new euc.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new euc.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends esn {
      public a(ewg $$0, alk $$1, iw $$2, dty $$3, int $$4) {
         super(esu.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ewg $$0, ua $$1) {
         super(esu.I, $$1, $$0, $$1x -> a($$1.<dty>a("Rot", dty.h).orElseThrow(), $$1x));
      }

      private static ewb a(dty $$0, alk $$1) {
         return new ewb().a($$0).a(dsh.a).a(euc.e.get($$1)).a(evg.b).a(evp.a);
      }

      private static iw a(alk $$0, iw $$1, int $$2) {
         return $$1.a(euc.f.get($$0)).c($$2);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dty.h, this.c.d());
      }

      @Override
      protected void a(String $$0, iw $$1, dkq $$2, azz $$3, erv $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dng.a.m(), 3);
            dye $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dym) {
               ((dym)$$5).a(faf.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         alk $$7 = alk.a(this.a);
         ewb $$8 = a(this.c.d(), $$7);
         iw $$9 = euc.f.get($$7);
         iw $$10 = this.d.a((kb)ewf.a($$8, new iw(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(ehf.a.a, $$10.u(), $$10.w());
         iw $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(euc.b)) {
            iw $$13 = this.d.a((kb)ewf.a($$8, new iw(3, 0, 5)));
            ebg $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dng.da)) {
               $$0.a($$13, dng.ef.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
