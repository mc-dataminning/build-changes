import com.mojang.serialization.MapCodec;

public class dow extends djw {
   public static final MapCodec<dow> a = b(dow::new);
   public static final int b = 3;
   public static final dxw c = dxn.av;
   private static final fbu[] d = new fbu[]{
      djm.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   protected dow(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(djo.ej);
   }

   @Override
   protected boolean f(dwx $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(cwt.tg);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c);
   }
}
