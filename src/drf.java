import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface drf {
   drf a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bsv::cz)
         .toList();
   drf b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bsv::cz)
         .toList();
   drf c = ($$0, $$1, $$2, $$3, $$4) -> {
      evn $$5 = new evn($$2).g($$3);
      return $$1.a($$0, btb.aJ, $$5, btq::bD).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx())).map(bsv::cz).toList();
   };

   List<UUID> detect(arf var1, drf.a var2, iz var3, double var4, boolean var6);

   private static boolean a(dbz $$0, evs $$1, evs $$2) {
      evo $$3 = $$0.a(new dbi($$2, $$1, dbi.a.c, dbi.b.a, evx.a()));
      return $$3.a().equals(iz.a($$1)) || $$3.c() == evq.a.a;
   }

   public interface a {
      drf.a a = new drf.a() {
         @Override
         public List<arg> a(arf $$0, Predicate<? super cmy> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bsv> List<T> a(arf $$0, dwk<bsv, T> $$1, evn $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cmy> a(arf var1, Predicate<? super cmy> var2);

      <T extends bsv> List<T> a(arf var1, dwk<bsv, T> var2, evn var3, Predicate<? super T> var4);

      static drf.a a(cmy $$0) {
         return a(List.of($$0));
      }

      static drf.a a(final List<cmy> $$0) {
         return new drf.a() {
            @Override
            public List<cmy> a(arf $$0x, Predicate<? super cmy> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bsv> List<T> a(arf $$0x, dwk<bsv, T> $$1, evn $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
