import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dqu extends drh {
   public static final Codec<dqu> a = dhg.a.c.fieldOf("step").xmap(dqu::new, $$0 -> $$0.c).codec();
   private final dhg.a c;

   private dqu(dhg.a $$0) {
      this.c = $$0;
   }

   public static dqu a(dhg.a $$0) {
      return new dqu($$0);
   }

   @Override
   public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
      clt $$3 = new clt($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dri<?> b() {
      return dri.o;
   }
}
