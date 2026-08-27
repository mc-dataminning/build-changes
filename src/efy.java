import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class efy {
   public static final String a = "INVALID";
   public static final efy b = new efy(null, new cyn(0, 0), 0, new egf(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final efq d;
   private final egf e;
   private final cyn f;
   private int g;
   @Nullable
   private volatile efi h;

   public efy(efq $$0, cyn $$1, int $$2, egf $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static efy a(egg $$0, to $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ja<efq> $$4 = $$0.b().d(ku.aG);
         efq $$5 = $$4.a(new ajv($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cyn $$6 = new cyn($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            tu $$8 = $$1.c("Children", 10);

            try {
               egf $$9 = egf.a($$8, $$0);
               if ($$5 instanceof eia) {
                  $$9 = eia.a($$6, $$2, $$9);
               }

               return new efy($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public efi a() {
      efi $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5) {
      List<efu> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         efi $$7 = $$6.get(0).f;
         id $$8 = $$7.g();
         id $$9 = new id($$8.u(), $$7.i(), $$8.w());

         for (efu $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public to a(egg $$0, cyn $$1) {
      to $$2 = new to();
      if (this.b()) {
         $$2.a("id", $$0.b().d(ku.aG).b(this.d).toString());
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

   public cyn c() {
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

   public efq h() {
      return this.d;
   }

   public List<efu> i() {
      return this.e.c();
   }
}
