import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eim extends egp {
   public static final Codec<eim> d = a(eim::new);

   public eim(egp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      djr $$1 = djr.a($$0.f());
      in $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new egp.b($$2, (Consumer<ehh>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ehh $$0, in $$1, djr $$2, egp.a $$3) {
      List<egt> $$4 = Lists.newArrayList();
      eil.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public egy<?> e() {
      return egy.c;
   }
}
