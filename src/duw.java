import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface duw {
   duw a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.Y_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bul::cG)
         .toList();
   duw b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.Y_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bul::cG)
         .toList();
   duw c = ($$0, $$1, $$2, $$3, $$4) -> {
      ezt $$5 = new ezt($$2).g($$3);
      return $$1.a($$0, bus.aX, $$5, bvh::bL).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF())).map(bul::cG).toList();
   };

   List<UUID> detect(arp var1, duw.a var2, jh var3, double var4, boolean var6);

   private static boolean a(dfm $$0, ezy $$1, ezy $$2) {
      ezu $$3 = $$0.a(new deu($$2, $$1, deu.a.c, deu.b.a, fad.a()));
      return $$3.b().equals(jh.a((ka)$$1)) || $$3.d() == ezw.a.a;
   }

   public interface a {
      duw.a a = new duw.a() {
         @Override
         public List<arq> a(arp $$0, Predicate<? super cou> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bul> List<T> a(arp $$0, eaf<bul, T> $$1, ezt $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cou> a(arp var1, Predicate<? super cou> var2);

      <T extends bul> List<T> a(arp var1, eaf<bul, T> var2, ezt var3, Predicate<? super T> var4);

      static duw.a a(cou $$0) {
         return a(List.of($$0));
      }

      static duw.a a(final List<cou> $$0) {
         return new duw.a() {
            @Override
            public List<cou> a(arp $$0x, Predicate<? super cou> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bul> List<T> a(arp $$0x, eaf<bul, T> $$1, ezt $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
