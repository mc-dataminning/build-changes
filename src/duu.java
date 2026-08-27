import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class duu extends dvh {
   public static final Codec<duu> a = dlg.a.c.fieldOf("step").xmap(duu::new, $$0 -> $$0.c).codec();
   private final dlg.a c;

   private duu(dlg.a $$0) {
      this.c = $$0;
   }

   public static duu a(dlg.a $$0) {
      return new duu($$0);
   }

   @Override
   public Stream<ht> a_(dvf $$0, ate $$1, ht $$2) {
      cqg $$3 = new cqg($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dvi<?> b() {
      return dvi.o;
   }
}
