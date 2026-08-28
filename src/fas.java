import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fas extends fau {
   public static final MapCodec<fas> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ezg.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, fas::new));
   private final ezg b;

   private fas(List<fcq> $$0, ezg $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public faw<fas> b() {
      return fax.w;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static fau.a<?> a(ezg $$0) {
      return a($$1 -> new fas($$1, $$0));
   }
}
