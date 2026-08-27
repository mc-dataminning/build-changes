import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ftv implements ann {
   public static final aer a = new aer("textures/misc/enchanted_glint_entity.png");
   public static final aer b = new aer("textures/misc/enchanted_glint_item.png");
   private static final Set<cis> k = Sets.newHashSet(new cis[]{cja.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gbc l = gbc.c("trident", "inventory");
   public static final gbc i = gbc.c("trident_in_hand", "inventory");
   private static final gbc m = gbc.c("spyglass", "inventory");
   public static final gbc j = gbc.c("spyglass_in_hand", "inventory");
   private final eql n;
   private final fnr o;
   private final fyv p;
   private final erq q;
   private final fnh r;

   public ftv(eql $$0, fyv $$1, gbb $$2, erq $$3, fnh $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fnr($$2);
      this.r = $$4;

      for (cis $$5 : jb.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gbc(jb.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fnr a() {
      return this.o;
   }

   private void a(gav $$0, cix $$1, int $$2, int $$3, elf $$4, elj $$5) {
      aru $$6 = aru.a();
      long $$7 = 42L;

      for (ha $$8 : ha.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cix $$0, ciu $$1, boolean $$2, elf $$3, fnu $$4, int $$5, int $$6, gav $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == ciu.g || $$1 == ciu.h || $$1 == ciu.i;
         if ($$8) {
            if ($$0.a(cja.uV)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cja.qj)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cja.uV) || $$8)) {
            boolean $$10;
            if ($$1 != ciu.g && !$$1.b() && $$0.d() instanceof cgq) {
               csl $$9 = ((cgq)$$0.d()).e();
               $$10 = !($$9 instanceof cvz) && !($$9 instanceof dae);
            } else {
               $$10 = true;
            }

            foc $$12 = fnp.a($$0, $$10);
            elj $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               elf.a $$13 = $$3.c();
               if ($$1 == ciu.g) {
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

   private static boolean a(cix $$0) {
      return $$0.a(apt.aD) || $$0.a(cja.qi);
   }

   public static elj a(fnu $$0, foc $$1, boolean $$2, boolean $$3) {
      return $$3 ? elm.a($$0.getBuffer($$2 ? foc.k() : foc.l()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static elj a(fnu $$0, foc $$1, elf.a $$2) {
      return elm.a(new elg($$0.getBuffer(foc.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static elj b(fnu $$0, foc $$1, elf.a $$2) {
      return elm.a(new elg($$0.getBuffer(foc.o()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static elj b(fnu $$0, foc $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return eql.M() && $$1 == foi.j()
            ? elm.a($$0.getBuffer(foc.m()), $$0.getBuffer($$1))
            : elm.a($$0.getBuffer($$2 ? foc.n() : foc.p()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static elj c(fnu $$0, foc $$1, boolean $$2, boolean $$3) {
      return $$3 ? elm.a($$0.getBuffer($$2 ? foc.o() : foc.q()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(elf $$0, elj $$1, List<foq> $$2, cix $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      elf.a $$7 = $$0.c();

      for (foq $$8 : $$2) {
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

   public gav a(cix $$0, @Nullable cpl $$1, @Nullable biy $$2, int $$3) {
      gav $$4;
      if ($$0.a(cja.uV)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cja.qj)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fin $$7 = $$1 instanceof fin ? (fin)$$1 : null;
      gav $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cix $$0, ciu $$1, int $$2, int $$3, elf $$4, fnu $$5, @Nullable cpl $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable biy $$0, cix $$1, ciu $$2, boolean $$3, elf $$4, fnu $$5, @Nullable cpl $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gav $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(anm $$0) {
      this.o.b();
   }
}
