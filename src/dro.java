import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dro extends dnc implements dun {
   public static final MapCodec<dro> a = b(dro::new);
   public static final ebv b = ebu.m;
   public static final ebv c = ebu.I;
   private static final fgk d = fgh.a(dnc.b(4.0, 7.0, 9.0), dnc.b(6.0, 0.0, 7.0));
   private static final fgk e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   public dro(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());

      for (jb $$2 : $$0.f()) {
         if ($$2.o() == jb.a.b) {
            ebe $$3 = this.m().b(b, Boolean.valueOf($$2 == jb.b));
            if ($$3.a((dka)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == exp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      jb $$3 = o($$0).g();
      return dnc.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jb o(ebe $$0) {
      return $$0.c(b) ? jb.a : jb.b;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(c) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
