import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erv extends esb {
   public static final MapCodec<erv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eqo.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, erv::new)
   );
   private final eqo.b b;

   public erv(List<etz> $$0, eqo.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esd<erv> b() {
      return ese.B;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      if ($$0.a(cud.un) && $$1.c(this.b.a()) instanceof cmh $$2) {
         $$0.b(kn.V, new cxb($$2.fX()));
      }

      return $$0;
   }

   public static esb.a<?> a(eqo.b $$0) {
      return a($$1 -> new erv($$1, $$0));
   }
}
