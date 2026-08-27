import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dvp extends dwc {
   public static final Codec<dvp> a = dmb.a.c.fieldOf("step").xmap(dvp::new, $$0 -> $$0.c).codec();
   private final dmb.a c;

   private dvp(dmb.a $$0) {
      this.c = $$0;
   }

   public static dvp a(dmb.a $$0) {
      return new dvp($$0);
   }

   @Override
   public Stream<ht> a_(dwa $$0, ato $$1, ht $$2) {
      cqz $$3 = new cqz($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dwd<?> b() {
      return dwd.o;
   }
}
