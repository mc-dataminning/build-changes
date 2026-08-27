import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eky extends gan {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 80;
   private final euq c;
   private final eiu G;
   @Nullable
   private ejq H;
   private final long I;
   private final sw[] J = new sw[]{sw.c("mco.brokenworld.message.line1"), sw.c("mco.brokenworld.message.line2")};
   private int K;
   private int L;
   private final List<Integer> M = Lists.newArrayList();
   private int N;

   public eky(euq $$0, eiu $$1, long $$2, boolean $$3) {
      super($$3 ? sw.c("mco.brokenworld.minigame.title") : sw.c("mco.brokenworld.title"));
      this.c = $$0;
      this.G = $$1;
      this.I = $$2;
   }

   @Override
   public void b() {
      this.K = this.g / 2 - 150;
      this.L = this.g / 2 + 190;
      this.d(epi.a(sv.k, $$0 -> this.C()).a(this.L - 80 + 8, h(13) - 5, 70, 20).a());
      if (this.H == null) {
         this.a(this.I);
      } else {
         this.B();
      }
   }

   @Override
   public sw au_() {
      return sy.a(Stream.concat(Stream.of(this.e), Stream.of(this.J)).collect(Collectors.toList()), sv.t);
   }

   private void B() {
      for (Entry<Integer, ejx> $$0 : this.H.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.H.n || this.H.m == ejq.c.b;
         epi $$3;
         if ($$2) {
            $$3 = epi.a(
                  sw.c("mco.brokenworld.play"),
                  $$1x -> {
                     if (this.H.i.get($$1).l) {
                        eln $$2x = new eln(
                           this,
                           this.H,
                           sw.c("mco.configure.world.switch.slot"),
                           sw.c("mco.configure.world.switch.slot.subtitle"),
                           10526880,
                           sv.e,
                           this::c,
                           () -> {
                              this.f.a(this);
                              this.c();
                           }
                        );
                        $$2x.a($$1);
                        $$2x.a(sw.c("mco.create.world.reset.title"));
                        this.f.a($$2x);
                     } else {
                        this.f.a(new elh(this.c, new emv(this.H.a, $$1, this::c)));
                     }
                  }
               )
               .a(this.a($$1), h(8), 80, 20)
               .a();
         } else {
            $$3 = epi.a(sw.c("mco.brokenworld.download"), $$1x -> {
               sw $$2x = sw.c("mco.configure.world.restore.download.question.line1");
               sw $$3x = sw.c("mco.configure.world.restore.download.question.line2");
               this.f.a(new elg($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.f.a(this);
                  }
               }, elg.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), h(8), 80, 20).a();
         }

         if (this.M.contains($$1)) {
            $$3.r = false;
            $$3.b(sw.c("mco.brokenworld.downloaded"));
         }

         this.d($$3);
         this.d(epi.a(sw.c("mco.brokenworld.reset"), $$1x -> {
            eln $$2x = new eln(this, this.H, this::c, () -> {
               this.f.a(this);
               this.c();
            });
            if ($$1 != this.H.n || this.H.m == ejq.c.b) {
               $$2x.a($$1);
            }

            this.f.a($$2x);
         }).a(this.a($$1), h(10), 80, 20).a());
      }
   }

   @Override
   public void f() {
      this.N++;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);

      for (int $$4 = 0; $$4 < this.J.length; $$4++) {
         $$0.a(this.i, this.J[$$4], this.g / 2, h(-1) + 3 + $$4 * 12, 10526880);
      }

      if (this.H != null) {
         for (Entry<Integer, ejx> $$5 : this.H.i.entrySet()) {
            if ($$5.getValue().k != null && $$5.getValue().j != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  h(1) + 5,
                  $$1,
                  $$2,
                  this.H.n == $$5.getKey() && !this.D(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  $$5.getValue().j,
                  $$5.getValue().k,
                  $$5.getValue().l
               );
            } else {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  h(1) + 5,
                  $$1,
                  $$2,
                  this.H.n == $$5.getKey() && !this.D(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  -1L,
                  null,
                  $$5.getValue().l
               );
            }
         }
      }
   }

   private int a(int $$0) {
      return this.K + ($$0 - 1) * 110;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.C();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void C() {
      this.f.a(this.c);
   }

   private void a(long $$0) {
      new Thread(() -> {
         eiz $$1 = eiz.a();

         try {
            this.H = $$1.a($$0);
            this.B();
         } catch (ekm var5) {
            a.error("Couldn't get own world");
            this.f.a(new ele(sw.a(var5.getMessage()), this.c));
         }
      }).start();
   }

   public void c() {
      new Thread(() -> {
         eiz $$0 = eiz.a();
         if (this.H.e == ejq.b.a) {
            this.f.execute(() -> this.f.a(new elh(this, new emp(this.H, this, this.G, true, this.f))));
         } else {
            try {
               ejq $$1 = $$0.a(this.I);
               this.f.execute(() -> this.G.h().a($$1, this));
            } catch (ekm var3) {
               a.error("Couldn't get own world");
               this.f.execute(() -> this.f.a(this.c));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      eiz $$1 = eiz.a();

      try {
         ekg $$2 = $$1.b(this.H.a, $$0);
         eld $$3 = new eld(this, $$2, this.H.a($$0), $$1x -> {
            if ($$1x) {
               this.M.add($$0);
               this.n();
               this.B();
            } else {
               this.f.a(this);
            }
         });
         this.f.a($$3);
      } catch (ekm var5) {
         a.error("Couldn't download world data");
         this.f.a(new ele(var5, this));
      }
   }

   private boolean D() {
      return this.H != null && this.H.m == ejq.c.b;
   }

   private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      acq $$11;
      if ($$10) {
         $$11 = ekt.b;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = eme.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = ekt.d;
      } else if ($$7 == 2) {
         $$11 = ekt.e;
      } else if ($$7 == 3) {
         $$11 = ekt.f;
      } else {
         $$11 = eme.a(String.valueOf(this.H.p), this.H.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * apa.b((float)this.N * 0.2F);
         $$0.a($$17, $$17, $$17, 1.0F);
      }

      $$0.a($$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      if ($$5) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(ekt.a, $$1, $$2, 0.0F, 0.0F, 80, 80, 80, 80);
      $$0.a(this.i, $$6, $$1 + 40, $$2 + 66, 16777215);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
