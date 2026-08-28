import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bti implements azb, azt {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bti> c = azt.a(bti::values);
   public static final IntFunction<bti> d = axo.a(bti::a, values(), axo.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bti(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bti e() {
      return this == a ? b : a;
   }

   @Override
   public int a() {
      return this.e;
   }

   @Override
   public String b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.f;
   }
}
