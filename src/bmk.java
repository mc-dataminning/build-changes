import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;

public interface bmk {
   static bme<StringReader> a(String $$0) {
      return new bmk.b($$0);
   }

   static bme<StringReader> a(char $$0) {
      return new bmk.a($$0);
   }

   public static record a(char a) implements bme<StringReader> {
      @Override
      public boolean a(bma<StringReader> $$0, bmc $$1, blw $$2) {
         $$0.b().skipWhitespace();
         int $$3 = $$0.c();
         if ($$0.b().canRead() && $$0.b().read() == this.a) {
            return true;
         } else {
            $$0.a().a($$3, $$0x -> Stream.of(String.valueOf(this.a)), CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect().create(this.a));
            return false;
         }
      }

      public char c() {
         return this.a;
      }
   }

   public static record b(String a) implements bme<StringReader> {
      @Override
      public boolean a(bma<StringReader> $$0, bmc $$1, blw $$2) {
         $$0.b().skipWhitespace();
         int $$3 = $$0.c();
         String $$4 = $$0.b().readUnquotedString();
         if (!$$4.equals(this.a)) {
            $$0.a().a($$3, $$0x -> Stream.of(this.a), CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect().create(this.a));
            return false;
         } else {
            return true;
         }
      }

      public String c() {
         return this.a;
      }
   }
}
