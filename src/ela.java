import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ela extends gan {
   private static final Logger a = LogUtils.getLogger();
   private static final acq b = new acq("realms", "textures/gui/realms/on_icon.png");
   private static final acq c = new acq("realms", "textures/gui/realms/off_icon.png");
   private static final acq G = new acq("realms", "textures/gui/realms/expired_icon.png");
   private static final acq H = new acq("realms", "textures/gui/realms/expires_soon_icon.png");
   private static final sw I = sw.c("mco.configure.worlds.title");
   private static final sw J = sw.c("mco.configure.world.title");
   private static final sw K = sw.c("mco.selectServer.expired");
   private static final sw L = sw.c("mco.selectServer.expires.soon");
   private static final sw M = sw.c("mco.selectServer.expires.day");
   private static final sw N = sw.c("mco.selectServer.open");
   private static final sw O = sw.c("mco.selectServer.closed");
   private static final int P = 80;
   private static final int Q = 5;
   @Nullable
   private sw R;
   private final eiu S;
   @Nullable
   private ejq T;
   private final long U;
   private int V;
   private int W;
   private epi X;
   private epi Y;
   private epi Z;
   private epi aa;
   private epi ab;
   private epi ac;
   private epi ad;
   private boolean ae;
   private int af;
   private int ag;
   private final List<ekt> ah = Lists.newArrayList();

   public ela(eiu $$0, long $$1) {
      super(J);
      this.S = $$0;
      this.U = $$1;
   }

   @Override
   public void b() {
      if (this.T == null) {
         this.a(this.U);
      }

      this.V = this.g / 2 - 187;
      this.W = this.g / 2 + 190;
      this.X = this.d(epi.a(sw.c("mco.configure.world.buttons.players"), $$0x -> this.f.a(new ell(this, this.T))).a(this.a(0, 3), h(0), 100, 20).a());
      this.Y = this.d(epi.a(sw.c("mco.configure.world.buttons.settings"), $$0x -> this.f.a(new elq(this, this.T.d()))).a(this.a(1, 3), h(0), 100, 20).a());
      this.Z = this.d(
         epi.a(sw.c("mco.configure.world.buttons.subscription"), $$0x -> this.f.a(new els(this, this.T.d(), this.S))).a(this.a(2, 3), h(0), 100, 20).a()
      );
      this.ah.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.ah.add(this.a($$0));
      }

      this.ad = this.d(
         epi.a(sw.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.f.a(new elp(sw.c("mco.template.title.minigame"), this::a, ejq.c.b)))
            .a(this.b(0), h(13) - 5, 100, 20)
            .a()
      );
      this.aa = this.d(
         epi.a(sw.c("mco.configure.world.buttons.options"), $$0x -> this.f.a(new elr(this, this.T.i.get(this.T.n).d(), this.T.m, this.T.n)))
            .a(this.b(0), h(13) - 5, 90, 20)
            .a()
      );
      this.ab = this.d(epi.a(sw.c("mco.configure.world.backup"), $$0x -> this.f.a(new ekx(this, this.T.d(), this.T.n))).a(this.b(1), h(13) - 5, 90, 20).a());
      this.ac = this.d(
         epi.a(
               sw.c("mco.configure.world.buttons.resetworld"),
               $$0x -> this.f.a(new eln(this, this.T.d(), () -> this.f.execute(() -> this.f.a(this.d())), () -> this.f.a(this.d())))
            )
            .a(this.b(2), h(13) - 5, 90, 20)
            .a()
      );
      this.d(epi.a(sv.k, $$0x -> this.B()).a(this.W - 80 + 8, h(13) - 5, 70, 20).a());
      this.ab.r = true;
      if (this.T == null) {
         this.G();
         this.F();
         this.X.r = false;
         this.Y.r = false;
         this.Z.r = false;
      } else {
         this.C();
         if (this.E()) {
            this.F();
         } else {
            this.G();
         }
      }
   }

   private ekt a(int $$0) {
      int $$1 = this.c($$0);
      int $$2 = h(5) + 5;
      ekt $$3 = new ekt($$1, $$2, 80, 80, () -> this.T, $$0x -> this.R = $$0x, $$0, $$1x -> {
         ekt.b $$2x = ((ekt)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.T);
                  break;
               case b:
                  if ($$2x.b) {
                     this.D();
                  } else if ($$2x.a) {
                     this.b($$0, this.T);
                  } else {
                     this.a($$0, this.T);
                  }
                  break;
               default:
                  throw new IllegalStateException("Unknown action " + $$2x.c);
            }
         }
      });
      return this.d($$3);
   }

   private int b(int $$0) {
      return this.V + $$0 * 95;
   }

   private int a(int $$0, int $$1) {
      return this.g / 2 - ($$1 * 105 - 5) / 2 + $$0 * 105;
   }

   @Override
   public void f() {
      super.f();
      this.af++;
      this.ag--;
      if (this.ag < 0) {
         this.ag = 0;
      }

      this.ah.forEach(ekt::b);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.R = null;
      this.a($$0);
      $$0.a(this.i, I, this.g / 2, h(4), 16777215);
      super.a($$0, $$1, $$2, $$3);
      if (this.T == null) {
         $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      } else {
         String $$4 = this.T.b();
         int $$5 = this.i.b($$4);
         int $$6 = this.T.e == ejq.b.a ? 10526880 : 8388479;
         int $$7 = this.i.a(this.e);
         $$0.a(this.i, this.e, this.g / 2, 12, 16777215);
         $$0.a(this.i, $$4, this.g / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.g / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.a($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            $$0.a(this.i, sw.a("mco.configure.world.minigame", this.T.c()), this.V + 80 + 20 + 10, h(13), 16777215, false);
         }

         if (this.R != null) {
            this.a($$0, this.R, $$1, $$2);
         }
      }
   }

   private int c(int $$0) {
      return this.V + ($$0 - 1) * 98;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.B();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void B() {
      if (this.ae) {
         this.S.g();
      }

      this.f.a(this.S);
   }

   private void a(long $$0) {
      new Thread(() -> {
         eiz $$1 = eiz.a();

         try {
            ejq $$2 = $$1.a($$0);
            this.f.execute(() -> {
               this.T = $$2;
               this.C();
               if (this.E()) {
                  this.b(this.ad);
               } else {
                  this.b(this.aa);
                  this.b(this.ab);
                  this.b(this.ac);
               }
            });
         } catch (ekm var5) {
            a.error("Couldn't get own world");
            this.f.execute(() -> this.f.a(new ele(sw.a(var5.getMessage()), this.S)));
         }
      }).start();
   }

   private void C() {
      this.X.r = !this.T.j;
      this.Y.r = !this.T.j;
      this.Z.r = true;
      this.ad.r = !this.T.j;
      this.aa.r = !this.T.j;
      this.ac.r = !this.T.j;
   }

   private void a(ejq $$0) {
      if (this.T.e == ejq.b.b) {
         this.S.a($$0, new ela(this.S.h(), this.U));
      } else {
         this.a(true, new ela(this.S.h(), this.U));
      }
   }

   private void D() {
      elp $$0 = new elp(sw.c("mco.template.title.minigame"), this::a, ejq.c.b);
      $$0.a(sw.c("mco.minigame.world.info.line1"), sw.c("mco.minigame.world.info.line2"));
      this.f.a($$0);
   }

   private void a(int $$0, ejq $$1) {
      sw $$2 = sw.c("mco.configure.world.slot.switch.question.line1");
      sw $$3 = sw.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new elg($$2x -> {
         if ($$2x) {
            this.f.a(new elh(this.S, new emv($$1.a, $$0, () -> this.f.execute(() -> this.f.a(this.d())))));
         } else {
            this.f.a(this);
         }
      }, elg.a.b, $$2, $$3, true));
   }

   private void b(int $$0, ejq $$1) {
      sw $$2 = sw.c("mco.configure.world.slot.switch.question.line1");
      sw $$3 = sw.c("mco.configure.world.slot.switch.question.line2");
      this.f
         .a(
            new elg(
               $$2x -> {
                  if ($$2x) {
                     eln $$3x = new eln(
                        this,
                        $$1,
                        sw.c("mco.configure.world.switch.slot"),
                        sw.c("mco.configure.world.switch.slot.subtitle"),
                        10526880,
                        sv.e,
                        () -> this.f.execute(() -> this.f.a(this.d())),
                        () -> this.f.a(this.d())
                     );
                     $$3x.a($$0);
                     $$3x.a(sw.c("mco.create.world.reset.title"));
                     this.f.a($$3x);
                  } else {
                     this.f.a(this);
                  }
               },
               elg.a.b,
               $$2,
               $$3,
               true
            )
         );
   }

   protected void a(eox $$0, @Nullable sw $$1, int $$2, int $$3) {
      int $$4 = $$2 + 12;
      int $$5 = $$3 - 12;
      int $$6 = this.i.a($$1);
      if ($$4 + $$6 + 3 > this.W) {
         $$4 = $$4 - $$6 - 20;
      }

      $$0.b($$4 - 3, $$5 - 3, $$4 + $$6 + 3, $$5 + 8 + 3, -1073741824, -1073741824);
      $$0.b(this.i, $$1, $$4, $$5, 16777215);
   }

   private void a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.T.j) {
         this.b($$0, $$1, $$2, $$3, $$4);
      } else if (this.T.e == ejq.b.a) {
         this.d($$0, $$1, $$2, $$3, $$4);
      } else if (this.T.e == ejq.b.b) {
         if (this.T.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, this.T.l);
         } else {
            this.c($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   private void b(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(G, $$1, $$2, 0.0F, 0.0F, 10, 28, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.R = K;
      }
   }

   private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      if (this.af % 20 < 10) {
         $$0.a(H, $$1, $$2, 0.0F, 0.0F, 10, 28, 20, 28);
      } else {
         $$0.a(H, $$1, $$2, 10.0F, 0.0F, 10, 28, 20, 28);
      }

      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         if ($$5 <= 0) {
            this.R = L;
         } else if ($$5 == 1) {
            this.R = M;
         } else {
            this.R = sw.a("mco.selectServer.expires.days", $$5);
         }
      }
   }

   private void c(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(b, $$1, $$2, 0.0F, 0.0F, 10, 28, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.R = N;
      }
   }

   private void d(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(c, $$1, $$2, 0.0F, 0.0F, 10, 28, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.R = O;
      }
   }

   private boolean E() {
      return this.T != null && this.T.m == ejq.c.b;
   }

   private void F() {
      this.a(this.aa);
      this.a(this.ab);
      this.a(this.ac);
   }

   private void a(epi $$0) {
      $$0.s = false;
      this.f($$0);
   }

   private void b(epi $$0) {
      $$0.s = true;
      this.d($$0);
   }

   private void G() {
      this.a(this.ad);
   }

   public void a(ejx $$0) {
      ejx $$1 = this.T.i.get(this.T.n);
      $$0.j = $$1.j;
      $$0.k = $$1.k;
      eiz $$2 = eiz.a();

      try {
         $$2.a(this.T.a, this.T.n, $$0);
         this.T.i.put(this.T.n, $$0);
      } catch (ekm var5) {
         a.error("Couldn't save slot settings");
         this.f.a(new ele(var5, this));
         return;
      }

      this.f.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = $$1.trim().isEmpty() ? null : $$1;
      eiz $$3 = eiz.a();

      try {
         $$3.b(this.T.a, $$0, $$2);
         this.T.a($$0);
         this.T.b($$2);
      } catch (ekm var6) {
         a.error("Couldn't save settings");
         this.f.a(new ele(var6, this));
         return;
      }

      this.f.a(this);
   }

   public void a(boolean $$0, euq $$1) {
      this.f.a(new elh($$1, new emp(this.T, this, this.S, $$0, this.f)));
   }

   public void a(euq $$0) {
      this.f.a(new elh($$0, new emk(this.T, this)));
   }

   public void c() {
      this.ae = true;
   }

   private void a(@Nullable ekh $$0) {
      if ($$0 != null && ekh.a.b == $$0.i) {
         this.f.a(new elh(this.S, new emu(this.T.a, $$0, this.d())));
      } else {
         this.f.a(this);
      }
   }

   public ela d() {
      return new ela(this.S, this.U);
   }
}
