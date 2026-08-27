import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record elb(elh b, String c, float d) implements ekz {
   public static final Codec<elb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eli.a.fieldOf("target").forGetter(elb::c),
               Codec.STRING.fieldOf("score").forGetter(elb::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(elb::e)
            )
            .apply($$0, elb::new)
   );

   @Override
   public eky b() {
      return ela.e;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.b.b();
   }

   public static elb a(ehf.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static elb a(ehf.b $$0, String $$1, float $$2) {
      return new elb(ele.a($$0), $$1, $$2);
   }

   @Override
   public float b(ehf $$0) {
      enf $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eng $$2 = $$0.d().f();
         emy $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            enc $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public elh c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
