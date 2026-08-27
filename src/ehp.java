import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehp extends ehq {
   public static final Codec<ehp> a = RecordCodecBuilder.create($$0 -> a($$0).and(egd.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, ehp::new));
   private final egd b;

   private ehp(List<ejd> $$0, egd $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ehs b() {
      return eht.q;
   }

   @Override
   public Set<eim<?>> a() {
      return this.b.a();
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static ehq.a<?> a(egd $$0) {
      return a($$1 -> new ehp($$1, $$0));
   }
}
