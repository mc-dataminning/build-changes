import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dad(int f) implements czm, dai {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dad> d = ayi.a(0, 4).xmap(dad::new, dad::a);
   public static final yn<wa, dad> e = yn.a(yl.h, dad::a, dad::new);

   @Override
   public void a(dgz $$0, bvy $$1, cxh $$2, czl $$3) {
      $$1.a(new bue(bug.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cxd.b $$0, Consumer<wp> $$1, cyx $$2) {
      List<bue> $$3 = List.of(new bue(bug.E, 120000, this.f, false, false, true));
      cze.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
