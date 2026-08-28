import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dag<T extends cza> implements czy<T> {
   private final cza.a<T> w;
   private final MapCodec<T> x;
   private final zb<wo, T> y;

   public dag(cza.a<T> $$0, int $$1) {
      this.w = $$0;
      this.x = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  czg.d.fieldOf("category").orElse(czg.c).forGetter($$0xx -> $$0xx.b),
                  czp.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cvl.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
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
      czg $$2 = $$0.b(czg.class);
      czp $$3 = czp.a.decode($$0);
      cvl $$4 = cvl.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.w.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wo $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      czp.a.encode($$0, $$1.d);
      cvl.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cza a(String $$0, czg $$1, czp $$2, cvl $$3, float $$4, int $$5) {
      return this.w.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
