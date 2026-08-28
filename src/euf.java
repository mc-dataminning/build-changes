import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record euf(Optional<dc> b, ja c) implements euh {
   private static final MapCodec<ja> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(ke::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(ke::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(ke::w)
            )
            .apply($$0, ja::new)
   );
   public static final MapCodec<euf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dc.a.optionalFieldOf("predicate").forGetter(euf::c), g.forGetter(euf::d)).apply($$0, euf::new)
   );

   @Override
   public eui b() {
      return euj.n;
   }

   public boolean a(eqw $$0) {
      ewh $$1 = $$0.c(ets.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static euh.a a(dc.a $$0) {
      return () -> new euf(Optional.of($$0.b()), ja.c);
   }

   public static euh.a a(dc.a $$0, ja $$1) {
      return () -> new euf(Optional.of($$0.b()), $$1);
   }

   public Optional<dc> c() {
      return this.b;
   }

   public ja d() {
      return this.c;
   }
}
