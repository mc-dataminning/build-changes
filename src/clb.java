import java.util.List;
import javax.annotation.Nullable;

public class clb extends cja {
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

   public clb(cja.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable qx $$0) {
      if (!cla.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(cjf $$0) {
      return $$0.v().h("generation");
   }

   public static int k(cjf $$0) {
      qx $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public tl m(cjf $$0) {
      qx $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!asq.b($$2)) {
            return tl.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tl> $$2, ckw $$3) {
      if ($$0.u()) {
         qx $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!asq.b($$5)) {
            $$2.add(tl.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(tl.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      if ($$3.a(csw.oa)) {
         return cxd.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bgy.a($$1.B) : bgy.d;
      } else {
         return bgy.d;
      }
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(apo.c.b(this));
      return bgz.a($$3, $$0.w_());
   }

   public static boolean a(cjf $$0, @Nullable dt $$1, @Nullable cbu $$2) {
      qx $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            rd $$4 = $$3.c("pages", 8);
            rd $$5 = new rd();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, ro.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               qx $$8 = $$3.p("filtered_pages");
               qx $$9 = new qx();

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

   private static String a(@Nullable dt $$0, @Nullable cbu $$1, String $$2) {
      tl $$5;
      try {
         $$5 = tl.a.b($$2);
         $$5 = tn.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = tl.b($$2);
      }

      return tl.a.a($$5);
   }

   @Override
   public boolean i(cjf $$0) {
      return true;
   }
}
