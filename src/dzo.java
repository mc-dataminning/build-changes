import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dzo {
   public static final String a = "INVALID";
   public static final dzo b = new dzo(null, new csw(0, 0), 0, new dzv(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dzg d;
   private final dzv e;
   private final csw f;
   private int g;
   @Nullable
   private volatile dyy h;

   public dzo(dzg $$0, csw $$1, int $$2, dzv $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dzo a(dzw $$0, sn $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         it<dzg> $$4 = $$0.b().d(ke.aD);
         dzg $$5 = $$4.a(new ahg($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            csw $$6 = new csw($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            st $$8 = $$1.c("Children", 10);

            try {
               dzv $$9 = dzv.a($$8, $$0);
               if ($$5 instanceof ebq) {
                  $$9 = ebq.a($$6, $$2, $$9);
               }

               return new dzo($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dyy a() {
      dyy $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cuk $$0, cui $$1, dle $$2, auv $$3, dyy $$4, csw $$5) {
      List<dzk> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dyy $$7 = $$6.get(0).f;
         hx $$8 = $$7.g();
         hx $$9 = new hx($$8.u(), $$7.i(), $$8.w());

         for (dzk $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public sn a(dzw $$0, csw $$1) {
      sn $$2 = new sn();
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

   public csw c() {
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

   public dzg h() {
      return this.d;
   }

   public List<dzk> i() {
      return this.e.c();
   }
}
