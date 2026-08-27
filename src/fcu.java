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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

public class fcu extends etd<fcu.a> {
   static final aer a = new aer("world_list/error_highlighted");
   static final aer m = new aer("world_list/error");
   static final aer n = new aer("world_list/marked_join_highlighted");
   static final aer o = new aer("world_list/marked_join");
   static final aer p = new aer("world_list/warning_highlighted");
   static final aer q = new aer("world_list/warning");
   static final aer s = new aer("world_list/join_highlighted");
   static final aer t = new aer("world_list/join");
   static final Logger u = LogUtils.getLogger();
   static final DateFormat v = new SimpleDateFormat();
   private static final aer w = new aer("textures/misc/unknown_server.png");
   static final tf x = tf.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final tf y = tf.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final tf z = tf.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final tf A = tf.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final tf B = tf.c("selectWorld.locked").a(n.m);
   static final tf C = tf.c("selectWorld.conversion.tooltip").a(n.m);
   static final tf D = tf.c("selectWorld.experimental");
   private final fcp E;
   private CompletableFuture<List<eby>> F;
   @Nullable
   private List<eby> G;
   private String H;
   private final fcu.b I;

   public fcu(fcp $$0, eqm $$1, int $$2, int $$3, int $$4, int $$5, int $$6, String $$7, @Nullable fcu $$8) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.E = $$0;
      this.I = new fcu.b($$1);
      this.H = $$7;
      if ($$8 != null) {
         this.F = $$8.F;
      } else {
         this.F = this.x();
      }

