import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cuv extends cvl implements cli {
   public static final djg a = djf.w;
   private final dda.a b;

   public cuv(dda.a $$0, dio.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cuv> a();

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dho($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cwb.gO) || $$1.a(cwb.gP) || $$1.a(cwb.gQ) || $$1.a(cwb.gR);
         if ($$3) {
            return a($$2, dgf.p, dho::a);
         }
      }

      return null;
   }

   public dda.a b() {
      return this.b;
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public blk g() {
      return blk.f;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(a);
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
