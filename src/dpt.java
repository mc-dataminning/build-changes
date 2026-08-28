import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpt extends djl {
   public static final MapCodec<dpt> a = b(dpt::new);
   public static final dxn b = dpu.d;

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(dwv.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
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
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }
}
