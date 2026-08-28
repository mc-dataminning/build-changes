import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fby extends fbu {
   public static final MapCodec<fby> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(faf.e.fieldOf("component").forGetter($$0x -> $$0x.b), fbx.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fby::new)
   );
   private final fae<?> b;
   private final fbv c;

   private fby(List<fdq> $$0, fae<?> $$1, fbv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbw<fby> b() {
      return fbx.u;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(fan $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
