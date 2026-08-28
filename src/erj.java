import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class erj {
   public static final String a = "INVALID";
   public static final erj b = new erj(null, new dih(0, 0), 0, new erq(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final erb d;
   private final erq e;
   private final dih f;
   private int g;
   @Nullable
   private volatile eqt h;

   public erj(erb $$0, dih $$1, int $$2, erq $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static erj a(err $$0, tz $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jr<erb> $$4 = $$0.b().f(mg.be);
         erb $$5 = $$4.a(alg.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dih $$6 = new dih($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            uf $$8 = $$1.c("Children", 10);

            try {
               erq $$9 = erq.a($$8, $$0);
               if ($$5 instanceof etm) {
                  $$9 = etm.a($$6, $$2, $$9);
               }

               return new erj($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eqt a() {
      eqt $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5) {
      List<erf> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eqt $$7 = $$6.get(0).f;
         iu $$8 = $$7.g();
         iu $$9 = new iu($$8.u(), $$7.i(), $$8.w());

         for (erf $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tz a(err $$0, dih $$1) {
      tz $$2 = new tz();
      if (this.b()) {
         $$2.a("id", $$0.b().f(mg.be).b(this.d).toString());
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

   public dih c() {
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

   public erb h() {
      return this.d;
   }

   public List<erf> i() {
      return this.e.c();
   }
}
