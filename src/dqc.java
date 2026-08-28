import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqc extends dkd implements dkl {
   public static final MapCodec<dqc> a = b(dqc::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fcl f = fci.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   public dqc(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dxo $$0, dxo $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if (!($$3 instanceof bvx) || $$3.dx().a(this)) {
         $$3.a($$0, new fbr(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            bac $$4 = $$1.H_();
            boolean $$5 = $$3.aa != $$3.dB() || $$3.ac != $$3.dH();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ls.aM,
                  $$3.dB(),
                  (double)($$2.v() + 1),
                  $$3.dH(),
                  (double)(azu.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azu.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if ($$1 instanceof arx $$6) {
         if ($$3.bY() && ($$6.O().b(dgv.c) || $$3 instanceof cpo) && $$3.c($$6, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dgz $$0, dxo $$1, jh $$2, bvb $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bvx $$5) {
         bvx.a $$7 = $$5.eM();
         awu $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      if ($$3 instanceof fcb $$4) {
         bvb $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof clr;
            if ($$6 || a($$5) && $$3.a(fci.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fci.a();
   }

   @Override
   protected fcl c(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return fci.a();
   }

   public static boolean a(bvb $$0) {
      if ($$0.aq().a(axo.h)) {
         return true;
      } else {
         return $$0 instanceof bvx ? ((bvx)$$0).a(bvj.c).a(cxk.qg) : false;
      }
   }

   @Override
   public cxg a(@Nullable cpo $$0, dha $$1, jh $$2, dxo $$3) {
      $$1.a($$2, dkf.a.m(), 11);
      if (!$$1.B_()) {
         $$1.c(2001, $$2, dkd.j($$3));
      }

      return new cxg(cxk.ri);
   }

   @Override
   public Optional<awu> at_() {
      return Optional.of(awv.dn);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return true;
   }
}
