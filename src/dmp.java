import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmp extends dlu {
   public static final MapCodec<dmp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtk.a.fieldOf("wood_type").forGetter(dlu::d), u()).apply($$0, dmp::new));
   public static final dsx b = dsn.ba;

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(dtk $$0, drw.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Integer.valueOf(dtd.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == enr.c));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.a($$0, $$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drx $$0) {
      return dtd.b($$0.c(b));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, f);
   }
}
