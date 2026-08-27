import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class csw extends ctm implements cjk {
   public static final dgs a = dgr.w;
   private final dba.a b;

   public csw(dba.a $$0, dga.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends csw> a();

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cuc.gO) || $$1.a(cuc.gP) || $$1.a(cuc.gQ) || $$1.a(cuc.gR);
         if ($$3) {
            return a($$2, ddz.p, dfh::a);
         }
      }

      return null;
   }

   public dba.a b() {
      return this.b;
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public bjy g() {
      return bjy.f;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(a);
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
