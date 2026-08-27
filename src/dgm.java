import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgm extends dfr {
   public static final MapCodec<dgm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmw.a.fieldOf("wood_type").forGetter(dfr::d), u()).apply($$0, dgm::new));
   public static final dmj b = dlz.ba;

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dgm(dmw $$0, dli.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dmp.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == egx.c));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !this.a($$0, $$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dlj $$0) {
      return dmp.b($$0.c(b));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, f);
   }
}
