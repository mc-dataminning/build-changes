import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record awx(alr e, Optional<Float> f) {
   public static final Codec<awx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alr.a.fieldOf("sound_id").forGetter(awx::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awx::b)).apply($$0, awx::a)
   );
   public static final Codec<jg<awx>> b = aln.a(mi.ap, a);
   public static final ze<ByteBuf, awx> c = ze.a(alr.b, awx::a, zc.l.a(zc::a), awx::b, awx::a);
   public static final ze<wp, jg<awx>> d = zc.a(mi.ap, c);

   private static awx a(alr $$0, Optional<Float> $$1) {
      return $$1.<awx>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awx a(alr $$0) {
      return new awx($$0, Optional.empty());
   }

   public static awx a(alr $$0, float $$1) {
      return new awx($$0, Optional.of($$1));
   }

   public float a(float $$0) {
      return this.f.orElse($$0 > 1.0F ? 16.0F * $$0 : 16.0F);
   }

   public alr a() {
      return this.e;
   }

   public Optional<Float> b() {
      return this.f;
   }
}
