import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddg extends ddm {
   public static final MapCodec<ddg> a = b(ddg::new);
   public static final drx b = drt.P;
   public static final dru c = drt.u;

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   public ddg(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         doi $$5 = $$1.c_($$2);
         if ($$5 instanceof dob) {
            $$3.a((dob)$$5);
            $$3.a(avs.ar);
            ckp.a($$3, true);
         }

         return bpw.b;
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      bps.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      doi $$4 = $$1.c_($$2);
      if ($$4 instanceof dob) {
         ((dob)$$4).l();
      }
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new dob($$0, $$1);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return cov.a($$1.c_($$2));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, $$0.d().g());
   }
}
