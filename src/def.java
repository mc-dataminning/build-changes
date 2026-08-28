import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class def extends dib {
   public static final MapCodec<def> a = b(def::new);
   public static final dtb b = djb.aE;
   private static final ews c = dff.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ews d = dff.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ews e = dff.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ews f = dff.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ews g = dff.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ews h = dff.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ews i = dff.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ews j = ewp.a(c, d, e, f);
   private static final ews k = ewp.a(c, g, h, i);
   private static final wu l = wu.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avp.aC);
         return bqd.c;
      }
   }

   @Nullable
   @Override
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      return new bqn(($$2x, $$3, $$4) -> new cpg($$2x, $$3, cpq.a($$1, $$2)), l);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      jf $$4 = $$0.c(b);
      return $$4.o() == jf.a.a ? j : k;
   }

   @Override
   protected void a(ciq $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, dsh $$3, ciq $$4) {
      if (!$$4.aW()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dcd $$0, ja $$1, ciq $$2) {
      if (!$$2.aW()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bqw a(bsd $$0) {
      return $$0.dQ().b($$0);
   }

   @Nullable
   public static dsh e(dsh $$0) {
      if ($$0.a(dfh.gS)) {
         return dfh.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dfh.gT) ? dfh.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   public int b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
