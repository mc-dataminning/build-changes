import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eco {
   public static final String a = "INVALID";
   public static final eco b = new eco(null, new cvl(0, 0), 0, new ecv(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final ecg d;
   private final ecv e;
   private final cvl f;
   private int g;
   @Nullable
   private volatile eby h;

   public eco(ecg $$0, cvl $$1, int $$2, ecv $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eco a(ecw $$0, sy $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ix<ecg> $$4 = $$0.b().d(ki.aE);
         ecg $$5 = $$4.a(new ajc($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cvl $$6 = new cvl($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            te $$8 = $$1.c("Children", 10);

            try {
               ecv $$9 = ecv.a($$8, $$0);
               if ($$5 instanceof eeq) {
                  $$9 = eeq.a($$6, $$2, $$9);
               }

               return new eco($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eby a() {
      eby $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5) {
      List<eck> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eby $$7 = $$6.get(0).f;
         ib $$8 = $$7.g();
         ib $$9 = new ib($$8.u(), $$7.i(), $$8.w());

         for (eck $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public sy a(ecw $$0, cvl $$1) {
      sy $$2 = new sy();
      if (this.b()) {
         $$2.a("id", $$0.b().d(ki.aE).b(this.d).toString());
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

   public cvl c() {
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

   public ecg h() {
      return this.d;
   }

   public List<eck> i() {
      return this.e.c();
   }
}
