import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmo<T extends clm> implements cmh<T> {
   private final cmo.a<T> x;
   private final Codec<T> y;

   public cmo(cmo.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  arb.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cls.d.fieldOf("category").orElse(cls.c).forGetter($$0xx -> $$0xx.b),
                  cmb.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  jd.i.q().xmap(cja::new, cja::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
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

   public T b(sl $$0) {
      String $$1 = $$0.r();
      cls $$2 = $$0.b(cls.class);
      cmb $$3 = cmb.b($$0);
      cja $$4 = $$0.q();
      float $$5 = $$0.readFloat();
      int $$6 = $$0.m();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(sl $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   interface a<T extends clm> {
      T create(String var1, cls var2, cmb var3, cja var4, float var5, int var6);
   }
}
