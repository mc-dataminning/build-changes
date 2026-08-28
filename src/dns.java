import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dns extends dmx {
   public static final MapCodec<dns> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dun.a.fieldOf("wood_type").forGetter(dmx::d), u()).apply($$0, dns::new));
   public static final dua b = dtq.ba;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(dun $$0, dsz.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dug.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eoz.c));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !this.a($$0, $$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dta $$0) {
      return dug.b($$0.c(b));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, f);
   }
}
