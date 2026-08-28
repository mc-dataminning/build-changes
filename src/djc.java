import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djc extends del {
   public static final MapCodec<djc> a = b(djc::new);
   public static final dst b = dss.n;

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   protected djc(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, @Nullable btp $$3, cup $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxe $$5 = $$4.a(km.O, cxe.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dqi $$5) {
         $$5.l();
         return bqu.a($$1.B);
      } else {
         return bqu.e;
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqi $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqi($$0, $$1);
   }

   @Override
   public boolean e_(dsc $$0) {
      return true;
   }

   @Override
   public int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      if ($$1.c_($$2) instanceof dqi $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqi $$3 && $$3.f().g() instanceof cvk $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return $$1.c(b) ? a($$2, dpj.e, dqi::a) : null;
   }
}
