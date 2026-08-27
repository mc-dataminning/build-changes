import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fft {
   private static final ur a = ur.c("selectWorld.newWorld");
   private final List<Consumer<fft>> b = new ArrayList<>();
   private String c = a.getString();
   private fft.a d = fft.a.a;
   private biu e = biu.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private ffs l;
   private fft.b m;
   private final List<fft.b> n = new ArrayList<>();
   private final List<fft.b> o = new ArrayList<>();
   private crw p = new crw();

   public fft(Path $$0, ffs $$1, Optional<agh<dww>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fft.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fft> $$0) {
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

      for (Consumer<fft> $$2 : this.b) {
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

   public void a(fft.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fft.a d() {
      return this.l() ? fft.a.d : this.d;
   }

   public void a(biu $$0) {
      this.e = $$0;
      this.a();
   }

   public biu e() {
      return this.f() ? biu.d : this.e;
   }

   public boolean f() {
      return this.d() == fft.a.b;
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
         return this.f == null ? this.d() == fft.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dnp.a(this.h())));
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

   public void a(ffs $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public ffs k() {
      return this.l;
   }

   public void a(ffs.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cst $$0) {
      cst $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new ffs(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fft.b $$0) {
      this.m = $$0;
      ib<dww> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fft.b m() {
      return this.m;
   }

   @Nullable
   public ffp n() {
      ib<dww> $$0 = this.m().c();
      return $$0 != null ? ffp.a.get($$0.e()) : null;
   }

   public List<fft.b> o() {
      return this.n;
   }

   public List<fft.b> p() {
      return this.o;
   }

   private void r() {
      io<dww> $$0 = this.k().a().d(jz.aH);
      this.n.clear();
      this.n.addAll(a($$0, arz.a).orElseGet(() -> $$0.h().map(fft.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, arz.b).orElse(this.n));
      ib<dww> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fft.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ib<dww>> a(ffs $$0, Optional<agh<dww>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(jz.aH).b($$1x));
   }

   private static Optional<List<fft.b>> a(io<dww> $$0, arv<dww> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fft.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(crw $$0) {
      this.p = $$0;
      this.a();
   }

   public crw q() {
      return this.p;
   }

   public static enum a {
      a("survival", crx.a),
      b("hardcore", crx.a),
      c("creative", crx.b),
      d("spectator", crx.d);

      public final crx e;
      public final ur f;
      private final ur g;

      private a(String $$0, crx $$1) {
         this.e = $$1;
         this.f = ur.c("selectWorld.gameMode." + $$0);
         this.g = ur.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public ur a() {
         return this.g;
      }
   }

   public static record b(@Nullable ib<dww> a) {
      private static final ur b = ur.c("generator.custom");

      public ur a() {
         return Optional.ofNullable(this.a).flatMap(ib::e).map($$0 -> ur.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ib::e).filter($$0 -> $$0.equals(dwx.d)).isPresent();
      }

      @Nullable
      public ib<dww> c() {
         return this.a;
      }
   }
}
