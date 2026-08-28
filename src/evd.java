import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evd(evk b, String c, float d) implements evb {
   public static final MapCodec<evd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               evl.a.fieldOf("target").forGetter(evd::c),
               Codec.STRING.fieldOf("score").forGetter(evd::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(evd::e)
            )
            .apply($$0, evd::new)
   );

   @Override
   public eva b() {
      return evc.e;
   }

   @Override
   public Set<etn<?>> a() {
      return this.b.b();
   }

   public static evd a(equ.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static evd a(equ.b $$0, String $$1, float $$2) {
      return new evd(evh.a($$0), $$1, $$2);
   }

   @Override
   public float b(equ $$0) {
      exi $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         exj $$2 = $$0.d().f();
         exb $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            exf $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public evk c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
