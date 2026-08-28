import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esh extends eru {
   public static final MapCodec<esh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vq.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, esh::new));
   private final us b;

   private esh(List<ets> $$0, us $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erw<esh> b() {
      return erx.j;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      cxe.a(km.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static eru.a<?> a(us $$0) {
      return a($$1 -> new esh($$1, $$0));
   }
}
