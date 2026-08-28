import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dxd extends dno implements duz {
   public static final MapCodec<dxd> a = b(dxd::new);
   public static final ech b = ecg.L;
   public static final eco<edd> c = ecg.Z;
   public static final eco<edd> d = ecg.aa;
   public static final eco<edd> e = ecg.ab;
   public static final eco<edd> f = ecg.ac;
   public static final Map<jc, eco<edd>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jc.c, d, jc.f, c, jc.d, e, jc.e, f)));
   public static final ech h = ecg.I;
   private final Function<ebq, fgw> i;
   private final Function<ebq, fgw> D;
   private static final fgw R = dno.b(2.0, 0.0, 16.0);
   private static final Map<jc, fgw> S = fgt.c(dno.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dxd> a() {
      return a;
   }

   public dxd(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(d, edd.a).b(c, edd.a).b(e, edd.a).b(f, edd.a).b(h, Boolean.valueOf(false)));
      this.i = this.a(16.0F, 14.0F);
      this.D = this.a(24.0F, 24.0F);
   }

   private Function<ebq, fgw> a(float $$0, float $$1) {
      fgw $$2 = dno.b(8.0, 0.0, (double)$$0);
      int $$3 = 6;
      Map<jc, fgw> $$4 = fgt.c(dno.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
      Map<jc, fgw> $$5 = fgt.c(dno.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
      return this.a($$3x -> {
         fgw $$4x = $$3x.c(b) ? $$2 : fgt.a();

         for (Entry<jc, eco<edd>> $$5x : g.entrySet()) {
            $$4x = fgt.a($$4x, switch ((edd)$$3x.c($$5x.getValue())) {
               case a -> fgt.a();
               case b -> (fgw)$$4.get($$5x.getKey());
               case c -> (fgw)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new ect[]{h});
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.D.apply($$0);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   private boolean a(ebq $$0, boolean $$1, jc $$2) {
      dno $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dqp && dqp.a($$0, $$2);
      return $$0.a(axn.N) || !k($$0) && $$1 || $$3 instanceof dru || $$4;
   }

   @Override
   public ebq a(ded $$0) {
      dkm $$1 = $$0.q();
      iw $$2 = $$0.a();
      eya $$3 = $$0.q().b_($$0.a());
      iw $$4 = $$2.f();
      iw $$5 = $$2.i();
      iw $$6 = $$2.g();
      iw $$7 = $$2.h();
      iw $$8 = $$2.d();
      ebq $$9 = $$1.a_($$4);
      ebq $$10 = $$1.a_($$5);
      ebq $$11 = $$1.a_($$6);
      ebq $$12 = $$1.a_($$7);
      ebq $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jc.d), jc.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jc.e), jc.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jc.c), jc.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jc.f), jc.f);
      ebq $$18 = this.m().b(h, Boolean.valueOf($$3.a() == eyb.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      if ($$4 == jc.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jc.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(ebq $$0, ect<edd> $$1) {
      return $$0.c($$1) != edd.a;
   }

   private static boolean a(fgw $$0, fgw $$1) {
      return !fgt.c($$1, $$0, fgg.e);
   }

   private ebq a(dkm $$0, ebq $$1, iw $$2, ebq $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private ebq a(dkm $$0, iw $$1, ebq $$2, iw $$3, ebq $$4, jc $$5) {
      jc $$6 = $$5.g();
      boolean $$7 = $$5 == jc.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jc.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jc.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jc.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      iw $$11 = $$1.d();
      ebq $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private ebq a(dkm $$0, ebq $$1, iw $$2, ebq $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fgw $$8 = $$3.g($$0, $$2).a(jc.a);
      ebq $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(ebq $$0, ebq $$1, fgw $$2) {
      boolean $$3 = $$1.b() instanceof dxd && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         edd $$4 = $$0.c(d);
         edd $$5 = $$0.c(e);
         edd $$6 = $$0.c(c);
         edd $$7 = $$0.c(f);
         boolean $$8 = $$5 == edd.a;
         boolean $$9 = $$7 == edd.a;
         boolean $$10 = $$6 == edd.a;
         boolean $$11 = $$4 == edd.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == edd.c && $$5 == edd.c || $$6 == edd.c && $$7 == edd.c;
            return $$13 ? false : $$1.a(axn.aR) || a($$2, R);
         }
      }
   }

   private ebq a(ebq $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fgw $$5) {
      return $$0.b(d, this.a($$1, $$5, S.get(jc.c)))
         .b(c, this.a($$2, $$5, S.get(jc.f)))
         .b(e, this.a($$3, $$5, S.get(jc.d)))
         .b(f, this.a($$4, $$5, S.get(jc.e)));
   }

   private edd a(boolean $$0, fgw $$1, fgw $$2) {
      if ($$0) {
         return a($$1, $$2) ? edd.c : edd.b;
      } else {
         return edd.a;
      }
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(h) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(ebq $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
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
   protected ebq a(ebq $$0, dsr $$1) {
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
