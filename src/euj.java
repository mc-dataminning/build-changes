import com.google.common.base.MoreObjects;
import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import javax.annotation.Nullable;

public class euj {
   public static final int a = 10000;
   private final euk b;
   private final ens c = new ens();
   private long d = -1L;
   private long e = -1L;
   private long f = -1L;
   private boolean g;

   public euj(euk $$0) {
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
            if (fcc.q()) {
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

   private void a(n $$0, vb $$1) {
      this.b.l.d().a(vb.i().b(vb.c("debug.prefix").a($$0, n.r)).b(va.u).b($$1));
   }

   private void a(vb $$0) {
      this.a(n.o, $$0);
   }

   private void a(String $$0, Object... $$1) {
      this.a(vb.b($$0, $$1));
   }

   private void b(String $$0, Object... $$1) {
      this.a(n.m, vb.b($$0, $$1));
   }

   private void c(String $$0, Object... $$1) {
      this.a(vb.b(MessageFormat.format($$0, $$1)));
   }

   private boolean b(int $$0) {
      if (this.d > 0L && this.d < ac.b() - 100L) {
         return true;
      } else {
         switch ($$0) {
            case 49:
               this.b.aM().j();
               return true;
            case 50:
               this.b.aM().i();
               return true;
            case 51:
               this.b.aM().h();
               return true;
            case 65:
               this.b.f.f();
               this.a("debug.reload_chunks.message");
               return true;
            case 66:
               boolean $$1 = !this.b.an().a();
               this.b.an().b($$1);
               this.a($$1 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (this.b.s.gi()) {
                  return false;
               } else {
                  fmu $$7 = this.b.s.cn;
                  if ($$7 == null) {
                     return false;
                  }

                  this.a("debug.copy_location.message");
                  this.a(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.b.s.dM().ad().a(),
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
               this.b.m.as();
               return true;
            case 73:
               if (!this.b.s.gi()) {
                  this.a(this.b.s.l(2), !fcc.q());
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
               } else if (!this.b.s.P_()) {
                  this.b.s.cn.d("gamemode spectator");
               } else {
                  this.b.s.cn.d("gamemode " + ((csv)MoreObjects.firstNonNull(this.b.q.k(), csv.b)).b());
               }

               return true;
            case 80:
               this.b.m.n = !this.b.m.n;
               this.b.m.as();
               this.a(this.b.m.n ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.a("debug.help.message");
               ewi $$3 = this.b.l.d();
               $$3.a(vb.c("debug.reload_chunks.help"));
               $$3.a(vb.c("debug.show_hitboxes.help"));
               $$3.a(vb.c("debug.copy_location.help"));
               $$3.a(vb.c("debug.clear_chat.help"));
               $$3.a(vb.c("debug.chunk_boundaries.help"));
               $$3.a(vb.c("debug.advanced_tooltips.help"));
               $$3.a(vb.c("debug.inspect.help"));
               $$3.a(vb.c("debug.profiling.help"));
               $$3.a(vb.c("debug.creative_spectator.help"));
               $$3.a(vb.c("debug.pause_focus.help"));
               $$3.a(vb.c("debug.help.help"));
               $$3.a(vb.c("debug.dump_dynamic_textures.help"));
               $$3.a(vb.c("debug.reload_resourcepacks.help"));
               $$3.a(vb.c("debug.pause.help"));
               $$3.a(vb.c("debug.gamemodes.help"));
               return true;
            case 83:
               Path $$4 = this.b.p.toPath().toAbsolutePath();
               Path $$5 = TextureUtil.getDebugTexturePath($$4);
               this.b.X().a($$5);
               vb $$6 = vb.b($$4.relativize($$5).toString()).a(n.t).a($$1x -> $$1x.a(new uz(uz.a.b, $$5.toFile().toString())));
               this.a("debug.dump_dynamic_textures", $$6);
               return true;
            case 84:
               this.a("debug.reload_resourcepacks.message");
               this.b.k();
               return true;
            case 293:
               if (!this.b.s.l(2)) {
                  this.a("debug.gamemodes.error");
               } else {
                  this.b.a(new fcy());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void a(boolean $$0, boolean $$1) {
      ekz $$2 = this.b.v;
      if ($$2 != null) {
         switch ($$2.c()) {
            case b:
               hv $$3 = ((ekx)$$2).a();
               dip $$4 = this.b.s.dM().a_($$3);
               if ($$0) {
                  if ($$1) {
                     this.b.s.cn.u().a($$3, $$2x -> {
                        this.a($$4, $$3, $$2x);
                        this.a("debug.inspect.server.block");
                     });
                  } else {
                     dgd $$5 = this.b.s.dM().c_($$3);
                     sj $$6 = $$5 != null ? $$5.q() : null;
                     this.a($$4, $$3, $$6);
                     this.a("debug.inspect.client.block");
                  }
               } else {
                  this.a($$4, $$3, null);
                  this.a("debug.inspect.client.block");
               }
               break;
            case c:
               blf $$7 = ((eky)$$2).a();
               agt $$8 = kb.g.b($$7.ai());
               if ($$0) {
                  if ($$1) {
                     this.b.s.cn.u().a($$7.aj(), $$2x -> {
                        this.a($$8, $$7.dk(), $$2x);
                        this.a("debug.inspect.server.entity");
                     });
                  } else {
                     sj $$9 = $$7.f(new sj());
                     this.a($$8, $$7.dk(), $$9);
                     this.a("debug.inspect.client.entity");
                  }
               } else {
                  this.a($$8, $$7.dk(), null);
                  this.a("debug.inspect.client.entity");
               }
         }
      }
   }

   private void a(dip $$0, hv $$1, @Nullable sj $$2) {
      StringBuilder $$3 = new StringBuilder(fi.a($$0));
      if ($$2 != null) {
         $$3.append($$2);
      }

      String $$4 = String.format(Locale.ROOT, "/setblock %d %d %d %s", $$1.u(), $$1.v(), $$1.w(), $$3);
      this.a($$4);
   }

   private void a(agt $$0, elb $$1, @Nullable sj $$2) {
      String $$4;
      if ($$2 != null) {
         $$2.r("UUID");
         $$2.r("Pos");
         $$2.r("Dimension");
         String $$3 = sy.c((tg)$$2).getString();
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", $$0, $$1.c, $$1.d, $$1.e, $$3);
      } else {
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", $$0, $$1.c, $$1.d, $$1.e);
      }

      this.a($$4);
   }

   public void a(long $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$0 == this.b.aL().i()) {
         boolean $$5 = eny.a(euk.N().aL().i(), 292);
         if (this.d > 0L) {
            if (!eny.a(euk.N().aL().i(), 67) || !$$5) {
               this.d = -1L;
            }
         } else if (eny.a(euk.N().aL().i(), 67) && $$5) {
            this.g = true;
            this.d = ac.b();
            this.e = ac.b();
            this.f = 0L;
         }

         fcc $$6 = this.b.y;
         if ($$6 != null) {
            switch ($$1) {
               case 258:
                  this.b.a(euh.d);
               case 259:
               case 260:
               case 261:
               default:
                  break;
               case 262:
               case 263:
               case 264:
               case 265:
                  this.b.a(euh.c);
            }
         }

         if ($$3 == 1 && (!(this.b.y instanceof fcw) || ((fcw)$$6).k <= ac.b() - 20L)) {
            if (this.b.m.R.a($$1, $$2)) {
               this.b.aL().h();
               this.b.m.X().a(this.b.aL().j());
               return;
            }

            if (this.b.m.O.a($$1, $$2)) {
               if (fcc.p()) {
               }

               euv.a(this.b.p, this.b.g(), $$0x -> this.b.execute(() -> this.b.l.d().a($$0x)));
               return;
            }
         }

         if (this.b.aU().a() && this.b.m.s().c()) {
            boolean $$7 = $$6 == null || !($$6.t() instanceof ewq) || !((ewq)$$6.t()).e();
            if ($$3 != 0 && $$1 == 66 && fcc.p() && $$7) {
               boolean $$8 = this.b.m.ap().c() == eum.a;
               this.b.m.ap().a(eum.a(this.b.m.ap().c().a() + 1));
               this.b.m.as();
               if ($$6 instanceof fce) {
                  ((fce)$$6).l();
               }

               if ($$8 && $$6 != null) {
                  $$6.A();
               }
            }
         }

         if ($$6 != null) {
            boolean[] $$9 = new boolean[]{false};
            fcc.a(() -> {
               if ($$3 == 1 || $$3 == 2) {
                  $$6.x();
                  $$9[0] = $$6.a($$1, $$2, $$4);
               } else if ($$3 == 0) {
                  $$9[0] = $$6.b($$1, $$2, $$4);
               }
            }, "keyPressed event handler", $$6.getClass().getCanonicalName());
            if ($$9[0]) {
               return;
            }
         }

         if (this.b.y == null || this.b.y instanceof fbx $$10 && !$$10.l()) {
            eny.a $$11 = eny.a($$1, $$2);
            if ($$3 == 0) {
               eui.a($$11, false);
               if ($$1 == 292) {
                  if (this.g) {
                     this.g = false;
                  } else {
                     this.b.aM().g();
                  }
               }
            } else {
               if ($$1 == 293 && this.b.j != null) {
                  this.b.j.c();
               }

               boolean $$12 = false;
               if ($$1 == 256) {
                  this.b.c($$5);
                  $$12 |= $$5;
               }

               $$12 |= $$5 && this.b($$1);
               this.g |= $$12;
               if ($$1 == 290) {
                  this.b.m.Z = !this.b.m.Z;
               }

               if ($$12) {
                  eui.a($$11, false);
               } else {
                  eui.a($$11, true);
                  eui.a($$11);
               }

               if (this.b.aM().e() && !$$5 && $$1 >= 48 && $$1 <= 57) {
                  this.b.a($$1 - 48);
               }
            }
         }
      }
   }

   private void a(long $$0, int $$1, int $$2) {
      if ($$0 == this.b.aL().i()) {
         eyc $$3 = this.b.y;
         if ($$3 != null && this.b.aI() == null) {
            if (Character.charCount($$1) == 1) {
               fcc.a(() -> $$3.a((char)$$1, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
            } else {
               for (char $$4 : Character.toChars($$1)) {
                  fcc.a(() -> $$3.a($$4, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
               }
            }
         }
      }
   }

   public void a(long $$0) {
      eny.a(
         $$0,
         ($$0x, $$1, $$2, $$3, $$4) -> this.b.execute(() -> this.a($$0x, $$1, $$2, $$3, $$4)),
         ($$0x, $$1, $$2) -> this.b.execute(() -> this.a($$0x, $$1, $$2))
      );
   }

   public String a() {
      return this.c.a(this.b.aL().i(), ($$0, $$1) -> {
         if ($$0 != 65545) {
            this.b.aL().a($$0, $$1);
         }
      });
   }

   public void a(String $$0) {
      if (!$$0.isEmpty()) {
         this.c.a(this.b.aL().i(), $$0);
      }
   }

   public void b() {
      if (this.d > 0L) {
         long $$0 = ac.b();
         long $$1 = 10000L - ($$0 - this.d);
         long $$2 = $$0 - this.e;
         if ($$1 < 0L) {
            if (fcc.p()) {
               emu.a();
            }

            String $$3 = "Manually triggered debug crash";
            o $$4 = new o("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
            p $$5 = $$4.a("Manual crash details");
            atz.a($$5);
            throw new y($$4);
         }

         if ($$2 >= 1000L) {
            if (this.f == 0L) {
               this.a("debug.crash.message");
            } else {
               this.b("debug.crash.warning", aty.f((float)$$1 / 1000.0F));
            }

            this.e = $$0;
            this.f++;
         }
      }
   }
}
