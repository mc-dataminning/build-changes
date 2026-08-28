import com.google.common.base.MoreObjects;
import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import javax.annotation.Nullable;

public class fgn {
   public static final int a = 10000;
   private final fgo b;
   private final ezy c = new ezy();
   private long d = -1L;
   private long e = -1L;
   private long f = -1L;
   private boolean g;

   public fgn(fgo $$0) {
      this.b = $$0;
   }

   private boolean a(int $$0) {
      switch ($$0) {
         case 69:
            this.b.B = !this.b.B;
            this.c("SectionPath: {0}", this.b.B ? "shown" : "hidden");
            return true;
         case 76:
            this.b.D = !this.b.D;
            this.c("SmartCull: {0}", this.b.D ? "enabled" : "disabled");
            return true;
         case 85:
            if (fod.s()) {
               this.b.f.n();
               this.c("Killed frustum");
            } else {
               this.b.f.m();
               this.c("Captured frustum");
            }

            return true;
         case 86:
            this.b.C = !this.b.C;
            this.c("SectionVisibility: {0}", this.b.C ? "enabled" : "disabled");
            return true;
         case 87:
            this.b.A = !this.b.A;
            this.c("WireFrame: {0}", this.b.A ? "enabled" : "disabled");
            return true;
         default:
            return false;
      }
   }

   private void a(n $$0, wz $$1) {
      this.b.l.d().a(wz.i().b(wz.c("debug.prefix").a($$0, n.r)).b(wy.v).b($$1));
   }

   private void a(wz $$0) {
      this.a(n.o, $$0);
   }

   private void a(String $$0, Object... $$1) {
      this.a(wz.b($$0, $$1));
   }

   private void b(String $$0, Object... $$1) {
      this.a(n.m, wz.b($$0, $$1));
   }

   private void c(String $$0, Object... $$1) {
      this.a(wz.b(MessageFormat.format($$0, $$1)));
   }

