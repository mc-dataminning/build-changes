import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmx extends del implements dih {
   public static final MapCodec<dmx> a = b(dmx::new);
   public static final dta<dtm> b = dss.bj;

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   protected dmx(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtm.b));
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqw($$0, $$1);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      dph $$5 = $$1.c_($$2);
      if ($$5 instanceof dqw) {
         return ((dqw)$$5).a($$3) ? bqu.a($$1.B) : bqu.e;
      } else {
         return bqu.e;
      }
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, @Nullable btp $$3, cup $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dph $$5 = $$0.c_($$1);
            if ($$5 instanceof dqw) {
               ((dqw)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      if ($$1 instanceof arf) {
         if ($$1.c_($$2) instanceof dqw $$7) {
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

   private void a(arf $$0, dqw $$1) {
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
