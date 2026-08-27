import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class czc extends cut implements dbt {
   public static final MapCodec<czc> b = b(czc::new);
   public static final int c = 7;
   public static final dhw d = dhm.aC;
   public static final dhn e = dhm.v;
   public static final dhn f = dhm.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends czc> a() {
      return b;
   }

   public czc(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public ekb b_(dgw $$0, cqy $$1, ht $$2) {
      return ejy.a();
   }

   @Override
   public boolean e_(dgw $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dgw $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dgw $$0, cqy $$1, ht $$2) {
      return 1;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dgw a(dgw $$0, crt $$1, ht $$2) {
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

   private static int o(dgw $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dgw $$0) {
      if ($$0.a(arc.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(f) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            ht $$4 = $$2.d();
            dgw $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, hx.b)) {
               atl.a($$1, $$2, $$3, js.m);
            }
         }
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      dgw $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == ech.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
