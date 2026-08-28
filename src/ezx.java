import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezx(fae b, String c, float d) implements ezv {
   public static final MapCodec<ezx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               faf.a.fieldOf("target").forGetter(ezx::c),
               Codec.STRING.fieldOf("score").forGetter(ezx::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(ezx::e)
            )
            .apply($$0, ezx::new)
   );

   @Override
   public ezu b() {
      return ezw.e;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.b();
   }

   public static ezx a(evq.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ezx a(evq.b $$0, String $$1, float $$2) {
      return new ezx(fab.a($$0), $$1, $$2);
   }

   @Override
   public float b(evq $$0) {
      fcd $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fce $$2 = $$0.d().g();
         fbw $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fca $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fae c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
