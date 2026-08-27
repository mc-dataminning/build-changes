import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwr extends duz {
   public static final Codec<dwr> d = a(dwr::new);

   public dwr(duz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      return a($$0, dkj.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dvr $$0, duz.a $$1) {
      cot $$2 = $$1.h();
      dli $$3 = $$1.f();
      gu $$4 = new gu($$2.d(), 90, $$2.e());
      cyy $$5 = cyy.a($$3);
      dwq.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dvi<?> e() {
      return dvi.e;
   }
}
