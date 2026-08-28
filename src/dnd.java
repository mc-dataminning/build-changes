import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dnd extends dle implements dtx {
   public static final MapCodec<dnd> c = b(dnd::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final ebo f = ebe.aC;
   public static final ebf g = dle.b;
   public static final ebf h = ebe.I;
   public static final ToIntFunction<eao> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fex>> D = ag.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new fex(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new fex(6.0, 7.0, 8.0).c(0.0625), new fex(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new fex(8.0, 5.0, 10.0).c(0.0625), new fex(6.0, 7.0, 8.0).c(0.0625), new fex(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new fex(7.0, 5.0, 9.0).c(0.0625), new fex(10.0, 7.0, 9.0).c(0.0625), new fex(6.0, 7.0, 6.0).c(0.0625), new fex(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final ffr[] R = new ffr[]{
      dmm.b(2.0, 0.0, 6.0), dmm.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dmm.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dmm.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dnd> a() {
      return c;
   }

   public dnd(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bug.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(eao $$0, ddd $$1) {
      return !$$1.h() && $$1.n().h() == this.h() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eao a(ddd $$0) {
      eao $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         ewv $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eww.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(h) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return R[$$0.c(f) - 1];
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dji $$0, iv $$1, eao $$2, ewv $$3) {
      if (!$$2.c(h) && $$3.a() == eww.c) {
         eao $$4 = $$2.b(h, Boolean.valueOf(true));
         if ($$2.c(g)) {
            a(null, $$4, $$0, $$1);
         } else {
            $$0.a($$1, $$4, 3);
         }

         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   public static boolean h(eao $$0) {
      return $$0.a(axc.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fex> b(eao $$0) {
      return (Iterable<fex>)D.get($$0.c(f));
   }

   @Override
   protected boolean d(eao $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return dmm.a($$1, $$2.e(), jb.b);
   }
}
