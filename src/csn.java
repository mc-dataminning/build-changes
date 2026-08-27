import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class csn<T extends crk> implements csf<T> {
   private final crk.a<T> x;
   private final Codec<T> y;
   private final xo<vb, T> z;

   public csn(crk.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  avp.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  crq.d.fieldOf("category").orElse(crq.c).forGetter($$0xx -> $$0xx.b),
                  cry.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  kf.h.q().xmap(coz::new, coz::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = xo.a(this::a, this::a);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public xo<vb, T> b() {
      return this.z;
   }

   private T a(vb $$0) {
      String $$1 = $$0.r();
      crq $$2 = $$0.b(crq.class);
      cry $$3 = cry.b.decode($$0);
      coz $$4 = coz.f.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.n();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(vb $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cry.b.encode($$0, $$1.d);
      coz.f.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public crk a(String $$0, crq $$1, cry $$2, coz $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
