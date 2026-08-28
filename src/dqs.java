import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqs extends dkm {
   public static final MapCodec<dqs> a = b(dqs::new);
   public static final dym b = dqt.d;

   @Override
   public MapCodec<dqs> a() {
      return a;
   }

   public dqs(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.C($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }
}
