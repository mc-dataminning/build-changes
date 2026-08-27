import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dxp {
   public static final String a = "INVALID";
   public static final dxp b = new dxp(null, new crh(0, 0), 0, new dxw(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dxh d;
   private final dxw e;
   private final crh f;
   private int g;
   @Nullable
   private volatile dwz h;

   public dxp(dxh $$0, crh $$1, int $$2, dxw $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dxp a(dxx $$0, rz $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         io<dxh> $$4 = $$0.b().d(jz.aB);
         dxh $$5 = $$4.a(new agi($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            crh $$6 = new crh($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            sf $$8 = $$1.c("Children", 10);

            try {
               dxw $$9 = dxw.a($$8, $$0);
               if ($$5 instanceof dzr) {
                  $$9 = dzr.a($$6, $$2, $$9);
               }

               return new dxp($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dwz a() {
      dwz $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5) {
      List<dxl> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dwz $$7 = $$6.get(0).f;
         ht $$8 = $$7.f();
         ht $$9 = new ht($$8.u(), $$7.h(), $$8.w());

         for (dxl $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public rz a(dxx $$0, crh $$1) {
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

   public crh c() {
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

   public dxh h() {
      return this.d;
   }

   public List<dxl> i() {
      return this.e.c();
   }
}
