import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class faz extends fbb {
   public static final MapCodec<faz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ezn.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, faz::new));
   private final ezn b;

   private faz(List<fcx> $$0, ezn $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbd<faz> b() {
      return fbe.w;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static fbb.a<?> a(ezn $$0) {
      return a($$1 -> new faz($$1, $$0));
   }
}
