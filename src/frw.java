import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class frw {
   private static final xl a = xl.c("selectWorld.newWorld");
   private final List<Consumer<frw>> b = new ArrayList<>();
   private String c = a.getString();
   private frw.a d = frw.a.a;
   private bqm e = bqm.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private frv l;
   private frw.b m;
   private final List<frw.b> n = new ArrayList<>();
   private final List<frw.b> o = new ArrayList<>();
   private dbp p = new dbp();

   public frw(Path $$0, frv $$1, Optional<ala<ehu>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new frw.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<frw> $$0) {
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

      for (Consumer<frw> $$2 : this.b) {
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

   public void a(frw.a $$0) {
      this.d = $$0;
      this.a();
   }

   public frw.a d() {
      return this.l() ? frw.a.d : this.d;
   }

   public void a(bqm $$0) {
      this.e = $$0;
      this.a();
   }

   public bqm e() {
      return this.f() ? bqm.d : this.e;
   }

   public boolean f() {
      return this.d() == frw.a.b;
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
         return this.f == null ? this.d() == frw.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dyn.a(this.h())));
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

   public void a(frv $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public frv k() {
      return this.l;
   }

   public void a(frv.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dcn $$0) {
      dcn $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new frv(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(frw.b $$0) {
      this.m = $$0;
      ji<ehu> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public frw.b m() {
      return this.m;
   }

   @Nullable
   public frs n() {
      ji<ehu> $$0 = this.m().c();
      return $$0 != null ? frs.a.get($$0.e()) : null;
   }

   public List<frw.b> o() {
      return this.n;
   }

   public List<frw.b> p() {
      return this.o;
   }

   private void r() {
      jv<ehu> $$0 = this.k().a().d(lq.aQ);
      this.n.clear();
      this.n.addAll(a($$0, axf.a).orElseGet(() -> $$0.h().map(frw.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axf.b).orElse(this.n));
      ji<ehu> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(frw.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ji<ehu>> a(frv $$0, Optional<ala<ehu>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(lq.aQ).b($$1x));
   }

   private static Optional<List<frw.b>> a(jv<ehu> $$0, axb<ehu> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(frw.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dbp $$0) {
      this.p = $$0;
      this.a();
   }

   public dbp q() {
      return this.p;
   }

   public static enum a {
      a("survival", dbq.a),
      b("hardcore", dbq.a),
      c("creative", dbq.b),
      d("spectator", dbq.d);

      public final dbq e;
      public final xl f;
      private final xl g;

      private a(final String $$0, final dbq $$1) {
         this.e = $$1;
         this.f = xl.c("selectWorld.gameMode." + $$0);
         this.g = xl.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xl a() {
         return this.g;
      }
   }

   public static record b(@Nullable ji<ehu> a) {
      private static final xl b = xl.c("generator.custom");

      public xl a() {
         return Optional.ofNullable(this.a).flatMap(ji::e).map($$0 -> xl.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ji::e).filter($$0 -> $$0.equals(ehv.d)).isPresent();
      }

      @Nullable
      public ji<ehu> c() {
         return this.a;
      }
   }
}
