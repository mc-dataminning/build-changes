import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dsc {
   dsc a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dq().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.by()))
         .map(bsq::cA)
         .toList();
   dsc b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dq().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.by()))
         .map(bsq::cA)
         .toList();
   dsc c = ($$0, $$1, $$2, $$3, $$4) -> {
      ewr $$5 = new ewr($$2).g($$3);
      return $$1.a($$0, bsw.aJ, $$5, btl::bE).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.by())).map(bsq::cA).toList();
   };

   List<UUID> detect(aqt var1, dsc.a var2, jd var3, double var4, boolean var6);

   private static boolean a(dcu $$0, eww $$1, eww $$2) {
      ews $$3 = $$0.a(new dcd($$2, $$1, dcd.a.c, dcd.b.a, exb.a()));
      return $$3.a().equals(jd.a((jw)$$1)) || $$3.c() == ewu.a.a;
   }

   public interface a {
      dsc.a a = new dsc.a() {
         @Override
         public List<aqu> a(aqt $$0, Predicate<? super cmv> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bsq> List<T> a(aqt $$0, dxk<bsq, T> $$1, ewr $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cmv> a(aqt var1, Predicate<? super cmv> var2);

      <T extends bsq> List<T> a(aqt var1, dxk<bsq, T> var2, ewr var3, Predicate<? super T> var4);

      static dsc.a a(cmv $$0) {
         return a(List.of($$0));
      }

      static dsc.a a(final List<cmv> $$0) {
         return new dsc.a() {
            @Override
            public List<cmv> a(aqt $$0x, Predicate<? super cmv> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bsq> List<T> a(aqt $$0x, dxk<bsq, T> $$1, ewr $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
