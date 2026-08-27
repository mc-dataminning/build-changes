import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgj extends dbt {
   public static final MapCodec<dgj> a = b(dgj::new);
   public static final dpz b = dpy.n;

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   protected dgj(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, @Nullable bqt $$3, crs $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cuc $$5 = $$4.a(jr.F, cuc.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dnp $$5) {
         $$5.l();
         return bof.a($$1.B);
      } else {
         return bof.d;
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dnp $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnp($$0, $$1);
   }

   @Override
   public boolean f_(dpi $$0) {
      return true;
   }

   @Override
   public int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      if ($$1.c_($$2) instanceof dnp $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      if ($$1.c_($$2) instanceof dnp $$3 && $$3.f().f() instanceof csk $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$1.c(b) ? a($$2, dmq.e, dnp::a) : null;
   }
}
