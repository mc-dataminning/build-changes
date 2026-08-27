import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dyw {
   public static final String a = "INVALID";
   public static final dyw b = new dyw(null, new csf(0, 0), 0, new dzd(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dyo d;
   private final dzd e;
   private final csf f;
   private int g;
   @Nullable
   private volatile dyg h;

   public dyw(dyo $$0, csf $$1, int $$2, dzd $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dyw a(dze $$0, sj $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ir<dyo> $$4 = $$0.b().d(kc.aC);
         dyo $$5 = $$4.a(new agt($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            csf $$6 = new csf($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            sp $$8 = $$1.c("Children", 10);

            try {
               dzd $$9 = dzd.a($$8, $$0);
               if ($$5 instanceof eay) {
                  $$9 = eay.a($$6, $$2, $$9);
               }

               return new dyw($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dyg a() {
      dyg $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5) {
      List<dys> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dyg $$7 = $$6.get(0).f;
         hv $$8 = $$7.g();
         hv $$9 = new hv($$8.u(), $$7.i(), $$8.w());

         for (dys $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public sj a(dze $$0, csf $$1) {
      sj $$2 = new sj();
      if (this.b()) {
         $$2.a("id", $$0.b().d(kc.aC).b(this.d).toString());
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

   public csf c() {
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

   public dyo h() {
      return this.d;
   }

   public List<dys> i() {
      return this.e.c();
   }
}
