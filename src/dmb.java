import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dmb extends diy implements dpj {
   public static final MapCodec<dmb> a = b(dmb::new);
   protected static final fbu b = djm.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   protected dmb(dww.d $$0) {
      super($$0);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvt($$0, $$1);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected fbu a_(dwx $$0, dgi $$1, ji $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ai() == dgi.k && $$3 instanceof ard $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public etz a(arc $$0, buk $$1, ji $$2) {
      akt<dgi> $$3 = $$0.ai() == dgi.k ? dgi.i : dgi.k;
      arc $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dgi.k;
         ji $$6 = $$5 ? arc.a : $$4.Z();
         fba $$7 = $$6.c();
         float $$8;
         Set<bvu> $$9;
         if ($$5) {
            efw.a($$4, ji.a((kb)$$7).e(), true);
            $$8 = jn.e.p();
            $$9 = bvu.a(bvu.l, Set.of(bvu.e));
            if ($$1 instanceof ard) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bvu.a(bvu.l, bvu.k);
            if ($$1 instanceof ard $$12) {
               return $$12.a(false, etz.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new etz($$4, $$7, fba.c, $$8, 0.0F, $$9, etz.b.then(etz.c));
      }
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lt.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return cwp.j;
   }

   @Override
   protected boolean a(dwx $$0, esy $$1) {
      return false;
   }
}
