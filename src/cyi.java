import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class cyi extends cua implements daz {
   public static final MapCodec<cyi> b = b(cyi::new);
   public static final int c = 7;
   public static final dhb d = dgr.aC;
   public static final dgs e = dgr.v;
   public static final dgs f = dgr.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends cyi> a() {
      return b;
   }

   public cyi(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public eiy b_(dgb $$0, cqf $$1, ht $$2) {
      return eiv.a();
   }

   @Override
   public boolean e_(dgb $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dgb $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dgb $$0, cqf $$1, ht $$2) {
      return 1;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dgb a(dgb $$0, cra $$1, ht $$2) {
      int $$3 = 7;
      ht.a $$4 = new ht.a();

      for (hx $$5 : hx.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dgb $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dgb $$0) {
      if ($$0.a(aqs.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(f) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            ht $$4 = $$2.d();
            dgb $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, hx.b)) {
               atb.a($$1, $$2, $$3, js.m);
            }
         }
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      dgb $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == ebf.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
