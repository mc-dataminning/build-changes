import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dni extends dlj implements duc {
   public static final MapCodec<dni> c = b(dni::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final ebt f = ebj.aC;
   public static final ebk g = dlj.b;
   public static final ebk h = ebj.I;
   public static final ToIntFunction<eat> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ffc>> D = ag.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new ffc(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new ffc(6.0, 7.0, 8.0).c(0.0625), new ffc(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new ffc(8.0, 5.0, 10.0).c(0.0625), new ffc(6.0, 7.0, 8.0).c(0.0625), new ffc(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new ffc(7.0, 5.0, 9.0).c(0.0625), new ffc(10.0, 7.0, 9.0).c(0.0625), new ffc(6.0, 7.0, 6.0).c(0.0625), new ffc(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final ffw[] R = new ffw[]{
      dmr.b(2.0, 0.0, 6.0), dmr.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dmr.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dmr.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dni> a() {
      return c;
   }

   public dni(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if ($$0.f() && $$4.gj().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bug.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(eat $$0, ddg $$1) {
      return !$$1.h() && $$1.n().h() == this.h() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eat a(ddg $$0) {
      eat $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         exa $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == exb.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(h) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return R[$$0.c(f) - 1];
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(djn $$0, iv $$1, eat $$2, exa $$3) {
      if (!$$2.c(h) && $$3.a() == exb.c) {
         eat $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(eat $$0) {
      return $$0.a(axc.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ffc> b(eat $$0) {
      return (Iterable<ffc>)D.get($$0.c(f));
   }

   @Override
   protected boolean d(eat $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return dmr.a($$1, $$2.e(), jb.b);
   }
}
