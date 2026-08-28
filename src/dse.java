import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dse {
   dse a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.f() && !$$2x.R_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.by()))
         .map(bsr::cA)
         .toList();
   dse b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.R_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.by()))
         .map(bsr::cA)
         .toList();
   dse c = ($$0, $$1, $$2, $$3, $$4) -> {
      ewv $$5 = new ewv($$2).g($$3);
      return $$1.a($$0, bsx.aJ, $$5, btn::bE).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.by())).map(bsr::cA).toList();
   };

   List<UUID> detect(aqu var1, dse.a var2, jd var3, double var4, boolean var6);

   private static boolean a(dcw $$0, exa $$1, exa $$2) {
      eww $$3 = $$0.a(new dcf($$2, $$1, dcf.a.c, dcf.b.a, exf.a()));
      return $$3.a().equals(jd.a((jw)$$1)) || $$3.c() == ewy.a.a;
   }

   public interface a {
      dse.a a = new dse.a() {
         @Override
         public List<aqv> a(aqu $$0, Predicate<? super cmx> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bsr> List<T> a(aqu $$0, dxn<bsr, T> $$1, ewv $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cmx> a(aqu var1, Predicate<? super cmx> var2);

      <T extends bsr> List<T> a(aqu var1, dxn<bsr, T> var2, ewv var3, Predicate<? super T> var4);

      static dse.a a(cmx $$0) {
         return a(List.of($$0));
      }

      static dse.a a(final List<cmx> $$0) {
         return new dse.a() {
            @Override
            public List<cmx> a(aqu $$0x, Predicate<? super cmx> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bsr> List<T> a(aqu $$0x, dxn<bsr, T> $$1, ewv $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
