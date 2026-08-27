import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class efp {
   public static final String a = "INVALID";
   public static final efp b = new efp(null, new cye(0, 0), 0, new efw(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final efh d;
   private final efw e;
   private final cye f;
   private int g;
   @Nullable
   private volatile eez h;

   public efp(efh $$0, cye $$1, int $$2, efw $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static efp a(efx $$0, tm $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         iy<efh> $$4 = $$0.b().d(ks.aF);
         efh $$5 = $$4.a(new ajt($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cye $$6 = new cye($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ts $$8 = $$1.c("Children", 10);

            try {
               efw $$9 = efw.a($$8, $$0);
               if ($$5 instanceof ehr) {
                  $$9 = ehr.a($$6, $$2, $$9);
               }

               return new efp($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eez a() {
      eez $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5) {
      List<efl> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eez $$7 = $$6.get(0).f;
         ib $$8 = $$7.g();
         ib $$9 = new ib($$8.u(), $$7.i(), $$8.w());

         for (efl $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tm a(efx $$0, cye $$1) {
      tm $$2 = new tm();
      if (this.b()) {
         $$2.a("id", $$0.b().d(ks.aF).b(this.d).toString());
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

   public cye c() {
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

   public efh h() {
      return this.d;
   }

   public List<efl> i() {
      return this.e.c();
   }
}
