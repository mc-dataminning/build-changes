import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ext extends exv {
   public static final MapCodec<ext> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ewh.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, ext::new));
   private final ewh b;

   private ext(List<ezr> $$0, ewh $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exx<ext> b() {
      return exy.w;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.b.a();
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static exv.a<?> a(ewh $$0) {
      return a($$1 -> new ext($$1, $$0));
   }
}
