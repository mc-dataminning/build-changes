import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddy extends dhu {
   public static final MapCodec<ddy> a = b(ddy::new);
   public static final dsv b = diu.aE;
   private static final ewj c = dey.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ewj d = dey.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ewj e = dey.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ewj f = dey.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ewj g = dey.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ewj h = dey.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ewj i = dey.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ewj j = ewg.a(c, d, e, f);
   private static final ewj k = ewg.a(c, g, h, i);
   private static final xo l = xo.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   public ddy(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.aC);
         return bqt.c;
      }
   }

   @Nullable
   @Override
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      return new brd(($$2x, $$3, $$4) -> new cpv($$2x, $$3, cqe.a($$1, $$2)), l);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      je $$4 = $$0.c(b);
      return $$4.o() == je.a.a ? j : k;
   }

   @Override
   protected void a(cjf $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, dsb $$3, cjf $$4) {
      if (!$$4.aW()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dbx $$0, iz $$1, cjf $$2) {
      if (!$$2.aW()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public brm a(bst $$0) {
      return $$0.dQ().b($$0);
   }

   @Nullable
   public static dsb e(dsb $$0) {
      if ($$0.a(dfa.gS)) {
         return dfa.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dfa.gT) ? dfa.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   public int b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
