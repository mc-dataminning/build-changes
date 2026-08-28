import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsk extends drp {
   public static final MapCodec<dsk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzh.a.fieldOf("wood_type").forGetter(drp::d), t()).apply($$0, dsk::new));
   public static final dyu b = dyl.bb;

   @Override
   public MapCodec<dsk> a() {
      return a;
   }

   public dsk(dzh $$0, dxu.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dza.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == ety.c));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxv $$0) {
      return dza.b($$0.c(b));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, f);
   }
}
