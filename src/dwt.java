import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dwt extends dne implements dup {
   public static final MapCodec<dwt> a = b(dwt::new);
   public static final ebx b = ebw.L;
   public static final ece<ect> c = ebw.Z;
   public static final ece<ect> d = ebw.aa;
   public static final ece<ect> e = ebw.ab;
   public static final ece<ect> f = ebw.ac;
   public static final Map<jc, ece<ect>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jc.c, d, jc.f, c, jc.d, e, jc.e, f)));
   public static final ebx h = ebw.I;
   private final Function<ebg, fgm> i;
   private final Function<ebg, fgm> D;
   private static final fgm R = dne.b(2.0, 0.0, 16.0);
   private static final Map<jc, fgm> S = fgj.c(dne.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dwt> a() {
      return a;
   }

   public dwt(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(d, ect.a).b(c, ect.a).b(e, ect.a).b(f, ect.a).b(h, Boolean.valueOf(false)));
      this.i = this.a(16.0F, 14.0F);
      this.D = this.a(24.0F, 24.0F);
   }

   private Function<ebg, fgm> a(float $$0, float $$1) {
      fgm $$2 = dne.b(8.0, 0.0, (double)$$0);
      int $$3 = 6;
      Map<jc, fgm> $$4 = fgj.c(dne.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
      Map<jc, fgm> $$5 = fgj.c(dne.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
      return this.a($$3x -> {
         fgm $$4x = $$3x.c(b) ? $$2 : fgj.a();

         for (Entry<jc, ece<ect>> $$5x : g.entrySet()) {
            $$4x = fgj.a($$4x, switch ((ect)$$3x.c($$5x.getValue())) {
               case a -> fgj.a();
               case b -> (fgm)$$4.get($$5x.getKey());
               case c -> (fgm)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new ecj[]{h});
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.D.apply($$0);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   private boolean a(ebg $$0, boolean $$1, jc $$2) {
      dne $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dqf && dqf.a($$0, $$2);
      return $$0.a(axg.N) || !k($$0) && $$1 || $$3 instanceof drk || $$4;
   }

   @Override
   public ebg a(ddt $$0) {
      dkc $$1 = $$0.q();
      iw $$2 = $$0.a();
      exq $$3 = $$0.q().b_($$0.a());
      iw $$4 = $$2.f();
      iw $$5 = $$2.i();
      iw $$6 = $$2.g();
      iw $$7 = $$2.h();
      iw $$8 = $$2.d();
      ebg $$9 = $$1.a_($$4);
      ebg $$10 = $$1.a_($$5);
      ebg $$11 = $$1.a_($$6);
      ebg $$12 = $$1.a_($$7);
      ebg $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jc.d), jc.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jc.e), jc.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jc.c), jc.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jc.f), jc.f);
      ebg $$18 = this.m().b(h, Boolean.valueOf($$3.a() == exr.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      if ($$4 == jc.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jc.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(ebg $$0, ecj<ect> $$1) {
      return $$0.c($$1) != ect.a;
   }

   private static boolean a(fgm $$0, fgm $$1) {
      return !fgj.c($$1, $$0, ffw.e);
   }

   private ebg a(dkc $$0, ebg $$1, iw $$2, ebg $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private ebg a(dkc $$0, iw $$1, ebg $$2, iw $$3, ebg $$4, jc $$5) {
      jc $$6 = $$5.g();
      boolean $$7 = $$5 == jc.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jc.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jc.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jc.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      iw $$11 = $$1.d();
      ebg $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private ebg a(dkc $$0, ebg $$1, iw $$2, ebg $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fgm $$8 = $$3.g($$0, $$2).a(jc.a);
      ebg $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(ebg $$0, ebg $$1, fgm $$2) {
      boolean $$3 = $$1.b() instanceof dwt && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         ect $$4 = $$0.c(d);
         ect $$5 = $$0.c(e);
         ect $$6 = $$0.c(c);
         ect $$7 = $$0.c(f);
         boolean $$8 = $$5 == ect.a;
         boolean $$9 = $$7 == ect.a;
         boolean $$10 = $$6 == ect.a;
         boolean $$11 = $$4 == ect.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == ect.c && $$5 == ect.c || $$6 == ect.c && $$7 == ect.c;
            return $$13 ? false : $$1.a(axg.aR) || a($$2, R);
         }
      }
   }

   private ebg a(ebg $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fgm $$5) {
      return $$0.b(d, this.a($$1, $$5, S.get(jc.c)))
         .b(c, this.a($$2, $$5, S.get(jc.f)))
         .b(e, this.a($$3, $$5, S.get(jc.d)))
         .b(f, this.a($$4, $$5, S.get(jc.e)));
   }

   private ect a(boolean $$0, fgm $$1, fgm $$2) {
      if ($$0) {
         return a($$1, $$2) ? ect.c : ect.b;
      } else {
         return ect.a;
      }
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(h) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(ebg $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      switch ($$1) {
         case c:
            return $$0.b(d, $$0.c(e)).b(c, $$0.c(f)).b(e, $$0.c(d)).b(f, $$0.c(c));
         case d:
            return $$0.b(d, $$0.c(c)).b(c, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(d));
         case b:
            return $$0.b(d, $$0.c(f)).b(c, $$0.c(d)).b(e, $$0.c(c)).b(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      switch ($$1) {
         case b:
            return $$0.b(d, $$0.c(e)).b(e, $$0.c(d));
         case c:
            return $$0.b(c, $$0.c(f)).b(f, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }
}
