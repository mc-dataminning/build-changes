import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbf<T extends daa> implements day<T> {
   private final daa.a<T> w;
   private final MapCodec<T> x;
   private final zj<ww, T> y;

   public dbf(daa.a<T> $$0, int $$1) {
      this.w = $$0;
      this.x = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  dag.d.fieldOf("category").orElse(dag.c).forGetter($$0xx -> $$0xx.b),
                  dap.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cwf.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.y = zj.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public zj<ww, T> b() {
      return this.y;
   }

   private T a(ww $$0) {
      String $$1 = $$0.p();
      dag $$2 = $$0.b(dag.class);
      dap $$3 = dap.a.decode($$0);
      cwf $$4 = cwf.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.w.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(ww $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      dap.a.encode($$0, $$1.d);
      cwf.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public daa a(String $$0, dag $$1, dap $$2, cwf $$3, float $$4, int $$5) {
      return this.w.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
