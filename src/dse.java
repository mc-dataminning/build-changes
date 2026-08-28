import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dse extends dnc implements dun {
   public static final MapCodec<dse> a = b(dse::new);
   public static final ebv b = ebu.I;

   @Override
   public MapCodec<dse> a() {
      return a;
   }

   protected dse(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(ebe $$0, ebe $$1, jb $$2) {
      return $$1.a(dne.ag) && $$2.o() == jb.a.b;
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exp.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(b) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }
}
