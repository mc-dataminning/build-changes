import com.google.common.base.MoreObjects;
import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import javax.annotation.Nullable;

public class foy {
   public static final int a = 10000;
   private final foz b;
   private final fhy c = new fhy();
   private long d = -1L;
   private long e = -1L;
   private long f = -1L;
   private boolean g;

   public foy(foz $$0) {
      this.b = $$0;
   }

   private boolean a(int $$0) {
      switch ($$0) {
         case 69:
            this.b.C = !this.b.C;
            this.c("SectionPath: {0}", this.b.C ? "shown" : "hidden");
            return true;
         case 70:
            boolean $$2 = gpp.a();
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
            if (fyb.t()) {
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

   private void a(n $$0, wy $$1) {
      this.b.m.d().a(wy.i().b(wy.c("debug.prefix").a($$0, n.r)).b(wx.v).b($$1));
   }

   private void a(wy $$0) {
      this.a(n.o, $$0);
   }

   private void a(String $$0, Object... $$1) {
      this.a(wy.b($$0, $$1));
   }

   private void b(String $$0, Object... $$1) {
      this.a(n.m, wy.b($$0, $$1));
   }

   private void c(String $$0, Object... $$1) {
      this.a(wy.b(MessageFormat.format($$0, $$1)));
   }

   private boolean b(int $$0) {
      if (this.d > 0L && this.d < af.c() - 100L) {
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
               if (this.b.t.gA()) {
                  return false;
               } else {
                  gka $$7 = this.b.t.j;
                  if ($$7 == null) {
                     return false;
                  }

                  this.a("debug.copy_location.message");
                  this.a(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.b.t.dV().aj().a(),
                        this.b.t.dA(),
                        this.b.t.dC(),
                        this.b.t.dG(),
                        this.b.t.dL(),
                        this.b.t.dN()
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
               this.b.n.az();
               return true;
            case 73:
               if (!this.b.t.gA()) {
                  this.a(this.b.t.s(2), !fyb.t());
               }

               return true;
            case 76:
               if (this.b.b(this::a)) {
                  this.a("debug.profiling.start", 10);
               }

               return true;
            case 78:
               if (!this.b.t.s(2)) {
                  this.a("debug.creative_spectator.error");
               } else if (!this.b.t.V_()) {
                  this.b.t.j.d("gamemode spectator");
               } else {
                  this.b.t.j.d("gamemode " + ((dix)MoreObjects.firstNonNull(this.b.r.h(), dix.b)).b());
               }

               return true;
            case 80:
               this.b.n.n = !this.b.n.n;
               this.b.n.az();
               this.a(this.b.n.n ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.a("debug.help.message");
               fsk $$3 = this.b.m.d();
               $$3.a(wy.c("debug.reload_chunks.help"));
               $$3.a(wy.c("debug.show_hitboxes.help"));
               $$3.a(wy.c("debug.copy_location.help"));
               $$3.a(wy.c("debug.clear_chat.help"));
               $$3.a(wy.c("debug.chunk_boundaries.help"));
               $$3.a(wy.c("debug.advanced_tooltips.help"));
               $$3.a(wy.c("debug.inspect.help"));
               $$3.a(wy.c("debug.profiling.help"));
               $$3.a(wy.c("debug.creative_spectator.help"));
               $$3.a(wy.c("debug.pause_focus.help"));
               $$3.a(wy.c("debug.help.help"));
               $$3.a(wy.c("debug.dump_dynamic_textures.help"));
               $$3.a(wy.c("debug.reload_resourcepacks.help"));
               $$3.a(wy.c("debug.pause.help"));
               $$3.a(wy.c("debug.gamemodes.help"));
               return true;
            case 83:
               Path $$4 = this.b.q.toPath().toAbsolutePath();
               Path $$5 = TextureUtil.getDebugTexturePath($$4);
               this.b.aa().a($$5);
               wy $$6 = wy.b($$4.relativize($$5).toString()).a(n.t).a($$1x -> $$1x.a(new ww.d($$5)));
               this.a("debug.dump_dynamic_textures", $$6);
               return true;
            case 84:
               this.a("debug.reload_resourcepacks.message");
               this.b.l();
               return true;
            case 293:
               if (!this.b.t.s(2)) {
                  this.a("debug.gamemodes.error");
               } else {
                  this.b.a(new fyn());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void a(boolean $$0, boolean $$1) {
      feo $$2 = this.b.w;
      if ($$2 != null) {
         switch ($$2.d()) {
            case b:
               iu $$3 = ((fem)$$2).b();
               dja $$4 = this.b.t.dV();
               eah $$5 = $$4.a_($$3);
               if ($$0) {
                  if ($$1) {
                     this.b.t.j.s().a($$3, $$2x -> {
                        this.a($$5, $$3, $$2x);
                        this.a("debug.inspect.server.block");
                     });
                  } else {
                     dxf $$6 = $$4.c_($$3);
                     tz $$7 = $$6 != null ? $$6.d($$4.F_()) : null;
                     this.a($$5, $$3, $$7);
                     this.a("debug.inspect.client.block");
                  }
               } else {
                  this.a($$5, $$3, null);
                  this.a("debug.inspect.client.block");
               }
               break;
            case c:
               bwf $$8 = ((fen)$$2).a();
               alg $$9 = mf.f.b($$8.aq());
               if ($$0) {
                  if ($$1) {
                     this.b.t.j.s().a($$8.ar(), $$2x -> {
                        this.a($$9, $$8.dt(), $$2x);
                        this.a("debug.inspect.server.entity");
                     });
                  } else {
                     tz $$10 = $$8.f(new tz());
                     this.a($$9, $$8.dt(), $$10);
                     this.a("debug.inspect.client.entity");
                  }
               } else {
                  this.a($$9, $$8.dt(), null);
                  this.a("debug.inspect.client.entity");
               }
         }
      }
   }

   private void a(eah $$0, iu $$1, @Nullable tz $$2) {
      StringBuilder $$3 = new StringBuilder(gd.a($$0));
      if ($$2 != null) {
         $$3.append($$2);
      }

      String $$4 = String.format(Locale.ROOT, "/setblock %d %d %d %s", $$1.u(), $$1.v(), $$1.w(), $$3);
      this.a($$4);
   }

   private void a(alg $$0, feq $$1, @Nullable tz $$2) {
      String $$4;
      if ($$2 != null) {
         $$2.r("UUID");
         $$2.r("Pos");
         $$2.r("Dimension");
         String $$3 = uo.c((uw)$$2).getString();
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", $$0, $$1.d, $$1.e, $$1.f, $$3);
      } else {
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", $$0, $$1.d, $$1.e, $$1.f);
      }

      this.a($$4);
   }

   public void a(long $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$0 == this.b.aO().h()) {
         this.b.aP().d();
         boolean $$5 = fif.a(foz.Q().aO().h(), 292);
         if (this.d > 0L) {
            if (!fif.a(foz.Q().aO().h(), 67) || !$$5) {
               this.d = -1L;
            }
         } else if (fif.a(foz.Q().aO().h(), 67) && $$5) {
            this.g = true;
            this.d = af.c();
            this.e = af.c();
            this.f = 0L;
         }

         fyb $$6 = this.b.z;
         if ($$6 != null) {
            switch ($$1) {
               case 258:
                  this.b.a(fow.d);
               case 259:
               case 260:
               case 261:
               default:
                  break;
               case 262:
               case 263:
               case 264:
               case 265:
                  this.b.a(fow.c);
            }
         }

         if ($$3 == 1 && (!(this.b.z instanceof gbo) || ((gbo)$$6).u <= af.c() - 20L)) {
            if (this.b.n.P.a($$1, $$2)) {
               this.b.aO().g();
               boolean $$7 = this.b.aO().i();
               this.b.n.ad().a($$7);
               this.b.n.az();
               if (this.b.z instanceof gbl $$8) {
                  $$8.c($$7);
               }

               return;
            }

            if (this.b.n.M.a($$1, $$2)) {
               if (fyb.s()) {
               }

               fph.a(this.b.q, this.b.h(), $$0x -> this.b.execute(() -> this.b.m.d().a($$0x)));
               return;
            }
         }

         if ($$3 != 0) {
            boolean $$9 = $$6 == null || !($$6.aI_() instanceof fss) || !((fss)$$6.aI_()).c();
            if ($$9) {
               if (fyb.s() && $$1 == 66 && this.b.aY().a() && this.b.n.w().c()) {
                  boolean $$10 = this.b.n.av().c() == fpb.a;
                  this.b.n.av().a(fpb.a(this.b.n.av().c().a() + 1));
                  this.b.n.az();
                  if ($$6 != null) {
                     $$6.e($$10);
                  }
               }

               gox var17 = this.b.t;
            }
         }

         if ($$6 != null) {
            try {
               if ($$3 != 1 && $$3 != 2) {
                  if ($$3 == 0 && $$6.c($$1, $$2, $$4)) {
                     return;
                  }
               } else {
                  $$6.x();
                  if ($$6.a($$1, $$2, $$4)) {
                     return;
                  }
               }
            } catch (Throwable var14) {
               o $$12 = o.a(var14, "keyPressed event handler");
               $$6.a($$12);
               p $$13 = $$12.a("Key");
               $$13.a("Key", $$1);
               $$13.a("Scancode", $$2);
               $$13.a("Mods", $$4);
               throw new z($$12);
            }
         }

         fif.a $$14;
         boolean $$15;
         boolean var10000;
         label201: {
            $$14 = fif.a($$1, $$2);
            $$15 = this.b.z == null;
            label157:
            if (!$$15) {
               if (this.b.z instanceof fxw $$16 && !$$16.m()) {
                  break label157;
               }

               var10000 = false;
               break label201;
            }

            var10000 = true;
         }

         boolean $$17 = var10000;
         if ($$3 == 0) {
            fox.a($$14, false);
            if ($$17 && $$1 == 292) {
               if (this.g) {
                  this.g = false;
               } else {
                  this.b.aQ().h();
               }
            }
         } else {
            boolean $$18 = false;
            if ($$17) {
               if ($$1 == 293 && this.b.j != null) {
                  this.b.j.c();
               }

               if ($$1 == 256) {
                  this.b.b($$5);
                  $$18 |= $$5;
               }

               $$18 |= $$5 && this.b($$1);
               this.g |= $$18;
               if ($$1 == 290) {
                  this.b.n.X = !this.b.n.X;
               }

               if (this.b.aQ().e() && !$$5 && $$1 >= 48 && $$1 <= 57) {
                  this.b.aQ().o().b($$1 - 48);
               }
            }

            if ($$15) {
               if ($$18) {
                  fox.a($$14, false);
               } else {
                  fox.a($$14, true);
                  fox.a($$14);
               }
            }
         }
      }
   }

   private void a(long $$0, int $$1, int $$2) {
      if ($$0 == this.b.aO().h()) {
         fyb $$3 = this.b.z;
         if ($$3 != null && this.b.aM() == null) {
            try {
               if (Character.isBmpCodePoint($$1)) {
                  $$3.a((char)$$1, $$2);
               } else if (Character.isValidCodePoint($$1)) {
                  $$3.a(Character.highSurrogate($$1), $$2);
                  $$3.a(Character.lowSurrogate($$1), $$2);
               }
            } catch (Throwable var9) {
               o $$5 = o.a(var9, "charTyped event handler");
               $$3.a($$5);
               p $$6 = $$5.a("Key");
               $$6.a("Codepoint", $$1);
               $$6.a("Mods", $$2);
               throw new z($$5);
            }
         }
      }
   }

   public void a(long $$0) {
      fif.a(
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
         long $$0 = af.c();
         long $$1 = 10000L - ($$0 - this.d);
         long $$2 = $$0 - this.e;
         if ($$1 < 0L) {
            if (fyb.s()) {
               fgp.a();
            }

            String $$3 = "Manually triggered debug crash";
            o $$4 = new o("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
            p $$5 = $$4.a("Manual crash details");
            azn.a($$5);
            throw new z($$4);
         }

         if ($$2 >= 1000L) {
            if (this.f == 0L) {
               this.a("debug.crash.message");
            } else {
               this.b("debug.crash.warning", azm.f((float)$$1 / 1000.0F));
            }

            this.e = $$0;
            this.f++;
         }
      }
   }
}
