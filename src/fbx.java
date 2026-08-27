import com.google.common.base.MoreObjects;
import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import javax.annotation.Nullable;

public class fbx {
   public static final int a = 10000;
   private final fby b;
   private final evg c = new evg();
   private long d = -1L;
   private long e = -1L;
   private long f = -1L;
   private boolean g;

   public fbx(fby $$0) {
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
            if (fjx.s()) {
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

   private void a(n $$0, wi $$1) {
      this.b.l.d().a(wi.i().b(wi.c("debug.prefix").a($$0, n.r)).b(wh.v).b($$1));
   }

   private void a(wi $$0) {
      this.a(n.o, $$0);
   }

   private void a(String $$0, Object... $$1) {
      this.a(wi.b($$0, $$1));
   }

   private void b(String $$0, Object... $$1) {
      this.a(n.m, wi.b($$0, $$1));
   }

   private void c(String $$0, Object... $$1) {
      this.a(wi.b(MessageFormat.format($$0, $$1)));
   }

   private boolean b(int $$0) {
      if (this.d > 0L && this.d < ac.b() - 100L) {
         return true;
      } else {
         switch ($$0) {
            case 49:
               this.b.aP().k();
               return true;
            case 50:
               this.b.aP().j();
               return true;
            case 51:
               this.b.aP().i();
               return true;
            case 65:
               this.b.f.f();
               this.a("debug.reload_chunks.message");
               return true;
            case 66:
               boolean $$1 = !this.b.aq().a();
               this.b.aq().b($$1);
               this.a($$1 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (this.b.s.gp()) {
                  return false;
               } else {
                  fur $$7 = this.b.s.cv;
                  if ($$7 == null) {
                     return false;
                  }

                  this.a("debug.copy_location.message");
                  this.a(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.b.s.dM().ae().a(),
                        this.b.s.dr(),
                        this.b.s.dt(),
                        this.b.s.dx(),
                        this.b.s.dC(),
                        this.b.s.dE()
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
               this.b.m.av();
               return true;
            case 73:
               if (!this.b.s.gp()) {
                  this.a(this.b.s.m(2), !fjx.s());
               }

               return true;
            case 76:
               if (this.b.a(this::a)) {
                  this.a("debug.profiling.start", 10);
               }

               return true;
            case 78:
               if (!this.b.s.m(2)) {
                  this.a("debug.creative_spectator.error");
               } else if (!this.b.s.N_()) {
                  this.b.s.cv.d("gamemode spectator");
               } else {
                  this.b.s.cv.d("gamemode " + ((czd)MoreObjects.firstNonNull(this.b.q.i(), czd.b)).b());
               }

               return true;
            case 80:
               this.b.m.n = !this.b.m.n;
               this.b.m.av();
               this.a(this.b.m.n ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.a("debug.help.message");
               fdz $$3 = this.b.l.d();
               $$3.a(wi.c("debug.reload_chunks.help"));
               $$3.a(wi.c("debug.show_hitboxes.help"));
               $$3.a(wi.c("debug.copy_location.help"));
               $$3.a(wi.c("debug.clear_chat.help"));
               $$3.a(wi.c("debug.chunk_boundaries.help"));
               $$3.a(wi.c("debug.advanced_tooltips.help"));
               $$3.a(wi.c("debug.inspect.help"));
               $$3.a(wi.c("debug.profiling.help"));
               $$3.a(wi.c("debug.creative_spectator.help"));
               $$3.a(wi.c("debug.pause_focus.help"));
               $$3.a(wi.c("debug.help.help"));
               $$3.a(wi.c("debug.dump_dynamic_textures.help"));
               $$3.a(wi.c("debug.reload_resourcepacks.help"));
               $$3.a(wi.c("debug.pause.help"));
               $$3.a(wi.c("debug.gamemodes.help"));
               return true;
            case 83:
               Path $$4 = this.b.p.toPath().toAbsolutePath();
               Path $$5 = TextureUtil.getDebugTexturePath($$4);
               this.b.aa().a($$5);
               wi $$6 = wi.b($$4.relativize($$5).toString()).a(n.t).a($$1x -> $$1x.a(new wg(wg.a.b, $$5.toFile().toString())));
               this.a("debug.dump_dynamic_textures", $$6);
               return true;
            case 84:
               this.a("debug.reload_resourcepacks.message");
               this.b.l();
               return true;
            case 293:
               if (!this.b.s.m(2)) {
                  this.a("debug.gamemodes.error");
               } else {
                  this.b.a(new fks());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void a(boolean $$0, boolean $$1) {
      esh $$2 = this.b.v;
      if ($$2 != null) {
         switch ($$2.c()) {
            case b:
               id $$3 = ((esf)$$2).a();
               czg $$4 = this.b.s.dM();
               dpi $$5 = $$4.a_($$3);
               if ($$0) {
                  if ($$1) {
                     this.b.s.cv.t().a($$3, $$2x -> {
                        this.a($$5, $$3, $$2x);
                        this.a("debug.inspect.server.block");
                     });
                  } else {
                     dmo $$6 = $$4.c_($$3);
                     to $$7 = $$6 != null ? $$6.d($$4.H_()) : null;
                     this.a($$5, $$3, $$7);
                     this.a("debug.inspect.client.block");
                  }
               } else {
                  this.a($$5, $$3, null);
                  this.a("debug.inspect.client.block");
               }
               break;
            case c:
               bqa $$8 = ((esg)$$2).a();
               ajv $$9 = kt.g.b($$8.ai());
               if ($$0) {
                  if ($$1) {
                     this.b.s.cv.t().a($$8.aj(), $$2x -> {
                        this.a($$9, $$8.dk(), $$2x);
                        this.a("debug.inspect.server.entity");
                     });
                  } else {
                     to $$10 = $$8.f(new to());
                     this.a($$9, $$8.dk(), $$10);
                     this.a("debug.inspect.client.entity");
                  }
               } else {
                  this.a($$9, $$8.dk(), null);
                  this.a("debug.inspect.client.entity");
               }
         }
      }
   }

   private void a(dpi $$0, id $$1, @Nullable to $$2) {
      StringBuilder $$3 = new StringBuilder(fo.a($$0));
      if ($$2 != null) {
         $$3.append($$2);
      }

      String $$4 = String.format(Locale.ROOT, "/setblock %d %d %d %s", $$1.u(), $$1.v(), $$1.w(), $$3);
      this.a($$4);
   }

   private void a(ajv $$0, esj $$1, @Nullable to $$2) {
      String $$4;
      if ($$2 != null) {
         $$2.r("UUID");
         $$2.r("Pos");
         $$2.r("Dimension");
         String $$3 = ud.c((ul)$$2).getString();
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", $$0, $$1.c, $$1.d, $$1.e, $$3);
      } else {
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", $$0, $$1.c, $$1.d, $$1.e);
      }

      this.a($$4);
   }

   public void a(long $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$0 == this.b.aO().i()) {
         boolean $$5 = evm.a(fby.Q().aO().i(), 292);
         if (this.d > 0L) {
            if (!evm.a(fby.Q().aO().i(), 67) || !$$5) {
               this.d = -1L;
            }
         } else if (evm.a(fby.Q().aO().i(), 67) && $$5) {
            this.g = true;
            this.d = ac.b();
            this.e = ac.b();
            this.f = 0L;
         }

         fjx $$6 = this.b.y;
         if ($$6 != null) {
            switch ($$1) {
               case 258:
                  this.b.a(fbv.d);
               case 259:
               case 260:
               case 261:
               default:
                  break;
               case 262:
               case 263:
               case 264:
               case 265:
                  this.b.a(fbv.c);
            }
         }

         if ($$3 == 1 && (!(this.b.y instanceof fkq) || ((fkq)$$6).o <= ac.b() - 20L)) {
            if (this.b.m.R.a($$1, $$2)) {
               this.b.aO().h();
               this.b.m.aa().a(this.b.aO().j());
               return;
            }

            if (this.b.m.O.a($$1, $$2)) {
               if (fjx.r()) {
               }

               fcj.a(this.b.p, this.b.h(), $$0x -> this.b.execute(() -> this.b.l.d().a($$0x)));
               return;
            }
         }

         if (this.b.aY().a() && this.b.m.u().c()) {
            boolean $$9 = $$6 == null || !($$6.aH_() instanceof feh $$7) || !$$7.d();
            if ($$3 != 0 && $$1 == 66 && fjx.r() && $$9) {
               boolean $$10 = this.b.m.as().c() == fca.a;
               this.b.m.as().a(fca.a(this.b.m.as().c().a() + 1));
               this.b.m.av();
               if ($$6 instanceof fjz) {
                  ((fjz)$$6).C();
               }

               if ($$10 && $$6 != null) {
                  $$6.A();
               }
            }
         }

         if ($$6 != null) {
            boolean[] $$11 = new boolean[]{false};
            fjx.a(() -> {
               if ($$3 == 1 || $$3 == 2) {
                  $$6.x();
                  $$11[0] = $$6.a($$1, $$2, $$4);
               } else if ($$3 == 0) {
                  $$11[0] = $$6.c($$1, $$2, $$4);
               }
            }, "keyPressed event handler", $$6.getClass().getCanonicalName());
            if ($$11[0]) {
               return;
            }
         }

         evm.a $$12;
         boolean $$13;
         boolean var20;
         label185: {
            $$12 = evm.a($$1, $$2);
            $$13 = this.b.y == null;
            label144:
            if (!$$13) {
               if (this.b.y instanceof fjs $$14 && !$$14.m()) {
                  break label144;
               }

               var20 = false;
               break label185;
            }

            var20 = true;
         }

         boolean $$15 = var20;
         if ($$3 == 0) {
            fbw.a($$12, false);
            if ($$15 && $$1 == 292) {
               if (this.g) {
                  this.g = false;
               } else {
                  this.b.aP().h();
               }
            }
         } else {
            boolean $$16 = false;
            if ($$15) {
               if ($$1 == 293 && this.b.j != null) {
                  this.b.j.c();
               }

               if ($$1 == 256) {
                  this.b.b($$5);
                  $$16 |= $$5;
               }

               $$16 |= $$5 && this.b($$1);
               this.g |= $$16;
               if ($$1 == 290) {
                  this.b.m.Z = !this.b.m.Z;
               }

               if (this.b.aP().e() && !$$5 && $$1 >= 48 && $$1 <= 57) {
                  this.b.a($$1 - 48);
               }
            }

            if ($$13) {
               if ($$16) {
                  fbw.a($$12, false);
               } else {
                  fbw.a($$12, true);
                  fbw.a($$12);
               }
            }
         }
      }
   }

   private void a(long $$0, int $$1, int $$2) {
      if ($$0 == this.b.aO().i()) {
         ffu $$3 = this.b.y;
         if ($$3 != null && this.b.aL() == null) {
            if (Character.charCount($$1) == 1) {
               fjx.a(() -> $$3.a((char)$$1, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
            } else {
               for (char $$4 : Character.toChars($$1)) {
                  fjx.a(() -> $$3.a($$4, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
               }
            }
         }
      }
   }

   public void a(long $$0) {
      evm.a(
         $$0,
         ($$0x, $$1, $$2, $$3, $$4) -> this.b.execute(() -> this.a($$0x, $$1, $$2, $$3, $$4)),
         ($$0x, $$1, $$2) -> this.b.execute(() -> this.a($$0x, $$1, $$2))
      );
   }

   public String a() {
      return this.c.a(this.b.aO().i(), ($$0, $$1) -> {
         if ($$0 != 65545) {
            this.b.aO().a($$0, $$1);
         }
      });
   }

   public void a(String $$0) {
      if (!$$0.isEmpty()) {
         this.c.a(this.b.aO().i(), $$0);
      }
   }

   public void b() {
      if (this.d > 0L) {
         long $$0 = ac.b();
         long $$1 = 10000L - ($$0 - this.d);
         long $$2 = $$0 - this.e;
         if ($$1 < 0L) {
            if (fjx.r()) {
               euh.a();
            }

            String $$3 = "Manually triggered debug crash";
            o $$4 = new o("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
            p $$5 = $$4.a("Manual crash details");
            axn.a($$5);
            throw new y($$4);
         }

         if ($$2 >= 1000L) {
            if (this.f == 0L) {
               this.a("debug.crash.message");
            } else {
               this.b("debug.crash.warning", axm.f((float)$$1 / 1000.0F));
            }

            this.e = $$0;
            this.f++;
         }
      }
   }
}
