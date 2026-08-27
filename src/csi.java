import java.util.List;
import javax.annotation.Nullable;

public class csi extends cqh {
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

   public csi(cqh.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable ta $$0) {
      if (!csh.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(cqm $$0) {
      ta $$1 = $$0.w();
      return $$1 != null ? $$1.h("generation") : 0;
   }

   public static int k(cqm $$0) {
      ta $$1 = $$0.w();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public vu m(cqm $$0) {
      ta $$1 = $$0.w();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!axr.b($$2)) {
            return vu.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      if ($$0.v()) {
         ta $$4 = $$0.w();
         String $$5 = $$4.l("author");
         if (!axr.b($$5)) {
            $$2.add(vu.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(vu.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(aui.c.b(this));
      return bne.a($$3, $$0.x_());
   }

   public static boolean a(cqm $$0, @Nullable du $$1, @Nullable ciu $$2) {
      ta $$3 = $$0.w();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            tg $$4 = $$3.c("pages", 8);
            tg $$5 = new tg();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, tv.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               ta $$8 = $$3.p("filtered_pages");
               ta $$9 = new ta();

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

   private static String a(@Nullable du $$0, @Nullable ciu $$1, String $$2) {
      vu $$5;
      try {
         $$5 = vu.a.b($$2);
         $$5 = vx.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = vu.b($$2);
      }

      return vu.a.a($$5);
   }

   @Override
   public boolean i(cqm $$0) {
      return true;
   }
}
