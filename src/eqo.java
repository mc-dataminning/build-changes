import com.google.common.base.MoreObjects;
import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import javax.annotation.Nullable;

public class eqo {
   public static final int a = 10000;
   private final eqp b;
   private final ejy c = new ejy();
   private long d = -1L;
   private long e = -1L;
   private long f = -1L;
   private boolean g;

   public eqo(eqp $$0) {
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
            if (eye.q()) {
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

   private void a(n $$0, tl $$1) {
      this.b.l.d().a(tl.i().b(tl.c("debug.prefix").a($$0, n.r)).b(tk.u).b($$1));
   }

   private void a(tl $$0) {
      this.a(n.o, $$0);
   }

   private void a(String $$0, Object... $$1) {
      this.a(tl.b($$0, $$1));
   }

   private void b(String $$0, Object... $$1) {
      this.a(n.m, tl.b($$0, $$1));
   }

   private void c(String $$0, Object... $$1) {
      this.a(tl.b(MessageFormat.format($$0, $$1)));
   }

   private boolean b(int $$0) {
      if (this.d > 0L && this.d < ac.b() - 100L) {
         return true;
      } else {
         switch ($$0) {
            case 49:
               this.b.aN().j();
               return true;
            case 50:
               this.b.aN().i();
               return true;
            case 51:
               this.b.aN().h();
               return true;
            case 65:
               this.b.f.f();
               this.a("debug.reload_chunks.message");
               return true;
            case 66:
               boolean $$1 = !this.b.ao().a();
               this.b.ao().b($$1);
               this.a($$1 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (this.b.s.gi()) {
                  return false;
               } else {
                  fit $$7 = this.b.s.cn;
                  if ($$7 == null) {
                     return false;
                  }

                  this.a("debug.copy_location.message");
                  this.a(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.b.s.dL().ac().a(),
                        this.b.s.dq(),
                        this.b.s.ds(),
                        this.b.s.dw(),
                        this.b.s.dB(),
                        this.b.s.dD()
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
               this.b.m.ar();
               return true;
            case 73:
               if (!this.b.s.gi()) {
                  this.a(this.b.s.l(2), !eye.q());
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
               } else if (!this.b.s.M_()) {
                  this.b.s.cn.d("gamemode spectator");
               } else {
                  this.b.s.cn.d("gamemode " + ((cpy)MoreObjects.firstNonNull(this.b.q.k(), cpy.b)).b());
               }

               return true;
            case 80:
               this.b.m.n = !this.b.m.n;
               this.b.m.ar();
               this.a(this.b.m.n ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.a("debug.help.message");
               esl $$3 = this.b.l.d();
               $$3.a(tl.c("debug.reload_chunks.help"));
               $$3.a(tl.c("debug.show_hitboxes.help"));
               $$3.a(tl.c("debug.copy_location.help"));
               $$3.a(tl.c("debug.clear_chat.help"));
               $$3.a(tl.c("debug.chunk_boundaries.help"));
               $$3.a(tl.c("debug.advanced_tooltips.help"));
               $$3.a(tl.c("debug.inspect.help"));
               $$3.a(tl.c("debug.profiling.help"));
               $$3.a(tl.c("debug.creative_spectator.help"));
               $$3.a(tl.c("debug.pause_focus.help"));
               $$3.a(tl.c("debug.help.help"));
               $$3.a(tl.c("debug.dump_dynamic_textures.help"));
               $$3.a(tl.c("debug.reload_resourcepacks.help"));
               $$3.a(tl.c("debug.pause.help"));
               $$3.a(tl.c("debug.gamemodes.help"));
               return true;
            case 83:
               Path $$4 = this.b.p.toPath().toAbsolutePath();
               Path $$5 = TextureUtil.getDebugTexturePath($$4);
               this.b.Y().a($$5);
               tl $$6 = tl.b($$4.relativize($$5).toString()).a(n.t).a($$1x -> $$1x.a(new tj(tj.a.b, $$5.toFile().toString())));
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
                  this.b.a(new eza());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void a(boolean $$0, boolean $$1) {
      ehf $$2 = this.b.v;
      if ($$2 != null) {
         switch ($$2.c()) {
            case b:
               gw $$3 = ((ehd)$$2).a();
               dfd $$4 = this.b.s.dL().a_($$3);
               if ($$0) {
                  if ($$1) {
                     this.b.s.cn.u().a($$3, $$2x -> {
                        this.a($$4, $$3, $$2x);
                        this.a("debug.inspect.server.block");
                     });
                  } else {
                     dcz $$5 = this.b.s.dL().c_($$3);
                     qw $$6 = $$5 != null ? $$5.o() : null;
                     this.a($$4, $$3, $$6);
                     this.a("debug.inspect.client.block");
                  }
               } else {
                  this.a($$4, $$3, null);
                  this.a("debug.inspect.client.block");
               }
               break;
            case c:
               biw $$7 = ((ehe)$$2).a();
               aez $$8 = jb.h.b($$7.ag());
               if ($$0) {
                  if ($$1) {
                     this.b.s.cn.u().a($$7.ah(), $$2x -> {
                        this.a($$8, $$7.dj(), $$2x);
                        this.a("debug.inspect.server.entity");
                     });
                  } else {
                     qw $$9 = $$7.f(new qw());
                     this.a($$8, $$7.dj(), $$9);
                     this.a("debug.inspect.client.entity");
                  }
               } else {
                  this.a($$8, $$7.dj(), null);
                  this.a("debug.inspect.client.entity");
               }
         }
      }
   }

   private void a(dfd $$0, gw $$1, @Nullable qw $$2) {
      StringBuilder $$3 = new StringBuilder(fi.a($$0));
      if ($$2 != null) {
         $$3.append($$2);
      }

      String $$4 = String.format(Locale.ROOT, "/setblock %d %d %d %s", $$1.u(), $$1.v(), $$1.w(), $$3);
      this.a($$4);
   }

   private void a(aez $$0, ehh $$1, @Nullable qw $$2) {
      String $$4;
      if ($$2 != null) {
         $$2.r("UUID");
         $$2.r("Pos");
         $$2.r("Dimension");
         String $$3 = rj.c((rq)$$2).getString();
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", $$0, $$1.c, $$1.d, $$1.e, $$3);
      } else {
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", $$0, $$1.c, $$1.d, $$1.e);
      }

      this.a($$4);
   }

   public void a(long $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$0 == this.b.aM().i()) {
         boolean $$5 = eke.a(eqp.O().aM().i(), 292);
         if (this.d > 0L) {
            if (!eke.a(eqp.O().aM().i(), 67) || !$$5) {
               this.d = -1L;
            }
         } else if (eke.a(eqp.O().aM().i(), 67) && $$5) {
            this.g = true;
            this.d = ac.b();
            this.e = ac.b();
            this.f = 0L;
         }

         eye $$6 = this.b.y;
         if ($$6 != null) {
            switch ($$1) {
               case 258:
                  this.b.a(eqm.d);
               case 259:
               case 260:
               case 261:
               default:
                  break;
               case 262:
               case 263:
               case 264:
               case 265:
                  this.b.a(eqm.c);
            }
         }

         if ($$3 == 1 && (!(this.b.y instanceof eyy) || ((eyy)$$6).k <= ac.b() - 20L)) {
            if (this.b.m.R.a($$1, $$2)) {
               this.b.aM().h();
               this.b.m.W().a(this.b.aM().j());
               return;
            }

            if (this.b.m.O.a($$1, $$2)) {
               if (eye.p()) {
               }

               era.a(this.b.p, this.b.g(), $$0x -> this.b.execute(() -> this.b.l.d().a($$0x)));
               return;
            }
         }

         if (this.b.aV().a() && this.b.m.r().c()) {
            boolean $$7 = $$6 == null || !($$6.t() instanceof est) || !((est)$$6.t()).e();
            if ($$3 != 0 && $$1 == 66 && eye.p() && $$7) {
               boolean $$8 = this.b.m.ao().c() == eqr.a;
               this.b.m.ao().a(eqr.a(this.b.m.ao().c().a() + 1));
               if ($$6 instanceof eyg) {
                  ((eyg)$$6).l();
               }

               if ($$8 && $$6 != null) {
                  $$6.B();
               }
            }
         }

         if ($$6 != null) {
            boolean[] $$9 = new boolean[]{false};
            eye.a(() -> {
               if ($$3 == 1 || $$3 == 2) {
                  $$6.y();
                  $$9[0] = $$6.a($$1, $$2, $$4);
               } else if ($$3 == 0) {
                  $$9[0] = $$6.b($$1, $$2, $$4);
               }
            }, "keyPressed event handler", $$6.getClass().getCanonicalName());
            if ($$9[0]) {
               return;
            }
         }

         if (this.b.y == null || this.b.y instanceof eya $$10 && !$$10.l()) {
            eke.a $$11 = eke.a($$1, $$2);
            if ($$3 == 0) {
               eqn.a($$11, false);
               if ($$1 == 292) {
                  if (this.g) {
                     this.g = false;
                  } else {
                     this.b.aN().g();
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
                  eqn.a($$11, false);
               } else {
                  eqn.a($$11, true);
                  eqn.a($$11);
               }

               if (this.b.aN().e() && !$$5 && $$1 >= 48 && $$1 <= 57) {
                  this.b.a($$1 - 48);
               }
            }
         }
      }
   }

   private void a(long $$0, int $$1, int $$2) {
      if ($$0 == this.b.aM().i()) {
         euf $$3 = this.b.y;
         if ($$3 != null && this.b.aJ() == null) {
            if (Character.charCount($$1) == 1) {
               eye.a(() -> $$3.a((char)$$1, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
            } else {
               for (char $$4 : Character.toChars($$1)) {
                  eye.a(() -> $$3.a($$4, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
               }
            }
         }
      }
   }

   public void a(long $$0) {
      eke.a(
         $$0,
         ($$0x, $$1, $$2, $$3, $$4) -> this.b.execute(() -> this.a($$0x, $$1, $$2, $$3, $$4)),
         ($$0x, $$1, $$2) -> this.b.execute(() -> this.a($$0x, $$1, $$2))
      );
   }

   public String a() {
      return this.c.a(this.b.aM().i(), ($$0, $$1) -> {
         if ($$0 != 65545) {
            this.b.aM().a($$0, $$1);
         }
      });
   }

   public void a(String $$0) {
      if (!$$0.isEmpty()) {
         this.c.a(this.b.aM().i(), $$0);
      }
   }

   public void b() {
      if (this.d > 0L) {
         long $$0 = ac.b();
         long $$1 = 10000L - ($$0 - this.d);
         long $$2 = $$0 - this.e;
         if ($$1 < 0L) {
            if (eye.p()) {
               eja.a();
            }

            String $$3 = "Manually triggered debug crash";
            o $$4 = new o("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
            p $$5 = $$4.a("Manual crash details");
            asc.a($$5);
            throw new y($$4);
         }

         if ($$2 >= 1000L) {
            if (this.f == 0L) {
               this.a("debug.crash.message");
            } else {
               this.b("debug.crash.warning", asb.f((float)$$1 / 1000.0F));
            }

            this.e = $$0;
            this.f++;
         }
      }
   }
}
