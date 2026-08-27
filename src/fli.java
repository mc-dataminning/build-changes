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

public class fli extends fbg<fli.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ajc m = new ajc("world_list/error_highlighted");
   static final ajc n = new ajc("world_list/error");
   static final ajc o = new ajc("world_list/marked_join_highlighted");
   static final ajc p = new ajc("world_list/marked_join");
   static final ajc q = new ajc("world_list/warning_highlighted");
   static final ajc r = new ajc("world_list/warning");
   static final ajc t = new ajc("world_list/join_highlighted");
   static final ajc u = new ajc("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final vs w = vs.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final vs x = vs.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final vs y = vs.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final vs z = vs.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final vs A = vs.c("selectWorld.locked").a(n.m);
   static final vs B = vs.c("selectWorld.conversion.tooltip").a(n.m);
   static final vs C = vs.c("selectWorld.incompatible.tooltip").a(n.m);
   static final vs D = vs.c("selectWorld.experimental");
   private final fld E;
   private CompletableFuture<List<ejp>> F;
   @Nullable
   private List<ejp> G;
   private String H;
   private final fli.b I;

   public fli(fld $$0, eyk $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fli $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fli.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.J();
      }

      this.a(this.H());
   }

   @Override
   protected void m() {
      this.l().forEach(fli.a::close);
      super.m();
   }

   @Nullable
   private List<ejp> H() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void I() {
      this.F = this.J();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fek.a($$0)) {
         Optional<fli.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(glh.a(atp.zK, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      List<ejp> $$4 = this.H();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ejp> $$0) {
      if ($$0 == null) {
         this.K();
      } else {
         this.a(this.H, $$0);
      }

      this.G = $$0;
   }

   public void a(String $$0) {
      if (this.G != null && !$$0.equals(this.H)) {
         this.a($$0, this.G);
      }

      this.H = $$0;
   }

   private CompletableFuture<List<ejp>> J() {
      ejo.a $$0;
      try {
         $$0 = this.c.l().b();
      } catch (ejn var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fkx.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.l().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ejp> $$1) {
      this.m();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ejp $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fli.c(this, $$2));
         }
      }

      this.L();
   }

   private boolean a(String $$0, ejp $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void K() {
      this.m();
      this.b(this.I);
      this.L();
   }

   private void L() {
      this.a(this.o());
      this.E.d(true);
   }

   private void c(vs $$0) {
      this.c.a(new ffl(vs.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable fli.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fli.c $$1 ? $$1.f : null);
   }

   public Optional<fli.c> d() {
      fli.a $$0 = this.i();
      return $$0 instanceof fli.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fld e() {
      return this.E;
   }

   @Override
   public void a(fef $$0) {
      if (this.l().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fbg.a<fli.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fli.a {
      private static final vs a = vs.c("selectWorld.loading_list");
      private final eyk b;

      public b(eyk $$0) {
         this.b = $$0;
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = ffs.a(ac.b());
         int $$13 = (this.b.y.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public vs a() {
         return a;
      }
   }

   public final class c extends fli.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final eyk d;
      private final fld e;
      final ejp f;
      private final ffm g;
      @Nullable
      private Path h;
      private long i;

      public c(fli $$1, ejp $$2) {
         this.d = $$1.c;
         this.e = $$1.e();
         this.f = $$2;
         this.g = ffm.a(this.d.Z(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<eom> $$1 = this.d.bd().a(this.h);
                  if (!$$1.isEmpty()) {
                     fli.v.warn("{}", eok.a(this.h, $$1));
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
               fli.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public vs a() {
         vs $$0 = vs.a("narrator.select.world_info", this.f.b(), vs.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = vr.a($$0, fli.A);
         }

         if (this.f.e()) {
            $$0 = vr.a($$0, fli.D);
         }

         return vs.a("narrator.select", $$0);
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fli.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gje.a("selectWorld.world") + " " + ($$1 + 1);
         }

         vs $$13 = this.f.s();
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
            ajc $$16 = $$15 ? fli.t : fli.u;
            ajc $$17 = $$15 ? fli.q : fli.r;
            ajc $$18 = $$15 ? fli.m : fli.n;
            ajc $$19 = $$15 ? fli.o : fli.p;
            if (this.f instanceof ejp.c || this.f instanceof ejp.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fli.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fli.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fli.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fli.w.g(), fli.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fli.y.g(), fli.z.g()));
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
            fli.this.a((fli.a)this);
            if (!($$0 - (double)fli.this.q() <= 32.0) && ac.b() - this.i >= 250L) {
               this.i = ac.b();
               return true;
            } else {
               if (this.b()) {
                  this.d.aj().a(glh.a(atp.zK, 1.0F));
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
            if (this.f instanceof ejp.c) {
               this.d.a(ffw.a(() -> this.d.a(this.e)));
            } else {
               this.d.w().a(this.f.a(), () -> {
                  fli.this.I();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new ffa($$0 -> {
            if ($$0) {
               this.d.a(new fge(true));
               this.e();
            }

            this.d.a(this.e);
         }, vs.c("selectWorld.deleteQuestion"), vs.a("selectWorld.deleteWarning", this.f.b()), vs.c("selectWorld.deleteButton"), vr.e));
      }

      public void e() {
         ejo $$0 = this.d.l();
         String $$1 = this.f.a();

         try (ejo.c $$2 = $$0.e($$1)) {
            $$2.i();
         } catch (IOException var8) {
            fcs.b(this.d, $$1);
            fli.v.error("Failed to delete world {}", $$1, var8);
         }

         fli.this.I();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         ejo.c $$1;
         try {
            $$1 = this.d.l().d($$0);
         } catch (IOException var6) {
            fcs.a(this.d, $$0);
            fli.v.error("Failed to access level {}", $$0, var6);
            fli.this.I();
            return;
         } catch (eok var7) {
            fli.v.warn("{}", var7.getMessage());
            this.d.a(ffw.a(() -> this.d.a(this.e)));
            return;
         }

         fkz $$5;
         try {
            $$5 = fkz.a(this.d, $$1, $$1x -> {
               $$1.a();
               if ($$1x) {
                  fli.this.I();
               }

               this.d.a(this.e);
            });
         } catch (tj | tp | IOException var5) {
            $$1.a();
            fcs.a(this.d, $$0);
            fli.v.error("Failed to load world data {}", $$0, var5);
            fli.this.I();
            return;
         }

         this.d.a($$5);
      }

      public void g() {
         this.k();

         try (ejo.c $$0 = this.d.l().d(this.f.a())) {
            Pair<cwi, flf> $$1 = this.d.w().a($$0);
            cwi $$2 = (cwi)$$1.getFirst();
            flf $$3 = (flf)$$1.getSecond();
            Path $$4 = fkx.a($$0.a(ejm.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new ffa(
                        $$3x -> this.d.a((fgh)($$3x ? fkx.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        vs.c("selectWorld.recreate.customized.title"),
                        vs.c("selectWorld.recreate.customized.text"),
                        vr.i,
                        vr.e
                     )
                  );
            } else {
               this.d.a(fkx.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (eok var8) {
            fli.v.warn("{}", var8.getMessage());
            this.d.a(ffw.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fli.v.error("Unable to recreate world", var9);
            this.d.a(new feu(() -> this.d.a(this.e), vs.c("selectWorld.recreate.error.title"), vs.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new ffn(vs.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(ese.a($$1));
            } catch (Throwable var7) {
               fli.v.error("Invalid icon for world {}", this.f.a(), var7);
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
