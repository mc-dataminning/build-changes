import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dtt extends dug {
   public static final Codec<dtt> a = dkf.a.c.fieldOf("step").xmap(dtt::new, $$0 -> $$0.c).codec();
   private final dkf.a c;

   private dtt(dkf.a $$0) {
      this.c = $$0;
   }

   public static dtt a(dkf.a $$0) {
      return new dtt($$0);
   }

   @Override
   public Stream<gu> a_(due $$0, aru $$1, gu $$2) {
      cot $$3 = new cot($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public duh<?> b() {
      return duh.o;
   }
}
