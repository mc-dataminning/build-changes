import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dtw extends duj {
   public static final Codec<dtw> a = dki.a.c.fieldOf("step").xmap(dtw::new, $$0 -> $$0.c).codec();
   private final dki.a c;

   private dtw(dki.a $$0) {
      this.c = $$0;
   }

   public static dtw a(dki.a $$0) {
      return new dtw($$0);
   }

   @Override
   public Stream<gw> a_(duh $$0, ash $$1, gw $$2) {
      cpi $$3 = new cpi($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public duk<?> b() {
      return duk.o;
   }
}
