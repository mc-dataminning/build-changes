import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cci {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bpy<?> a(bpy<cch> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cjn.a));
      $$0.b(cjn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpy<cch> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new bqk(2.0F), new brv(45, 90), new brz(), new bqv(bya.P)));
   }

   private static void c(bpy<cch> $$0) {
      $$0.a(
         cjn.b,
         ImmutableList.of(
            Pair.of(0, bsp.a(bol.bw, 6.0F, blw.a(30, 60))),
            Pair.of(1, new brc($$0x -> 1.25F)),
            Pair.of(
               2,
               new brd(
                  ImmutableMap.of(bya.m, byb.b),
                  ImmutableSet.of(),
                  brd.a.a,
                  brd.b.b,
                  ImmutableList.of(Pair.of(bsh.c(0.5F), 2), Pair.of(bsw.a(0.5F, 3), 3), Pair.of(buc.a(bof::bc), 5))
               )
            )
         )
      );
   }

   public static void a(cch $$0) {
      $$0.dM().a(ImmutableList.of(cjn.b));
   }
}
