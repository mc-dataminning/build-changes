import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class est extends esh {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uv.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, est::new));
   private final tx b;

   private est(List<euf> $$0, tx $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esj<est> b() {
      return esk.j;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      cwq.a(kn.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static esh.a<?> a(tx $$0) {
      return a($$1 -> new est($$1, $$0));
   }
}
