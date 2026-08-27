import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eot extends eox {
   public static final Codec<eot> a = RecordCodecBuilder.create($$0 -> a($$0).and(enk.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eot::new));
   private final enk.b b;

   public eot(List<eql> $$0, enk.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoz b() {
      return epa.w;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      if ($$0.a(crv.ul) && $$1.c(this.b.a()) instanceof cka $$2) {
         $$0.b(jr.L, new cup($$2.fY()));
      }

      return $$0;
   }

   public static eox.a<?> a(enk.b $$0) {
      return a($$1 -> new eot($$1, $$0));
   }
}
