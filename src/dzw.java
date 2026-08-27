import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dzw {
   public static final String a = "INVALID";
   public static final dzw b = new dzw(null, new cte(0, 0), 0, new ead(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final dzo d;
   private final ead e;
   private final cte f;
   private int g;
   @Nullable
   private volatile dzg h;

   public dzw(dzo $$0, cte $$1, int $$2, ead $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static dzw a(eae $$0, so $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         it<dzo> $$4 = $$0.b().d(ke.aD);
         dzo $$5 = $$4.a(new ahh($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            cte $$6 = new cte($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            su $$8 = $$1.c("Children", 10);

            try {
               ead $$9 = ead.a($$8, $$0);
               if ($$5 instanceof eby) {
                  $$9 = eby.a($$6, $$2, $$9);
               }

               return new dzw($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public dzg a() {
      dzg $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5) {
      List<dzs> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         dzg $$7 = $$6.get(0).f;
         hx $$8 = $$7.g();
         hx $$9 = new hx($$8.u(), $$7.i(), $$8.w());

         for (dzs $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public so a(eae $$0, cte $$1) {
      so $$2 = new so();
      if (this.b()) {
         $$2.a("id", $$0.b().d(ke.aD).b(this.d).toString());
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

   public cte c() {
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

   public dzo h() {
      return this.d;
   }

   public List<dzs> i() {
      return this.e.c();
   }
}
