import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnh extends dlg implements dtb {
   public static final MapCodec<dnh> a = b(dnh::new);
   public static final eaf b = eae.I;
   private static final feq c = dlu.a(6.0);

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$2, dwp.A, $$0.C ? dxa::a : dxa::b);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(b) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c;
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axf.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
