import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egn extends ego {
   public static final Codec<egn> a = RecordCodecBuilder.create($$0 -> a($$0).and(efb.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, egn::new));
   private final efb b;

   private egn(List<eib> $$0, efb $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egq b() {
      return egr.q;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.b.a();
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static ego.a<?> a(efb $$0) {
      return a($$1 -> new egn($$1, $$0));
   }
}
