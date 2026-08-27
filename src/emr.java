import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record emr(emx b, String c, float d) implements emp {
   public static final Codec<emr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emy.a.fieldOf("target").forGetter(emr::c),
               Codec.STRING.fieldOf("score").forGetter(emr::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(emr::e)
            )
            .apply($$0, emr::new)
   );

   @Override
   public emo b() {
      return emq.e;
   }

   @Override
   public Set<eld<?>> a() {
      return this.b.b();
   }

   public static emr a(eiv.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static emr a(eiv.b $$0, String $$1, float $$2) {
      return new emr(emu.a($$0), $$1, $$2);
   }

   @Override
   public float b(eiv $$0) {
      eov $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eow $$2 = $$0.d().f();
         eoo $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            eos $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public emx c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
