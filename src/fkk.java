import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fkk {
   private static final vq a = vq.c("selectWorld.newWorld");
   private final List<Consumer<fkk>> b = new ArrayList<>();
   private String c = a.getString();
   private fkk.a d = fkk.a.a;
   private blt e = blt.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fkj l;
   private fkk.b m;
   private final List<fkk.b> n = new ArrayList<>();
   private final List<fkk.b> o = new ArrayList<>();
   private cvn p = new cvn();

   public fkk(Path $$0, fkj $$1, Optional<aix<eba>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fkk.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fkk> $$0) {
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

      for (Consumer<fkk> $$2 : this.b) {
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

   public void a(fkk.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fkk.a d() {
      return this.l() ? fkk.a.d : this.d;
   }

   public void a(blt $$0) {
      this.e = $$0;
      this.a();
   }

   public blt e() {
      return this.f() ? blt.d : this.e;
   }

   public boolean f() {
      return this.d() == fkk.a.b;
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
         return this.f == null ? this.d() == fkk.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(drt.a(this.h())));
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

   public void a(fkj $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fkj k() {
      return this.l;
   }

   public void a(fkj.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cwl $$0) {
      cwl $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fkj(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fkk.b $$0) {
      this.m = $$0;
      ij<eba> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fkk.b m() {
      return this.m;
   }

   @Nullable
   public fkg n() {
      ij<eba> $$0 = this.m().c();
      return $$0 != null ? fkg.a.get($$0.e()) : null;
   }

   public List<fkk.b> o() {
      return this.n;
   }

   public List<fkk.b> p() {
      return this.o;
   }

   private void r() {
      iv<eba> $$0 = this.k().a().d(kg.aK);
      this.n.clear();
      this.n.addAll(a($$0, aut.a).orElseGet(() -> $$0.h().map(fkk.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, aut.b).orElse(this.n));
      ij<eba> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fkk.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ij<eba>> a(fkj $$0, Optional<aix<eba>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(kg.aK).b($$1x));
   }

   private static Optional<List<fkk.b>> a(iv<eba> $$0, aup<eba> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fkk.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cvn $$0) {
      this.p = $$0;
      this.a();
   }

   public cvn q() {
      return this.p;
   }

   public static enum a {
      a("survival", cvo.a),
      b("hardcore", cvo.a),
      c("creative", cvo.b),
      d("spectator", cvo.d);

      public final cvo e;
      public final vq f;
      private final vq g;

      private a(String $$0, cvo $$1) {
         this.e = $$1;
         this.f = vq.c("selectWorld.gameMode." + $$0);
         this.g = vq.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public vq a() {
         return this.g;
      }
   }

   public static record b(@Nullable ij<eba> a) {
      private static final vq b = vq.c("generator.custom");

      public vq a() {
         return Optional.ofNullable(this.a).flatMap(ij::e).map($$0 -> vq.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ij::e).filter($$0 -> $$0.equals(ebb.d)).isPresent();
      }

      @Nullable
      public ij<eba> c() {
         return this.a;
      }
   }
}
