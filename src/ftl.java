import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ftl {
   private static final wz a = wz.c("selectWorld.newWorld");
   private final List<Consumer<ftl>> b = new ArrayList<>();
   private String c = a.getString();
   private ftl.a d = ftl.a.a;
   private bqo e = bqo.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private ftk l;
   private ftl.b m;
   private final List<ftl.b> n = new ArrayList<>();
   private final List<ftl.b> o = new ArrayList<>();
   private dcs p = new dcs();

   public ftl(Path $$0, ftk $$1, Optional<akq<ejg>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new ftl.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().c();
      this.i = $$1.c().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<ftl> $$0) {
      this.b.add($$0);
   }

   public void a() {
      boolean $$0 = this.j();
      if ($$0 != this.l.c().d()) {
         this.l = this.l.a($$1x -> $$1x.a($$0));
      }

      boolean $$1 = this.i();
      if ($$1 != this.l.c().c()) {
         this.l = this.l.a($$1x -> $$1x.b($$1));
      }

      for (Consumer<ftl> $$2 : this.b) {
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

   public void a(ftl.a $$0) {
      this.d = $$0;
      this.a();
   }

   public ftl.a d() {
      return this.l() ? ftl.a.d : this.d;
   }

   public void a(bqo $$0) {
      this.e = $$0;
      this.a();
   }

   public bqo e() {
      return this.f() ? bqo.d : this.e;
   }

   public boolean f() {
      return this.d() == ftl.a.b;
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
         return this.f == null ? this.d() == ftl.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dzw.a(this.h())));
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

   public void a(ftk $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public ftk k() {
      return this.l;
   }

   public void a(ftk.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(ddr $$0) {
      ddr $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new ftk(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(ftl.b $$0) {
      this.m = $$0;
      jm<ejg> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public ftl.b m() {
      return this.m;
   }

   @Nullable
   public fth n() {
      jm<ejg> $$0 = this.m().c();
      return $$0 != null ? fth.a.get($$0.e()) : null;
   }

   public List<ftl.b> o() {
      return this.n;
   }

   public List<ftl.b> p() {
      return this.o;
   }

   private void r() {
      jz<ejg> $$0 = this.k().a().d(lu.aY);
      this.n.clear();
      this.n.addAll(a($$0, awy.a).orElseGet(() -> $$0.i().map(ftl.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, awy.b).orElse(this.n));
      jm<ejg> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(ftl.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<jm<ejg>> a(ftk $$0, Optional<akq<ejg>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(lu.aY).b($$1x));
   }

   private static Optional<List<ftl.b>> a(jz<ejg> $$0, awu<ejg> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(ftl.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dcs $$0) {
      this.p = $$0;
      this.a();
   }

   public dcs q() {
      return this.p;
   }

   public static enum a {
      a("survival", dct.a),
      b("hardcore", dct.a),
      c("creative", dct.b),
      d("spectator", dct.d);

      public final dct e;
      public final wz f;
      private final wz g;

      private a(final String $$0, final dct $$1) {
         this.e = $$1;
         this.f = wz.c("selectWorld.gameMode." + $$0);
         this.g = wz.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wz a() {
         return this.g;
      }
   }

   public static record b(@Nullable jm<ejg> a) {
      private static final wz b = wz.c("generator.custom");

      public wz a() {
         return Optional.ofNullable(this.a).flatMap(jm::e).map($$0 -> wz.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jm::e).filter($$0 -> $$0.equals(ejh.d)).isPresent();
      }

      @Nullable
      public jm<ejg> c() {
         return this.a;
      }
   }
}
