import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dek extends ddp {
   public static final MapCodec<dek> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dku.a.fieldOf("wood_type").forGetter(ddp::d), u()).apply($$0, dek::new));
   public static final dkh b = djx.ba;

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   public dek(dku $$0, djg.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dkn.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == ees.c));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !this.a($$0, $$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djh $$0) {
      return dkn.b($$0.c(b));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, f);
   }
}
