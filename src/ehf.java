import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehf extends ehs {
   public static final MapCodec<ehf> a = dxr.a.c.fieldOf("step").xmap(ehf::new, $$0 -> $$0.c);
   private final dxr.a c;

   private ehf(dxr.a $$0) {
      this.c = $$0;
   }

   public static ehf a(dxr.a $$0) {
      return new ehf($$0);
   }

   @Override
   public Stream<iz> a_(ehq $$0, azh $$1, iz $$2) {
      dbg $$3 = new dbg($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eht<?> b() {
      return eht.o;
   }
}
