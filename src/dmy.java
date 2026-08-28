import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmy extends dem implements dii {
   public static final MapCodec<dmy> a = b(dmy::new);
   public static final dtb<dtn> b = dst.bj;

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   protected dmy(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtn.b));
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqx($$0, $$1);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      dpi $$5 = $$1.c_($$2);
      if ($$5 instanceof dqx) {
         return ((dqx)$$5).a($$3) ? bqv.a($$1.B) : bqv.e;
      } else {
         return bqv.e;
      }
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, @Nullable btq $$3, cuq $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dpi $$5 = $$0.c_($$1);
            if ($$5 instanceof dqx) {
               ((dqx)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      if ($$1 instanceof arf) {
         if ($$1.c_($$2) instanceof dqx $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arf)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arf $$0, dqx $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
