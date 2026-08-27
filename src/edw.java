import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edw extends edx {
   public static final Codec<edw> a = RecordCodecBuilder.create($$0 -> a($$0).and(eck.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, edw::new));
   private final eck b;

   private edw(List<efk> $$0, eck $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edz b() {
      return eea.q;
   }

   @Override
   public Set<eet<?>> a() {
      return this.b.a();
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static edx.a<?> a(eck $$0) {
      return a($$1 -> new edw($$1, $$0));
   }
}
