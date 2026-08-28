import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqo extends dic implements dlx {
   public static final MapCodec<dqo> a = b(dqo::new);
   public static final dws<dxe> b = dwl.bj;

   @Override
   public MapCodec<dqo> a() {
      return a;
   }

   protected dqo(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxe.b));
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dup($$0, $$1);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      dsy $$5 = $$1.c_($$2);
      if ($$5 instanceof dup) {
         return (bsk)(((dup)$$5).a($$3) ? bsk.a : bsk.e);
      } else {
         return bsk.e;
      }
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, @Nullable bvh $$3, cwm $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dsy $$5 = $$0.c_($$1);
            if ($$5 instanceof dup) {
               ((dup)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if ($$1 instanceof arp) {
         if ($$1.c_($$2) instanceof dup $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arp)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arp $$0, dup $$1) {
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
