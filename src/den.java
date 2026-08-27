import com.mojang.serialization.MapCodec;

public class den extends cws implements cwm {
   public static final MapCodec<den> a = b(den::new);
   protected static final float b = 6.0F;
   protected static final emf c = cwj.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<den> a() {
      return a;
   }

   protected den(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return true;
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      cyr $$4 = (cyr)($$3.a(cwl.bu) ? cwl.iI : cwl.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         cyr.a($$0, $$4.o(), $$2, 2);
      }
   }
}
