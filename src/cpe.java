import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cpe<T extends coa> implements cox<T> {
   private final cpe.a<T> x;
   private final Codec<T> y;

   public cpe(cpe.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  asy.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cog.d.fieldOf("category").orElse(cog.c).forGetter($$0xx -> $$0xx.b),
                  coq.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  kc.i.q().xmap(clo::new, clo::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
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

   public T b(ty $$0) {
      String $$1 = $$0.s();
      cog $$2 = $$0.b(cog.class);
      coq $$3 = coq.b($$0);
      clo $$4 = $$0.r();
      float $$5 = $$0.readFloat();
      int $$6 = $$0.n();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ty $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   interface a<T extends coa> {
      T create(String var1, cog var2, coq var3, clo var4, float var5, int var6);
   }
}
