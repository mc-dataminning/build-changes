import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtm extends dnc {
   public static final MapCodec<dtm> a = b(dtm::new);
   public static final ebv b = dtn.b;

   @Override
   public MapCodec<dtm> a() {
      return a;
   }

   public dtm(ebd.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.D($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$0.c(b) && !$$1.D($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }
}
