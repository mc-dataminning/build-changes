import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class byn {
   public static final int a = 20;
   public static final int b = 7;
   private static final bii i = bii.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bii p = bii.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bii q = bii.a(600, 6000);
   private static final bii r = bii.a(100, 300);
   private static final bvs s = bvs.a().a($$0 -> !$$0.ai().equals(bku.U) && $$0.dN().C_().a($$0.cH()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bym $$0, ats $$1) {
      $$0.dP().a(buh.R, p.a($$1));
      $$0.dP().a(buh.U, q.a($$1));
   }

   protected static bmg<?> a(bmg<bym> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cff.a));
      $$0.b(cff.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmg<bym> $$0) {
      $$0.a(cff.a, 0, ImmutableList.of(new bpq(0.8F), new bms(2.0F), new boc(45, 90), new bog(), new bnd(buh.O), new bnd(buh.R), new bnd(buh.U)));
   }

   private static void c(bmg<bym> $$0) {
      $$0.a(
         cff.b,
         ImmutableList.of(
            Pair.of(0, bow.a(bku.bt, 6.0F, bii.a(30, 60))),
            Pair.of(0, new bmr(bku.U, 1.0F)),
            Pair.of(1, new bnk($$0x -> 1.25F)),
            Pair.of(2, bmu.a(i, 1.25F)),
            Pair.of(3, new bot(ImmutableList.of(Pair.of(boo.a(1.0F), 2), Pair.of(bpd.a(1.0F, 3), 2), Pair.of(new bnh(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(buh.V, bui.b), Pair.of(buh.S, bui.b))
      );
   }

   private static void d(bmg<bym> $$0) {
      $$0.a(
         cff.q,
         ImmutableList.of(Pair.of(0, new bny(p, aqr.kq)), Pair.of(1, new boa<>(p, 5, 5, 1.5F, $$0x -> $$0x.gp() ? aqr.kl : aqr.kb))),
         ImmutableSet.of(Pair.of(buh.N, bui.b), Pair.of(buh.r, bui.b), Pair.of(buh.m, bui.b), Pair.of(buh.R, bui.b))
      );
   }

   private static void e(bmg<bym> $$0) {
      $$0.a(
         cff.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bom(
                  $$0x -> $$0x.gp() ? r : q, s, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.gp() ? aqr.ko : aqr.ke, $$0x -> $$0x.gp() ? aqr.kp : aqr.kf
               )
            ),
            Pair.of(1, new bol<>($$0x -> $$0x.gp() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.gp() ? aqr.kn : aqr.kd))
         ),
         ImmutableSet.of(Pair.of(buh.N, bui.b), Pair.of(buh.r, bui.b), Pair.of(buh.U, bui.b))
      );
   }

   public static void a(bym $$0) {
      $$0.dP().a(ImmutableList.of(cff.r, cff.q, cff.b));
   }

   public static cok a() {
      return cok.a(clm.pt);
   }
}
