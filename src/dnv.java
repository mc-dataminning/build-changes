import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dnv extends dlw implements dup {
   public static final MapCodec<dnv> c = b(dnv::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final ecg f = ebw.aC;
   public static final ebx g = dlw.b;
   public static final ebx h = ebw.I;
   public static final ToIntFunction<ebg> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<ffs>> D = ag.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new ffs(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new ffs(6.0, 7.0, 8.0).c(0.0625), new ffs(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new ffs(8.0, 5.0, 10.0).c(0.0625), new ffs(6.0, 7.0, 8.0).c(0.0625), new ffs(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new ffs(7.0, 5.0, 9.0).c(0.0625), new ffs(10.0, 7.0, 9.0).c(0.0625), new ffs(6.0, 7.0, 6.0).c(0.0625), new ffs(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final fgm[] R = new fgm[]{
      dne.b(2.0, 0.0, 6.0), dne.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dne.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dne.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dnv> a() {
      return c;
   }

   public dnv(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$0.f() && $$4.gk().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return but.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(ebg $$0, ddt $$1) {
      return !$$1.h() && $$1.n().h() == this.h() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         exq $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == exr.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(h) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return R[$$0.c(f) - 1];
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dka $$0, iw $$1, ebg $$2, exq $$3) {
      if (!$$2.c(h) && $$3.a() == exr.c) {
         ebg $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(ebg $$0) {
      return $$0.a(axg.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<ffs> b(ebg $$0) {
      return (Iterable<ffs>)D.get($$0.c(f));
   }

   @Override
   protected boolean d(ebg $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return dne.a($$1, $$2.e(), jc.b);
   }
}
