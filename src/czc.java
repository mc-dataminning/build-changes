import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czc extends cum {
   public static final MapCodec<czc> a = b(czc::new);
   public static final dhz b = dhy.n;

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   protected czc(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      rz $$5 = cjc.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dge $$6) {
         $$6.i();
         return bix.a($$1.B);
      } else {
         return bix.d;
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dge $$5) {
            $$5.i();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dge($$0, $$1);
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      if ($$1.c_($$2) instanceof dge $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dge $$3 && $$3.v().d() instanceof cmb $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return $$1.c(b) ? a($$2, dff.e, dge::a) : null;
   }
}
