import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class ekb {
   public static final String a = "INVALID";
   public static final ekb b = new ekb(null, new dbh(0, 0), 0, new eki(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final ejt d;
   private final eki e;
   private final dbh f;
   private int g;
   @Nullable
   private volatile ejl h;

   public ekb(ejt $$0, dbh $$1, int $$2, eki $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static ekb a(ekj $$0, uk $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jn<ejt> $$4 = $$0.b().d(li.aJ);
         ejt $$5 = $$4.a(new akt($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dbh $$6 = new dbh($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            uq $$8 = $$1.c("Children", 10);

            try {
               eki $$9 = eki.a($$8, $$0);
               if ($$5 instanceof emd) {
                  $$9 = emd.a($$6, $$2, $$9);
               }

               return new ekb($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public ejl a() {
      ejl $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5) {
      List<ejx> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         ejl $$7 = $$6.get(0).f;
         ir $$8 = $$7.g();
         ir $$9 = new ir($$8.u(), $$7.i(), $$8.w());

         for (ejx $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public uk a(ekj $$0, dbh $$1) {
      uk $$2 = new uk();
      if (this.b()) {
         $$2.a("id", $$0.b().d(li.aJ).b(this.d).toString());
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

   public dbh c() {
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

   public ejt h() {
      return this.d;
   }

   public List<ejx> i() {
      return this.e.c();
   }
}
