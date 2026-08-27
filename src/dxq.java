import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxq extends dwa {
   public static final Codec<dxq> d = a(dxq::new);

   public dxq(dwa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      dal $$1 = dal.a($$0.f());
      ht $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dwa.b($$2, (Consumer<dws>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dws $$0, ht $$1, dal $$2, dwa.a $$3) {
      List<dwe> $$4 = Lists.newArrayList();
      dxp.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dwj<?> e() {
      return dwj.c;
   }
}
