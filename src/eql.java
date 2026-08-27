import com.google.common.base.MoreObjects;
import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import javax.annotation.Nullable;

public class eql {
   public static final int a = 10000;
   private final eqm b;
   private final ejv c = new ejv();
   private long d = -1L;
   private long e = -1L;
   private long f = -1L;
   private boolean g;

   public eql(eqm $$0) {
      this.b = $$0;
   }

   private boolean a(int $$0) {
      switch ($$0) {
         case 69:
            this.b.E = !this.b.E;
            this.c("SectionPath: {0}", this.b.E ? "shown" : "hidden");
            return true;
         case 76:
            this.b.G = !this.b.G;
            this.c("SmartCull: {0}", this.b.G ? "enabled" : "disabled");
            return true;
         case 85:
            if (exz.q()) {
               this.b.f.n();
               this.c("Killed frustum");
            } else {
               this.b.f.m();
               this.c("Captured frustum");
            }

            return true;
         case 86:
            this.b.F = !this.b.F;
            this.c("SectionVisibility: {0}", this.b.F ? "enabled" : "disabled");
            return true;
         case 87:
            this.b.D = !this.b.D;
            this.c("WireFrame: {0}", this.b.D ? "enabled" : "disabled");
            return true;
         default:
            return false;
      }
   }

   private void a(n $$0, tf $$1) {
      this.b.l.d().a(tf.h().b(tf.c("debug.prefix").a($$0, n.r)).b(te.u).b($$1));
   }

   private void a(tf $$0) {
      this.a(n.o, $$0);
   }

   private void a(String $$0, Object... $$1) {
      this.a(tf.a($$0, $$1));
   }

   private void b(String $$0, Object... $$1) {
      this.a(n.m, tf.a($$0, $$1));
   }

   private void c(String $$0, Object... $$1) {
      this.a(tf.b(MessageFormat.format($$0, $$1)));
   }

