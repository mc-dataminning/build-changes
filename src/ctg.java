import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ctg extends ctm {
   public static final MapCodec<ctg> a = b(ctg::new);
   public static final dgv b = dgr.P;
   public static final dgs c = dgr.u;

   @Override
   public MapCodec<ctg> a() {
      return a;
   }

   public ctg(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         ddx $$6 = $$1.c_($$2);
         if ($$6 instanceof ddq) {
            $$3.a((ddq)$$6);
            $$3.a(aqn.ar);
            cbo.a($$3, true);
         }

         return bib.b;
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      bhx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      ddx $$4 = $$1.c_($$2);
      if ($$4 instanceof ddq) {
         ((ddq)$$4).i();
      }
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new ddq($$0, $$1);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
      if ($$4.A()) {
         ddx $$5 = $$0.c_($$1);
         if ($$5 instanceof ddq) {
            ((ddq)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return cfp.a($$1.c_($$2));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
