import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdo(fdv b, String c, float d) implements fdm {
   public static final MapCodec<fdo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fdw.a.fieldOf("target").forGetter(fdo::c),
               Codec.STRING.fieldOf("score").forGetter(fdo::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(fdo::e)
            )
            .apply($$0, fdo::new)
   );

   @Override
   public fdl b() {
      return fdn.e;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.b();
   }

   public static fdo a(ezh.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static fdo a(ezh.b $$0, String $$1, float $$2) {
      return new fdo(fds.a($$0), $$1, $$2);
   }

   @Override
   public float b(ezh $$0) {
      ffu $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ffv $$2 = $$0.d().g();
         ffn $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ffr $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fdv c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
