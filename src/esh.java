import com.mojang.serialization.MapCodec;

public class esh extends erz {
   public static final MapCodec<esh> a = aya.a(mb.f).fieldOf("tag").xmap(esh::new, $$0 -> $$0.b);
   private final aya<dkd> b;

   public esh(aya<dkd> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxo $$0, bac $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected esa<?> a() {
      return esa.d;
   }
}
