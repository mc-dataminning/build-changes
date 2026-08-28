import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dje extends deu implements dlv {
   public static final MapCodec<dje> b = b(dje::new);
   public static final int c = 7;
   public static final dsx d = dsn.aC;
   public static final dso e = dsn.v;
   public static final dso f = dsn.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dje> a() {
      return b;
   }

   public dje(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected ewf b_(drx $$0, daz $$1, iz $$2) {
      return ewc.a();
   }

   @Override
   protected boolean d_(drx $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(drx $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(drx $$0, daz $$1, iz $$2) {
      return 1;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static drx a(drx $$0, dbu $$1, iz $$2) {
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

   private static int o(drx $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(drx $$0) {
      if ($$0.a(awl.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(f) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            iz $$4 = $$2.d();
            drx $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, je.b)) {
               ayy.a($$1, $$2, $$3, lj.l);
            }
         }
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      drx $$2 = this.n().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == enr.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
