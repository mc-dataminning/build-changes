import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etk extends esy {
   public static final MapCodec<etk> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uy.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, etk::new));
   private final ua b;

   private etk(List<euw> $$0, ua $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eta<etk> b() {
      return etb.j;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      cxf.a(kq.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static esy.a<?> a(ua $$0) {
      return a($$1 -> new etk($$1, $$0));
   }
}
