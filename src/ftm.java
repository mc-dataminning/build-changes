import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ftm implements ann {
   public static final aer a = new aer("textures/misc/enchanted_glint_entity.png");
   public static final aer b = new aer("textures/misc/enchanted_glint_item.png");
   private static final Set<cit> k = Sets.newHashSet(new cit[]{cjb.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gat l = gat.c("trident", "inventory");
   public static final gat i = gat.c("trident_in_hand", "inventory");
   private static final gat m = gat.c("spyglass", "inventory");
   public static final gat j = gat.c("spyglass_in_hand", "inventory");
   private final eqm n;
   private final fni o;
   private final fym p;
   private final err q;
   private final fmy r;

   public ftm(eqm $$0, fym $$1, gas $$2, err $$3, fmy $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fni($$2);
      this.r = $$4;

      for (cit $$5 : jb.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gat(jb.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fni a() {
      return this.o;
   }

   private void a(gam $$0, ciy $$1, int $$2, int $$3, elg $$4, elk $$5) {
      aru $$6 = aru.a();
      long $$7 = 42L;

      for (ha $$8 : ha.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(ciy $$0, civ $$1, boolean $$2, elg $$3, fnl $$4, int $$5, int $$6, gam $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == civ.g || $$1 == civ.h || $$1 == civ.i;
         if ($$8) {
            if ($$0.a(cjb.uV)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cjb.qj)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cjb.uV) || $$8)) {
            boolean $$10;
            if ($$1 != civ.g && !$$1.b() && $$0.d() instanceof cgr) {
               csm $$9 = ((cgr)$$0.d()).e();
               $$10 = !($$9 instanceof cwa) && !($$9 instanceof daf);
            } else {
               $$10 = true;
            }

            fnt $$12 = fng.a($$0, $$10);
            elk $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               elg.a $$13 = $$3.c();
               if ($$1 == civ.g) {
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

   private static boolean a(ciy $$0) {
      return $$0.a(apt.aD) || $$0.a(cjb.qi);
   }

   public static elk a(fnl $$0, fnt $$1, boolean $$2, boolean $$3) {
      return $$3 ? eln.a($$0.getBuffer($$2 ? fnt.k() : fnt.l()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static elk a(fnl $$0, fnt $$1, elg.a $$2) {
      return eln.a(new elh($$0.getBuffer(fnt.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static elk b(fnl $$0, fnt $$1, elg.a $$2) {
      return eln.a(new elh($$0.getBuffer(fnt.o()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static elk b(fnl $$0, fnt $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return eqm.M() && $$1 == fnz.k()
            ? eln.a($$0.getBuffer(fnt.m()), $$0.getBuffer($$1))
            : eln.a($$0.getBuffer($$2 ? fnt.n() : fnt.p()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static elk c(fnl $$0, fnt $$1, boolean $$2, boolean $$3) {
      return $$3 ? eln.a($$0.getBuffer($$2 ? fnt.o() : fnt.q()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(elg $$0, elk $$1, List<foh> $$2, ciy $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      elg.a $$7 = $$0.c();

      for (foh $$8 : $$2) {
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

   public gam a(ciy $$0, @Nullable cpm $$1, @Nullable biy $$2, int $$3) {
      gam $$4;
      if ($$0.a(cjb.uV)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cjb.qj)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fii $$7 = $$1 instanceof fii ? (fii)$$1 : null;
      gam $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(ciy $$0, civ $$1, int $$2, int $$3, elg $$4, fnl $$5, @Nullable cpm $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable biy $$0, ciy $$1, civ $$2, boolean $$3, elg $$4, fnl $$5, @Nullable cpm $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gam $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(anm $$0) {
      this.o.b();
   }
}
