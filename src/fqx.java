import javax.annotation.Nullable;

public class fqx extends fqe<bwi, fcy<bwi>> {
   private static final acq a = new acq("textures/" + fkj.i.b().a() + ".png");
   private static final acq[] i = fkj.j.stream().map($$0 -> new acq("textures/" + $$0.b().a() + ".png")).toArray(acq[]::new);

   public fqx(foy.a $$0) {
      super($$0, new fcy<>($$0.a(fed.be)), 0.0F);
      this.a(new ftj(this));
   }

   public eei a(bwi $$0, float $$1) {
      return $$0.E($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(bwi $$0, fmw $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.E(0.0F).filter($$2x -> {
         bfn<?> $$3x = $$0.ae();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         eei $$6 = eei.c($$0.di());
         return $$1.a(new eed($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public acq a(bwi $$0) {
      return a($$0.fZ());
   }

   public static acq a(@Nullable cen $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(bwi $$0, eij $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.w().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
