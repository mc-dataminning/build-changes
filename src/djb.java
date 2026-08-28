import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djb extends dek {
   public static final MapCodec<djb> a = b(djb::new);
   public static final dss b = dsr.n;

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   protected djb(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, @Nullable bto $$3, cuo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxd $$5 = $$4.a(km.O, cxd.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dqh $$5) {
         $$5.l();
         return bqt.a($$1.B);
      } else {
         return bqt.e;
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqh $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqh($$0, $$1);
   }

   @Override
   public boolean e_(dsb $$0) {
      return true;
   }

   @Override
   public int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      if ($$1.c_($$2) instanceof dqh $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqh $$3 && $$3.f().g() instanceof cvj $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$1.c(b) ? a($$2, dpi.e, dqh::a) : null;
   }
}
