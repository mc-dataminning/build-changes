import com.mojang.serialization.MapCodec;

public class dou extends dhj {
   public static final MapCodec<dou> b = b(dou::new);
   public static final dvf c = dve.z;

   @Override
   protected MapCodec<? extends dou> a() {
      return b;
   }

   protected dou(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.b ? $$0.b(c, Boolean.valueOf(o($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public duo a(czk $$0) {
      duo $$1 = $$0.q().a_($$0.a().d());
      return this.o().b(c, Boolean.valueOf(o($$1)));
   }

   private static boolean o(duo $$0) {
      return $$0.a(awt.bA);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }
}
