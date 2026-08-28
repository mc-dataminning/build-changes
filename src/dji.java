import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dji extends dey implements dlz {
   public static final MapCodec<dji> b = b(dji::new);
   public static final int c = 7;
   public static final dtb d = dsr.aC;
   public static final dss e = dsr.v;
   public static final dss f = dsr.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dji> a() {
      return b;
   }

   public dji(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected ewj b_(dsb $$0, dbd $$1, iz $$2) {
      return ewg.a();
   }

   @Override
   protected boolean d_(dsb $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dsb $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dsb $$0, dbd $$1, iz $$2) {
      return 1;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dsb a(dsb $$0, dby $$1, iz $$2) {
      int $$3 = 7;
      iz.a $$4 = new iz.a();

      for (je $$5 : je.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dsb $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dsb $$0) {
      if ($$0.a(awo.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(f) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            iz $$4 = $$2.d();
            dsb $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, je.b)) {
               azc.a($$1, $$2, $$3, li.l);
            }
         }
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      dsb $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == env.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
