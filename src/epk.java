import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class epk {
   private static final Logger a = LogUtils.getLogger();
   protected static final dym e = dkw.nE.m();
   protected eoy f;
   @Nullable
   private jo b;
   private dpv c;
   private drm d;
   protected int g;
   private final epx h;
   private static final Set<dku> i = ImmutableSet.builder()
      .add(dkw.fJ)
      .add(dkw.cw)
      .add(dkw.cx)
      .add(dkw.eh)
      .add(dkw.kD)
      .add(dkw.kI)
      .add(dkw.kJ)
      .add(dkw.kG)
      .add(dkw.kE)
      .add(dkw.kF)
      .add(dkw.cX)
      .add(dkw.fk)
      .build();

   protected epk(epx $$0, int $$1, eoy $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public epk(epx $$0, tw $$1) {
      this($$0, $$1.h("GD"), (eoy)eoy.a.parse(uk.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jo.b($$2));
   }

   protected static eoy a(int $$0, int $$1, int $$2, jo $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jo.a.c
         ? new eoy($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eoy($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jo a(azs $$0) {
      return jo.c.a.a($$0);
   }

   public final tw a(epw $$0) {
      tw $$1 = new tw();
      $$1.a("id", md.Q.b(this.k()).toString());
      eoy.a.encodeStart(uk.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jo $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(epw var1, tw var2);

   public void a(epk $$0, epl $$1, azs $$2) {
   }

   public abstract void a(dio var1, dil var2, eak var3, azs var4, eoy var5, dgw var6, jj var7);

   public eoy f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dgw $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public jj h() {
      return new jj(this.f.g());
   }

   protected jj.a b(int $$0, int $$1, int $$2) {
      return new jj.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jo $$2 = this.i();
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
      jo $$2 = this.i();
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

   protected void a(dio $$0, dym $$1, int $$2, int $$3, int $$4, eoy $$5) {
      jj $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dhs)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dpv.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != drm.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eut $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dhs $$0, int $$1, int $$2, int $$3, eoy $$4) {
      return true;
   }

   protected dym a(dgv $$0, int $$1, int $$2, int $$3, eoy $$4) {
      jj $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dkw.a.m() : $$0.a_($$5);
   }

   protected boolean b(dhs $$0, int $$1, int $$2, int $$3, eoy $$4) {
      jj $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(eel.a.c, $$5.u(), $$5.w());
   }

   protected void a(dio $$0, eoy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dkw.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dio $$0, eoy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dym $$8, dym $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dgv)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dio $$0, eoy $$1, eoy $$2, dym $$3, dym $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dio $$0, eoy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azs $$9, epk.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dgv)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dio $$0, eoy $$1, eoy $$2, boolean $$3, azs $$4, epk.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dio $$0, eoy $$1, azs $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dym $$10, dym $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dgv)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dio $$0, eoy $$1, azs $$2, float $$3, int $$4, int $$5, int $$6, dym $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dio $$0, eoy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dym $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dgv)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dio $$0, dym $$1, int $$2, int $$3, int $$4, eoy $$5) {
      jj.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.G_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jo.a);
         }
      }
   }

   protected boolean a(dym $$0) {
      return $$0.l() || $$0.n() || $$0.a(dkw.fu) || $$0.a(dkw.bD) || $$0.a(dkw.bE);
   }

   protected boolean a(dio $$0, eoy $$1, azs $$2, int $$3, int $$4, int $$5, alc<exq> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dym a(dgv $$0, jj $$1, dym $$2) {
      jo $$3 = null;

      for (jo $$4 : jo.c.a) {
         jj $$5 = $$1.a($$4);
         dym $$6 = $$0.a_($$5);
         if ($$6.a(dkw.cD)) {
            return $$2;
         }

         if ($$6.s()) {
            if ($$3 != null) {
               $$3 = null;
               break;
            }

            $$3 = $$4;
         }
      }

      if ($$3 != null) {
         return $$2.b(dot.e, $$3.g());
      } else {
         jo $$7 = $$2.c(dot.e);
         jj $$8 = $$1.a($$7);
         if ($$0.a_($$8).s()) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).s()) {
            $$7 = $$7.h();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).s()) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         return $$2.b(dot.e, $$7);
      }
   }

   protected boolean a(dig $$0, eoy $$1, azs $$2, jj $$3, alc<exq> $$4, @Nullable dym $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dkw.cD)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dkw.cD.m());
         }

         $$0.a($$3, $$5, 2);
         dvl $$6 = $$0.c_($$3);
         if ($$6 instanceof dvt) {
            ((dvt)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dio $$0, eoy $$1, azs $$2, int $$3, int $$4, int $$5, jo $$6, alc<exq> $$7) {
      jj $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dkw.bb)) {
         this.a($$0, dkw.bb.m().b(dna.b, $$6), $$3, $$4, $$5, $$1);
         dvl $$9 = $$0.c_($$8);
         if ($$9 instanceof dwg) {
            ((dwg)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eoy a(Stream<epk> $$0) {
      return eoy.b($$0.map(epk::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static epk a(List<epk> $$0, eoy $$1) {
      for (epk $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jo i() {
      return this.b;
   }

   public void a(@Nullable jo $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = drm.a;
         this.c = dpv.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dpv.b;
               this.d = drm.a;
               break;
            case e:
               this.c = dpv.b;
               this.d = drm.b;
               break;
            case f:
               this.c = dpv.a;
               this.d = drm.b;
               break;
            default:
               this.c = dpv.a;
               this.d = drm.a;
         }
      }
   }

   public drm a() {
      return this.d;
   }

   public dpv j() {
      return this.c;
   }

   public epx k() {
      return this.h;
   }

   public abstract static class a {
      protected dym a = dkw.a.m();

      public abstract void a(azs var1, int var2, int var3, int var4, boolean var5);

      public dym a() {
         return this.a;
      }
   }
}
