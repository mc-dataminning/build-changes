import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbm<T extends dah> implements dbf<T> {
   private final dah.a<T> w;
   private final MapCodec<T> x;
   private final zh<wu, T> y;

   public dbm(dah.a<T> $$0, int $$1) {
      this.w = $$0;
      this.x = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  dan.d.fieldOf("category").orElse(dan.c).forGetter($$0xx -> $$0xx.b),
                  daw.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cwm.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.y = zh.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public zh<wu, T> b() {
      return this.y;
   }

   private T a(wu $$0) {
      String $$1 = $$0.p();
      dan $$2 = $$0.b(dan.class);
      daw $$3 = daw.a.decode($$0);
      cwm $$4 = cwm.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.w.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wu $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      daw.a.encode($$0, $$1.d);
      cwm.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public dah a(String $$0, dan $$1, daw $$2, cwm $$3, float $$4, int $$5) {
      return this.w.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
