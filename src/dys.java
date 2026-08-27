import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dys extends dwv {
   public static final Codec<dys> d = a(dys::new);

   public dys(dwv.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      dbf $$1 = dbf.a($$0.f());
      ht $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dwv.b($$2, (Consumer<dxn>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dxn $$0, ht $$1, dbf $$2, dwv.a $$3) {
      List<dwz> $$4 = Lists.newArrayList();
      dyr.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dxe<?> e() {
      return dxe.c;
   }
}
