import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dmx extends drf implements dpy {
   public static final MapCodec<dmx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyy.q.fieldOf("color").forGetter(dmx::b), t()).apply($$0, dmx::new));
   public static final ece<ebt> b = ebw.be;
   public static final ebx c = ebw.x;
   private static final Map<jc, fgm> d = ag.a(() -> {
      fgm $$0 = dne.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      fgm $$1 = fgj.a($$0, h.a(i.a, i.b));
      return fgj.c(fgj.a(dne.b(16.0, 3.0, 9.0), $$0, $$1));
   });
   private final cyy f;

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(cyy $$0, ebf.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.C.b().b(b, ebt.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jc a(djd $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      return $$2.b() instanceof dmx ? $$2.c(e) : null;
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1.C) {
         return but.b;
      } else {
         if ($$0.c(b) != ebt.a) {
            $$2 = $$2.a($$0.c(e));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return but.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iw $$5 = $$2.a($$0.c(e).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ffs $$6 = $$2.b();
            $$1.a(null, $$1.al().a($$6), null, $$6, 5.0F, true, djz.a.b);
            return but.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xc.c("block.minecraft.bed.occupied"), true);
            }

            return but.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return but.b;
         }
      }
   }

   public static boolean a(djz $$0) {
      return $$0.F_().l();
   }

   private boolean a(djz $$0, iw $$1) {
      List<crl> $$2 = $$0.a(crl.class, new ffn($$1), bxw::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(djz $$0, ebg $$1, iw $$2, bwv $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5);
   }

   @Override
   public void a(djd $$0, bwv $$1) {
      if ($$1.ce()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bwv $$0) {
      ffs $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bxw ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == a($$0.c(b), $$0.c(e))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dng.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jc a(ebt $$0, jc $$1) {
      return $$0 == ebt.b ? $$1 : $$1.g();
   }

   @Override
   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      if (!$$0.C && $$3.gl()) {
         ebt $$4 = $$2.c(b);
         if ($$4 == ebt.b) {
            iw $$5 = $$1.a(a($$4, $$2.c(e)));
            ebg $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == ebt.a) {
               $$0.a($$5, dng.a.m(), 35);
               $$0.a($$3, 2001, $$5, dne.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      jc $$1 = $$0.g();
      iw $$2 = $$0.a();
      iw $$3 = $$2.a($$1);
      djz $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.E_().a($$3) ? this.m().b(e, $$1) : null;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d.get(h($$0).g());
   }

   public static jc h(ebg $$0) {
      jc $$1 = $$0.c(e);
      return $$0.c(b) == ebt.a ? $$1.g() : $$1;
   }

   public static dpm.a i(ebg $$0) {
      ebt $$1 = $$0.c(b);
      return $$1 == ebt.a ? dpm.a.b : dpm.a.c;
   }

   private static boolean b(djd $$0, iw $$1) {
      return $$0.a_($$1.e()).b() instanceof dmx;
   }

   public static Optional<ffs> a(bxe<?> $$0, djh $$1, iw $$2, jc $$3, float $$4) {
      jc $$5 = $$3.h();
      jc $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ffs> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ffs> a(bxe<?> $$0, djh $$1, iw $$2, jc $$3, jc $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ffs> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iw $$7 = $$2.e();
         Optional<ffs> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ffs> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ffs> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ffs> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ffs> a(bxe<?> $$0, djh $$1, iw $$2, int[][] $$3, boolean $$4) {
      iw.a $$5 = new iw.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ffs $$7 = cus.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e, b, c);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dya($$0, $$1, this.f);
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, @Nullable bxw $$3, daa $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         iw $$5 = $$1.a($$2.c(e));
         $$0.a($$5, $$2.b(b, ebt.a), 3);
         $$0.a($$1, dng.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cyy b() {
      return this.f;
   }

   @Override
   protected long a(ebg $$0, iw $$1) {
      iw $$2 = $$1.a($$0.c(e), $$0.c(b) == ebt.a ? 0 : 1);
      return azq.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
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
