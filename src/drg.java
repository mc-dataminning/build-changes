import com.mojang.serialization.MapCodec;

public class drg extends dme {
   public static final MapCodec<drg> a = b(drg::new);
   public static final int b = 3;
   public static final eao c = eae.av;
   private static final feq[] d = dlu.a(3, $$0 -> dlu.b(16.0, 0.0, (double)(5 + $$0 * 3)));

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   protected drg(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a(dlw.ej);
   }

   @Override
   protected boolean f(dzo $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys(cyw.tk);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }
}
