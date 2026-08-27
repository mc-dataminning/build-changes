import com.mojang.serialization.MapCodec;

public class dcj extends cva {
   public static final MapCodec<dcj> b = b(dcj::new);
   public static final dhz c = dhy.z;

   @Override
   protected MapCodec<? extends dcj> a() {
      return b;
   }

   protected dcj(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == hx.b ? $$0.a(c, Boolean.valueOf(h($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(h($$1)));
   }

   private static boolean h(dhi $$0) {
      return $$0.a(arg.by);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }
}
