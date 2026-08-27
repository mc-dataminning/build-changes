import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dab extends cvl {
   public static final MapCodec<dab> a = b(dab::new);
   public static final djg b = djf.n;

   @Override
   public MapCodec<dab> a() {
      return a;
   }

   protected dab(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      sj $$5 = cka.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dhe $$6) {
         $$6.k();
         return bjl.a($$1.B);
      } else {
         return bjl.d;
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dhe $$5) {
            $$5.k();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhe($$0, $$1);
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      if ($$1.c_($$2) instanceof dhe $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      if ($$1.c_($$2) instanceof dhe $$3 && $$3.x().d() instanceof cmz $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return $$1.c(b) ? a($$2, dgf.e, dhe::a) : null;
   }
}
