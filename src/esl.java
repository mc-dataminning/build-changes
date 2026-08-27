import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record esl(Optional<cr> b, io c) implements esn {
   private static final MapCodec<io> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(js::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(js::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(js::w)
            )
            .apply($$0, io::new)
   );
   public static final MapCodec<esl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cr.a.optionalFieldOf("predicate").forGetter(esl::c), d.forGetter(esl::d)).apply($$0, esl::new)
   );

   @Override
   public eso b() {
      return esp.p;
   }

   public boolean a(eph $$0) {
      eum $$1 = $$0.c(erz.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static esn.a a(cr.a $$0) {
      return () -> new esl(Optional.of($$0.b()), io.c);
   }

   public static esn.a a(cr.a $$0, io $$1) {
      return () -> new esl(Optional.of($$0.b()), $$1);
   }

   public Optional<cr> c() {
      return this.b;
   }

   public io d() {
      return this.c;
   }
}
