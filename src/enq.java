import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class enq {
   private static final Logger a = LogUtils.getLogger();
   protected static final dwx e = djo.nE.m();
   protected ene f;
   @Nullable
   private jn b;
   private dol c;
   private dqe d;
   protected int g;
   private final eod h;
   private static final Set<djm> i = ImmutableSet.builder()
      .add(djo.fJ)
      .add(djo.cw)
      .add(djo.cx)
      .add(djo.eh)
      .add(djo.kD)
      .add(djo.kI)
      .add(djo.kJ)
      .add(djo.kG)
      .add(djo.kE)
      .add(djo.kF)
      .add(djo.cX)
      .add(djo.fk)
      .build();

   protected enq(eod $$0, int $$1, ene $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public enq(eod $$0, tq $$1) {
      this($$0, $$1.h("GD"), (ene)ene.a.parse(ue.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jn.b($$2));
   }

   protected static ene a(int $$0, int $$1, int $$2, jn $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jn.a.c
         ? new ene($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new ene($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jn a(azh $$0) {
      return jn.c.a.a($$0);
   }

   public final tq a(eoc $$0) {
      tq $$1 = new tq();
      $$1.a("id", mb.Q.b(this.k()).toString());
      ene.a.encodeStart(ue.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jn $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(eoc var1, tq var2);

   public void a(enq $$0, enr $$1, azh $$2) {
   }

   public abstract void a(dhg var1, dhe var2, dyt var3, azh var4, ene var5, dfo var6, ji var7);

   public ene f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dfo $$0, int $$1) {
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

   protected void a(dhg $$0, dwx $$1, int $$2, int $$3, int $$4, ene $$5) {
      ji $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dgl)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dol.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dqe.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            esz $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dgl $$0, int $$1, int $$2, int $$3, ene $$4) {
      return true;
   }

   protected dwx a(dfn $$0, int $$1, int $$2, int $$3, ene $$4) {
      ji $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? djo.a.m() : $$0.a_($$5);
   }

   protected boolean b(dgl $$0, int $$1, int $$2, int $$3, ene $$4) {
      ji $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(ecs.a.c, $$5.u(), $$5.w());
   }

   protected void a(dhg $$0, ene $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, djo.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dhg $$0, ene $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dwx $$8, dwx $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dfn)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dhg $$0, ene $$1, ene $$2, dwx $$3, dwx $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dhg $$0, ene $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azh $$9, enq.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dfn)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dhg $$0, ene $$1, ene $$2, boolean $$3, azh $$4, enq.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dhg $$0, ene $$1, azh $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dwx $$10, dwx $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dfn)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dhg $$0, ene $$1, azh $$2, float $$3, int $$4, int $$5, int $$6, dwx $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dhg $$0, ene $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dwx $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dfn)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dhg $$0, dwx $$1, int $$2, int $$3, int $$4, ene $$5) {
      ji.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.L_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jn.a);
         }
      }
   }

   protected boolean a(dwx $$0) {
      return $$0.l() || $$0.n() || $$0.a(djo.fu) || $$0.a(djo.bD) || $$0.a(djo.bE);
   }

   protected boolean a(dhg $$0, ene $$1, azh $$2, int $$3, int $$4, int $$5, aku<evw> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dwx a(dfn $$0, ji $$1, dwx $$2) {
      jn $$3 = null;

      for (jn $$4 : jn.c.a) {
         ji $$5 = $$1.a($$4);
         dwx $$6 = $$0.a_($$5);
         if ($$6.a(djo.cD)) {
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
         return $$2.b(dnk.aF, $$3.g());
      } else {
         jn $$7 = $$2.c(dnk.aF);
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

         return $$2.b(dnk.aF, $$7);
      }
   }

   protected boolean a(dgz $$0, ene $$1, azh $$2, ji $$3, aku<evw> $$4, @Nullable dwx $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(djo.cD)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, djo.cD.m());
         }

         $$0.a($$3, $$5, 2);
         dtz $$6 = $$0.c_($$3);
         if ($$6 instanceof dug) {
            ((dug)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dhg $$0, ene $$1, azh $$2, int $$3, int $$4, int $$5, jn $$6, aku<evw> $$7) {
      ji $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(djo.bb)) {
         this.a($$0, djo.bb.m().b(dls.b, $$6), $$3, $$4, $$5, $$1);
         dtz $$9 = $$0.c_($$8);
         if ($$9 instanceof dut) {
            ((dut)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static ene a(Stream<enq> $$0) {
      return ene.b($$0.map(enq::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static enq a(List<enq> $$0, ene $$1) {
      for (enq $$2 : $$0) {
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
         this.d = dqe.a;
         this.c = dol.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dol.b;
               this.d = dqe.a;
               break;
            case e:
               this.c = dol.b;
               this.d = dqe.b;
               break;
            case f:
               this.c = dol.a;
               this.d = dqe.b;
               break;
            default:
               this.c = dol.a;
               this.d = dqe.a;
         }
      }
   }

   public dqe a() {
      return this.d;
   }

   public dol j() {
      return this.c;
   }

   public eod k() {
      return this.h;
   }

   public abstract static class a {
      protected dwx a = djo.a.m();

      public abstract void a(azh var1, int var2, int var3, int var4, boolean var5);

      public dwx a() {
         return this.a;
      }
   }
}
