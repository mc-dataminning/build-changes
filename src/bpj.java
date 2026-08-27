import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bpj implements ayt {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final ayt.a<bpj> e = ayt.a(bpj::values);
   private static final IntFunction<bpj> f = awq.a(bpj::a, values(), awq.a.b);
   private final int g;
   private final String h;

   private bpj(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.g;
   }

   public wu b() {
      return wu.c("options.difficulty." + this.h);
   }

   public wu d() {
      return wu.c("options.difficulty." + this.h + ".info");
   }

   public static bpj a(int $$0) {
      return f.apply($$0);
   }

   @Nullable
   public static bpj a(String $$0) {
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
