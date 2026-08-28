import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class ejz {
   public static final String a = "INVALID";
   public static final ejz b = new ejz(null, new dcd(0, 0), 0, new ekg(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final ejr d;
   private final ekg e;
   private final dcd f;
   private int g;
   @Nullable
   private volatile ejj h;

   public ejz(ejr $$0, dcd $$1, int $$2, ekg $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static ejz a(ekh $$0, ub $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jz<ejr> $$4 = $$0.b().d(lu.aR);
         ejr $$5 = $$4.a(akr.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dcd $$6 = new dcd($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            uh $$8 = $$1.c("Children", 10);

            try {
               ekg $$9 = ekg.a($$8, $$0);
               if ($$5 instanceof emc) {
                  $$9 = emc.a($$6, $$2, $$9);
               }

               return new ejz($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public ejj a() {
      ejj $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5) {
      List<ejv> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         ejj $$7 = $$6.get(0).f;
         jd $$8 = $$7.g();
         jd $$9 = new jd($$8.u(), $$7.i(), $$8.w());

         for (ejv $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public ub a(ekh $$0, dcd $$1) {
      ub $$2 = new ub();
      if (this.b()) {
         $$2.a("id", $$0.b().d(lu.aR).b(this.d).toString());
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

   public dcd c() {
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

   public ejr h() {
      return this.d;
   }

   public List<ejv> i() {
      return this.e.c();
   }
}
