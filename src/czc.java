import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czc<T extends cxz> implements cyu<T> {
   private final cxz.a<T> x;
   private final MapCodec<T> y;
   private final zj<ww, T> z;

   public czc(cxz.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  cyf.d.fieldOf("category").orElse(cyf.c).forGetter($$0xx -> $$0xx.b),
                  cyn.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cuk.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = zj.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.y;
   }

   @Override
   public zj<ww, T> b() {
      return this.z;
   }

   private T a(ww $$0) {
      String $$1 = $$0.p();
      cyf $$2 = $$0.b(cyf.class);
      cyn $$3 = cyn.b.decode($$0);
      cuk $$4 = cuk.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(ww $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cyn.b.encode($$0, $$1.d);
      cuk.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cxz a(String $$0, cyf $$1, cyn $$2, cuk $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
