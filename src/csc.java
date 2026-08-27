import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class csc extends cvw {
   public static final MapCodec<csc> a = b(csc::new);
   public static final dfx b = cww.aE;
   private static final eia c = ctc.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eia d = ctc.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eia e = ctc.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eia f = ctc.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eia g = ctc.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eia h = ctc.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eia i = ctc.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eia j = ehx.a(c, d, e, f);
   private static final eia k = ehx.a(c, g, h, i);
   private static final tl l = tl.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<csc> a() {
      return a;
   }

   public csc(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c));
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apq.aC);
         return bhe.b;
      }
   }

   @Nullable
   @Override
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      return new bhm(($$2x, $$3, $$4) -> new cet($$2x, $$3, cfc.a($$1, $$2)), l);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      ha $$4 = $$0.c(b);
      return $$4.o() == ha.a.a ? j : k;
   }

   @Override
   protected void a(bys $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, dfd $$3, bys $$4) {
      if (!$$4.aS()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cqb $$0, gw $$1, bys $$2) {
      if (!$$2.aS()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bhu a(biw $$0) {
      return $$0.dM().b($$0);
   }

   @Nullable
   public static dfd e(dfd $$0) {
      if ($$0.a(cte.gS)) {
         return cte.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cte.gT) ? cte.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public int d(dfd $$0, cph $$1, gw $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
