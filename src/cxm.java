import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxm extends cvl implements dcz {
   public static final MapCodec<cxm> a = b(cxm::new);
   public static final djg b = djf.C;
   private static final int d = 3;
   protected static final elu c = cvz.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<cxm> a() {
      return a;
   }

   public cxm(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$2, dgf.z, $$0.B ? dgp::a : dgp::b);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.b;
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(b) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
      if ($$4.A()) {
         dgd $$5 = $$0.c_($$1);
         if ($$5 instanceof dfy) {
            ((dfy)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(arw.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
