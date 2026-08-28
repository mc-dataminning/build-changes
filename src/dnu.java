import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnu extends dmz {
   public static final MapCodec<dnu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dup.a.fieldOf("wood_type").forGetter(dmz::d), u()).apply($$0, dnu::new));
   public static final duc b = dts.ba;

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(dup $$0, dtb.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dtc a(cyd $$0) {
      epc $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dui.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == epd.c));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !this.a($$0, $$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dtc $$0) {
      return dui.b($$0.c(b));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, f);
   }
}
