import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface drj {
   drj a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bsd::cz)
         .toList();
   drj b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bsd::cz)
         .toList();
   drj c = ($$0, $$1, $$2, $$3, $$4) -> {
      evu $$5 = new evu($$2).g($$3);
      return $$1.a($$0, bsj.aJ, $$5, bsy::bD).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx())).map(bsd::cz).toList();
   };

   List<UUID> detect(aqk var1, drj.a var2, ja var3, double var4, boolean var6);

   private static boolean a(dcd $$0, evz $$1, evz $$2) {
      evv $$3 = $$0.a(new dbm($$2, $$1, dbm.a.c, dbm.b.a, ewe.a()));
      return $$3.a().equals(ja.a($$1)) || $$3.c() == evx.a.a;
   }

   public interface a {
      drj.a a = new drj.a() {
         @Override
         public List<aql> a(aqk $$0, Predicate<? super cmh> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bsd> List<T> a(aqk $$0, dwo<bsd, T> $$1, evu $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cmh> a(aqk var1, Predicate<? super cmh> var2);

      <T extends bsd> List<T> a(aqk var1, dwo<bsd, T> var2, evu var3, Predicate<? super T> var4);

      static drj.a a(cmh $$0) {
         return a(List.of($$0));
      }

      static drj.a a(final List<cmh> $$0) {
         return new drj.a() {
            @Override
            public List<cmh> a(aqk $$0x, Predicate<? super cmh> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bsd> List<T> a(aqk $$0x, dwo<bsd, T> $$1, evu $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
