import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public abstract class evp {
   private static final String a = "/\\*(?:[^*]|\\*+[^*/])*\\*+/";
   private static final String b = "//[^\\v]*";
   private static final Pattern c = Pattern.compile(
      "(#(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*moj_import(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*(?:\"(.*)\"|<(.*)>))"
   );
   private static final Pattern d = Pattern.compile("(#(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*version(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*(\\d+))\\b");
   private static final Pattern e = Pattern.compile("(?:^|\\v)(?:\\s|/\\*(?:[^*]|\\*+[^*/])*\\*+/|(//[^\\v]*))*\\z");

   public List<String> a(String $$0) {
      evp.a $$1 = new evp.a();
      List<String> $$2 = this.a($$0, $$1, "");
      $$2.set(0, this.a($$2.get(0), $$1.a));
      return $$2;
   }

   private List<String> a(String $$0, evp.a $$1, String $$2) {
      int $$3 = $$1.b;
      int $$4 = 0;
      String $$5 = "";
      List<String> $$6 = Lists.newArrayList();
      Matcher $$7 = c.matcher($$0);

      while ($$7.find()) {
         if (!a($$0, $$7, $$4)) {
            String $$8 = $$7.group(2);
            boolean $$9 = $$8 != null;
            if (!$$9) {
               $$8 = $$7.group(3);
            }

            if ($$8 != null) {
               String $$10 = $$0.substring($$4, $$7.start(1));
               String $$11 = $$2 + $$8;
               String $$12 = this.a($$9, $$11);
               if (!Strings.isNullOrEmpty($$12)) {
                  if (!ayf.d($$12)) {
                     $$12 = $$12 + System.lineSeparator();
                  }

                  $$1.b++;
                  int $$13 = $$1.b;
                  List<String> $$14 = this.a($$12, $$1, $$9 ? v.a($$11) : "");
                  $$14.set(0, String.format(Locale.ROOT, "#line %d %d\n%s", 0, $$13, this.a($$14.get(0), $$1)));
                  if (!ayf.h($$10)) {
                     $$6.add($$10);
                  }

                  $$6.addAll($$14);
               } else {
                  String $$15 = $$9 ? String.format(Locale.ROOT, "/*#moj_import \"%s\"*/", $$8) : String.format(Locale.ROOT, "/*#moj_import <%s>*/", $$8);
                  $$6.add($$5 + $$10 + $$15);
               }

               int $$16 = ayf.c($$0.substring(0, $$7.end(1)));
               $$5 = String.format(Locale.ROOT, "#line %d %d", $$16, $$3);
               $$4 = $$7.end(1);
            }
         }
      }

      String $$17 = $$0.substring($$4);
      if (!ayf.h($$17)) {
         $$6.add($$5 + $$17);
      }

      return $$6;
   }

   private String a(String $$0, evp.a $$1) {
      Matcher $$2 = d.matcher($$0);
      if ($$2.find() && a($$0, $$2)) {
         $$1.a = Math.max($$1.a, Integer.parseInt($$2.group(2)));
         return $$0.substring(0, $$2.start(1)) + "/*" + $$0.substring($$2.start(1), $$2.end(1)) + "*/" + $$0.substring($$2.end(1));
      } else {
         return $$0;
      }
   }

   private String a(String $$0, int $$1) {
      Matcher $$2 = d.matcher($$0);
      return $$2.find() && a($$0, $$2) ? $$0.substring(0, $$2.start(2)) + Math.max($$1, Integer.parseInt($$2.group(2))) + $$0.substring($$2.end(2)) : $$0;
   }

   private static boolean a(String $$0, Matcher $$1) {
      return !a($$0, $$1, 0);
   }

   private static boolean a(String $$0, Matcher $$1, int $$2) {
      int $$3 = $$1.start() - $$2;
      if ($$3 == 0) {
         return false;
      } else {
         Matcher $$4 = e.matcher($$0.substring($$2, $$1.start()));
         if (!$$4.find()) {
            return true;
         } else {
            int $$5 = $$4.end(1);
            return $$5 == $$1.start();
         }
      }
   }

   @Nullable
   public abstract String a(boolean var1, String var2);

   static final class a {
      int a;
      int b;
   }
}
