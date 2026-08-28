import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnr extends diy {
   public static final MapCodec<dnr> a = b(dnr::new);
   public static final dxo b = dxn.r;

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   protected dnr(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, @Nullable bvh $$3, cwp $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cyy $$5 = $$4.a(kv.Y, cyy.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dvd $$5) {
         $$5.s();
         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   @Override
   protected bsk a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsj $$5, faw $$6) {
      if ($$1.c(b)) {
         return bsk.f;
      } else {
         cwp $$7 = $$4.b($$5);
         bsk $$8 = cwu.a($$2, $$3, $$7, $$4);
         return (bsk)(!$$8.a() ? bsk.f : $$8);
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dvd $$5) {
            $$5.s();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvd($$0, $$1);
   }

   @Override
   public boolean f_(dwx $$0) {
      return true;
   }

   @Override
   public int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      if ($$1.c_($$2) instanceof dvd $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return $$1.c_($$2) instanceof dvd $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$1.c(b) ? a($$2, dub.e, dvd::a) : null;
   }
}
