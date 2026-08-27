import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmz<T extends clx> implements cms<T> {
   private final cmz.a<T> x;
   private final Codec<T> y;

   public cmz(cmz.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  arj.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cmd.d.fieldOf("category").orElse(cmd.c).forGetter($$0xx -> $$0xx.b),
                  cmm.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  jb.i.q().xmap(cjl::new, cjl::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
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
      String $$1 = $$0.s();
      cmd $$2 = $$0.b(cmd.class);
      cmm $$3 = cmm.b($$0);
      cjl $$4 = $$0.r();
      float $$5 = $$0.readFloat();
      int $$6 = $$0.n();
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

   interface a<T extends clx> {
      T create(String var1, cmd var2, cmm var3, cjl var4, float var5, int var6);
   }
}
