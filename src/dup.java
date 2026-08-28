import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dup extends dmd {
   public static final MapCodec<dup> a = b(dup::new);

   @Override
   public MapCodec<dup> a() {
      return a;
   }

   protected dup(eas.d $$0) {
      super($$0);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$2, dxt.j, $$0.C ? dzj::a : dzj::b);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, czn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }
}
