import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class bzk {
   public static final cqh a = cqh.a(cnj.sl);
   private static final float b = 2.0F;
   private static final float c = 1.0F;
   private static final float d = 1.25F;
   private static final float e = 1.1F;
   private static final float f = 1.0F;
   private static final bjn g = bjn.a(5, 16);
   private static final ImmutableList<bwx<? extends bww<? super bzj>>> h = ImmutableList.of(bwx.c, bwx.f, bwx.u, bwx.o, bwx.k);
   private static final ImmutableList<bvq<?>> i = ImmutableList.of(
      bvq.Z, bvq.x, bvq.y, bvq.m, bvq.n, bvq.E, bvq.t, bvq.h, bvq.O, bvq.P, bvq.Q, bvq.R, new bvq[]{bvq.r, bvq.K, bvq.G}
   );
   private static final bpq<bzj> j = brs.a(
      (Function<brs.b<bzj>, ? extends App<brs.c<bzj>, brv<bzj>>>)($$0 -> $$0.group($$0.c(bvq.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.w()) {
                  $$1.w($$1.gn());
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bno.b<bzj> a() {
      return bno.a(i, h);
   }

   protected static bno<?> a(bno<bzj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(chc.a));
      $$0.b(chc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bno<bzj> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new bqz(0.8F), new bzk.b(2.0F), new bpl(45, 90), new bpp() {
         @Override
         protected boolean a(ane $$0, bmq $$1) {
            if ($$1 instanceof bzj $$2 && $$2.w()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bol(bvq.P), new bol(bvq.Q), j));
   }

   private static void c(bno<bzj> $$0) {
      $$0.a(
         chc.b,
         ImmutableList.of(
            Pair.of(0, bqf.a(bmc.bw, 6.0F, bjn.a(30, 60))),
            Pair.of(1, new bnz(bmc.d, 1.0F)),
            Pair.of(2, new bqc(ImmutableList.of(Pair.of(new bos($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(boc.a(g, 1.1F), 1)))),
            Pair.of(3, new bpw(bjn.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bqc(ImmutableMap.of(bvq.m, bvr.b), ImmutableList.of(Pair.of(bpx.a(1.0F), 1), Pair.of(bqm.a(1.0F, 3), 1), Pair.of(new bop(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bno<bzj> $$0) {
      $$0.a(chc.g, ImmutableList.of(Pair.of(0, new bzk.a())), Set.of(Pair.of(bvq.G, bvr.a)));
   }

   public static void a(bzj $$0) {
      $$0.dN().a(ImmutableList.of(chc.g, chc.b));
   }

   public static cqh b() {
      return a;
   }

   public static class a extends bof<bzj> {
      public a() {
         super(Map.of());
      }

      protected void a(ane $$0, bzj $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if ($$1.gf()) {
            $$1.a(bzj.a.c);
            if ($$1.aC()) {
               $$1.dL().a(null, $$1.dl(), art.ai, $$1.db(), 1.0F, 1.0F);
            }
         }
      }

      protected boolean a(ane $$0, bzj $$1) {
         return $$1.aC();
      }

      protected boolean b(ane $$0, bzj $$1, long $$2) {
         return true;
      }

      protected void c(ane $$0, bzj $$1, long $$2) {
         $$1.gl();
      }

      protected void d(ane $$0, bzj $$1, long $$2) {
         if (!$$1.gn()) {
            $$1.w(false);
         }
      }
   }

   public static class b extends boa {
      public b(float $$0) {
         super($$0);
      }

      @Override
      protected void b(ane $$0, bmx $$1, long $$2) {
         if ($$1 instanceof bzj $$3) {
            $$3.w(true);
         }

         super.b($$0, $$1, $$2);
      }
   }
}
