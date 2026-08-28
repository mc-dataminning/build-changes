import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgn(je<awm> d, btg e, btg f) implements dgh {
   public static final MapCodec<dgn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound").forGetter(dgn::b),
               btg.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dgn::c),
               btg.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dgn::d)
            )
            .apply($$0, dgn::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      azv $$5 = $$3.dY();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   public je<awm> b() {
      return this.d;
   }

   public btg c() {
      return this.e;
   }

   public btg d() {
      return this.f;
   }
}
