import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dma extends dmq {
   public static final ebx a = ebw.A;
   private final duq.a b;

   public dma(duq.a $$0, ebf.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.C.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dma> a();

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dng.hp) || $$1.a(dng.hq) || $$1.a(dng.hr) || $$1.a(dng.hs);
         if ($$3) {
            return a($$2, dyg.q, dzu::a);
         }
      }

      return null;
   }

   public duq.a b() {
      return this.b;
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(a);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
