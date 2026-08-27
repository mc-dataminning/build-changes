import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cuc extends czm implements dab {
   public static final MapCodec<cuc> a = b(cuc::new);
   public static final dfu b = dft.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final eia e = ctc.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eia f = ctc.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eia g = ctc.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<cuc> a() {
      return a;
   }

   public cuc(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ha.a.b));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      switch ((ha.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eah.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(b) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
