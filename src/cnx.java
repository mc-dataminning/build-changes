import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cnx<T extends cmv> implements cnq<T> {
   private final cnx.a<T> x;
   private final Codec<T> y;

   public cnx(cnx.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  asg.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cnb.d.fieldOf("category").orElse(cnb.c).forGetter($$0xx -> $$0xx.b),
                  cnk.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  jy.i.q().xmap(ckj::new, ckj::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
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

   public T b(tl $$0) {
      String $$1 = $$0.s();
      cnb $$2 = $$0.b(cnb.class);
      cnk $$3 = cnk.b($$0);
      ckj $$4 = $$0.r();
      float $$5 = $$0.readFloat();
      int $$6 = $$0.n();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(tl $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   interface a<T extends cmv> {
      T create(String var1, cnb var2, cnk var3, ckj var4, float var5, int var6);
   }
}
