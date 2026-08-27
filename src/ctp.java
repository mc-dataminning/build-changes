import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ctp extends cuf implements ckc {
   public static final dhn a = dhm.w;
   private final dbu.a b;

   public ctp(dbu.a $$0, dgv.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ctp> a();

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dgc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cuv.gO) || $$1.a(cuv.gP) || $$1.a(cuv.gQ) || $$1.a(cuv.gR);
         if ($$3) {
            return a($$2, det.p, dgc::a);
         }
      }

      return null;
   }

   public dbu.a b() {
      return this.b;
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public bkn g() {
      return bkn.f;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(a);
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
