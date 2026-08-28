import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsc {
   private static final xp a = xp.c("selectWorld.newWorld");
   private final List<Consumer<fsc>> b = new ArrayList<>();
   private String c = a.getString();
   private fsc.a d = fsc.a.a;
   private bqs e = bqs.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fsb l;
   private fsc.b m;
   private final List<fsc.b> n = new ArrayList<>();
   private final List<fsc.b> o = new ArrayList<>();
   private dbv p = new dbv();

   public fsc(Path $$0, fsb $$1, Optional<ale<eia>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fsc.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fsc> $$0) {
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

      for (Consumer<fsc> $$2 : this.b) {
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

   public void a(fsc.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fsc.a d() {
      return this.l() ? fsc.a.d : this.d;
   }

   public void a(bqs $$0) {
      this.e = $$0;
      this.a();
   }

   public bqs e() {
      return this.f() ? bqs.d : this.e;
   }

   public boolean f() {
      return this.d() == fsc.a.b;
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
         return this.f == null ? this.d() == fsc.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dyt.a(this.h())));
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

   public void a(fsb $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fsb k() {
      return this.l;
   }

   public void a(fsb.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dct $$0) {
      dct $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fsb(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fsc.b $$0) {
      this.m = $$0;
      ji<eia> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fsc.b m() {
      return this.m;
   }

   @Nullable
   public fry n() {
      ji<eia> $$0 = this.m().c();
      return $$0 != null ? fry.a.get($$0.e()) : null;
   }

   public List<fsc.b> o() {
      return this.n;
   }

   public List<fsc.b> p() {
      return this.o;
   }

   private void r() {
      jv<eia> $$0 = this.k().a().d(lq.aQ);
      this.n.clear();
      this.n.addAll(a($$0, axj.a).orElseGet(() -> $$0.h().map(fsc.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axj.b).orElse(this.n));
      ji<eia> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fsc.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ji<eia>> a(fsb $$0, Optional<ale<eia>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(lq.aQ).b($$1x));
   }

   private static Optional<List<fsc.b>> a(jv<eia> $$0, axf<eia> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fsc.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dbv $$0) {
      this.p = $$0;
      this.a();
   }

   public dbv q() {
      return this.p;
   }

   public static enum a {
      a("survival", dbw.a),
      b("hardcore", dbw.a),
      c("creative", dbw.b),
      d("spectator", dbw.d);

      public final dbw e;
      public final xp f;
      private final xp g;

      private a(final String $$0, final dbw $$1) {
         this.e = $$1;
         this.f = xp.c("selectWorld.gameMode." + $$0);
         this.g = xp.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xp a() {
         return this.g;
      }
   }

   public static record b(@Nullable ji<eia> a) {
      private static final xp b = xp.c("generator.custom");

      public xp a() {
         return Optional.ofNullable(this.a).flatMap(ji::e).map($$0 -> xp.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ji::e).filter($$0 -> $$0.equals(eib.d)).isPresent();
      }

      @Nullable
      public ji<eia> c() {
         return this.a;
      }
   }
}
