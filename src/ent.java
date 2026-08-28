import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class ent {
   public static final String a = "INVALID";
   public static final ent b = new ent(null, new dfn(0, 0), 0, new eoa(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final enl d;
   private final eoa e;
   private final dfn f;
   private int g;
   @Nullable
   private volatile end h;

   public ent(enl $$0, dfn $$1, int $$2, eoa $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static ent a(eob $$0, tq $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ke<enl> $$4 = $$0.b().e(mc.aU);
         enl $$5 = $$4.a(akv.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dfn $$6 = new dfn($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            tw $$8 = $$1.c("Children", 10);

            try {
               eoa $$9 = eoa.a($$8, $$0);
               if ($$5 instanceof epw) {
                  $$9 = epw.a($$6, $$2, $$9);
               }

               return new ent($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public end a() {
      end $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5) {
      List<enp> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         end $$7 = $$6.get(0).f;
         ji $$8 = $$7.g();
         ji $$9 = new ji($$8.u(), $$7.i(), $$8.w());

         for (enp $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tq a(eob $$0, dfn $$1) {
      tq $$2 = new tq();
      if (this.b()) {
         $$2.a("id", $$0.b().e(mc.aU).b(this.d).toString());
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

   public dfn c() {
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

   public enl h() {
      return this.d;
   }

   public List<enp> i() {
      return this.e.c();
   }
}
