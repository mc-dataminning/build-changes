import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dst extends dlg implements dtb {
   public static final MapCodec<dst> a = b(dst::new);
   public static final eaf b = eae.C;
   public static final eaf c = eae.I;
   public static final eaf d = eae.e;
   private static final feq f = dlu.b(16.0, 0.0, 8.0);
   public static final double e = f.c(ja.a.b);

   @Override
   public MapCodec<dst> a() {
      return a;
   }

   public dst(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwa $$3) {
      if ($$0 instanceof aro $$4) {
         arp $$5 = dxz.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dwp.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dwp.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return f;
   }

   @Override
   protected feq d_(dzo $$0) {
      return f;
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxz($$0, $$1);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == evw.c));
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(c) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, cys $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bta.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return !$$0.C ? dlg.a($$2, dwp.M, ($$0x, $$1x, $$2x, $$3) -> eex.c.a($$0x, $$3.x(), $$3.gq())) : null;
   }
}
