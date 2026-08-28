import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class fjb {
   private final int a;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final int f;
   private static final Pattern g = Pattern.compile("(\\d+)x(\\d+)(?:@(\\d+)(?::(\\d+))?)?");

   public fjb(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fjb(Buffer $$0) {
      this.a = $$0.width();
      this.b = $$0.height();
      this.c = $$0.redBits();
      this.d = $$0.greenBits();
      this.e = $$0.blueBits();
      this.f = $$0.refreshRate();
   }

   public fjb(GLFWVidMode $$0) {
      this.a = $$0.width();
      this.b = $$0.height();
      this.c = $$0.redBits();
      this.d = $$0.greenBits();
      this.e = $$0.blueBits();
      this.f = $$0.refreshRate();
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   public int f() {
      return this.f;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         fjb $$1 = (fjb)$$0;
         return this.a == $$1.a && this.b == $$1.b && this.c == $$1.c && this.d == $$1.d && this.e == $$1.e && this.f == $$1.f;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f);
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "%sx%s@%s (%sbit)", this.a, this.b, this.f, this.c + this.d + this.e);
   }

   public static Optional<fjb> a(@Nullable String $$0) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         try {
            Matcher $$1 = g.matcher($$0);
            if ($$1.matches()) {
               int $$2 = Integer.parseInt($$1.group(1));
               int $$3 = Integer.parseInt($$1.group(2));
               String $$4 = $$1.group(3);
               int $$5;
               if ($$4 == null) {
                  $$5 = 60;
               } else {
                  $$5 = Integer.parseInt($$4);
               }

               String $$7 = $$1.group(4);
               int $$8;
               if ($$7 == null) {
                  $$8 = 24;
               } else {
                  $$8 = Integer.parseInt($$7);
               }

               int $$10 = $$8 / 3;
               return Optional.of(new fjb($$2, $$3, $$10, $$10, $$10, $$5));
            }
         } catch (Exception var9) {
         }

         return Optional.empty();
      }
   }

   public String g() {
      return String.format(Locale.ROOT, "%sx%s@%s:%s", this.a, this.b, this.f, this.c + this.d + this.e);
   }
}
