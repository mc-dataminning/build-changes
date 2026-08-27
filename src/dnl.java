import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnl extends dmq {
   public static final MapCodec<dnl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dup.a.fieldOf("wood_type").forGetter(dmq::c), u()).apply($$0, dnl::new));
   public static final duc b = dts.ba;

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   public dnl(dup $$0, dtb.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Integer.valueOf(dui.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == epf.c));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.a && !this.a($$0, $$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dtc $$0) {
      return dui.b($$0.c(b));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, f);
   }
}
