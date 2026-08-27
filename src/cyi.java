import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyi<T extends cxf> implements cya<T> {
   private final cxf.a<T> x;
   private final MapCodec<T> y;
   private final yv<wi, T> z;

   public cyi(cxf.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  cxl.d.fieldOf("category").orElse(cxl.c).forGetter($$0xx -> $$0xx.b),
                  cxt.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  ctq.b.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = yv.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.y;
   }

   @Override
   public yv<wi, T> b() {
      return this.z;
   }

   private T a(wi $$0) {
      String $$1 = $$0.p();
      cxl $$2 = $$0.b(cxl.class);
      cxt $$3 = cxt.b.decode($$0);
      ctq $$4 = ctq.f.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wi $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cxt.b.encode($$0, $$1.d);
      ctq.f.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cxf a(String $$0, cxl $$1, cxt $$2, ctq $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
