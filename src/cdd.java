import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cdd {
   public static final int a = 20;
   public static final int b = 7;
   private static final bmo i = bmo.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bmo o = bmo.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bmo p = bmo.a(600, 6000);
   private static final bmo q = bmo.a(100, 300);
   private static final caf r = caf.a().a($$0 -> !$$0.ai().equals(bpd.Y) && $$0.dM().C_().a($$0.cH()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cdc $$0, axd $$1) {
      $$0.dP().a(bys.S, o.a($$1));
      $$0.dP().a(bys.V, p.a($$1));
   }

   protected static bqq<?> a(bqq<cdc> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ckj.a));
      $$0.b(ckj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqq<cdc> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new bub(0.8F), new brc(2.0F), new bsn(45, 90), new bsr(), new brn(bys.P), new brn(bys.S), new brn(bys.V)));
   }

   private static void c(bqq<cdc> $$0) {
      $$0.a(
         ckj.b,
         ImmutableList.of(
            Pair.of(0, bth.a(bpd.by, 6.0F, bmo.a(30, 60))),
            Pair.of(0, new brb(bpd.Y)),
            Pair.of(1, new bru($$0x -> 1.25F)),
            Pair.of(2, bre.a(i, 1.25F)),
            Pair.of(3, new bte(ImmutableList.of(Pair.of(bsz.a(1.0F), 2), Pair.of(bto.a(1.0F, 3), 2), Pair.of(new brr(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bys.W, byt.b), Pair.of(bys.T, byt.b))
      );
   }

   private static void d(bqq<cdc> $$0) {
      $$0.a(
         ckj.q,
         ImmutableList.of(Pair.of(0, new bsi(o, aty.kW)), Pair.of(1, new bsk<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gx() ? aty.kR : aty.kH))),
         ImmutableSet.of(Pair.of(bys.O, byt.b), Pair.of(bys.r, byt.b), Pair.of(bys.m, byt.b), Pair.of(bys.S, byt.b))
      );
   }

   private static void e(bqq<cdc> $$0) {
      $$0.a(
         ckj.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bsx(
                  $$0x -> $$0x.gx() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gx() ? aty.kU : aty.kK, $$0x -> $$0x.gx() ? aty.kV : aty.kL
               )
            ),
            Pair.of(1, new bsw<>($$0x -> $$0x.gx() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gx() ? aty.kT : aty.kJ))
         ),
         ImmutableSet.of(Pair.of(bys.O, byt.b), Pair.of(bys.r, byt.b), Pair.of(bys.V, byt.b))
      );
   }

   public static void a(cdc $$0) {
      $$0.dP().a(ImmutableList.of(ckj.r, ckj.q, ckj.b));
   }

   public static ctm a() {
      return ctm.a(cqp.pv);
   }
}
