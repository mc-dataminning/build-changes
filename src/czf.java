import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czf<T extends cyc> implements cyx<T> {
   private final cyc.a<T> x;
   private final MapCodec<T> y;
   private final zm<wz, T> z;

   public czf(cyc.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  cyi.d.fieldOf("category").orElse(cyi.c).forGetter($$0xx -> $$0xx.b),
                  cyq.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cun.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
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
      cyi $$2 = $$0.b(cyi.class);
      cyq $$3 = cyq.b.decode($$0);
      cun $$4 = cun.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wz $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cyq.b.encode($$0, $$1.d);
      cun.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cyc a(String $$0, cyi $$1, cyq $$2, cun $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
