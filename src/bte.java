import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bte {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bha<?> a(bha<btd> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(bzz.a));
      $$0.b(bzz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bha<btd> $$0) {
      $$0.a(bzz.a, 0, ImmutableList.of(new bhm(2.0F), new biw(45, 90), new bja(), new bhx(bpb.O)));
   }

   private static void c(bha<btd> $$0) {
      $$0.a(
         bzz.b,
         ImmutableList.of(
            Pair.of(0, bjq.a(bfn.bt, 6.0F, bdi.a(30, 60))),
            Pair.of(1, new bie($$0x -> 1.25F)),
            Pair.of(
               2,
               new bif(
                  ImmutableMap.of(bpb.m, bpc.b),
                  ImmutableSet.of(),
                  bif.a.a,
                  bif.b.b,
                  ImmutableList.of(Pair.of(bji.c(0.5F), 2), Pair.of(bjx.a(0.5F, 3), 3), Pair.of(bld.a(bfj::aY), 5))
               )
            )
         )
      );
   }

   public static void a(btd $$0) {
      $$0.dK().a(ImmutableList.of(bzz.b));
   }
}
