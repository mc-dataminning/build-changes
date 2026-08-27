import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fow {
   private static final wi a = wi.c("selectWorld.newWorld");
   private final List<Consumer<fow>> b = new ArrayList<>();
   private String c = a.getString();
   private fow.a d = fow.a.a;
   private boc e = boc.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fov l;
   private fow.b m;
   private final List<fow.b> n = new ArrayList<>();
   private final List<fow.b> o = new ArrayList<>();
   private czc p = new czc();

   public fow(Path $$0, fov $$1, Optional<aju<eff>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fow.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fow> $$0) {
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

      for (Consumer<fow> $$2 : this.b) {
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

   public void a(fow.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fow.a d() {
      return this.l() ? fow.a.d : this.d;
   }

   public void a(boc $$0) {
      this.e = $$0;
      this.a();
   }

   public boc e() {
      return this.f() ? boc.d : this.e;
   }

   public boolean f() {
      return this.d() == fow.a.b;
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
         return this.f == null ? this.d() == fow.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dvy.a(this.h())));
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

   public void a(fov $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fov k() {
      return this.l;
   }

   public void a(fov.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(daa $$0) {
      daa $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fov(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fow.b $$0) {
      this.m = $$0;
      in<eff> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fow.b m() {
      return this.m;
   }

   @Nullable
   public fos n() {
      in<eff> $$0 = this.m().c();
      return $$0 != null ? fos.a.get($$0.e()) : null;
   }

   public List<fow.b> o() {
      return this.n;
   }

   public List<fow.b> p() {
      return this.o;
   }

   private void r() {
      ja<eff> $$0 = this.k().a().d(ku.aN);
      this.n.clear();
      this.n.addAll(a($$0, avx.a).orElseGet(() -> $$0.h().map(fow.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, avx.b).orElse(this.n));
      in<eff> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fow.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<in<eff>> a(fov $$0, Optional<aju<eff>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(ku.aN).b($$1x));
   }

   private static Optional<List<fow.b>> a(ja<eff> $$0, avt<eff> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fow.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(czc $$0) {
      this.p = $$0;
      this.a();
   }

   public czc q() {
      return this.p;
   }

   public static enum a {
      a("survival", czd.a),
      b("hardcore", czd.a),
      c("creative", czd.b),
      d("spectator", czd.d);

      public final czd e;
      public final wi f;
      private final wi g;

      private a(String $$0, czd $$1) {
         this.e = $$1;
         this.f = wi.c("selectWorld.gameMode." + $$0);
         this.g = wi.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wi a() {
         return this.g;
      }
   }

   public static record b(@Nullable in<eff> a) {
      private static final wi b = wi.c("generator.custom");

      public wi a() {
         return Optional.ofNullable(this.a).flatMap(in::e).map($$0 -> wi.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(in::e).filter($$0 -> $$0.equals(efg.d)).isPresent();
      }

      @Nullable
      public in<eff> c() {
         return this.a;
      }
   }
}
