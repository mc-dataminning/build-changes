import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bup implements azm, baf {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bup> c = baf.a(bup::values);
   public static final IntFunction<bup> d = aya.a(bup::b, values(), aya.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bup(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bup e() {
      return this == a ? b : a;
   }

   @Override
   public int b() {
      return this.e;
   }

   @Override
   public String a() {
      return this.g;
   }

   @Override
   public String c() {
      return this.f;
   }
}
