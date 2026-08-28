import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class eit {
   public static final String a = "INVALID";
   public static final eit b = new eit(null, new dbg(0, 0), 0, new eja(List.of()));
   private static final Logger c = LogUtils.getLogger();
   private final eil d;
   private final eja e;
   private final dbg f;
   private int g;
   @Nullable
   private volatile eid h;

   public eit(eil $$0, dbg $$1, int $$2, eja $$3) {
      this.d = $$0;
      this.f = $$1;
      this.g = $$2;
      this.e = $$3;
   }

   @Nullable
   public static eit a(ejb $$0, us $$1, long $$2) {
      String $$3 = $$1.l("id");
      if ("INVALID".equals($$3)) {
         return b;
      } else {
         jv<eil> $$4 = $$0.b().d(lq.aJ);
         eil $$5 = $$4.a(new alf($$3));
         if ($$5 == null) {
            c.error("Unknown stucture id: {}", $$3);
            return null;
         } else {
            dbg $$6 = new dbg($$1.h("ChunkX"), $$1.h("ChunkZ"));
            int $$7 = $$1.h("references");
            uy $$8 = $$1.c("Children", 10);

            try {
               eja $$9 = eja.a($$8, $$0);
               if ($$5 instanceof ekv) {
                  $$9 = ekv.a($$6, $$2, $$9);
               }

               return new eit($$5, $$6, $$7, $$9);
            } catch (Exception var11) {
               c.error("Failed Start with id {}", $$3, var11);
               return null;
            }
         }
      }
   }

   public eid a() {
      eid $$0 = this.h;
      if ($$0 == null) {
         $$0 = this.d.a(this.e.b());
         this.h = $$0;
      }

      return $$0;
   }

   public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5) {
      List<eip> $$6 = this.e.c();
      if (!$$6.isEmpty()) {
         eid $$7 = $$6.get(0).f;
         iz $$8 = $$7.g();
         iz $$9 = new iz($$8.u(), $$7.i(), $$8.w());

         for (eip $$10 : $$6) {
            if ($$10.f().a($$4)) {
               $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
            }
         }

         this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
      }
   }

   public us a(ejb $$0, dbg $$1) {
      us $$2 = new us();
      if (this.b()) {
         $$2.a("id", $$0.b().d(lq.aJ).b(this.d).toString());
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

   public dbg c() {
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

   public eil h() {
      return this.d;
   }

   public List<eip> i() {
      return this.e.c();
   }
}
