import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class eqm {
   private static final Logger a = LogUtils.getLogger();
   protected static final dzo e = dlw.nE.m();
   protected eqa f;
   @Nullable
   private ja b;
   private dqv c;
   private dsm d;
   protected int g;
   private final eqz h;
   private static final Set<dlu> i = ImmutableSet.builder()
      .add(dlw.fJ)
      .add(dlw.cw)
      .add(dlw.cx)
      .add(dlw.eh)
      .add(dlw.kD)
      .add(dlw.kI)
      .add(dlw.kJ)
      .add(dlw.kG)
      .add(dlw.kE)
      .add(dlw.kF)
      .add(dlw.cX)
      .add(dlw.fk)
      .build();

   protected eqm(eqz $$0, int $$1, eqa $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public eqm(eqz $$0, tx $$1) {
      this($$0, $$1.h("GD"), (eqa)eqa.a.parse(ul.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ja.b($$2));
   }

   protected static eqa a(int $$0, int $$1, int $$2, ja $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ja.a.c
         ? new eqa($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eqa($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ja a(azt $$0) {
      return ja.c.a.a($$0);
   }

   public final tx a(eqy $$0) {
      tx $$1 = new tx();
      $$1.a("id", mf.Q.b(this.k()).toString());
      eqa.a.encodeStart(ul.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ja $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(eqy var1, tx var2);

   public void a(eqm $$0, eqn $$1, azt $$2) {
   }

   public abstract void a(djo var1, djl var2, ebm var3, azt var4, eqa var5, dhw var6, iu var7);

   public eqa f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dhw $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public iu h() {
      return new iu(this.f.g());
   }

   protected iu.a b(int $$0, int $$1, int $$2) {
      return new iu.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ja $$2 = this.i();
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
      ja $$2 = this.i();
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

   protected void a(djo $$0, dzo $$1, int $$2, int $$3, int $$4, eqa $$5) {
      iu $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dis)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dqv.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dsm.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            evv $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.z($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dis $$0, int $$1, int $$2, int $$3, eqa $$4) {
      return true;
   }

   protected dzo a(dhv $$0, int $$1, int $$2, int $$3, eqa $$4) {
      iu $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dlw.a.m() : $$0.a_($$5);
   }

   protected boolean b(dis $$0, int $$1, int $$2, int $$3, eqa $$4) {
      iu $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(efn.a.c, $$5.u(), $$5.w());
   }

   protected void a(djo $$0, eqa $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dlw.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(djo $$0, eqa $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dzo $$8, dzo $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dhv)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(djo $$0, eqa $$1, eqa $$2, dzo $$3, dzo $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(djo $$0, eqa $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azt $$9, eqm.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dhv)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(djo $$0, eqa $$1, eqa $$2, boolean $$3, azt $$4, eqm.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(djo $$0, eqa $$1, azt $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dzo $$10, dzo $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dhv)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(djo $$0, eqa $$1, azt $$2, float $$3, int $$4, int $$5, int $$6, dzo $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(djo $$0, eqa $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dzo $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dhv)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(djo $$0, dzo $$1, int $$2, int $$3, int $$4, eqa $$5) {
      iu.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.G_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ja.a);
         }
      }
   }

   protected boolean a(dzo $$0) {
      return $$0.l() || $$0.n() || $$0.a(dlw.fu) || $$0.a(dlw.bD) || $$0.a(dlw.bE);
   }

   protected boolean a(djo $$0, eqa $$1, azt $$2, int $$3, int $$4, int $$5, ald<eys> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dzo a(dhv $$0, iu $$1, dzo $$2) {
      ja $$3 = null;

      for (ja $$4 : ja.c.a) {
         iu $$5 = $$1.a($$4);
         dzo $$6 = $$0.a_($$5);
         if ($$6.a(dlw.cD)) {
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
         return $$2.b(dpt.e, $$3.g());
      } else {
         ja $$7 = $$2.c(dpt.e);
         iu $$8 = $$1.a($$7);
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

         return $$2.b(dpt.e, $$7);
      }
   }

   protected boolean a(djg $$0, eqa $$1, azt $$2, iu $$3, ald<eys> $$4, @Nullable dzo $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dlw.cD)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dlw.cD.m());
         }

         $$0.a($$3, $$5, 2);
         dwn $$6 = $$0.c_($$3);
         if ($$6 instanceof dwv) {
            ((dwv)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(djo $$0, eqa $$1, azt $$2, int $$3, int $$4, int $$5, ja $$6, ald<eys> $$7) {
      iu $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dlw.bb)) {
         this.a($$0, dlw.bb.m().b(doa.b, $$6), $$3, $$4, $$5, $$1);
         dwn $$9 = $$0.c_($$8);
         if ($$9 instanceof dxi) {
            ((dxi)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eqa a(Stream<eqm> $$0) {
      return eqa.b($$0.map(eqm::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static eqm a(List<eqm> $$0, eqa $$1) {
      for (eqm $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ja i() {
      return this.b;
   }

   public void a(@Nullable ja $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dsm.a;
         this.c = dqv.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dqv.b;
               this.d = dsm.a;
               break;
            case e:
               this.c = dqv.b;
               this.d = dsm.b;
               break;
            case f:
               this.c = dqv.a;
               this.d = dsm.b;
               break;
            default:
               this.c = dqv.a;
               this.d = dsm.a;
         }
      }
   }

   public dsm a() {
      return this.d;
   }

   public dqv j() {
      return this.c;
   }

   public eqz k() {
      return this.h;
   }

   public abstract static class a {
      protected dzo a = dlw.a.m();

      public abstract void a(azt var1, int var2, int var3, int var4, boolean var5);

      public dzo a() {
         return this.a;
      }
   }
}
