import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcs extends cvl implements dcz {
   public static final MapCodec<dcs> a = b(dcs::new);
   public static final djg b = djf.F;
   public static final djg c = djf.C;
   public static final djg d = djf.G;
   protected static final elu e = cvz.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ia.a.b);

   @Override
   public MapCodec<dcs> a() {
      return a;
   }

   public dcs(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blf $$3) {
      if ($$0 instanceof amp $$4) {
         amq $$5 = dhk.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dgf.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if ($$1 instanceof amp $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dgf.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dgf.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return e;
   }

   @Override
   public elu f(dip $$0, cse $$1, hv $$2) {
      return e;
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhk($$0, $$1);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eea.c));
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(c) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, cmh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bin.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return !$$0.B ? cvl.a($$2, dgf.L, ($$0x, $$1x, $$2x, $$3) -> dni.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }
}
