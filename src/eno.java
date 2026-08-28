import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class eno {
   private static final Logger a = LogUtils.getLogger();
   protected static final dwv e = djm.nE.m();
   protected enc f;
   @Nullable
   private jn b;
   private doj c;
   private dqc d;
   protected int g;
   private final eob h;
   private static final Set<djk> i = ImmutableSet.builder()
      .add(djm.fJ)
      .add(djm.cw)
      .add(djm.cx)
      .add(djm.eh)
      .add(djm.kD)
      .add(djm.kI)
      .add(djm.kJ)
      .add(djm.kG)
      .add(djm.kE)
      .add(djm.kF)
      .add(djm.cX)
      .add(djm.fk)
      .build();

   protected eno(eob $$0, int $$1, enc $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public eno(eob $$0, tq $$1) {
      this($$0, $$1.h("GD"), (enc)enc.a.parse(ue.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jn.b($$2));
   }

   protected static enc a(int $$0, int $$1, int $$2, jn $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jn.a.c
         ? new enc($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new enc($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jn a(azg $$0) {
      return jn.c.a.a($$0);
   }

   public final tq a(eoa $$0) {
      tq $$1 = new tq();
      $$1.a("id", mb.Q.b(this.k()).toString());
      enc.a.encodeStart(ue.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jn $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(eoa var1, tq var2);

   public void a(eno $$0, enp $$1, azg $$2) {
   }

   public abstract void a(dhe var1, dhc var2, dyr var3, azg var4, enc var5, dfm var6, ji var7);

   public enc f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dfm $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public ji h() {
      return new ji(this.f.g());
   }

   protected ji.a b(int $$0, int $$1, int $$2) {
      return new ji.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jn $$2 = this.i();
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
      jn $$2 = this.i();
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

   protected void a(dhe $$0, dwv $$1, int $$2, int $$3, int $$4, enc $$5) {
      ji $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dgj)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != doj.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dqc.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            esx $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dgj $$0, int $$1, int $$2, int $$3, enc $$4) {
      return true;
   }

   protected dwv a(dfl $$0, int $$1, int $$2, int $$3, enc $$4) {
      ji $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? djm.a.m() : $$0.a_($$5);
   }

   protected boolean b(dgj $$0, int $$1, int $$2, int $$3, enc $$4) {
      ji $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(ecq.a.c, $$5.u(), $$5.w());
   }

   protected void a(dhe $$0, enc $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, djm.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dhe $$0, enc $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dwv $$8, dwv $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dfl)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dhe $$0, enc $$1, enc $$2, dwv $$3, dwv $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dhe $$0, enc $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azg $$9, eno.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dfl)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dhe $$0, enc $$1, enc $$2, boolean $$3, azg $$4, eno.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dhe $$0, enc $$1, azg $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dwv $$10, dwv $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dfl)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dhe $$0, enc $$1, azg $$2, float $$3, int $$4, int $$5, int $$6, dwv $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dhe $$0, enc $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dwv $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dfl)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dhe $$0, dwv $$1, int $$2, int $$3, int $$4, enc $$5) {
      ji.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.L_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jn.a);
         }
      }
   }

   protected boolean a(dwv $$0) {
      return $$0.l() || $$0.n() || $$0.a(djm.fu) || $$0.a(djm.bD) || $$0.a(djm.bE);
   }

   protected boolean a(dhe $$0, enc $$1, azg $$2, int $$3, int $$4, int $$5, akt<evu> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dwv a(dfl $$0, ji $$1, dwv $$2) {
      jn $$3 = null;

      for (jn $$4 : jn.c.a) {
         ji $$5 = $$1.a($$4);
         dwv $$6 = $$0.a_($$5);
         if ($$6.a(djm.cD)) {
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
         return $$2.b(dni.aF, $$3.g());
      } else {
         jn $$7 = $$2.c(dni.aF);
         ji $$8 = $$1.a($$7);
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

         return $$2.b(dni.aF, $$7);
      }
   }

   protected boolean a(dgx $$0, enc $$1, azg $$2, ji $$3, akt<evu> $$4, @Nullable dwv $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(djm.cD)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, djm.cD.m());
         }

         $$0.a($$3, $$5, 2);
         dtx $$6 = $$0.c_($$3);
         if ($$6 instanceof due) {
            ((due)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dhe $$0, enc $$1, azg $$2, int $$3, int $$4, int $$5, jn $$6, akt<evu> $$7) {
      ji $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(djm.bb)) {
         this.a($$0, djm.bb.m().b(dlq.b, $$6), $$3, $$4, $$5, $$1);
         dtx $$9 = $$0.c_($$8);
         if ($$9 instanceof dur) {
            ((dur)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static enc a(Stream<eno> $$0) {
      return enc.b($$0.map(eno::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static eno a(List<eno> $$0, enc $$1) {
      for (eno $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jn i() {
      return this.b;
   }

   public void a(@Nullable jn $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dqc.a;
         this.c = doj.a;
      } else {
         switch ($$0) {
            case d:
               this.c = doj.b;
               this.d = dqc.a;
               break;
            case e:
               this.c = doj.b;
               this.d = dqc.b;
               break;
            case f:
               this.c = doj.a;
               this.d = dqc.b;
               break;
            default:
               this.c = doj.a;
               this.d = dqc.a;
         }
      }
   }

   public dqc a() {
      return this.d;
   }

   public doj j() {
      return this.c;
   }

   public eob k() {
      return this.h;
   }

   public abstract static class a {
      protected dwv a = djm.a.m();

      public abstract void a(azg var1, int var2, int var3, int var4, boolean var5);

      public dwv a() {
         return this.a;
      }
   }
}
