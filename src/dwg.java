import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dwg extends dmr implements duc {
   public static final MapCodec<dwg> a = b(dwg::new);
   public static final ebk b = ebj.L;
   public static final ebr<ecg> c = ebj.Z;
   public static final ebr<ecg> d = ebj.aa;
   public static final ebr<ecg> e = ebj.ab;
   public static final ebr<ecg> f = ebj.ac;
   public static final Map<jb, ebr<ecg>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, d, jb.f, c, jb.d, e, jb.e, f)));
   public static final ebk h = ebj.I;
   private final Function<eat, ffw> i;
   private final Function<eat, ffw> D;
   private static final ffw R = dmr.b(2.0, 0.0, 16.0);
   private static final Map<jb, ffw> S = fft.c(dmr.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dwg> a() {
      return a;
   }

   public dwg(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(d, ecg.a).b(c, ecg.a).b(e, ecg.a).b(f, ecg.a).b(h, Boolean.valueOf(false)));
      this.i = this.a(16.0F, 14.0F);
      this.D = this.a(24.0F, 24.0F);
   }

   private Function<eat, ffw> a(float $$0, float $$1) {
      ffw $$2 = dmr.b(8.0, 0.0, (double)$$0);
      int $$3 = 6;
      Map<jb, ffw> $$4 = fft.c(dmr.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
      Map<jb, ffw> $$5 = fft.c(dmr.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
      return this.a($$3x -> {
         ffw $$4x = $$3x.c(b) ? $$2 : fft.a();

         for (Entry<jb, ebr<ecg>> $$5x : g.entrySet()) {
            $$4x = fft.a($$4x, switch ((ecg)$$3x.c($$5x.getValue())) {
               case a -> fft.a();
               case b -> (ffw)$$4.get($$5x.getKey());
               case c -> (ffw)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new ebw[]{h});
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.D.apply($$0);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   private boolean a(eat $$0, boolean $$1, jb $$2) {
      dmr $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dps && dps.a($$0, $$2);
      return $$0.a(axc.N) || !k($$0) && $$1 || $$3 instanceof dqx || $$4;
   }

   @Override
   public eat a(ddg $$0) {
      djp $$1 = $$0.q();
      iv $$2 = $$0.a();
      exa $$3 = $$0.q().b_($$0.a());
      iv $$4 = $$2.f();
      iv $$5 = $$2.i();
      iv $$6 = $$2.g();
      iv $$7 = $$2.h();
      iv $$8 = $$2.d();
      eat $$9 = $$1.a_($$4);
      eat $$10 = $$1.a_($$5);
      eat $$11 = $$1.a_($$6);
      eat $$12 = $$1.a_($$7);
      eat $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jb.d), jb.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jb.e), jb.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jb.c), jb.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jb.f), jb.f);
      eat $$18 = this.m().b(h, Boolean.valueOf($$3.a() == exb.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      if ($$4 == jb.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jb.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(eat $$0, ebw<ecg> $$1) {
      return $$0.c($$1) != ecg.a;
   }

   private static boolean a(ffw $$0, ffw $$1) {
      return !fft.c($$1, $$0, ffg.e);
   }

   private eat a(djp $$0, eat $$1, iv $$2, eat $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private eat a(djp $$0, iv $$1, eat $$2, iv $$3, eat $$4, jb $$5) {
      jb $$6 = $$5.g();
      boolean $$7 = $$5 == jb.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jb.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jb.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jb.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      iv $$11 = $$1.d();
      eat $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private eat a(djp $$0, eat $$1, iv $$2, eat $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ffw $$8 = $$3.g($$0, $$2).a(jb.a);
      eat $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(eat $$0, eat $$1, ffw $$2) {
      boolean $$3 = $$1.b() instanceof dwg && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         ecg $$4 = $$0.c(d);
         ecg $$5 = $$0.c(e);
         ecg $$6 = $$0.c(c);
         ecg $$7 = $$0.c(f);
         boolean $$8 = $$5 == ecg.a;
         boolean $$9 = $$7 == ecg.a;
         boolean $$10 = $$6 == ecg.a;
         boolean $$11 = $$4 == ecg.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == ecg.c && $$5 == ecg.c || $$6 == ecg.c && $$7 == ecg.c;
            return $$13 ? false : $$1.a(axc.aR) || a($$2, R);
         }
      }
   }

   private eat a(eat $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ffw $$5) {
      return $$0.b(d, this.a($$1, $$5, S.get(jb.c)))
         .b(c, this.a($$2, $$5, S.get(jb.f)))
         .b(e, this.a($$3, $$5, S.get(jb.d)))
         .b(f, this.a($$4, $$5, S.get(jb.e)));
   }

   private ecg a(boolean $$0, ffw $$1, ffw $$2) {
      if ($$0) {
         return a($$1, $$2) ? ecg.c : ecg.b;
      } else {
         return ecg.a;
      }
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(h) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(eat $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
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
   protected eat a(eat $$0, dru $$1) {
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
