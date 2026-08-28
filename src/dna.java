import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dna extends drd implements dnf, dun {
   public static final MapCodec<dna> a = b(dna::new);
   private static final ebv b = ebu.I;
   private static final Map<jb, fgk> c = fgh.c(dnc.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   protected dna(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, jb.c));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c.get($$0.c(e));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, e);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(b) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      ebe $$4 = $$1.a_($$3);
      ebe $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axe.bB)) && ($$5.a(this) || $$5.a(dne.tn));
   }

   protected static boolean a(djy $$0, iv $$1, exo $$2, jb $$3) {
      ebe $$4 = dne.to.m().b(b, Boolean.valueOf($$2.a(exp.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (($$4 == jb.a || $$4 == jb.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      Optional<iv> $$3 = m.a($$0, $$1, $$2.b(), jb.b, dne.tn);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iv $$4 = $$3.get().d();
         ebe $$5 = $$0.a_($$4);
         return dmz.a((djz)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      Optional<iv> $$4 = m.a($$0, $$2, $$3.b(), jb.b, dne.tn);
      if (!$$4.isEmpty()) {
         iv $$5 = $$4.get();
         iv $$6 = $$5.d();
         jb $$7 = $$3.c(e);
         a($$0, $$5, $$0.b_($$5), $$7);
         dmz.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(dne.tn);
   }
}
