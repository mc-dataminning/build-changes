import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record euu(Optional<df> b, jd c) implements euw {
   private static final MapCodec<jd> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kh::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kh::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kh::w)
            )
            .apply($$0, jd::new)
   );
   public static final MapCodec<euu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(df.a.optionalFieldOf("predicate").forGetter(euu::c), g.forGetter(euu::d)).apply($$0, euu::new)
   );

   @Override
   public eux b() {
      return euy.n;
   }

   public boolean a(erl $$0) {
      eww $$1 = $$0.c(euh.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static euw.a a(df.a $$0) {
      return () -> new euu(Optional.of($$0.b()), jd.c);
   }

   public static euw.a a(df.a $$0, jd $$1) {
      return () -> new euu(Optional.of($$0.b()), $$1);
   }

   public Optional<df> c() {
      return this.b;
   }

   public jd d() {
      return this.c;
   }
}
