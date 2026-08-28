import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exz extends eyb {
   public static final MapCodec<exz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ewn.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, exz::new));
   private final ewn b;

   private exz(List<ezx> $$0, ewn $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eyd<exz> b() {
      return eye.w;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static eyb.a<?> a(ewn $$0) {
      return a($$1 -> new exz($$1, $$0));
   }
}
