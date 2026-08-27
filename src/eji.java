import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eji extends ehl {
   public static final MapCodec<eji> d = a(eji::new);

   public eji(ehl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      dkn $$1 = dkn.a($$0.f());
      io $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ehl.b($$2, (Consumer<eid>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eid $$0, io $$1, dkn $$2, ehl.a $$3) {
      List<ehp> $$4 = Lists.newArrayList();
      ejh.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ehu<?> e() {
      return ehu.c;
   }
}
