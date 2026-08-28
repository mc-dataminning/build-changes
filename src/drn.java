import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drn extends dqs {
   public static final MapCodec<drn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyk.a.fieldOf("wood_type").forGetter(dqs::d), t()).apply($$0, drn::new));
   public static final dxx b = dxo.bd;

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   public drn(dyk $$0, dwx.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dyd.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == etb.c));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwy $$0) {
      return dyd.b($$0.c(b));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, f);
   }
}
