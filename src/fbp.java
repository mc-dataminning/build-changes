import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbp extends fbu {
   public static final MapCodec<fbp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cm.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), fbx.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbp::new)
   );
   private final cm b;
   private final fbv c;

   private fbp(List<fdq> $$0, cm $$1, fbv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbw<fbp> b() {
      return fbx.v;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(fan $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
