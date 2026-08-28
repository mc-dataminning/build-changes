import com.mojang.serialization.MapCodec;

public class emb extends emq {
   public static final MapCodec<emb> a = dsk.b.fieldOf("block_state").xmap(emb::new, $$0 -> $$0.b);
   private final dsk b;

   public emb(dsk $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsk $$0, ayo $$1) {
      return $$0 == this.b;
   }

   @Override
   protected emr<?> a() {
      return emr.c;
   }
}
