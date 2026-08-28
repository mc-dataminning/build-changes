import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dtc {
   dtc a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.ds().a($$2, $$3) && !$$2x.f() && !$$2x.P_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC()))
         .map(btj::cD)
         .toList();
   dtc b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.ds().a($$2, $$3) && !$$2x.P_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC()))
         .map(btj::cD)
         .toList();
   dtc c = ($$0, $$1, $$2, $$3, $$4) -> {
      exz $$5 = new exz($$2).g($$3);
      return $$1.a($$0, btq.aJ, $$5, buf::bI).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bC())).map(btj::cD).toList();
   };

   List<UUID> detect(arg var1, dtc.a var2, je var3, double var4, boolean var6);

   private static boolean a(dds $$0, eye $$1, eye $$2) {
      eya $$3 = $$0.a(new dda($$2, $$1, dda.a.c, dda.b.a, eyj.a()));
      return $$3.a().equals(je.a((jx)$$1)) || $$3.c() == eyc.a.a;
   }

   public interface a {
      dtc.a a = new dtc.a() {
         @Override
         public List<arh> a(arg $$0, Predicate<? super cnp> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends btj> List<T> a(arg $$0, dyl<btj, T> $$1, exz $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cnp> a(arg var1, Predicate<? super cnp> var2);

      <T extends btj> List<T> a(arg var1, dyl<btj, T> var2, exz var3, Predicate<? super T> var4);

      static dtc.a a(cnp $$0) {
         return a(List.of($$0));
      }

      static dtc.a a(final List<cnp> $$0) {
         return new dtc.a() {
            @Override
            public List<cnp> a(arg $$0x, Predicate<? super cnp> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends btj> List<T> a(arg $$0x, dyl<btj, T> $$1, exz $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
