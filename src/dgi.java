import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgi extends dfn {
   public static final MapCodec<dgi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dms.a.fieldOf("wood_type").forGetter(dfn::d), u()).apply($$0, dgi::new));
   public static final dmf b = dlv.ba;

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   public dgi(dms $$0, dle.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dml.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == egq.c));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !this.a($$0, $$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dlf $$0) {
      return dml.b($$0.c(b));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, f);
   }
}
