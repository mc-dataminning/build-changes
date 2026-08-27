import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egm(egs b, String c, float d) implements egk {
   public static final Codec<egm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egt.a.fieldOf("target").forGetter(egm::c),
               Codec.STRING.fieldOf("score").forGetter(egm::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(egm::e)
            )
            .apply($$0, egm::new)
   );

   @Override
   public egj b() {
      return egl.e;
   }

   @Override
   public Set<eey<?>> a() {
      return this.b.b();
   }

   public static egm a(ecq.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static egm a(ecq.b $$0, String $$1, float $$2) {
      return new egm(egp.a($$0), $$1, $$2);
   }

   @Override
   public float b(ecq $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eim $$2 = $$0.d().f();
         eij $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public egs c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
