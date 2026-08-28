import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbc<T extends czw> implements dau<T> {
   private final czw.a<T> w;
   private final MapCodec<T> x;
   private final zg<wt, T> y;

   public dbc(czw.a<T> $$0, int $$1) {
      this.w = $$0;
      this.x = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  dac.d.fieldOf("category").orElse(dac.c).forGetter($$0xx -> $$0xx.b),
                  dal.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cwb.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.y = zg.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public zg<wt, T> b() {
      return this.y;
   }

   private T a(wt $$0) {
      String $$1 = $$0.p();
      dac $$2 = $$0.b(dac.class);
      dal $$3 = dal.a.decode($$0);
      cwb $$4 = cwb.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.w.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wt $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      dal.a.encode($$0, $$1.d);
      cwb.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public czw a(String $$0, dac $$1, dal $$2, cwb $$3, float $$4, int $$5) {
      return this.w.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
