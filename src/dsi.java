import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dsi {
   public static final String a = "INVALID";
   public static final dsi b = new dsi(null, new clt(0, 0), 0, new dsp(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dsa d;
   private final dsp e;
   private final clt f;
   private int g;
   @Nullable
   private volatile drs h;

   public dsi(dsa $$0, clt $$1, int $$2, dsp $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dsi a(dsq $$0, qr $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         hr<dsa> $$4 = $$0.b().d(jc.az);
         dsa $$5 = $$4.a(new acq($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            clt $$6 = new clt($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            qx $$8 = $$1.c("Children", 10);

            try {
               dsp $$9 = dsp.a($$8, $$0);
               if ($$5 instanceof dud) {
                  $$9 = dud.a($$6, $$2, $$9);
               }

               return new dsi($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public drs a() {
      drs $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5) {
      List<dse> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         drs $$7 = $$6.get(0).f;
         gu $$8 = $$7.f();
         gu $$9 = new gu($$8.u(), $$7.h(), $$8.w());

         for (dse $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public qr a(dsq $$0, clt $$1) {
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

   public clt c() {
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

   public dsa h() {
      return this.d;
   }

   public List<dse> i() {
      return this.e.c();
   }
}
