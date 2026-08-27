import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class edk {
   public static final String a = "INVALID";
   public static final edk b = new edk(null, new cwg(0, 0), 0, new edr(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final edc d;
   private final edr e;
   private final cwg f;
   private int g;
   @Nullable
   private volatile ecu h;

   public edk(edc $$0, cwg $$1, int $$2, edr $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static edk a(eds $$0, ta $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         iy<edc> $$4 = $$0.b().d(kj.aE);
         edc $$5 = $$4.a(new ajh($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cwg $$6 = new cwg($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            tg $$8 = $$1.c("Children", 10);

            try {
               edr $$9 = edr.a($$8, $$0);
               if ($$5 instanceof efm) {
                  $$9 = efm.a($$6, $$2, $$9);
               }

               return new edk($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public ecu a() {
      ecu $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5) {
      List<edg> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         ecu $$7 = $$6.get(0).f;
         ib $$8 = $$7.g();
         ib $$9 = new ib($$8.u(), $$7.i(), $$8.w());

         for (edg $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ta a(eds $$0, cwg $$1) {
      ta $$2 = new ta();
      if (this.b()) {
         $$2.a("id", $$0.b().d(kj.aE).b(this.d).toString());
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

   public cwg c() {
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

   public edc h() {
      return this.d;
   }

   public List<edg> i() {
      return this.e.c();
   }
}
