import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etw extends esy {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cwq.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, etw::new));
   private final jm<cwq> b;

   private etw(List<euw> $$0, jm<cwq> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eta<etw> b() {
      return etb.F;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      $$0.a(kq.G, cws.a, this.b, cws::b);
      return $$0;
   }

   public static esy.a<?> a(jm<cwq> $$0) {
      return a($$1 -> new etw($$1, $$0));
   }
}
