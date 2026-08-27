import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dvq {
   public static final String a = "INVALID";
   public static final dvq b = new dvq(null, new cpc(0, 0), 0, new dvx(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dvi d;
   private final dvx e;
   private final cpc f;
   private int g;
   @Nullable
   private volatile dva h;

   public dvq(dvi $$0, cpc $$1, int $$2, dvx $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dvq a(dvy $$0, qy $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ht<dvi> $$4 = $$0.b().d(je.az);
         dvi $$5 = $$4.a(new aex($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cpc $$6 = new cpc($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            re $$8 = $$1.c("Children", 10);

            try {
               dvx $$9 = dvx.a($$8, $$0);
               if ($$5 instanceof dxl) {
                  $$9 = dxl.a($$6, $$2, $$9);
               }

               return new dvq($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dva a() {
      dva $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5) {
      List<dvm> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dva $$7 = $$6.get(0).f;
         gw $$8 = $$7.f();
         gw $$9 = new gw($$8.u(), $$7.h(), $$8.w());

         for (dvm $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public qy a(dvy $$0, cpc $$1) {
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

   public cpc c() {
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

   public dvi h() {
      return this.d;
   }

   public List<dvm> i() {
      return this.e.c();
   }
}
