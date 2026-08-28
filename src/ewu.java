import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewu(Optional<df> b, jf c) implements eww {
   private static final MapCodec<jf> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kj::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kj::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kj::w)
            )
            .apply($$0, jf::new)
   );
   public static final MapCodec<ewu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(df.a.optionalFieldOf("predicate").forGetter(ewu::c), g.forGetter(ewu::d)).apply($$0, ewu::new)
   );

   @Override
   public ewx b() {
      return ewy.n;
   }

   public boolean a(etl $$0) {
      eyw $$1 = $$0.c(ewh.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<ewe<?>> a() {
      return Set.of(ewh.f);
   }

   public static eww.a a(df.a $$0) {
      return () -> new ewu(Optional.of($$0.b()), jf.c);
   }

   public static eww.a a(df.a $$0, jf $$1) {
      return () -> new ewu(Optional.of($$0.b()), $$1);
   }

   public Optional<df> c() {
      return this.b;
   }

   public jf d() {
      return this.c;
   }
}
