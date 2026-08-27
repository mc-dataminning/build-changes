import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fpw implements aky {
   public static final acq a = new acq("textures/misc/enchanted_glint_entity.png");
   public static final acq b = new acq("textures/misc/enchanted_glint_item.png");
   private static final Set<cfu> k = Sets.newHashSet(new cfu[]{cgc.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final fwy l = fwy.c("trident", "inventory");
   public static final fwy i = fwy.c("trident_in_hand", "inventory");
   private static final fwy m = fwy.c("spyglass", "inventory");
   public static final fwy j = fwy.c("spyglass_in_hand", "inventory");
   private final enn n;
   private final fju o;
   private final fuw p;
   private final eos q;
   private final fjj r;

   public fpw(enn $$0, fuw $$1, fwx $$2, eos $$3, fjj $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fju($$2);
      this.r = $$4;

      for (cfu $$5 : jb.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new fwy(jb.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fju a() {
      return this.o;
   }

   private void a(fwr $$0, cfz $$1, int $$2, int $$3, eij $$4, ein $$5) {
      apf $$6 = apf.a();
      long $$7 = 42L;

      for (ha $$8 : ha.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cfz $$0, cfw $$1, boolean $$2, eij $$3, fjx $$4, int $$5, int $$6, fwr $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cfw.g || $$1 == cfw.h || $$1 == cfw.i;
         if ($$8) {
            if ($$0.a(cgc.uV)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cgc.qj)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cgc.uV) || $$8)) {
            boolean $$10;
            if ($$1 != cfw.g && !$$1.b() && $$0.d() instanceof cds) {
               cpn $$9 = ((cds)$$0.d()).e();
               $$10 = !($$9 instanceof ctb) && !($$9 instanceof cxg);
            } else {
               $$10 = true;
            }

            fkf $$12 = fjs.a($$0, $$10);
            ein $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               eij.a $$13 = $$3.c();
               if ($$1 == cfw.g) {
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

   private static boolean a(cfz $$0) {
      return $$0.a(ane.aD) || $$0.a(cgc.qi);
   }

   public static ein a(fjx $$0, fkf $$1, boolean $$2, boolean $$3) {
      return $$3 ? eiq.a($$0.getBuffer($$2 ? fkf.k() : fkf.l()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static ein a(fjx $$0, fkf $$1, eij.a $$2) {
      return eiq.a(new eik($$0.getBuffer(fkf.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static ein b(fjx $$0, fkf $$1, eij.a $$2) {
      return eiq.a(new eik($$0.getBuffer(fkf.o()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static ein b(fjx $$0, fkf $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return enn.L() && $$1 == fkj.k()
            ? eiq.a($$0.getBuffer(fkf.m()), $$0.getBuffer($$1))
            : eiq.a($$0.getBuffer($$2 ? fkf.n() : fkf.p()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static ein c(fjx $$0, fkf $$1, boolean $$2, boolean $$3) {
      return $$3 ? eiq.a($$0.getBuffer($$2 ? fkf.o() : fkf.q()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(eij $$0, ein $$1, List<fkr> $$2, cfz $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      eij.a $$7 = $$0.c();

      for (fkr $$8 : $$2) {
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

   public fwr a(cfz $$0, @Nullable cmm $$1, @Nullable bfz $$2, int $$3) {
      fwr $$4;
      if ($$0.a(cgc.uV)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cgc.qj)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      few $$7 = $$1 instanceof few ? (few)$$1 : null;
      fwr $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cfz $$0, cfw $$1, int $$2, int $$3, eij $$4, fjx $$5, @Nullable cmm $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bfz $$0, cfz $$1, cfw $$2, boolean $$3, eij $$4, fjx $$5, @Nullable cmm $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         fwr $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(akx $$0) {
      this.o.b();
   }
}
