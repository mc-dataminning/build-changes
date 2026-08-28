import com.google.common.base.MoreObjects;
import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import javax.annotation.Nullable;

public class fjw {
   public static final int a = 10000;
   private final fjx b;
   private final fcy c = new fcy();
   private long d = -1L;
   private long e = -1L;
   private long f = -1L;
   private boolean g;

   public fjw(fjx $$0) {
      this.b = $$0;
   }

   private boolean a(int $$0) {
      switch ($$0) {
         case 69:
            this.b.C = !this.b.C;
            this.c("SectionPath: {0}", this.b.C ? "shown" : "hidden");
            return true;
         case 70:
            boolean $$2 = gim.a();
            this.c("Fog: {0}", $$2 ? "enabled" : "disabled");
            return true;
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 77:
         case 78:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         default:
            return false;
         case 76:
            this.b.E = !this.b.E;
            this.c("SmartCull: {0}", this.b.E ? "enabled" : "disabled");
            return true;
         case 79:
            boolean $$1 = this.b.l.c();
            this.c("Frustum culling Octree: {0}", $$1 ? "enabled" : "disabled");
            return true;
         case 85:
            if (frp.t()) {
               this.b.f.m();
               this.c("Killed frustum");
            } else {
               this.b.f.l();
               this.c("Captured frustum");
            }

            return true;
         case 86:
            this.b.D = !this.b.D;
            this.c("SectionVisibility: {0}", this.b.D ? "enabled" : "disabled");
            return true;
         case 87:
            this.b.B = !this.b.B;
            this.c("WireFrame: {0}", this.b.B ? "enabled" : "disabled");
            return true;
      }
   }

   private void a(n $$0, xl $$1) {
      this.b.m.d().a(xl.i().b(xl.c("debug.prefix").a($$0, n.r)).b(xk.v).b($$1));
   }

   private void a(xl $$0) {
      this.a(n.o, $$0);
   }

   private void a(String $$0, Object... $$1) {
      this.a(xl.b($$0, $$1));
   }

   private void b(String $$0, Object... $$1) {
      this.a(n.m, xl.b($$0, $$1));
   }

   private void c(String $$0, Object... $$1) {
      this.a(xl.b(MessageFormat.format($$0, $$1)));
   }

