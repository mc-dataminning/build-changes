import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlt extends dky {
   public static final MapCodec<dlt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dso.a.fieldOf("wood_type").forGetter(dky::d), u()).apply($$0, dlt::new));
   public static final dsb b = drr.ba;

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dso $$0, dra.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Integer.valueOf(dsh.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == emv.c));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.a && !this.a($$0, $$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drb $$0) {
      return dsh.b($$0.c(b));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, f);
   }
}
