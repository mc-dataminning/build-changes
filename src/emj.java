import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class emj {
   public static final String a = "INVALID";
   public static final emj b = new emj(null, new del(0, 0), 0, new emq(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final emb d;
   private final emq e;
   private final del f;
   private int g;
   @Nullable
   private volatile elt h;

   public emj(emb $$0, del $$1, int $$2, emq $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static emj a(emr $$0, un $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         kd<emb> $$4 = $$0.b().e(ma.aS);
         emb $$5 = $$4.a(all.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            del $$6 = new del($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ut $$8 = $$1.c("Children", 10);

            try {
               emq $$9 = emq.a($$8, $$0);
               if ($$5 instanceof eom) {
                  $$9 = eom.a($$6, $$2, $$9);
               }

               return new emj($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public elt a() {
      elt $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5) {
      List<emf> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         elt $$7 = $$6.get(0).f;
         jh $$8 = $$7.g();
         jh $$9 = new jh($$8.u(), $$7.i(), $$8.w());

         for (emf $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public un a(emr $$0, del $$1) {
      un $$2 = new un();
      if (this.b()) {
         $$2.a("id", $$0.b().e(ma.aS).b(this.d).toString());
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

   public del c() {
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

   public emb h() {
      return this.d;
   }

   public List<emf> i() {
      return this.e.c();
   }
}
