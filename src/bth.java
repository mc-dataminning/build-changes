import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bth implements aza, azs {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bth> c = azs.a(bth::values);
   public static final IntFunction<bth> d = axo.a(bth::a, values(), axo.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bth(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bth e() {
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
