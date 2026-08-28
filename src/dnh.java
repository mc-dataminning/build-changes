import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dnh extends drp implements dqi {
   public static final MapCodec<dnh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czi.q.fieldOf("color").forGetter(dnh::b), t()).apply($$0, dnh::new));
   public static final eco<ecd> b = ecg.be;
   public static final ech c = ecg.x;
   private static final Map<jc, fgw> d = ag.a(() -> {
      fgw $$0 = dno.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      fgw $$1 = fgt.a($$0, h.a(i.a, i.b));
      return fgt.c(fgt.a(dno.b(16.0, 3.0, 9.0), $$0, $$1));
   });
   private final czi f;

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(czi $$0, ebp.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.C.b().b(b, ecd.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jc a(djn $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      return $$2.b() instanceof dnh ? $$2.c(e) : null;
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$1.C) {
         return bvc.b;
      } else {
         if ($$0.c(b) != ecd.a) {
            $$2 = $$2.a($$0.c(e));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bvc.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iw $$5 = $$2.a($$0.c(e).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fgc $$6 = $$2.b();
            $$1.a(null, $$1.al().a($$6), null, $$6, 5.0F, true, dkj.a.b);
            return bvc.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xg.c("block.minecraft.bed.occupied"), true);
            }

            return bvc.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bvc.b;
         }
      }
   }

   public static boolean a(dkj $$0) {
      return $$0.F_().l();
   }

   private boolean a(dkj $$0, iw $$1) {
      List<cru> $$2 = $$0.a(cru.class, new ffx($$1), byf::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(dkj $$0, ebq $$1, iw $$2, bxe $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5);
   }

   @Override
   public void a(djn $$0, bxe $$1) {
      if ($$1.ce()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bxe $$0) {
      fgc $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof byf ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == a($$0.c(b), $$0.c(e))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dnq.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jc a(ecd $$0, jc $$1) {
      return $$0 == ecd.b ? $$1 : $$1.g();
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      if (!$$0.C && $$3.gl()) {
         ecd $$4 = $$2.c(b);
         if ($$4 == ecd.b) {
            iw $$5 = $$1.a(a($$4, $$2.c(e)));
            ebq $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == ecd.a) {
               $$0.a($$5, dnq.a.m(), 35);
               $$0.a($$3, 2001, $$5, dno.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      jc $$1 = $$0.g();
      iw $$2 = $$0.a();
      iw $$3 = $$2.a($$1);
      dkj $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.E_().a($$3) ? this.m().b(e, $$1) : null;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d.get(h($$0).g());
   }

   public static jc h(ebq $$0) {
      jc $$1 = $$0.c(e);
      return $$0.c(b) == ecd.a ? $$1.g() : $$1;
   }

   public static dpw.a i(ebq $$0) {
      ecd $$1 = $$0.c(b);
      return $$1 == ecd.a ? dpw.a.b : dpw.a.c;
   }

   private static boolean b(djn $$0, iw $$1) {
      return $$0.a_($$1.e()).b() instanceof dnh;
   }

   public static Optional<fgc> a(bxn<?> $$0, djr $$1, iw $$2, jc $$3, float $$4) {
      jc $$5 = $$3.h();
      jc $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fgc> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fgc> a(bxn<?> $$0, djr $$1, iw $$2, jc $$3, jc $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fgc> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iw $$7 = $$2.e();
         Optional<fgc> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fgc> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fgc> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fgc> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fgc> a(bxn<?> $$0, djr $$1, iw $$2, int[][] $$3, boolean $$4) {
      iw.a $$5 = new iw.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fgc $$7 = cvb.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e, b, c);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyk($$0, $$1, this.f);
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, @Nullable byf $$3, dak $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         iw $$5 = $$1.a($$2.c(e));
         $$0.a($$5, $$2.b(b, ecd.a), 3);
         $$0.a($$1, dnq.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public czi b() {
      return this.f;
   }

   @Override
   protected long a(ebq $$0, iw $$1) {
      iw $$2 = $$1.a($$0.c(e), $$0.c(b) == ecd.a ? 0 : 1);
      return azz.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   private static int[][] a(jc $$0, jc $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jc $$0, jc $$1) {
      return new int[][]{
         {$$1.j(), $$1.l()},
         {$$1.j() - $$0.j(), $$1.l() - $$0.l()},
         {$$1.j() - $$0.j() * 2, $$1.l() - $$0.l() * 2},
         {-$$0.j() * 2, -$$0.l() * 2},
         {-$$1.j() - $$0.j() * 2, -$$1.l() - $$0.l() * 2},
         {-$$1.j() - $$0.j(), -$$1.l() - $$0.l()},
         {-$$1.j(), -$$1.l()},
         {-$$1.j() + $$0.j(), -$$1.l() + $$0.l()},
         {$$0.j(), $$0.l()},
         {$$1.j() + $$0.j(), $$1.l() + $$0.l()}
      };
   }

   private static int[][] a(jc $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
