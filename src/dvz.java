import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dvz {
   dvz a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bum::cG)
         .toList();
   dvz b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.Z_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bum::cG)
         .toList();
   dvz c = ($$0, $$1, $$2, $$3, $$4) -> {
      faw $$5 = new faw($$2).g($$3);
      return $$1.a($$0, but.ba, $$5, bvi::bL).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF())).map(bum::cG).toList();
   };

   List<UUID> detect(ard var1, dvz.a var2, ji var3, double var4, boolean var6);

   private static boolean a(dgj $$0, fbb $$1, fbb $$2) {
      fax $$3 = $$0.a(new dfr($$2, $$1, dfr.a.c, dfr.b.a, fbg.a()));
      return $$3.b().equals(ji.a((kb)$$1)) || $$3.d() == faz.a.a;
   }

   public interface a {
      dvz.a a = new dvz.a() {
         @Override
         public List<are> a(ard $$0, Predicate<? super coy> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bum> List<T> a(ard $$0, ebi<bum, T> $$1, faw $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends coy> a(ard var1, Predicate<? super coy> var2);

      <T extends bum> List<T> a(ard var1, ebi<bum, T> var2, faw var3, Predicate<? super T> var4);

      static dvz.a a(coy $$0) {
         return a(List.of($$0));
      }

      static dvz.a a(final List<coy> $$0) {
         return new dvz.a() {
            @Override
            public List<coy> a(ard $$0x, Predicate<? super coy> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bum> List<T> a(ard $$0x, ebi<bum, T> $$1, faw $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
