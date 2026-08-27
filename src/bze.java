import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bze {
   public static final int a = 20;
   public static final int b = 7;
   private static final biw i = biw.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final biw p = biw.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final biw q = biw.a(600, 6000);
   private static final biw r = biw.a(100, 300);
   private static final bwj s = bwj.a().a($$0 -> !$$0.ai().equals(blj.V) && $$0.dM().D_().a($$0.cH()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bzd $$0, auf $$1) {
      $$0.dO().a(bux.R, p.a($$1));
      $$0.dO().a(bux.U, q.a($$1));
   }

   protected static bmv<?> a(bmv<bzd> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cgd.a));
      $$0.b(cgd.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmv<bzd> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bqg(0.8F), new bnh(2.0F), new bos(45, 90), new bow(), new bns(bux.O), new bns(bux.R), new bns(bux.U)));
   }

   private static void c(bmv<bzd> $$0) {
      $$0.a(
         cgd.b,
         ImmutableList.of(
            Pair.of(0, bpm.a(blj.bv, 6.0F, biw.a(30, 60))),
            Pair.of(0, new bng(blj.V, 1.0F)),
            Pair.of(1, new bnz($$0x -> 1.25F)),
            Pair.of(2, bnj.a(i, 1.25F)),
            Pair.of(3, new bpj(ImmutableList.of(Pair.of(bpe.a(1.0F), 2), Pair.of(bpt.a(1.0F, 3), 2), Pair.of(new bnw(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bux.V, buy.b), Pair.of(bux.S, buy.b))
      );
   }

   private static void d(bmv<bzd> $$0) {
      $$0.a(
         cgd.q,
         ImmutableList.of(Pair.of(0, new bon(p, arc.kz)), Pair.of(1, new bop<>(p, 5, 5, 1.5F, $$0x -> $$0x.go() ? arc.ku : arc.kk))),
         ImmutableSet.of(Pair.of(bux.N, buy.b), Pair.of(bux.r, buy.b), Pair.of(bux.m, buy.b), Pair.of(bux.R, buy.b))
      );
   }

   private static void e(bmv<bzd> $$0) {
      $$0.a(
         cgd.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bpc(
                  $$0x -> $$0x.go() ? r : q, s, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.go() ? arc.kx : arc.kn, $$0x -> $$0x.go() ? arc.ky : arc.ko
               )
            ),
            Pair.of(1, new bpb<>($$0x -> $$0x.go() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.go() ? arc.kw : arc.km))
         ),
         ImmutableSet.of(Pair.of(bux.N, buy.b), Pair.of(bux.r, buy.b), Pair.of(bux.U, buy.b))
      );
   }

   public static void a(bzd $$0) {
      $$0.dO().a(ImmutableList.of(cgd.r, cgd.q, cgd.b));
   }

   public static cpi a() {
      return cpi.a(cmk.pt);
   }
}
