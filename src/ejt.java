import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ejt {
   private static final Logger a = LogUtils.getLogger();
   protected static final dtc e = dga.nc.o();
   protected ejh f;
   @Nullable
   private ji b;
   private dkv c;
   private dmm d;
   protected int g;
   private final ekg h;
   private static final Set<dfy> i = ImmutableSet.builder()
      .add(dga.fo)
      .add(dga.cp)
      .add(dga.cq)
      .add(dga.dU)
      .add(dga.kd)
      .add(dga.ki)
      .add(dga.kg)
      .add(dga.ke)
      .add(dga.kf)
      .add(dga.cO)
      .add(dga.eW)
      .build();

   protected ejt(ekg $$0, int $$1, ejh $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public ejt(ekg $$0, ub $$1) {
      this($$0, $$1.h("GD"), (ejh)ejh.a.parse(up.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ji.b($$2));
   }

   protected static ejh a(int $$0, int $$1, int $$2, ji $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ji.a.c
         ? new ejh($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new ejh($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ji a(ayw $$0) {
      return ji.c.a.a($$0);
   }

   public final ub a(ekf $$0) {
      ub $$1 = new ub();
      $$1.a("id", lt.Q.b(this.k()).toString());
      ejh.a.encodeStart(up.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ji $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ekf var1, ub var2);

   public void a(ejt $$0, eju $$1, ayw $$2) {
   }

   public abstract void a(dds var1, ddq var2, duz var3, ayw var4, ejh var5, dcd var6, jd var7);

   public ejh f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dcd $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public jd h() {
      return new jd(this.f.g());
   }

   protected jd.a b(int $$0, int $$1, int $$2) {
      return new jd.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ji $$2 = this.i();
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
      ji $$2 = this.i();
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

   protected void a(dds $$0, dtc $$1, int $$2, int $$3, int $$4, ejh $$5) {
      jd $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dcz)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dkv.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dmm.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            epc $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dcz $$0, int $$1, int $$2, int $$3, ejh $$4) {
      return true;
   }

   protected dtc a(dcc $$0, int $$1, int $$2, int $$3, ejh $$4) {
      jd $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dga.a.o() : $$0.a_($$5);
   }

   protected boolean b(dcz $$0, int $$1, int $$2, int $$3, ejh $$4) {
      jd $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dyy.a.c, $$5.u(), $$5.w());
   }

   protected void a(dds $$0, ejh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dga.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dds $$0, ejh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dtc $$8, dtc $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dcc)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(dds $$0, ejh $$1, ejh $$2, dtc $$3, dtc $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dds $$0, ejh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ayw $$9, ejt.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dcc)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dds $$0, ejh $$1, ejh $$2, boolean $$3, ayw $$4, ejt.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dds $$0, ejh $$1, ayw $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dtc $$10, dtc $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dcc)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dds $$0, ejh $$1, ayw $$2, float $$3, int $$4, int $$5, int $$6, dtc $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dds $$0, ejh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dtc $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dcc)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dds $$0, dtc $$1, int $$2, int $$3, int $$4, ejh $$5) {
      jd.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ji.a);
         }
      }
   }

   protected boolean a(dtc $$0) {
      return $$0.i() || $$0.k() || $$0.a(dga.fg) || $$0.a(dga.bw) || $$0.a(dga.bx);
   }

   protected boolean a(dds $$0, ejh $$1, ayw $$2, int $$3, int $$4, int $$5, akq<eru> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dtc a(dcc $$0, jd $$1, dtc $$2) {
      ji $$3 = null;

      for (ji $$4 : ji.c.a) {
         jd $$5 = $$1.a($$4);
         dtc $$6 = $$0.a_($$5);
         if ($$6.a(dga.cv)) {
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
         return $$2.a(dju.aE, $$3.g());
      } else {
         ji $$7 = $$2.c(dju.aE);
         jd $$8 = $$1.a($$7);
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

         return $$2.a(dju.aE, $$7);
      }
   }

   protected boolean a(ddl $$0, ejh $$1, ayw $$2, jd $$3, akq<eru> $$4, @Nullable dtc $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dga.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dga.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dqh $$6 = $$0.c_($$3);
         if ($$6 instanceof dqo) {
            ((dqo)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dds $$0, ejh $$1, ayw $$2, int $$3, int $$4, int $$5, ji $$6, akq<eru> $$7) {
      jd $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dga.aU)) {
         this.a($$0, dga.aU.o().a(did.b, $$6), $$3, $$4, $$5, $$1);
         dqh $$9 = $$0.c_($$8);
         if ($$9 instanceof dra) {
            ((dra)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static ejh a(Stream<ejt> $$0) {
      return ejh.b($$0.map(ejt::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static ejt a(List<ejt> $$0, ejh $$1) {
      for (ejt $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ji i() {
      return this.b;
   }

   public void a(@Nullable ji $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dmm.a;
         this.c = dkv.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dkv.b;
               this.d = dmm.a;
               break;
            case e:
               this.c = dkv.b;
               this.d = dmm.b;
               break;
            case f:
               this.c = dkv.a;
               this.d = dmm.b;
               break;
            default:
               this.c = dkv.a;
               this.d = dmm.a;
         }
      }
   }

   public dmm a() {
      return this.d;
   }

   public dkv j() {
      return this.c;
   }

   public ekg k() {
      return this.h;
   }

   public abstract static class a {
      protected dtc a = dga.a.o();

      public abstract void a(ayw var1, int var2, int var3, int var4, boolean var5);

      public dtc a() {
         return this.a;
      }
   }
}
