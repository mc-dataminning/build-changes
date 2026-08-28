import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dtt {
   dtt a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.ds().a($$2, $$3) && !$$2x.f() && !$$2x.Q_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC()))
         .map(btr::cD)
         .toList();
   dtt b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.ds().a($$2, $$3) && !$$2x.Q_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC()))
         .map(btr::cD)
         .toList();
   dtt c = ($$0, $$1, $$2, $$3, $$4) -> {
      eyr $$5 = new eyr($$2).g($$3);
      return $$1.a($$0, bty.aJ, $$5, bun::bI).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC())).map(btr::cD).toList();
   };

   List<UUID> detect(arj var1, dtt.a var2, jf var3, double var4, boolean var6);

   private static boolean a(dej $$0, eyw $$1, eyw $$2) {
      eys $$3 = $$0.a(new ddr($$2, $$1, ddr.a.c, ddr.b.a, ezb.a()));
      return $$3.b().equals(jf.a((jy)$$1)) || $$3.d() == eyu.a.a;
   }

   public interface a {
      dtt.a a = new dtt.a() {
         @Override
         public List<ark> a(arj $$0, Predicate<? super cnx> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends btr> List<T> a(arj $$0, dzd<btr, T> $$1, eyr $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cnx> a(arj var1, Predicate<? super cnx> var2);

      <T extends btr> List<T> a(arj var1, dzd<btr, T> var2, eyr var3, Predicate<? super T> var4);

      static dtt.a a(cnx $$0) {
         return a(List.of($$0));
      }

      static dtt.a a(final List<cnx> $$0) {
         return new dtt.a() {
            @Override
            public List<cnx> a(arj $$0x, Predicate<? super cnx> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends btr> List<T> a(arj $$0x, dzd<btr, T> $$1, eyr $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
