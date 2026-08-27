import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ehe(ehk b, String c, float d) implements ehc {
   public static final Codec<ehe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehl.a.fieldOf("target").forGetter(ehe::c),
               Codec.STRING.fieldOf("score").forGetter(ehe::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(ehe::e)
            )
            .apply($$0, ehe::new)
   );

   @Override
   public ehb b() {
      return ehd.e;
   }

   @Override
   public Set<efq<?>> a() {
      return this.b.b();
   }

   public static ehe a(edi.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ehe a(edi.b $$0, String $$1, float $$2) {
      return new ehe(ehh.a($$0), $$1, $$2);
   }

   @Override
   public float b(edi $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eje $$2 = $$0.d().f();
         ejb $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public ehk c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
