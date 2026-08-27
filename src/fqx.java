import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqx {
   private static final wx a = wx.c("selectWorld.newWorld");
   private final List<Consumer<fqx>> b = new ArrayList<>();
   private String c = a.getString();
   private fqx.a d = fqx.a.a;
   private bpt e = bpt.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fqw l;
   private fqx.b m;
   private final List<fqx.b> n = new ArrayList<>();
   private final List<fqx.b> o = new ArrayList<>();
   private dav p = new dav();

   public fqx(Path $$0, fqw $$1, Optional<akm<eha>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fqx.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fqx> $$0) {
      this.b.add($$0);
   }

   public void a() {
      boolean $$0 = this.j();
      if ($$0 != this.l.b().d()) {
         this.l = this.l.a($$1x -> $$1x.a($$0));
      }

      boolean $$1 = this.i();
      if ($$1 != this.l.b().c()) {
         this.l = this.l.a($$1x -> $$1x.b($$1));
      }

      for (Consumer<fqx> $$2 : this.b) {
         $$2.accept(this);
      }
   }

   public void a(String $$0) {
      this.c = $$0;
      this.k = this.c($$0);
      this.a();
   }

   private String c(String $$0) {
      String $$1 = $$0.trim();

      try {
         return v.a(this.j, !$$1.isEmpty() ? $$1 : a.getString(), "");
      } catch (Exception var5) {
         try {
            return v.a(this.j, "World", "");
         } catch (IOException var4) {
            throw new RuntimeException("Could not create save folder", var4);
         }
      }
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.k;
   }

   public void a(fqx.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fqx.a d() {
      return this.l() ? fqx.a.d : this.d;
   }

   public void a(bpt $$0) {
      this.e = $$0;
      this.a();
   }

   public bpt e() {
      return this.f() ? bpt.d : this.e;
   }

   public boolean f() {
      return this.d() == fqx.a.b;
   }

   public void a(boolean $$0) {
      this.f = $$0;
      this.a();
   }

   public boolean g() {
      if (this.l()) {
         return true;
      } else if (this.f()) {
         return false;
      } else {
         return this.f == null ? this.d() == fqx.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dxt.a(this.h())));
      this.a();
   }

   public String h() {
      return this.g;
   }

   public void b(boolean $$0) {
      this.h = $$0;
      this.a();
   }

   public boolean i() {
      return this.l() ? false : this.h;
   }

   public void c(boolean $$0) {
      this.i = $$0;
      this.a();
   }

   public boolean j() {
      return !this.l() && !this.f() ? this.i : false;
   }

   public void a(fqw $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fqw k() {
      return this.l;
   }

   public void a(fqw.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dbt $$0) {
      dbt $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fqw(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fqx.b $$0) {
      this.m = $$0;
      ix<eha> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fqx.b m() {
      return this.m;
   }

   @Nullable
   public fqt n() {
      ix<eha> $$0 = this.m().c();
      return $$0 != null ? fqt.a.get($$0.e()) : null;
   }

   public List<fqx.b> o() {
      return this.n;
   }

   public List<fqx.b> p() {
      return this.o;
   }

   private void r() {
      jk<eha> $$0 = this.k().a().d(lf.aQ);
      this.n.clear();
      this.n.addAll(a($$0, awq.a).orElseGet(() -> $$0.h().map(fqx.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, awq.b).orElse(this.n));
      ix<eha> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fqx.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ix<eha>> a(fqw $$0, Optional<akm<eha>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(lf.aQ).b($$1x));
   }

   private static Optional<List<fqx.b>> a(jk<eha> $$0, awm<eha> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fqx.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dav $$0) {
      this.p = $$0;
      this.a();
   }

   public dav q() {
      return this.p;
   }

   public static enum a {
      a("survival", daw.a),
      b("hardcore", daw.a),
      c("creative", daw.b),
      d("spectator", daw.d);

      public final daw e;
      public final wx f;
      private final wx g;

      private a(String $$0, daw $$1) {
         this.e = $$1;
         this.f = wx.c("selectWorld.gameMode." + $$0);
         this.g = wx.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wx a() {
         return this.g;
      }
   }

   public static record b(@Nullable ix<eha> a) {
      private static final wx b = wx.c("generator.custom");

      public wx a() {
         return Optional.ofNullable(this.a).flatMap(ix::e).map($$0 -> wx.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ix::e).filter($$0 -> $$0.equals(ehb.d)).isPresent();
      }

      @Nullable
      public ix<eha> c() {
         return this.a;
      }
   }
}
