import com.mojang.serialization.MapCodec;

public class dds extends cwj {
   public static final MapCodec<dds> b = b(dds::new);
   public static final djr c = djq.z;

   @Override
   protected MapCodec<? extends dds> a() {
      return b;
   }

   protected dds(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == ic.b ? $$0.a(c, Boolean.valueOf(h($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dja a(cpa $$0) {
      dja $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(h($$1)));
   }

   private static boolean h(dja $$0) {
      return $$0.a(asb.by);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }
}
