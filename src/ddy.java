import com.mojang.serialization.MapCodec;

public class ddy extends cwp {
   public static final MapCodec<ddy> b = b(ddy::new);
   public static final djx c = djw.z;

   @Override
   protected MapCodec<? extends ddy> a() {
      return b;
   }

   protected ddy(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == ic.b ? $$0.a(c, Boolean.valueOf(h($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djg a(cpg $$0) {
      djg $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(h($$1)));
   }

   private static boolean h(djg $$0) {
      return $$0.a(asg.by);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }
}
