import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dvk {
   public static final String a = "INVALID";
   public static final dvk b = new dvk(null, new cpi(0, 0), 0, new dvr(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dvc d;
   private final dvr e;
   private final cpi f;
   private int g;
   @Nullable
   private volatile duu h;

   public dvk(dvc $$0, cpi $$1, int $$2, dvr $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dvk a(dvs $$0, qw $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         hq<dvc> $$4 = $$0.b().d(jc.aA);
         dvc $$5 = $$4.a(new aez($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cpi $$6 = new cpi($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            rc $$8 = $$1.c("Children", 10);

            try {
               dvr $$9 = dvr.a($$8, $$0);
               if ($$5 instanceof dxf) {
                  $$9 = dxf.a($$6, $$2, $$9);
               }

               return new dvk($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public duu a() {
      duu $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5) {
      List<dvg> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         duu $$7 = $$6.get(0).f;
         gw $$8 = $$7.f();
         gw $$9 = new gw($$8.u(), $$7.h(), $$8.w());

         for (dvg $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public qw a(dvs $$0, cpi $$1) {
      qw $$2 = new qw();
      if (this.b()) {
         $$2.a("id", $$0.b().d(jc.aA).b(this.d).toString());
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

   public cpi c() {
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

   public dvc h() {
      return this.d;
   }

   public List<dvg> i() {
      return this.e.c();
   }
}
