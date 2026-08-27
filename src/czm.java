import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czm<T extends cyh> implements cze<T> {
   private final cyh.a<T> a;
   private final Codec<T> A;
   private final zc<wp, T> B;

   public czm(cyh.a<T> $$0, int $$1) {
      this.a = $$0;
      this.A = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  axu.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cyn.d.fieldOf("category").orElse(cyn.c).forGetter($$0xx -> $$0xx.b),
                  cyv.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  cuh.b.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.B = zc.a(this::a, this::a);
   }

   @Override
   public Codec<T> a() {
      return this.A;
   }

   @Override
   public zc<wp, T> b() {
      return this.B;
   }

   private T a(wp $$0) {
      String $$1 = $$0.p();
      cyn $$2 = $$0.b(cyn.class);
      cyv $$3 = cyv.b.decode($$0);
      cuh $$4 = cuh.f.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.a.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(wp $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cyv.b.encode($$0, $$1.d);
      cuh.f.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cyh a(String $$0, cyn $$1, cyv $$2, cuh $$3, float $$4, int $$5) {
      return this.a.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
