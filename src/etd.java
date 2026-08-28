import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etd extends esv {
   @Override
   public esw d() {
      return esy.b;
   }

   @Override
   public esw e() {
      return esy.c;
   }

   @Override
   public cwj a() {
      return cwr.rg;
   }

   @Override
   public void a(dgg $$0, ji $$1, esx $$2, azg $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avz.CQ, awa.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lt.an, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lr h() {
      return lt.l;
   }

   @Override
   protected boolean a(arc $$0) {
      return $$0.O().b(dgc.V);
   }

   @Override
   protected void a(dgh $$0, ji $$1, dwv $$2) {
      dtx $$3 = $$2.x() ? $$0.c_($$1) : null;
      djk.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dgj $$0) {
      return 4;
   }

   @Override
   public dwv b(esx $$0) {
      return djm.J.m().b(doc.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(esw $$0) {
      return $$0 == esy.c || $$0 == esy.b;
   }

   @Override
   public int c(dgj $$0) {
      return 1;
   }

   @Override
   public int a(dgj $$0) {
      return 5;
   }

   @Override
   public boolean a(esx $$0, dfl $$1, ji $$2, esw $$3, jn $$4) {
      return $$4 == jn.a && !$$3.a(awu.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avy> j() {
      return Optional.of(avz.dj);
   }

   public static class a extends etd {
      @Override
      protected void a(dww.a<esw, esx> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(esx $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(esx $$0) {
         return false;
      }
   }

   public static class b extends etd {
      @Override
      public int d(esx $$0) {
         return 8;
      }

      @Override
      public boolean c(esx $$0) {
         return true;
      }
   }
}
