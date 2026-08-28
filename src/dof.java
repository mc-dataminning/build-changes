import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dof extends dmg implements duz {
   public static final MapCodec<dof> c = b(dof::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final ecq f = ecg.aC;
   public static final ech g = dmg.b;
   public static final ech h = ecg.I;
   public static final ToIntFunction<ebq> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fgc>> D = ag.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new fgc(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new fgc(6.0, 7.0, 8.0).c(0.0625), new fgc(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new fgc(8.0, 5.0, 10.0).c(0.0625), new fgc(6.0, 7.0, 8.0).c(0.0625), new fgc(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new fgc(7.0, 5.0, 9.0).c(0.0625), new fgc(10.0, 7.0, 9.0).c(0.0625), new fgc(6.0, 7.0, 6.0).c(0.0625), new fgc(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final fgw[] R = new fgw[]{
      dno.b(2.0, 0.0, 6.0), dno.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dno.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dno.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dof> a() {
      return c;
   }

   public dof(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$0.f() && $$4.gk().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bvc.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(ebq $$0, ded $$1) {
      return !$$1.h() && $$1.n().h() == this.h() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ebq a(ded $$0) {
      ebq $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eya $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eyb.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(h) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return R[$$0.c(f) - 1];
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dkk $$0, iw $$1, ebq $$2, eya $$3) {
      if (!$$2.c(h) && $$3.a() == eyb.c) {
         ebq $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(ebq $$0) {
      return $$0.a(axn.ag, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fgc> b(ebq $$0) {
      return (Iterable<fgc>)D.get($$0.c(f));
   }

   @Override
   protected boolean d(ebq $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return dno.a($$1, $$2.e(), jc.b);
   }
}
