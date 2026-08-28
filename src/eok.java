import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eok {
   public static final String a = "INVALID";
   public static final eok b = new eok(null, new dgg(0, 0), 0, new eor(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eoc d;
   private final eor e;
   private final dgg f;
   private int g;
   @Nullable
   private volatile enu h;

   public eok(eoc $$0, dgg $$1, int $$2, eor $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eok a(eos $$0, ux $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         kd<eoc> $$4 = $$0.b().e(mb.aT);
         eoc $$5 = $$4.a(alz.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dgg $$6 = new dgg($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            vd $$8 = $$1.c("Children", 10);

            try {
               eor $$9 = eor.a($$8, $$0);
               if ($$5 instanceof eqn) {
                  $$9 = eqn.a($$6, $$2, $$9);
               }

               return new eok($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public enu a() {
      enu $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dhy $$0, dhw $$1, dzj $$2, bam $$3, enu $$4, dgg $$5) {
      List<eog> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         enu $$7 = $$6.get(0).f;
         jh $$8 = $$7.g();
         jh $$9 = new jh($$8.u(), $$7.i(), $$8.w());

         for (eog $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ux a(eos $$0, dgg $$1) {
      ux $$2 = new ux();
      if (this.b()) {
         $$2.a("id", $$0.b().e(mb.aT).b(this.d).toString());
         $$2.a("ChunkX", $$1.g);
         $$2.a("ChunkZ", $$1.h);
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

   public dgg c() {
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

   public eoc h() {
      return this.d;
   }

   public List<eog> i() {
      return this.e.c();
   }
}
