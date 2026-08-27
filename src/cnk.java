import java.util.List;
import javax.annotation.Nullable;

public class cnk extends clj {
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

   public cnk(clj.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable sd $$0) {
      if (!cnj.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(clo $$0) {
      return $$0.v().h("generation");
   }

   public static int k(clo $$0) {
      sd $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public uv m(clo $$0) {
      sd $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!aul.b($$2)) {
            return uv.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      if ($$0.u()) {
         sd $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!aul.b($$5)) {
            $$2.add(uv.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(uv.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      if ($$3.a(cvh.oa)) {
         return czp.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bjb.a($$1.B) : bjb.d;
      } else {
         return bjb.d;
      }
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(arf.c.b(this));
      return bjc.a($$3, $$0.y_());
   }

   public static boolean a(clo $$0, @Nullable du $$1, @Nullable cdz $$2) {
      sd $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            sj $$4 = $$3.c("pages", 8);
            sj $$5 = new sj();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, sy.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               sd $$8 = $$3.p("filtered_pages");
               sd $$9 = new sd();

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

   private static String a(@Nullable du $$0, @Nullable cdz $$1, String $$2) {
      uv $$5;
      try {
         $$5 = uv.a.b($$2);
         $$5 = uy.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = uv.b($$2);
      }

      return uv.a.a($$5);
   }

   @Override
   public boolean i(clo $$0) {
      return true;
   }
}
