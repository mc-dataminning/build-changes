import java.util.List;
import javax.annotation.Nullable;

public class ckw extends civ {
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

   public ckw(civ.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable qu $$0) {
      if (!ckv.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(cja $$0) {
      return $$0.v().h("generation");
   }

   public static int k(cja $$0) {
      qu $$1 = $$0.v();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public ti m(cja $$0) {
      qu $$1 = $$0.v();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!asl.b($$2)) {
            return ti.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      if ($$0.u()) {
         qu $$4 = $$0.v();
         String $$5 = $$4.l("author");
         if (!asl.b($$5)) {
            $$2.add(ti.a("book.byAuthor", $$5).a(n.h));
         }

         $$2.add(ti.c("book.generation." + $$4.h("generation")).a(n.h));
      }
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      if ($$3.a(csr.oa)) {
         return cwy.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bgt.a($$1.B) : bgt.d;
      } else {
         return bgt.d;
      }
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(apj.c.b(this));
      return bgu.a($$3, $$0.r_());
   }

   public static boolean a(cja $$0, @Nullable dt $$1, @Nullable cbp $$2) {
      qu $$3 = $$0.v();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            ra $$4 = $$3.c("pages", 8);
            ra $$5 = new ra();

            for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, rl.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               qu $$8 = $$3.p("filtered_pages");
               qu $$9 = new qu();

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

   private static String a(@Nullable dt $$0, @Nullable cbp $$1, String $$2) {
      ti $$5;
      try {
         $$5 = ti.a.b($$2);
         $$5 = tk.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = ti.b($$2);
      }

      return ti.a.a($$5);
   }

   @Override
   public boolean i(cja $$0) {
      return true;
   }
}
