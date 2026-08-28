import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.chars.CharList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface bqz {
   static bqo<StringReader> a(String $$0) {
      return new bqz.b($$0);
   }

   static bqo<StringReader> a(final char $$0) {
      return new bqz.a(CharList.of($$0)) {
         @Override
         protected boolean a(char $$0x) {
            return $$0 == $$0;
         }
      };
   }

   static bqo<StringReader> a(final char $$0, final char $$1) {
      return new bqz.a(CharList.of($$0, $$1)) {
         @Override
         protected boolean a(char $$0x) {
            return $$0 == $$0 || $$0 == $$1;
         }
      };
   }

   static StringReader a(String $$0, int $$1) {
      StringReader $$2 = new StringReader($$0);
      $$2.setCursor($$1);
      return $$2;
   }

   public abstract static class a implements bqo<StringReader> {
      private final bqf<CommandSyntaxException> a;
      private final bqn<StringReader> b;

      public a(CharList $$0) {
         String $$1 = $$0.intStream().mapToObj(Character::toString).collect(Collectors.joining("|"));
         this.a = bqf.a(CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect(), String.valueOf($$1));
         this.b = $$1x -> $$0.intStream().mapToObj(Character::toString);
      }

      @Override
      public boolean a(bqk<StringReader> $$0, bqm $$1, bqe $$2) {
         $$0.f().skipWhitespace();
         int $$3 = $$0.g();
         if ($$0.f().canRead() && this.a($$0.f().read())) {
            return true;
         } else {
            $$0.b().a($$3, this.b, this.a);
            return false;
         }
      }

      protected abstract boolean a(char var1);
   }

   public static final class b implements bqo<StringReader> {
      private final String a;
      private final bqf<CommandSyntaxException> b;
      private final bqn<StringReader> c;

      public b(String $$0) {
         this.a = $$0;
         this.b = bqf.a(CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect(), $$0);
         this.c = $$1 -> Stream.of($$0);
      }

      @Override
      public boolean a(bqk<StringReader> $$0, bqm $$1, bqe $$2) {
         $$0.f().skipWhitespace();
         int $$3 = $$0.g();
         String $$4 = $$0.f().readUnquotedString();
         if (!$$4.equals(this.a)) {
            $$0.b().a($$3, this.c, this.b);
            return false;
         } else {
            return true;
         }
      }

      @Override
      public String toString() {
         return "terminal[" + this.a + "]";
      }
   }
}
