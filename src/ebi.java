import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ebi {
   private static final Logger a = LogUtils.getLogger();
   protected static final dlf e = cyq.nc.o();
   protected eaw f;
   @Nullable
   private ie b;
   private ddk c;
   private dfa d;
   protected int g;
   private final ebv h;
   private static final Set<cyo> i = ImmutableSet.builder()
      .add(cyq.fo)
      .add(cyq.cp)
      .add(cyq.cq)
      .add(cyq.dU)
      .add(cyq.kd)
      .add(cyq.ki)
      .add(cyq.kg)
      .add(cyq.ke)
      .add(cyq.kf)
      .add(cyq.cO)
      .add(cyq.eW)
      .build();

   protected ebi(ebv $$0, int $$1, eaw $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public ebi(ebv $$0, sw $$1) {
      this(
         $$0, $$1.h("GD"), (eaw)eaw.a.parse(tk.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ie.b($$2));
   }

   protected static eaw a(int $$0, int $$1, int $$2, ie $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ie.a.c
         ? new eaw($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eaw($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ie a(awo $$0) {
      return ie.c.a.a($$0);
   }

   public final sw a(ebu $$0) {
      sw $$1 = new sw();
      $$1.a("id", kf.S.b(this.k()).toString());
      eaw.a.encodeStart(tk.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ie $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ebu var1, sw var2);

   public void a(ebi $$0, ebj $$1, awo $$2) {
   }

   public abstract void a(cwi var1, cwg var2, dnc var3, awo var4, eaw var5, cuu var6, hz var7);

   public eaw f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cuu $$0, int $$1) {
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

   protected void a(cwi $$0, dlf $$1, int $$2, int $$3, int $$4, eaw $$5) {
      hz $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cvq)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != ddk.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dfa.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            egp $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cvq $$0, int $$1, int $$2, int $$3, eaw $$4) {
      return true;
   }

   protected dlf a(cut $$0, int $$1, int $$2, int $$3, eaw $$4) {
      hz $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cyq.a.o() : $$0.a_($$5);
   }

   protected boolean b(cvq $$0, int $$1, int $$2, int $$3, eaw $$4) {
      hz $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dqo.a.c, $$5.u(), $$5.w());
   }

   protected void a(cwi $$0, eaw $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, cyq.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(cwi $$0, eaw $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dlf $$8, dlf $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cut)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(cwi $$0, eaw $$1, eaw $$2, dlf $$3, dlf $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(cwi $$0, eaw $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, awo $$9, ebi.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cut)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(cwi $$0, eaw $$1, eaw $$2, boolean $$3, awo $$4, ebi.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(cwi $$0, eaw $$1, awo $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dlf $$10, dlf $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cut)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(cwi $$0, eaw $$1, awo $$2, float $$3, int $$4, int $$5, int $$6, dlf $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(cwi $$0, eaw $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dlf $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cut)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(cwi $$0, dlf $$1, int $$2, int $$3, int $$4, eaw $$5) {
      hz.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.J_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ie.a);
         }
      }
   }

   protected boolean a(dlf $$0) {
      return $$0.i() || $$0.k() || $$0.a(cyq.fg) || $$0.a(cyq.bw) || $$0.a(cyq.bx);
   }

   protected boolean a(cwi $$0, eaw $$1, awo $$2, int $$3, int $$4, int $$5, aiy $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dlf a(cut $$0, hz $$1, dlf $$2) {
      ie $$3 = null;

      for (ie $$4 : ie.c.a) {
         hz $$5 = $$1.a($$4);
         dlf $$6 = $$0.a_($$5);
         if ($$6.a(cyq.cv)) {
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
         return $$2.a(dcj.aE, $$3.g());
      } else {
         ie $$7 = $$2.c(dcj.aE);
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

         return $$2.a(dcj.aE, $$7);
      }
   }

   protected boolean a(cwc $$0, eaw $$1, awo $$2, hz $$3, aiy $$4, @Nullable dlf $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cyq.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cyq.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dit $$6 = $$0.c_($$3);
         if ($$6 instanceof dja) {
            ((dja)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(cwi $$0, eaw $$1, awo $$2, int $$3, int $$4, int $$5, ie $$6, aiy $$7) {
      hz $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cyq.aU)) {
         this.a($$0, cyq.aU.o().a(dat.b, $$6), $$3, $$4, $$5, $$1);
         dit $$9 = $$0.c_($$8);
         if ($$9 instanceof djl) {
            ((djl)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eaw a(Stream<ebi> $$0) {
      return eaw.b($$0.map(ebi::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static ebi a(List<ebi> $$0, eaw $$1) {
      for (ebi $$2 : $$0) {
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
         this.d = dfa.a;
         this.c = ddk.a;
      } else {
         switch ($$0) {
            case d:
               this.c = ddk.b;
               this.d = dfa.a;
               break;
            case e:
               this.c = ddk.b;
               this.d = dfa.b;
               break;
            case f:
               this.c = ddk.a;
               this.d = dfa.b;
               break;
            default:
               this.c = ddk.a;
               this.d = dfa.a;
         }
      }
   }

   public dfa a() {
      return this.d;
   }

   public ddk j() {
      return this.c;
   }

   public ebv k() {
      return this.h;
   }

   public abstract static class a {
      protected dlf a = cyq.a.o();

      public abstract void a(awo var1, int var2, int var3, int var4, boolean var5);

      public dlf a() {
         return this.a;
      }
   }
}
