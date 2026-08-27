import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dqd {
   dqd a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bru::cz)
         .toList();
   dqd b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(bru::cz)
         .toList();
   dqd c = ($$0, $$1, $$2, $$3, $$4) -> {
      euf $$5 = new euf($$2).g($$3);
      return $$1.a($$0, bsa.aJ, $$5, bso::bD).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx())).map(bru::cz).toList();
   };

   List<UUID> detect(aqm var1, dqd.a var2, io var3, double var4, boolean var6);

   private static boolean a(dax $$0, euk $$1, euk $$2) {
      eug $$3 = $$0.a(new dag($$2, $$1, dag.a.c, dag.b.a, eup.a()));
      return $$3.a().equals(io.a($$1)) || $$3.c() == eui.a.a;
   }

   public interface a {
      dqd.a a = new dqd.a() {
         @Override
         public List<aqn> a(aqm $$0, Predicate<? super clw> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bru> List<T> a(aqm $$0, dvi<bru, T> $$1, euf $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends clw> a(aqm var1, Predicate<? super clw> var2);

      <T extends bru> List<T> a(aqm var1, dvi<bru, T> var2, euf var3, Predicate<? super T> var4);

      static dqd.a a(clw $$0) {
         return a(List.of($$0));
      }

      static dqd.a a(final List<clw> $$0) {
         return new dqd.a() {
            @Override
            public List<clw> a(aqm $$0x, Predicate<? super clw> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bru> List<T> a(aqm $$0x, dvi<bru, T> $$1, euf $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
