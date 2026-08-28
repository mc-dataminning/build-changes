import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dxn {
   dxn a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.b() && !$$2x.U_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE()))
         .map(bvs::cG)
         .toList();
   dxn b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dv().a($$2, $$3) && !$$2x.U_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE()))
         .map(bvs::cG)
         .toList();
   dxn c = ($$0, $$1, $$2, $$3, $$4) -> {
      fcp $$5 = new fcp($$2).g($$3);
      return $$1.a($$0, bwb.ba, $$5, bwr::bK).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bE())).map(bvs::cG).toList();
   };

   List<UUID> detect(arn var1, dxn.a var2, jj var3, double var4, boolean var6);

   private static boolean a(dhp $$0, fcu $$1, fcu $$2) {
      fcq $$3 = $$0.a(new dgy($$2, $$1, dgy.a.c, dgy.b.a, fcz.a()));
      return $$3.b().equals(jj.a((kc)$$1)) || $$3.d() == fcs.a.a;
   }

   public interface a {
      dxn.a a = new dxn.a() {
         @Override
         public List<aro> a(arn $$0, Predicate<? super cqi> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bvs> List<T> a(arn $$0, ecy<bvs, T> $$1, fcp $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cqi> a(arn var1, Predicate<? super cqi> var2);

      <T extends bvs> List<T> a(arn var1, ecy<bvs, T> var2, fcp var3, Predicate<? super T> var4);

      static dxn.a a(cqi $$0) {
         return a(List.of($$0));
      }

      static dxn.a a(final List<cqi> $$0) {
         return new dxn.a() {
            @Override
            public List<cqi> a(arn $$0x, Predicate<? super cqi> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bvs> List<T> a(arn $$0x, ecy<bvs, T> $$1, fcp $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
