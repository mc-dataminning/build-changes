import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cda {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bqq<?> a(bqq<ccz> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ckj.a));
      $$0.b(ckj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqq<ccz> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new brc(2.0F), new bsn(45, 90), new bsr(), new brn(bys.P)));
   }

   private static void c(bqq<ccz> $$0) {
      $$0.a(
         ckj.b,
         ImmutableList.of(
            Pair.of(0, bth.a(bpd.by, 6.0F, bmo.a(30, 60))),
            Pair.of(1, new bru($$0x -> 1.25F)),
            Pair.of(
               2,
               new brv(
                  ImmutableMap.of(bys.m, byt.b),
                  ImmutableSet.of(),
                  brv.a.a,
                  brv.b.b,
                  ImmutableList.of(Pair.of(bsz.c(0.5F), 2), Pair.of(bto.a(0.5F, 3), 3), Pair.of(buu.a(box::bf), 5))
               )
            )
         )
      );
   }

   public static void a(ccz $$0) {
      $$0.dP().a(ImmutableList.of(ckj.b));
   }
}
