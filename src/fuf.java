import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fuf implements anu {
   public static final aew a = new aew("textures/misc/enchanted_glint_entity.png");
   public static final aew b = new aew("textures/misc/enchanted_glint_item.png");
   private static final Set<cja> k = Sets.newHashSet(new cja[]{cji.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gbm l = gbm.c("trident", "inventory");
   public static final gbm i = gbm.c("trident_in_hand", "inventory");
   private static final gbm m = gbm.c("spyglass", "inventory");
   public static final gbm j = gbm.c("spyglass_in_hand", "inventory");
   private final eqv n;
   private final fob o;
   private final fzf p;
   private final esa q;
   private final fnr r;

   public fuf(eqv $$0, fzf $$1, gbl $$2, esa $$3, fnr $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fob($$2);
      this.r = $$4;

      for (cja $$5 : jb.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gbm(jb.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fob a() {
      return this.o;
   }

   private void a(gbf $$0, cjf $$1, int $$2, int $$3, elp $$4, elt $$5) {
      asc $$6 = asc.a();
      long $$7 = 42L;

      for (ha $$8 : ha.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cjf $$0, cjc $$1, boolean $$2, elp $$3, foe $$4, int $$5, int $$6, gbf $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cjc.g || $$1 == cjc.h || $$1 == cjc.i;
         if ($$8) {
            if ($$0.a(cji.uV)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cji.qj)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cji.uV) || $$8)) {
            boolean $$10;
            if ($$1 != cjc.g && !$$1.b() && $$0.d() instanceof cgy) {
               csv $$9 = ((cgy)$$0.d()).e();
               $$10 = !($$9 instanceof cwj) && !($$9 instanceof dao);
            } else {
               $$10 = true;
            }

            fom $$12 = fnz.a($$0, $$10);
            elt $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               elp.a $$13 = $$3.c();
               if ($$1 == cjc.g) {
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

   private static boolean a(cjf $$0) {
      return $$0.a(aqa.aD) || $$0.a(cji.qi);
   }

   public static elt a(foe $$0, fom $$1, boolean $$2, boolean $$3) {
      return $$3 ? elw.a($$0.getBuffer($$2 ? fom.k() : fom.l()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static elt a(foe $$0, fom $$1, elp.a $$2) {
      return elw.a(new elq($$0.getBuffer(fom.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static elt b(foe $$0, fom $$1, elp.a $$2) {
      return elw.a(new elq($$0.getBuffer(fom.o()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static elt b(foe $$0, fom $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return eqv.M() && $$1 == fot.j()
            ? elw.a($$0.getBuffer(fom.m()), $$0.getBuffer($$1))
            : elw.a($$0.getBuffer($$2 ? fom.n() : fom.p()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static elt c(foe $$0, fom $$1, boolean $$2, boolean $$3) {
      return $$3 ? elw.a($$0.getBuffer($$2 ? fom.o() : fom.q()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(elp $$0, elt $$1, List<fpb> $$2, cjf $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      elp.a $$7 = $$0.c();

      for (fpb $$8 : $$2) {
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

   public gbf a(cjf $$0, @Nullable cpv $$1, @Nullable bjg $$2, int $$3) {
      gbf $$4;
      if ($$0.a(cji.uV)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cji.qj)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fix $$7 = $$1 instanceof fix ? (fix)$$1 : null;
      gbf $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cjf $$0, cjc $$1, int $$2, int $$3, elp $$4, foe $$5, @Nullable cpv $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bjg $$0, cjf $$1, cjc $$2, boolean $$3, elp $$4, foe $$5, @Nullable cpv $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gbf $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(ant $$0) {
      this.o.b();
   }
}
