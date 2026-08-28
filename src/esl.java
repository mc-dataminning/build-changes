import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class esl {
   public static final String a = "INVALID";
   public static final esl b = new esl(null, new dje(0, 0), 0, new ess(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final esd d;
   private final ess e;
   private final dje f;
   private int g;
   @Nullable
   private volatile erv h;

   public esl(esd $$0, dje $$1, int $$2, ess $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static esl a(est $$0, ua $$1, long $$2) {
      String $$3 = $$1.b("id", "");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jt<esd> $$4 = $$0.b().f(mi.be);
         esd $$5 = $$4.a(alk.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dje $$6 = new dje($$1.b("ChunkX", 0), $$1.b("ChunkZ", 0));
            int $$7 = $$1.b("references", 0);
            ug $$8 = $$1.p("Children");

            try {
               ess $$9 = ess.a($$8, $$0);
               if ($$5 instanceof euo) {
                  $$9 = euo.a($$6, $$2, $$9);
               }

               return new esl($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public erv a() {
      erv $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5) {
      List<esh> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         erv $$7 = $$6.get(0).f;
         iw $$8 = $$7.g();
         iw $$9 = new iw($$8.u(), $$7.i(), $$8.w());

         for (esh $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ua a(est $$0, dje $$1) {
      ua $$2 = new ua();
      if (this.b()) {
         $$2.a("id", $$0.b().f(mi.be).b(this.d).toString());
         $$2.a("ChunkX", $$1.h);
         $$2.a("ChunkZ", $$1.i);
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

   public dje c() {
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

   public esd h() {
      return this.d;
   }

   public List<esh> i() {
      return this.e.c();
   }
}
