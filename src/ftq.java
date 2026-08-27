import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ftq {
   private static final xe a = xe.c("selectWorld.newWorld");
   private final List<Consumer<ftq>> b = new ArrayList<>();
   private String c = a.getString();
   private ftq.a d = ftq.a.a;
   private bpx e = bpx.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private ftp l;
   private ftq.b m;
   private final List<ftq.b> n = new ArrayList<>();
   private final List<ftq.b> o = new ArrayList<>();
   private dbw p = new dbw();

   public ftq(Path $$0, ftp $$1, Optional<aks<eji>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new ftq.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = true;
      this.k = this.c(this.c);
   }

   public void a(Consumer<ftq> $$0) {
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

      for (Consumer<ftq> $$2 : this.b) {
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

   public void a(ftq.a $$0) {
      this.d = $$0;
      this.a();
   }

   public ftq.a d() {
      return this.l() ? ftq.a.d : this.d;
   }

   public void a(bpx $$0) {
      this.e = $$0;
      this.a();
   }

   public bpx e() {
      return this.f() ? bpx.d : this.e;
   }

   public boolean f() {
      return this.d() == ftq.a.b;
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
         return this.f == null ? this.d() == ftq.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dzs.a(this.h())));
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

   public void a(ftp $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public ftp k() {
      return this.l;
   }

   public void a(ftp.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dcu $$0) {
      dcu $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new ftp(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(ftq.b $$0) {
      this.m = $$0;
      ja<eji> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public ftq.b m() {
      return this.m;
   }

   @Nullable
   public ftm n() {
      ja<eji> $$0 = this.m().c();
      return $$0 != null ? ftm.a.get($$0.e()) : null;
   }

   public List<ftq.b> o() {
      return this.n;
   }

   public List<ftq.b> p() {
      return this.o;
   }

   private void r() {
      jn<eji> $$0 = this.k().a().d(li.aQ);
      this.n.clear();
      this.n.addAll(a($$0, awx.a).orElseGet(() -> $$0.h().map(ftq.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, awx.b).orElse(this.n));
      ja<eji> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(ftq.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ja<eji>> a(ftp $$0, Optional<aks<eji>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(li.aQ).b($$1x));
   }

   private static Optional<List<ftq.b>> a(jn<eji> $$0, awt<eji> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(ftq.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dbw $$0) {
      this.p = $$0;
      this.a();
   }

   public dbw q() {
      return this.p;
   }

   public static enum a {
      a("survival", dbx.a),
      b("hardcore", dbx.a),
      c("creative", dbx.b),
      d("spectator", dbx.d);

      public final dbx e;
      public final xe f;
      private final xe g;

      private a(String $$0, dbx $$1) {
         this.e = $$1;
         this.f = xe.c("selectWorld.gameMode." + $$0);
         this.g = xe.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xe a() {
         return this.g;
      }
   }

   public static record b(@Nullable ja<eji> a) {
      private static final xe b = xe.c("generator.custom");

      public xe a() {
         return Optional.ofNullable(this.a).flatMap(ja::e).map($$0 -> xe.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ja::e).filter($$0 -> $$0.equals(ejj.d)).isPresent();
      }

      @Nullable
      public ja<eji> c() {
         return this.a;
      }
   }
}
