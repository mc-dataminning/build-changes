import com.mojang.serialization.MapCodec;

public class dra extends dnc implements dun {
   public static final MapCodec<dra> a = b(dra::new);
   public static final ebv b = ebu.I;
   private static final fgk c = dnc.b(8.0, 0.0, 8.0);

   public dra(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dra> a() {
      return a;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(b) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(exp.c)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
