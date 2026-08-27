import com.mojang.serialization.MapCodec;
import org.jetbrains.annotations.Nullable;

public class dld extends dgy {
   public static final MapCodec<dld> a = b(dld::new);
   public static final duc b = duc.a("tater_boost", 0, 2);
   private static final exn[] c = new exn[]{
      dfc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   public dld(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a().b(iw.a);
      dtc $$3 = $$1.a_($$2);
      dtc $$4 = super.a($$0);
      return $$4 == null ? null : a($$4, $$3);
   }

   @Override
   protected dbz d() {
      return cuk.vI;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c[this.g($$0)];
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(awe.aJ);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$2.b(iw.a).equals($$4)) {
         dtc $$6 = $$1.a_($$4);
         dtc $$7 = $$1.a_($$2);
         if ($$7.b() instanceof dld) {
            $$1.a($$2, a($$7, $$6), 3);
         }
      }
   }

   @Override
   public dtc a(int $$0, dtc $$1) {
      return $$1.a(this.b(), Integer.valueOf($$0));
   }

   public static dtc a(dtc $$0, dtc $$1) {
      return $$0.a(b, Integer.valueOf(m($$1)));
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      if ($$1.z_()) {
         ir $$3 = $$2.d();
         return this.b($$1.a_($$3), $$1, $$3);
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private static int m(dtc $$0) {
      if ($$0.a(dfe.k)) {
         return 1;
      } else {
         return $$0.a(dfe.l) ? 2 : 0;
      }
   }
}
