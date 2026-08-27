import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record enu(eoa b, String c, float d) implements ens {
   public static final Codec<enu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eob.a.fieldOf("target").forGetter(enu::c),
               Codec.STRING.fieldOf("score").forGetter(enu::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(enu::e)
            )
            .apply($$0, enu::new)
   );

   @Override
   public enr b() {
      return ent.e;
   }

   @Override
   public Set<emg<?>> a() {
      return this.b.b();
   }

   public static enu a(ejy.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static enu a(ejy.b $$0, String $$1, float $$2) {
      return new enu(enx.a($$0), $$1, $$2);
   }

   @Override
   public float b(ejy $$0) {
      epy $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         epz $$2 = $$0.d().f();
         epr $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            epv $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eoa c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
