import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cor<T extends cnn> implements coj<T> {
   private final cor.a<T> x;
   private final Codec<T> y;

   public cor(cor.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  asq.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cnt.d.fieldOf("category").orElse(cnt.c).forGetter($$0xx -> $$0xx.b),
                  coc.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  jy.i.q().xmap(clb::new, clb::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
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

   public T b(tu $$0) {
      String $$1 = $$0.s();
      cnt $$2 = $$0.b(cnt.class);
      coc $$3 = coc.b($$0);
      clb $$4 = $$0.r();
      float $$5 = $$0.readFloat();
      int $$6 = $$0.n();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(tu $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   interface a<T extends cnn> {
      T create(String var1, cnt var2, coc var3, clb var4, float var5, int var6);
   }
}
