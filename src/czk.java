import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czk<T extends cyf> implements czc<T> {
   private final cyf.a<T> x;
   private final MapCodec<T> y;
   private final yw<wj, T> z;

   public czk(cyf.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  cyl.d.fieldOf("category").orElse(cyl.c).forGetter($$0xx -> $$0xx.b),
                  cyu.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cuo.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = yw.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.y;
   }

   @Override
   public yw<wj, T> b() {
      return this.z;
   }

   private T a(wj $$0) {
      String $$1 = $$0.p();
      cyl $$2 = $$0.b(cyl.class);
      cyu $$3 = cyu.b.decode($$0);
      cuo $$4 = cuo.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wj $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cyu.b.encode($$0, $$1.d);
      cuo.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cyf a(String $$0, cyl $$1, cyu $$2, cuo $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
