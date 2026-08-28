import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dey extends diw implements dfd, dmb {
   public static final MapCodec<dey> a = b(dey::new);
   private static final dsu f = dst.C;
   private static final int g = 6;
   protected static final ewl b = dfa.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ewl c = dfa.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ewl d = dfa.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ewl e = dfa.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dey> a() {
      return a;
   }

   protected dey(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, je.c));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      switch ((je)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(f) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsd $$4 = $$1.a_($$3);
      dsd $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(awp.by)) && ($$5.a(this) || $$5.a(dfc.sD));
   }

   protected static boolean a(dca $$0, iz $$1, enw $$2, je $$3) {
      dsd $$4 = dfc.sE.o().a(f, Boolean.valueOf($$2.a(enx.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if (($$1 == je.a || $$1 == je.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      Optional<iz> $$3 = l.a($$0, $$1, $$2.b(), je.b, dfc.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iz $$4 = $$3.get().c();
         dsd $$5 = $$0.a_($$4);
         return dex.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      Optional<iz> $$4 = l.a($$0, $$2, $$3.b(), je.b, dfc.sD);
      if (!$$4.isEmpty()) {
         iz $$5 = $$4.get();
         iz $$6 = $$5.c();
         je $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dex.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq(dfc.sD);
   }
}
