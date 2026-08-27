import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eih(ein b, String c, float d) implements eif {
   public static final Codec<eih> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eio.a.fieldOf("target").forGetter(eih::c),
               Codec.STRING.fieldOf("score").forGetter(eih::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eih::e)
            )
            .apply($$0, eih::new)
   );

   @Override
   public eie b() {
      return eig.e;
   }

   @Override
   public Set<egt<?>> a() {
      return this.b.b();
   }

   public static eih a(eel.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eih a(eel.b $$0, String $$1, float $$2) {
      return new eih(eik.a($$0), $$1, $$2);
   }

   @Override
   public float b(eel $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ekh $$2 = $$0.d().f();
         eke $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public ein c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
