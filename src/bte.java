import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bte implements ayx, azp {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bte> c = azp.a(bte::values);
   public static final IntFunction<bte> d = axl.a(bte::a, values(), axl.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bte(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bte e() {
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
