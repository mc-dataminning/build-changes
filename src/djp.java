import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class djp extends dff implements dmg {
   public static final MapCodec<djp> b = b(djp::new);
   public static final int c = 7;
   public static final dth d = dsx.aC;
   public static final dsy e = dsx.v;
   public static final dsy f = dsx.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends djp> a() {
      return b;
   }

   public djp(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected ews b_(dsh $$0, dbj $$1, ja $$2) {
      return ewp.a();
   }

   @Override
   protected boolean d_(dsh $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dsh $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dsh $$0, dbj $$1, ja $$2) {
      return 1;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dsh a(dsh $$0, dce $$1, ja $$2) {
      int $$3 = 7;
      ja.a $$4 = new ja.a();

      for (jf $$5 : jf.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dsh $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dsh $$0) {
      if ($$0.a(avu.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(f) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            ja $$4 = $$2.d();
            dsh $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, jf.b)) {
               ayi.a($$1, $$2, $$3, lj.l);
            }
         }
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      dsh $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == eoc.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
