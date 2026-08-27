import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class edg {
   private static final Logger a = LogUtils.getLogger();
   protected static final dmz e = dac.nc.o();
   protected ecu f;
   @Nullable
   private ih b;
   private dew c;
   private dgm d;
   protected int g;
   private final edt h;
   private static final Set<daa> i = ImmutableSet.builder()
      .add(dac.fo)
      .add(dac.cp)
      .add(dac.cq)
      .add(dac.dU)
      .add(dac.kd)
      .add(dac.ki)
      .add(dac.kg)
      .add(dac.ke)
      .add(dac.kf)
      .add(dac.cO)
      .add(dac.eW)
      .build();

   protected edg(edt $$0, int $$1, ecu $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public edg(edt $$0, ta $$1) {
      this(
         $$0, $$1.h("GD"), (ecu)ecu.a.parse(to.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ih.b($$2));
   }

   protected static ecu a(int $$0, int $$1, int $$2, ih $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ih.a.c
         ? new ecu($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new ecu($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ih a(axd $$0) {
      return ih.c.a.a($$0);
   }

   public final ta a(eds $$0) {
      ta $$1 = new ta();
      $$1.a("id", ki.S.b(this.k()).toString());
      ecu.a.encodeStart(to.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ih $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(eds var1, ta var2);

   public void a(edg $$0, edh $$1, axd $$2) {
   }

   public abstract void a(cxu var1, cxs var2, dow var3, axd var4, ecu var5, cwg var6, ib var7);

   public ecu f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cwg $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public ib h() {
      return new ib(this.f.g());
   }

   protected ib.a b(int $$0, int $$1, int $$2) {
      return new ib.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ih $$2 = this.i();
      if ($$2 == null) {
         return $$0;
      } else {
         switch ($$2) {
            case c:
            case d:
               return this.f.h() + $$0;
            case e:
               return this.f.k() - $$1;
            case f:
               return this.f.h() + $$1;
            default:
               return $$0;
         }
      }
   }

   protected int b(int $$0) {
      return this.i() == null ? $$0 : $$0 + this.f.i();
   }

   protected int b(int $$0, int $$1) {
      ih $$2 = this.i();
      if ($$2 == null) {
         return $$1;
      } else {
         switch ($$2) {
            case c:
               return this.f.m() - $$1;
            case d:
               return this.f.j() + $$1;
            case e:
            case f:
               return this.f.j() + $$0;
            default:
               return $$1;
         }
      }
   }

   protected void a(cxu $$0, dmz $$1, int $$2, int $$3, int $$4, ecu $$5) {
      ib $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cxc)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dew.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dgm.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            ein $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cxc $$0, int $$1, int $$2, int $$3, ecu $$4) {
      return true;
   }

   protected dmz a(cwf $$0, int $$1, int $$2, int $$3, ecu $$4) {
      ib $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dac.a.o() : $$0.a_($$5);
   }

   protected boolean b(cxc $$0, int $$1, int $$2, int $$3, ecu $$4) {
      ib $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dsm.a.c, $$5.u(), $$5.w());
   }

   protected void a(cxu $$0, ecu $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dac.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(cxu $$0, ecu $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dmz $$8, dmz $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cwf)$$0, $$12, $$11, $$13, $$1).i()) {
                  if ($$11 != $$3 && $$11 != $$6 && $$12 != $$2 && $$12 != $$5 && $$13 != $$4 && $$13 != $$7) {
                     this.a($$0, $$9, $$12, $$11, $$13, $$1);
                  } else {
                     this.a($$0, $$8, $$12, $$11, $$13, $$1);
                  }
               }
            }
         }
      }
   }

   protected void a(cxu $$0, ecu $$1, ecu $$2, dmz $$3, dmz $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(cxu $$0, ecu $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, axd $$9, edg.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cwf)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(cxu $$0, ecu $$1, ecu $$2, boolean $$3, axd $$4, edg.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(cxu $$0, ecu $$1, axd $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dmz $$10, dmz $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cwf)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
                  if ($$14 != $$5 && $$14 != $$8 && $$15 != $$4 && $$15 != $$7 && $$16 != $$6 && $$16 != $$9) {
                     this.a($$0, $$11, $$15, $$14, $$16, $$1);
                  } else {
                     this.a($$0, $$10, $$15, $$14, $$16, $$1);
                  }
               }
            }
         }
      }
   }

   protected void a(cxu $$0, ecu $$1, axd $$2, float $$3, int $$4, int $$5, int $$6, dmz $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(cxu $$0, ecu $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dmz $$8, boolean $$9) {
      float $$10 = (float)($$5 - $$2 + 1);
      float $$11 = (float)($$6 - $$3 + 1);
      float $$12 = (float)($$7 - $$4 + 1);
      float $$13 = (float)$$2 + $$10 / 2.0F;
      float $$14 = (float)$$4 + $$12 / 2.0F;

      for (int $$15 = $$3; $$15 <= $$6; $$15++) {
         float $$16 = (float)($$15 - $$3) / $$11;

         for (int $$17 = $$2; $$17 <= $$5; $$17++) {
            float $$18 = ((float)$$17 - $$13) / ($$10 * 0.5F);

            for (int $$19 = $$4; $$19 <= $$7; $$19++) {
               float $$20 = ((float)$$19 - $$14) / ($$12 * 0.5F);
               if (!$$9 || !this.a((cwf)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(cxu $$0, dmz $$1, int $$2, int $$3, int $$4, ecu $$5) {
      ib.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ih.a);
         }
      }
   }

   protected boolean a(dmz $$0) {
      return $$0.i() || $$0.k() || $$0.a(dac.fg) || $$0.a(dac.bw) || $$0.a(dac.bx);
   }

   protected boolean a(cxu $$0, ecu $$1, axd $$2, int $$3, int $$4, int $$5, ajh $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dmz a(cwf $$0, ib $$1, dmz $$2) {
      ih $$3 = null;

      for (ih $$4 : ih.c.a) {
         ib $$5 = $$1.a($$4);
         dmz $$6 = $$0.a_($$5);
         if ($$6.a(dac.cv)) {
            return $$2;
         }

         if ($$6.i($$0, $$5)) {
            if ($$3 != null) {
               $$3 = null;
               break;
            }

            $$3 = $$4;
         }
      }

      if ($$3 != null) {
         return $$2.a(ddv.aE, $$3.g());
      } else {
         ih $$7 = $$2.c(ddv.aE);
         ib $$8 = $$1.a($$7);
         if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.h();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         return $$2.a(ddv.aE, $$7);
      }
   }

   protected boolean a(cxo $$0, ecu $$1, axd $$2, ib $$3, ajh $$4, @Nullable dmz $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dac.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dac.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dkg $$6 = $$0.c_($$3);
         if ($$6 instanceof dkn) {
            ((dkn)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(cxu $$0, ecu $$1, axd $$2, int $$3, int $$4, int $$5, ih $$6, ajh $$7) {
      ib $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dac.aU)) {
         this.a($$0, dac.aU.o().a(dcf.b, $$6), $$3, $$4, $$5, $$1);
         dkg $$9 = $$0.c_($$8);
         if ($$9 instanceof dky) {
            ((dky)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static ecu a(Stream<edg> $$0) {
      return ecu.b($$0.map(edg::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static edg a(List<edg> $$0, ecu $$1) {
      for (edg $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ih i() {
      return this.b;
   }

   public void a(@Nullable ih $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dgm.a;
         this.c = dew.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dew.b;
               this.d = dgm.a;
               break;
            case e:
               this.c = dew.b;
               this.d = dgm.b;
               break;
            case f:
               this.c = dew.a;
               this.d = dgm.b;
               break;
            default:
               this.c = dew.a;
               this.d = dgm.a;
         }
      }
   }

   public dgm a() {
      return this.d;
   }

   public dew j() {
      return this.c;
   }

   public edt k() {
      return this.h;
   }

   public abstract static class a {
      protected dmz a = dac.a.o();

      public abstract void a(axd var1, int var2, int var3, int var4, boolean var5);

      public dmz a() {
         return this.a;
      }
   }
}
