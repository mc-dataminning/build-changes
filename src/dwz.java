import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dwz {
   private static final Logger a = LogUtils.getLogger();
   protected static final dgw e = cuv.nc.o();
   protected dwn f;
   @Nullable
   private hx b;
   private czp c;
   private dbf d;
   protected int g;
   private final dxm h;
   private static final Set<cut> i = ImmutableSet.builder()
      .add(cuv.fo)
      .add(cuv.cp)
      .add(cuv.cq)
      .add(cuv.dU)
      .add(cuv.kd)
      .add(cuv.ki)
      .add(cuv.kg)
      .add(cuv.ke)
      .add(cuv.kf)
      .add(cuv.cO)
      .add(cuv.eW)
      .build();

   protected dwz(dxm $$0, int $$1, dwn $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dwz(dxm $$0, rz $$1) {
      this(
         $$0, $$1.h("GD"), (dwn)dwn.a.parse(sn.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : hx.b($$2));
   }

   protected static dwn a(int $$0, int $$1, int $$2, hx $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == hx.a.c
         ? new dwn($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new dwn($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static hx a(ato $$0) {
      return hx.c.a.a($$0);
   }

   public final rz a(dxl $$0) {
      rz $$1 = new rz();
      $$1.a("id", jy.T.b(this.k()).toString());
      dwn.a.encodeStart(sn.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      hx $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dxl var1, rz var2);

   public void a(dwz $$0, dxa $$1, ato $$2) {
   }

   public abstract void a(csm var1, csk var2, dit var3, ato var4, dwn var5, cqz var6, ht var7);

   public dwn f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cqz $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public ht h() {
      return new ht(this.f.f());
   }

   protected ht.a b(int $$0, int $$1, int $$2) {
      return new ht.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      hx $$2 = this.i();
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
      hx $$2 = this.i();
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

   protected void a(csm $$0, dgw $$1, int $$2, int $$3, int $$4, dwn $$5) {
      ht $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((crv)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != czp.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dbf.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            ecg $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.x($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(crv $$0, int $$1, int $$2, int $$3, dwn $$4) {
      return true;
   }

   protected dgw a(cqy $$0, int $$1, int $$2, int $$3, dwn $$4) {
      ht $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cuv.a.o() : $$0.a_($$5);
   }

   protected boolean b(crv $$0, int $$1, int $$2, int $$3, dwn $$4) {
      ht $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dmf.a.c, $$5.u(), $$5.w());
   }

   protected void a(csm $$0, dwn $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, cuv.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(csm $$0, dwn $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dgw $$8, dgw $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cqy)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(csm $$0, dwn $$1, dwn $$2, dgw $$3, dgw $$4, boolean $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(csm $$0, dwn $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ato $$9, dwz.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cqy)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(csm $$0, dwn $$1, dwn $$2, boolean $$3, ato $$4, dwz.a $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(csm $$0, dwn $$1, ato $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dgw $$10, dgw $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cqy)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(csm $$0, dwn $$1, ato $$2, float $$3, int $$4, int $$5, int $$6, dgw $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(csm $$0, dwn $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dgw $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cqy)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(csm $$0, dgw $$1, int $$2, int $$3, int $$4, dwn $$5) {
      ht.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(hx.a);
         }
      }
   }

   protected boolean a(dgw $$0) {
      return $$0.i() || $$0.k() || $$0.a(cuv.fg) || $$0.a(cuv.bw) || $$0.a(cuv.bx);
   }

   protected boolean a(csm $$0, dwn $$1, ato $$2, int $$3, int $$4, int $$5, agg $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dgw a(cqy $$0, ht $$1, dgw $$2) {
      hx $$3 = null;

      for (hx $$4 : hx.c.a) {
         ht $$5 = $$1.a($$4);
         dgw $$6 = $$0.a_($$5);
         if ($$6.a(cuv.cv)) {
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
         return $$2.a(cyo.aE, $$3.g());
      } else {
         hx $$7 = $$2.c(cyo.aE);
         ht $$8 = $$1.a($$7);
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

         return $$2.a(cyo.aE, $$7);
      }
   }

   protected boolean a(csh $$0, dwn $$1, ato $$2, ht $$3, agg $$4, @Nullable dgw $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cuv.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cuv.cv.o());
         }

         $$0.a($$3, $$5, 2);
         der $$6 = $$0.c_($$3);
         if ($$6 instanceof dey) {
            ((dey)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(csm $$0, dwn $$1, ato $$2, int $$3, int $$4, int $$5, hx $$6, agg $$7) {
      ht $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cuv.aU)) {
         this.a($$0, cuv.aU.o().a(cwx.b, $$6), $$3, $$4, $$5, $$1);
         der $$9 = $$0.c_($$8);
         if ($$9 instanceof dfj) {
            ((dfj)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static dwn a(Stream<dwz> $$0) {
      return dwn.b($$0.map(dwz::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dwz a(List<dwz> $$0, dwn $$1) {
      for (dwz $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public hx i() {
      return this.b;
   }

   public void a(@Nullable hx $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dbf.a;
         this.c = czp.a;
      } else {
         switch ($$0) {
            case d:
               this.c = czp.b;
               this.d = dbf.a;
               break;
            case e:
               this.c = czp.b;
               this.d = dbf.b;
               break;
            case f:
               this.c = czp.a;
               this.d = dbf.b;
               break;
            default:
               this.c = czp.a;
               this.d = dbf.a;
         }
      }
   }

   public dbf a() {
      return this.d;
   }

   public czp j() {
      return this.c;
   }

   public dxm k() {
      return this.h;
   }

   public abstract static class a {
      protected dgw a = cuv.a.o();

      public abstract void a(ato var1, int var2, int var3, int var4, boolean var5);

      public dgw a() {
         return this.a;
      }
   }
}
