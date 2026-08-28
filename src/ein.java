import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class ein {
   public static final String a = "INVALID";
   public static final ein b = new ein(null, new dba(0, 0), 0, new eiu(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eif d;
   private final eiu e;
   private final dba f;
   private int g;
   @Nullable
   private volatile ehx h;

   public ein(eif $$0, dba $$1, int $$2, eiu $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static ein a(eiv $$0, ur $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jv<eif> $$4 = $$0.b().d(lq.aJ);
         eif $$5 = $$4.a(new alb($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dba $$6 = new dba($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ux $$8 = $$1.c("Children", 10);

            try {
               eiu $$9 = eiu.a($$8, $$0);
               if ($$5 instanceof ekp) {
                  $$9 = ekp.a($$6, $$2, $$9);
               }

               return new ein($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public ehx a() {
      ehx $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5) {
      List<eij> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         ehx $$7 = $$6.get(0).f;
         iz $$8 = $$7.g();
         iz $$9 = new iz($$8.u(), $$7.i(), $$8.w());

         for (eij $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ur a(eiv $$0, dba $$1) {
      ur $$2 = new ur();
      if (this.b()) {
         $$2.a("id", $$0.b().d(lq.aJ).b(this.d).toString());
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

   public dba c() {
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

   public eif h() {
      return this.d;
   }

   public List<eij> i() {
      return this.e.c();
   }
}
