import java.util.List;
import javax.annotation.Nullable;

public class crl extends cpl {
   public static final int a = 16;
   public static final int b = 32;
   public static final int c = 1024;
   public static final int d = 32767;
   public static final int e = 100;
   public static final int f = 2;
   public static final String g = "title";
   public static final String h = "filtered_title";
   public static final String i = "author";
   public static final String j = "pages";
   public static final String k = "filtered_pages";
   public static final String r = "generation";
   public static final String s = "resolved";

   public crl(cpl.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable sy $$0) {
      if (!crk.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(cpq $$0) {
      sy $$1 = $$0.w();
      return $$1 != null ? $$1.h("generation") : 0;
   }

   public static int k(cpq $$0) {
      sy $$1 = $$0.w();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public vs m(cpq $$0) {
      sy $$1 = $$0.w();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!axh.b($$2)) {
            return vs.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      if ($$0.v()) {
         sy $$4 = $$0.w();
         String $$5 = $$4.l("author");
         if (!axh.b($$5)) {
            $$2.add(vs.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(vs.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(atz.c.b(this));
      return bmm.a($$3, $$0.y_());
   }

   public static boolean a(cpq $$0, @Nullable du $$1, @Nullable cia $$2) {
      sy $$3 = $$0.w();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            te $$4 = $$3.c("pages", 8);
            te $$5 = new te();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, tt.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               sy $$8 = $$3.p("filtered_pages");
               sy $$9 = new sy();

               for (String $$10 : $$8.e()) {
                  String $$11 = a($$1, $$2, $$8.l($$10));
                  if ($$11.length() > 32767) {
                     return false;
                  }

                  $$9.a($$10, $$11);
               }

               $$3.a("filtered_pages", $$9);
            }

            $$3.a("pages", $$5);
            return true;
         }
      } else {
         return false;
      }
   }

   private static String a(@Nullable du $$0, @Nullable cia $$1, String $$2) {
      vs $$5;
      try {
         $$5 = vs.a.b($$2);
         $$5 = vv.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = vs.b($$2);
      }

      return vs.a.a($$5);
   }

   @Override
   public boolean i(cpq $$0) {
      return true;
   }
}
