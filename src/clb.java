import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class clb {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bye<?> a(bye<cla> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(csw.a));
      $$0.b(csw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bye<cla> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new byq(2.0F), new cab(45, 90), new caf(), new bzb(cgg.Q)));
   }

   private static void c(bye<cla> $$0) {
      $$0.a(
         csw.b,
         ImmutableList.of(
            Pair.of(0, cav.a(bwo.bS, 6.0F, bto.a(30, 60))),
            Pair.of(1, new bzi($$0x -> 1.25F)),
            Pair.of(
               2,
               new bzj(
                  ImmutableMap.of(cgg.n, cgh.b),
                  ImmutableSet.of(),
                  bzj.a.a,
                  bzj.b.b,
                  ImmutableList.of(Pair.of(can.c(0.5F), 2), Pair.of(cbc.a(0.5F, 3), 3), Pair.of(cci.a(bwf::bj), 5))
               )
            )
         )
      );
   }

   public static void a(cla $$0) {
      $$0.ec().a(ImmutableList.of(csw.b));
   }
}
