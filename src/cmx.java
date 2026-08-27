import java.util.List;
import javax.annotation.Nullable;

public class cmx extends ckw {
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

   public cmx(ckw.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable rz $$0) {
      if (!cmw.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(clb $$0) {
      return $$0.v().h("generation");
   }

   public static int k(clb $$0) {
      rz $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public ur m(clb $$0) {
      rz $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!auc.b($$2)) {
            return ur.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      if ($$0.u()) {
         rz $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!auc.b($$5)) {
            $$2.add(ur.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(ur.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      if ($$3.a(cuv.oa)) {
         return czd.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? biq.a($$1.B) : biq.d;
      } else {
         return biq.d;
      }
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(aqx.c.b(this));
      return bir.a($$3, $$0.x_());
   }

   public static boolean a(clb $$0, @Nullable du $$1, @Nullable cdm $$2) {
      rz $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            sf $$4 = $$3.c("pages", 8);
            sf $$5 = new sf();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, su.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               rz $$8 = $$3.p("filtered_pages");
               rz $$9 = new rz();

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

   private static String a(@Nullable du $$0, @Nullable cdm $$1, String $$2) {
      ur $$5;
      try {
         $$5 = ur.a.b($$2);
         $$5 = uu.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = ur.b($$2);
      }

      return ur.a.a($$5);
   }

   @Override
   public boolean i(clb $$0) {
      return true;
   }
}
