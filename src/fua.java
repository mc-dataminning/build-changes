import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fua implements anq {
   public static final aeu a = new aeu("textures/misc/enchanted_glint_entity.png");
   public static final aeu b = new aeu("textures/misc/enchanted_glint_item.png");
   private static final Set<civ> k = Sets.newHashSet(new civ[]{cjd.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gbh l = gbh.c("trident", "inventory");
   public static final gbh i = gbh.c("trident_in_hand", "inventory");
   private static final gbh m = gbh.c("spyglass", "inventory");
   public static final gbh j = gbh.c("spyglass_in_hand", "inventory");
   private final eqq n;
   private final fnw o;
   private final fza p;
   private final erv q;
   private final fnm r;

   public fua(eqq $$0, fza $$1, gbg $$2, erv $$3, fnm $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fnw($$2);
      this.r = $$4;

      for (civ $$5 : jd.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gbh(jd.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fnw a() {
      return this.o;
   }

   private void a(gba $$0, cja $$1, int $$2, int $$3, elk $$4, elo $$5) {
      arx $$6 = arx.a();
      long $$7 = 42L;

      for (hc $$8 : hc.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cja $$0, cix $$1, boolean $$2, elk $$3, fnz $$4, int $$5, int $$6, gba $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cix.g || $$1 == cix.h || $$1 == cix.i;
         if ($$8) {
            if ($$0.a(cjd.uV)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cjd.qj)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cjd.uV) || $$8)) {
            boolean $$10;
            if ($$1 != cix.g && !$$1.b() && $$0.d() instanceof cgt) {
               csq $$9 = ((cgt)$$0.d()).e();
               $$10 = !($$9 instanceof cwe) && !($$9 instanceof daj);
            } else {
               $$10 = true;
            }

            foh $$12 = fnu.a($$0, $$10);
            elo $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               elk.a $$13 = $$3.c();
               if ($$1 == cix.g) {
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

   private static boolean a(cja $$0) {
      return $$0.a(apw.aD) || $$0.a(cjd.qi);
   }

   public static elo a(fnz $$0, foh $$1, boolean $$2, boolean $$3) {
      return $$3 ? elr.a($$0.getBuffer($$2 ? foh.k() : foh.l()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static elo a(fnz $$0, foh $$1, elk.a $$2) {
      return elr.a(new ell($$0.getBuffer(foh.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static elo b(fnz $$0, foh $$1, elk.a $$2) {
      return elr.a(new ell($$0.getBuffer(foh.o()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static elo b(fnz $$0, foh $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return eqq.M() && $$1 == fon.j()
            ? elr.a($$0.getBuffer(foh.m()), $$0.getBuffer($$1))
            : elr.a($$0.getBuffer($$2 ? foh.n() : foh.p()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static elo c(fnz $$0, foh $$1, boolean $$2, boolean $$3) {
      return $$3 ? elr.a($$0.getBuffer($$2 ? foh.o() : foh.q()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(elk $$0, elo $$1, List<fow> $$2, cja $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      elk.a $$7 = $$0.c();

      for (fow $$8 : $$2) {
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

   public gba a(cja $$0, @Nullable cpq $$1, @Nullable bjb $$2, int $$3) {
      gba $$4;
      if ($$0.a(cjd.uV)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cjd.qj)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fis $$7 = $$1 instanceof fis ? (fis)$$1 : null;
      gba $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cja $$0, cix $$1, int $$2, int $$3, elk $$4, fnz $$5, @Nullable cpq $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bjb $$0, cja $$1, cix $$2, boolean $$3, elk $$4, fnz $$5, @Nullable cpq $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gba $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(anp $$0) {
      this.o.b();
   }
}