   private boolean b(int $$0) {
      if (this.d > 0L && this.d < ac.b() - 100L) {
         return true;
      } else {
         switch ($$0) {
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
               if (this.b.v.gg()) {
                  return false;
               } else {
                  fij $$7 = this.b.v.cl;
                  if ($$7 == null) {
                     return false;
                  }

                  this.a("debug.copy_location.message");
                  this.a(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.b.v.dK().ac().a(),
                        this.b.v.dp(),
                        this.b.v.dr(),
                        this.b.v.dv(),
                        this.b.v.dA(),
                        this.b.v.dC()
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
               this.b.m.aq();
               return true;
            case 73:
               if (!this.b.v.gg()) {
                  this.a(this.b.v.l(2), !exz.q());
               }

               return true;
            case 76:
               if (this.b.a(this::a)) {
                  this.a("debug.profiling.start", 10);
               }

               return true;
            case 78:
               if (!this.b.v.l(2)) {
                  this.a("debug.creative_spectator.error");
               } else if (!this.b.v.G_()) {
                  this.b.v.cl.d("gamemode spectator");
               } else {
                  this.b.v.cl.d("gamemode " + ((cpj)MoreObjects.firstNonNull(this.b.t.k(), cpj.b)).b());
               }

               return true;
            case 80:
               this.b.m.n = !this.b.m.n;
               this.b.m.aq();
               this.a(this.b.m.n ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.a("debug.help.message");
               esi $$3 = this.b.l.d();
               $$3.a(tf.c("debug.reload_chunks.help"));
               $$3.a(tf.c("debug.show_hitboxes.help"));
               $$3.a(tf.c("debug.copy_location.help"));
               $$3.a(tf.c("debug.clear_chat.help"));
               $$3.a(tf.c("debug.chunk_boundaries.help"));
               $$3.a(tf.c("debug.advanced_tooltips.help"));
               $$3.a(tf.c("debug.inspect.help"));
               $$3.a(tf.c("debug.profiling.help"));
               $$3.a(tf.c("debug.creative_spectator.help"));
               $$3.a(tf.c("debug.pause_focus.help"));
               $$3.a(tf.c("debug.help.help"));
               $$3.a(tf.c("debug.dump_dynamic_textures.help"));
               $$3.a(tf.c("debug.reload_resourcepacks.help"));
               $$3.a(tf.c("debug.pause.help"));
               $$3.a(tf.c("debug.gamemodes.help"));
               return true;
            case 83:
               Path $$4 = this.b.p.toPath().toAbsolutePath();
               Path $$5 = TextureUtil.getDebugTexturePath($$4);
               this.b.Y().a($$5);
               tf $$6 = tf.b($$4.relativize($$5).toString()).a(n.t).a($$1x -> $$1x.a(new td(td.a.b, $$5.toFile().toString())));
               this.a("debug.dump_dynamic_textures", $$6);
               return true;
            case 84:
               this.a("debug.reload_resourcepacks.message");
               this.b.k();
               return true;
            case 293:
               if (!this.b.v.l(2)) {
                  this.a("debug.gamemodes.error");
               } else {
                  this.b.a(new eyu());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void a(boolean $$0, boolean $$1) {
      ehc $$2 = this.b.y;
      if ($$2 != null) {
         switch ($$2.c()) {
            case b:
               gu $$3 = ((eha)$$2).a();
               dfa $$4 = this.b.v.dK().a_($$3);
               if ($$0) {
                  if ($$1) {
                     this.b.v.cl.t().a($$3, $$2x -> {
                        this.a($$4, $$3, $$2x);
                        this.a("debug.inspect.server.block");
                     });
                  } else {
                     dcm $$5 = this.b.v.dK().c_($$3);
                     qr $$6 = $$5 != null ? $$5.o() : null;
                     this.a($$4, $$3, $$6);
                     this.a("debug.inspect.client.block");
                  }
               } else {
                  this.a($$4, $$3, null);
                  this.a("debug.inspect.client.block");
               }
               break;
            case c:
               bii $$7 = ((ehb)$$2).a();
               aer $$8 = jb.h.b($$7.ag());
               if ($$0) {
                  if ($$1) {
                     this.b.v.cl.t().a($$7.ah(), $$2x -> {
                        this.a($$8, $$7.di(), $$2x);
                        this.a("debug.inspect.server.entity");
                     });
                  } else {
                     qr $$9 = $$7.f(new qr());
                     this.a($$8, $$7.di(), $$9);
                     this.a("debug.inspect.client.entity");
                  }
               } else {
                  this.a($$8, $$7.di(), null);
                  this.a("debug.inspect.client.entity");
               }
         }
      }
   }

   private void a(dfa $$0, gu $$1, @Nullable qr $$2) {
      StringBuilder $$3 = new StringBuilder(fg.a($$0));
      if ($$2 != null) {
         $$3.append($$2);
      }

      String $$4 = String.format(Locale.ROOT, "/setblock %d %d %d %s", $$1.u(), $$1.v(), $$1.w(), $$3);
      this.a($$4);
   }

   private void a(aer $$0, ehe $$1, @Nullable qr $$2) {
      String $$4;
      if ($$2 != null) {
         $$2.r("UUID");
         $$2.r("Pos");
         $$2.r("Dimension");
         String $$3 = rd.c((rk)$$2).getString();
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", $$0, $$1.c, $$1.d, $$1.e, $$3);
      } else {
         $$4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", $$0, $$1.c, $$1.d, $$1.e);
      }

      this.a($$4);
   }

   public void a(long $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$0 == this.b.aN().i()) {
         if (this.d > 0L) {
            if (!ekb.a(eqm.O().aN().i(), 67) || !ekb.a(eqm.O().aN().i(), 292)) {
               this.d = -1L;
            }
         } else if (ekb.a(eqm.O().aN().i(), 67) && ekb.a(eqm.O().aN().i(), 292)) {
            this.g = true;
            this.d = ac.b();
            this.e = ac.b();
            this.f = 0L;
         }

         exz $$5 = this.b.B;
         if ($$5 != null) {
            switch ($$1) {
               case 258:
                  this.b.a(eqj.d);
               case 259:
               case 260:
               case 261:
               default:
                  break;
               case 262:
               case 263:
               case 264:
               case 265:
                  this.b.a(eqj.c);
            }
         }

         if ($$3 == 1 && (!(this.b.B instanceof eys) || ((eys)$$5).k <= ac.b() - 20L)) {
            if (this.b.m.R.a($$1, $$2)) {
               this.b.aN().h();
               this.b.m.V().a(this.b.aN().j());
               return;
            }

            if (this.b.m.O.a($$1, $$2)) {
               if (exz.p()) {
               }

               eqx.a(this.b.p, this.b.g(), $$0x -> this.b.execute(() -> this.b.l.d().a($$0x)));
               return;
            }
         }

         if (this.b.aV().a()) {
            boolean $$6 = $$5 == null || !($$5.t() instanceof esq) || !((esq)$$5.t()).e();
            if ($$3 != 0 && $$1 == 66 && exz.p() && $$6) {
               boolean $$7 = this.b.m.an().c() == eqo.a;
               this.b.m.an().a(eqo.a(this.b.m.an().c().a() + 1));
               if ($$5 instanceof eyb) {
                  ((eyb)$$5).l();
               }

               if ($$7 && $$5 != null) {
                  $$5.z();
               }
            }
         }

         if ($$5 != null) {
            boolean[] $$8 = new boolean[]{false};
            exz.a(() -> {
               if ($$3 == 1 || $$3 == 2) {
                  $$5.x();
                  $$8[0] = $$5.a($$1, $$2, $$4);
               } else if ($$3 == 0) {
                  $$8[0] = $$5.b($$1, $$2, $$4);
               }
            }, "keyPressed event handler", $$5.getClass().getCanonicalName());
            if ($$8[0]) {
               return;
            }
         }

         if (this.b.B == null) {
            ekb.a $$9 = ekb.a($$1, $$2);
            if ($$3 == 0) {
               eqk.a($$9, false);
               if ($$1 == 292) {
                  if (this.g) {
                     this.g = false;
                  } else {
                     this.b.m.aa = !this.b.m.aa;
                     this.b.m.ab = this.b.m.aa && exz.q();
                     this.b.m.ac = this.b.m.aa && exz.r();
                     this.b.m.ad = this.b.m.aa && exz.p() && !exz.r();
                  }
               }
            } else {
               if ($$1 == 293 && this.b.j != null) {
                  this.b.j.c();
               }

               boolean $$10 = false;
               if ($$1 == 256) {
                  boolean $$11 = ekb.a(eqm.O().aN().i(), 292);
                  this.b.c($$11);
               }

               $$10 = ekb.a(eqm.O().aN().i(), 292) && this.b($$1);
               this.g |= $$10;
               if ($$1 == 290) {
                  this.b.m.Z = !this.b.m.Z;
               }

               if ($$10) {
                  eqk.a($$9, false);
               } else {
                  eqk.a($$9, true);
                  eqk.a($$9);
               }

               if (this.b.m.ab && $$1 >= 48 && $$1 <= 57) {
                  this.b.a($$1 - 48);
               }
            }
         }
      }
   }

   private void a(long $$0, int $$1, int $$2) {
      if ($$0 == this.b.aN().i()) {
         eua $$3 = this.b.B;
         if ($$3 != null && this.b.aK() == null) {
            if (Character.charCount($$1) == 1) {
               exz.a(() -> $$3.a((char)$$1, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
            } else {
               for (char $$4 : Character.toChars($$1)) {
                  exz.a(() -> $$3.a($$4, $$2), "charTyped event handler", $$3.getClass().getCanonicalName());
               }
            }
         }
      }
   }

   public void a(long $$0) {
      ekb.a(
         $$0,
         ($$0x, $$1, $$2, $$3, $$4) -> this.b.execute(() -> this.a($$0x, $$1, $$2, $$3, $$4)),
         ($$0x, $$1, $$2) -> this.b.execute(() -> this.a($$0x, $$1, $$2))
      );
   }

   public String a() {
      return this.c.a(this.b.aN().i(), ($$0, $$1) -> {
         if ($$0 != 65545) {
            this.b.aN().a($$0, $$1);
         }
      });
   }

   public void a(String $$0) {
      if (!$$0.isEmpty()) {
         this.c.a(this.b.aN().i(), $$0);
      }
   }

   public void b() {
      if (this.d > 0L) {
         long $$0 = ac.b();
         long $$1 = 10000L - ($$0 - this.d);
         long $$2 = $$0 - this.e;
         if ($$1 < 0L) {
            if (exz.p()) {
               eix.a();
            }

            String $$3 = "Manually triggered debug crash";
            o $$4 = new o("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
            p $$5 = $$4.a("Manual crash details");
            arq.a($$5);
            throw new y($$4);
         }

         if ($$2 >= 1000L) {
            if (this.f == 0L) {
               this.a("debug.crash.message");
            } else {
               this.b("debug.crash.warning", arp.f((float)$$1 / 1000.0F));
            }

            this.e = $$0;
            this.f++;
         }
      }
   }
}
