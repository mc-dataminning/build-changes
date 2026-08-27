import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fps {
   private static final ws a = ws.c("selectWorld.newWorld");
   private final List<Consumer<fps>> b = new ArrayList<>();
   private String c = a.getString();
   private fps.a d = fps.a.a;
   private bon e = bon.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fpr l;
   private fps.b m;
   private final List<fps.b> n = new ArrayList<>();
   private final List<fps.b> o = new ArrayList<>();
   private czq p = new czq();

   public fps(Path $$0, fpr $$1, Optional<ake<efv>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fps.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.b().c();
      this.i = $$1.b().d();
      this.k = this.c(this.c);
   }

   public void a(Consumer<fps> $$0) {
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

      for (Consumer<fps> $$2 : this.b) {
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

   public void a(fps.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fps.a d() {
      return this.l() ? fps.a.d : this.d;
   }

   public void a(bon $$0) {
      this.e = $$0;
      this.a();
   }

   public bon e() {
      return this.f() ? bon.d : this.e;
   }

   public boolean f() {
      return this.d() == fps.a.b;
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
         return this.f == null ? this.d() == fps.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(dwo.a(this.h())));
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

   public void a(fpr $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fpr k() {
      return this.l;
   }

   public void a(fpr.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dao $$0) {
      dao $$1 = this.l.g();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fpr(this.l.b(), this.l.c(), this.l.d(), this.l.e(), this.l.f(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.d().c();
   }

   public void a(fps.b $$0) {
      this.m = $$0;
      iv<efv> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fps.b m() {
      return this.m;
   }

   @Nullable
   public fpo n() {
      iv<efv> $$0 = this.m().c();
      return $$0 != null ? fpo.a.get($$0.e()) : null;
   }

   public List<fps.b> o() {
      return this.n;
   }

   public List<fps.b> p() {
      return this.o;
   }

   private void r() {
      ji<efv> $$0 = this.k().a().d(ld.aP);
      this.n.clear();
      this.n.addAll(a($$0, awh.a).orElseGet(() -> $$0.h().map(fps.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, awh.b).orElse(this.n));
      iv<efv> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fps.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<iv<efv>> a(fpr $$0, Optional<ake<efv>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(ld.aP).b($$1x));
   }

   private static Optional<List<fps.b>> a(ji<efv> $$0, awd<efv> $$1) {
      return $$0.b($$1).map($$0x -> $$0x.a().map(fps.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(czq $$0) {
      this.p = $$0;
      this.a();
   }

   public czq q() {
      return this.p;
   }

   public static enum a {
      a("survival", czr.a),
      b("hardcore", czr.a),
      c("creative", czr.b),
      d("spectator", czr.d);

      public final czr e;
      public final ws f;
      private final ws g;

      private a(String $$0, czr $$1) {
         this.e = $$1;
         this.f = ws.c("selectWorld.gameMode." + $$0);
         this.g = ws.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public ws a() {
         return this.g;
      }
   }

   public static record b(@Nullable iv<efv> a) {
      private static final ws b = ws.c("generator.custom");

      public ws a() {
         return Optional.ofNullable(this.a).flatMap(iv::e).map($$0 -> ws.c($$0.a().f("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(iv::e).filter($$0 -> $$0.equals(efw.d)).isPresent();
      }

      @Nullable
      public iv<efv> c() {
         return this.a;
      }
   }
}
