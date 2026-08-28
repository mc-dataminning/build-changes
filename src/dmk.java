import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dmk extends dqs implements dpl {
   public static final MapCodec<dmk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyl.q.fieldOf("color").forGetter(dmk::b), t()).apply($$0, dmk::new));
   public static final ebr<ebg> b = ebj.be;
   public static final ebk c = ebj.x;
   private static final Map<jb, ffw> d = ag.a(() -> {
      ffw $$0 = dmr.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      ffw $$1 = fft.a($$0, h.a(i.a, i.b));
      return fft.c(fft.a(dmr.b(16.0, 3.0, 9.0), $$0, $$1));
   });
   private final cyl f;

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   public dmk(cyl $$0, eas.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.C.b().b(b, ebg.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jb a(diq $$0, iv $$1) {
      eat $$2 = $$0.a_($$1);
      return $$2.b() instanceof dmk ? $$2.c(e) : null;
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$1.C) {
         return bug.b;
      } else {
         if ($$0.c(b) != ebg.a) {
            $$2 = $$2.a($$0.c(e));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bug.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iv $$5 = $$2.a($$0.c(e).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ffc $$6 = $$2.b();
            $$1.a(null, $$1.al().a($$6), null, $$6, 5.0F, true, djm.a.b);
            return bug.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wy.c("block.minecraft.bed.occupied"), true);
            }

            return bug.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bug.b;
         }
      }
   }

   public static boolean a(djm $$0) {
      return $$0.B_().l();
   }

   private boolean a(djm $$0, iv $$1) {
      List<cqy> $$2 = $$0.a(cqy.class, new fex($$1), bxj::fQ);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fR();
         return true;
      }
   }

   @Override
   public void a(djm $$0, eat $$1, iv $$2, bwi $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5);
   }

   @Override
   public void a(diq $$0, bwi $$1) {
      if ($$1.cd()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bwi $$0) {
      ffc $$1 = $$0.dx();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bxj ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == a($$0.c(b), $$0.c(e))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dmt.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jb a(ebg $$0, jb $$1) {
      return $$0 == ebg.b ? $$1 : $$1.g();
   }

   @Override
   public eat a(djm $$0, iv $$1, eat $$2, crm $$3) {
      if (!$$0.C && $$3.gk()) {
         ebg $$4 = $$2.c(b);
         if ($$4 == ebg.b) {
            iv $$5 = $$1.a(a($$4, $$2.c(e)));
            eat $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == ebg.a) {
               $$0.a($$5, dmt.a.m(), 35);
               $$0.a($$3, 2001, $$5, dmr.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      jb $$1 = $$0.g();
      iv $$2 = $$0.a();
      iv $$3 = $$2.a($$1);
      djm $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.A_().a($$3) ? this.m().b(e, $$1) : null;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d.get(h($$0).g());
   }

   public static jb h(eat $$0) {
      jb $$1 = $$0.c(e);
      return $$0.c(b) == ebg.a ? $$1.g() : $$1;
   }

   public static doz.a i(eat $$0) {
      ebg $$1 = $$0.c(b);
      return $$1 == ebg.a ? doz.a.b : doz.a.c;
   }

   private static boolean b(diq $$0, iv $$1) {
      return $$0.a_($$1.e()).b() instanceof dmk;
   }

   public static Optional<ffc> a(bwr<?> $$0, diu $$1, iv $$2, jb $$3, float $$4) {
      jb $$5 = $$3.h();
      jb $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ffc> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ffc> a(bwr<?> $$0, diu $$1, iv $$2, jb $$3, jb $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ffc> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iv $$7 = $$2.e();
         Optional<ffc> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ffc> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ffc> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ffc> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ffc> a(bwr<?> $$0, diu $$1, iv $$2, int[][] $$3, boolean $$4) {
      iv.a $$5 = new iv.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ffc $$7 = cuf.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e, b, c);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxn($$0, $$1, this.f);
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, @Nullable bxj $$3, czn $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         iv $$5 = $$1.a($$2.c(e));
         $$0.a($$5, $$2.b(b, ebg.a), 3);
         $$0.a($$1, dmt.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cyl b() {
      return this.f;
   }

   @Override
   protected long a(eat $$0, iv $$1) {
      iv $$2 = $$1.a($$0.c(e), $$0.c(b) == ebg.a ? 0 : 1);
      return azm.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
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
