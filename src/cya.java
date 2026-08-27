import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cya extends cyr {
   public static final dmy a = dda.aE;
   public static final dmv b = dmu.r;

   protected cya(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cya> a();

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         this.a($$1, $$2, $$3);
         return bml.b;
      }
   }

   protected abstract void a(cwe var1, ib var2, cia var3);

   @Override
   public dme a(crx $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if ($$4.B()) {
         djl $$5 = $$0.c_($$1);
         if ($$5 instanceof dja) {
            ((dja)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         djl $$5 = $$1.c_($$2);
         if ($$5 instanceof dja) {
            if ($$1 instanceof apa) {
               bmh.a($$1, $$2, (dja)$$5);
               ((dja)$$5).a((apa)$$1, eov.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return cku.a($$1.c_($$2));
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends djl> djm<T> a(cwe $$0, djn<T> $$1, djn<? extends dja> $$2) {
      return $$0.B ? null : a($$1, $$2, dja::a);
   }
}
