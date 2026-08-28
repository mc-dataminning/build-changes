import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eje {
   public static final String a = "INVALID";
   public static final eje b = new eje(null, new dbm(0, 0), 0, new ejl(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eiw d;
   private final ejl e;
   private final dbm f;
   private int g;
   @Nullable
   private volatile eio h;

   public eje(eiw $$0, dbm $$1, int $$2, ejl $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eje a(ejm $$0, tx $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jw<eiw> $$4 = $$0.b().d(lr.aQ);
         eiw $$5 = $$4.a(new akk($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dbm $$6 = new dbm($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            ud $$8 = $$1.c("Children", 10);

            try {
               ejl $$9 = ejl.a($$8, $$0);
               if ($$5 instanceof elg) {
                  $$9 = elg.a($$6, $$2, $$9);
               }

               return new eje($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eio a() {
      eio $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5) {
      List<eja> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eio $$7 = $$6.get(0).f;
         ja $$8 = $$7.g();
         ja $$9 = new ja($$8.u(), $$7.i(), $$8.w());

         for (eja $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public tx a(ejm $$0, dbm $$1) {
      tx $$2 = new tx();
      if (this.b()) {
         $$2.a("id", $$0.b().d(lr.aQ).b(this.d).toString());
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

   public dbm c() {
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

   public eiw h() {
      return this.d;
   }

   public List<eja> i() {
      return this.e.c();
   }
}