      this.a(this.v());
   }

   @Override
   protected void j() {
      this.i().forEach(fcu.a::close);
      super.j();
   }

   @Nullable
   private List<eby> v() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void w() {
      this.F = this.x();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ewc.a($$0)) {
         Optional<fcu.c> $$3 = this.d();
         if ($$3.isPresent()) {
            $$3.get().d();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      List<eby> $$4 = this.v();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eby> $$0) {
      if ($$0 == null) {
         this.y();
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

   private CompletableFuture<List<eby>> x() {
      ebx.a $$0;
      try {
         $$0 = this.c.l().b();
      } catch (ebw var3) {
         u.error("Couldn't load level list", var3);
         this.a(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fcj.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.l().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eby> $$1) {
      this.j();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eby $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fcu.c(this, $$2));
         }
      }

      this.z();
   }

   private boolean a(String $$0, eby $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void y() {
      this.j();
      this.b(this.I);
      this.z();
   }

   private void z() {
      this.E.d(true);
   }

   private void a(tf $$0) {
      this.c.a(new exd(tf.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable fcu.a $$0) {
      super.a($$0);
      this.E.a($$0 != null && $$0.b(), $$0 != null);
   }

   public Optional<fcu.c> d() {
      fcu.a $$0 = this.f();
      return $$0 instanceof fcu.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fcp e() {
      return this.E;
   }

   @Override
   public void b(evx $$0) {
      if (this.i().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.b($$0);
      }
   }

   public abstract static class a extends etd.a<fcu.a> implements AutoCloseable {
      public abstract boolean b();

      @Override
      public void close() {
      }
   }

   public static class b extends fcu.a {
      private static final tf a = tf.c("selectWorld.loading_list");
      private final eqm b;

      public b(eqm $$0) {
         this.b = $$0;
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.B.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = exk.a(ac.b());
         int $$13 = (this.b.B.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public tf a() {
         return a;
      }

      @Override
      public boolean b() {
         return false;
      }
   }

   public final class c extends fcu.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final eqm d;
      private final fcp e;
      private final eby f;
      private final exe g;
      @Nullable
      private Path h;
      private long i;

      public c(fcu $$1, eby $$2) {
         this.d = $$1.c;
         this.e = $$1.e();
         this.f = $$2;
         this.g = exe.a(this.d.Y(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.m();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<egv> $$1 = this.d.bb().a(this.h);
                  if (!$$1.isEmpty()) {
                     fcu.u.warn("{}", egt.a(this.h, $$1));
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
               fcu.u.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public tf a() {
         tf $$0 = tf.a("narrator.select.world_info", this.f.b(), new Date(this.f.f()), this.f.s());
         if (this.f.p()) {
            $$0 = te.a($$0, fcu.B);
         }

         if (this.f.e()) {
            $$0 = te.a($$0, fcu.D);
         }

         return tf.a("narrator.select", $$0);
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fcu.v.format(new Date($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = fzr.a("selectWorld.world") + " " + ($$1 + 1);
         }

         tf $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         RenderSystem.enableBlend();
         $$0.a(this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
         if (this.d.m.U().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            aer $$16 = $$15 ? fcu.s : fcu.t;
            aer $$17 = $$15 ? fcu.p : fcu.q;
            aer $$18 = $$15 ? fcu.a : fcu.m;
            aer $$19 = $$15 ? fcu.n : fcu.o;
            if (this.f instanceof eby.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fcu.B, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fcu.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fcu.x.f(), fcu.y.f()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fcu.z.f(), fcu.A.f()));
                  }
               }
            } else {
               $$0.a($$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.f.q()) {
            return true;
         } else {
            fcu.this.a((fcu.a)this);
            if ($$0 - (double)fcu.this.o() <= 32.0) {
               this.d();
               return true;
            } else if (ac.b() - this.i < 250L) {
               this.d();
               return true;
            } else {
               this.i = ac.b();
               return true;
            }
         }
      }

      public void d() {
         if (!this.f.q()) {
            if (this.f instanceof eby.b) {
               this.d.a(exo.a(this.e));
            } else {
               eby.a $$0 = this.f.o();
               if ($$0.a()) {
                  String $$1 = "selectWorld.backupQuestion." + $$0.c();
                  String $$2 = "selectWorld.backupWarning." + $$0.c();
                  ts $$3 = tf.c($$1);
                  if ($$0.b()) {
                     $$3.a(n.r, n.m);
                  }

                  tf $$4 = tf.a($$2, this.f.k(), aa.b().c());
                  this.d.a(new ewn(this.e, ($$0x, $$1x) -> {
                     if ($$0x) {
                        String $$2x = this.f.a();

                        try (ebx.c $$3x = this.d.l().c($$2x)) {
                           fcl.a($$3x);
                        } catch (IOException var9) {
                           eum.a(this.d, $$2x);
                           fcu.u.error("Failed to backup level {}", $$2x, var9);
                        } catch (egt var10) {
                           fcu.u.warn("{}", var10.getMessage());
                           this.d.a(exo.a(this.e));
                        }
                     }

                     this.k();
                  }, $$3, $$4, false));
               } else if (this.f.n()) {
                  this.d.a(new ews($$0x -> {
                     if ($$0x) {
                        try {
                           this.k();
                        } catch (Exception var3x) {
                           fcu.u.error("Failure to open 'future world'", var3x);
                           this.d.a(new ewm(() -> this.d.a(this.e), tf.c("selectWorld.futureworld.error.title"), tf.c("selectWorld.futureworld.error.text")));
                        }
                     } else {
                        this.d.a(this.e);
                     }
                  }, tf.c("selectWorld.versionQuestion"), tf.a("selectWorld.versionWarning", this.f.k()), tf.c("selectWorld.versionJoinButton"), te.e));
               } else {
                  this.k();
               }
            }
         }
      }

      public void e() {
         this.d.a(new ews($$0 -> {
            if ($$0) {
               this.d.a(new exx(true));
               this.f();
            }

            this.d.a(this.e);
         }, tf.c("selectWorld.deleteQuestion"), tf.a("selectWorld.deleteWarning", this.f.b()), tf.c("selectWorld.deleteButton"), te.e));
      }

      public void f() {
         ebx $$0 = this.d.l();
         String $$1 = this.f.a();

         try (ebx.c $$2 = $$0.d($$1)) {
            $$2.g();
         } catch (IOException var8) {
            eum.b(this.d, $$1);
            fcu.u.error("Failed to delete world {}", $$1, var8);
         }

         fcu.this.w();
      }

      public void g() {
         if (this.f instanceof eby.b) {
            this.d.a(exo.a(this.e));
         } else {
            this.l();
            String $$0 = this.f.a();

            try {
               ebx.c $$1 = this.d.l().c($$0);
               this.d.a(new fcl($$2 -> {
                  try {
                     $$1.close();
                  } catch (IOException var5) {
                     fcu.u.error("Failed to unlock level {}", $$0, var5);
                  }

                  if ($$2) {
                     fcu.this.w();
                  }

                  this.d.a(this.e);
               }, $$1));
            } catch (IOException var3) {
               eum.a(this.d, $$0);
               fcu.u.error("Failed to access level {}", $$0, var3);
               fcu.this.w();
            } catch (egt var4) {
               fcu.u.warn("{}", var4.getMessage());
               this.d.a(exo.a(this.e));
            }
         }
      }

      public void h() {
         if (this.f instanceof eby.b) {
            this.d.a(exo.a(this.e));
         } else {
            this.l();

            try (ebx.c $$0 = this.d.l().c(this.f.a())) {
               Pair<cpq, fcr> $$1 = this.d.y().a($$0);
               cpq $$2 = (cpq)$$1.getFirst();
               fcr $$3 = (fcr)$$1.getSecond();
               Path $$4 = fcj.a($$0.a(ebv.j), this.d);
               if ($$3.b().e()) {
                  this.d
                     .a(
                        new ews(
                           $$3x -> this.d.a((exz)($$3x ? fcj.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                           tf.c("selectWorld.recreate.customized.title"),
                           tf.c("selectWorld.recreate.customized.text"),
                           te.i,
                           te.e
                        )
                     );
               } else {
                  this.d.a(fcj.a(this.d, this.e, $$2, $$3, $$4));
               }
            } catch (egt var8) {
               fcu.u.warn("{}", var8.getMessage());
               this.d.a(exo.a(this.e));
            } catch (Exception var9) {
               fcu.u.error("Unable to recreate world", var9);
               this.d.a(new ewm(() -> this.d.a(this.e), tf.c("selectWorld.recreate.error.title"), tf.c("selectWorld.recreate.error.text")));
            }
         }
      }

      private void k() {
         this.d.ai().a(gbo.a(aow.yp, 1.0F));
         if (this.d.l().b(this.f.a())) {
            this.l();
            this.d.y().a(this.e, this.f.a());
         }
      }

      private void l() {
         this.d.d(new exf(tf.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(ekh.a($$1));
            } catch (Throwable var7) {
               fcu.u.error("Invalid icon for world {}", this.f.a(), var7);
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

      @Override
      public boolean b() {
         return !this.f.q();
      }
   }
}
