import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbe extends fbg {
   public static final MapCodec<fbe> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ezs.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, fbe::new));
   private final ezs b;

   private fbe(List<fdc> $$0, ezs $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbi<fbe> b() {
      return fbj.w;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static fbg.a<?> a(ezs $$0) {
      return a($$1 -> new fbe($$1, $$0));
   }
}
