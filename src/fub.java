import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fub implements anx {
   public static final aez a = new aez("textures/misc/enchanted_glint_entity.png");
   public static final aez b = new aez("textures/misc/enchanted_glint_item.png");
   private static final Set<cjg> k = Sets.newHashSet(new cjg[]{cjo.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gbi l = gbi.c("trident", "inventory");
   public static final gbi i = gbi.c("trident_in_hand", "inventory");
   private static final gbi m = gbi.c("spyglass", "inventory");
   public static final gbi j = gbi.c("spyglass_in_hand", "inventory");
   private final eqp n;
   private final fnx o;
   private final fzb p;
   private final eru q;
   private final fnn r;

   public fub(eqp $$0, fzb $$1, gbh $$2, eru $$3, fnn $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fnx($$2);
      this.r = $$4;

      for (cjg $$5 : jb.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gbi(jb.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fnx a() {
      return this.o;
   }

   private void a(gbb $$0, cjl $$1, int $$2, int $$3, elj $$4, eln $$5) {
      ash $$6 = ash.a();
      long $$7 = 42L;

      for (ha $$8 : ha.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cjl $$0, cji $$1, boolean $$2, elj $$3, foa $$4, int $$5, int $$6, gbb $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cji.g || $$1 == cji.h || $$1 == cji.i;
         if ($$8) {
            if ($$0.a(cjo.uV)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cjo.qj)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cjo.uV) || $$8)) {
            boolean $$10;
            if ($$1 != cji.g && !$$1.b() && $$0.d() instanceof che) {
               ctc $$9 = ((che)$$0.d()).e();
               $$10 = !($$9 instanceof cwr) && !($$9 instanceof dat);
            } else {
               $$10 = true;
            }

            foi $$12 = fnv.a($$0, $$10);
            eln $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               elj.a $$13 = $$3.c();
               if ($$1 == cji.g) {
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

   private static boolean a(cjl $$0) {
      return $$0.a(aqd.aD) || $$0.a(cjo.qi);
   }

   public static eln a(foa $$0, foi $$1, boolean $$2, boolean $$3) {
      return $$3 ? elq.a($$0.getBuffer($$2 ? foi.k() : foi.l()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eln a(foa $$0, foi $$1, elj.a $$2) {
      return elq.a(new elk($$0.getBuffer(foi.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eln b(foa $$0, foi $$1, elj.a $$2) {
      return elq.a(new elk($$0.getBuffer(foi.o()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eln b(foa $$0, foi $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return eqp.M() && $$1 == foo.j()
            ? elq.a($$0.getBuffer(foi.m()), $$0.getBuffer($$1))
            : elq.a($$0.getBuffer($$2 ? foi.n() : foi.p()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eln c(foa $$0, foi $$1, boolean $$2, boolean $$3) {
      return $$3 ? elq.a($$0.getBuffer($$2 ? foi.o() : foi.q()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(elj $$0, eln $$1, List<fox> $$2, cjl $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      elj.a $$7 = $$0.c();

      for (fox $$8 : $$2) {
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

   public gbb a(cjl $$0, @Nullable cqb $$1, @Nullable bjm $$2, int $$3) {
      gbb $$4;
      if ($$0.a(cjo.uV)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cjo.qj)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fis $$7 = $$1 instanceof fis ? (fis)$$1 : null;
      gbb $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cjl $$0, cji $$1, int $$2, int $$3, elj $$4, foa $$5, @Nullable cqb $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bjm $$0, cjl $$1, cji $$2, boolean $$3, elj $$4, foa $$5, @Nullable cqb $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gbb $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(anw $$0) {
      this.o.b();
   }
}
