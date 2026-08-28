import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehg extends eht {
   public static final MapCodec<ehg> a = dxs.a.c.fieldOf("step").xmap(ehg::new, $$0 -> $$0.c);
   private final dxs.a c;

   private ehg(dxs.a $$0) {
      this.c = $$0;
   }

   public static ehg a(dxs.a $$0) {
      return new ehg($$0);
   }

   @Override
   public Stream<iz> a_(ehr $$0, azh $$1, iz $$2) {
      dbh $$3 = new dbh($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public ehu<?> b() {
      return ehu.o;
   }
}
