import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cub<T extends csy> implements ctt<T> {
   private final csy.a<T> x;
   private final Codec<T> y;
   private final xs<vf, T> z;

   public cub(csy.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  awe.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cte.d.fieldOf("category").orElse(cte.c).forGetter($$0xx -> $$0xx.b),
                  ctm.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  ki.h.q().xmap(cqm::new, cqm::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = xs.a(this::a, this::a);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public xs<vf, T> b() {
      return this.z;
   }

   private T a(vf $$0) {
      String $$1 = $$0.p();
      cte $$2 = $$0.b(cte.class);
      ctm $$3 = ctm.b.decode($$0);
      cqm $$4 = cqm.f.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(vf $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      ctm.b.encode($$0, $$1.d);
      cqm.f.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public csy a(String $$0, cte $$1, ctm $$2, cqm $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
