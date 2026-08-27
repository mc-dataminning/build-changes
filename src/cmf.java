import java.util.List;
import javax.annotation.Nullable;

public class cmf extends cke {
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

   public cmf(cke.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable rt $$0) {
      if (!cme.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(ckj $$0) {
      return $$0.v().h("generation");
   }

   public static int k(ckj $$0) {
      rt $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public ui m(ckj $$0) {
      rt $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!ats.b($$2)) {
            return ui.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      if ($$0.u()) {
         rt $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!ats.b($$5)) {
            $$2.add(ui.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(ui.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      if ($$3.a(cuc.oa)) {
         return cyj.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bib.a($$1.B) : bib.d;
      } else {
         return bib.d;
      }
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(aqn.c.b(this));
      return bic.a($$3, $$0.x_());
   }

   public static boolean a(ckj $$0, @Nullable du $$1, @Nullable ccx $$2) {
      rt $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            rz $$4 = $$3.c("pages", 8);
            rz $$5 = new rz();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, sl.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               rt $$8 = $$3.p("filtered_pages");
               rt $$9 = new rt();

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

   private static String a(@Nullable du $$0, @Nullable ccx $$1, String $$2) {
      ui $$5;
      try {
         $$5 = ui.a.b($$2);
         $$5 = ul.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = ui.b($$2);
      }

      return ui.a.a($$5);
   }

   @Override
   public boolean i(ckj $$0) {
      return true;
   }
}
