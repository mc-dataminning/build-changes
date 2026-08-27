import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epj extends epo {
   public static final Codec<epj> a = RecordCodecBuilder.create($$0 -> a($$0).and(eoa.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, epj::new));
   private final eoa.b b;

   public epj(List<erh> $$0, eoa.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epq b() {
      return epr.w;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      if ($$0.a(csg.un) && $$1.c(this.b.a()) instanceof ckl $$2) {
         $$0.b(jz.L, new cvd($$2.fZ()));
      }

      return $$0;
   }

   public static epo.a<?> a(eoa.b $$0) {
      return a($$1 -> new epj($$1, $$0));
   }
}
