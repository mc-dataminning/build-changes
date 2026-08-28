import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehc extends ehp {
   public static final MapCodec<ehc> a = dxo.a.c.fieldOf("step").xmap(ehc::new, $$0 -> $$0.c);
   private final dxo.a c;

   private ehc(dxo.a $$0) {
      this.c = $$0;
   }

   public static ehc a(dxo.a $$0) {
      return new ehc($$0);
   }

   @Override
   public Stream<iz> a_(ehn $$0, azf $$1, iz $$2) {
      dbd $$3 = new dbd($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public ehq<?> b() {
      return ehq.o;
   }
}
