import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czo(int f) implements cyx, czt {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<czo> d = ayi.a(0, 4).xmap(czo::new, czo::a);
   public static final yn<wa, czo> e = yn.a(yl.h, czo::a, czo::new);

   @Override
   public void a(dgj $$0, bvi $$1, cwq $$2, cyw $$3) {
      $$1.a(new btr(btt.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cwm.b $$0, Consumer<wp> $$1, cyi $$2) {
      List<btr> $$3 = List.of(new btr(btt.E, 120000, this.f, false, false, true));
      cyp.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
