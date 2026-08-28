import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dmv extends drd implements dpw {
   public static final MapCodec<dmv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyw.q.fieldOf("color").forGetter(dmv::b), t()).apply($$0, dmv::new));
   public static final ecc<ebr> b = ebu.be;
   public static final ebv c = ebu.x;
   private static final Map<jb, fgk> d = ag.a(() -> {
      fgk $$0 = dnc.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      fgk $$1 = fgh.a($$0, h.a(i.a, i.b));
      return fgh.c(fgh.a(dnc.b(16.0, 3.0, 9.0), $$0, $$1));
   });
   private final cyw f;

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(cyw $$0, ebd.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.C.b().b(b, ebr.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jb a(djb $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      return $$2.b() instanceof dmv ? $$2.c(e) : null;
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1.C) {
         return bur.b;
      } else {
         if ($$0.c(b) != ebr.a) {
            $$2 = $$2.a($$0.c(e));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bur.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iv $$5 = $$2.a($$0.c(e).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ffq $$6 = $$2.b();
            $$1.a(null, $$1.al().a($$6), null, $$6, 5.0F, true, djx.a.b);
            return bur.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xa.c("block.minecraft.bed.occupied"), true);
            }

            return bur.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bur.b;
         }
      }
   }

   public static boolean a(djx $$0) {
      return $$0.F_().l();
   }

   private boolean a(djx $$0, iv $$1) {
      List<crj> $$2 = $$0.a(crj.class, new ffl($$1), bxu::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(djx $$0, ebe $$1, iv $$2, bwt $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5);
   }

   @Override
   public void a(djb $$0, bwt $$1) {
      if ($$1.ce()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bwt $$0) {
      ffq $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bxu ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4 == a($$0.c(b), $$0.c(e))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dne.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jb a(ebr $$0, jb $$1) {
      return $$0 == ebr.b ? $$1 : $$1.g();
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      if (!$$0.C && $$3.gl()) {
         ebr $$4 = $$2.c(b);
         if ($$4 == ebr.b) {
            iv $$5 = $$1.a(a($$4, $$2.c(e)));
            ebe $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == ebr.a) {
               $$0.a($$5, dne.a.m(), 35);
               $$0.a($$3, 2001, $$5, dnc.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      jb $$1 = $$0.g();
      iv $$2 = $$0.a();
      iv $$3 = $$2.a($$1);
      djx $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.E_().a($$3) ? this.m().b(e, $$1) : null;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d.get(h($$0).g());
   }

   public static jb h(ebe $$0) {
      jb $$1 = $$0.c(e);
      return $$0.c(b) == ebr.a ? $$1.g() : $$1;
   }

   public static dpk.a i(ebe $$0) {
      ebr $$1 = $$0.c(b);
      return $$1 == ebr.a ? dpk.a.b : dpk.a.c;
   }

   private static boolean b(djb $$0, iv $$1) {
      return $$0.a_($$1.e()).b() instanceof dmv;
   }

   public static Optional<ffq> a(bxc<?> $$0, djf $$1, iv $$2, jb $$3, float $$4) {
      jb $$5 = $$3.h();
      jb $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ffq> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ffq> a(bxc<?> $$0, djf $$1, iv $$2, jb $$3, jb $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ffq> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iv $$7 = $$2.e();
         Optional<ffq> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ffq> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ffq> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ffq> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ffq> a(bxc<?> $$0, djf $$1, iv $$2, int[][] $$3, boolean $$4) {
      iv.a $$5 = new iv.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ffq $$7 = cuq.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e, b, c);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dxy($$0, $$1, this.f);
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, @Nullable bxu $$3, czy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         iv $$5 = $$1.a($$2.c(e));
         $$0.a($$5, $$2.b(b, ebr.a), 3);
         $$0.a($$1, dne.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cyw b() {
      return this.f;
   }

   @Override
   protected long a(ebe $$0, iv $$1) {
      iv $$2 = $$1.a($$0.c(e), $$0.c(b) == ebr.a ? 0 : 1);
      return azo.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   private static int[][] a(jb $$0, jb $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jb $$0, jb $$1) {
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

   private static int[][] a(jb $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
