import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dau<T extends czo> implements dam<T> {
   private final czo.a<T> w;
   private final MapCodec<T> x;
   private final zb<wo, T> y;

   public dau(czo.a<T> $$0, int $$1) {
      this.w = $$0;
      this.x = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  czu.d.fieldOf("category").orElse(czu.c).forGetter($$0xx -> $$0xx.b),
                  dad.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cvp.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.y = zb.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public zb<wo, T> b() {
      return this.y;
   }

   private T a(wo $$0) {
      String $$1 = $$0.p();
      czu $$2 = $$0.b(czu.class);
      dad $$3 = dad.a.decode($$0);
      cvp $$4 = cvp.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.w.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wo $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      dad.a.encode($$0, $$1.d);
      cvp.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public czo a(String $$0, czu $$1, dad $$2, cvp $$3, float $$4, int $$5) {
      return this.w.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
