import java.nio.file.Path;
import java.util.List;

public interface bqo {
   char d = '\u001e';

   List<bqs> a(String var1);

   boolean a(Path var1);

   long a();

   int b();

   long c();

   int d();

   default long g() {
      return this.c() - this.a();
   }

   default int f() {
      return this.d() - this.b();
   }

   String e();

   static String b(String $$0) {
      return $$0.replace('\u001e', '.');
   }
}
