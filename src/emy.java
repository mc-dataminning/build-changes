import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record emy(ene b, String c, float d) implements emw {
   public static final Codec<emy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enf.a.fieldOf("target").forGetter(emy::c),
               Codec.STRING.fieldOf("score").forGetter(emy::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(emy::e)
            )
            .apply($$0, emy::new)
   );

   @Override
   public emv b() {
      return emx.e;
   }

   @Override
   public Set<elk<?>> a() {
      return this.b.b();
   }

   public static emy a(ejc.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static emy a(ejc.b $$0, String $$1, float $$2) {
      return new emy(enb.a($$0), $$1, $$2);
   }

   @Override
   public float b(ejc $$0) {
      epc $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         epd $$2 = $$0.d().f();
         eov $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            eoz $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public ene c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
