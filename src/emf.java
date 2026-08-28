import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class emf {
   public static final alo<eme> a = a("classic_flat");
   public static final alo<eme> b = a("tunnelers_dream");
   public static final alo<eme> c = a("water_world");
   public static final alo<eme> d = a("overworld");
   public static final alo<eme> e = a("snowy_kingdom");
   public static final alo<eme> f = a("bottomless_pit");
   public static final alo<eme> g = a("desert");
   public static final alo<eme> h = a("redstone_ready");
   public static final alo<eme> i = a("the_void");

   public static void a(ra<eme> $$0) {
      new emf.a($$0).a();
   }

   private static alo<eme> a(String $$0) {
      return alo.a(mb.aQ, alp.b($$0));
   }

   static class a {
      private final ra<eme> a;

      a(ra<eme> $$0) {
         this.a = $$0;
      }

      private void a(alo<eme> $$0, dgy $$1, alo<dib> $$2, Set<alo<eoj>> $$3, boolean $$4, boolean $$5, emd... $$6) {
         jr<eoj> $$7 = this.a.a(mb.aW);
         jr<enh> $$8 = this.a.a(mb.aT);
         jr<dib> $$9 = this.a.a(mb.aI);
         ju.a<eoj> $$10 = ju.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         emg $$11 = new emg(Optional.of($$10), $$9.b($$2), emg.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eme($$1.j().f(), $$11));
      }

      public void a() {
         this.a(emf.a, dkf.i, dii.b, ImmutableSet.of(enw.a), false, false, new emd(1, dkf.i), new emd(2, dkf.j), new emd(1, dkf.I));
         this.a(emf.b, dkf.b, dii.u, ImmutableSet.of(enw.j, enw.r), true, false, new emd(1, dkf.i), new emd(5, dkf.j), new emd(230, dkf.b), new emd(1, dkf.I));
         this.a(
            emf.c,
            cxk.rg,
            dii.U,
            ImmutableSet.of(enw.m, enw.l, enw.g),
            false,
            false,
            new emd(90, dkf.J),
            new emd(5, dkf.O),
            new emd(5, dkf.j),
            new emd(5, dkf.b),
            new emd(64, dkf.tl),
            new emd(1, dkf.I)
         );
         this.a(
            emf.d,
            dkf.bA,
            dii.b,
            ImmutableSet.of(enw.a, enw.j, enw.f, enw.k, enw.r),
            true,
            true,
            new emd(1, dkf.i),
            new emd(3, dkf.j),
            new emd(59, dkf.b),
            new emd(1, dkf.I)
         );
         this.a(
            emf.e,
            dkf.ea,
            dii.d,
            ImmutableSet.of(enw.a, enw.c),
            false,
            false,
            new emd(1, dkf.ea),
            new emd(1, dkf.i),
            new emd(3, dkf.j),
            new emd(59, dkf.b),
            new emd(1, dkf.I)
         );
         this.a(emf.f, cxk.pY, dii.b, ImmutableSet.of(enw.a), false, false, new emd(1, dkf.i), new emd(3, dkf.j), new emd(2, dkf.m));
         this.a(
            emf.g,
            dkf.L,
            dii.f,
            ImmutableSet.of(enw.a, enw.b, enw.j, enw.r),
            true,
            false,
            new emd(8, dkf.L),
            new emd(52, dkf.bc),
            new emd(3, dkf.b),
            new emd(1, dkf.I)
         );
         this.a(emf.h, cxk.me, dii.f, ImmutableSet.of(), false, false, new emd(116, dkf.bc), new emd(3, dkf.b), new emd(1, dkf.I));
         this.a(emf.i, dkf.iu, dii.a, ImmutableSet.of(), true, false, new emd(1, dkf.a));
      }
   }
}
