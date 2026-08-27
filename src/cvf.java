import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvf extends cvl {
   public static final MapCodec<cvf> a = b(cvf::new);
   public static final djj b = djf.P;
   public static final djg c = djf.u;

   @Override
   public MapCodec<cvf> a() {
      return a;
   }

   public cvf(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         dgd $$6 = $$1.c_($$2);
         if ($$6 instanceof dfw) {
            $$3.a((dfw)$$6);
            $$3.a(arm.ar);
            cdi.a($$3, true);
         }

         return bjl.b;
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      bjh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      dgd $$4 = $$1.c_($$2);
      if ($$4 instanceof dfw) {
         ((dfw)$$4).m();
      }
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dfw($$0, $$1);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
      if ($$4.A()) {
         dgd $$5 = $$0.c_($$1);
         if ($$5 instanceof dfw) {
            ((dfw)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return chk.a($$1.c_($$2));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
