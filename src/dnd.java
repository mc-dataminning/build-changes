import com.mojang.serialization.MapCodec;

public class dnd extends dfj implements dfd {
   public static final MapCodec<dnd> a = b(dnd::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dtd c = dst.as;
   private static final ewl e = dfa.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ewl f = dfa.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   public dnd(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq(cut.wr);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsd $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dsd $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dww.c, $$2, dww.a.a($$5));
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if ($$3 instanceof btq && $$3.ak() != btb.Q && $$3.ak() != btb.h) {
         $$3.a($$0, new evs(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.du() || $$3.af != $$3.dA())) {
            double $$4 = Math.abs($$3.du() - $$3.ad);
            double $$5 = Math.abs($$3.dA() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cut.ry) ? bqx.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cuq(cut.wr, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awa.zp, awb.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dsd $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dww.c, $$2, dww.a.a($$3, $$8));
         return bqv.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
