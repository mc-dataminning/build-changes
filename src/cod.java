import java.util.List;
import javax.annotation.Nullable;

public class cod extends cmc {
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

   public cod(cmc.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable sj $$0) {
      if (!coc.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(cmh $$0) {
      return $$0.v().h("generation");
   }

   public static int k(cmh $$0) {
      sj $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public vb m(cmh $$0) {
      sj $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!auu.b($$2)) {
            return vb.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      if ($$0.u()) {
         sj $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!auu.b($$5)) {
            $$2.add(vb.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(vb.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      if ($$3.a(cwb.oa)) {
         return daj.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bjl.a($$1.B) : bjl.d;
      } else {
         return bjl.d;
      }
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(arm.c.b(this));
      return bjm.a($$3, $$0.y_());
   }

   public static boolean a(cmh $$0, @Nullable ds $$1, @Nullable cer $$2) {
      sj $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            sp $$4 = $$3.c("pages", 8);
            sp $$5 = new sp();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, te.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               sj $$8 = $$3.p("filtered_pages");
               sj $$9 = new sj();

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

   private static String a(@Nullable ds $$0, @Nullable cer $$1, String $$2) {
      vb $$5;
      try {
         $$5 = vb.a.b($$2);
         $$5 = ve.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = vb.b($$2);
      }

      return vb.a.a($$5);
   }

   @Override
   public boolean i(cmh $$0) {
      return true;
   }
}
