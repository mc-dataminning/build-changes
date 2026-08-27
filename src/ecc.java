import java.nio.file.Path;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ecc implements Comparable<ecc> {
   private final cpu a;
   private final ecd b;
   private final String c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final Path g;
   @Nullable
   private ti h;

   public ecc(cpu $$0, ecd $$1, String $$2, boolean $$3, boolean $$4, boolean $$5, Path $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.d = $$3;
   }

   public String a() {
      return this.c;
   }

   public String b() {
      return StringUtils.isEmpty(this.a.a()) ? this.c : this.a.a();
   }

   public Path c() {
      return this.g;
   }

   public boolean d() {
      return this.d;
   }

   public boolean e() {
      return this.f;
   }

   public long f() {
      return this.b.b();
   }

   public int a(ecc $$0) {
      if (this.f() < $$0.f()) {
         return 1;
      } else {
         return this.f() > $$0.f() ? -1 : this.c.compareTo($$0.c);
      }
   }

   public cpu g() {
      return this.a;
   }

   public cpn h() {
      return this.a.b();
   }

   public boolean i() {
      return this.a.c();
   }

   public boolean j() {
      return this.a.e();
   }

   public tv k() {
      return asl.b(this.b.c()) ? ti.c("selectWorld.versionUnknown") : ti.b(this.b.c());
   }

   public ecd l() {
      return this.b;
   }

   public boolean m() {
      return this.n() || !aa.b().g() && !this.b.e() || this.o().a();
   }

   public boolean n() {
      return this.b.d().c() > aa.b().d().c();
   }

   public ecc.a o() {
      ad $$0 = aa.b();
      int $$1 = $$0.d().c();
      int $$2 = this.b.d().c();
      if (!$$0.g() && $$2 < $$1) {
         return ecc.a.c;
      } else {
         return $$2 > $$1 ? ecc.a.b : ecc.a.a;
      }
   }

   public boolean p() {
      return this.e;
   }

   public boolean q() {
      return !this.p() && !this.d() ? !this.r() : true;
   }

   public boolean r() {
      return aa.b().d().a(this.b.d());
   }

   public ti s() {
      if (this.h == null) {
         this.h = this.t();
      }

      return this.h;
   }

   private ti t() {
      if (this.p()) {
         return ti.c("selectWorld.locked").a(n.m);
      } else if (this.d()) {
         return ti.c("selectWorld.conversion").a(n.m);
      } else if (!this.r()) {
         return ti.c("selectWorld.incompatible_series").a(n.m);
      } else {
         tv $$0 = this.i() ? ti.h().b(ti.c("gameMode.hardcore").a($$0x -> $$0x.a(-65536))) : ti.c("gameMode." + this.h().b());
         if (this.j()) {
            $$0.f(", ").b(ti.c("selectWorld.cheats"));
         }

         if (this.e()) {
            $$0.f(", ").b(ti.c("selectWorld.experimental").a(n.o));
         }

         tv $$1 = this.k();
         tv $$2 = ti.b(", ").b(ti.c("selectWorld.version")).b(th.u);
         if (this.m()) {
            $$2.b($$1.a(this.n() ? n.m : n.u));
         } else {
            $$2.b($$1);
         }

         $$0.b($$2);
         return $$0;
      }
   }

   public static enum a {
      a(false, false, ""),
      b(true, true, "downgrade"),
      c(true, false, "snapshot");

      private final boolean d;
      private final boolean e;
      private final String f;

      private a(boolean $$0, boolean $$1, String $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public boolean a() {
         return this.d;
      }

      public boolean b() {
         return this.e;
      }

      public String c() {
         return this.f;
      }
   }

   public static class b extends ecc {
      public b(String $$0, Path $$1) {
         super(null, null, $$0, false, false, false, $$1);
      }

      @Override
      public String b() {
         return this.a();
      }

      @Override
      public ti s() {
         return ti.c("symlink_warning.title").a($$0 -> $$0.a(-65536));
      }

      @Override
      public long f() {
         return -1L;
      }

      @Override
      public boolean q() {
         return false;
      }
   }
}
