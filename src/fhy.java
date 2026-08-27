import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fhy {
   private static final vf a = vf.c("selectWorld.newWorld");
   private final List<Consumer<fhy>> b = new ArrayList<>();
   private String c = a.getString();
   private fhy.a d = fhy.a.a;
   private bjx e = bjx.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fhx l;
   private fhy.b m;
   private final List<fhy.b> n = new ArrayList<>();
   private final List<fhy.b> o = new ArrayList<>();
   private ctk p = new ctk();

   public fhy(Path $$0, fhx $$1, Optional<ahf<dyu>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fhy.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fhy> $$0) {
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

      for (Consumer<fhy> $$2 : this.b) {
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

   public void a(fhy.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fhy.a d() {
      return this.l() ? fhy.a.d : this.d;
   }

   public void a(bjx $$0) {
      this.e = $$0;
      this.a();
   }

   public bjx e() {
      return this.f() ? bjx.d : this.e;
   }

   public boolean f() {
      return this.d() == fhy.a.b;
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
         return this.f == null ? this.d() == fhy.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dpn.a(this.h())));
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

   public void a(fhx $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fhx k() {
      return this.l;
   }

   public void a(fhx.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cui $$0) {
      cui $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fhx(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fhy.b $$0) {
      this.m = $$0;
      ih<dyu> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fhy.b m() {
      return this.m;
   }

   @Nullable
   public fhu n() {
      ih<dyu> $$0 = this.m().c();
      return $$0 != null ? fhu.a.get($$0.e()) : null;
   }

   public List<fhy.b> o() {
      return this.n;
   }

   public List<fhy.b> p() {
      return this.o;
   }

   private void r() {
      it<dyu> $$0 = this.k().a().d(ke.aK);
      this.n.clear();
      this.n.addAll(a($$0, asz.a).orElseGet(() -> $$0.h().map(fhy.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, asz.b).orElse(this.n));
      ih<dyu> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fhy.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ih<dyu>> a(fhx $$0, Optional<ahf<dyu>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(ke.aK).b($$1x));
   }

   private static Optional<List<fhy.b>> a(it<dyu> $$0, asv<dyu> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fhy.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(ctk $$0) {
      this.p = $$0;
      this.a();
   }

   public ctk q() {
      return this.p;
   }

   public static enum a {
      a("survival", ctl.a),
      b("hardcore", ctl.a),
      c("creative", ctl.b),
      d("spectator", ctl.d);

      public final ctl e;
      public final vf f;
      private final vf g;

      private a(String $$0, ctl $$1) {
         this.e = $$1;
         this.f = vf.c("selectWorld.gameMode." + $$0);
         this.g = vf.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public vf a() {
         return this.g;
      }
   }

   public static record b(@Nullable ih<dyu> a) {
      private static final vf b = vf.c("generator.custom");

      public vf a() {
         return Optional.ofNullable(this.a).flatMap(ih::e).map($$0 -> vf.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ih::e).filter($$0 -> $$0.equals(dyv.d)).isPresent();
      }

      @Nullable
      public ih<dyu> c() {
         return this.a;
      }
   }
}
