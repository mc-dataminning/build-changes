import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dqf {
   dqf a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.f() && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(brw::cz)
         .toList();
   dqf b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dp().a($$2, $$3) && !$$2x.N_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx()))
         .map(brw::cz)
         .toList();
   dqf c = ($$0, $$1, $$2, $$3, $$4) -> {
      euh $$5 = new euh($$2).g($$3);
      return $$1.a($$0, bsc.aJ, $$5, bsq::bD).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bx())).map(brw::cz).toList();
   };

   List<UUID> detect(aqn var1, dqf.a var2, io var3, double var4, boolean var6);

   private static boolean a(daz $$0, eum $$1, eum $$2) {
      eui $$3 = $$0.a(new dai($$2, $$1, dai.a.c, dai.b.a, eur.a()));
      return $$3.a().equals(io.a($$1)) || $$3.c() == euk.a.a;
   }

   public interface a {
      dqf.a a = new dqf.a() {
         @Override
         public List<aqo> a(aqn $$0, Predicate<? super cly> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends brw> List<T> a(aqn $$0, dvk<brw, T> $$1, euh $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cly> a(aqn var1, Predicate<? super cly> var2);

      <T extends brw> List<T> a(aqn var1, dvk<brw, T> var2, euh var3, Predicate<? super T> var4);

      static dqf.a a(cly $$0) {
         return a(List.of($$0));
      }

      static dqf.a a(final List<cly> $$0) {
         return new dqf.a() {
            @Override
            public List<cly> a(aqn $$0x, Predicate<? super cly> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends brw> List<T> a(aqn $$0x, dvk<brw, T> $$1, euh $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
