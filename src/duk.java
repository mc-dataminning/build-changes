import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface duk {
   duk a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dx().a($$2, $$3) && !$$2x.f() && !$$2x.R_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bG()))
         .map(bue::cH)
         .toList();
   duk b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dx().a($$2, $$3) && !$$2x.R_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bG()))
         .map(bue::cH)
         .toList();
   duk c = ($$0, $$1, $$2, $$3, $$4) -> {
      ezi $$5 = new ezi($$2).g($$3);
      return $$1.a($$0, bul.aJ, $$5, bva::bM).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bG())).map(bue::cH).toList();
   };

   List<UUID> detect(arn var1, duk.a var2, jh var3, double var4, boolean var6);

   private static boolean a(dfb $$0, ezn $$1, ezn $$2) {
      ezj $$3 = $$0.a(new dej($$2, $$1, dej.a.c, dej.b.a, ezs.a()));
      return $$3.b().equals(jh.a((ka)$$1)) || $$3.d() == ezl.a.a;
   }

   public interface a {
      duk.a a = new duk.a() {
         @Override
         public List<aro> a(arn $$0, Predicate<? super com> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bue> List<T> a(arn $$0, dzu<bue, T> $$1, ezi $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends com> a(arn var1, Predicate<? super com> var2);

      <T extends bue> List<T> a(arn var1, dzu<bue, T> var2, ezi var3, Predicate<? super T> var4);

      static duk.a a(com $$0) {
         return a(List.of($$0));
      }

      static duk.a a(final List<com> $$0) {
         return new duk.a() {
            @Override
            public List<com> a(arn $$0x, Predicate<? super com> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bue> List<T> a(arn $$0x, dzu<bue, T> $$1, ezi $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
