import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvv<T extends cus> implements cvn<T> {
   private final cus.a<T> x;
   private final Codec<T> y;
   private final ye<vr, T> z;

   public cvv(cus.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  aws.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cuy.d.fieldOf("category").orElse(cuy.c).forGetter($$0xx -> $$0xx.b),
                  cvg.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  kr.h.q().xmap(crj::new, crj::f).fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = ye.a(this::a, this::a);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public ye<vr, T> b() {
      return this.z;
   }

   private T a(vr $$0) {
      String $$1 = $$0.p();
      cuy $$2 = $$0.b(cuy.class);
      cvg $$3 = cvg.b.decode($$0);
      crj $$4 = crj.f.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(vr $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cvg.b.encode($$0, $$1.d);
      crj.f.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cus a(String $$0, cuy $$1, cvg $$2, crj $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
