import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class emn {
   public static final int a = 90;
   static final alb b = alb.b("igloo/top");
   private static final alb c = alb.b("igloo/middle");
   private static final alb d = alb.b("igloo/bottom");
   static final Map<alb, je> e = ImmutableMap.of(b, new je(3, 5, 5), c, new je(1, 3, 1), d, new je(3, 6, 7));
   static final Map<alb, je> f = ImmutableMap.of(b, je.c, c, new je(2, -3, 4), d, new je(0, -3, -2));

   public static void a(eor $$0, je $$1, dnj $$2, ekt $$3, azk $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new emn.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new emn.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new emn.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eky {
      public a(eor $$0, alb $$1, je $$2, dnj $$3, int $$4) {
         super(elf.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(eor $$0, uf $$1) {
         super(elf.I, $$1, $$0, $$1x -> a(dnj.valueOf($$1.l("Rot")), $$1x));
      }

      private static eom a(dnj $$0, alb $$1) {
         return new eom().a($$0).a(dls.a).a(emn.e.get($$1)).a(enr.b).a(eoa.a);
      }

      private static je a(alb $$0, je $$1, int $$2) {
         return $$1.a(emn.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, je $$1, dei $$2, azk $$3, ekg $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dgx.a.o(), 3);
            dre $$5 = $$2.c_($$1.e());
            if ($$5 instanceof drl) {
               ((drl)$$5).a(esp.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         alb $$7 = alb.a(this.a);
         eom $$8 = a(this.c.d(), $$7);
         je $$9 = emn.f.get($$7);
         je $$10 = this.d.a((ki)eoq.a($$8, new je(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dzw.a.a, $$10.u(), $$10.w());
         je $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(emn.b)) {
            je $$13 = this.d.a((ki)eoq.a($$8, new je(3, 0, 5)));
            dua $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dgx.cO)) {
               $$0.a($$13, dgx.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
