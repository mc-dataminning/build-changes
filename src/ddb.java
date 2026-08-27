import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class ddb extends cys implements dfs {
   public static final MapCodec<ddb> b = b(ddb::new);
   public static final int c = 7;
   public static final dmj d = dlz.aC;
   public static final dma e = dlz.v;
   public static final dma f = dlz.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends ddb> a() {
      return b;
   }

   public ddb(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected eos b_(dlj $$0, cux $$1, hz $$2) {
      return eop.a();
   }

   @Override
   protected boolean e_(dlj $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dlj $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dlj $$0, cux $$1, hz $$2) {
      return 1;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dlj a(dlj $$0, cvs $$1, hz $$2) {
      int $$3 = 7;
      hz.a $$4 = new hz.a();

      for (ie $$5 : ie.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dlj $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dlj $$0) {
      if ($$0.a(aua.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(f) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            hz $$4 = $$2.d();
            dlj $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ie.b)) {
               awl.a($$1, $$2, $$3, jz.m);
            }
         }
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      dlj $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == egx.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
