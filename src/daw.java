import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class daw<T extends czq> implements dao<T> {
   private final czq.a<T> w;
   private final MapCodec<T> x;
   private final zf<ws, T> y;

   public daw(czq.a<T> $$0, int $$1) {
      this.w = $$0;
      this.x = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  czw.d.fieldOf("category").orElse(czw.c).forGetter($$0xx -> $$0xx.b),
                  daf.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cvx.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.y = zf.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public zf<ws, T> b() {
      return this.y;
   }

   private T a(ws $$0) {
      String $$1 = $$0.p();
      czw $$2 = $$0.b(czw.class);
      daf $$3 = daf.a.decode($$0);
      cvx $$4 = cvx.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.w.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(ws $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      daf.a.encode($$0, $$1.d);
      cvx.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public czq a(String $$0, czw $$1, daf $$2, cvx $$3, float $$4, int $$5) {
      return this.w.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
