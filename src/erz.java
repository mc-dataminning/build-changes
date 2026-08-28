import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erz extends esb {
   public static final MapCodec<erz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eqn.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, erz::new));
   private final eqn b;

   private erz(List<etz> $$0, eqn $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esd<erz> b() {
      return ese.w;
   }

   @Override
   public Set<eth<?>> a() {
      return this.b.a();
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      int $$2 = this.b.a($$1, $$0.H());
      $$0.e($$2);
      return $$0;
   }

   public static esb.a<?> a(eqn $$0) {
      return a($$1 -> new erz($$1, $$0));
   }
}
