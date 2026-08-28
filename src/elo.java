import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class elo {
   public static final String a = "INVALID";
   public static final elo b = new elo(null, new ddp(0, 0), 0, new elv(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final elg d;
   private final elv e;
   private final ddp f;
   private int g;
   @Nullable
   private volatile eky h;

   public elo(elg $$0, ddp $$1, int $$2, elv $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static elo a(elw $$0, ug $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         kb<elg> $$4 = $$0.b().e(lw.aT);
         elg $$5 = $$4.a(ale.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            ddp $$6 = new ddp($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            um $$8 = $$1.c("Children", 10);

            try {
               elv $$9 = elv.a($$8, $$0);
               if ($$5 instanceof enr) {
                  $$9 = enr.a($$6, $$2, $$9);
               }

               return new elo($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eky a() {
      eky $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5) {
      List<elk> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eky $$7 = $$6.get(0).f;
         jf $$8 = $$7.g();
         jf $$9 = new jf($$8.u(), $$7.i(), $$8.w());

         for (elk $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ug a(elw $$0, ddp $$1) {
      ug $$2 = new ug();
      if (this.b()) {
         $$2.a("id", $$0.b().e(lw.aT).b(this.d).toString());
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

   public ddp c() {
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

   public elg h() {
      return this.d;
   }

   public List<elk> i() {
      return this.e.c();
   }
}
