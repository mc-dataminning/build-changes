import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxp<T extends cwm> implements cxh<T> {
   private final cwm.a<T> x;
   private final Codec<T> y;
   private final ys<wf, T> z;

   public cxp(cwm.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  axh.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cws.d.fieldOf("category").orElse(cws.c).forGetter($$0xx -> $$0xx.b),
                  cxa.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  csz.b.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = ys.a(this::a, this::a);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public ys<wf, T> b() {
      return this.z;
   }

   private T a(wf $$0) {
      String $$1 = $$0.p();
      cws $$2 = $$0.b(cws.class);
      cxa $$3 = cxa.b.decode($$0);
      csz $$4 = csz.f.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wf $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cxa.b.encode($$0, $$1.d);
      csz.f.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cwm a(String $$0, cws $$1, cxa $$2, csz $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
