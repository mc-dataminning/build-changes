import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ftf {
   private static final wy a = wy.c("selectWorld.newWorld");
   private final List<Consumer<ftf>> b = new ArrayList<>();
   private String c = a.getString();
   private ftf.a d = ftf.a.a;
   private bqn e = bqn.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fte l;
   private ftf.b m;
   private final List<ftf.b> n = new ArrayList<>();
   private final List<ftf.b> o = new ArrayList<>();
   private dcq p = new dcq();

   public ftf(Path $$0, fte $$1, Optional<akp<ejb>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new ftf.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().c();
      this.i = $$1.c().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<ftf> $$0) {
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

      for (Consumer<ftf> $$2 : this.b) {
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

   public void a(ftf.a $$0) {
      this.d = $$0;
      this.a();
   }

   public ftf.a d() {
      return this.l() ? ftf.a.d : this.d;
   }

   public void a(bqn $$0) {
      this.e = $$0;
      this.a();
   }

   public bqn e() {
      return this.f() ? bqn.d : this.e;
   }

   public boolean f() {
      return this.d() == ftf.a.b;
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
         return this.f == null ? this.d() == ftf.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dzt.a(this.h())));
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

   public void a(fte $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fte k() {
      return this.l;
   }

   public void a(fte.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(ddp $$0) {
      ddp $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fte(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(ftf.b $$0) {
      this.m = $$0;
      jm<ejb> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public ftf.b m() {
      return this.m;
   }

   @Nullable
   public ftb n() {
      jm<ejb> $$0 = this.m().c();
      return $$0 != null ? ftb.a.get($$0.e()) : null;
   }

   public List<ftf.b> o() {
      return this.n;
   }

   public List<ftf.b> p() {
      return this.o;
   }

   private void r() {
      jz<ejb> $$0 = this.k().a().d(lu.aY);
      this.n.clear();
      this.n.addAll(a($$0, awx.a).orElseGet(() -> $$0.i().map(ftf.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, awx.b).orElse(this.n));
      jm<ejb> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(ftf.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<jm<ejb>> a(fte $$0, Optional<akp<ejb>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(lu.aY).b($$1x));
   }

   private static Optional<List<ftf.b>> a(jz<ejb> $$0, awt<ejb> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(ftf.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dcq $$0) {
      this.p = $$0;
      this.a();
   }

   public dcq q() {
      return this.p;
   }

   public static enum a {
      a("survival", dcr.a),
      b("hardcore", dcr.a),
      c("creative", dcr.b),
      d("spectator", dcr.d);

      public final dcr e;
      public final wy f;
      private final wy g;

      private a(final String $$0, final dcr $$1) {
         this.e = $$1;
         this.f = wy.c("selectWorld.gameMode." + $$0);
         this.g = wy.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wy a() {
         return this.g;
      }
   }

   public static record b(@Nullable jm<ejb> a) {
      private static final wy b = wy.c("generator.custom");

      public wy a() {
         return Optional.ofNullable(this.a).flatMap(jm::e).map($$0 -> wy.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jm::e).filter($$0 -> $$0.equals(ejc.d)).isPresent();
      }

      @Nullable
      public jm<ejb> c() {
         return this.a;
      }
   }
}
