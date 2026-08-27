import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmt<T extends clr> implements cmm<T> {
   private final cmt.a<T> x;
   private final Codec<T> y;

   public cmt(cmt.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  arf.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  clx.d.fieldOf("category").orElse(clx.c).forGetter($$0xx -> $$0xx.b),
                  cmg.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  jb.i.q().xmap(cjf::new, cjf::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
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

   public T b(so $$0) {
      String $$1 = $$0.r();
      clx $$2 = $$0.b(clx.class);
      cmg $$3 = cmg.b($$0);
      cjf $$4 = $$0.q();
      float $$5 = $$0.readFloat();
      int $$6 = $$0.m();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(so $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   interface a<T extends clr> {
      T create(String var1, clx var2, cmg var3, cjf var4, float var5, int var6);
   }
}
