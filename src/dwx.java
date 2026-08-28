import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwx extends dwd implements dun {
   public static final MapCodec<dwx> a = b(dwx::new);
   public static final ebv c = ebu.I;

   @Override
   protected MapCodec<? extends dwx> a() {
      return a;
   }

   protected dwx(ebd.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(exp.c)));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(c) ? exp.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }
}
