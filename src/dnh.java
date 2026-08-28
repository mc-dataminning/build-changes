import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnh extends dey {
   public static final MapCodec<dnh> a = b(dnh::new);
   public static final dss b = dsr.B;

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dsa.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dsb a(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbx $$0, iz $$1, dbp $$2) {
      if (!$$0.B) {
         cjh $$3 = new cjh($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.u();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dbx $$0, iz $$1) {
      a($$0, $$1, null);
   }

   private static void a(dbx $$0, iz $$1, @Nullable bto $$2) {
      if (!$$0.B) {
         cjh $$3 = new cjh($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.du(), $$3.dw(), $$3.dA(), avz.zv, awa.e, 1.0F, 1.0F);
         $$0.a($$2, dwu.I, $$1);
      }
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if (!$$0.a(cur.os) && !$$0.a(cur.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dfa.a.o(), 11);
         cuj $$7 = $$0.g();
         if (!$$4.f()) {
            if ($$0.a(cur.os)) {
               $$0.a(1, $$4, bto.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(awj.c.b($$7));
         return bqv.a($$2.B);
      }
   }

   @Override
   protected void a(dbx $$0, dsb $$1, evm $$2, cno $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         bst $$5 = $$3.s();
         if ($$3.bQ() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bto ? (bto)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dbp $$0) {
      return false;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }
}
