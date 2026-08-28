import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehe extends ehr {
   public static final MapCodec<ehe> a = dxq.a.c.fieldOf("step").xmap(ehe::new, $$0 -> $$0.c);
   private final dxq.a c;

   private ehe(dxq.a $$0) {
      this.c = $$0;
   }

   public static ehe a(dxq.a $$0) {
      return new ehe($$0);
   }

   @Override
   public Stream<iz> a_(ehp $$0, azh $$1, iz $$2) {
      dbf $$3 = new dbf($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public ehs<?> b() {
      return ehs.o;
   }
}
