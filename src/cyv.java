import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyv extends cuf {
   public static final MapCodec<cyv> a = b(cyv::new);
   public static final dhn b = dhm.n;

   @Override
   public MapCodec<cyv> a() {
      return a;
   }

   protected cyv(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      rz $$5 = ciu.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dfs $$6) {
         $$6.i();
         return biq.a($$1.B);
      } else {
         return biq.d;
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dfs $$5) {
            $$5.i();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfs($$0, $$1);
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      if ($$1.c_($$2) instanceof dfs $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dfs $$3 && $$3.v().d() instanceof clt $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return $$1.c(b) ? a($$2, det.e, dfs::a) : null;
   }
}
