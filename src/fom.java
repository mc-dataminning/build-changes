import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fom {
   private static final wg a = wg.c("selectWorld.newWorld");
   private final List<Consumer<fom>> b = new ArrayList<>();
   private String c = a.getString();
   private fom.a d = fom.a.a;
   private bnx e = bnx.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fol l;
   private fom.b m;
   private final List<fom.b> n = new ArrayList<>();
   private final List<fom.b> o = new ArrayList<>();
   private cyt p = new cyt();

   public fom(Path $$0, fol $$1, Optional<ajs<eew>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fom.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fom> $$0) {
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

      for (Consumer<fom> $$2 : this.b) {
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

   public void a(fom.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fom.a d() {
      return this.l() ? fom.a.d : this.d;
   }

   public void a(bnx $$0) {
      this.e = $$0;
      this.a();
   }

   public bnx e() {
      return this.f() ? bnx.d : this.e;
   }

   public boolean f() {
      return this.d() == fom.a.b;
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
         return this.f == null ? this.d() == fom.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dvp.a(this.h())));
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

   public void a(fol $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fol k() {
      return this.l;
   }

   public void a(fol.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(czr $$0) {
      czr $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fol(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fom.b $$0) {
      this.m = $$0;
      il<eew> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fom.b m() {
      return this.m;
   }

   @Nullable
   public foi n() {
      il<eew> $$0 = this.m().c();
      return $$0 != null ? foi.a.get($$0.e()) : null;
   }

   public List<fom.b> o() {
      return this.n;
   }

   public List<fom.b> p() {
      return this.o;
   }

   private void r() {
      iy<eew> $$0 = this.k().a().d(ks.aM);
      this.n.clear();
      this.n.addAll(a($$0, avv.a).orElseGet(() -> $$0.h().map(fom.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, avv.b).orElse(this.n));
      il<eew> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fom.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<il<eew>> a(fol $$0, Optional<ajs<eew>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(ks.aM).b($$1x));
   }

   private static Optional<List<fom.b>> a(iy<eew> $$0, avr<eew> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fom.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cyt $$0) {
      this.p = $$0;
      this.a();
   }

   public cyt q() {
      return this.p;
   }

   public static enum a {
      a("survival", cyu.a),
      b("hardcore", cyu.a),
      c("creative", cyu.b),
      d("spectator", cyu.d);

      public final cyu e;
      public final wg f;
      private final wg g;

      private a(String $$0, cyu $$1) {
         this.e = $$1;
         this.f = wg.c("selectWorld.gameMode." + $$0);
         this.g = wg.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wg a() {
         return this.g;
      }
   }

   public static record b(@Nullable il<eew> a) {
      private static final wg b = wg.c("generator.custom");

      public wg a() {
         return Optional.ofNullable(this.a).flatMap(il::e).map($$0 -> wg.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(il::e).filter($$0 -> $$0.equals(eex.d)).isPresent();
      }

      @Nullable
      public il<eew> c() {
         return this.a;
      }
   }
}
