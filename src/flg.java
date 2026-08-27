import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class flg {
   private static final vs a = vs.c("selectWorld.newWorld");
   private final List<Consumer<flg>> b = new ArrayList<>();
   private String c = a.getString();
   private flg.a d = flg.a.a;
   private bmi e = bmi.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private flf l;
   private flg.b m;
   private final List<flg.b> n = new ArrayList<>();
   private final List<flg.b> o = new ArrayList<>();
   private cwa p = new cwa();

   public flg(Path $$0, flf $$1, Optional<ajb<ebv>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new flg.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<flg> $$0) {
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

      for (Consumer<flg> $$2 : this.b) {
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

   public void a(flg.a $$0) {
      this.d = $$0;
      this.a();
   }

   public flg.a d() {
      return this.l() ? flg.a.d : this.d;
   }

   public void a(bmi $$0) {
      this.e = $$0;
      this.a();
   }

   public bmi e() {
      return this.f() ? bmi.d : this.e;
   }

   public boolean f() {
      return this.d() == flg.a.b;
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
         return this.f == null ? this.d() == flg.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dso.a(this.h())));
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

   public void a(flf $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public flf k() {
      return this.l;
   }

   public void a(flf.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cwy $$0) {
      cwy $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new flf(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(flg.b $$0) {
      this.m = $$0;
      il<ebv> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public flg.b m() {
      return this.m;
   }

   @Nullable
   public flc n() {
      il<ebv> $$0 = this.m().c();
      return $$0 != null ? flc.a.get($$0.e()) : null;
   }

   public List<flg.b> o() {
      return this.n;
   }

   public List<flg.b> p() {
      return this.o;
   }

   private void r() {
      ix<ebv> $$0 = this.k().a().d(ki.aL);
      this.n.clear();
      this.n.addAll(a($$0, auy.a).orElseGet(() -> $$0.h().map(flg.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, auy.b).orElse(this.n));
      il<ebv> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(flg.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<il<ebv>> a(flf $$0, Optional<ajb<ebv>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(ki.aL).b($$1x));
   }

   private static Optional<List<flg.b>> a(ix<ebv> $$0, aut<ebv> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(flg.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cwa $$0) {
      this.p = $$0;
      this.a();
   }

   public cwa q() {
      return this.p;
   }

   public static enum a {
      a("survival", cwb.a),
      b("hardcore", cwb.a),
      c("creative", cwb.b),
      d("spectator", cwb.d);

      public final cwb e;
      public final vs f;
      private final vs g;

      private a(String $$0, cwb $$1) {
         this.e = $$1;
         this.f = vs.c("selectWorld.gameMode." + $$0);
         this.g = vs.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public vs a() {
         return this.g;
      }
   }

   public static record b(@Nullable il<ebv> a) {
      private static final vs b = vs.c("generator.custom");

      public vs a() {
         return Optional.ofNullable(this.a).flatMap(il::e).map($$0 -> vs.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(il::e).filter($$0 -> $$0.equals(ebw.d)).isPresent();
      }

      @Nullable
      public il<ebv> c() {
         return this.a;
      }
   }
}
