import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fdc {
   private static final tl a = tl.c("selectWorld.newWorld");
   private final List<Consumer<fdc>> b = new ArrayList<>();
   private String c = a.getString();
   private fdc.a d = fdc.a.a;
   private bhb e = bhb.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fdb l;
   private fdc.b m;
   private final List<fdc.b> n = new ArrayList<>();
   private final List<fdc.b> o = new ArrayList<>();
   private cpx p = new cpx();

   public fdc(Path $$0, fdb $$1, Optional<aey<dur>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fdc.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fdc> $$0) {
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

      for (Consumer<fdc> $$2 : this.b) {
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

   public void a(fdc.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fdc.a d() {
      return this.l() ? fdc.a.d : this.d;
   }

   public void a(bhb $$0) {
      this.e = $$0;
      this.a();
   }

   public bhb e() {
      return this.f() ? bhb.d : this.e;
   }

   public boolean f() {
      return this.d() == fdc.a.b;
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
         return this.f == null ? this.d() == fdc.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dlk.a(this.h())));
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

   public void a(fdb $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fdb k() {
      return this.l;
   }

   public void a(fdb.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cqu $$0) {
      cqu $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fdb(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fdc.b $$0) {
      this.m = $$0;
      he<dur> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fdc.b m() {
      return this.m;
   }

   @Nullable
   public fcy n() {
      he<dur> $$0 = this.m().c();
      return $$0 != null ? fcy.a.get($$0.e()) : null;
   }

   public List<fdc.b> o() {
      return this.n;
   }

   public List<fdc.b> p() {
      return this.o;
   }

   private void r() {
      hq<dur> $$0 = this.k().a().d(jc.aG);
      this.n.clear();
      this.n.addAll(a($$0, aqo.a).orElseGet(() -> $$0.h().map(fdc.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, aqo.b).orElse(this.n));
      he<dur> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fdc.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<he<dur>> a(fdb $$0, Optional<aey<dur>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(jc.aG).b($$1x));
   }

   private static Optional<List<fdc.b>> a(hq<dur> $$0, aqk<dur> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fdc.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cpx $$0) {
      this.p = $$0;
      this.a();
   }

   public cpx q() {
      return this.p;
   }

   public static enum a {
      a("survival", cpy.a),
      b("hardcore", cpy.a),
      c("creative", cpy.b),
      d("spectator", cpy.d);

      public final cpy e;
      public final tl f;
      private final tl g;

      private a(String $$0, cpy $$1) {
         this.e = $$1;
         this.f = tl.c("selectWorld.gameMode." + $$0);
         this.g = tl.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public tl a() {
         return this.g;
      }
   }

   public static record b(@Nullable he<dur> a) {
      private static final tl b = tl.c("generator.custom");

      public tl a() {
         return Optional.ofNullable(this.a).flatMap(he::e).map($$0 -> tl.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(he::e).filter($$0 -> $$0.equals(dus.d)).isPresent();
      }

      @Nullable
      public he<dur> c() {
         return this.a;
      }
   }
}
