import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdv(fec b, String c, float d) implements fdt {
   public static final MapCodec<fdv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fed.a.fieldOf("target").forGetter(fdv::c),
               Codec.STRING.fieldOf("score").forGetter(fdv::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(fdv::e)
            )
            .apply($$0, fdv::new)
   );

   @Override
   public fds b() {
      return fdu.e;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.b();
   }

   public static fdv a(ezo.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static fdv a(ezo.b $$0, String $$1, float $$2) {
      return new fdv(fdz.a($$0), $$1, $$2);
   }

   @Override
   public float b(ezo $$0) {
      fgb $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fgc $$2 = $$0.d().g();
         ffu $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ffy $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fec c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
