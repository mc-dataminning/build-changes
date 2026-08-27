import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dvh {
   public static final String a = "INVALID";
   public static final dvh b = new dvh(null, new cot(0, 0), 0, new dvo(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final duz d;
   private final dvo e;
   private final cot f;
   private int g;
   @Nullable
   private volatile dur h;

   public dvh(duz $$0, cot $$1, int $$2, dvo $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dvh a(dvp $$0, qr $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         hr<duz> $$4 = $$0.b().d(jc.az);
         duz $$5 = $$4.a(new aer($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cot $$6 = new cot($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            qx $$8 = $$1.c("Children", 10);

            try {
               dvo $$9 = dvo.a($$8, $$0);
               if ($$5 instanceof dxc) {
                  $$9 = dxc.a($$6, $$2, $$9);
               }

               return new dvh($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dur a() {
      dur $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5) {
      List<dvd> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dur $$7 = $$6.get(0).f;
         gu $$8 = $$7.f();
         gu $$9 = new gu($$8.u(), $$7.h(), $$8.w());

         for (dvd $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public qr a(dvp $$0, cot $$1) {
      qr $$2 = new qr();
      if (this.b()) {
         $$2.a("id", $$0.b().d(jc.az).b(this.d).toString());
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

   public cot c() {
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

   public duz h() {
      return this.d;
   }

   public List<dvd> i() {
      return this.e.c();
   }
}
