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

public class fed extends euf<fed.a> {
   static final afw a = new afw("world_list/error_highlighted");
   static final afw m = new afw("world_list/error");
   static final afw n = new afw("world_list/marked_join_highlighted");
   static final afw o = new afw("world_list/marked_join");
   static final afw p = new afw("world_list/warning_highlighted");
   static final afw q = new afw("world_list/warning");
   static final afw s = new afw("world_list/join_highlighted");
   static final afw t = new afw("world_list/join");
   static final Logger u = LogUtils.getLogger();
   static final DateFormat v = new SimpleDateFormat();
   private static final afw w = new afw("textures/misc/unknown_server.png");
   static final ui x = ui.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final ui y = ui.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final ui z = ui.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final ui A = ui.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final ui B = ui.c("selectWorld.locked").a(n.m);
   static final ui C = ui.c("selectWorld.conversion.tooltip").a(n.m);
   static final ui D = ui.c("selectWorld.experimental");
   private final fdy E;
   private CompletableFuture<List<ecz>> F;
   @Nullable
   private List<ecz> G;
   private String H;
   private final fed.b I;

   public fed(fdy $$0, ero $$1, int $$2, int $$3, int $$4, int $$5, int $$6, String $$7, @Nullable fed $$8) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.E = $$0;
      this.I = new fed.b($$1);
      this.H = $$7;
      if ($$8 != null) {
         this.F = $$8.F;
      } else {
         this.F = this.y();
      }

