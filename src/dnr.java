import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnr extends dfi {
   public static final MapCodec<dnr> a = b(dnr::new);
   public static final dtc b = dtb.B;

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   public dnr(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dsl a(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcg $$0, ja $$1, dby $$2) {
      if (!$$0.B) {
         ciw $$3 = new ciw($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.t();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dcg $$0, ja $$1) {
      a($$0, $$1, null);
   }

   private static void a(dcg $$0, ja $$1, @Nullable btc $$2) {
      if (!$$0.B) {
         ciw $$3 = new ciw($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dw(), $$3.dy(), $$3.dC(), avh.zy, avi.e, 1.0F, 1.0F);
         $$0.a($$2, dxh.I, $$1);
      }
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if (!$$0.a(cug.os) && !$$0.a(cug.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dfk.a.o(), 11);
         cty $$7 = $$0.g();
         if ($$0.a(cug.os)) {
            $$0.a(1, $$4, btc.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(avr.c.b($$7));
         return bqj.a($$2.B);
      }
   }

   @Override
   protected void a(dcg $$0, dsl $$1, ewd $$2, cnd $$3) {
      if (!$$0.B) {
         ja $$4 = $$2.a();
         bsh $$5 = $$3.s();
         if ($$3.bS() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof btc ? (btc)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dby $$0) {
      return false;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }
}
