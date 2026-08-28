import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class eoh {
   private static final Logger a = LogUtils.getLogger();
   protected static final dxo e = dkf.nE.m();
   protected env f;
   @Nullable
   private jm b;
   private dpc c;
   private dqv d;
   protected int g;
   private final eou h;
   private static final Set<dkd> i = ImmutableSet.builder()
      .add(dkf.fJ)
      .add(dkf.cw)
      .add(dkf.cx)
      .add(dkf.eh)
      .add(dkf.kD)
      .add(dkf.kI)
      .add(dkf.kJ)
      .add(dkf.kG)
      .add(dkf.kE)
      .add(dkf.kF)
      .add(dkf.cX)
      .add(dkf.fk)
      .build();

   protected eoh(eou $$0, int $$1, env $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public eoh(eou $$0, um $$1) {
      this($$0, $$1.h("GD"), (env)env.a.parse(va.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jm.b($$2));
   }

   protected static env a(int $$0, int $$1, int $$2, jm $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jm.a.c
         ? new env($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new env($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jm a(bac $$0) {
      return jm.c.a.a($$0);
   }

   public final um a(eot $$0) {
      um $$1 = new um();
      $$1.a("id", ma.Q.b(this.k()).toString());
      env.a.encodeStart(va.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jm $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(eot var1, um var2);

   public void a(eoh $$0, eoi $$1, bac $$2) {
   }

   public abstract void a(dhx var1, dhv var2, dzk var3, bac var4, env var5, dgf var6, jh var7);

   public env f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dgf $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public jh h() {
      return new jh(this.f.g());
   }

   protected jh.a b(int $$0, int $$1, int $$2) {
      return new jh.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jm $$2 = this.i();
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
      jm $$2 = this.i();
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

   protected void a(dhx $$0, dxo $$1, int $$2, int $$3, int $$4, env $$5) {
      jh $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dhc)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dpc.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dqv.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            etq $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dhc $$0, int $$1, int $$2, int $$3, env $$4) {
      return true;
   }

   protected dxo a(dge $$0, int $$1, int $$2, int $$3, env $$4) {
      jh $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dkf.a.m() : $$0.a_($$5);
   }

   protected boolean b(dhc $$0, int $$1, int $$2, int $$3, env $$4) {
      jh $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(edj.a.c, $$5.u(), $$5.w());
   }

   protected void a(dhx $$0, env $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dkf.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dhx $$0, env $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dxo $$8, dxo $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dge)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dhx $$0, env $$1, env $$2, dxo $$3, dxo $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dhx $$0, env $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, bac $$9, eoh.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dge)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dhx $$0, env $$1, env $$2, boolean $$3, bac $$4, eoh.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dhx $$0, env $$1, bac $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dxo $$10, dxo $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dge)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dhx $$0, env $$1, bac $$2, float $$3, int $$4, int $$5, int $$6, dxo $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dhx $$0, env $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dxo $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dge)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dhx $$0, dxo $$1, int $$2, int $$3, int $$4, env $$5) {
      jh.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.L_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jm.a);
         }
      }
   }

   protected boolean a(dxo $$0) {
      return $$0.l() || $$0.n() || $$0.a(dkf.fu) || $$0.a(dkf.bD) || $$0.a(dkf.bE);
   }

   protected boolean a(dhx $$0, env $$1, bac $$2, int $$3, int $$4, int $$5, alo<ewn> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dxo a(dge $$0, jh $$1, dxo $$2) {
      jm $$3 = null;

      for (jm $$4 : jm.c.a) {
         jh $$5 = $$1.a($$4);
         dxo $$6 = $$0.a_($$5);
         if ($$6.a(dkf.cD)) {
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
         return $$2.b(dob.aF, $$3.g());
      } else {
         jm $$7 = $$2.c(dob.aF);
         jh $$8 = $$1.a($$7);
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

         return $$2.b(dob.aF, $$7);
      }
   }

   protected boolean a(dhq $$0, env $$1, bac $$2, jh $$3, alo<ewn> $$4, @Nullable dxo $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dkf.cD)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dkf.cD.m());
         }

         $$0.a($$3, $$5, 2);
         duq $$6 = $$0.c_($$3);
         if ($$6 instanceof dux) {
            ((dux)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dhx $$0, env $$1, bac $$2, int $$3, int $$4, int $$5, jm $$6, alo<ewn> $$7) {
      jh $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dkf.bb)) {
         this.a($$0, dkf.bb.m().b(dmj.b, $$6), $$3, $$4, $$5, $$1);
         duq $$9 = $$0.c_($$8);
         if ($$9 instanceof dvk) {
            ((dvk)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static env a(Stream<eoh> $$0) {
      return env.b($$0.map(eoh::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static eoh a(List<eoh> $$0, env $$1) {
      for (eoh $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jm i() {
      return this.b;
   }

   public void a(@Nullable jm $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dqv.a;
         this.c = dpc.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dpc.b;
               this.d = dqv.a;
               break;
            case e:
               this.c = dpc.b;
               this.d = dqv.b;
               break;
            case f:
               this.c = dpc.a;
               this.d = dqv.b;
               break;
            default:
               this.c = dpc.a;
               this.d = dqv.a;
         }
      }
   }

   public dqv a() {
      return this.d;
   }

   public dpc j() {
      return this.c;
   }

   public eou k() {
      return this.h;
   }

   public abstract static class a {
      protected dxo a = dkf.a.m();

      public abstract void a(bac var1, int var2, int var3, int var4, boolean var5);

      public dxo a() {
         return this.a;
      }
   }
}
