import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fco {
   private static final te a = te.c("selectWorld.newWorld");
   private final List<Consumer<fco>> b = new ArrayList<>();
   private String c = a.getString();
   private fco.a d = fco.a.a;
   private bgl e = bgl.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fcn l;
   private fco.b m;
   private final List<fco.b> n = new ArrayList<>();
   private final List<fco.b> o = new ArrayList<>();
   private cpg p = new cpg();

   public fco(Path $$0, fcn $$1, Optional<aeo<dum>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fco.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fco> $$0) {
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

      for (Consumer<fco> $$2 : this.b) {
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

   public void a(fco.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fco.a d() {
      return this.l() ? fco.a.d : this.d;
   }

   public void a(bgl $$0) {
      this.e = $$0;
      this.a();
   }

   public bgl e() {
      return this.f() ? bgl.d : this.e;
   }

   public boolean f() {
      return this.d() == fco.a.b;
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
         return this.f == null ? this.d() == fco.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dlf.a(this.h())));
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

   public void a(fcn $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fcn k() {
      return this.l;
   }

   public void a(fcn.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cqd $$0) {
      cqd $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fcn(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fco.b $$0) {
      this.m = $$0;
      hf<dum> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fco.b m() {
      return this.m;
   }

   @Nullable
   public fck n() {
      hf<dum> $$0 = this.m().c();
      return $$0 != null ? fck.a.get($$0.e()) : null;
   }

   public List<fco.b> o() {
      return this.n;
   }

   public List<fco.b> p() {
      return this.o;
   }

   private void r() {
      hs<dum> $$0 = this.k().a().d(jd.aF);
      this.n.clear();
      this.n.addAll(a($$0, aqc.a).orElseGet(() -> $$0.h().map(fco.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, aqc.b).orElse(this.n));
      hf<dum> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fco.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<hf<dum>> a(fcn $$0, Optional<aeo<dum>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(jd.aF).b($$1x));
   }

   private static Optional<List<fco.b>> a(hs<dum> $$0, apy<dum> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fco.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cpg $$0) {
      this.p = $$0;
      this.a();
   }

   public cpg q() {
      return this.p;
   }

   public static enum a {
      a("survival", cph.a),
      b("hardcore", cph.a),
      c("creative", cph.b),
      d("spectator", cph.d);

      public final cph e;
      public final te f;
      private final te g;

      private a(String $$0, cph $$1) {
         this.e = $$1;
         this.f = te.c("selectWorld.gameMode." + $$0);
         this.g = te.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public te a() {
         return this.g;
      }
   }

   public static record b(@Nullable hf<dum> a) {
      private static final te b = te.c("generator.custom");

      public te a() {
         return Optional.ofNullable(this.a).flatMap(hf::e).map($$0 -> te.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(hf::e).filter($$0 -> $$0.equals(dun.d)).isPresent();
      }

      @Nullable
      public hf<dum> c() {
         return this.a;
      }
   }
}
