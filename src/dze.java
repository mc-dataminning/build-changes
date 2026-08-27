import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dze extends dxh {
   public static final Codec<dze> d = a(dze::new);

   public dze(dxh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      dbm $$1 = dbm.a($$0.f());
      ht $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dxh.b($$2, (Consumer<dxz>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dxz $$0, ht $$1, dbm $$2, dxh.a $$3) {
      List<dxl> $$4 = Lists.newArrayList();
      dzd.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dxq<?> e() {
      return dxq.c;
   }
}
