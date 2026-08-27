import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dob {
   dob a = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dm().a($$2, $$3) && !$$2x.f() && !$$2x.N_()).stream().map(bpv::cw).toList();
   dob b = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dm().a($$2, $$3) && !$$2x.N_()).stream().map(bpv::cw).toList();
   dob c = ($$0, $$1, $$2, $$3) -> {
      erv $$4 = new erv($$2).g($$3);
      return $$1.a($$0, bqb.aI, $$4, bqo::bA).stream().map(bpv::cw).toList();
   };

   List<UUID> detect(aps var1, dob.a var2, ib var3, double var4);

   public interface a {
      dob.a a = new dob.a() {
         @Override
         public List<apt> a(aps $$0, Predicate<? super cjt> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bpv> List<T> a(aps $$0, dtg<bpv, T> $$1, erv $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cjt> a(aps var1, Predicate<? super cjt> var2);

      <T extends bpv> List<T> a(aps var1, dtg<bpv, T> var2, erv var3, Predicate<? super T> var4);

      static dob.a a(cjt $$0) {
         return a(List.of($$0));
      }

      static dob.a a(final List<cjt> $$0) {
         return new dob.a() {
            @Override
            public List<cjt> a(aps $$0x, Predicate<? super cjt> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bpv> List<T> a(aps $$0x, dtg<bpv, T> $$1, erv $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
