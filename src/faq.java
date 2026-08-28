import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record faq(fax b, String c, float d) implements fao {
   public static final MapCodec<faq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fay.a.fieldOf("target").forGetter(faq::c),
               Codec.STRING.fieldOf("score").forGetter(faq::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(faq::e)
            )
            .apply($$0, faq::new)
   );

   @Override
   public fan b() {
      return fap.e;
   }

   @Override
   public Set<eza<?>> a() {
      return this.b.b();
   }

   public static faq a(ewh.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static faq a(ewh.b $$0, String $$1, float $$2) {
      return new faq(fau.a($$0), $$1, $$2);
   }

   @Override
   public float b(ewh $$0) {
      fcw $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fcx $$2 = $$0.d().g();
         fcp $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fct $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fax c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
