import java.util.List;
import javax.annotation.Nullable;

public class cpd extends cnb {
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

   public cpd(cnb.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable so $$0) {
      if (!cpc.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(cng $$0) {
      return $$0.v().h("generation");
   }

   public static int k(cng $$0) {
      so $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public vg m(cng $$0) {
      so $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!avm.b($$2)) {
            return vg.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      if ($$0.u()) {
         so $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!avm.b($$5)) {
            $$2.add(vg.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(vg.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(asd.c.b(this));
      return bkd.a($$3, $$0.y_());
   }

   public static boolean a(cng $$0, @Nullable ds $$1, @Nullable cfq $$2) {
      so $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            su $$4 = $$3.c("pages", 8);
            su $$5 = new su();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, tj.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               so $$8 = $$3.p("filtered_pages");
               so $$9 = new so();

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

   private static String a(@Nullable ds $$0, @Nullable cfq $$1, String $$2) {
      vg $$5;
      try {
         $$5 = vg.a.b($$2);
         $$5 = vj.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = vg.b($$2);
      }

      return vg.a.a($$5);
   }

   @Override
   public boolean i(cng $$0) {
      return true;
   }
}
