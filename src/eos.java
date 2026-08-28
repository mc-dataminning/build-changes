import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eos {
   public static final String a = "INVALID";
   public static final eos b = new eos(null, new dgo(0, 0), 0, new eoz(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eok d;
   private final eoz e;
   private final dgo f;
   private int g;
   @Nullable
   private volatile eoc h;

   public eos(eok $$0, dgo $$1, int $$2, eoz $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eos a(epa $$0, ux $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         kd<eok> $$4 = $$0.b().e(mb.aU);
         eok $$5 = $$4.a(alz.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dgo $$6 = new dgo($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            vd $$8 = $$1.c("Children", 10);

            try {
               eoz $$9 = eoz.a($$8, $$0);
               if ($$5 instanceof eqv) {
                  $$9 = eqv.a($$6, $$2, $$9);
               }

               return new eos($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eoc a() {
      eoc $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5) {
      List<eoo> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eoc $$7 = $$6.get(0).f;
         jh $$8 = $$7.g();
         jh $$9 = new jh($$8.u(), $$7.i(), $$8.w());

         for (eoo $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ux a(epa $$0, dgo $$1) {
      ux $$2 = new ux();
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

   public dgo c() {
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

   public eok h() {
      return this.d;
   }

   public List<eoo> i() {
      return this.e.c();
   }
}
