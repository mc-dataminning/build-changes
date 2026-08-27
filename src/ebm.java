import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class ebm {
   public static final String a = "INVALID";
   public static final ebm b = new ebm(null, new cuu(0, 0), 0, new ebt(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final ebe d;
   private final ebt e;
   private final cuu f;
   private int g;
   @Nullable
   private volatile eaw h;

   public ebm(ebe $$0, cuu $$1, int $$2, ebt $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static ebm a(ebu $$0, sw $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         iv<ebe> $$4 = $$0.b().d(kg.aD);
         ebe $$5 = $$4.a(new aiy($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cuu $$6 = new cuu($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            tc $$8 = $$1.c("Children", 10);

            try {
               ebt $$9 = ebt.a($$8, $$0);
               if ($$5 instanceof edo) {
                  $$9 = edo.a($$6, $$2, $$9);
               }

               return new ebm($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eaw a() {
      eaw $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5) {
      List<ebi> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eaw $$7 = $$6.get(0).f;
         hz $$8 = $$7.g();
         hz $$9 = new hz($$8.u(), $$7.i(), $$8.w());

         for (ebi $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public sw a(ebu $$0, cuu $$1) {
      sw $$2 = new sw();
      if (this.b()) {
         $$2.a("id", $$0.b().d(kg.aD).b(this.d).toString());
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

   public cuu c() {
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

   public ebe h() {
      return this.d;
   }

   public List<ebi> i() {
      return this.e.c();
   }
}
