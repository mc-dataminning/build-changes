import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dzn {
   public static final String a = "INVALID";
   public static final dzn b = new dzn(null, new csv(0, 0), 0, new dzu(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dzf d;
   private final dzu e;
   private final csv f;
   private int g;
   @Nullable
   private volatile dyx h;

   public dzn(dzf $$0, csv $$1, int $$2, dzu $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dzn a(dzv $$0, sn $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         it<dzf> $$4 = $$0.b().d(ke.aD);
         dzf $$5 = $$4.a(new ahg($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            csv $$6 = new csv($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            st $$8 = $$1.c("Children", 10);

            try {
               dzu $$9 = dzu.a($$8, $$0);
               if ($$5 instanceof ebp) {
                  $$9 = ebp.a($$6, $$2, $$9);
               }

               return new dzn($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dyx a() {
      dyx $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cuj $$0, cuh $$1, dld $$2, auu $$3, dyx $$4, csv $$5) {
      List<dzj> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dyx $$7 = $$6.get(0).f;
         hx $$8 = $$7.g();
         hx $$9 = new hx($$8.u(), $$7.i(), $$8.w());

         for (dzj $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public sn a(dzv $$0, csv $$1) {
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

   public csv c() {
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

   public dzf h() {
      return this.d;
   }

   public List<dzj> i() {
      return this.e.c();
   }
}
