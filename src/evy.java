import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evy(ewf b, String c, float d) implements evw {
   public static final MapCodec<evy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ewg.a.fieldOf("target").forGetter(evy::c),
               Codec.STRING.fieldOf("score").forGetter(evy::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(evy::e)
            )
            .apply($$0, evy::new)
   );

   @Override
   public evv b() {
      return evx.e;
   }

   @Override
   public Set<eui<?>> a() {
      return this.b.b();
   }

   public static evy a(erp.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static evy a(erp.b $$0, String $$1, float $$2) {
      return new evy(ewc.a($$0), $$1, $$2);
   }

   @Override
   public float b(erp $$0) {
      eyd $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eye $$2 = $$0.d().f();
         exw $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            eya $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public ewf c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
