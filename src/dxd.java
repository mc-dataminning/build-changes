import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dxd {
   public static final String a = "INVALID";
   public static final dxd b = new dxd(null, new cqz(0, 0), 0, new dxk(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dwv d;
   private final dxk e;
   private final cqz f;
   private int g;
   @Nullable
   private volatile dwn h;

   public dxd(dwv $$0, cqz $$1, int $$2, dxk $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dxd a(dxl $$0, rz $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         io<dwv> $$4 = $$0.b().d(jz.aB);
         dwv $$5 = $$4.a(new agg($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cqz $$6 = new cqz($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            sf $$8 = $$1.c("Children", 10);

            try {
               dxk $$9 = dxk.a($$8, $$0);
               if ($$5 instanceof dzf) {
                  $$9 = dzf.a($$6, $$2, $$9);
               }

               return new dxd($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dwn a() {
      dwn $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5) {
      List<dwz> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dwn $$7 = $$6.get(0).f;
         ht $$8 = $$7.f();
         ht $$9 = new ht($$8.u(), $$7.h(), $$8.w());

         for (dwz $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public rz a(dxl $$0, cqz $$1) {
      rz $$2 = new rz();
      if (this.b()) {
         $$2.a("id", $$0.b().d(jz.aB).b(this.d).toString());
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

   public cqz c() {
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

   public dwv h() {
      return this.d;
   }

   public List<dwz> i() {
      return this.e.c();
   }
}
