import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eks(eky b, String c, float d) implements ekq {
   public static final Codec<eks> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekz.a.fieldOf("target").forGetter(eks::c),
               Codec.STRING.fieldOf("score").forGetter(eks::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eks::e)
            )
            .apply($$0, eks::new)
   );

   @Override
   public ekp b() {
      return ekr.e;
   }

   @Override
   public Set<eje<?>> a() {
      return this.b.b();
   }

   public static eks a(egw.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eks a(egw.b $$0, String $$1, float $$2) {
      return new eks(ekv.a($$0), $$1, $$2);
   }

   @Override
   public float b(egw $$0) {
      emw $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         emx $$2 = $$0.d().f();
         emp $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            emt $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eky c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
