import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class egz extends ehm {
   public static final MapCodec<egz> a = dxl.a.c.fieldOf("step").xmap(egz::new, $$0 -> $$0.c);
   private final dxl.a c;

   private egz(dxl.a $$0) {
      this.c = $$0;
   }

   public static egz a(dxl.a $$0) {
      return new egz($$0);
   }

   @Override
   public Stream<iz> a_(ehk $$0, azc $$1, iz $$2) {
      dba $$3 = new dba($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public ehn<?> b() {
      return ehn.o;
   }
}
