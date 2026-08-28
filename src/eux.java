import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eux(eve b, String c, float d) implements euv {
   public static final MapCodec<eux> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               evf.a.fieldOf("target").forGetter(eux::c),
               Codec.STRING.fieldOf("score").forGetter(eux::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eux::e)
            )
            .apply($$0, eux::new)
   );

   @Override
   public euu b() {
      return euw.e;
   }

   @Override
   public Set<eth<?>> a() {
      return this.b.b();
   }

   public static eux a(eqo.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eux a(eqo.b $$0, String $$1, float $$2) {
      return new eux(evb.a($$0), $$1, $$2);
   }

   @Override
   public float b(eqo $$0) {
      exc $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         exd $$2 = $$0.d().f();
         ewv $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ewz $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eve c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