   private boolean b(int $$0) {
      if (this.d > 0L && this.d < ae.c() - 100L) {
         return true;
      } else {
         switch ($$0) {
            case 49:
               this.b.aQ().k();
               return true;
            case 50:
               this.b.aQ().j();
               return true;
            case 51:
               this.b.aQ().i();
               return true;
            case 65:
               this.b.f.e();
               this.a("debug.reload_chunks.message");
               return true;
            case 66:
               boolean $$1 = !this.b.aq().a();
               this.b.aq().b($$1);
               this.a($$1 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (this.b.t.gC()) {
                  return false;
               } else {
                  gcz $$7 = this.b.t.j;
                  if ($$7 == null) {
                     return false;
                  }

                  this.a("debug.copy_location.message");
                  this.a(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.b.t.dY().ag().a(),
                        this.b.t.dD(),
                        this.b.t.dF(),
                        this.b.t.dJ(),
                        this.b.t.dO(),
                        this.b.t.dQ()
                     )
                  );
                  return true;
               }
            case 68:
               if (this.b.m != null) {
                  this.b.m.d().a(false);
               }

               return true;
            case 71:
               boolean $$2 = this.b.l.b();
               this.a($$2 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off");
               return true;
            case 72:
               this.b.n.m = !this.b.n.m;
               this.a(this.b.n.m ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off");
               this.b.n.ay();
               return true;
            case 73:
               if (!this.b.t.gC()) {
                  this.a(this.b.t.l(2), !frp.t());
               }

               return true;
            case 76:
               if (this.b.b(this::a)) {
                  this.a("debug.profiling.start", 10);
               }

               return true;
            case 78:
               if (!this.b.t.l(2)) {
                  this.a("debug.creative_spectator.error");
               } else if (!this.b.t.R_()) {
                  this.b.t.j.d("gamemode spectator");
               } else {
                  this.b.t.j.d("gamemode " + ((dfc)MoreObjects.firstNonNull(this.b.r.i(), dfc.b)).b());
               }

               return true;
            case 80:
               this.b.n.n = !this.b.n.n;
               this.b.n.ay();
               this.a(this.b.n.n ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.a("debug.help.message");
               flx $$3 = this.b.m.d();
               $$3.a(xl.c("debug.reload_chunks.help"));
               $$3.a(xl.c("debug.show_hitboxes.help"));
               $$3.a(xl.c("debug.copy_location.help"));
               $$3.a(xl.c("debug.clear_chat.help"));
               $$3.a(xl.c("debug.chunk_boundaries.help"));
               $$3.a(xl.c("debug.advanced_tooltips.help"));
               $$3.a(xl.c("debug.inspect.help"));
               $$3.a(xl.c("debug.profiling.help"));
               $$3.a(xl.c("debug.creative_spectator.help"));
               $$3.a(xl.c("debug.pause_focus.help"));
               $$3.a(xl.c("debug.help.help"));
               $$3.a(xl.c("debug.dump_dynamic_textures.help"));
               $$3.a(xl.c("debug.reload_resourcepacks.help"));
               $$3.a(xl.c("debug.pause.help"));
               $$3.a(xl.c("debug.gamemodes.help"));
               return true;
            case 83:
               Path $$4 = this.b.q.toPath().toAbsolutePath();
               Path $$5 = TextureUtil.getDebugTexturePath($$4);
               this.b.aa().a($$5);
               xl $$6 = xl.b($$4.relativize($$5).toString()).a(n.t).a($$1x -> $$1x.a(new xj(xj.a.b, $$5.toFile().toString())));
               this.a("debug.dump_dynamic_textures", $$6);
               return true;
            case 84:
               this.a("debug.reload_resourcepacks.message");
               this.b.l();
               return true;
            case 293:
               if (!this.b.t.l(2)) {
                  this.a("debug.gamemodes.error");
               } else {
                  this.b.a(new fsb());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void a(boolean $$0, boolean $$1) {
      ezp $$2 = this.b.w;
      if ($$2 != null) {
         switch ($$2.d()) {
            case b:
               jh $$3 = ((ezn)$$2).b();
               dff $$4 = this.b.t.dY();
               dvo $$5 = $$4.a_($$3);
               if ($$0) {
                  if ($$1) {
                     this.b.t.j.s().a($$3, $$2x -> {
                        this.a($$5, $$3, $$2x);
                        this.a("debug.inspect.server.block");
                     });
                  } else {
                     dsr $$6 = $$4.c_($$3);
                     un $$7 = $$6 != null ? $$6.d($$4.H_()) : null;
                     this.a($$5, $$3, $$7);
                     this.a("debug.inspect.client.block");
                  }
               } else {
                  this.a($$5, $$3, null);
                  this.a("debug.inspect.client.block");
               }
               break;
            case c:
               bui $$8 = ((ezo)$$2).a();
               all $$9 = lz.f.b($$8.ar());
               if ($$0) {
                  if ($$1) {
                     this.b.t.j.s().a($$8.as(), $$2x -> {
                        this.a($$9, $$8.dw(), $$2x);
                        this.a("debug.inspect.server.entity");
                     });
                  } else {
                     un $$10 = $$8.f(new un());
                     this.a($$9, $$8.dw(), $$10);
                     this.a("debug.inspect.client.entity");
                  }
               } else {
                  this.a($$9, $$8.dw(), null);
                  this.a("debug.inspect.client.entity");
               }
         }
      }
   }

   private void a(dvo $$0, jh $$1, @Nullable un $$2) {
      StringBuilder $$3 = new StringBuilder(gq.a($$0));
      if ($$2 != null) {
         $$3.append($$2);
      }

      String $$4 = String.format(Locale.ROOT, "/setblock %d %d %d %s", $$1.u(), $$1.v(), $$1.w(), $$3);
      this.a($$4);
   }

   private void a(all $$0, ezr $$1, @Nullable un $$2) {
      String $$4;
      if ($$2 != null) {
         $$2.r("UUID");
         $$2.r("Pos");
         $$2.r("Dimension");
         String $$3 = vc.c((vk)$$2).getString();
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", $$0, $$1.d, $$1.e, $$1.f, $$3);
      } else {
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", $$0, $$1.d, $$1.e, $$1.f);
      }

      this.a($$4);
   }

   public void a(long $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$0 == this.b.aO().h()) {
         this.b.aP().b();
         boolean $$5 = fdf.a(fjx.Q().aO().h(), 292);
         if (this.d > 0L) {
            if (!fdf.a(fjx.Q().aO().h(), 67) || !$$5) {
               this.d = -1L;
            }
         } else if (fdf.a(fjx.Q().aO().h(), 67) && $$5) {
            this.g = true;
            this.d = ae.c();
            this.e = ae.c();
            this.f = 0L;
         }

         frp $$6 = this.b.z;
         if ($$6 != null) {
            switch ($$1) {
               case 258:
                  this.b.a(fju.d);
               case 259:
               case 260:
               case 261:
               default:
                  break;
               case 262:
               case 263:
               case 264:
               case 265:
                  this.b.a(fju.c);
            }
         }

         if ($$3 == 1 && (!(this.b.z instanceof fuz) || ((fuz)$$6).u <= ae.c() - 20L)) {
            if (this.b.n.P.a($$1, $$2)) {
               this.b.aO().g();
               this.b.n.ac().a(this.b.aO().i());
               return;
            }

            if (this.b.n.M.a($$1, $$2)) {
               if (frp.s()) {
               }

               fkg.a(this.b.q, this.b.h(), $$0x -> this.b.execute(() -> this.b.m.d().a($$0x)));
               return;
            }
         }

         if ($$3 != 0) {
            boolean $$7 = $$6 == null || !($$6.aL_() instanceof fmf) || !((fmf)$$6.aL_()).c();
            if ($$7) {
               if (frp.s() && $$1 == 66 && this.b.aZ().a() && this.b.n.v().c()) {
                  boolean $$8 = this.b.n.au().c() == fjz.a;
                  this.b.n.au().a(fjz.a(this.b.n.au().c().a() + 1));
                  this.b.n.ay();
                  if ($$6 != null) {
                     $$6.e($$8);
                  }
               }

               ght var16 = this.b.t;
            }
         }

         if ($$6 != null) {
            boolean[] $$9 = new boolean[]{false};
            frp.a(() -> {
               if ($$3 == 1 || $$3 == 2) {
                  $$6.y();
                  $$9[0] = $$6.a($$1, $$2, $$4);
               } else if ($$3 == 0) {
                  $$9[0] = $$6.c($$1, $$2, $$4);
               }
            }, "keyPressed event handler", $$6.getClass().getCanonicalName());
            if ($$9[0]) {
               return;
            }
         }

         fdf.a $$10;
         boolean $$11;
         boolean var10000;
         label180: {
            $$10 = fdf.a($$1, $$2);
            $$11 = this.b.z == null;
            label141:
            if (!$$11) {
               if (this.b.z instanceof frk $$12 && !$$12.m()) {
                  break label141;
               }

               var10000 = false;
               break label180;
            }

            var10000 = true;
         }

         boolean $$13 = var10000;
         if ($$3 == 0) {
            fjv.a($$10, false);
            if ($$13 && $$1 == 292) {
               if (this.g) {
                  this.g = false;
               } else {
                  this.b.aQ().h();
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
                  this.b.n.X = !this.b.n.X;
               }

               if (this.b.aQ().e() && !$$5 && $$1 >= 48 && $$1 <= 57) {
                  this.b.aQ().o().b($$1 - 48);
               }
            }

            if ($$11) {
               if ($$14) {
                  fjv.a($$10, false);
               } else {
                  fjv.a($$10, true);
                  fjv.a($$10);
               }
            }
         }
      }
   }

   private void a(long $$0, int $$1, int $$2) {
      if ($$0 == this.b.aO().h()) {
         fnt $$3 = this.b.z;
         if ($$3 != null && this.b.aM() == null) {
            if (Character.charCount($$1) == 1) {
               frp.a(() -> $$3.a((char)$$1, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
            } else {
               for (char $$4 : Character.toChars($$1)) {
                  frp.a(() -> $$3.a($$4, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
               }
            }
         }
      }
   }

   public void a(long $$0) {
      fdf.a(
         $$0,
         ($$0x, $$1, $$2, $$3, $$4) -> this.b.execute(() -> this.a($$0x, $$1, $$2, $$3, $$4)),
         ($$0x, $$1, $$2) -> this.b.execute(() -> this.a($$0x, $$1, $$2))
      );
   }

   public String a() {
      return this.c.a(this.b.aO().h(), ($$0, $$1) -> {
         if ($$0 != 65545) {
            this.b.aO().a($$0, $$1);
         }
      });
   }

   public void a(String $$0) {
      if (!$$0.isEmpty()) {
         this.c.a(this.b.aO().h(), $$0);
      }
   }

   public void b() {
      if (this.d > 0L) {
         long $$0 = ae.c();
         long $$1 = 10000L - ($$0 - this.d);
         long $$2 = $$0 - this.e;
         if ($$1 < 0L) {
            if (frp.s()) {
               fbq.a();
            }

            String $$3 = "Manually triggered debug crash";
            o $$4 = new o("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
            p $$5 = $$4.a("Manual crash details");
            azo.a($$5);
            throw new z($$4);
         }

         if ($$2 >= 1000L) {
            if (this.f == 0L) {
               this.a("debug.crash.message");
            } else {
               this.b("debug.crash.warning", azn.f((float)$$1 / 1000.0F));
            }

            this.e = $$0;
            this.f++;
         }
      }
   }
}
