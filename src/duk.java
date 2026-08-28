import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duk extends dtp {
   public static final MapCodec<duk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebv.a.fieldOf("wood_type").forGetter(dtp::d), t()).apply($$0, duk::new));
   public static final ebh b = eax.bd;

   @Override
   public MapCodec<duk> a() {
      return a;
   }

   public duk(ebv $$0, eag.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(ebn.a($$0.i() + 180.0F))).b(d, Boolean.valueOf($$1.a() == ewp.c));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == ja.a && !this.a($$0, $$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eah $$0) {
      return ebn.b($$0.c(b));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, d);
   }
}
