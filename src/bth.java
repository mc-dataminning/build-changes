import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bth {
   public static final int a = 20;
   public static final int b = 7;
   private static final bdi i = bdi.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bdi p = bdi.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bdi q = bdi.a(600, 6000);
   private static final bdi r = bdi.a(100, 300);
   private static final bqm s = bqm.a().a($$0 -> !$$0.ae().equals(bfn.U) && $$0.dI().w_().a($$0.cE()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(btg $$0, apf $$1) {
      $$0.dK().a(bpb.R, p.a($$1));
      $$0.dK().a(bpb.U, q.a($$1));
   }

   protected static bha<?> a(bha<btg> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(bzz.a));
      $$0.b(bzz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bha<btg> $$0) {
      $$0.a(bzz.a, 0, ImmutableList.of(new bkk(0.8F), new bhm(2.0F), new biw(45, 90), new bja(), new bhx(bpb.O), new bhx(bpb.R), new bhx(bpb.U)));
   }

   private static void c(bha<btg> $$0) {
      $$0.a(
         bzz.b,
         ImmutableList.of(
            Pair.of(0, bjq.a(bfn.bt, 6.0F, bdi.a(30, 60))),
            Pair.of(0, new bhl(bfn.U, 1.0F)),
            Pair.of(1, new bie($$0x -> 1.25F)),
            Pair.of(2, bho.a(i, 1.25F)),
            Pair.of(3, new bjn(ImmutableList.of(Pair.of(bji.a(1.0F), 2), Pair.of(bjx.a(1.0F, 3), 2), Pair.of(new bib(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bpb.V, bpc.b), Pair.of(bpb.S, bpc.b))
      );
   }

   private static void d(bha<btg> $$0) {
      $$0.a(
         bzz.q,
         ImmutableList.of(Pair.of(0, new bis(p, amh.jW)), Pair.of(1, new biu<>(p, 5, 5, 1.5F, $$0x -> $$0x.gi() ? amh.jR : amh.jH))),
         ImmutableSet.of(Pair.of(bpb.N, bpc.b), Pair.of(bpb.r, bpc.b), Pair.of(bpb.m, bpc.b), Pair.of(bpb.R, bpc.b))
      );
   }

   private static void e(bha<btg> $$0) {
      $$0.a(
         bzz.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bjg(
                  $$0x -> $$0x.gi() ? r : q, s, 3.0F, $$0x -> $$0x.h_() ? 1.0 : 2.5, $$0x -> $$0x.gi() ? amh.jU : amh.jK, $$0x -> $$0x.gi() ? amh.jV : amh.jL
               )
            ),
            Pair.of(1, new bjf<>($$0x -> $$0x.gi() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.gi() ? amh.jT : amh.jJ))
         ),
         ImmutableSet.of(Pair.of(bpb.N, bpc.b), Pair.of(bpb.r, bpc.b), Pair.of(bpb.U, bpc.b))
      );
   }

   public static void a(btg $$0) {
      $$0.dK().a(ImmutableList.of(bzz.r, bzz.q, bzz.b));
   }

   public static ciz a() {
      return ciz.a(cgc.oI);
   }
}
