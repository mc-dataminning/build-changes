import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fme {
   private static final vu a = vu.c("selectWorld.newWorld");
   private final List<Consumer<fme>> b = new ArrayList<>();
   private String c = a.getString();
   private fme.a d = fme.a.a;
   private bmz e = bmz.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fmd l;
   private fme.b m;
   private final List<fme.b> n = new ArrayList<>();
   private final List<fme.b> o = new ArrayList<>();
   private cwv p = new cwv();

   public fme(Path $$0, fmd $$1, Optional<ajg<ecr>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fme.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fme> $$0) {
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

      for (Consumer<fme> $$2 : this.b) {
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

   public void a(fme.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fme.a d() {
      return this.l() ? fme.a.d : this.d;
   }

   public void a(bmz $$0) {
      this.e = $$0;
      this.a();
   }

   public bmz e() {
      return this.f() ? bmz.d : this.e;
   }

   public boolean f() {
      return this.d() == fme.a.b;
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
         return this.f == null ? this.d() == fme.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dtk.a(this.h())));
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

   public void a(fmd $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fmd k() {
      return this.l;
   }

   public void a(fmd.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cxt $$0) {
      cxt $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fmd(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fme.b $$0) {
      this.m = $$0;
      il<ecr> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fme.b m() {
      return this.m;
   }

   @Nullable
   public fma n() {
      il<ecr> $$0 = this.m().c();
      return $$0 != null ? fma.a.get($$0.e()) : null;
   }

   public List<fme.b> o() {
      return this.n;
   }

   public List<fme.b> p() {
      return this.o;
   }

   private void r() {
      iy<ecr> $$0 = this.k().a().d(kj.aL);
      this.n.clear();
      this.n.addAll(a($$0, avh.a).orElseGet(() -> $$0.h().map(fme.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, avh.b).orElse(this.n));
      il<ecr> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fme.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<il<ecr>> a(fmd $$0, Optional<ajg<ecr>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(kj.aL).b($$1x));
   }

   private static Optional<List<fme.b>> a(iy<ecr> $$0, avd<ecr> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fme.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cwv $$0) {
      this.p = $$0;
      this.a();
   }

   public cwv q() {
      return this.p;
   }

   public static enum a {
      a("survival", cww.a),
      b("hardcore", cww.a),
      c("creative", cww.b),
      d("spectator", cww.d);

      public final cww e;
      public final vu f;
      private final vu g;

      private a(String $$0, cww $$1) {
         this.e = $$1;
         this.f = vu.c("selectWorld.gameMode." + $$0);
         this.g = vu.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public vu a() {
         return this.g;
      }
   }

   public static record b(@Nullable il<ecr> a) {
      private static final vu b = vu.c("generator.custom");

      public vu a() {
         return Optional.ofNullable(this.a).flatMap(il::e).map($$0 -> vu.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(il::e).filter($$0 -> $$0.equals(ecs.d)).isPresent();
      }

      @Nullable
      public il<ecr> c() {
         return this.a;
      }
   }
}
