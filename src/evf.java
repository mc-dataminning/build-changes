import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evf(evm b, String c, float d) implements evd {
   public static final MapCodec<evf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               evn.a.fieldOf("target").forGetter(evf::c),
               Codec.STRING.fieldOf("score").forGetter(evf::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(evf::e)
            )
            .apply($$0, evf::new)
   );

   @Override
   public evc b() {
      return eve.e;
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.b();
   }

   public static evf a(eqw.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static evf a(eqw.b $$0, String $$1, float $$2) {
      return new evf(evj.a($$0), $$1, $$2);
   }

   @Override
   public float b(eqw $$0) {
      exk $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         exl $$2 = $$0.d().f();
         exd $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            exh $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public evm c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
