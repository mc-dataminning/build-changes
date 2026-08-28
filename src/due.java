import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface due {
   due a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dx().a($$2, $$3) && !$$2x.f() && !$$2x.R_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bG()))
         .map(btz::cH)
         .toList();
   due b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dx().a($$2, $$3) && !$$2x.R_())
         .stream()
         .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bG()))
         .map(btz::cH)
         .toList();
   due c = ($$0, $$1, $$2, $$3, $$4) -> {
      ezc $$5 = new ezc($$2).g($$3);
      return $$1.a($$0, bug.aJ, $$5, buv::bM).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bG())).map(btz::cH).toList();
   };

   List<UUID> detect(arm var1, due.a var2, jg var3, double var4, boolean var6);

   private static boolean a(dev $$0, ezh $$1, ezh $$2) {
      ezd $$3 = $$0.a(new ded($$2, $$1, ded.a.c, ded.b.a, ezm.a()));
      return $$3.b().equals(jg.a((jz)$$1)) || $$3.d() == ezf.a.a;
   }

   public interface a {
      due.a a = new due.a() {
         @Override
         public List<arn> a(arm $$0, Predicate<? super coh> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends btz> List<T> a(arm $$0, dzo<btz, T> $$1, ezc $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends coh> a(arm var1, Predicate<? super coh> var2);

      <T extends btz> List<T> a(arm var1, dzo<btz, T> var2, ezc var3, Predicate<? super T> var4);

      static due.a a(coh $$0) {
         return a(List.of($$0));
      }

      static due.a a(final List<coh> $$0) {
         return new due.a() {
            @Override
            public List<coh> a(arm $$0x, Predicate<? super coh> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends btz> List<T> a(arm $$0x, dzo<btz, T> $$1, ezc $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
