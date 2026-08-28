import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnj extends dfa {
   public static final MapCodec<dnj> a = b(dnj::new);
   public static final dsu b = dst.B;

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   public dnj(dsc.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbz $$0, iz $$1, dbr $$2) {
      if (!$$0.B) {
         cjj $$3 = new cjj($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.u();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dbz $$0, iz $$1) {
      a($$0, $$1, null);
   }

   private static void a(dbz $$0, iz $$1, @Nullable btq $$2) {
      if (!$$0.B) {
         cjj $$3 = new cjj($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.du(), $$3.dw(), $$3.dA(), awa.zv, awb.e, 1.0F, 1.0F);
         $$0.a($$2, dww.I, $$1);
      }
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if (!$$0.a(cut.os) && !$$0.a(cut.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dfc.a.o(), 11);
         cul $$7 = $$0.g();
         if (!$$4.f()) {
            if ($$0.a(cut.os)) {
               $$0.a(1, $$4, btq.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(awk.c.b($$7));
         return bqx.a($$2.B);
      }
   }

   @Override
   protected void a(dbz $$0, dsd $$1, evo $$2, cnq $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         bsv $$5 = $$3.s();
         if ($$3.bQ() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof btq ? (btq)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dbr $$0) {
      return false;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }
}
