import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czi<T extends cyf> implements cza<T> {
   private final cyf.a<T> x;
   private final MapCodec<T> y;
   private final zn<xa, T> z;

   public czi(cyf.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  cyl.d.fieldOf("category").orElse(cyl.c).forGetter($$0xx -> $$0xx.b),
                  cyt.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cuq.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = zn.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.y;
   }

   @Override
   public zn<xa, T> b() {
      return this.z;
   }

   private T a(xa $$0) {
      String $$1 = $$0.p();
      cyl $$2 = $$0.b(cyl.class);
      cyt $$3 = cyt.b.decode($$0);
      cuq $$4 = cuq.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(xa $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cyt.b.encode($$0, $$1.d);
      cuq.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cyf a(String $$0, cyl $$1, cyt $$2, cuq $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
