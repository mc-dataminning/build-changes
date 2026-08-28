import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class erv {
   public static final String a = "INVALID";
   public static final erv b = new erv(null, new dir(0, 0), 0, new esc(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final ern d;
   private final esc e;
   private final dir f;
   private int g;
   @Nullable
   private volatile erf h;

   public erv(ern $$0, dir $$1, int $$2, esc $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static erv a(esd $$0, tz $$1, long $$2) {
      String $$3 = $$1.j("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         js<ern> $$4 = $$0.b().f(mh.be);
         ern $$5 = $$4.a(alg.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dir $$6 = new dir($$1.f("ChunkX"), $$1.f("ChunkZ"));
            int $$7 = $$1.f("references");
            uf $$8 = $$1.d("Children", 10);

            try {
               esc $$9 = esc.a($$8, $$0);
               if ($$5 instanceof ety) {
                  $$9 = ety.a($$6, $$2, $$9);
               }

               return new erv($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public erf a() {
      erf $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5) {
      List<err> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         erf $$7 = $$6.get(0).f;
         iv $$8 = $$7.g();
         iv $$9 = new iv($$8.u(), $$7.i(), $$8.w());

         for (err $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tz a(esd $$0, dir $$1) {
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

   public dir c() {
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

   public ern h() {
      return this.d;
   }

   public List<err> i() {
      return this.e.c();
   }
}
