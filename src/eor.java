import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eor {
   public static final String a = "INVALID";
   public static final eor b = new eor(null, new dgg(0, 0), 0, new eoy(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eoj d;
   private final eoy e;
   private final dgg f;
   private int g;
   @Nullable
   private volatile eob h;

   public eor(eoj $$0, dgg $$1, int $$2, eoy $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eor a(eoz $$0, tq $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ke<eoj> $$4 = $$0.b().e(mc.aW);
         eoj $$5 = $$4.a(aku.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dgg $$6 = new dgg($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            tw $$8 = $$1.c("Children", 10);

            try {
               eoy $$9 = eoy.a($$8, $$0);
               if ($$5 instanceof equ) {
                  $$9 = equ.a($$6, $$2, $$9);
               }

               return new eor($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eob a() {
      eob $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5) {
      List<eon> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eob $$7 = $$6.get(0).f;
         ji $$8 = $$7.g();
         ji $$9 = new ji($$8.u(), $$7.i(), $$8.w());

         for (eon $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tq a(eoz $$0, dgg $$1) {
      tq $$2 = new tq();
      if (this.b()) {
         $$2.a("id", $$0.b().e(mc.aW).b(this.d).toString());
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

   public eoj h() {
      return this.d;
   }

   public List<eon> i() {
      return this.e.c();
   }
}
