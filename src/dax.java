import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dax<T extends czr> implements dap<T> {
   private final czr.a<T> w;
   private final MapCodec<T> x;
   private final zc<wp, T> y;

   public dax(czr.a<T> $$0, int $$1) {
      this.w = $$0;
      this.x = RecordCodecBuilder.mapCodec(
         $$2 -> $$2.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                  czx.d.fieldOf("category").orElse(czx.c).forGetter($$0xx -> $$0xx.b),
                  dag.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cvs.e.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.y = zc.a(this::a, this::a);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public zc<wp, T> b() {
      return this.y;
   }

   private T a(wp $$0) {
      String $$1 = $$0.p();
      czx $$2 = $$0.b(czx.class);
      dag $$3 = dag.a.decode($$0);
      cvs $$4 = cvs.i.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.w.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wp $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      dag.a.encode($$0, $$1.d);
      cvs.i.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public czr a(String $$0, czx $$1, dag $$2, cvs $$3, float $$4, int $$5) {
      return this.w.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
