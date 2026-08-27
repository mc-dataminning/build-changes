import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dav extends daa {
   public static final MapCodec<dav> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgq.a.fieldOf("wood_type").forGetter(daa::d), t()).apply($$0, dav::new));
   public static final dgd b = dft.ba;

   @Override
   public MapCodec<dav> a() {
      return a;
   }

   public dav(dgq $$0, dfc.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dgj.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eah.c));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !this.a($$0, $$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfd $$0) {
      return dgj.b($$0.c(b));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, f);
   }
}
