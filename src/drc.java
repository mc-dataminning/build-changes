import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface drc {
   drc a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bss::cz)
         .toList();
   drc b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bss::cz)
         .toList();
   drc c = ($$0, $$1, $$2, $$3, $$4) -> {
      evk $$5 = new evk($$2).g($$3);
      return $$1.a($$0, bsy.aJ, $$5, btn::bD).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx())).map(bss::cz).toList();
   };

   List<UUID> detect(are var1, drc.a var2, iz var3, double var4, boolean var6);

   private static boolean a(dbw $$0, evp $$1, evp $$2) {
      evl $$3 = $$0.a(new dbf($$2, $$1, dbf.a.c, dbf.b.a, evu.a()));
      return $$3.a().equals(iz.a($$1)) || $$3.c() == evn.a.a;
   }

   public interface a {
      drc.a a = new drc.a() {
         @Override
         public List<arf> a(are $$0, Predicate<? super cmv> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bss> List<T> a(are $$0, dwh<bss, T> $$1, evk $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cmv> a(are var1, Predicate<? super cmv> var2);

      <T extends bss> List<T> a(are var1, dwh<bss, T> var2, evk var3, Predicate<? super T> var4);

      static drc.a a(cmv $$0) {
         return a(List.of($$0));
      }

      static drc.a a(final List<cmv> $$0) {
         return new drc.a() {
            @Override
            public List<cmv> a(are $$0x, Predicate<? super cmv> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bss> List<T> a(are $$0x, dwh<bss, T> $$1, evk $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
