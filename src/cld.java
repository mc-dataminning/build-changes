import java.util.List;
import javax.annotation.Nullable;

public class cld extends cjc {
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

   public cld(cjc.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable qy $$0) {
      if (!clc.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(cjh $$0) {
      return $$0.v().h("generation");
   }

   public static int k(cjh $$0) {
      qy $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public tn m(cjh $$0) {
      qy $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!ass.b($$2)) {
            return tn.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      if ($$0.u()) {
         qy $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!ass.b($$5)) {
            $$2.add(tn.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(tn.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      if ($$3.a(csy.oa)) {
         return cxf.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bha.a($$1.B) : bha.d;
      } else {
         return bha.d;
      }
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(app.c.b(this));
      return bhb.a($$3, $$0.w_());
   }

   public static boolean a(cjh $$0, @Nullable dt $$1, @Nullable cbw $$2) {
      qy $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            re $$4 = $$3.c("pages", 8);
            re $$5 = new re();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, rq.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               qy $$8 = $$3.p("filtered_pages");
               qy $$9 = new qy();

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

   private static String a(@Nullable dt $$0, @Nullable cbw $$1, String $$2) {
      tn $$5;
      try {
         $$5 = tn.a.b($$2);
         $$5 = tp.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = tn.b($$2);
      }

      return tn.a.a($$5);
   }

   @Override
   public boolean i(cjh $$0) {
      return true;
   }
}
