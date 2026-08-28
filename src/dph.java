import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dph extends dmd implements dsq {
   public static final MapCodec<dph> a = b(dph::new);
   private static final ffw b = dmr.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<dph> a() {
      return a;
   }

   protected dph(eas.d $$0) {
      super($$0);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzo($$0, $$1);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, bwi $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$3.n(false)) {
         if (!$$1.C && $$1.aj() == djm.k && $$3 instanceof arr $$5 && !$$5.i) {
            $$5.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public eya a(arq $$0, bwi $$1, iv $$2) {
      alf<djm> $$3 = $$0.aj() == djm.k ? djm.i : djm.k;
      arq $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == djm.k;
         iv $$6 = $$5 ? arq.a : $$4.aa();
         ffc $$7 = $$6.c();
         float $$8;
         Set<bxx> $$9;
         if ($$5) {
            ejw.a($$4, iv.a((jp)$$7).e(), true);
            $$8 = jb.e.p();
            $$9 = bxx.a(bxx.l, Set.of(bxx.e));
            if ($$1 instanceof arr) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bxx.a(bxx.l, bxx.k);
            if ($$1 instanceof arr $$12) {
               return $$12.a(false, eya.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new eya($$4, $$7, ffc.c, $$8, 0.0F, $$9, eya.b.then(eya.c));
      }
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ly.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return czn.k;
   }

   @Override
   protected boolean a(eat $$0, ewz $$1) {
      return false;
   }

   @Override
   protected dte a_(eat $$0) {
      return dte.a;
   }
}
