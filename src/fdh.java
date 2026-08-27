import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fdh {
   private static final tl a = tl.c("selectWorld.newWorld");
   private final List<Consumer<fdh>> b = new ArrayList<>();
   private String c = a.getString();
   private fdh.a d = fdh.a.a;
   private bgv e = bgv.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fdg l;
   private fdh.b m;
   private final List<fdh.b> n = new ArrayList<>();
   private final List<fdh.b> o = new ArrayList<>();
   private cpr p = new cpr();

   public fdh(Path $$0, fdg $$1, Optional<aev<dux>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fdh.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fdh> $$0) {
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

      for (Consumer<fdh> $$2 : this.b) {
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

   public void a(fdh.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fdh.a d() {
      return this.l() ? fdh.a.d : this.d;
   }

   public void a(bgv $$0) {
      this.e = $$0;
      this.a();
   }

   public bgv e() {
      return this.f() ? bgv.d : this.e;
   }

   public boolean f() {
      return this.d() == fdh.a.b;
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
         return this.f == null ? this.d() == fdh.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dlq.a(this.h())));
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

   public void a(fdg $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fdg k() {
      return this.l;
   }

   public void a(fdg.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cqo $$0) {
      cqo $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fdg(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fdh.b $$0) {
      this.m = $$0;
      he<dux> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fdh.b m() {
      return this.m;
   }

   @Nullable
   public fdd n() {
      he<dux> $$0 = this.m().c();
      return $$0 != null ? fdd.a.get($$0.e()) : null;
   }

   public List<fdh.b> o() {
      return this.n;
   }

   public List<fdh.b> p() {
      return this.o;
   }

   private void r() {
      hq<dux> $$0 = this.k().a().d(jc.aF);
      this.n.clear();
      this.n.addAll(a($$0, aql.a).orElseGet(() -> $$0.h().map(fdh.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, aql.b).orElse(this.n));
      he<dux> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fdh.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<he<dux>> a(fdg $$0, Optional<aev<dux>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(jc.aF).b($$1x));
   }

   private static Optional<List<fdh.b>> a(hq<dux> $$0, aqh<dux> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fdh.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cpr $$0) {
      this.p = $$0;
      this.a();
   }

   public cpr q() {
      return this.p;
   }

   public static enum a {
      a("survival", cps.a),
      b("hardcore", cps.a),
      c("creative", cps.b),
      d("spectator", cps.d);

      public final cps e;
      public final tl f;
      private final tl g;

      private a(String $$0, cps $$1) {
         this.e = $$1;
         this.f = tl.c("selectWorld.gameMode." + $$0);
         this.g = tl.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public tl a() {
         return this.g;
      }
   }

   public static record b(@Nullable he<dux> a) {
      private static final tl b = tl.c("generator.custom");

      public tl a() {
         return Optional.ofNullable(this.a).flatMap(he::e).map($$0 -> tl.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(he::e).filter($$0 -> $$0.equals(duy.d)).isPresent();
      }

      @Nullable
      public he<dux> c() {
         return this.a;
      }
   }
}
