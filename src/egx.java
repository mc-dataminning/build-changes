import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class egx {
   public static final String a = "INVALID";
   public static final egx b = new egx(null, new czk(0, 0), 0, new ehe(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final egp d;
   private final ehe e;
   private final czk f;
   private int g;
   @Nullable
   private volatile egh h;

   public egx(egp $$0, czk $$1, int $$2, ehe $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static egx a(ehf $$0, ua $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jj<egp> $$4 = $$0.b().d(le.aJ);
         egp $$5 = $$4.a(new akh($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            czk $$6 = new czk($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ug $$8 = $$1.c("Children", 10);

            try {
               ehe $$9 = ehe.a($$8, $$0);
               if ($$5 instanceof eiz) {
                  $$9 = eiz.a($$6, $$2, $$9);
               }

               return new egx($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public egh a() {
      egh $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5) {
      List<egt> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         egh $$7 = $$6.get(0).f;
         in $$8 = $$7.g();
         in $$9 = new in($$8.u(), $$7.i(), $$8.w());

         for (egt $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ua a(ehf $$0, czk $$1) {
      ua $$2 = new ua();
      if (this.b()) {
         $$2.a("id", $$0.b().d(le.aJ).b(this.d).toString());
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

   public czk c() {
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

   public egp h() {
      return this.d;
   }

   public List<egt> i() {
      return this.e.c();
   }
}
