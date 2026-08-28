import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface drm {
   drm a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dq().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.by()))
         .map(bsg::cA)
         .toList();
   drm b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dq().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.by()))
         .map(bsg::cA)
         .toList();
   drm c = ($$0, $$1, $$2, $$3, $$4) -> {
      ewa $$5 = new ewa($$2).g($$3);
      return $$1.a($$0, bsm.aJ, $$5, btb::bE).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.by())).map(bsg::cA).toList();
   };

   List<UUID> detect(aqm var1, drm.a var2, ja var3, double var4, boolean var6);

   private static boolean a(dcf $$0, ewf $$1, ewf $$2) {
      ewb $$3 = $$0.a(new dbo($$2, $$1, dbo.a.c, dbo.b.a, ewk.a()));
      return $$3.a().equals(ja.a($$1)) || $$3.c() == ewd.a.a;
   }

   public interface a {
      drm.a a = new drm.a() {
         @Override
         public List<aqn> a(aqm $$0, Predicate<? super cmk> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bsg> List<T> a(aqm $$0, dwu<bsg, T> $$1, ewa $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cmk> a(aqm var1, Predicate<? super cmk> var2);

      <T extends bsg> List<T> a(aqm var1, dwu<bsg, T> var2, ewa var3, Predicate<? super T> var4);

      static drm.a a(cmk $$0) {
         return a(List.of($$0));
      }

      static drm.a a(final List<cmk> $$0) {
         return new drm.a() {
            @Override
            public List<cmk> a(aqm $$0x, Predicate<? super cmk> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bsg> List<T> a(aqm $$0x, dwu<bsg, T> $$1, ewa $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
