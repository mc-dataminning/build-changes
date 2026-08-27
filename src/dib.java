import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dib extends ddk {
   public static final MapCodec<dib> a = b(dib::new);
   public static final drs b = drr.n;

   @Override
   public MapCodec<dib> a() {
      return a;
   }

   protected dib(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, @Nullable bso $$3, cto $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cwd $$5 = $$4.a(kb.N, cwd.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dph $$5) {
         $$5.l();
         return bpu.a($$1.B);
      } else {
         return bpu.d;
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dph $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dph($$0, $$1);
   }

   @Override
   public boolean e_(drb $$0) {
      return true;
   }

   @Override
   public int a(drb $$0, dad $$1, io $$2, it $$3) {
      if ($$1.c_($$2) instanceof dph $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      if ($$1.c_($$2) instanceof dph $$3 && $$3.f().g() instanceof cuj $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$1.c(b) ? a($$2, doi.e, dph::a) : null;
   }
}
