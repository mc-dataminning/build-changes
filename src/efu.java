import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class efu {
   private static final Logger a = LogUtils.getLogger();
   protected static final dpi e = dcj.nc.n();
   protected efi f;
   @Nullable
   private ij b;
   private dhd c;
   private dit d;
   protected int g;
   private final egh h;
   private static final Set<dch> i = ImmutableSet.builder()
      .add(dcj.fo)
      .add(dcj.cp)
      .add(dcj.cq)
      .add(dcj.dU)
      .add(dcj.kd)
      .add(dcj.ki)
      .add(dcj.kg)
      .add(dcj.ke)
      .add(dcj.kf)
      .add(dcj.cO)
      .add(dcj.eW)
      .build();

   protected efu(egh $$0, int $$1, efi $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public efu(egh $$0, to $$1) {
      this(
         $$0, $$1.h("GD"), (efi)efi.a.parse(uc.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ij.b($$2));
   }

   protected static efi a(int $$0, int $$1, int $$2, ij $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ij.a.c
         ? new efi($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new efi($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ij a(axt $$0) {
      return ij.c.a.a($$0);
   }

   public final to a(egg $$0) {
      to $$1 = new to();
      $$1.a("id", kt.S.b(this.k()).toString());
      efi.a.encodeStart(uc.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ij $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(egg var1, to var2);

   public void a(efu $$0, efv $$1, axt $$2) {
   }

   public abstract void a(dab var1, czz var2, drf var3, axt var4, efi var5, cyn var6, id var7);

   public efi f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cyn $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public id h() {
      return new id(this.f.g());
   }

   protected id.a b(int $$0, int $$1, int $$2) {
      return new id.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ij $$2 = this.i();
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
      ij $$2 = this.i();
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

   protected void a(dab $$0, dpi $$1, int $$2, int $$3, int $$4, efi $$5) {
      id $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((czj)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dhd.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dit.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            elb $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(czj $$0, int $$1, int $$2, int $$3, efi $$4) {
      return true;
   }

   protected dpi a(cym $$0, int $$1, int $$2, int $$3, efi $$4) {
      id $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dcj.a.n() : $$0.a_($$5);
   }

   protected boolean b(czj $$0, int $$1, int $$2, int $$3, efi $$4) {
      id $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dva.a.c, $$5.u(), $$5.w());
   }

   protected void a(dab $$0, efi $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dcj.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dab $$0, efi $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dpi $$8, dpi $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cym)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(dab $$0, efi $$1, efi $$2, dpi $$3, dpi $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dab $$0, efi $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, axt $$9, efu.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cym)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dab $$0, efi $$1, efi $$2, boolean $$3, axt $$4, efu.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dab $$0, efi $$1, axt $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dpi $$10, dpi $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cym)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dab $$0, efi $$1, axt $$2, float $$3, int $$4, int $$5, int $$6, dpi $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dab $$0, efi $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dpi $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cym)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dab $$0, dpi $$1, int $$2, int $$3, int $$4, efi $$5) {
      id.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ij.a);
         }
      }
   }

   protected boolean a(dpi $$0) {
      return $$0.i() || $$0.k() || $$0.a(dcj.fg) || $$0.a(dcj.bw) || $$0.a(dcj.bx);
   }

   protected boolean a(dab $$0, efi $$1, axt $$2, int $$3, int $$4, int $$5, ajv $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dpi a(cym $$0, id $$1, dpi $$2) {
      ij $$3 = null;

      for (ij $$4 : ij.c.a) {
         id $$5 = $$1.a($$4);
         dpi $$6 = $$0.a_($$5);
         if ($$6.a(dcj.cv)) {
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
         return $$2.a(dgc.aE, $$3.g());
      } else {
         ij $$7 = $$2.c(dgc.aE);
         id $$8 = $$1.a($$7);
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

         return $$2.a(dgc.aE, $$7);
      }
   }

   protected boolean a(czv $$0, efi $$1, axt $$2, id $$3, ajv $$4, @Nullable dpi $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dcj.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dcj.cv.n());
         }

         $$0.a($$3, $$5, 2);
         dmo $$6 = $$0.c_($$3);
         if ($$6 instanceof dmv) {
            ((dmv)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dab $$0, efi $$1, axt $$2, int $$3, int $$4, int $$5, ij $$6, ajv $$7) {
      id $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dcj.aU)) {
         this.a($$0, dcj.aU.n().a(dem.b, $$6), $$3, $$4, $$5, $$1);
         dmo $$9 = $$0.c_($$8);
         if ($$9 instanceof dng) {
            ((dng)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static efi a(Stream<efu> $$0) {
      return efi.b($$0.map(efu::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static efu a(List<efu> $$0, efi $$1) {
      for (efu $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ij i() {
      return this.b;
   }

   public void a(@Nullable ij $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dit.a;
         this.c = dhd.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dhd.b;
               this.d = dit.a;
               break;
            case e:
               this.c = dhd.b;
               this.d = dit.b;
               break;
            case f:
               this.c = dhd.a;
               this.d = dit.b;
               break;
            default:
               this.c = dhd.a;
               this.d = dit.a;
         }
      }
   }

   public dit a() {
      return this.d;
   }

   public dhd j() {
      return this.c;
   }

   public egh k() {
      return this.h;
   }

   public abstract static class a {
      protected dpi a = dcj.a.n();

      public abstract void a(axt var1, int var2, int var3, int var4, boolean var5);

      public dpi a() {
         return this.a;
      }
   }
}
