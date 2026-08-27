import java.util.List;
import javax.annotation.Nullable;

public class cqu extends cou {
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

   public cqu(cou.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable sw $$0) {
      if (!cqt.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(coz $$0) {
      return $$0.w().h("generation");
   }

   public static int k(coz $$0) {
      sw $$1 = $$0.w();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public vq m(coz $$0) {
      sw $$1 = $$0.w();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!axd.b($$2)) {
            return vq.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      if ($$0.v()) {
         sw $$4 = $$0.w();
         String $$5 = $$4.l("author");
         if (!axd.b($$5)) {
            $$2.add(vq.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(vq.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(atu.c.b(this));
      return blv.a($$3, $$0.y_());
   }

   public static boolean a(coz $$0, @Nullable du $$1, @Nullable chh $$2) {
      sw $$3 = $$0.w();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            tc $$4 = $$3.c("pages", 8);
            tc $$5 = new tc();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, tr.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               sw $$8 = $$3.p("filtered_pages");
               sw $$9 = new sw();

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

   private static String a(@Nullable du $$0, @Nullable chh $$1, String $$2) {
      vq $$5;
      try {
         $$5 = vq.a.b($$2);
         $$5 = vt.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = vq.b($$2);
      }

      return vq.a.a($$5);
   }

   @Override
   public boolean i(coz $$0) {
      return true;
   }
}
