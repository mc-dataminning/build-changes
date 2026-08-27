import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyb extends ctm {
   public static final MapCodec<cyb> a = b(cyb::new);
   public static final dgs b = dgr.n;

   @Override
   public MapCodec<cyb> a() {
      return a;
   }

   protected cyb(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      rt $$5 = cic.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dex $$6) {
         $$6.i();
         return bib.a($$1.B);
      } else {
         return bib.d;
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dex $$5) {
            $$5.i();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dex($$0, $$1);
   }

   @Override
   public boolean f_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      if ($$1.c_($$2) instanceof dex $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dex $$3 && $$3.v().d() instanceof clb $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return $$1.c(b) ? a($$2, ddz.e, dex::a) : null;
   }
}
