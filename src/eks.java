import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class eks {
   private static final Logger a = LogUtils.getLogger();
   protected static final dua e = dgx.nc.o();
   protected ekg f;
   @Nullable
   private jj b;
   private dls c;
   private dnj d;
   protected int g;
   private final elf h;
   private static final Set<dgv> i = ImmutableSet.builder()
      .add(dgx.fo)
      .add(dgx.cp)
      .add(dgx.cq)
      .add(dgx.dU)
      .add(dgx.kd)
      .add(dgx.ki)
      .add(dgx.kg)
      .add(dgx.ke)
      .add(dgx.kf)
      .add(dgx.cO)
      .add(dgx.eW)
      .build();

   protected eks(elf $$0, int $$1, ekg $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public eks(elf $$0, uf $$1) {
      this($$0, $$1.h("GD"), (ekg)ekg.a.parse(ut.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jj.b($$2));
   }

   protected static ekg a(int $$0, int $$1, int $$2, jj $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jj.a.c
         ? new ekg($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new ekg($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jj a(azk $$0) {
      return jj.c.a.a($$0);
   }

   public final uf a(ele $$0) {
      uf $$1 = new uf();
      $$1.a("id", lu.Q.b(this.k()).toString());
      ekg.a.encodeStart(ut.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jj $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ele var1, uf var2);

   public void a(eks $$0, ekt $$1, azk $$2) {
   }

   public abstract void a(dep var1, den var2, dvx var3, azk var4, ekg var5, dcy var6, je var7);

   public ekg f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dcy $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public je h() {
      return new je(this.f.g());
   }

   protected je.a b(int $$0, int $$1, int $$2) {
      return new je.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jj $$2 = this.i();
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
      jj $$2 = this.i();
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

   protected void a(dep $$0, dua $$1, int $$2, int $$3, int $$4, ekg $$5) {
      je $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((ddv)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dls.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dnj.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eqb $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(ddv $$0, int $$1, int $$2, int $$3, ekg $$4) {
      return true;
   }

   protected dua a(dcx $$0, int $$1, int $$2, int $$3, ekg $$4) {
      je $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dgx.a.o() : $$0.a_($$5);
   }

   protected boolean b(ddv $$0, int $$1, int $$2, int $$3, ekg $$4) {
      je $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dzw.a.c, $$5.u(), $$5.w());
   }

   protected void a(dep $$0, ekg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dgx.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dep $$0, ekg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dua $$8, dua $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dcx)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dep $$0, ekg $$1, ekg $$2, dua $$3, dua $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dep $$0, ekg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azk $$9, eks.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dcx)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dep $$0, ekg $$1, ekg $$2, boolean $$3, azk $$4, eks.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dep $$0, ekg $$1, azk $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dua $$10, dua $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dcx)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dep $$0, ekg $$1, azk $$2, float $$3, int $$4, int $$5, int $$6, dua $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dep $$0, ekg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dua $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dcx)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dep $$0, dua $$1, int $$2, int $$3, int $$4, ekg $$5) {
      je.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.G_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jj.a);
         }
      }
   }

   protected boolean a(dua $$0) {
      return $$0.l() || $$0.n() || $$0.a(dgx.fg) || $$0.a(dgx.bw) || $$0.a(dgx.bx);
   }

   protected boolean a(dep $$0, ekg $$1, azk $$2, int $$3, int $$4, int $$5, ala<esy> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dua a(dcx $$0, je $$1, dua $$2) {
      jj $$3 = null;

      for (jj $$4 : jj.c.a) {
         je $$5 = $$1.a($$4);
         dua $$6 = $$0.a_($$5);
         if ($$6.a(dgx.cv)) {
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
         return $$2.b(dkr.aE, $$3.g());
      } else {
         jj $$7 = $$2.c(dkr.aE);
         je $$8 = $$1.a($$7);
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

         return $$2.b(dkr.aE, $$7);
      }
   }

   protected boolean a(dei $$0, ekg $$1, azk $$2, je $$3, ala<esy> $$4, @Nullable dua $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dgx.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dgx.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dre $$6 = $$0.c_($$3);
         if ($$6 instanceof drl) {
            ((drl)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dep $$0, ekg $$1, azk $$2, int $$3, int $$4, int $$5, jj $$6, ala<esy> $$7) {
      je $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dgx.aU)) {
         this.a($$0, dgx.aU.o().b(dja.b, $$6), $$3, $$4, $$5, $$1);
         dre $$9 = $$0.c_($$8);
         if ($$9 instanceof drx) {
            ((drx)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static ekg a(Stream<eks> $$0) {
      return ekg.b($$0.map(eks::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static eks a(List<eks> $$0, ekg $$1) {
      for (eks $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jj i() {
      return this.b;
   }

   public void a(@Nullable jj $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dnj.a;
         this.c = dls.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dls.b;
               this.d = dnj.a;
               break;
            case e:
               this.c = dls.b;
               this.d = dnj.b;
               break;
            case f:
               this.c = dls.a;
               this.d = dnj.b;
               break;
            default:
               this.c = dls.a;
               this.d = dnj.a;
         }
      }
   }

   public dnj a() {
      return this.d;
   }

   public dls j() {
      return this.c;
   }

   public elf k() {
      return this.h;
   }

   public abstract static class a {
      protected dua a = dgx.a.o();

      public abstract void a(azk var1, int var2, int var3, int var4, boolean var5);

      public dua a() {
         return this.a;
      }
   }
}
