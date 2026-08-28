import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface drd {
   drd a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bst::cz)
         .toList();
   drd b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bst::cz)
         .toList();
   drd c = ($$0, $$1, $$2, $$3, $$4) -> {
      evl $$5 = new evl($$2).g($$3);
      return $$1.a($$0, bsz.aJ, $$5, bto::bD).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx())).map(bst::cz).toList();
   };

   List<UUID> detect(are var1, drd.a var2, iz var3, double var4, boolean var6);

   private static boolean a(dbx $$0, evq $$1, evq $$2) {
      evm $$3 = $$0.a(new dbg($$2, $$1, dbg.a.c, dbg.b.a, evv.a()));
      return $$3.a().equals(iz.a($$1)) || $$3.c() == evo.a.a;
   }

   public interface a {
      drd.a a = new drd.a() {
         @Override
         public List<arf> a(are $$0, Predicate<? super cmw> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bst> List<T> a(are $$0, dwi<bst, T> $$1, evl $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cmw> a(are var1, Predicate<? super cmw> var2);

      <T extends bst> List<T> a(are var1, dwi<bst, T> var2, evl var3, Predicate<? super T> var4);

      static drd.a a(cmw $$0) {
         return a(List.of($$0));
      }

      static drd.a a(final List<cmw> $$0) {
         return new drd.a() {
            @Override
            public List<cmw> a(are $$0x, Predicate<? super cmw> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bst> List<T> a(are $$0x, dwi<bst, T> $$1, evl $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
