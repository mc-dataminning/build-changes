import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;

public interface bmg {
   static bma<StringReader> a(String $$0) {
      return new bmg.b($$0);
   }

   static bma<StringReader> a(char $$0) {
      return new bmg.a($$0);
   }

   public static record a(char a) implements bma<StringReader> {
      @Override
      public boolean a(blw<StringReader> $$0, bly $$1, bls $$2) {
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

   public static record b(String a) implements bma<StringReader> {
      @Override
      public boolean a(blw<StringReader> $$0, bly $$1, bls $$2) {
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
