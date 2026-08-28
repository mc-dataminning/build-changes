import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cip {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bwc<?> a(bwc<cio> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqe.a));
      $$0.b(cqe.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwc<cio> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bwo(2.0F), new bxz(45, 90), new byd(), new bwz(cee.P)));
   }

   private static void c(bwc<cio> $$0) {
      $$0.a(
         cqe.b,
         ImmutableList.of(
            Pair.of(0, byt.a(bul.by, 6.0F, bro.a(30, 60))),
            Pair.of(1, new bxg($$0x -> 1.25F)),
            Pair.of(
               2,
               new bxh(
                  ImmutableMap.of(cee.m, cef.b),
                  ImmutableSet.of(),
                  bxh.a.a,
                  bxh.b.b,
                  ImmutableList.of(Pair.of(byl.c(0.5F), 2), Pair.of(bza.a(0.5F, 3), 3), Pair.of(cag.a(bue::bn), 5))
               )
            )
         )
      );
   }

   public static void a(cio $$0) {
      $$0.ed().a(ImmutableList.of(cqe.b));
   }
}
