import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euy(Optional<df> b, jd c) implements eva {
   private static final MapCodec<jd> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kh::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kh::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kh::w)
            )
            .apply($$0, jd::new)
   );
   public static final MapCodec<euy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(df.a.optionalFieldOf("predicate").forGetter(euy::c), g.forGetter(euy::d)).apply($$0, euy::new)
   );

   @Override
   public evb b() {
      return evc.n;
   }

   public boolean a(erp $$0) {
      exa $$1 = $$0.c(eul.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<eui<?>> a() {
      return Set.of(eul.f);
   }

   public static eva.a a(df.a $$0) {
      return () -> new euy(Optional.of($$0.b()), jd.c);
   }

   public static eva.a a(df.a $$0, jd $$1) {
      return () -> new euy(Optional.of($$0.b()), $$1);
   }

   public Optional<df> c() {
      return this.b;
   }

   public jd d() {
      return this.c;
   }
}
