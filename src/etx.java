import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record etx(Optional<dc> b, ja c) implements etz {
   private static final MapCodec<ja> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(ke::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(ke::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(ke::w)
            )
            .apply($$0, ja::new)
   );
   public static final MapCodec<etx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dc.a.optionalFieldOf("predicate").forGetter(etx::c), g.forGetter(etx::d)).apply($$0, etx::new)
   );

   @Override
   public eua b() {
      return eub.n;
   }

   public boolean a(eqo $$0) {
      evz $$1 = $$0.c(etk.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static etz.a a(dc.a $$0) {
      return () -> new etx(Optional.of($$0.b()), ja.c);
   }

   public static etz.a a(dc.a $$0, ja $$1) {
      return () -> new etx(Optional.of($$0.b()), $$1);
   }

   public Optional<dc> c() {
      return this.b;
   }

   public ja d() {
      return this.c;
   }
}
