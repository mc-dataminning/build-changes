import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ese(esk b, String c, float d) implements esc {
   public static final Codec<ese> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               esl.a.fieldOf("target").forGetter(ese::c),
               Codec.STRING.fieldOf("score").forGetter(ese::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(ese::e)
            )
            .apply($$0, ese::new)
   );

   @Override
   public esb b() {
      return esd.e;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.b.b();
   }

   public static ese a(eoa.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ese a(eoa.b $$0, String $$1, float $$2) {
      return new ese(esh.a($$0), $$1, $$2);
   }

   @Override
   public float b(eoa $$0) {
      eui $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         euj $$2 = $$0.d().f();
         eub $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            euf $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public esk c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
