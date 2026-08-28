import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class erb {
   public static final String a = "INVALID";
   public static final erb b = new erb(null, new dic(0, 0), 0, new eri(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eqt d;
   private final eri e;
   private final dic f;
   private int g;
   @Nullable
   private volatile eql h;

   public erb(eqt $$0, dic $$1, int $$2, eri $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static erb a(erj $$0, tz $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jr<eqt> $$4 = $$0.b().f(mg.bd);
         eqt $$5 = $$4.a(alg.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dic $$6 = new dic($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            uf $$8 = $$1.c("Children", 10);

            try {
               eri $$9 = eri.a($$8, $$0);
               if ($$5 instanceof ete) {
                  $$9 = ete.a($$6, $$2, $$9);
               }

               return new erb($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eql a() {
      eql $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5) {
      List<eqx> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eql $$7 = $$6.get(0).f;
         iu $$8 = $$7.g();
         iu $$9 = new iu($$8.u(), $$7.i(), $$8.w());

         for (eqx $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tz a(erj $$0, dic $$1) {
      tz $$2 = new tz();
      if (this.b()) {
         $$2.a("id", $$0.b().f(mg.bd).b(this.d).toString());
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

   public dic c() {
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

   public eqt h() {
      return this.d;
   }

   public List<eqx> i() {
      return this.e.c();
   }
}
