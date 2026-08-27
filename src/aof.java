import java.nio.file.Path;
import java.util.Map;

interface aof {
   aof a = new aof() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aof b = new aof() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, aoc> c) implements aof {
      public Map<String, aoc> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aof {
      public Path a() {
         return this.c;
      }
   }
}
