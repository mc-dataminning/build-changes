import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyl extends cyr {
   public static final MapCodec<cyl> a = b(cyl::new);
   public static final dmy b = dmu.P;
   public static final dmv c = dmu.u;

   @Override
   public MapCodec<cyl> a() {
      return a;
   }

   public cyl(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         djl $$5 = $$1.c_($$2);
         if ($$5 instanceof dje) {
            $$3.a((dje)$$5);
            $$3.a(atz.ar);
            cgr.a($$3, true);
         }

         return bml.b;
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      bmh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      djl $$4 = $$1.c_($$2);
      if ($$4 instanceof dje) {
         ((dje)$$4).l();
      }
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new dje($$0, $$1);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
      if ($$4.B()) {
         djl $$5 = $$0.c_($$1);
         if ($$5 instanceof dje) {
            ((dje)$$5).a($$4.z());
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
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
