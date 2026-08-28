import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class env {
   public static final String a = "INVALID";
   public static final env b = new env(null, new dfp(0, 0), 0, new eoc(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final enn d;
   private final eoc e;
   private final dfp f;
   private int g;
   @Nullable
   private volatile enf h;

   public env(enn $$0, dfp $$1, int $$2, eoc $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static env a(eod $$0, tq $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ke<enn> $$4 = $$0.b().e(mc.aU);
         enn $$5 = $$4.a(akv.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dfp $$6 = new dfp($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            tw $$8 = $$1.c("Children", 10);

            try {
               eoc $$9 = eoc.a($$8, $$0);
               if ($$5 instanceof epy) {
                  $$9 = epy.a($$6, $$2, $$9);
               }

               return new env($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public enf a() {
      enf $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dhh $$0, dhf $$1, dyu $$2, azh $$3, enf $$4, dfp $$5) {
      List<enr> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         enf $$7 = $$6.get(0).f;
         ji $$8 = $$7.g();
         ji $$9 = new ji($$8.u(), $$7.i(), $$8.w());

         for (enr $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tq a(eod $$0, dfp $$1) {
      tq $$2 = new tq();
      if (this.b()) {
         $$2.a("id", $$0.b().e(mc.aU).b(this.d).toString());
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

   public dfp c() {
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

   public enn h() {
      return this.d;
   }

   public List<enr> i() {
      return this.e.c();
   }
}
