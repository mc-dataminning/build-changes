import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyv<T extends cxq> implements cyn<T> {
   private final cxq.a<T> x;
   private final MapCodec<T> y;
   private final ys<wf, T> z;

   public cyv(cxq.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  cxw.d.fieldOf("category").orElse(cxw.c).forGetter($$0xx -> $$0xx.b),
                  cyf.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cuc.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
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
      cxw $$2 = $$0.b(cxw.class);
      cyf $$3 = cyf.b.decode($$0);
      cuc $$4 = cuc.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wf $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cyf.b.encode($$0, $$1.d);
      cuc.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cxq a(String $$0, cxw $$1, cyf $$2, cuc $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
