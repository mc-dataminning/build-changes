import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class esj {
   public static final String a = "INVALID";
   public static final esj b = new esj(null, new djc(0, 0), 0, new esq(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final esb d;
   private final esq e;
   private final djc f;
   private int g;
   @Nullable
   private volatile ert h;

   public esj(esb $$0, djc $$1, int $$2, esq $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static esj a(esr $$0, tz $$1, long $$2) {
      String $$3 = $$1.b("id", "");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         js<esb> $$4 = $$0.b().f(mh.be);
         esb $$5 = $$4.a(ali.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            djc $$6 = new djc($$1.b("ChunkX", 0), $$1.b("ChunkZ", 0));
            int $$7 = $$1.b("references", 0);
            uf $$8 = $$1.p("Children");

            try {
               esq $$9 = esq.a($$8, $$0);
               if ($$5 instanceof eum) {
                  $$9 = eum.a($$6, $$2, $$9);
               }

               return new esj($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public ert a() {
      ert $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5) {
      List<esf> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         ert $$7 = $$6.get(0).f;
         iv $$8 = $$7.g();
         iv $$9 = new iv($$8.u(), $$7.i(), $$8.w());

         for (esf $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tz a(esr $$0, djc $$1) {
      tz $$2 = new tz();
      if (this.b()) {
         $$2.a("id", $$0.b().f(mh.be).b(this.d).toString());
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

   public djc c() {
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

   public esb h() {
      return this.d;
   }

   public List<esf> i() {
      return this.e.c();
   }
}
