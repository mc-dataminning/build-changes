import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cue extends ctm {
   public static final MapCodec<cue> a = b(cue::new);
   public static final dgs[] b = new dgs[]{dgr.k, dgr.l, dgr.m};
   protected static final eiy c = eiv.a(cua.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cua.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<cue> a() {
      return a;
   }

   public cue(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dea($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return $$0.B ? null : a($$2, ddz.l, dea::a);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         ddx $$6 = $$1.c_($$2);
         if ($$6 instanceof dea) {
            $$3.a((dea)$$6);
            $$3.a(aqn.aa);
         }

         return bib.b;
      }
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if ($$4.A()) {
         ddx $$5 = $$0.c_($$1);
         if ($$5 instanceof dea) {
            ((dea)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(js.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      bhx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
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
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
