import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egc(egi b, String c, float d) implements ega {
   public static final Codec<egc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egj.a.fieldOf("target").forGetter(egc::c),
               Codec.STRING.fieldOf("score").forGetter(egc::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(egc::e)
            )
            .apply($$0, egc::new)
   );

   @Override
   public efz b() {
      return egb.e;
   }

   @Override
   public Set<eeo<?>> a() {
      return this.b.b();
   }

   public static egc a(ecg.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static egc a(ecg.b $$0, String $$1, float $$2) {
      return new egc(egf.a($$0), $$1, $$2);
   }

   @Override
   public float b(ecg $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eic $$2 = $$0.d().f();
         ehz $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public egi c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
