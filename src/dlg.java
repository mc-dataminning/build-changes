import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface dlg {
   dlg a = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dj().a($$2, $$3) && !$$2x.f() && !$$2x.P_()).stream().map(bof::ct).toList();
   dlg b = ($$0, $$1, $$2, $$3) -> $$1.a($$0, $$2x -> $$2x.dj().a($$2, $$3) && !$$2x.P_()).stream().map(bof::ct).toList();
   dlg c = ($$0, $$1, $$2, $$3) -> {
      eoq $$4 = new eoq($$2).g($$3);
      return $$1.a($$0, bol.aH, $$4, box::bx).stream().map(bof::ct).toList();
   };

   List<UUID> detect(apa var1, dlg.a var2, ib var3, double var4);

   public interface a {
      dlg.a a = new dlg.a() {
         @Override
         public List<apb> a(apa $$0, Predicate<? super cia> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bof> List<T> a(apa $$0, dqf<bof, T> $$1, eoq $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cia> a(apa var1, Predicate<? super cia> var2);

      <T extends bof> List<T> a(apa var1, dqf<bof, T> var2, eoq var3, Predicate<? super T> var4);

      static dlg.a a(cia $$0) {
         return a(List.of($$0));
      }

      static dlg.a a(final List<cia> $$0) {
         return new dlg.a() {
            @Override
            public List<cia> a(apa $$0x, Predicate<? super cia> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bof> List<T> a(apa $$0x, dqf<bof, T> $$1, eoq $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
