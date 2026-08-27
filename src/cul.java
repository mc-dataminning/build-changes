import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cul extends cur {
   public static final MapCodec<cul> a = b(cul::new);
   public static final dih b = did.P;
   public static final die c = did.u;

   @Override
   public MapCodec<cul> a() {
      return a;
   }

   public cul(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         dfi $$6 = $$1.c_($$2);
         if ($$6 instanceof dfb) {
            $$3.a((dfb)$$6);
            $$3.a(arf.ar);
            ccq.a($$3, true);
         }

         return bjb.b;
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      bix.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      dfi $$4 = $$1.c_($$2);
      if ($$4 instanceof dfb) {
         ((dfb)$$4).m();
      }
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfb($$0, $$1);
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
      if ($$4.A()) {
         dfi $$5 = $$0.c_($$1);
         if ($$5 instanceof dfb) {
            ((dfb)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return cgr.a($$1.c_($$2));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
