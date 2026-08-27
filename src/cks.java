import java.util.List;
import javax.annotation.Nullable;

public class cks extends cir {
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

   public cks(cir.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable qs $$0) {
      if (!ckr.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(ciw $$0) {
      return $$0.v().h("generation");
   }

   public static int k(ciw $$0) {
      qs $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public te m(ciw $$0) {
      qs $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!asg.b($$2)) {
            return te.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      if ($$0.u()) {
         qs $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!asg.b($$5)) {
            $$2.add(te.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(te.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      if ($$3.a(csl.oa)) {
         return cws.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bgo.a($$1.B) : bgo.d;
      } else {
         return bgo.d;
      }
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(ape.c.b(this));
      return bgp.a($$3, $$0.r_());
   }

   public static boolean a(ciw $$0, @Nullable ds $$1, @Nullable cbl $$2) {
      qs $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            qy $$4 = $$3.c("pages", 8);
            qy $$5 = new qy();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, rj.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               qs $$8 = $$3.p("filtered_pages");
               qs $$9 = new qs();

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

   private static String a(@Nullable ds $$0, @Nullable cbl $$1, String $$2) {
      te $$5;
      try {
         $$5 = te.a.b($$2);
         $$5 = tg.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = te.b($$2);
      }

      return te.a.a($$5);
   }

   @Override
   public boolean i(ciw $$0) {
      return true;
   }
}
