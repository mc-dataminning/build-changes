import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fis extends hle {
   private static final akv a = akv.b("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final ful C;
   @Nullable
   private fhl D;
   private final long E;
   private final wp[] F = new wp[]{wp.c("mco.brokenworld.message.line1"), wp.c("mco.brokenworld.message.line2")};
   private int G;
   private final List<Integer> H = Lists.newArrayList();
   private int I;

   public fis(ful $$0, long $$1, boolean $$2) {
      super($$2 ? wp.c("mco.brokenworld.minigame.title") : wp.c("mco.brokenworld.title"));
      this.C = $$0;
      this.E = $$1;
   }

   @Override
   public void aR_() {
      this.G = this.n / 2 - 150;
      this.c(fot.a(wo.k, $$0 -> this.aO_()).a((this.n - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.D == null) {
         this.a(this.E);
      } else {
         this.E();
      }
   }

   @Override
   public wp i() {
      return ws.a(Stream.concat(Stream.of(this.l), Stream.of(this.F)).collect(Collectors.toList()), wo.v);
   }

   private void E() {
      for (Entry<Integer, fhr> $$0 : this.D.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.D.p || this.D.i();
         fot $$3;
         if ($$2) {
            $$3 = fot.a(wp.c("mco.brokenworld.play"), $$1x -> this.m.a(new fja(this.C, new fko(this.D.a, $$1, this::b)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.D.i.get($$1).m;
         } else {
            $$3 = fot.a(
                  wp.c("mco.brokenworld.download"),
                  $$1x -> this.m.a(fjg.a(this, wp.c("mco.configure.world.restore.download.question.line1"), $$1xx -> this.b($$1)))
               )
               .a(this.a($$1), g(8), 80, 20)
               .a();
         }

         if (this.H.contains($$1)) {
            $$3.j = false;
            $$3.b(wp.c("mco.brokenworld.downloaded"));
         }

         this.c($$3);
      }
   }

   @Override
   public void e() {
      this.I++;
   }

   @Override
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.F.length; $$4++) {
         $$0.a(this.p, this.F[$$4], this.n / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.D != null) {
         for (Entry<Integer, fhr> $$5 : this.D.i.entrySet()) {
            if ($$5.getValue().l != null && $$5.getValue().k != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.D.p == $$5.getKey() && !this.F(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  $$5.getValue().k,
                  $$5.getValue().l,
                  $$5.getValue().m
               );
            } else {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.D.p == $$5.getKey() && !this.F(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  -1L,
                  null,
                  $$5.getValue().m
               );
            }
         }
      }
   }

   private int a(int $$0) {
      return this.G + ($$0 - 1) * 110;
   }

   private void a(long $$0) {
      new Thread(() -> {
         fgk $$1 = fgk.a();

         try {
            this.D = $$1.a($$0);
            this.E();
         } catch (fig var5) {
            b.error("Couldn't get own world", var5);
            this.m.a(new fiy(var5, this.C));
         }
      }).start();
   }

   public void b() {
      new Thread(() -> {
         fgk $$0 = fgk.a();
         if (this.D.e == fhl.c.a) {
            this.m.execute(() -> this.m.a(new fja(this, new fki(this.D, this, true, this.m))));
         } else {
            try {
               fhl $$1 = $$0.a(this.E);
               this.m.execute(() -> fgf.a($$1, this));
            } catch (fig var3) {
               b.error("Couldn't get own world", var3);
               this.m.execute(() -> this.m.a(this.C));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      fgk $$1 = fgk.a();

      try {
         fia $$2 = $$1.b(this.D.a, $$0);
         fix $$3 = new fix(this, $$2, this.D.a($$0), $$1x -> {
            if ($$1x) {
               this.H.add($$0);
               this.p();
               this.E();
            } else {
               this.m.a(this);
            }
         });
         this.m.a($$3);
      } catch (fig var5) {
         b.error("Couldn't download world data", var5);
         this.m.a(new fiy(var5, this));
      }
   }

   @Override
   public void aO_() {
      this.m.a(this.C);
   }

   private boolean F() {
      return this.D != null && this.D.i();
   }

   private void a(foe $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      akv $$11;
      if ($$10) {
         $$11 = fim.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = fjy.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = fim.b;
      } else if ($$7 == 2) {
         $$11 = fim.c;
      } else if ($$7 == 3) {
         $$11 = fim.d;
      } else {
         $$11 = fjy.a(String.valueOf(this.D.r), this.D.s);
      }

      if ($$5) {
         float $$17 = 0.9F + 0.1F * ayz.b((float)this.I * 0.2F);
         $$0.a(gmi::H, $$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, axk.a(1.0F, $$17, $$17, $$17));
         $$0.a(gmi::H, a, $$1, $$2, 80, 80);
      } else {
         int $$18 = axk.a(1.0F, 0.56F, 0.56F, 0.56F);
         $$0.a(gmi::H, $$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$18);
         $$0.a(gmi::H, a, $$1, $$2, 80, 80, $$18);
      }

      $$0.a(this.p, $$6, $$1 + 40, $$2 + 66, -1);
   }
}
