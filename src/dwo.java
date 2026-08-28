import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dwo {
   dwo a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.aa_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bvf::cG)
         .toList();
   dwo b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.aa_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF()))
         .map(bvf::cG)
         .toList();
   dwo c = ($$0, $$1, $$2, $$3, $$4) -> {
      fbn $$5 = new fbn($$2).g($$3);
      return $$1.a($$0, bvm.bb, $$5, bwb::bL).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bF())).map(bvf::cG).toList();
   };

   List<UUID> detect(ash var1, dwo.a var2, jh var3, double var4, boolean var6);

   private static boolean a(dha $$0, fbs $$1, fbs $$2) {
      fbo $$3 = $$0.a(new dgi($$2, $$1, dgi.a.c, dgi.b.a, fbx.a()));
      return $$3.b().equals(jh.a((ka)$$1)) || $$3.d() == fbq.a.a;
   }

   public interface a {
      dwo.a a = new dwo.a() {
         @Override
         public List<asi> a(ash $$0, Predicate<? super cps> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bvf> List<T> a(ash $$0, ebx<bvf, T> $$1, fbn $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cps> a(ash var1, Predicate<? super cps> var2);

      <T extends bvf> List<T> a(ash var1, ebx<bvf, T> var2, fbn var3, Predicate<? super T> var4);

      static dwo.a a(cps $$0) {
         return a(List.of($$0));
      }

      static dwo.a a(final List<cps> $$0) {
         return new dwo.a() {
            @Override
            public List<cps> a(ash $$0x, Predicate<? super cps> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bvf> List<T> a(ash $$0x, ebx<bvf, T> $$1, fbn $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
