import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqo<T extends cpl> implements cqg<T> {
   private final cpl.a<T> x;
   private final Codec<T> y;

   public cqo(cpl.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  atw.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cpr.d.fieldOf("category").orElse(cpr.c).forGetter($$0xx -> $$0xx.b),
                  cpz.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  kd.h.q().xmap(cmy::new, cmy::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
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

   public T b(ui $$0) {
      String $$1 = $$0.s();
      cpr $$2 = $$0.b(cpr.class);
      cpz $$3 = cpz.b($$0);
      cmy $$4 = $$0.r();
      float $$5 = $$0.readFloat();
      int $$6 = $$0.n();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ui $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cpl a(String $$0, cpr $$1, cpz $$2, cmy $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
