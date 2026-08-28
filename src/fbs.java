import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbs extends fbu {
   public static final MapCodec<fbs> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fag.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, fbs::new));
   private final fag b;

   private fbs(List<fdq> $$0, fag $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbw<fbs> b() {
      return fbx.w;
   }

   @Override
   public Set<baz<?>> a() {
      return this.b.a();
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static fbu.a<?> a(fag $$0) {
      return a($$1 -> new fbs($$1, $$0));
   }
}
