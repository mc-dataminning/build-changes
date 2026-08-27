import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class feb {
   private static final ui a = ui.c("selectWorld.newWorld");
   private final List<Consumer<feb>> b = new ArrayList<>();
   private String c = a.getString();
   private feb.a d = feb.a.a;
   private bhy e = bhy.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fea l;
   private feb.b m;
   private final List<feb.b> n = new ArrayList<>();
   private final List<feb.b> o = new ArrayList<>();
   private cqv p = new cqv();

   public feb(Path $$0, fea $$1, Optional<afv<dvp>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new feb.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<feb> $$0) {
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

      for (Consumer<feb> $$2 : this.b) {
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

   public void a(feb.a $$0) {
      this.d = $$0;
      this.a();
   }

   public feb.a d() {
      return this.l() ? feb.a.d : this.d;
   }

   public void a(bhy $$0) {
      this.e = $$0;
      this.a();
   }

   public bhy e() {
      return this.f() ? bhy.d : this.e;
   }

   public boolean f() {
      return this.d() == feb.a.b;
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
         return this.f == null ? this.d() == feb.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dmi.a(this.h())));
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

   public void a(fea $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fea k() {
      return this.l;
   }

   public void a(fea.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(crs $$0) {
      crs $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fea(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(feb.b $$0) {
      this.m = $$0;
      ib<dvp> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public feb.b m() {
      return this.m;
   }

   @Nullable
   public fdx n() {
      ib<dvp> $$0 = this.m().c();
      return $$0 != null ? fdx.a.get($$0.e()) : null;
   }

   public List<feb.b> o() {
      return this.n;
   }

   public List<feb.b> p() {
      return this.o;
   }

   private void r() {
      io<dvp> $$0 = this.k().a().d(jz.aG);
      this.n.clear();
      this.n.addAll(a($$0, arl.a).orElseGet(() -> $$0.h().map(feb.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, arl.b).orElse(this.n));
      ib<dvp> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(feb.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ib<dvp>> a(fea $$0, Optional<afv<dvp>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(jz.aG).b($$1x));
   }

   private static Optional<List<feb.b>> a(io<dvp> $$0, arh<dvp> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(feb.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cqv $$0) {
      this.p = $$0;
      this.a();
   }

   public cqv q() {
      return this.p;
   }

   public static enum a {
      a("survival", cqw.a),
      b("hardcore", cqw.a),
      c("creative", cqw.b),
      d("spectator", cqw.d);

      public final cqw e;
      public final ui f;
      private final ui g;

      private a(String $$0, cqw $$1) {
         this.e = $$1;
         this.f = ui.c("selectWorld.gameMode." + $$0);
         this.g = ui.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public ui a() {
         return this.g;
      }
   }

   public static record b(@Nullable ib<dvp> a) {
      private static final ui b = ui.c("generator.custom");

      public ui a() {
         return Optional.ofNullable(this.a).flatMap(ib::e).map($$0 -> ui.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ib::e).filter($$0 -> $$0.equals(dvq.d)).isPresent();
      }

      @Nullable
      public ib<dvp> c() {
         return this.a;
      }
   }
}