   private boolean b(int $$0) {
      if (this.d > 0L && this.d < ad.c() - 100L) {
         return true;
      } else {
         switch ($$0) {
            case 49:
               this.b.aN().k();
               return true;
            case 50:
               this.b.aN().j();
               return true;
            case 51:
               this.b.aN().i();
               return true;
            case 65:
               this.b.f.f();
               this.a("debug.reload_chunks.message");
               return true;
            case 66:
               boolean $$1 = !this.b.ap().a();
               this.b.ap().b($$1);
               this.a($$1 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (this.b.s.go()) {
                  return false;
               } else {
                  fzg $$7 = this.b.s.h;
                  if ($$7 == null) {
                     return false;
                  }

                  this.a("debug.copy_location.message");
                  this.a(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.b.s.dO().af().a(),
                        this.b.s.dt(),
                        this.b.s.dv(),
                        this.b.s.dz(),
                        this.b.s.dE(),
                        this.b.s.dG()
                     )
                  );
                  return true;
               }
            case 68:
               if (this.b.l != null) {
                  this.b.l.d().a(false);
               }

               return true;
            case 71:
               boolean $$2 = this.b.k.b();
               this.a($$2 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off");
               return true;
            case 72:
               this.b.m.m = !this.b.m.m;
               this.a(this.b.m.m ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off");
               this.b.m.aw();
               return true;
            case 73:
               if (!this.b.s.go()) {
                  this.a(this.b.s.l(2), !fod.s());
               }

               return true;
            case 76:
               if (this.b.a(this::a)) {
                  this.a("debug.profiling.start", 10);
               }

               return true;
            case 78:
               if (!this.b.s.l(2)) {
                  this.a("debug.creative_spectator.error");
               } else if (!this.b.s.R_()) {
                  this.b.s.h.d("gamemode spectator");
               } else {
                  this.b.s.h.d("gamemode " + ((dct)MoreObjects.firstNonNull(this.b.q.i(), dct.b)).b());
               }

               return true;
            case 80:
               this.b.m.n = !this.b.m.n;
               this.b.m.aw();
               this.a(this.b.m.n ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.a("debug.help.message");
               fin $$3 = this.b.l.d();
               $$3.a(wz.c("debug.reload_chunks.help"));
               $$3.a(wz.c("debug.show_hitboxes.help"));
               $$3.a(wz.c("debug.copy_location.help"));
               $$3.a(wz.c("debug.clear_chat.help"));
               $$3.a(wz.c("debug.chunk_boundaries.help"));
               $$3.a(wz.c("debug.advanced_tooltips.help"));
               $$3.a(wz.c("debug.inspect.help"));
               $$3.a(wz.c("debug.profiling.help"));
               $$3.a(wz.c("debug.creative_spectator.help"));
               $$3.a(wz.c("debug.pause_focus.help"));
               $$3.a(wz.c("debug.help.help"));
               $$3.a(wz.c("debug.dump_dynamic_textures.help"));
               $$3.a(wz.c("debug.reload_resourcepacks.help"));
               $$3.a(wz.c("debug.pause.help"));
               $$3.a(wz.c("debug.gamemodes.help"));
               return true;
            case 83:
               Path $$4 = this.b.p.toPath().toAbsolutePath();
               Path $$5 = TextureUtil.getDebugTexturePath($$4);
               this.b.aa().a($$5);
               wz $$6 = wz.b($$4.relativize($$5).toString()).a(n.t).a($$1x -> $$1x.a(new wx(wx.a.b, $$5.toFile().toString())));
               this.a("debug.dump_dynamic_textures", $$6);
               return true;
            case 84:
               this.a("debug.reload_resourcepacks.message");
               this.b.l();
               return true;
            case 293:
               if (!this.b.s.l(2)) {
                  this.a("debug.gamemodes.error");
               } else {
                  this.b.a(new fop());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void a(boolean $$0, boolean $$1) {
      exa $$2 = this.b.v;
      if ($$2 != null) {
         switch ($$2.c()) {
            case b:
               jd $$3 = ((ewy)$$2).a();
               dcw $$4 = this.b.s.dO();
               dtc $$5 = $$4.a_($$3);
               if ($$0) {
                  if ($$1) {
                     this.b.s.h.s().a($$3, $$2x -> {
                        this.a($$5, $$3, $$2x);
                        this.a("debug.inspect.server.block");
                     });
                  } else {
                     dqh $$6 = $$4.c_($$3);
                     ub $$7 = $$6 != null ? $$6.d($$4.H_()) : null;
                     this.a($$5, $$3, $$7);
                     this.a("debug.inspect.client.block");
                  }
               } else {
                  this.a($$5, $$3, null);
                  this.a("debug.inspect.client.block");
               }
               break;
            case c:
               bsr $$8 = ((ewz)$$2).a();
               akr $$9 = lt.f.b($$8.am());
               if ($$0) {
                  if ($$1) {
                     this.b.s.h.s().a($$8.an(), $$2x -> {
                        this.a($$9, $$8.dm(), $$2x);
                        this.a("debug.inspect.server.entity");
                     });
                  } else {
                     ub $$10 = $$8.f(new ub());
                     this.a($$9, $$8.dm(), $$10);
                     this.a("debug.inspect.client.entity");
                  }
               } else {
                  this.a($$9, $$8.dm(), null);
                  this.a("debug.inspect.client.entity");
               }
         }
      }
   }

   private void a(dtc $$0, jd $$1, @Nullable ub $$2) {
      StringBuilder $$3 = new StringBuilder(gn.a($$0));
      if ($$2 != null) {
         $$3.append($$2);
      }

      String $$4 = String.format(Locale.ROOT, "/setblock %d %d %d %s", $$1.u(), $$1.v(), $$1.w(), $$3);
      this.a($$4);
   }

   private void a(akr $$0, exc $$1, @Nullable ub $$2) {
      String $$4;
      if ($$2 != null) {
         $$2.r("UUID");
         $$2.r("Pos");
         $$2.r("Dimension");
         String $$3 = uq.c((uy)$$2).getString();
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", $$0, $$1.c, $$1.d, $$1.e, $$3);
      } else {
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", $$0, $$1.c, $$1.d, $$1.e);
      }

      this.a($$4);
   }

   public void a(long $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$0 == this.b.aM().j()) {
         boolean $$5 = fae.a(fgo.Q().aM().j(), 292);
         if (this.d > 0L) {
            if (!fae.a(fgo.Q().aM().j(), 67) || !$$5) {
               this.d = -1L;
            }
         } else if (fae.a(fgo.Q().aM().j(), 67) && $$5) {
            this.g = true;
            this.d = ad.c();
            this.e = ad.c();
            this.f = 0L;
         }

         fod $$6 = this.b.y;
         if ($$6 != null) {
            switch ($$1) {
               case 258:
                  this.b.a(fgl.d);
               case 259:
               case 260:
               case 261:
               default:
                  break;
               case 262:
               case 263:
               case 264:
               case 265:
                  this.b.a(fgl.c);
            }
         }

         if ($$3 == 1 && (!(this.b.y instanceof fro) || ((fro)$$6).u <= ad.c() - 20L)) {
            if (this.b.m.Q.a($$1, $$2)) {
               this.b.aM().i();
               this.b.m.aa().a(this.b.aM().k());
               return;
            }

            if (this.b.m.N.a($$1, $$2)) {
               if (fod.r()) {
               }

               fgy.a(this.b.p, this.b.h(), $$0x -> this.b.execute(() -> this.b.l.d().a($$0x)));
               return;
            }
         }

         if ($$3 != 0) {
            boolean $$7 = $$6 == null || !($$6.aN_() instanceof fiv) || !((fiv)$$6.aN_()).c();
            if ($$7) {
               if (fod.r() && $$1 == 66 && this.b.aV().a() && this.b.m.u().c()) {
                  boolean $$8 = this.b.m.as().c() == fgq.a;
                  this.b.m.as().a(fgq.a(this.b.m.as().c().a() + 1));
                  this.b.m.aw();
                  if ($$6 != null) {
                     $$6.e($$8);
                  }
               }

               geb var16 = this.b.s;
            }
         }

         if ($$6 != null) {
            boolean[] $$9 = new boolean[]{false};
            fod.a(() -> {
               if ($$3 == 1 || $$3 == 2) {
                  $$6.x();
                  $$9[0] = $$6.a($$1, $$2, $$4);
               } else if ($$3 == 0) {
                  $$9[0] = $$6.c($$1, $$2, $$4);
               }
            }, "keyPressed event handler", $$6.getClass().getCanonicalName());
            if ($$9[0]) {
               return;
            }
         }

         fae.a $$10;
         boolean $$11;
         boolean var10000;
         label180: {
            $$10 = fae.a($$1, $$2);
            $$11 = this.b.y == null;
            label141:
            if (!$$11) {
               if (this.b.y instanceof fny $$12 && !$$12.m()) {
                  break label141;
               }

               var10000 = false;
               break label180;
            }

            var10000 = true;
         }

         boolean $$13 = var10000;
         if ($$3 == 0) {
            fgm.a($$10, false);
            if ($$13 && $$1 == 292) {
               if (this.g) {
                  this.g = false;
               } else {
                  this.b.aN().h();
               }
            }
         } else {
            boolean $$14 = false;
            if ($$13) {
               if ($$1 == 293 && this.b.j != null) {
                  this.b.j.c();
               }

               if ($$1 == 256) {
                  this.b.b($$5);
                  $$14 |= $$5;
               }

               $$14 |= $$5 && this.b($$1);
               this.g |= $$14;
               if ($$1 == 290) {
                  this.b.m.Y = !this.b.m.Y;
               }

               if (this.b.aN().e() && !$$5 && $$1 >= 48 && $$1 <= 57) {
                  this.b.a($$1 - 48);
               }
            }

            if ($$11) {
               if ($$14) {
                  fgm.a($$10, false);
               } else {
                  fgm.a($$10, true);
                  fgm.a($$10);
               }
            }
         }
      }
   }

   private void a(long $$0, int $$1, int $$2) {
      if ($$0 == this.b.aM().j()) {
         fki $$3 = this.b.y;
         if ($$3 != null && this.b.aK() == null) {
            if (Character.charCount($$1) == 1) {
               fod.a(() -> $$3.a((char)$$1, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
            } else {
               for (char $$4 : Character.toChars($$1)) {
                  fod.a(() -> $$3.a($$4, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
               }
            }
         }
      }
   }

   public void a(long $$0) {
      fae.a(
         $$0,
         ($$0x, $$1, $$2, $$3, $$4) -> this.b.execute(() -> this.a($$0x, $$1, $$2, $$3, $$4)),
         ($$0x, $$1, $$2) -> this.b.execute(() -> this.a($$0x, $$1, $$2))
      );
   }

   public String a() {
      return this.c.a(this.b.aM().j(), ($$0, $$1) -> {
         if ($$0 != 65545) {
            this.b.aM().a($$0, $$1);
         }
      });
   }

   public void a(String $$0) {
      if (!$$0.isEmpty()) {
         this.c.a(this.b.aM().j(), $$0);
      }
   }

   public void b() {
      if (this.d > 0L) {
         long $$0 = ad.c();
         long $$1 = 10000L - ($$0 - this.d);
         long $$2 = $$0 - this.e;
         if ($$1 < 0L) {
            if (fod.r()) {
               eza.a();
            }

            String $$3 = "Manually triggered debug crash";
            o $$4 = new o("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
            p $$5 = $$4.a("Manual crash details");
            ayp.a($$5);
            throw new z($$4);
         }

         if ($$2 >= 1000L) {
            if (this.f == 0L) {
               this.a("debug.crash.message");
            } else {
               this.b("debug.crash.warning", ayo.f((float)$$1 / 1000.0F));
            }

            this.e = $$0;
            this.f++;
         }
      }
   }
}