      this.a(this.w());
   }

   @Override
   protected void j() {
      this.i().forEach(fed.a::close);
      super.j();
   }

   @Nullable
   private List<ecz> w() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void x() {
      this.F = this.y();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (exh.a($$0)) {
         Optional<fed.c> $$3 = this.e();
         if ($$3.isPresent()) {
            $$3.get().c();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      List<ecz> $$4 = this.w();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ecz> $$0) {
      if ($$0 == null) {
         this.z();
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

   private CompletableFuture<List<ecz>> y() {
      ecy.a $$0;
      try {
         $$0 = this.c.l().b();
      } catch (ecx var3) {
         u.error("Couldn't load level list", var3);
         this.a(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fds.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.l().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ecz> $$1) {
      this.j();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ecz $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fed.c(this, $$2));
         }
      }

      this.A();
   }

   private boolean a(String $$0, ecz $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void z() {
      this.j();
      this.b(this.I);
      this.A();
   }

   private void A() {
      this.E.d(true);
   }

   private void a(ui $$0) {
      this.c.a(new eyi(ui.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable fed.a $$0) {
      super.a($$0);
      this.E.a($$0 != null && $$0.b(), $$0 != null);
   }

   public Optional<fed.c> e() {
      fed.a $$0 = this.f();
      return $$0 instanceof fed.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fdy v() {
      return this.E;
   }

   @Override
   public void b(exc $$0) {
      if (this.i().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.b($$0);
      }
   }

   public abstract static class a extends euf.a<fed.a> implements AutoCloseable {
      public abstract boolean b();

      @Override
      public void close() {
      }
   }

   public static class b extends fed.a {
      private static final ui a = ui.c("selectWorld.loading_list");
      private final ero b;

      public b(ero $$0) {
         this.b = $$0;
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = eyp.a(ac.b());
         int $$13 = (this.b.y.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public ui a() {
         return a;
      }

      @Override
      public boolean b() {
         return false;
      }
   }

   public final class c extends fed.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final ero d;
      private final fdy e;
      private final ecz f;
      private final eyj g;
      @Nullable
      private Path h;
      private long i;

      public c(fed $$1, ecz $$2) {
         this.d = $$1.c;
         this.e = $$1.v();
         this.f = $$2;
         this.g = eyj.a(this.d.Y(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.m();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<ehw> $$1 = this.d.bb().a(this.h);
                  if (!$$1.isEmpty()) {
                     fed.u.warn("{}", ehu.a(this.h, $$1));
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
               fed.u.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public ui a() {
         ui $$0 = ui.a("narrator.select.world_info", this.f.b(), ui.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = uh.a($$0, fed.B);
         }

         if (this.f.e()) {
            $$0 = uh.a($$0, fed.D);
         }

         return ui.a("narrator.select", $$0);
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fed.v.format(new Date($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gbg.a("selectWorld.world") + " " + ($$1 + 1);
         }

         ui $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         RenderSystem.enableBlend();
         $$0.a(this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
         if (this.d.m.V().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            afw $$16 = $$15 ? fed.s : fed.t;
            afw $$17 = $$15 ? fed.p : fed.q;
            afw $$18 = $$15 ? fed.a : fed.m;
            afw $$19 = $$15 ? fed.n : fed.o;
            if (this.f instanceof ecz.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fed.B, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fed.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fed.x.g(), fed.y.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fed.z.g(), fed.A.g()));
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
            fed.this.a((fed.a)this);
            if ($$0 - (double)fed.this.o() <= 32.0) {
               this.c();
               return true;
            } else if (ac.b() - this.i < 250L) {
               this.c();
               return true;
            } else {
               this.i = ac.b();
               return true;
            }
         }
      }

      public void c() {
         if (!this.f.q()) {
            if (this.f instanceof ecz.b) {
               this.d.a(eyt.a(this.e));
            } else {
               ecz.a $$0 = this.f.o();
               if ($$0.a()) {
                  String $$1 = "selectWorld.backupQuestion." + $$0.c();
                  String $$2 = "selectWorld.backupWarning." + $$0.c();
                  uw $$3 = ui.c($$1);
                  if ($$0.b()) {
                     $$3.a($$0x -> $$0x.a(-2142128));
                  }

                  ui $$4 = ui.a($$2, this.f.k(), aa.b().c());
                  this.d.a(new exs(this.e, ($$0x, $$1x) -> {
                     if ($$0x) {
                        String $$2x = this.f.a();

                        try (ecy.c $$3x = this.d.l().d($$2x)) {
                           fdu.a($$3x);
                        } catch (IOException var9) {
                           evq.a(this.d, $$2x);
                           fed.u.error("Failed to backup level {}", $$2x, var9);
                        } catch (ehu var10) {
                           fed.u.warn("{}", var10.getMessage());
                           this.d.a(eyt.a(this.e));
                        }
                     }

                     this.k();
                  }, $$3, $$4, false));
               } else if (this.f.n()) {
                  this.d.a(new exx($$0x -> {
                     if ($$0x) {
                        try {
                           this.k();
                        } catch (Exception var3x) {
                           fed.u.error("Failure to open 'future world'", var3x);
                           this.d.a(new exr(() -> this.d.a(this.e), ui.c("selectWorld.futureworld.error.title"), ui.c("selectWorld.futureworld.error.text")));
                        }
                     } else {
                        this.d.a(this.e);
                     }
                  }, ui.c("selectWorld.versionQuestion"), ui.a("selectWorld.versionWarning", this.f.k()), ui.c("selectWorld.versionJoinButton"), uh.e));
               } else {
                  this.k();
               }
            }
         }
      }

      public void e() {
         this.d.a(new exx($$0 -> {
            if ($$0) {
               this.d.a(new ezb(true));
               this.f();
            }

            this.d.a(this.e);
         }, ui.c("selectWorld.deleteQuestion"), ui.a("selectWorld.deleteWarning", this.f.b()), ui.c("selectWorld.deleteButton"), uh.e));
      }

      public void f() {
         ecy $$0 = this.d.l();
         String $$1 = this.f.a();

         try (ecy.c $$2 = $$0.e($$1)) {
            $$2.g();
         } catch (IOException var8) {
            evq.b(this.d, $$1);
            fed.u.error("Failed to delete world {}", $$1, var8);
         }

         fed.this.x();
      }

      public void g() {
         if (this.f instanceof ecz.b) {
            this.d.a(eyt.a(this.e));
         } else {
            this.l();
            String $$0 = this.f.a();

            try {
               ecy.c $$1 = this.d.l().d($$0);
               this.d.a(new fdu($$2 -> {
                  try {
                     $$1.close();
                  } catch (IOException var5) {
                     fed.u.error("Failed to unlock level {}", $$0, var5);
                  }

                  if ($$2) {
                     fed.this.x();
                  }

                  this.d.a(this.e);
               }, $$1));
            } catch (IOException var3) {
               evq.a(this.d, $$0);
               fed.u.error("Failed to access level {}", $$0, var3);
               fed.this.x();
            } catch (ehu var4) {
               fed.u.warn("{}", var4.getMessage());
               this.d.a(eyt.a(this.e));
            }
         }
      }

      public void h() {
         if (this.f instanceof ecz.b) {
            this.d.a(eyt.a(this.e));
         } else {
            this.l();

            try (ecy.c $$0 = this.d.l().d(this.f.a())) {
               Pair<crd, fea> $$1 = this.d.y().a($$0);
               crd $$2 = (crd)$$1.getFirst();
               fea $$3 = (fea)$$1.getSecond();
               Path $$4 = fds.a($$0.a(ecw.j), this.d);
               if ($$3.b().e()) {
                  this.d
                     .a(
                        new exx(
                           $$3x -> this.d.a((ezd)($$3x ? fds.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                           ui.c("selectWorld.recreate.customized.title"),
                           ui.c("selectWorld.recreate.customized.text"),
                           uh.i,
                           uh.e
                        )
                     );
               } else {
                  this.d.a(fds.a(this.d, this.e, $$2, $$3, $$4));
               }
            } catch (ehu var8) {
               fed.u.warn("{}", var8.getMessage());
               this.d.a(eyt.a(this.e));
            } catch (Exception var9) {
               fed.u.error("Unable to recreate world", var9);
               this.d.a(new exr(() -> this.d.a(this.e), ui.c("selectWorld.recreate.error.title"), ui.c("selectWorld.recreate.error.text")));
            }
         }
      }

      private void k() {
         this.d.ai().a(gdd.a(aqd.yw, 1.0F));
         if (this.d.l().b(this.f.a())) {
            this.l();
            this.d.y().a(this.e, this.f.a());
         }
      }

      private void l() {
         this.d.d(new eyk(ui.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(eli.a($$1));
            } catch (Throwable var7) {
               fed.u.error("Invalid icon for world {}", this.f.a(), var7);
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
