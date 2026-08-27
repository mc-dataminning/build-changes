import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cws<T extends cvp> implements cwk<T> {
   private final cvp.a<T> x;
   private final Codec<T> y;
   private final yq<wd, T> z;

   public cws(cvp.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  axe.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cvv.d.fieldOf("category").orElse(cvv.c).forGetter($$0xx -> $$0xx.b),
                  cwd.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  csd.b.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = yq.a(this::a, this::a);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public yq<wd, T> b() {
      return this.z;
   }

   private T a(wd $$0) {
      String $$1 = $$0.p();
      cvv $$2 = $$0.b(cvv.class);
      cwd $$3 = cwd.b.decode($$0);
      csd $$4 = csd.f.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wd $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cwd.b.encode($$0, $$1.d);
      csd.f.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cvp a(String $$0, cvv $$1, cwd $$2, csd $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
