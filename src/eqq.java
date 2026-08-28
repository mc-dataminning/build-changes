import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eqq {
   public static final String a = "INVALID";
   public static final eqq b = new eqq(null, new dhw(0, 0), 0, new eqx(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eqi d;
   private final eqx e;
   private final dhw f;
   private int g;
   @Nullable
   private volatile eqa h;

   public eqq(eqi $$0, dhw $$1, int $$2, eqx $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eqq a(eqy $$0, tx $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jr<eqi> $$4 = $$0.b().f(mg.bc);
         eqi $$5 = $$4.a(ale.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dhw $$6 = new dhw($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ud $$8 = $$1.c("Children", 10);

            try {
               eqx $$9 = eqx.a($$8, $$0);
               if ($$5 instanceof est) {
                  $$9 = est.a($$6, $$2, $$9);
               }

               return new eqq($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eqa a() {
      eqa $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5) {
      List<eqm> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eqa $$7 = $$6.get(0).f;
         iu $$8 = $$7.g();
         iu $$9 = new iu($$8.u(), $$7.i(), $$8.w());

         for (eqm $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tx a(eqy $$0, dhw $$1) {
      tx $$2 = new tx();
      if (this.b()) {
         $$2.a("id", $$0.b().f(mg.bc).b(this.d).toString());
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

   public dhw c() {
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

   public eqi h() {
      return this.d;
   }

   public List<eqm> i() {
      return this.e.c();
   }
}
