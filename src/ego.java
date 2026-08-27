import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class ego {
   public static final String a = "INVALID";
   public static final ego b = new ego(null, new czb(0, 0), 0, new egv(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final egg d;
   private final egv e;
   private final czb f;
   private int g;
   @Nullable
   private volatile efy h;

   public ego(egg $$0, czb $$1, int $$2, egv $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static ego a(egw $$0, ty $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ji<egg> $$4 = $$0.b().d(ld.aI);
         egg $$5 = $$4.a(new akf($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            czb $$6 = new czb($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ue $$8 = $$1.c("Children", 10);

            try {
               egv $$9 = egv.a($$8, $$0);
               if ($$5 instanceof eiq) {
                  $$9 = eiq.a($$6, $$2, $$9);
               }

               return new ego($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public efy a() {
      efy $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5) {
      List<egk> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         efy $$7 = $$6.get(0).f;
         im $$8 = $$7.g();
         im $$9 = new im($$8.u(), $$7.i(), $$8.w());

         for (egk $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ty a(egw $$0, czb $$1) {
      ty $$2 = new ty();
      if (this.b()) {
         $$2.a("id", $$0.b().d(ld.aI).b(this.d).toString());
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

   public czb c() {
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

   public egg h() {
      return this.d;
   }

   public List<egk> i() {
      return this.e.c();
   }
}
