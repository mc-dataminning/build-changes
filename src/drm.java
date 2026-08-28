import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drm extends dqr {
   public static final MapCodec<drm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyj.a.fieldOf("wood_type").forGetter(dqr::d), t()).apply($$0, drm::new));
   public static final dxw b = dxn.bd;

   @Override
   public MapCodec<drm> a() {
      return a;
   }

   public drm(dyj $$0, dww.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dyc.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == eta.c));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwx $$0) {
      return dyc.b($$0.c(b));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, f);
   }
}
