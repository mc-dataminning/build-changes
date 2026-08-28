import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class drn extends dnc implements dun {
   public static final MapCodec<drn> a = b(drn::new);
   public static final ecc<jb> b = drd.e;
   public static final ebv c = ebu.I;
   public static final Map<jb, fgk> d = fgh.c(dnc.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   protected drn(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(djb $$0, iv $$1, jb $$2) {
      ebe $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      jb $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dne.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, exp.c, exp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      if (!$$0.c()) {
         ebe $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      ebe $$2 = this.m();
      dka $$3 = $$0.q();
      iv $$4 = $$0.a();
      exo $$5 = $$0.q().b_($$0.a());

      for (jb $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == exp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(c) ? exp.c.a(false) : super.b_($$0);
   }
}
