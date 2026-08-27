import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fia {
   private static final vf a = vf.c("selectWorld.newWorld");
   private final List<Consumer<fia>> b = new ArrayList<>();
   private String c = a.getString();
   private fia.a d = fia.a.a;
   private bjy e = bjy.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fhz l;
   private fia.b m;
   private final List<fia.b> n = new ArrayList<>();
   private final List<fia.b> o = new ArrayList<>();
   private ctl p = new ctl();

   public fia(Path $$0, fhz $$1, Optional<ahf<dyv>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fia.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fia> $$0) {
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

      for (Consumer<fia> $$2 : this.b) {
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

   public void a(fia.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fia.a d() {
      return this.l() ? fia.a.d : this.d;
   }

   public void a(bjy $$0) {
      this.e = $$0;
      this.a();
   }

   public bjy e() {
      return this.f() ? bjy.d : this.e;
   }

   public boolean f() {
      return this.d() == fia.a.b;
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
         return this.f == null ? this.d() == fia.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dpo.a(this.h())));
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

   public void a(fhz $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fhz k() {
      return this.l;
   }

   public void a(fhz.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cuj $$0) {
      cuj $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fhz(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fia.b $$0) {
      this.m = $$0;
      ih<dyv> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fia.b m() {
      return this.m;
   }

   @Nullable
   public fhw n() {
      ih<dyv> $$0 = this.m().c();
      return $$0 != null ? fhw.a.get($$0.e()) : null;
   }

   public List<fia.b> o() {
      return this.n;
   }

   public List<fia.b> p() {
      return this.o;
   }

   private void r() {
      it<dyv> $$0 = this.k().a().d(ke.aK);
      this.n.clear();
      this.n.addAll(a($$0, ata.a).orElseGet(() -> $$0.h().map(fia.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, ata.b).orElse(this.n));
      ih<dyv> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fia.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ih<dyv>> a(fhz $$0, Optional<ahf<dyv>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(ke.aK).b($$1x));
   }

   private static Optional<List<fia.b>> a(it<dyv> $$0, asw<dyv> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fia.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(ctl $$0) {
      this.p = $$0;
      this.a();
   }

   public ctl q() {
      return this.p;
   }

   public static enum a {
      a("survival", ctm.a),
      b("hardcore", ctm.a),
      c("creative", ctm.b),
      d("spectator", ctm.d);

      public final ctm e;
      public final vf f;
      private final vf g;

      private a(String $$0, ctm $$1) {
         this.e = $$1;
         this.f = vf.c("selectWorld.gameMode." + $$0);
         this.g = vf.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public vf a() {
         return this.g;
      }
   }

   public static record b(@Nullable ih<dyv> a) {
      private static final vf b = vf.c("generator.custom");

      public vf a() {
         return Optional.ofNullable(this.a).flatMap(ih::e).map($$0 -> vf.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ih::e).filter($$0 -> $$0.equals(dyw.d)).isPresent();
      }

      @Nullable
      public ih<dyv> c() {
         return this.a;
      }
   }
}
