import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eir {
   public static final String a = "INVALID";
   public static final eir b = new eir(null, new dbe(0, 0), 0, new eiy(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eij d;
   private final eiy e;
   private final dbe f;
   private int g;
   @Nullable
   private volatile eib h;

   public eir(eij $$0, dbe $$1, int $$2, eiy $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eir a(eiz $$0, ur $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jv<eij> $$4 = $$0.b().d(lq.aJ);
         eij $$5 = $$4.a(new ale($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dbe $$6 = new dbe($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ux $$8 = $$1.c("Children", 10);

            try {
               eiy $$9 = eiy.a($$8, $$0);
               if ($$5 instanceof ekt) {
                  $$9 = ekt.a($$6, $$2, $$9);
               }

               return new eir($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eib a() {
      eib $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dcs $$0, dcq $$1, dty $$2, azg $$3, eib $$4, dbe $$5) {
      List<ein> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eib $$7 = $$6.get(0).f;
         iz $$8 = $$7.g();
         iz $$9 = new iz($$8.u(), $$7.i(), $$8.w());

         for (ein $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ur a(eiz $$0, dbe $$1) {
      ur $$2 = new ur();
      if (this.b()) {
         $$2.a("id", $$0.b().d(lq.aJ).b(this.d).toString());
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

   public dbe c() {
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

   public eij h() {
      return this.d;
   }

   public List<ein> i() {
      return this.e.c();
   }
}
