import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fmg {
   private static final vu a = vu.c("selectWorld.newWorld");
   private final List<Consumer<fmg>> b = new ArrayList<>();
   private String c = a.getString();
   private fmg.a d = fmg.a.a;
   private bna e = bna.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fmf l;
   private fmg.b m;
   private final List<fmg.b> n = new ArrayList<>();
   private final List<fmg.b> o = new ArrayList<>();
   private cwx p = new cwx();

   public fmg(Path $$0, fmf $$1, Optional<ajg<ect>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fmg.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fmg> $$0) {
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

      for (Consumer<fmg> $$2 : this.b) {
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

   public void a(fmg.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fmg.a d() {
      return this.l() ? fmg.a.d : this.d;
   }

   public void a(bna $$0) {
      this.e = $$0;
      this.a();
   }

   public bna e() {
      return this.f() ? bna.d : this.e;
   }

   public boolean f() {
      return this.d() == fmg.a.b;
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
         return this.f == null ? this.d() == fmg.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dtm.a(this.h())));
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

   public void a(fmf $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fmf k() {
      return this.l;
   }

   public void a(fmf.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cxv $$0) {
      cxv $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fmf(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fmg.b $$0) {
      this.m = $$0;
      il<ect> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fmg.b m() {
      return this.m;
   }

   @Nullable
   public fmc n() {
      il<ect> $$0 = this.m().c();
      return $$0 != null ? fmc.a.get($$0.e()) : null;
   }

   public List<fmg.b> o() {
      return this.n;
   }

   public List<fmg.b> p() {
      return this.o;
   }

   private void r() {
      iy<ect> $$0 = this.k().a().d(kj.aL);
      this.n.clear();
      this.n.addAll(a($$0, avh.a).orElseGet(() -> $$0.h().map(fmg.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, avh.b).orElse(this.n));
      il<ect> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fmg.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<il<ect>> a(fmf $$0, Optional<ajg<ect>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(kj.aL).b($$1x));
   }

   private static Optional<List<fmg.b>> a(iy<ect> $$0, avd<ect> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fmg.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cwx $$0) {
      this.p = $$0;
      this.a();
   }

   public cwx q() {
      return this.p;
   }

   public static enum a {
      a("survival", cwy.a),
      b("hardcore", cwy.a),
      c("creative", cwy.b),
      d("spectator", cwy.d);

      public final cwy e;
      public final vu f;
      private final vu g;

      private a(String $$0, cwy $$1) {
         this.e = $$1;
         this.f = vu.c("selectWorld.gameMode." + $$0);
         this.g = vu.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public vu a() {
         return this.g;
      }
   }

   public static record b(@Nullable il<ect> a) {
      private static final vu b = vu.c("generator.custom");

      public vu a() {
         return Optional.ofNullable(this.a).flatMap(il::e).map($$0 -> vu.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(il::e).filter($$0 -> $$0.equals(ecu.d)).isPresent();
      }

      @Nullable
      public il<ect> c() {
         return this.a;
      }
   }
}
