import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eol {
   public static final String a = "INVALID";
   public static final eol b = new eol(null, new dgf(0, 0), 0, new eos(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eod d;
   private final eos e;
   private final dgf f;
   private int g;
   @Nullable
   private volatile env h;

   public eol(eod $$0, dgf $$1, int $$2, eos $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eol a(eot $$0, um $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         kd<eod> $$4 = $$0.b().e(mb.aU);
         eod $$5 = $$4.a(alp.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dgf $$6 = new dgf($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            us $$8 = $$1.c("Children", 10);

            try {
               eos $$9 = eos.a($$8, $$0);
               if ($$5 instanceof eqo) {
                  $$9 = eqo.a($$6, $$2, $$9);
               }

               return new eol($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public env a() {
      env $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5) {
      List<eoh> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         env $$7 = $$6.get(0).f;
         jh $$8 = $$7.g();
         jh $$9 = new jh($$8.u(), $$7.i(), $$8.w());

         for (eoh $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public um a(eot $$0, dgf $$1) {
      um $$2 = new um();
      if (this.b()) {
         $$2.a("id", $$0.b().e(mb.aU).b(this.d).toString());
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

   public dgf c() {
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

   public eod h() {
      return this.d;
   }

   public List<eoh> i() {
      return this.e.c();
   }
}
