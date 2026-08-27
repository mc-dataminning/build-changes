import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cux extends cur implements cuw {
   public static final MapCodec<cux> a = b(cux::new);

   @Override
   public MapCodec<cux> a() {
      return a;
   }

   public cux(dhm.d $$0) {
      super($$0);
   }

   @Override
   public ckc b() {
      return ckc.a;
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$2, dfk.o, dfd::a);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         dfi $$6 = $$1.c_($$2);
         if ($$6 instanceof dfd) {
            $$3.a((dfd)$$6);
            $$3.a(arf.ab);
         }

         return bjb.b;
      }
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if ($$4.A()) {
         dfi $$5 = $$0.c_($$1);
         if ($$5 instanceof dfd) {
            ((dfd)$$5).a($$4.y());
         }
      }
   }
}
