import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgz extends dge {
   public static final MapCodec<dgz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dnr.a.fieldOf("wood_type").forGetter(dge::d), u()).apply($$0, dgz::new));
   public static final dne b = dmu.ba;

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public dgz(dnr $$0, dmd.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dnk.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == ehs.c));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.a($$0, $$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dme $$0) {
      return dnk.b($$0.c(b));
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, f);
   }
}
