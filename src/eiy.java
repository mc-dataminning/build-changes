import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eiy(eje b, String c, float d) implements eiw {
   public static final Codec<eiy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejf.a.fieldOf("target").forGetter(eiy::c),
               Codec.STRING.fieldOf("score").forGetter(eiy::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eiy::e)
            )
            .apply($$0, eiy::new)
   );

   @Override
   public eiv b() {
      return eix.e;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.b.b();
   }

   public static eiy a(efc.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eiy a(efc.b $$0, String $$1, float $$2) {
      return new eiy(ejb.a($$0), $$1, $$2);
   }

   @Override
   public float b(efc $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eky $$2 = $$0.d().f();
         ekv $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public eje c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
