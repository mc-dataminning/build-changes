import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class epo {
   public static final String a = "INVALID";
   public static final epo b = new epo(null, new dgw(0, 0), 0, new epv(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final epg d;
   private final epv e;
   private final dgw f;
   private int g;
   @Nullable
   private volatile eoy h;

   public epo(epg $$0, dgw $$1, int $$2, epv $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static epo a(epw $$0, tw $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         kf<epg> $$4 = $$0.b().f(me.aZ);
         epg $$5 = $$4.a(ald.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dgw $$6 = new dgw($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            uc $$8 = $$1.c("Children", 10);

            try {
               epv $$9 = epv.a($$8, $$0);
               if ($$5 instanceof err) {
                  $$9 = err.a($$6, $$2, $$9);
               }

               return new epo($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eoy a() {
      eoy $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5) {
      List<epk> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eoy $$7 = $$6.get(0).f;
         jj $$8 = $$7.g();
         jj $$9 = new jj($$8.u(), $$7.i(), $$8.w());

         for (epk $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tw a(epw $$0, dgw $$1) {
      tw $$2 = new tw();
      if (this.b()) {
         $$2.a("id", $$0.b().f(me.aZ).b(this.d).toString());
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

   public dgw c() {
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

   public epg h() {
      return this.d;
   }

   public List<epk> i() {
      return this.e.c();
   }
}
