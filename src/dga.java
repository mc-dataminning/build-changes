import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dga extends dbk {
   public static final MapCodec<dga> a = b(dga::new);
   public static final dpq b = dpp.n;

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   protected dga(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, @Nullable bqo $$3, crj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      ctt $$5 = $$4.a(jp.F, ctt.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dng $$5) {
         $$5.l();
         return boa.a($$1.B);
      } else {
         return boa.d;
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dng $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dng($$0, $$1);
   }

   @Override
   public boolean f_(doz $$0) {
      return true;
   }

   @Override
   public int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      if ($$1.c_($$2) instanceof dng $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dng $$3 && $$3.f().f() instanceof csb $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$1.c(b) ? a($$2, dmh.e, dng::a) : null;
   }
}
