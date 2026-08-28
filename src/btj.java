import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum btj implements azc, azu {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<btj> c = azu.a(btj::values);
   public static final IntFunction<btj> d = axp.a(btj::a, values(), axp.a.a);
   private final int e;
   private final String f;
   private final String g;

   private btj(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public btj e() {
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
