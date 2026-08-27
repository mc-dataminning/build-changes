import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqw<T extends cpt> implements cqo<T> {
   private final cpt.a<T> x;
   private final Codec<T> y;

   public cqw(cpt.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  atx.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cpz.d.fieldOf("category").orElse(cpz.c).forGetter($$0xx -> $$0xx.b),
                  cqh.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  kd.h.q().xmap(cng::new, cng::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(uj $$0) {
      String $$1 = $$0.s();
      cpz $$2 = $$0.b(cpz.class);
      cqh $$3 = cqh.b($$0);
      cng $$4 = $$0.r();
      float $$5 = $$0.readFloat();
      int $$6 = $$0.n();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(uj $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cpt a(String $$0, cpz $$1, cqh $$2, cng $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
