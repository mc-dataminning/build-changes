import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cpx<T extends cou> implements cpp<T> {
   private final cou.a<T> x;
   private final Codec<T> y;

   public cpx(cou.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  atg.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cpa.d.fieldOf("category").orElse(cpa.c).forGetter($$0xx -> $$0xx.b),
                  cpi.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  kb.h.q().xmap(cmh::new, cmh::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
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

   public T b(ue $$0) {
      String $$1 = $$0.s();
      cpa $$2 = $$0.b(cpa.class);
      cpi $$3 = cpi.b($$0);
      cmh $$4 = $$0.r();
      float $$5 = $$0.readFloat();
      int $$6 = $$0.n();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ue $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cou a(String $$0, cpa $$1, cpi $$2, cmh $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
