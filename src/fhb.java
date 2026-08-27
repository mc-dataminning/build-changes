import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fhb {
   private static final vb a = vb.c("selectWorld.newWorld");
   private final List<Consumer<fhb>> b = new ArrayList<>();
   private String c = a.getString();
   private fhb.a d = fhb.a.a;
   private bji e = bji.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fha l;
   private fhb.b m;
   private final List<fhb.b> n = new ArrayList<>();
   private final List<fhb.b> o = new ArrayList<>();
   private csu p = new csu();

   public fhb(Path $$0, fha $$1, Optional<ags<dyd>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fhb.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fhb> $$0) {
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

      for (Consumer<fhb> $$2 : this.b) {
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

   public void a(fhb.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fhb.a d() {
      return this.l() ? fhb.a.d : this.d;
   }

   public void a(bji $$0) {
      this.e = $$0;
      this.a();
   }

   public bji e() {
      return this.f() ? bji.d : this.e;
   }

   public boolean f() {
      return this.d() == fhb.a.b;
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
         return this.f == null ? this.d() == fhb.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dow.a(this.h())));
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

   public void a(fha $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fha k() {
      return this.l;
   }

   public void a(fha.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(cts $$0) {
      cts $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fha(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fhb.b $$0) {
      this.m = $$0;
      ie<dyd> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fhb.b m() {
      return this.m;
   }

   @Nullable
   public fgx n() {
      ie<dyd> $$0 = this.m().c();
      return $$0 != null ? fgx.a.get($$0.e()) : null;
   }

   public List<fhb.b> o() {
      return this.n;
   }

   public List<fhb.b> p() {
      return this.o;
   }

   private void r() {
      ir<dyd> $$0 = this.k().a().d(kc.aJ);
      this.n.clear();
      this.n.addAll(a($$0, ask.a).orElseGet(() -> $$0.h().map(fhb.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, ask.b).orElse(this.n));
      ie<dyd> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fhb.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<ie<dyd>> a(fha $$0, Optional<ags<dyd>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(kc.aJ).b($$1x));
   }

   private static Optional<List<fhb.b>> a(ir<dyd> $$0, asg<dyd> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fhb.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(csu $$0) {
      this.p = $$0;
      this.a();
   }

   public csu q() {
      return this.p;
   }

   public static enum a {
      a("survival", csv.a),
      b("hardcore", csv.a),
      c("creative", csv.b),
      d("spectator", csv.d);

      public final csv e;
      public final vb f;
      private final vb g;

      private a(String $$0, csv $$1) {
         this.e = $$1;
         this.f = vb.c("selectWorld.gameMode." + $$0);
         this.g = vb.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public vb a() {
         return this.g;
      }
   }

   public static record b(@Nullable ie<dyd> a) {
      private static final vb b = vb.c("generator.custom");

      public vb a() {
         return Optional.ofNullable(this.a).flatMap(ie::e).map($$0 -> vb.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(ie::e).filter($$0 -> $$0.equals(dye.d)).isPresent();
      }

      @Nullable
      public ie<dyd> c() {
         return this.a;
      }
   }
}
