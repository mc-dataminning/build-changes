import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dvl {
   public static final String a = "INVALID";
   public static final dvl b = new dvl(null, new cox(0, 0), 0, new dvs(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dvd d;
   private final dvs e;
   private final cox f;
   private int g;
   @Nullable
   private volatile duv h;

   public dvl(dvd $$0, cox $$1, int $$2, dvs $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dvl a(dvt $$0, qu $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ht<dvd> $$4 = $$0.b().d(je.az);
         dvd $$5 = $$4.a(new aeu($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cox $$6 = new cox($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ra $$8 = $$1.c("Children", 10);

            try {
               dvs $$9 = dvs.a($$8, $$0);
               if ($$5 instanceof dxg) {
                  $$9 = dxg.a($$6, $$2, $$9);
               }

               return new dvl($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public duv a() {
      duv $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5) {
      List<dvh> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         duv $$7 = $$6.get(0).f;
         gw $$8 = $$7.f();
         gw $$9 = new gw($$8.u(), $$7.h(), $$8.w());

         for (dvh $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public qu a(dvt $$0, cox $$1) {
      qu $$2 = new qu();
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

   public cox c() {
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

   public dvd h() {
      return this.d;
   }

   public List<dvh> i() {
      return this.e.c();
   }
}
