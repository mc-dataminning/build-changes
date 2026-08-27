import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmv<T extends clt> implements cmo<T> {
   private final cmv.a<T> x;
   private final Codec<T> y;

   public cmv(cmv.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  arh.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  clz.d.fieldOf("category").orElse(clz.c).forGetter($$0xx -> $$0xx.b),
                  cmi.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  jd.i.q().xmap(cjh::new, cjh::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
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

   public T b(sq $$0) {
      String $$1 = $$0.r();
      clz $$2 = $$0.b(clz.class);
      cmi $$3 = cmi.b($$0);
      cjh $$4 = $$0.q();
      float $$5 = $$0.readFloat();
      int $$6 = $$0.m();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(sq $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   interface a<T extends clt> {
      T create(String var1, clz var2, cmi var3, cjh var4, float var5, int var6);
   }
}
