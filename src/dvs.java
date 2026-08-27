import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dvs {
   public static final String a = "INVALID";
   public static final dvs b = new dvs(null, new cpe(0, 0), 0, new dvz(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dvk d;
   private final dvz e;
   private final cpe f;
   private int g;
   @Nullable
   private volatile dvc h;

   public dvs(dvk $$0, cpe $$1, int $$2, dvz $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dvs a(dwa $$0, qy $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ht<dvk> $$4 = $$0.b().d(je.az);
         dvk $$5 = $$4.a(new aey($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cpe $$6 = new cpe($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            re $$8 = $$1.c("Children", 10);

            try {
               dvz $$9 = dvz.a($$8, $$0);
               if ($$5 instanceof dxn) {
                  $$9 = dxn.a($$6, $$2, $$9);
               }

               return new dvs($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dvc a() {
      dvc $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5) {
      List<dvo> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dvc $$7 = $$6.get(0).f;
         gw $$8 = $$7.f();
         gw $$9 = new gw($$8.u(), $$7.h(), $$8.w());

         for (dvo $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public qy a(dwa $$0, cpe $$1) {
      qy $$2 = new qy();
      if (this.b()) {
         $$2.a("id", $$0.b().d(je.az).b(this.d).toString());
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

   public cpe c() {
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

   public dvk h() {
      return this.d;
   }

   public List<dvo> i() {
      return this.e.c();
   }
}
