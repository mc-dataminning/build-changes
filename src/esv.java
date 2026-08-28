import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class esv {
   public static final String a = "INVALID";
   public static final esv b = new esv(null, new djo(0, 0), 0, new etc(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final esn d;
   private final etc e;
   private final djo f;
   private int g;
   @Nullable
   private volatile esf h;

   public esv(esn $$0, djo $$1, int $$2, etc $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static esv a(etd $$0, ua $$1, long $$2) {
      String $$3 = $$1.b("id", "");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jt<esn> $$4 = $$0.b().f(mi.be);
         esn $$5 = $$4.a(alr.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            djo $$6 = new djo($$1.b("ChunkX", 0), $$1.b("ChunkZ", 0));
            int $$7 = $$1.b("references", 0);
            ug $$8 = $$1.p("Children");

            try {
               etc $$9 = etc.a($$8, $$0);
               if ($$5 instanceof euy) {
                  $$9 = euy.a($$6, $$2, $$9);
               }

               return new esv($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public esf a() {
      esf $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5) {
      List<esr> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         esf $$7 = $$6.get(0).f;
         iw $$8 = $$7.g();
         iw $$9 = new iw($$8.u(), $$7.i(), $$8.w());

         for (esr $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ua a(etd $$0, djo $$1) {
      ua $$2 = new ua();
      if (this.b()) {
         $$2.a("id", $$0.b().f(mi.be).b(this.d).toString());
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

   public djo c() {
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

   public esn h() {
      return this.d;
   }

   public List<esr> i() {
      return this.e.c();
   }
}
