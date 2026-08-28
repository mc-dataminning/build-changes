import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eiq {
   public static final String a = "INVALID";
   public static final eiq b = new eiq(null, new dbd(0, 0), 0, new eix(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eii d;
   private final eix e;
   private final dbd f;
   private int g;
   @Nullable
   private volatile eia h;

   public eiq(eii $$0, dbd $$1, int $$2, eix $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eiq a(eiy $$0, ur $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jv<eii> $$4 = $$0.b().d(lq.aJ);
         eii $$5 = $$4.a(new ale($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dbd $$6 = new dbd($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ux $$8 = $$1.c("Children", 10);

            try {
               eix $$9 = eix.a($$8, $$0);
               if ($$5 instanceof eks) {
                  $$9 = eks.a($$6, $$2, $$9);
               }

               return new eiq($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eia a() {
      eia $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5) {
      List<eim> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eia $$7 = $$6.get(0).f;
         iz $$8 = $$7.g();
         iz $$9 = new iz($$8.u(), $$7.i(), $$8.w());

         for (eim $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ur a(eiy $$0, dbd $$1) {
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

   public dbd c() {
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

   public eii h() {
      return this.d;
   }

   public List<eim> i() {
      return this.e.c();
   }
}
