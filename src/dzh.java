import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dzh {
   public static final String a = "INVALID";
   public static final dzh b = new dzh(null, new csp(0, 0), 0, new dzo(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dyz d;
   private final dzo e;
   private final csp f;
   private int g;
   @Nullable
   private volatile dyr h;

   public dzh(dyz $$0, csp $$1, int $$2, dzo $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dzh a(dzp $$0, sl $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         it<dyz> $$4 = $$0.b().d(ke.aD);
         dyz $$5 = $$4.a(new ahd($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            csp $$6 = new csp($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            sr $$8 = $$1.c("Children", 10);

            try {
               dzo $$9 = dzo.a($$8, $$0);
               if ($$5 instanceof ebj) {
                  $$9 = ebj.a($$6, $$2, $$9);
               }

               return new dzh($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dyr a() {
      dyr $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5) {
      List<dzd> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dyr $$7 = $$6.get(0).f;
         hx $$8 = $$7.g();
         hx $$9 = new hx($$8.u(), $$7.i(), $$8.w());

         for (dzd $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public sl a(dzp $$0, csp $$1) {
      sl $$2 = new sl();
      if (this.b()) {
         $$2.a("id", $$0.b().d(ke.aD).b(this.d).toString());
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

   public csp c() {
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

   public dyz h() {
      return this.d;
   }

   public List<dzd> i() {
      return this.e.c();
   }
}
