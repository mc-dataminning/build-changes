import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dvw {
   dvw a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dw().a($$2, $$3) && !$$2x.b() && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(buj::cG)
         .toList();
   dvw b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dw().a($$2, $$3) && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(buj::cG)
         .toList();
   dvw c = ($$0, $$1, $$2, $$3, $$4) -> {
      fat $$5 = new fat($$2).g($$3);
      return $$1.a($$0, buq.ba, $$5, bvf::bL).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF())).map(buj::cG).toList();
   };

   List<UUID> detect(arc var1, dvw.a var2, ji var3, double var4, boolean var6);

   private static boolean a(dgg $$0, fay $$1, fay $$2) {
      fau $$3 = $$0.a(new dfo($$2, $$1, dfo.a.c, dfo.b.a, fbd.a()));
      return $$3.b().equals(ji.a((kb)$$1)) || $$3.d() == faw.a.a;
   }

   public interface a {
      dvw.a a = new dvw.a() {
         @Override
         public List<ard> a(arc $$0, Predicate<? super cov> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends buj> List<T> a(arc $$0, ebf<buj, T> $$1, fat $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cov> a(arc var1, Predicate<? super cov> var2);

      <T extends buj> List<T> a(arc var1, ebf<buj, T> var2, fat var3, Predicate<? super T> var4);

      static dvw.a a(cov $$0) {
         return a(List.of($$0));
      }

      static dvw.a a(final List<cov> $$0) {
         return new dvw.a() {
            @Override
            public List<cov> a(arc $$0x, Predicate<? super cov> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends buj> List<T> a(arc $$0x, ebf<buj, T> $$1, fat $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
