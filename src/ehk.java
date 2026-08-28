import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehk extends ehx {
   public static final MapCodec<ehk> a = dxv.a.c.fieldOf("step").xmap(ehk::new, $$0 -> $$0.c);
   private final dxv.a c;

   private ehk(dxv.a $$0) {
      this.c = $$0;
   }

   public static ehk a(dxv.a $$0) {
      return new ehk($$0);
   }

   @Override
   public Stream<ja> a_(ehv $$0, aym $$1, ja $$2) {
      dbk $$3 = new dbk($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public ehy<?> b() {
      return ehy.o;
   }
}
