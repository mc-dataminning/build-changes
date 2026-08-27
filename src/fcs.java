import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fcs {
   private static final tf a = tf.c("selectWorld.newWorld");
   private final List<Consumer<fcs>> b = new ArrayList<>();
   private String c = a.getString();
   private fcs.a d = fcs.a.a;
   private bgn e = bgn.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fcr l;
   private fcs.b m;
   private final List<fcs.b> n = new ArrayList<>();
   private final List<fcs.b> o = new ArrayList<>();
   private cpi p = new cpi();

   public fcs(Path $$0, fcr $$1, Optional<aeq<duo>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fcs.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fcs> $$0) {
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

      for (Consumer<fcs> $$2 : this.b) {
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

   public void a(fcs.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fcs.a d() {
      return this.l() ? fcs.a.d : this.d;
   }

   public void a(bgn $$0) {
      this.e = $$0;
      this.a();
   }

   public bgn e() {
      return this.f() ? bgn.d : this.e;
   }

   public boolean f() {
      return this.d() == fcs.a.b;
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
         return this.f == null ? this.d() == fcs.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dlh.a(this.h())));
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

   public void a(fcr $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fcr k() {
      return this.l;
   }

   public void a(fcr.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cqf $$0) {
      cqf $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fcr(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fcs.b $$0) {
      this.m = $$0;
      he<duo> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fcs.b m() {
      return this.m;
   }

   @Nullable
   public fco n() {
      he<duo> $$0 = this.m().c();
      return $$0 != null ? fco.a.get($$0.e()) : null;
   }

   public List<fcs.b> o() {
      return this.n;
   }

   public List<fcs.b> p() {
      return this.o;
   }

   private void r() {
      hr<duo> $$0 = this.k().a().d(jc.aF);
      this.n.clear();
      this.n.addAll(a($$0, aqe.a).orElseGet(() -> $$0.h().map(fcs.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, aqe.b).orElse(this.n));
      he<duo> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fcs.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<he<duo>> a(fcr $$0, Optional<aeq<duo>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(jc.aF).b($$1x));
   }

   private static Optional<List<fcs.b>> a(hr<duo> $$0, aqa<duo> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fcs.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(cpi $$0) {
      this.p = $$0;
      this.a();
   }

   public cpi q() {
      return this.p;
   }

   public static enum a {
      a("survival", cpj.a),
      b("hardcore", cpj.a),
      c("creative", cpj.b),
      d("spectator", cpj.d);

      public final cpj e;
      public final tf f;
      private final tf g;

      private a(String $$0, cpj $$1) {
         this.e = $$1;
         this.f = tf.c("selectWorld.gameMode." + $$0);
         this.g = tf.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public tf a() {
         return this.g;
      }
   }

   public static record b(@Nullable he<duo> a) {
      private static final tf b = tf.c("generator.custom");

      public tf a() {
         return Optional.ofNullable(this.a).flatMap(he::e).map($$0 -> tf.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(he::e).filter($$0 -> $$0.equals(dup.d)).isPresent();
      }

      @Nullable
      public he<duo> c() {
         return this.a;
      }
   }
}
