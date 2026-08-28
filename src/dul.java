import com.mojang.serialization.MapCodec;

public class dul extends dmr {
   public static final MapCodec<dul> b = b(dul::new);
   public static final ebk c = ebj.E;

   @Override
   protected MapCodec<? extends dul> a() {
      return b;
   }

   protected dul(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == jb.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eat a(ddg $$0) {
      eat $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(eat $$0) {
      return $$0.a(axc.bC);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }
}
