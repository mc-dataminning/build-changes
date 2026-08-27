import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekr(ekx b, String c, float d) implements ekp {
   public static final Codec<ekr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eky.a.fieldOf("target").forGetter(ekr::c),
               Codec.STRING.fieldOf("score").forGetter(ekr::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(ekr::e)
            )
            .apply($$0, ekr::new)
   );

   @Override
   public eko b() {
      return ekq.e;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.b.b();
   }

   public static ekr a(egv.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ekr a(egv.b $$0, String $$1, float $$2) {
      return new ekr(eku.a($$0), $$1, $$2);
   }

   @Override
   public float b(egv $$0) {
      emv $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         emw $$2 = $$0.d().f();
         emo $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ems $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public ekx c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
