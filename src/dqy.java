import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqy extends dnc implements dun {
   public static final MapCodec<dqy> a = b(dqy::new);
   private static final ebv b = ebu.I;
   private static final fgk c = dnc.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   protected dqy(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(b) ? exp.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = super.a($$0);
      if ($$1 != null) {
         exo $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, Boolean.valueOf($$2.a() == exp.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.d();
      ebe $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jb.a);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4 == jb.b && !this.a($$0, $$1, $$3)) {
         return dne.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, exp.c, exp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
