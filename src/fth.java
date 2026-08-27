import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fth implements anl {
   public static final aep a = new aep("textures/misc/enchanted_glint_entity.png");
   public static final aep b = new aep("textures/misc/enchanted_glint_item.png");
   private static final Set<cir> k = Sets.newHashSet(new cir[]{ciz.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gao l = gao.c("trident", "inventory");
   public static final gao i = gao.c("trident_in_hand", "inventory");
   private static final gao m = gao.c("spyglass", "inventory");
   public static final gao j = gao.c("spyglass_in_hand", "inventory");
   private final eqn n;
   private final fnd o;
   private final fyh p;
   private final ers q;
   private final fmt r;

   public fth(eqn $$0, fyh $$1, gan $$2, ers $$3, fmt $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fnd($$2);
      this.r = $$4;

      for (cir $$5 : jc.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gao(jc.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fnd a() {
      return this.o;
   }

   private void a(gah $$0, ciw $$1, int $$2, int $$3, elh $$4, ell $$5) {
      art $$6 = art.a();
      long $$7 = 42L;

      for (hb $$8 : hb.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(ciw $$0, cit $$1, boolean $$2, elh $$3, fng $$4, int $$5, int $$6, gah $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cit.g || $$1 == cit.h || $$1 == cit.i;
         if ($$8) {
            if ($$0.a(ciz.uV)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(ciz.qj)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(ciz.uV) || $$8)) {
            boolean $$10;
            if ($$1 != cit.g && !$$1.b() && $$0.d() instanceof cgp) {
               csk $$9 = ((cgp)$$0.d()).e();
               $$10 = !($$9 instanceof cvy) && !($$9 instanceof dad);
            } else {
               $$10 = true;
            }

            fno $$12 = fnb.a($$0, $$10);
            ell $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               elh.a $$13 = $$3.c();
               if ($$1 == cit.g) {
                  f.a($$13.a(), 0.5F);
               } else if ($$1.b()) {
                  f.a($$13.a(), 0.75F);
               }

               if ($$10) {
                  $$14 = b($$4, $$12, $$13);
               } else {
                  $$14 = a($$4, $$12, $$13);
               }

               $$3.b();
            } else if ($$10) {
               $$14 = c($$4, $$12, true, $$0.B());
            } else {
               $$14 = b($$4, $$12, true, $$0.B());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(ciw $$0) {
      return $$0.a(apr.aD) || $$0.a(ciz.qi);
   }

   public static ell a(fng $$0, fno $$1, boolean $$2, boolean $$3) {
      return $$3 ? elo.a($$0.getBuffer($$2 ? fno.k() : fno.l()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static ell a(fng $$0, fno $$1, elh.a $$2) {
      return elo.a(new eli($$0.getBuffer(fno.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static ell b(fng $$0, fno $$1, elh.a $$2) {
      return elo.a(new eli($$0.getBuffer(fno.o()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static ell b(fng $$0, fno $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return eqn.L() && $$1 == fnu.k()
            ? elo.a($$0.getBuffer(fno.m()), $$0.getBuffer($$1))
            : elo.a($$0.getBuffer($$2 ? fno.n() : fno.p()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static ell c(fng $$0, fno $$1, boolean $$2, boolean $$3) {
      return $$3 ? elo.a($$0.getBuffer($$2 ? fno.o() : fno.q()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(elh $$0, ell $$1, List<foc> $$2, ciw $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      elh.a $$7 = $$0.c();

      for (foc $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F;
         float $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F;
         float $$12 = (float)($$9 & 0xFF) / 255.0F;
         $$1.a($$7, $$8, $$10, $$11, $$12, $$4, $$5);
      }
   }

   public gah a(ciw $$0, @Nullable cpk $$1, @Nullable biw $$2, int $$3) {
      gah $$4;
      if ($$0.a(ciz.uV)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(ciz.qj)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fie $$7 = $$1 instanceof fie ? (fie)$$1 : null;
      gah $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(ciw $$0, cit $$1, int $$2, int $$3, elh $$4, fng $$5, @Nullable cpk $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable biw $$0, ciw $$1, cit $$2, boolean $$3, elh $$4, fng $$5, @Nullable cpk $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gah $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(ank $$0) {
      this.o.b();
   }
}
