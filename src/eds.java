import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eds extends edt {
   public static final Codec<eds> a = RecordCodecBuilder.create($$0 -> a($$0).and(ecg.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eds::new));
   private final ecg b;

   private eds(List<efg> $$0, ecg $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edv b() {
      return edw.q;
   }

   @Override
   public Set<eep<?>> a() {
      return this.b.a();
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static edt.a<?> a(ecg $$0) {
      return a($$1 -> new eds($$1, $$0));
   }
}
