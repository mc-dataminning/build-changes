import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqz extends diq {
   public static final MapCodec<dqz> a = b(dqz::new);
   public static final dwm b = dwl.B;

   @Override
   public MapCodec<dqz> a() {
      return a;
   }

   public dqz(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      if (!$$0.A_() && !$$3.b() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arp $$0, jh $$1, dfe $$2) {
      cld $$3 = new cld($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.l();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dfm $$0, jh $$1) {
      a($$0, $$1, null);
   }

   private static void a(dfm $$0, jh $$1, @Nullable bvh $$2) {
      if (!$$0.C) {
         cld $$3 = new cld($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dA(), $$3.dC(), $$3.dG(), awn.zC, awo.e, 1.0F, 1.0F);
         $$0.a($$2, ear.I, $$1);
      }
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if (!$$0.a(cwq.ot) && !$$0.a(cwq.uo)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dis.a.m(), 11);
         cwi $$7 = $$0.h();
         if ($$0.a(cwq.ot)) {
            $$0.a(1, $$4, bvh.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awx.c.b($$7));
         return bsk.a;
      }
   }

   @Override
   protected void a(dfm $$0, dvv $$1, ezu $$2, cpn $$3) {
      if ($$0 instanceof arp $$4) {
         jh $$5 = $$2.b();
         bul $$6 = $$3.p();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bvh ? (bvh)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dfe $$0) {
      return false;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }
}
