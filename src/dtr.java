import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtr extends dmd {
   public static final MapCodec<dtr> a = b(dtr::new);
   public static final ebk b = ebj.c;
   private final btl c = bti.a(5);

   @Override
   public MapCodec<dtr> a() {
      return a;
   }

   public dtr(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$0.C ? null : a($$2, dxt.L, dzb::a);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, czn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
