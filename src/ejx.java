import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class ejx {
   public static final String a = "INVALID";
   public static final ejx b = new ejx(null, new dcd(0, 0), 0, new eke(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final ejp d;
   private final eke e;
   private final dcd f;
   private int g;
   @Nullable
   private volatile ejh h;

   public ejx(ejp $$0, dcd $$1, int $$2, eke $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static ejx a(ekf $$0, ub $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jz<ejp> $$4 = $$0.b().d(lu.aR);
         ejp $$5 = $$4.a(akr.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dcd $$6 = new dcd($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            uh $$8 = $$1.c("Children", 10);

            try {
               eke $$9 = eke.a($$8, $$0);
               if ($$5 instanceof ema) {
                  $$9 = ema.a($$6, $$2, $$9);
               }

               return new ejx($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public ejh a() {
      ejh $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5) {
      List<ejt> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         ejh $$7 = $$6.get(0).f;
         jd $$8 = $$7.g();
         jd $$9 = new jd($$8.u(), $$7.i(), $$8.w());

         for (ejt $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ub a(ekf $$0, dcd $$1) {
      ub $$2 = new ub();
      if (this.b()) {
         $$2.a("id", $$0.b().d(lu.aR).b(this.d).toString());
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

   public dcd c() {
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

   public ejp h() {
      return this.d;
   }

   public List<ejt> i() {
      return this.e.c();
   }
}
