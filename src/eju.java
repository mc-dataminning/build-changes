import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eju {
   public static final String a = "INVALID";
   public static final eju b = new eju(null, new dcb(0, 0), 0, new ekb(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final ejm d;
   private final ekb e;
   private final dcb f;
   private int g;
   @Nullable
   private volatile eje h;

   public eju(ejm $$0, dcb $$1, int $$2, ekb $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eju a(ekc $$0, ua $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jz<ejm> $$4 = $$0.b().d(lu.aR);
         ejm $$5 = $$4.a(akq.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dcb $$6 = new dcb($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ug $$8 = $$1.c("Children", 10);

            try {
               ekb $$9 = ekb.a($$8, $$0);
               if ($$5 instanceof elx) {
                  $$9 = elx.a($$6, $$2, $$9);
               }

               return new eju($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eje a() {
      eje $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5) {
      List<ejq> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eje $$7 = $$6.get(0).f;
         jd $$8 = $$7.g();
         jd $$9 = new jd($$8.u(), $$7.i(), $$8.w());

         for (ejq $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ua a(ekc $$0, dcb $$1) {
      ua $$2 = new ua();
      if (this.b()) {
         $$2.a("id", $$0.b().d(lu.aR).b(this.d).toString());
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

   public dcb c() {
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

   public ejm h() {
      return this.d;
   }

   public List<ejq> i() {
      return this.e.c();
   }
}
