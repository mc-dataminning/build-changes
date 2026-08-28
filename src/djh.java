import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class djh extends dex implements dly {
   public static final MapCodec<djh> b = b(djh::new);
   public static final int c = 7;
   public static final dta d = dsq.aC;
   public static final dsr e = dsq.v;
   public static final dsr f = dsq.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends djh> a() {
      return b;
   }

   public djh(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected ewi b_(dsa $$0, dbc $$1, iz $$2) {
      return ewf.a();
   }

   @Override
   protected boolean d_(dsa $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dsa $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dsa $$0, dbc $$1, iz $$2) {
      return 1;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dsa a(dsa $$0, dbx $$1, iz $$2) {
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

   private static int o(dsa $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dsa $$0) {
      if ($$0.a(awo.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(f) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            iz $$4 = $$2.d();
            dsa $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, je.b)) {
               azb.a($$1, $$2, $$3, li.l);
            }
         }
      }
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      dsa $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == enu.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
