import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class edb extends ebe {
   public static final Codec<edb> d = a(edb::new);

   public edb(ebe.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      dfa $$1 = dfa.a($$0.f());
      hz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ebe.b($$2, (Consumer<ebw>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ebw $$0, hz $$1, dfa $$2, ebe.a $$3) {
      List<ebi> $$4 = Lists.newArrayList();
      eda.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ebn<?> e() {
      return ebn.c;
   }
}
