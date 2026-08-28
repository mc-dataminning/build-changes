import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class eiu {
   private static final Logger a = LogUtils.getLogger();
   protected static final dsh e = dfh.nc.o();
   protected eii f;
   @Nullable
   private jf b;
   private dkc c;
   private dls d;
   protected int g;
   private final ejh h;
   private static final Set<dff> i = ImmutableSet.builder()
      .add(dfh.fo)
      .add(dfh.cp)
      .add(dfh.cq)
      .add(dfh.dU)
      .add(dfh.kd)
      .add(dfh.ki)
      .add(dfh.kg)
      .add(dfh.ke)
      .add(dfh.kf)
      .add(dfh.cO)
      .add(dfh.eW)
      .build();

   protected eiu(ejh $$0, int $$1, eii $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public eiu(ejh $$0, tx $$1) {
      this(
         $$0, $$1.h("GD"), (eii)eii.a.parse(ul.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jf.b($$2));
   }

   protected static eii a(int $$0, int $$1, int $$2, jf $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jf.a.c
         ? new eii($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eii($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jf a(aym $$0) {
      return jf.c.a.a($$0);
   }

   public final tx a(ejg $$0) {
      tx $$1 = new tx();
      $$1.a("id", lq.Q.b(this.k()).toString());
      eii.a.encodeStart(ul.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jf $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ejg var1, tx var2);

   public void a(eiu $$0, eiv $$1, aym $$2) {
   }

   public abstract void a(dcz var1, dcx var2, due var3, aym var4, eii var5, dbk var6, ja var7);

   public eii f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dbk $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public ja h() {
      return new ja(this.f.g());
   }

   protected ja.a b(int $$0, int $$1, int $$2) {
      return new ja.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jf $$2 = this.i();
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
      jf $$2 = this.i();
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

   protected void a(dcz $$0, dsh $$1, int $$2, int $$3, int $$4, eii $$5) {
      ja $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dcg)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dkc.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dls.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eob $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dcg $$0, int $$1, int $$2, int $$3, eii $$4) {
      return true;
   }

   protected dsh a(dbj $$0, int $$1, int $$2, int $$3, eii $$4) {
      ja $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dfh.a.o() : $$0.a_($$5);
   }

   protected boolean b(dcg $$0, int $$1, int $$2, int $$3, eii $$4) {
      ja $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dxz.a.c, $$5.u(), $$5.w());
   }

   protected void a(dcz $$0, eii $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dfh.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dcz $$0, eii $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dsh $$8, dsh $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dbj)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(dcz $$0, eii $$1, eii $$2, dsh $$3, dsh $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dcz $$0, eii $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, aym $$9, eiu.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dbj)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dcz $$0, eii $$1, eii $$2, boolean $$3, aym $$4, eiu.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dcz $$0, eii $$1, aym $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dsh $$10, dsh $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dbj)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dcz $$0, eii $$1, aym $$2, float $$3, int $$4, int $$5, int $$6, dsh $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dcz $$0, eii $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dsh $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dbj)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dcz $$0, dsh $$1, int $$2, int $$3, int $$4, eii $$5) {
      ja.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jf.a);
         }
      }
   }

   protected boolean a(dsh $$0) {
      return $$0.i() || $$0.k() || $$0.a(dfh.fg) || $$0.a(dfh.bw) || $$0.a(dfh.bx);
   }

   protected boolean a(dcz $$0, eii $$1, aym $$2, int $$3, int $$4, int $$5, akj<eqt> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dsh a(dbj $$0, ja $$1, dsh $$2) {
      jf $$3 = null;

      for (jf $$4 : jf.c.a) {
         ja $$5 = $$1.a($$4);
         dsh $$6 = $$0.a_($$5);
         if ($$6.a(dfh.cv)) {
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
         return $$2.a(djb.aE, $$3.g());
      } else {
         jf $$7 = $$2.c(djb.aE);
         ja $$8 = $$1.a($$7);
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

         return $$2.a(djb.aE, $$7);
      }
   }

   protected boolean a(dcs $$0, eii $$1, aym $$2, ja $$3, akj<eqt> $$4, @Nullable dsh $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dfh.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dfh.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dpn $$6 = $$0.c_($$3);
         if ($$6 instanceof dpu) {
            ((dpu)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dcz $$0, eii $$1, aym $$2, int $$3, int $$4, int $$5, jf $$6, akj<eqt> $$7) {
      ja $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dfh.aU)) {
         this.a($$0, dfh.aU.o().a(dhk.b, $$6), $$3, $$4, $$5, $$1);
         dpn $$9 = $$0.c_($$8);
         if ($$9 instanceof dqf) {
            ((dqf)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eii a(Stream<eiu> $$0) {
      return eii.b($$0.map(eiu::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static eiu a(List<eiu> $$0, eii $$1) {
      for (eiu $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jf i() {
      return this.b;
   }

   public void a(@Nullable jf $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dls.a;
         this.c = dkc.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dkc.b;
               this.d = dls.a;
               break;
            case e:
               this.c = dkc.b;
               this.d = dls.b;
               break;
            case f:
               this.c = dkc.a;
               this.d = dls.b;
               break;
            default:
               this.c = dkc.a;
               this.d = dls.a;
         }
      }
   }

   public dls a() {
      return this.d;
   }

   public dkc j() {
      return this.c;
   }

   public ejh k() {
      return this.h;
   }

   public abstract static class a {
      protected dsh a = dfh.a.o();

      public abstract void a(aym var1, int var2, int var3, int var4, boolean var5);

      public dsh a() {
         return this.a;
      }
   }
}
