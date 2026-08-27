import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egg(egm b, String c, float d) implements ege {
   public static final Codec<egg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egn.a.fieldOf("target").forGetter(egg::c),
               Codec.STRING.fieldOf("score").forGetter(egg::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(egg::e)
            )
            .apply($$0, egg::new)
   );

   @Override
   public egd b() {
      return egf.e;
   }

   @Override
   public Set<ees<?>> a() {
      return this.b.b();
   }

   public static egg a(eck.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static egg a(eck.b $$0, String $$1, float $$2) {
      return new egg(egj.a($$0), $$1, $$2);
   }

   @Override
   public float b(eck $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eig $$2 = $$0.d().f();
         eid $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public egm c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
