import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dms extends dlx {
   public static final MapCodec<dms> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtn.a.fieldOf("wood_type").forGetter(dlx::d), u()).apply($$0, dms::new));
   public static final dta b = dsq.ba;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   public dms(dtn $$0, drz.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dtg.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == enu.c));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.a($$0, $$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsa $$0) {
      return dtg.b($$0.c(b));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, f);
   }
}
