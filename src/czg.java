import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czg<T extends cyd> implements cyy<T> {
   private final cyd.a<T> x;
   private final MapCodec<T> y;
   private final zm<wz, T> z;

   public czg(cyd.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  cyj.d.fieldOf("category").orElse(cyj.c).forGetter($$0xx -> $$0xx.b),
                  cyr.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cuo.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = zm.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.y;
   }

   @Override
   public zm<wz, T> b() {
      return this.z;
   }

   private T a(wz $$0) {
      String $$1 = $$0.p();
      cyj $$2 = $$0.b(cyj.class);
      cyr $$3 = cyr.b.decode($$0);
      cuo $$4 = cuo.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wz $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cyr.b.encode($$0, $$1.d);
      cuo.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cyd a(String $$0, cyj $$1, cyr $$2, cuo $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
