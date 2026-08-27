import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eht {
   public static final String a = "INVALID";
   public static final eht b = new eht(null, new dag(0, 0), 0, new eia(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final ehl d;
   private final eia e;
   private final dag f;
   private int g;
   @Nullable
   private volatile ehd h;

   public eht(ehl $$0, dag $$1, int $$2, eia $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eht a(eib $$0, ud $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jk<ehl> $$4 = $$0.b().d(lf.aJ);
         ehl $$5 = $$4.a(new akn($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dag $$6 = new dag($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            uj $$8 = $$1.c("Children", 10);

            try {
               eia $$9 = eia.a($$8, $$0);
               if ($$5 instanceof ejv) {
                  $$9 = ejv.a($$6, $$2, $$9);
               }

               return new eht($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public ehd a() {
      ehd $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5) {
      List<ehp> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         ehd $$7 = $$6.get(0).f;
         io $$8 = $$7.g();
         io $$9 = new io($$8.u(), $$7.i(), $$8.w());

         for (ehp $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ud a(eib $$0, dag $$1) {
      ud $$2 = new ud();
      if (this.b()) {
         $$2.a("id", $$0.b().d(lf.aJ).b(this.d).toString());
         $$2.a("ChunkX", $$1.e);
         $$2.a("ChunkZ", $$1.f);
         $$2.a("references", this.g);
         $$2.a("Children", this.e.a($$0));
         return $$2;
      } else {
         $$2.a("id", "INVALID");
         return $$2;
      }
   }

   public boolean b() {
      return !this.e.a();
   }

   public dag c() {
      return this.f;
   }

   public boolean d() {
      return this.g < this.g();
   }

   public void e() {
      this.g++;
   }

   public int f() {
      return this.g;
   }

   protected int g() {
      return 1;
   }

   public ehl h() {
      return this.d;
   }

   public List<ehp> i() {
      return this.e.c();
   }
}
