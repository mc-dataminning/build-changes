import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsj {
   private static final wu a = wu.c("selectWorld.newWorld");
   private final List<Consumer<fsj>> b = new ArrayList<>();
   private String c = a.getString();
   private fsj.a d = fsj.a.a;
   private bqa e = bqa.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fsi l;
   private fsj.b m;
   private final List<fsj.b> n = new ArrayList<>();
   private final List<fsj.b> o = new ArrayList<>();
   private dbz p = new dbz();

   public fsj(Path $$0, fsi $$1, Optional<akj<eif>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fsj.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().c();
      this.i = $$1.c().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fsj> $$0) {
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

      for (Consumer<fsj> $$2 : this.b) {
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

   public void a(fsj.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fsj.a d() {
      return this.l() ? fsj.a.d : this.d;
   }

   public void a(bqa $$0) {
      this.e = $$0;
      this.a();
   }

   public bqa e() {
      return this.f() ? bqa.d : this.e;
   }

   public boolean f() {
      return this.d() == fsj.a.b;
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
         return this.f == null ? this.d() == fsj.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dyx.a(this.h())));
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

   public void a(fsi $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fsi k() {
      return this.l;
   }

   public void a(fsi.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dcy $$0) {
      dcy $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fsi(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fsj.b $$0) {
      this.m = $$0;
      jj<eif> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fsj.b m() {
      return this.m;
   }

   @Nullable
   public fsf n() {
      jj<eif> $$0 = this.m().c();
      return $$0 != null ? fsf.a.get($$0.e()) : null;
   }

   public List<fsj.b> o() {
      return this.n;
   }

   public List<fsj.b> p() {
      return this.o;
   }

   private void r() {
      jw<eif> $$0 = this.k().a().d(lr.aX);
      this.n.clear();
      this.n.addAll(a($$0, awo.a).orElseGet(() -> $$0.i().map(fsj.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, awo.b).orElse(this.n));
      jj<eif> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fsj.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<jj<eif>> a(fsi $$0, Optional<akj<eif>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(lr.aX).b($$1x));
   }

   private static Optional<List<fsj.b>> a(jw<eif> $$0, awk<eif> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fsj.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dbz $$0) {
      this.p = $$0;
      this.a();
   }

   public dbz q() {
      return this.p;
   }

   public static enum a {
      a("survival", dca.a),
      b("hardcore", dca.a),
      c("creative", dca.b),
      d("spectator", dca.d);

      public final dca e;
      public final wu f;
      private final wu g;

      private a(final String $$0, final dca $$1) {
         this.e = $$1;
         this.f = wu.c("selectWorld.gameMode." + $$0);
         this.g = wu.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wu a() {
         return this.g;
      }
   }

   public static record b(@Nullable jj<eif> a) {
      private static final wu b = wu.c("generator.custom");

      public wu a() {
         return Optional.ofNullable(this.a).flatMap(jj::e).map($$0 -> wu.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jj::e).filter($$0 -> $$0.equals(eig.d)).isPresent();
      }

      @Nullable
      public jj<eif> c() {
         return this.a;
      }
   }
}
