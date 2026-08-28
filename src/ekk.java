import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ekk {
   public static final ali<ekj> a = a("classic_flat");
   public static final ali<ekj> b = a("tunnelers_dream");
   public static final ali<ekj> c = a("water_world");
   public static final ali<ekj> d = a("overworld");
   public static final ali<ekj> e = a("snowy_kingdom");
   public static final ali<ekj> f = a("bottomless_pit");
   public static final ali<ekj> g = a("desert");
   public static final ali<ekj> h = a("redstone_ready");
   public static final ali<ekj> i = a("the_void");

   public static void a(qz<ekj> $$0) {
      new ekk.a($$0).a();
   }

   private static ali<ekj> a(String $$0) {
      return ali.a(ma.aO, alj.b($$0));
   }

   static class a {
      private final qz<ekj> a;

      a(qz<ekj> $$0) {
         this.a = $$0;
      }

      private void a(ali<ekj> $$0, dfl $$1, ali<dgo> $$2, Set<ali<emo>> $$3, boolean $$4, boolean $$5, eki... $$6) {
         jr<emo> $$7 = this.a.a(ma.aU);
         jr<elm> $$8 = this.a.a(ma.aR);
         jr<dgo> $$9 = this.a.a(ma.aG);
         ju.a<emo> $$10 = ju.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         ekl $$11 = new ekl(Optional.of($$10), $$9.b($$2), ekl.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ekj($$1.j().f(), $$11));
      }

      public void a() {
         this.a(ekk.a, dis.i, dgv.b, ImmutableSet.of(emb.a), false, false, new eki(1, dis.i), new eki(2, dis.j), new eki(1, dis.F));
         this.a(ekk.b, dis.b, dgv.t, ImmutableSet.of(emb.j, emb.r), true, false, new eki(1, dis.i), new eki(5, dis.j), new eki(230, dis.b), new eki(1, dis.F));
         this.a(
            ekk.c,
            cwq.qA,
            dgv.T,
            ImmutableSet.of(emb.m, emb.l, emb.g),
            false,
            false,
            new eki(90, dis.G),
            new eki(5, dis.L),
            new eki(5, dis.j),
            new eki(5, dis.b),
            new eki(64, dis.sJ),
            new eki(1, dis.F)
         );
         this.a(
            ekk.d,
            dis.bt,
            dgv.b,
            ImmutableSet.of(emb.a, emb.j, emb.f, emb.k, emb.r),
            true,
            true,
            new eki(1, dis.i),
            new eki(3, dis.j),
            new eki(59, dis.b),
            new eki(1, dis.F)
         );
         this.a(
            ekk.e,
            dis.dN,
            dgv.d,
            ImmutableSet.of(emb.a, emb.c),
            false,
            false,
            new eki(1, dis.dN),
            new eki(1, dis.i),
            new eki(3, dis.j),
            new eki(59, dis.b),
            new eki(1, dis.F)
         );
         this.a(ekk.f, cwq.pu, dgv.b, ImmutableSet.of(emb.a), false, false, new eki(1, dis.i), new eki(3, dis.j), new eki(2, dis.m));
         this.a(
            ekk.g,
            dis.I,
            dgv.f,
            ImmutableSet.of(emb.a, emb.b, emb.j, emb.r),
            true,
            false,
            new eki(8, dis.I),
            new eki(52, dis.aV),
            new eki(3, dis.b),
            new eki(1, dis.F)
         );
         this.a(ekk.h, cwq.lH, dgv.f, ImmutableSet.of(), false, false, new eki(116, dis.aV), new eki(3, dis.b), new eki(1, dis.F));
         this.a(ekk.i, dis.hW, dgv.a, ImmutableSet.of(), true, false, new eki(1, dis.a));
      }
   }
}
