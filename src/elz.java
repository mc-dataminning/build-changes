import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class elz {
   public static final String a = "INVALID";
   public static final elz b = new elz(null, new deb(0, 0), 0, new emg(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final elr d;
   private final emg e;
   private final deb f;
   private int g;
   @Nullable
   private volatile elj h;

   public elz(elr $$0, deb $$1, int $$2, emg $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static elz a(emh $$0, uj $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         kc<elr> $$4 = $$0.b().e(ly.aS);
         elr $$5 = $$4.a(alh.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            deb $$6 = new deb($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            up $$8 = $$1.c("Children", 10);

            try {
               emg $$9 = emg.a($$8, $$0);
               if ($$5 instanceof eoc) {
                  $$9 = eoc.a($$6, $$2, $$9);
               }

               return new elz($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public elj a() {
      elj $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5) {
      List<elv> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         elj $$7 = $$6.get(0).f;
         jg $$8 = $$7.g();
         jg $$9 = new jg($$8.u(), $$7.i(), $$8.w());

         for (elv $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public uj a(emh $$0, deb $$1) {
      uj $$2 = new uj();
      if (this.b()) {
         $$2.a("id", $$0.b().e(ly.aS).b(this.d).toString());
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

   public deb c() {
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

   public elr h() {
      return this.d;
   }

   public List<elv> i() {
      return this.e.c();
   }
}
