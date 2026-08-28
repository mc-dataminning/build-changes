import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class eoo {
   private static final Logger a = LogUtils.getLogger();
   protected static final dxv e = dko.nx.m();
   protected eoc f;
   @Nullable
   private jm b;
   private dpl c;
   private drc d;
   protected int g;
   private final epb h;
   private static final Set<dkm> i = ImmutableSet.builder()
      .add(dko.fC)
      .add(dko.cw)
      .add(dko.cx)
      .add(dko.eh)
      .add(dko.kw)
      .add(dko.kB)
      .add(dko.kC)
      .add(dko.kz)
      .add(dko.kx)
      .add(dko.ky)
      .add(dko.cX)
      .add(dko.fk)
      .build();

   protected eoo(epb $$0, int $$1, eoc $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public eoo(epb $$0, ux $$1) {
      this($$0, $$1.h("GD"), (eoc)eoc.a.parse(vl.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jm.b($$2));
   }

   protected static eoc a(int $$0, int $$1, int $$2, jm $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jm.a.c
         ? new eoc($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eoc($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jm a(bam $$0) {
      return jm.c.a.a($$0);
   }

   public final ux a(epa $$0) {
      ux $$1 = new ux();
      $$1.a("id", ma.Q.b(this.k()).toString());
      eoc.a.encodeStart(vl.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jm $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(epa var1, ux var2);

   public void a(eoo $$0, eop $$1, bam $$2) {
   }

   public abstract void a(dig var1, die var2, dzr var3, bam var4, eoc var5, dgo var6, jh var7);

   public eoc f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dgo $$0, int $$1) {
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

   protected void a(dig $$0, dxv $$1, int $$2, int $$3, int $$4, eoc $$5) {
      jh $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dhl)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dpl.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != drc.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            etx $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dhl $$0, int $$1, int $$2, int $$3, eoc $$4) {
      return true;
   }

   protected dxv a(dgn $$0, int $$1, int $$2, int $$3, eoc $$4) {
      jh $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dko.a.m() : $$0.a_($$5);
   }

   protected boolean b(dhl $$0, int $$1, int $$2, int $$3, eoc $$4) {
      jh $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(edq.a.c, $$5.u(), $$5.w());
   }

   protected void a(dig $$0, eoc $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dko.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dig $$0, eoc $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dxv $$8, dxv $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dgn)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dig $$0, eoc $$1, eoc $$2, dxv $$3, dxv $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dig $$0, eoc $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, bam $$9, eoo.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dgn)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dig $$0, eoc $$1, eoc $$2, boolean $$3, bam $$4, eoo.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dig $$0, eoc $$1, bam $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dxv $$10, dxv $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dgn)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dig $$0, eoc $$1, bam $$2, float $$3, int $$4, int $$5, int $$6, dxv $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dig $$0, eoc $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dxv $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dgn)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dig $$0, dxv $$1, int $$2, int $$3, int $$4, eoc $$5) {
      jh.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.L_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jm.a);
         }
      }
   }

   protected boolean a(dxv $$0) {
      return $$0.l() || $$0.n() || $$0.a(dko.fu) || $$0.a(dko.bD) || $$0.a(dko.bE);
   }

   protected boolean a(dig $$0, eoc $$1, bam $$2, int $$3, int $$4, int $$5, aly<ewu> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dxv a(dgn $$0, jh $$1, dxv $$2) {
      jm $$3 = null;

      for (jm $$4 : jm.c.a) {
         jh $$5 = $$1.a($$4);
         dxv $$6 = $$0.a_($$5);
         if ($$6.a(dko.cD)) {
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
         return $$2.b(dok.aF, $$3.g());
      } else {
         jm $$7 = $$2.c(dok.aF);
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

         return $$2.b(dok.aF, $$7);
      }
   }

   protected boolean a(dhz $$0, eoc $$1, bam $$2, jh $$3, aly<ewu> $$4, @Nullable dxv $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dko.cD)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dko.cD.m());
         }

         $$0.a($$3, $$5, 2);
         dux $$6 = $$0.c_($$3);
         if ($$6 instanceof dve) {
            ((dve)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dig $$0, eoc $$1, bam $$2, int $$3, int $$4, int $$5, jm $$6, aly<ewu> $$7) {
      jh $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dko.bb)) {
         this.a($$0, dko.bb.m().b(dmt.b, $$6), $$3, $$4, $$5, $$1);
         dux $$9 = $$0.c_($$8);
         if ($$9 instanceof dvr) {
            ((dvr)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eoc a(Stream<eoo> $$0) {
      return eoc.b($$0.map(eoo::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static eoo a(List<eoo> $$0, eoc $$1) {
      for (eoo $$2 : $$0) {
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
         this.d = drc.a;
         this.c = dpl.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dpl.b;
               this.d = drc.a;
               break;
            case e:
               this.c = dpl.b;
               this.d = drc.b;
               break;
            case f:
               this.c = dpl.a;
               this.d = drc.b;
               break;
            default:
               this.c = dpl.a;
               this.d = drc.a;
         }
      }
   }

   public drc a() {
      return this.d;
   }

   public dpl j() {
      return this.c;
   }

   public epb k() {
      return this.h;
   }

   public abstract static class a {
      protected dxv a = dko.a.m();

      public abstract void a(bam var1, int var2, int var3, int var4, boolean var5);

      public dxv a() {
         return this.a;
      }
   }
}
