import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dwr {
   dwr a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.du().a($$2, $$3) && !$$2x.b() && !$$2x.U_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD()))
         .map(bva::cF)
         .toList();
   dwr b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.du().a($$2, $$3) && !$$2x.U_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD()))
         .map(bva::cF)
         .toList();
   dwr c = ($$0, $$1, $$2, $$3, $$4) -> {
      fbs $$5 = new fbs($$2).g($$3);
      return $$1.a($$0, bvi.ba, $$5, bvy::bJ).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bD())).map(bva::cF).toList();
   };

   List<UUID> detect(ard var1, dwr.a var2, ji var3, double var4, boolean var6);

   private static boolean a(dgz $$0, fbx $$1, fbx $$2) {
      fbt $$3 = $$0.a(new dgi($$2, $$1, dgi.a.c, dgi.b.a, fcc.a()));
      return $$3.b().equals(ji.a((kb)$$1)) || $$3.d() == fbv.a.a;
   }

   public interface a {
      dwr.a a = new dwr.a() {
         @Override
         public List<are> a(ard $$0, Predicate<? super cpr> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bva> List<T> a(ard $$0, ecb<bva, T> $$1, fbs $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cpr> a(ard var1, Predicate<? super cpr> var2);

      <T extends bva> List<T> a(ard var1, ecb<bva, T> var2, fbs var3, Predicate<? super T> var4);

      static dwr.a a(cpr $$0) {
         return a(List.of($$0));
      }

      static dwr.a a(final List<cpr> $$0) {
         return new dwr.a() {
            @Override
            public List<cpr> a(ard $$0x, Predicate<? super cpr> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bva> List<T> a(ard $$0x, ecb<bva, T> $$1, fbs $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
