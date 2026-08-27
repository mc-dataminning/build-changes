import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class ffi extends evi<ffi.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final agg m = new agg("world_list/error_highlighted");
   static final agg n = new agg("world_list/error");
   static final agg o = new agg("world_list/marked_join_highlighted");
   static final agg p = new agg("world_list/marked_join");
   static final agg q = new agg("world_list/warning_highlighted");
   static final agg r = new agg("world_list/warning");
   static final agg t = new agg("world_list/join_highlighted");
   static final agg u = new agg("world_list/join");
   static final Logger v = LogUtils.getLogger();
   private static final agg w = new agg("textures/misc/unknown_server.png");
   static final ur x = ur.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final ur y = ur.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final ur z = ur.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final ur A = ur.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final ur B = ur.c("selectWorld.locked").a(n.m);
   static final ur C = ur.c("selectWorld.conversion.tooltip").a(n.m);
   static final ur D = ur.c("selectWorld.incompatible.tooltip").a(n.m);
   static final ur E = ur.c("selectWorld.experimental");
   private final ffd F;
   private CompletableFuture<List<eec>> G;
   @Nullable
   private List<eec> H;
   private String I;
   private final ffi.b J;

   public ffi(ffd $$0, esr $$1, int $$2, int $$3, int $$4, int $$5, int $$6, String $$7, @Nullable ffi $$8) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.F = $$0;
      this.J = new ffi.b($$1);
      this.I = $$7;
      if ($$8 != null) {
         this.G = $$8.G;
      } else {
         this.G = this.y();
      }

      this.a(this.w());
   }

   @Override
   protected void j() {
      this.i().forEach(ffi.a::close);
      super.j();
   }

   @Nullable
   private List<eec> w() {
      try {
         return this.G.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void x() {
      this.G = this.y();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (eyk.a($$0)) {
         Optional<ffi.c> $$3 = this.e();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ah().a(gek.a(aqn.yy, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      List<eec> $$4 = this.w();
      if ($$4 != this.H) {
         this.a($$4);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eec> $$0) {
      if ($$0 == null) {
         this.z();
      } else {
         this.a(this.I, $$0);
      }

      this.H = $$0;
   }

   public void a(String $$0) {
      if (this.H != null && !$$0.equals(this.I)) {
         this.a($$0, this.H);
      }

      this.I = $$0;
   }

   private CompletableFuture<List<eec>> y() {
      eeb.a $$0;
      try {
         $$0 = this.c.l().b();
      } catch (eea var3) {
         v.error("Couldn't load level list", var3);
         this.a(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fex.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.l().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eec> $$1) {
      this.j();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eec $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new ffi.c(this, $$2));
         }
      }

      this.A();
   }

   private boolean a(String $$0, eec $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void z() {
      this.j();
      this.b(this.J);
      this.A();
   }

   private void A() {
      this.a(this.l());
      this.F.d(true);
   }

   private void a(ur $$0) {
      this.c.a(new ezl(ur.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable ffi.a $$0) {
      super.a($$0);
      this.F.a($$0 instanceof ffi.c $$1 ? $$1.f : null);
   }

   public Optional<ffi.c> e() {
      ffi.a $$0 = this.f();
      return $$0 instanceof ffi.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public ffd v() {
      return this.F;
   }

   @Override
   public void b(eyf $$0) {
      if (this.i().contains(this.J)) {
         this.J.b($$0);
      } else {
         super.b($$0);
      }
   }

   public abstract static class a extends evi.a<ffi.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends ffi.a {
      private static final ur a = ur.c("selectWorld.loading_list");
      private final esr b;

      public b(esr $$0) {
         this.b = $$0;
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = ezs.a(ac.b());
         int $$13 = (this.b.y.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public ur a() {
         return a;
      }
   }

   public final class c extends ffi.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final esr d;
      private final ffd e;
      final eec f;
      private final ezm g;
      @Nullable
      private Path h;
      private long i;

      public c(ffi $$1, eec $$2) {
         this.d = $$1.c;
         this.e = $$1.v();
         this.f = $$2;
         this.g = ezm.a(this.d.X(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<eiz> $$1 = this.d.ba().a(this.h);
                  if (!$$1.isEmpty()) {
                     ffi.v.warn("{}", eix.a(this.h, $$1));
                     this.h = null;
                  } else {
                     $$0 = Files.readAttributes(this.h, BasicFileAttributes.class);
                  }
               }

               if (!$$0.isRegularFile()) {
                  this.h = null;
               }
            } catch (NoSuchFileException var3) {
               this.h = null;
            } catch (IOException var4) {
               ffi.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public ur a() {
         ur $$0 = ur.a("narrator.select.world_info", this.f.b(), ur.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = uq.a($$0, ffi.B);
         }

         if (this.f.e()) {
            $$0 = uq.a($$0, ffi.E);
         }

         return ur.a("narrator.select", $$0);
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + ffi.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gcn.a("selectWorld.world") + " " + ($$1 + 1);
         }

         ur $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         RenderSystem.enableBlend();
         $$0.a(this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
         if (this.d.m.W().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            agg $$16 = $$15 ? ffi.t : ffi.u;
            agg $$17 = $$15 ? ffi.q : ffi.r;
            agg $$18 = $$15 ? ffi.m : ffi.n;
            agg $$19 = $$15 ? ffi.o : ffi.p;
            if (this.f instanceof eec.c || this.f instanceof eec.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(ffi.B, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(ffi.C, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(ffi.D, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(ffi.x.g(), ffi.y.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(ffi.z.g(), ffi.A.g()));
                  }
               }
            } else {
               $$0.a($$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            ffi.this.a((ffi.a)this);
            if (!($$0 - (double)ffi.this.o() <= 32.0) && ac.b() - this.i >= 250L) {
               this.i = ac.b();
               return true;
            } else {
               if (this.b()) {
                  this.d.ah().a(gek.a(aqn.yy, 1.0F));
                  this.c();
               }

               return true;
            }
         }
      }

      public boolean b() {
         return this.f.u();
      }

      public void c() {
         if (this.f.u()) {
            if (this.f instanceof eec.c) {
               this.d.a(ezw.a(() -> this.d.a(this.e)));
            } else {
               this.d.w().a(this.f.a(), () -> {
                  ffi.this.x();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void e() {
         this.d.a(new eza($$0 -> {
            if ($$0) {
               this.d.a(new fae(true));
               this.f();
            }

            this.d.a(this.e);
         }, ur.c("selectWorld.deleteQuestion"), ur.a("selectWorld.deleteWarning", this.f.b()), ur.c("selectWorld.deleteButton"), uq.e));
      }

      public void f() {
         eeb $$0 = this.d.l();
         String $$1 = this.f.a();

         try (eeb.c $$2 = $$0.e($$1)) {
            $$2.i();
         } catch (IOException var8) {
            ewt.b(this.d, $$1);
            ffi.v.error("Failed to delete world {}", $$1, var8);
         }

         ffi.this.x();
      }

      public void g() {
         this.k();
         String $$0 = this.f.a();

         eeb.c $$1;
         try {
            $$1 = this.d.l().d($$0);
         } catch (IOException var6) {
            ewt.a(this.d, $$0);
            ffi.v.error("Failed to access level {}", $$0, var6);
            ffi.this.x();
            return;
         } catch (eix var7) {
            ffi.v.warn("{}", var7.getMessage());
            this.d.a(ezw.a(() -> this.d.a(this.e)));
            return;
         }

         fez $$5;
         try {
            $$5 = fez.a(this.d, $$1, $$1x -> {
               $$1.a();
               if ($$1x) {
                  ffi.this.x();
               }

               this.d.a(this.e);
            });
         } catch (sk | sq | IOException var5) {
            $$1.a();
            ewt.a(this.d, $$0);
            ffi.v.error("Failed to load world data {}", $$0, var5);
            ffi.this.x();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (eeb.c $$0 = this.d.l().d(this.f.a())) {
            Pair<crw, fff> $$1 = this.d.w().a($$0);
            crw $$2 = (crw)$$1.getFirst();
            fff $$3 = (fff)$$1.getSecond();
            Path $$4 = fex.a($$0.a(edz.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new eza(
                        $$3x -> this.d.a((fah)($$3x ? fex.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        ur.c("selectWorld.recreate.customized.title"),
                        ur.c("selectWorld.recreate.customized.text"),
                        uq.i,
                        uq.e
                     )
                  );
            } else {
               this.d.a(fex.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (eix var8) {
            ffi.v.warn("{}", var8.getMessage());
            this.d.a(ezw.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            ffi.v.error("Unable to recreate world", var9);
            this.d.a(new eyu(() -> this.d.a(this.e), ur.c("selectWorld.recreate.error.title"), ur.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new ezn(ur.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(eml.a($$1));
            } catch (Throwable var7) {
               ffi.v.error("Invalid icon for world {}", this.f.a(), var7);
               this.h = null;
            }
         } else {
            this.g.a();
         }
      }

      @Override
      public void close() {
         this.g.close();
      }

      public String i() {
         return this.f.b();
      }
   }
}
