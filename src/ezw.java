import java.nio.file.Path;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ezw implements Comparable<ezw> {
   public static final xa a = xa.c("selectWorld.select");
   private final dkb b;
   private final ezx c;
   private final String d;
   private final boolean e;
   private final boolean f;
   private final boolean g;
   private final Path h;
   @Nullable
   private xa i;

   public ezw(dkb $$0, ezx $$1, String $$2, boolean $$3, boolean $$4, boolean $$5, Path $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.e = $$3;
   }

   public String a() {
      return this.d;
   }

   public String b() {
      return StringUtils.isEmpty(this.b.a()) ? this.d : this.b.a();
   }

   public Path c() {
      return this.h;
   }

   public boolean d() {
      return this.e;
   }

   public boolean e() {
      return this.g;
   }

   public long f() {
      return this.c.b();
   }

   public int a(ezw $$0) {
      if (this.f() < $$0.f()) {
         return 1;
      } else {
         return this.f() > $$0.f() ? -1 : this.d.compareTo($$0.d);
      }
   }

   public dkb g() {
      return this.b;
   }

   public dju h() {
      return this.b.b();
   }

   public boolean i() {
      return this.b.c();
   }

   public boolean j() {
      return this.b.e();
   }

   public xo k() {
      return ban.b(this.c.c()) ? xa.c("selectWorld.versionUnknown") : xa.b(this.c.c());
   }

   public ezx l() {
      return this.c;
   }

   public boolean m() {
      return this.o().a();
   }

   public boolean n() {
      return this.o() == ezw.a.b;
   }

   public ezw.a o() {
      ah $$0 = ac.b();
      int $$1 = $$0.d().c();
      int $$2 = this.c.d().c();
      if (!$$0.g() && $$2 < $$1) {
         return ezw.a.c;
      } else {
         return $$2 > $$1 ? ezw.a.b : ezw.a.a;
      }
   }

   public boolean p() {
      return this.f;
   }

   public boolean q() {
      return !this.p() && !this.d() ? !this.r() : true;
   }

   public boolean r() {
      return ac.b().d().a(this.c.d());
   }

   public xa s() {
      if (this.i == null) {
         this.i = this.z();
      }

      return this.i;
   }

   private xa z() {
      if (this.p()) {
         return xa.c("selectWorld.locked").a(o.m);
      } else if (this.d()) {
         return xa.c("selectWorld.conversion").a(o.m);
      } else if (!this.r()) {
         return xa.a("selectWorld.incompatible.info", this.k()).a(o.m);
      } else {
         xo $$0 = this.i() ? xa.i().b(xa.c("gameMode.hardcore").b(-65536)) : xa.c("gameMode." + this.h().b());
         if (this.j()) {
            $$0.f(", ").b(xa.c("selectWorld.commands"));
         }

         if (this.e()) {
            $$0.f(", ").b(xa.c("selectWorld.experimental").a(o.o));
         }

         xo $$1 = this.k();
         xo $$2 = xa.b(", ").b(xa.c("selectWorld.version")).b(wz.v);
         if (this.m()) {
            $$2.b($$1.a(this.n() ? o.m : o.u));
         } else {
            $$2.b($$1);
         }

         $$0.b($$2);
         return $$0;
      }
   }

   public xa t() {
      return a;
   }

   public boolean u() {
      return !this.q();
   }

   public boolean v() {
      return !this.d() && !this.p();
   }

   public boolean w() {
      return !this.q();
   }

   public boolean x() {
      return !this.q();
   }

   public boolean y() {
      return true;
   }

   public static enum a {
      a(false, false, ""),
      b(true, true, "downgrade"),
      c(true, false, "snapshot");

      private final boolean d;
      private final boolean e;
      private final String f;

      private a(final boolean $$0, final boolean $$1, final String $$2) {
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

   public static class b extends ezw {
      private static final xa b = xa.c("recover_world.warning").a($$0 -> $$0.a(-65536));
      private static final xa c = xa.c("recover_world.button");
      private final long d;

      public b(String $$0, Path $$1, long $$2) {
         super(null, null, $$0, false, false, false, $$1);
         this.d = $$2;
      }

      @Override
      public String b() {
         return this.a();
      }

      @Override
      public xa s() {
         return b;
      }

      @Override
      public long f() {
         return this.d;
      }

      @Override
      public boolean q() {
         return false;
      }

      @Override
      public xa t() {
         return c;
      }

      @Override
      public boolean u() {
         return true;
      }

      @Override
      public boolean v() {
         return false;
      }

      @Override
      public boolean w() {
         return false;
      }

      @Override
      public boolean x() {
         return false;
      }
   }

   public static class c extends ezw {
      private static final xa b = xa.c("symlink_warning.more_info");
      private static final xa c = xa.c("symlink_warning.title").b(-65536);

      public c(String $$0, Path $$1) {
         super(null, null, $$0, false, false, false, $$1);
      }

      @Override
      public String b() {
         return this.a();
      }

      @Override
      public xa s() {
         return c;
      }

      @Override
      public long f() {
         return -1L;
      }

      @Override
      public boolean q() {
         return false;
      }

      @Override
      public xa t() {
         return b;
      }

      @Override
      public boolean u() {
         return true;
      }

      @Override
      public boolean v() {
         return false;
      }

      @Override
      public boolean w() {
         return false;
      }

      @Override
      public boolean x() {
         return false;
      }
   }
}
