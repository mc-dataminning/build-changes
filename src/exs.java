import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exs extends exu {
   public static final MapCodec<exs> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ewg.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, exs::new));
   private final ewg b;

   private exs(List<ezs> $$0, ewg $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exw<exs> b() {
      return exx.w;
   }

   @Override
   public Set<eza<?>> a() {
      return this.b.a();
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.e($$2);
      return $$0;
   }

   public static exu.a<?> a(ewg $$0) {
      return a($$1 -> new exs($$1, $$0));
   }
}
