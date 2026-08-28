import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehd extends ehq {
   public static final MapCodec<ehd> a = dxp.a.c.fieldOf("step").xmap(ehd::new, $$0 -> $$0.c);
   private final dxp.a c;

   private ehd(dxp.a $$0) {
      this.c = $$0;
   }

   public static ehd a(dxp.a $$0) {
      return new ehd($$0);
   }

   @Override
   public Stream<iz> a_(eho $$0, azg $$1, iz $$2) {
      dbe $$3 = new dbe($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public ehr<?> b() {
      return ehr.o;
   }
}
