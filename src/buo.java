import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum buo implements bam {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bam.a<buo> e = bam.a(buo::values);
   private static final IntFunction<buo> f = aye.a(buo::a, values(), aye.a.b);
   private final int g;
   private final String h;

   private buo(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public xa b() {
      return xa.c("options.difficulty." + this.h);
   }

   public xa d() {
      return xa.c("options.difficulty." + this.h + ".info");
   }

   public static buo a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static buo a(String $$0) {
      return e.a($$0);
   }

   public String e() {
      return this.h;
   }

   @Override
   public String c() {
      return this.h;
   }
}
