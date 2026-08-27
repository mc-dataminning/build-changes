import java.util.Map;
import java.util.Optional;

public class dut {
   public static final aet<dus> a = a("normal");
   public static final aet<dus> b = a("flat");
   public static final aet<dus> c = a("large_biomes");
   public static final aet<dus> d = a("amplified");
   public static final aet<dus> e = a("single_biome_surface");
   public static final aet<dus> f = a("debug_all_block_states");

   public static void a(np<dus> $$0) {
      new dut.a($$0).a();
   }

   private static aet<dus> a(String $$0) {
      return aet.a(je.aF, new aeu($$0));
   }

   public static Optional<aet<dus>> a(ht<dio> $$0) {
      return $$0.d(dio.b).flatMap($$0x -> {
         dhb $$1 = $$0x.b();
         if ($$1 instanceof dki) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dke ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dli a(hu $$0) {
      return $$0.d(je.aF).f(a).a().a();
   }

   public static dio b(hu $$0) {
      return $$0.d(je.aF).f(a).a().b().orElseThrow();
   }

   static class a {
      private final np<dus> a;
      private final hh<dks> b;
      private final hh<cqo> c;
      private final hh<duh> d;
      private final hh<dvj> e;
      private final hh<crc> f;
      private final hg<din> g;
      private final dio h;
      private final dio i;

      a(np<dus> $$0) {
         this.a = $$0;
         hh<din> $$1 = $$0.a(je.au);
         this.b = $$0.a(je.aw);
         this.c = $$0.a(je.ap);
         this.d = $$0.a(je.ay);
         this.e = $$0.a(je.aB);
         this.f = $$0.a(je.aG);
         this.g = $$1.b(dil.a);
         hg<din> $$2 = $$1.b(dil.b);
         hg<dks> $$3 = this.b.b(dks.f);
         hg.c<crc> $$4 = this.f.b(crd.a);
         this.h = new dio($$2, new dkq(crb.a($$4), $$3));
         hg<din> $$5 = $$1.b(dil.c);
         hg<dks> $$6 = this.b.b(dks.g);
         this.i = new dio($$5, new dkq(crf.a(this.c), $$6));
      }

      private dio a(dhb $$0) {
         return new dio(this.g, $$0);
      }

      private dio a(cqs $$0, hg<dks> $$1) {
         return this.a(new dkq($$0, $$1));
      }

      private dus a(dio $$0) {
         return new dus(Map.of(dio.b, $$0, dio.c, this.h, dio.d, this.i));
      }

      private void a(aet<dus> $$0, dio $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(cqs $$0) {
         hg<dks> $$1 = this.b.b(dks.c);
         this.a(dut.a, this.a($$0, $$1));
         hg<dks> $$2 = this.b.b(dks.d);
         this.a(dut.c, this.a($$0, $$2));
         hg<dks> $$3 = this.b.b(dks.e);
         this.a(dut.d, this.a($$0, $$3));
      }

      public void a() {
         hg.c<crc> $$0 = this.f.b(crd.b);
         this.a(crb.a($$0));
         hg<dks> $$1 = this.b.b(dks.c);
         hg.c<cqo> $$2 = this.c.b(cqv.b);
         this.a(dut.e, this.a(new cqz($$2), $$1));
         this.a(dut.b, this.a(new dki(dtg.a(this.c, this.e, this.d))));
         this.a(dut.f, this.a(new dke($$2)));
      }
   }
}
