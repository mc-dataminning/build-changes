import java.util.List;
import javax.annotation.Nullable;

public class cou extends cms {
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

   public cou(cms.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable sn $$0) {
      if (!cot.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(cmx $$0) {
      return $$0.v().h("generation");
   }

   public static int k(cmx $$0) {
      sn $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public vf m(cmx $$0) {
      sn $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!avk.b($$2)) {
            return vf.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      if ($$0.u()) {
         sn $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!avk.b($$5)) {
            $$2.add(vf.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(vf.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      if ($$3.a(cwr.oa)) {
         return daz.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bka.a($$1.B) : bka.d;
      } else {
         return bka.d;
      }
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(asb.c.b(this));
      return bkb.a($$3, $$0.y_());
   }

   public static boolean a(cmx $$0, @Nullable ds $$1, @Nullable cfh $$2) {
      sn $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            st $$4 = $$3.c("pages", 8);
            st $$5 = new st();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, ti.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               sn $$8 = $$3.p("filtered_pages");
               sn $$9 = new sn();

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

   private static String a(@Nullable ds $$0, @Nullable cfh $$1, String $$2) {
      vf $$5;
      try {
         $$5 = vf.a.b($$2);
         $$5 = vi.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = vf.b($$2);
      }

      return vf.a.a($$5);
   }

   @Override
   public boolean i(cmx $$0) {
      return true;
   }
}
