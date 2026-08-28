import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyw<T extends cxr> implements cyo<T> {
   private final cxr.a<T> x;
   private final MapCodec<T> y;
   private final ys<wf, T> z;

   public cyw(cxr.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  cxx.d.fieldOf("category").orElse(cxx.c).forGetter($$0xx -> $$0xx.b),
                  cyg.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cud.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = ys.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.y;
   }

   @Override
   public ys<wf, T> b() {
      return this.z;
   }

   private T a(wf $$0) {
      String $$1 = $$0.p();
      cxx $$2 = $$0.b(cxx.class);
      cyg $$3 = cyg.b.decode($$0);
      cud $$4 = cud.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wf $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cyg.b.encode($$0, $$1.d);
      cud.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cxr a(String $$0, cxx $$1, cyg $$2, cud $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
