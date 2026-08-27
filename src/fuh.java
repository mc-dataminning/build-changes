import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fuh implements anw {
   public static final aey a = new aey("textures/misc/enchanted_glint_entity.png");
   public static final aey b = new aey("textures/misc/enchanted_glint_item.png");
   private static final Set<cjc> k = Sets.newHashSet(new cjc[]{cjk.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gbo l = gbo.c("trident", "inventory");
   public static final gbo i = gbo.c("trident_in_hand", "inventory");
   private static final gbo m = gbo.c("spyglass", "inventory");
   public static final gbo j = gbo.c("spyglass_in_hand", "inventory");
   private final eqx n;
   private final fod o;
   private final fzh p;
   private final esc q;
   private final fnt r;

   public fuh(eqx $$0, fzh $$1, gbn $$2, esc $$3, fnt $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fod($$2);
      this.r = $$4;

      for (cjc $$5 : jd.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gbo(jd.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fod a() {
      return this.o;
   }

   private void a(gbh $$0, cjh $$1, int $$2, int $$3, elr $$4, elv $$5) {
      ase $$6 = ase.a();
      long $$7 = 42L;

      for (hc $$8 : hc.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cjh $$0, cje $$1, boolean $$2, elr $$3, fog $$4, int $$5, int $$6, gbh $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cje.g || $$1 == cje.h || $$1 == cje.i;
         if ($$8) {
            if ($$0.a(cjk.uV)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cjk.qj)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cjk.uV) || $$8)) {
            boolean $$10;
            if ($$1 != cje.g && !$$1.b() && $$0.d() instanceof cha) {
               csx $$9 = ((cha)$$0.d()).e();
               $$10 = !($$9 instanceof cwl) && !($$9 instanceof daq);
            } else {
               $$10 = true;
            }

            foo $$12 = fob.a($$0, $$10);
            elv $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               elr.a $$13 = $$3.c();
               if ($$1 == cje.g) {
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

   private static boolean a(cjh $$0) {
      return $$0.a(aqc.aD) || $$0.a(cjk.qi);
   }

   public static elv a(fog $$0, foo $$1, boolean $$2, boolean $$3) {
      return $$3 ? ely.a($$0.getBuffer($$2 ? foo.k() : foo.l()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static elv a(fog $$0, foo $$1, elr.a $$2) {
      return ely.a(new els($$0.getBuffer(foo.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static elv b(fog $$0, foo $$1, elr.a $$2) {
      return ely.a(new els($$0.getBuffer(foo.o()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static elv b(fog $$0, foo $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return eqx.M() && $$1 == fov.j()
            ? ely.a($$0.getBuffer(foo.m()), $$0.getBuffer($$1))
            : ely.a($$0.getBuffer($$2 ? foo.n() : foo.p()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static elv c(fog $$0, foo $$1, boolean $$2, boolean $$3) {
      return $$3 ? ely.a($$0.getBuffer($$2 ? foo.o() : foo.q()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(elr $$0, elv $$1, List<fpd> $$2, cjh $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      elr.a $$7 = $$0.c();

      for (fpd $$8 : $$2) {
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

   public gbh a(cjh $$0, @Nullable cpx $$1, @Nullable bji $$2, int $$3) {
      gbh $$4;
      if ($$0.a(cjk.uV)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cjk.qj)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fiz $$7 = $$1 instanceof fiz ? (fiz)$$1 : null;
      gbh $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cjh $$0, cje $$1, int $$2, int $$3, elr $$4, fog $$5, @Nullable cpx $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bji $$0, cjh $$1, cje $$2, boolean $$3, elr $$4, fog $$5, @Nullable cpx $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gbh $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(anv $$0) {
      this.o.b();
   }
}
