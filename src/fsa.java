import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsa {
   private static final xo a = xo.c("selectWorld.newWorld");
   private final List<Consumer<fsa>> b = new ArrayList<>();
   private String c = a.getString();
   private fsa.a d = fsa.a.a;
   private bqq e = bqq.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private frz l;
   private fsa.b m;
   private final List<fsa.b> n = new ArrayList<>();
   private final List<fsa.b> o = new ArrayList<>();
   private dbt p = new dbt();

   public fsa(Path $$0, frz $$1, Optional<ald<ehy>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fsa.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fsa> $$0) {
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

      for (Consumer<fsa> $$2 : this.b) {
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

   public void a(fsa.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fsa.a d() {
      return this.l() ? fsa.a.d : this.d;
   }

   public void a(bqq $$0) {
      this.e = $$0;
      this.a();
   }

   public bqq e() {
      return this.f() ? bqq.d : this.e;
   }

   public boolean f() {
      return this.d() == fsa.a.b;
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
         return this.f == null ? this.d() == fsa.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dyr.a(this.h())));
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

   public void a(frz $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public frz k() {
      return this.l;
   }

   public void a(frz.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dcr $$0) {
      dcr $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new frz(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fsa.b $$0) {
      this.m = $$0;
      ji<ehy> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fsa.b m() {
      return this.m;
   }

   @Nullable
   public frw n() {
      ji<ehy> $$0 = this.m().c();
      return $$0 != null ? frw.a.get($$0.e()) : null;
   }

   public List<fsa.b> o() {
      return this.n;
   }

   public List<fsa.b> p() {
      return this.o;
   }

   private void r() {
      jv<ehy> $$0 = this.k().a().d(lq.aQ);
      this.n.clear();
      this.n.addAll(a($$0, axi.a).orElseGet(() -> $$0.h().map(fsa.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axi.b).orElse(this.n));
      ji<ehy> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fsa.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ji<ehy>> a(frz $$0, Optional<ald<ehy>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(lq.aQ).b($$1x));
   }

   private static Optional<List<fsa.b>> a(jv<ehy> $$0, axe<ehy> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fsa.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dbt $$0) {
      this.p = $$0;
      this.a();
   }

   public dbt q() {
      return this.p;
   }

   public static enum a {
      a("survival", dbu.a),
      b("hardcore", dbu.a),
      c("creative", dbu.b),
      d("spectator", dbu.d);

      public final dbu e;
      public final xo f;
      private final xo g;

      private a(final String $$0, final dbu $$1) {
         this.e = $$1;
         this.f = xo.c("selectWorld.gameMode." + $$0);
         this.g = xo.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xo a() {
         return this.g;
      }
   }

   public static record b(@Nullable ji<ehy> a) {
      private static final xo b = xo.c("generator.custom");

      public xo a() {
         return Optional.ofNullable(this.a).flatMap(ji::e).map($$0 -> xo.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ji::e).filter($$0 -> $$0.equals(ehz.d)).isPresent();
      }

      @Nullable
      public ji<ehy> c() {
         return this.a;
      }
   }
}
