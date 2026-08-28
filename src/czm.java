import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czm<T extends cyh> implements cze<T> {
   private final cyh.a<T> x;
   private final MapCodec<T> y;
   private final yx<wk, T> z;

   public czm(cyh.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  cyn.d.fieldOf("category").orElse(cyn.c).forGetter($$0xx -> $$0xx.b),
                  cyw.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cuq.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = yx.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.y;
   }

   @Override
   public yx<wk, T> b() {
      return this.z;
   }

   private T a(wk $$0) {
      String $$1 = $$0.p();
      cyn $$2 = $$0.b(cyn.class);
      cyw $$3 = cyw.b.decode($$0);
      cuq $$4 = cuq.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wk $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cyw.b.encode($$0, $$1.d);
      cuq.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cyh a(String $$0, cyn $$1, cyw $$2, cuq $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
