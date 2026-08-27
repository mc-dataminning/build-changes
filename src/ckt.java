import java.util.List;
import javax.annotation.Nullable;

public class ckt extends cis {
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

   public ckt(cis.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable qr $$0) {
      if (!cks.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(cix $$0) {
      return $$0.v().h("generation");
   }

   public static int k(cix $$0) {
      qr $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public tf m(cix $$0) {
      qr $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!asi.b($$2)) {
            return tf.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      if ($$0.u()) {
         qr $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!asi.b($$5)) {
            $$2.add(tf.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(tf.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      if ($$3.a(csm.oa)) {
         return cwt.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bgq.a($$1.B) : bgq.d;
      } else {
         return bgq.d;
      }
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(apg.c.b(this));
      return bgr.a($$3, $$0.r_());
   }

   public static boolean a(cix $$0, @Nullable dr $$1, @Nullable cbm $$2) {
      qr $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            qx $$4 = $$3.c("pages", 8);
            qx $$5 = new qx();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, ri.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               qr $$8 = $$3.p("filtered_pages");
               qr $$9 = new qr();

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

   private static String a(@Nullable dr $$0, @Nullable cbm $$1, String $$2) {
      tf $$5;
      try {
         $$5 = tf.a.b($$2);
         $$5 = th.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = tf.b($$2);
      }

      return tf.a.a($$5);
   }

   @Override
   public boolean i(cix $$0) {
      return true;
   }
}
