import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dvb {
   private static final Logger a = LogUtils.getLogger();
   protected static final dey e = csl.nc.n();
   protected dup f;
   @Nullable
   private hb b;
   private cxf c;
   private cyw d;
   protected int g;
   private final dvo h;
   private static final Set<csk> i = ImmutableSet.builder()
      .add(csl.fo)
      .add(csl.cp)
      .add(csl.cq)
      .add(csl.dU)
      .add(csl.kd)
      .add(csl.ki)
      .add(csl.kg)
      .add(csl.ke)
      .add(csl.kf)
      .add(csl.cO)
      .add(csl.eX)
      .build();

   protected dvb(dvo $$0, int $$1, dup $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dvb(dvo $$0, qs $$1) {
      this(
         $$0, $$1.h("GD"), (dup)dup.a.parse(rd.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : hb.b($$2));
   }

   protected static dup a(int $$0, int $$1, int $$2, hb $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == hb.a.c
         ? new dup($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new dup($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static hb a(art $$0) {
      return hb.c.a.a($$0);
   }

   public final qs a(dvn $$0) {
      qs $$1 = new qs();
      $$1.a("id", jc.T.b(this.k()).toString());
      dup.a.encodeStart(rd.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      hb $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dvn var1, qs var2);

   public void a(dvb $$0, dvc $$1, art $$2) {
   }

   public abstract void a(cqe var1, cqc var2, dgv var3, art var4, dup var5, cor var6, gv var7);

   public dup f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cor $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public gv h() {
      return new gv(this.f.f());
   }

   protected gv.a b(int $$0, int $$1, int $$2) {
      return new gv.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      hb $$2 = this.i();
      if ($$2 == null) {
         return $$0;
      } else {
         switch ($$2) {
            case c:
            case d:
               return this.f.g() + $$0;
            case e:
               return this.f.j() - $$1;
            case f:
               return this.f.g() + $$1;
            default:
               return $$0;
         }
      }
   }

   protected int b(int $$0) {
      return this.i() == null ? $$0 : $$0 + this.f.h();
   }

   protected int b(int $$0, int $$1) {
      hb $$2 = this.i();
      if ($$2 == null) {
         return $$1;
      } else {
         switch ($$2) {
            case c:
               return this.f.l() - $$1;
            case d:
               return this.f.i() + $$1;
            case e:
            case f:
               return this.f.i() + $$0;
            default:
               return $$1;
         }
      }
   }

   protected void a(cqe $$0, dey $$1, int $$2, int $$3, int $$4, dup $$5) {
      gv $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cpn)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != cxf.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != cyw.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eab $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.x($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cpn $$0, int $$1, int $$2, int $$3, dup $$4) {
      return true;
   }

   protected dey a(coq $$0, int $$1, int $$2, int $$3, dup $$4) {
      gv $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? csl.a.n() : $$0.a_($$5);
   }

   protected boolean b(cpn $$0, int $$1, int $$2, int $$3, dup $$4) {
      gv $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dkh.a.c, $$5.u(), $$5.w());
   }

   protected void a(cqe $$0, dup $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, csl.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(cqe $$0, dup $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dey $$8, dey $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((coq)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(cqe $$0, dup $$1, dup $$2, dey $$3, dey $$4, boolean $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(cqe $$0, dup $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, art $$9, dvb.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((coq)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(cqe $$0, dup $$1, dup $$2, boolean $$3, art $$4, dvb.a $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(cqe $$0, dup $$1, art $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dey $$10, dey $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((coq)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(cqe $$0, dup $$1, art $$2, float $$3, int $$4, int $$5, int $$6, dey $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(cqe $$0, dup $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dey $$8, boolean $$9) {
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
               if (!$$9 || !this.a((coq)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(cqe $$0, dey $$1, int $$2, int $$3, int $$4, dup $$5) {
      gv.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.C_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(hb.a);
         }
      }
   }

   protected boolean a(dey $$0) {
      return $$0.i() || $$0.k() || $$0.a(csl.fg) || $$0.a(csl.bw) || $$0.a(csl.bx);
   }

   protected boolean a(cqe $$0, dup $$1, art $$2, int $$3, int $$4, int $$5, aep $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dey a(coq $$0, gv $$1, dey $$2) {
      hb $$3 = null;

      for (hb $$4 : hb.c.a) {
         gv $$5 = $$1.a($$4);
         dey $$6 = $$0.a_($$5);
         if ($$6.a(csl.cv)) {
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
         return $$2.a(cwd.aC, $$3.g());
      } else {
         hb $$7 = $$2.c(cwd.aC);
         gv $$8 = $$1.a($$7);
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

         return $$2.a(cwd.aC, $$7);
      }
   }

   protected boolean a(cpz $$0, dup $$1, art $$2, gv $$3, aep $$4, @Nullable dey $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(csl.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, csl.cv.n());
         }

         $$0.a($$3, $$5, 2);
         dck $$6 = $$0.c_($$3);
         if ($$6 instanceof dcr) {
            ((dcr)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(cqe $$0, dup $$1, art $$2, int $$3, int $$4, int $$5, hb $$6, aep $$7) {
      gv $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(csl.aU)) {
         this.a($$0, csl.aU.n().a(cul.a, $$6), $$3, $$4, $$5, $$1);
         dck $$9 = $$0.c_($$8);
         if ($$9 instanceof ddb) {
            ((ddb)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static dup a(Stream<dvb> $$0) {
      return dup.b($$0.map(dvb::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dvb a(List<dvb> $$0, dup $$1) {
      for (dvb $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public hb i() {
      return this.b;
   }

   public void a(@Nullable hb $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = cyw.a;
         this.c = cxf.a;
      } else {
         switch ($$0) {
            case d:
               this.c = cxf.b;
               this.d = cyw.a;
               break;
            case e:
               this.c = cxf.b;
               this.d = cyw.b;
               break;
            case f:
               this.c = cxf.a;
               this.d = cyw.b;
               break;
            default:
               this.c = cxf.a;
               this.d = cyw.a;
         }
      }
   }

   public cyw a() {
      return this.d;
   }

   public cxf j() {
      return this.c;
   }

   public dvo k() {
      return this.h;
   }

   public abstract static class a {
      protected dey a = csl.a.n();

      public abstract void a(art var1, int var2, int var3, int var4, boolean var5);

      public dey a() {
         return this.a;
      }
   }
}
