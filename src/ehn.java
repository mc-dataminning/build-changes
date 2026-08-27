import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ehn {
   private static final Logger a = LogUtils.getLogger();
   protected static final drb e = dea.nc.n();
   protected ehb f;
   @Nullable
   private it b;
   private div c;
   private dkl d;
   protected int g;
   private final eia h;
   private static final Set<ddy> i = ImmutableSet.builder()
      .add(dea.fo)
      .add(dea.cp)
      .add(dea.cq)
      .add(dea.dU)
      .add(dea.kd)
      .add(dea.ki)
      .add(dea.kg)
      .add(dea.ke)
      .add(dea.kf)
      .add(dea.cO)
      .add(dea.eW)
      .build();

   protected ehn(eia $$0, int $$1, ehb $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public ehn(eia $$0, ud $$1) {
      this(
         $$0, $$1.h("GD"), (ehb)ehb.a.parse(ur.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : it.b($$2));
   }

   protected static ehb a(int $$0, int $$1, int $$2, it $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == it.a.c
         ? new ehb($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new ehb($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static it a(ayk $$0) {
      return it.c.a.a($$0);
   }

   public final ud a(ehz $$0) {
      ud $$1 = new ud();
      $$1.a("id", le.S.b(this.k()).toString());
      ehb.a.encodeStart(ur.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      it $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ehz var1, ud var2);

   public void a(ehn $$0, eho $$1, ayk $$2) {
   }

   public abstract void a(dbs var1, dbq var2, dsy var3, ayk var4, ehb var5, dae var6, io var7);

   public ehb f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dae $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public io h() {
      return new io(this.f.g());
   }

   protected io.a b(int $$0, int $$1, int $$2) {
      return new io.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      it $$2 = this.i();
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
      it $$2 = this.i();
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

   protected void a(dbs $$0, drb $$1, int $$2, int $$3, int $$4, ehb $$5) {
      io $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dba)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != div.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dkl.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            emu $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dba $$0, int $$1, int $$2, int $$3, ehb $$4) {
      return true;
   }

   protected drb a(dad $$0, int $$1, int $$2, int $$3, ehb $$4) {
      io $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dea.a.n() : $$0.a_($$5);
   }

   protected boolean b(dba $$0, int $$1, int $$2, int $$3, ehb $$4) {
      io $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dwt.a.c, $$5.u(), $$5.w());
   }

   protected void a(dbs $$0, ehb $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dea.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dbs $$0, ehb $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, drb $$8, drb $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dad)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(dbs $$0, ehb $$1, ehb $$2, drb $$3, drb $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dbs $$0, ehb $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ayk $$9, ehn.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dad)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dbs $$0, ehb $$1, ehb $$2, boolean $$3, ayk $$4, ehn.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dbs $$0, ehb $$1, ayk $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, drb $$10, drb $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dad)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dbs $$0, ehb $$1, ayk $$2, float $$3, int $$4, int $$5, int $$6, drb $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dbs $$0, ehb $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, drb $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dad)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dbs $$0, drb $$1, int $$2, int $$3, int $$4, ehb $$5) {
      io.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(it.a);
         }
      }
   }

   protected boolean a(drb $$0) {
      return $$0.i() || $$0.k() || $$0.a(dea.fg) || $$0.a(dea.bw) || $$0.a(dea.bx);
   }

   protected boolean a(dbs $$0, ehb $$1, ayk $$2, int $$3, int $$4, int $$5, akl<epk> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static drb a(dad $$0, io $$1, drb $$2) {
      it $$3 = null;

      for (it $$4 : it.c.a) {
         io $$5 = $$1.a($$4);
         drb $$6 = $$0.a_($$5);
         if ($$6.a(dea.cv)) {
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
         return $$2.a(dhu.aE, $$3.g());
      } else {
         it $$7 = $$2.c(dhu.aE);
         io $$8 = $$1.a($$7);
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

         return $$2.a(dhu.aE, $$7);
      }
   }

   protected boolean a(dbm $$0, ehb $$1, ayk $$2, io $$3, akl<epk> $$4, @Nullable drb $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dea.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dea.cv.n());
         }

         $$0.a($$3, $$5, 2);
         dog $$6 = $$0.c_($$3);
         if ($$6 instanceof don) {
            ((don)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dbs $$0, ehb $$1, ayk $$2, int $$3, int $$4, int $$5, it $$6, akl<epk> $$7) {
      io $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dea.aU)) {
         this.a($$0, dea.aU.n().a(dgd.b, $$6), $$3, $$4, $$5, $$1);
         dog $$9 = $$0.c_($$8);
         if ($$9 instanceof doy) {
            ((doy)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static ehb a(Stream<ehn> $$0) {
      return ehb.b($$0.map(ehn::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static ehn a(List<ehn> $$0, ehb $$1) {
      for (ehn $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public it i() {
      return this.b;
   }

   public void a(@Nullable it $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dkl.a;
         this.c = div.a;
      } else {
         switch ($$0) {
            case d:
               this.c = div.b;
               this.d = dkl.a;
               break;
            case e:
               this.c = div.b;
               this.d = dkl.b;
               break;
            case f:
               this.c = div.a;
               this.d = dkl.b;
               break;
            default:
               this.c = div.a;
               this.d = dkl.a;
         }
      }
   }

   public dkl a() {
      return this.d;
   }

   public div j() {
      return this.c;
   }

   public eia k() {
      return this.h;
   }

   public abstract static class a {
      protected drb a = dea.a.n();

      public abstract void a(ayk var1, int var2, int var3, int var4, boolean var5);

      public drb a() {
         return this.a;
      }
   }
}
