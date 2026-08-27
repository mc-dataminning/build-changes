import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfg extends cwy {
   public static final MapCodec<dfg> a = b(dfg::new);
   public static final dkg b = dkf.B;

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(djo.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public djp a(ctx $$0, hx $$1, djp $$2, cfq $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ctx $$0, hx $$1, ctp $$2) {
      if (!$$0.B) {
         ccc $$3 = new ccc($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(ctx $$0, hx $$1) {
      a($$0, $$1, null);
   }

   private static void a(ctx $$0, hx $$1, @Nullable bmo $$2) {
      if (!$$0.B) {
         ccc $$3 = new ccc($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dq(), $$3.ds(), $$3.dw(), art.yQ, aru.e, 1.0F, 1.0F);
         $$0.a($$2, dnz.I, $$1);
      }
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if (!$$0.a(cnj.or) && !$$0.a(cnj.tV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, cxa.a.o(), 11);
         cnb $$7 = $$0.d();
         if (!$$4.f()) {
            if ($$0.a(cnj.or)) {
               $$0.a(1, $$4, $$1x -> $$1x.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(asd.c.b($$7));
         return bke.a($$2.B);
      }
   }

   @Override
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         blw $$5 = $$3.w();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bmo ? (bmo)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(ctp $$0) {
      return false;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }
}
