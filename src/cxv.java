import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxv extends cyo implements dfo {
   public static final MapCodec<cxv> a = b(cxv::new);
   public static final dlw b = dlv.C;

   @Override
   public MapCodec<cxv> a() {
      return a;
   }

   protected cxv(dle.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return true;
   }

   @Override
   protected det b_(dlf $$0) {
      return det.a;
   }

   @Override
   protected float d(dlf $$0, cut $$1, hz $$2) {
      return 1.0F;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(b) ? egq.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == egq.c));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   public coz a(@Nullable chh $$0, cvo $$1, hz $$2, dlf $$3) {
      return $$0 != null && $$0.f() ? dfo.super.a($$0, $$1, $$2, $$3) : coz.h;
   }

   @Override
   public boolean a(@Nullable chh $$0, cut $$1, hz $$2, dlf $$3, ego $$4) {
      return $$0 != null && $$0.f() ? dfo.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
