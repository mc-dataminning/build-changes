import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eiy {
   public static final String a = "INVALID";
   public static final eiy b = new eiy(null, new dbk(0, 0), 0, new ejf(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eiq d;
   private final ejf e;
   private final dbk f;
   private int g;
   @Nullable
   private volatile eii h;

   public eiy(eiq $$0, dbk $$1, int $$2, ejf $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eiy a(ejg $$0, tx $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jw<eiq> $$4 = $$0.b().d(lr.aQ);
         eiq $$5 = $$4.a(new akk($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dbk $$6 = new dbk($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ud $$8 = $$1.c("Children", 10);

            try {
               ejf $$9 = ejf.a($$8, $$0);
               if ($$5 instanceof ela) {
                  $$9 = ela.a($$6, $$2, $$9);
               }

               return new eiy($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eii a() {
      eii $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5) {
      List<eiu> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eii $$7 = $$6.get(0).f;
         ja $$8 = $$7.g();
         ja $$9 = new ja($$8.u(), $$7.i(), $$8.w());

         for (eiu $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tx a(ejg $$0, dbk $$1) {
      tx $$2 = new tx();
      if (this.b()) {
         $$2.a("id", $$0.b().d(lr.aQ).b(this.d).toString());
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

   public dbk c() {
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

   public eiq h() {
      return this.d;
   }

   public List<eiu> i() {
      return this.e.c();
   }
}
