import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsb {
   private static final xp a = xp.c("selectWorld.newWorld");
   private final List<Consumer<fsb>> b = new ArrayList<>();
   private String c = a.getString();
   private fsb.a d = fsb.a.a;
   private bqr e = bqr.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fsa l;
   private fsb.b m;
   private final List<fsb.b> n = new ArrayList<>();
   private final List<fsb.b> o = new ArrayList<>();
   private dbu p = new dbu();

   public fsb(Path $$0, fsa $$1, Optional<ale<ehz>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fsb.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fsb> $$0) {
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

      for (Consumer<fsb> $$2 : this.b) {
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

   public void a(fsb.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fsb.a d() {
      return this.l() ? fsb.a.d : this.d;
   }

   public void a(bqr $$0) {
      this.e = $$0;
      this.a();
   }

   public bqr e() {
      return this.f() ? bqr.d : this.e;
   }

   public boolean f() {
      return this.d() == fsb.a.b;
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
         return this.f == null ? this.d() == fsb.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dys.a(this.h())));
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

   public void a(fsa $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fsa k() {
      return this.l;
   }

   public void a(fsa.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dcs $$0) {
      dcs $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fsa(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fsb.b $$0) {
      this.m = $$0;
      ji<ehz> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fsb.b m() {
      return this.m;
   }

   @Nullable
   public frx n() {
      ji<ehz> $$0 = this.m().c();
      return $$0 != null ? frx.a.get($$0.e()) : null;
   }

   public List<fsb.b> o() {
      return this.n;
   }

   public List<fsb.b> p() {
      return this.o;
   }

   private void r() {
      jv<ehz> $$0 = this.k().a().d(lq.aQ);
      this.n.clear();
      this.n.addAll(a($$0, axj.a).orElseGet(() -> $$0.h().map(fsb.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axj.b).orElse(this.n));
      ji<ehz> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fsb.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ji<ehz>> a(fsa $$0, Optional<ale<ehz>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(lq.aQ).b($$1x));
   }

   private static Optional<List<fsb.b>> a(jv<ehz> $$0, axf<ehz> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fsb.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dbu $$0) {
      this.p = $$0;
      this.a();
   }

   public dbu q() {
      return this.p;
   }

   public static enum a {
      a("survival", dbv.a),
      b("hardcore", dbv.a),
      c("creative", dbv.b),
      d("spectator", dbv.d);

      public final dbv e;
      public final xp f;
      private final xp g;

      private a(final String $$0, final dbv $$1) {
         this.e = $$1;
         this.f = xp.c("selectWorld.gameMode." + $$0);
         this.g = xp.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xp a() {
         return this.g;
      }
   }

   public static record b(@Nullable ji<ehz> a) {
      private static final xp b = xp.c("generator.custom");

      public xp a() {
         return Optional.ofNullable(this.a).flatMap(ji::e).map($$0 -> xp.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ji::e).filter($$0 -> $$0.equals(eia.d)).isPresent();
      }

      @Nullable
      public ji<ehz> c() {
         return this.a;
      }
   }
}
