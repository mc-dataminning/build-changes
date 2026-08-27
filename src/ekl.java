import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekl(ekr b, String c, float d) implements ekj {
   public static final Codec<ekl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eks.a.fieldOf("target").forGetter(ekl::c),
               Codec.STRING.fieldOf("score").forGetter(ekl::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(ekl::e)
            )
            .apply($$0, ekl::new)
   );

   @Override
   public eki b() {
      return ekk.e;
   }

   @Override
   public Set<eix<?>> a() {
      return this.b.b();
   }

   public static ekl a(egp.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ekl a(egp.b $$0, String $$1, float $$2) {
      return new ekl(eko.a($$0), $$1, $$2);
   }

   @Override
   public float b(egp $$0) {
      emp $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         emq $$2 = $$0.d().f();
         emi $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            emm $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public ekr c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
