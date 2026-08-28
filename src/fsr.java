import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsr {
   private static final wu a = wu.c("selectWorld.newWorld");
   private final List<Consumer<fsr>> b = new ArrayList<>();
   private String c = a.getString();
   private fsr.a d = fsr.a.a;
   private bqe e = bqe.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fsq l;
   private fsr.b m;
   private final List<fsr.b> n = new ArrayList<>();
   private final List<fsr.b> o = new ArrayList<>();
   private dcc p = new dcc();

   public fsr(Path $$0, fsq $$1, Optional<akj<eim>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fsr.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().c();
      this.i = $$1.c().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fsr> $$0) {
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

      for (Consumer<fsr> $$2 : this.b) {
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

   public void a(fsr.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fsr.a d() {
      return this.l() ? fsr.a.d : this.d;
   }

   public void a(bqe $$0) {
      this.e = $$0;
      this.a();
   }

   public bqe e() {
      return this.f() ? bqe.d : this.e;
   }

   public boolean f() {
      return this.d() == fsr.a.b;
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
         return this.f == null ? this.d() == fsr.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dze.a(this.h())));
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

   public void a(fsq $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fsq k() {
      return this.l;
   }

   public void a(fsq.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(ddb $$0) {
      ddb $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fsq(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fsr.b $$0) {
      this.m = $$0;
      jj<eim> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fsr.b m() {
      return this.m;
   }

   @Nullable
   public fsn n() {
      jj<eim> $$0 = this.m().c();
      return $$0 != null ? fsn.a.get($$0.e()) : null;
   }

   public List<fsr.b> o() {
      return this.n;
   }

   public List<fsr.b> p() {
      return this.o;
   }

   private void r() {
      jw<eim> $$0 = this.k().a().d(lr.aX);
      this.n.clear();
      this.n.addAll(a($$0, awq.a).orElseGet(() -> $$0.i().map(fsr.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, awq.b).orElse(this.n));
      jj<eim> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fsr.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<jj<eim>> a(fsq $$0, Optional<akj<eim>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(lr.aX).b($$1x));
   }

   private static Optional<List<fsr.b>> a(jw<eim> $$0, awm<eim> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fsr.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dcc $$0) {
      this.p = $$0;
      this.a();
   }

   public dcc q() {
      return this.p;
   }

   public static enum a {
      a("survival", dcd.a),
      b("hardcore", dcd.a),
      c("creative", dcd.b),
      d("spectator", dcd.d);

      public final dcd e;
      public final wu f;
      private final wu g;

      private a(final String $$0, final dcd $$1) {
         this.e = $$1;
         this.f = wu.c("selectWorld.gameMode." + $$0);
         this.g = wu.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wu a() {
         return this.g;
      }
   }

   public static record b(@Nullable jj<eim> a) {
      private static final wu b = wu.c("generator.custom");

      public wu a() {
         return Optional.ofNullable(this.a).flatMap(jj::e).map($$0 -> wu.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jj::e).filter($$0 -> $$0.equals(ein.d)).isPresent();
      }

      @Nullable
      public jj<eim> c() {
         return this.a;
      }
   }
}
