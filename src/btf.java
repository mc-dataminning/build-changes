import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum btf implements ayq, azj {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<btf> c = azj.a(btf::values);
   public static final IntFunction<btf> d = axd.a(btf::a, values(), axd.a.a);
   private final int e;
   private final String f;
   private final String g;

   private btf(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public btf e() {
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
