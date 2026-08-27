import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record esn(esu b, String c, float d) implements esl {
   public static final Codec<esn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               esv.a.fieldOf("target").forGetter(esn::c),
               Codec.STRING.fieldOf("score").forGetter(esn::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(esn::e)
            )
            .apply($$0, esn::new)
   );

   @Override
   public esk b() {
      return esm.e;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.b.b();
   }

   public static esn a(eol.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static esn a(eol.b $$0, String $$1, float $$2) {
      return new esn(esr.a($$0), $$1, $$2);
   }

   @Override
   public float b(eol $$0) {
      eus $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eut $$2 = $$0.d().f();
         eul $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            eup $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public esu c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
