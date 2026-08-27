import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class egf extends egs {
   public static final MapCodec<egf> a = dwr.a.c.fieldOf("step").xmap(egf::new, $$0 -> $$0.c);
   private final dwr.a c;

   private egf(dwr.a $$0) {
      this.c = $$0;
   }

   public static egf a(dwr.a $$0) {
      return new egf($$0);
   }

   @Override
   public Stream<io> a_(egq $$0, aym $$1, io $$2) {
      dag $$3 = new dag($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public egt<?> b() {
      return egt.o;
   }
}
