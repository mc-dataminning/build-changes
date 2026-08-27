import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqc {
   private static final wu a = wu.c("selectWorld.newWorld");
   private final List<Consumer<fqc>> b = new ArrayList<>();
   private String c = a.getString();
   private fqc.a d = fqc.a.a;
   private bpj e = bpj.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fqb l;
   private fqc.b m;
   private final List<fqc.b> n = new ArrayList<>();
   private final List<fqc.b> o = new ArrayList<>();
   private czz p = new czz();

   public fqc(Path $$0, fqb $$1, Optional<akg<ege>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fqc.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fqc> $$0) {
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

      for (Consumer<fqc> $$2 : this.b) {
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

   public void a(fqc.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fqc.a d() {
      return this.l() ? fqc.a.d : this.d;
   }

   public void a(bpj $$0) {
      this.e = $$0;
      this.a();
   }

   public bpj e() {
      return this.f() ? bpj.d : this.e;
   }

   public boolean f() {
      return this.d() == fqc.a.b;
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
         return this.f == null ? this.d() == fqc.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dwx.a(this.h())));
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

   public void a(fqb $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fqb k() {
      return this.l;
   }

   public void a(fqb.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dax $$0) {
      dax $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fqb(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fqc.b $$0) {
      this.m = $$0;
      iw<ege> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fqc.b m() {
      return this.m;
   }

   @Nullable
   public fpy n() {
      iw<ege> $$0 = this.m().c();
      return $$0 != null ? fpy.a.get($$0.e()) : null;
   }

   public List<fqc.b> o() {
      return this.n;
   }

   public List<fqc.b> p() {
      return this.o;
   }

   private void r() {
      jj<ege> $$0 = this.k().a().d(le.aQ);
      this.n.clear();
      this.n.addAll(a($$0, awk.a).orElseGet(() -> $$0.h().map(fqc.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, awk.b).orElse(this.n));
      iw<ege> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fqc.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<iw<ege>> a(fqb $$0, Optional<akg<ege>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(le.aQ).b($$1x));
   }

   private static Optional<List<fqc.b>> a(jj<ege> $$0, awg<ege> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fqc.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(czz $$0) {
      this.p = $$0;
      this.a();
   }

   public czz q() {
      return this.p;
   }

   public static enum a {
      a("survival", daa.a),
      b("hardcore", daa.a),
      c("creative", daa.b),
      d("spectator", daa.d);

      public final daa e;
      public final wu f;
      private final wu g;

      private a(String $$0, daa $$1) {
         this.e = $$1;
         this.f = wu.c("selectWorld.gameMode." + $$0);
         this.g = wu.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wu a() {
         return this.g;
      }
   }

   public static record b(@Nullable iw<ege> a) {
      private static final wu b = wu.c("generator.custom");

      public wu a() {
         return Optional.ofNullable(this.a).flatMap(iw::e).map($$0 -> wu.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(iw::e).filter($$0 -> $$0.equals(egf.d)).isPresent();
      }

      @Nullable
      public iw<ege> c() {
         return this.a;
      }
   }
}
