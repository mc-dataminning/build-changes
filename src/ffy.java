import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ffy {
   private static final uv a = uv.c("selectWorld.newWorld");
   private final List<Consumer<ffy>> b = new ArrayList<>();
   private String c = a.getString();
   private ffy.a d = ffy.a.a;
   private biy e = biy.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private ffx l;
   private ffy.b m;
   private final List<ffy.b> n = new ArrayList<>();
   private final List<ffy.b> o = new ArrayList<>();
   private csb p = new csb();

   public ffy(Path $$0, ffx $$1, Optional<agl<dxb>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new ffy.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<ffy> $$0) {
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

      for (Consumer<ffy> $$2 : this.b) {
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

   public void a(ffy.a $$0) {
      this.d = $$0;
      this.a();
   }

   public ffy.a d() {
      return this.l() ? ffy.a.d : this.d;
   }

   public void a(biy $$0) {
      this.e = $$0;
      this.a();
   }

   public biy e() {
      return this.f() ? biy.d : this.e;
   }

   public boolean f() {
      return this.d() == ffy.a.b;
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
         return this.f == null ? this.d() == ffy.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dnu.a(this.h())));
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

   public void a(ffx $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public ffx k() {
      return this.l;
   }

   public void a(ffx.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(csy $$0) {
      csy $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new ffx(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(ffy.b $$0) {
      this.m = $$0;
      ig<dxb> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public ffy.b m() {
      return this.m;
   }

   @Nullable
   public ffu n() {
      ig<dxb> $$0 = this.m().c();
      return $$0 != null ? ffu.a.get($$0.e()) : null;
   }

   public List<ffy.b> o() {
      return this.n;
   }

   public List<ffy.b> p() {
      return this.o;
   }

   private void r() {
      is<dxb> $$0 = this.k().a().d(kd.aH);
      this.n.clear();
      this.n.addAll(a($$0, asd.a).orElseGet(() -> $$0.h().map(ffy.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, asd.b).orElse(this.n));
      ig<dxb> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(ffy.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ig<dxb>> a(ffx $$0, Optional<agl<dxb>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(kd.aH).b($$1x));
   }

   private static Optional<List<ffy.b>> a(is<dxb> $$0, arz<dxb> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(ffy.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(csb $$0) {
      this.p = $$0;
      this.a();
   }

   public csb q() {
      return this.p;
   }

   public static enum a {
      a("survival", csc.a),
      b("hardcore", csc.a),
      c("creative", csc.b),
      d("spectator", csc.d);

      public final csc e;
      public final uv f;
      private final uv g;

      private a(String $$0, csc $$1) {
         this.e = $$1;
         this.f = uv.c("selectWorld.gameMode." + $$0);
         this.g = uv.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public uv a() {
         return this.g;
      }
   }

   public static record b(@Nullable ig<dxb> a) {
      private static final uv b = uv.c("generator.custom");

      public uv a() {
         return Optional.ofNullable(this.a).flatMap(ig::e).map($$0 -> uv.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ig::e).filter($$0 -> $$0.equals(dxc.d)).isPresent();
      }

      @Nullable
      public ig<dxb> c() {
         return this.a;
      }
   }
}
