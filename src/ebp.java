import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ebp {
   private static final Logger a = LogUtils.getLogger();
   protected static final dlj e = cyu.nc.o();
   protected ebd f;
   @Nullable
   private ie b;
   private ddo c;
   private dfe d;
   protected int g;
   private final ecc h;
   private static final Set<cys> i = ImmutableSet.builder()
      .add(cyu.fo)
      .add(cyu.cp)
      .add(cyu.cq)
      .add(cyu.dU)
      .add(cyu.kd)
      .add(cyu.ki)
      .add(cyu.kg)
      .add(cyu.ke)
      .add(cyu.kf)
      .add(cyu.cO)
      .add(cyu.eW)
      .build();

   protected ebp(ecc $$0, int $$1, ebd $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public ebp(ecc $$0, sw $$1) {
      this(
         $$0, $$1.h("GD"), (ebd)ebd.a.parse(tk.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ie.b($$2));
   }

   protected static ebd a(int $$0, int $$1, int $$2, ie $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ie.a.c
         ? new ebd($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new ebd($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ie a(awp $$0) {
      return ie.c.a.a($$0);
   }

   public final sw a(ecb $$0) {
      sw $$1 = new sw();
      $$1.a("id", kf.S.b(this.k()).toString());
      ebd.a.encodeStart(tk.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ie $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ecb var1, sw var2);

   public void a(ebp $$0, ebq $$1, awp $$2) {
   }

   public abstract void a(cwm var1, cwk var2, dng var3, awp var4, ebd var5, cuy var6, hz var7);

   public ebd f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cuy $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public hz h() {
      return new hz(this.f.g());
   }

   protected hz.a b(int $$0, int $$1, int $$2) {
      return new hz.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ie $$2 = this.i();
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
      ie $$2 = this.i();
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

   protected void a(cwm $$0, dlj $$1, int $$2, int $$3, int $$4, ebd $$5) {
      hz $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cvu)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != ddo.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dfe.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            egw $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cvu $$0, int $$1, int $$2, int $$3, ebd $$4) {
      return true;
   }

   protected dlj a(cux $$0, int $$1, int $$2, int $$3, ebd $$4) {
      hz $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cyu.a.o() : $$0.a_($$5);
   }

   protected boolean b(cvu $$0, int $$1, int $$2, int $$3, ebd $$4) {
      hz $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dqv.a.c, $$5.u(), $$5.w());
   }

   protected void a(cwm $$0, ebd $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, cyu.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(cwm $$0, ebd $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dlj $$8, dlj $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cux)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(cwm $$0, ebd $$1, ebd $$2, dlj $$3, dlj $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(cwm $$0, ebd $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, awp $$9, ebp.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cux)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(cwm $$0, ebd $$1, ebd $$2, boolean $$3, awp $$4, ebp.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(cwm $$0, ebd $$1, awp $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dlj $$10, dlj $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cux)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(cwm $$0, ebd $$1, awp $$2, float $$3, int $$4, int $$5, int $$6, dlj $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(cwm $$0, ebd $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dlj $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cux)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(cwm $$0, dlj $$1, int $$2, int $$3, int $$4, ebd $$5) {
      hz.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.J_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ie.a);
         }
      }
   }

   protected boolean a(dlj $$0) {
      return $$0.i() || $$0.k() || $$0.a(cyu.fg) || $$0.a(cyu.bw) || $$0.a(cyu.bx);
   }

   protected boolean a(cwm $$0, ebd $$1, awp $$2, int $$3, int $$4, int $$5, aiy $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dlj a(cux $$0, hz $$1, dlj $$2) {
      ie $$3 = null;

      for (ie $$4 : ie.c.a) {
         hz $$5 = $$1.a($$4);
         dlj $$6 = $$0.a_($$5);
         if ($$6.a(cyu.cv)) {
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
         return $$2.a(dcn.aE, $$3.g());
      } else {
         ie $$7 = $$2.c(dcn.aE);
         hz $$8 = $$1.a($$7);
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

         return $$2.a(dcn.aE, $$7);
      }
   }

   protected boolean a(cwg $$0, ebd $$1, awp $$2, hz $$3, aiy $$4, @Nullable dlj $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cyu.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cyu.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dix $$6 = $$0.c_($$3);
         if ($$6 instanceof dje) {
            ((dje)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(cwm $$0, ebd $$1, awp $$2, int $$3, int $$4, int $$5, ie $$6, aiy $$7) {
      hz $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cyu.aU)) {
         this.a($$0, cyu.aU.o().a(dax.b, $$6), $$3, $$4, $$5, $$1);
         dix $$9 = $$0.c_($$8);
         if ($$9 instanceof djp) {
            ((djp)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static ebd a(Stream<ebp> $$0) {
      return ebd.b($$0.map(ebp::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static ebp a(List<ebp> $$0, ebd $$1) {
      for (ebp $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ie i() {
      return this.b;
   }

   public void a(@Nullable ie $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dfe.a;
         this.c = ddo.a;
      } else {
         switch ($$0) {
            case d:
               this.c = ddo.b;
               this.d = dfe.a;
               break;
            case e:
               this.c = ddo.b;
               this.d = dfe.b;
               break;
            case f:
               this.c = ddo.a;
               this.d = dfe.b;
               break;
            default:
               this.c = ddo.a;
               this.d = dfe.a;
         }
      }
   }

   public dfe a() {
      return this.d;
   }

   public ddo j() {
      return this.c;
   }

   public ecc k() {
      return this.h;
   }

   public abstract static class a {
      protected dlj a = cyu.a.o();

      public abstract void a(awp var1, int var2, int var3, int var4, boolean var5);

      public dlj a() {
         return this.a;
      }
   }
}
