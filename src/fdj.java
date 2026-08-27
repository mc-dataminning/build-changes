import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fdj {
   private static final tn a = tn.c("selectWorld.newWorld");
   private final List<Consumer<fdj>> b = new ArrayList<>();
   private String c = a.getString();
   private fdj.a d = fdj.a.a;
   private bgx e = bgx.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fdi l;
   private fdj.b m;
   private final List<fdj.b> n = new ArrayList<>();
   private final List<fdj.b> o = new ArrayList<>();
   private cpt p = new cpt();

   public fdj(Path $$0, fdi $$1, Optional<aex<duz>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fdj.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fdj> $$0) {
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

      for (Consumer<fdj> $$2 : this.b) {
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

   public void a(fdj.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fdj.a d() {
      return this.l() ? fdj.a.d : this.d;
   }

   public void a(bgx $$0) {
      this.e = $$0;
      this.a();
   }

   public bgx e() {
      return this.f() ? bgx.d : this.e;
   }

   public boolean f() {
      return this.d() == fdj.a.b;
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
         return this.f == null ? this.d() == fdj.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dls.a(this.h())));
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

   public void a(fdi $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fdi k() {
      return this.l;
   }

   public void a(fdi.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cqq $$0) {
      cqq $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fdi(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fdj.b $$0) {
      this.m = $$0;
      hg<duz> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fdj.b m() {
      return this.m;
   }

   @Nullable
   public fdf n() {
      hg<duz> $$0 = this.m().c();
      return $$0 != null ? fdf.a.get($$0.e()) : null;
   }

   public List<fdj.b> o() {
      return this.n;
   }

   public List<fdj.b> p() {
      return this.o;
   }

   private void r() {
      ht<duz> $$0 = this.k().a().d(je.aF);
      this.n.clear();
      this.n.addAll(a($$0, aqn.a).orElseGet(() -> $$0.h().map(fdj.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, aqn.b).orElse(this.n));
      hg<duz> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fdj.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<hg<duz>> a(fdi $$0, Optional<aex<duz>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(je.aF).b($$1x));
   }

   private static Optional<List<fdj.b>> a(ht<duz> $$0, aqj<duz> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fdj.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cpt $$0) {
      this.p = $$0;
      this.a();
   }

   public cpt q() {
      return this.p;
   }

   public static enum a {
      a("survival", cpu.a),
      b("hardcore", cpu.a),
      c("creative", cpu.b),
      d("spectator", cpu.d);

      public final cpu e;
      public final tn f;
      private final tn g;

      private a(String $$0, cpu $$1) {
         this.e = $$1;
         this.f = tn.c("selectWorld.gameMode." + $$0);
         this.g = tn.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public tn a() {
         return this.g;
      }
   }

   public static record b(@Nullable hg<duz> a) {
      private static final tn b = tn.c("generator.custom");

      public tn a() {
         return Optional.ofNullable(this.a).flatMap(hg::e).map($$0 -> tn.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(hg::e).filter($$0 -> $$0.equals(dva.d)).isPresent();
      }

      @Nullable
      public hg<duz> c() {
         return this.a;
      }
   }
}
