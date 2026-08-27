import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ctz<T extends csw> implements ctr<T> {
   private final csw.a<T> x;
   private final Codec<T> y;
   private final xs<vf, T> z;

   public ctz(csw.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  awe.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  ctc.d.fieldOf("category").orElse(ctc.c).forGetter($$0xx -> $$0xx.b),
                  ctk.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  ki.h.q().xmap(cqk::new, cqk::d).fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = xs.a(this::a, this::a);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public xs<vf, T> b() {
      return this.z;
   }

   private T a(vf $$0) {
      String $$1 = $$0.p();
      ctc $$2 = $$0.b(ctc.class);
      ctk $$3 = ctk.b.decode($$0);
      cqk $$4 = cqk.f.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(vf $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      ctk.b.encode($$0, $$1.d);
      cqk.f.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public csw a(String $$0, ctc $$1, ctk $$2, cqk $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
