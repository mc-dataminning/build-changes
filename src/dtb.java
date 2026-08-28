import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtb extends dmr {
   public static final MapCodec<dtb> a = b(dtb::new);
   public static final ebk b = dtc.b;

   @Override
   public MapCodec<dtb> a() {
      return a;
   }

   public dtb(eas.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
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
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(b) && !$$1.D($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }
}
