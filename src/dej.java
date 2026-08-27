import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dej extends ddo {
   public static final MapCodec<dej> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkt.a.fieldOf("wood_type").forGetter(ddo::d), u()).apply($$0, dej::new));
   public static final dkg b = djw.ba;

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   public dej(dkt $$0, djf.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dkm.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eer.c));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !this.a($$0, $$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djg $$0) {
      return dkm.b($$0.c(b));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, f);
   }
}
