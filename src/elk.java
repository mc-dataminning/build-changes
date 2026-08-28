import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class elk {
   public static final String a = "INVALID";
   public static final elk b = new elk(null, new ddm(0, 0), 0, new elr(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final elc d;
   private final elr e;
   private final ddm f;
   private int g;
   @Nullable
   private volatile eku h;

   public elk(elc $$0, ddm $$1, int $$2, elr $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static elk a(els $$0, uf $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         ka<elc> $$4 = $$0.b().d(lv.aS);
         elc $$5 = $$4.a(alc.a($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            ddm $$6 = new ddm($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ul $$8 = $$1.c("Children", 10);

            try {
               elr $$9 = elr.a($$8, $$0);
               if ($$5 instanceof enn) {
                  $$9 = enn.a($$6, $$2, $$9);
               }

               return new elk($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eku a() {
      eku $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5) {
      List<elg> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eku $$7 = $$6.get(0).f;
         je $$8 = $$7.g();
         je $$9 = new je($$8.u(), $$7.i(), $$8.w());

         for (elg $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public uf a(els $$0, ddm $$1) {
      uf $$2 = new uf();
      if (this.b()) {
         $$2.a("id", $$0.b().d(lv.aS).b(this.d).toString());
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

   public ddm c() {
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

   public elc h() {
      return this.d;
   }

   public List<elg> i() {
      return this.e.c();
   }
}
