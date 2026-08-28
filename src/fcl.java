import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcl extends gvf {
   private static final ale a = new ale("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final fnc B;
   @Nullable
   private fbe C;
   private final long D;
   private final xo[] E = new xo[]{xo.c("mco.brokenworld.message.line1"), xo.c("mco.brokenworld.message.line2")};
   private int F;
   private final List<Integer> G = Lists.newArrayList();
   private int H;

   public fcl(fnc $$0, long $$1, boolean $$2) {
      super($$2 ? xo.c("mco.brokenworld.minigame.title") : xo.c("mco.brokenworld.title"));
      this.B = $$0;
      this.D = $$1;
   }

   @Override
   public void aM_() {
      this.F = this.n / 2 - 150;
      this.c(fhd.a(xn.k, $$0 -> this.d()).a((this.n - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.C == null) {
         this.a(this.D);
      } else {
         this.E();
      }
   }

   @Override
   public xo i() {
      return xr.a(Stream.concat(Stream.of(this.l), Stream.of(this.E)).collect(Collectors.toList()), xn.v);
   }

   private void E() {
      for (Entry<Integer, fbl> $$0 : this.C.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.C.n || this.C.m == fbe.d.b;
         fhd $$3;
         if ($$2) {
            $$3 = fhd.a(xo.c("mco.brokenworld.play"), $$1x -> this.m.a(new fcu(this.B, new fem(this.C.a, $$1, this::b)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.C.i.get($$1).n;
         } else {
            $$3 = fhd.a(xo.c("mco.brokenworld.download"), $$1x -> {
               xo $$2x = xo.c("mco.configure.world.restore.download.question.line1");
               xo $$3x = xo.c("mco.configure.world.restore.download.question.line2");
               this.m.a(new fct($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.m.a(this);
                  }
               }, fct.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), g(8), 80, 20).a();
         }

         if (this.G.contains($$1)) {
            $$3.j = false;
            $$3.b(xo.c("mco.brokenworld.downloaded"));
         }

         this.c($$3);
      }
   }

   @Override
   public void e() {
      this.H++;
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.E.length; $$4++) {
         $$0.a(this.p, this.E[$$4], this.n / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.C != null) {
         for (Entry<Integer, fbl> $$5 : this.C.i.entrySet()) {
            if ($$5.getValue().m != null && $$5.getValue().l != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.C.n == $$5.getKey() && !this.F(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  $$5.getValue().l,
                  $$5.getValue().m,
                  $$5.getValue().n
               );
            } else {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.C.n == $$5.getKey() && !this.F(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  -1L,
                  null,
                  $$5.getValue().n
               );
            }
         }
      }
   }

   private int a(int $$0) {
      return this.F + ($$0 - 1) * 110;
   }

   private void a(long $$0) {
      new Thread(() -> {
         fan $$1 = fan.a();

         try {
            this.C = $$1.a($$0);
            this.E();
         } catch (fca var5) {
            b.error("Couldn't get own world", var5);
            this.m.a(new fcr(var5, this.B));
         }
      }).start();
   }

   public void b() {
      new Thread(() -> {
         fan $$0 = fan.a();
         if (this.C.e == fbe.c.a) {
            this.m.execute(() -> this.m.a(new fcu(this, new fef(this.C, this, true, this.m))));
         } else {
            try {
               fbe $$1 = $$0.a(this.D);
               this.m.execute(() -> fai.a($$1, this));
            } catch (fca var3) {
               b.error("Couldn't get own world", var3);
               this.m.execute(() -> this.m.a(this.B));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      fan $$1 = fan.a();

      try {
         fbu $$2 = $$1.b(this.C.a, $$0);
         fcq $$3 = new fcq(this, $$2, this.C.a($$0), $$1x -> {
            if ($$1x) {
               this.G.add($$0);
               this.p();
               this.E();
            } else {
               this.m.a(this);
            }
         });
         this.m.a($$3);
      } catch (fca var5) {
         b.error("Couldn't download world data", var5);
         this.m.a(new fcr(var5, this));
      }
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   private boolean F() {
      return this.C != null && this.C.m == fbe.d.b;
   }

   private void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      ale $$11;
      if ($$10) {
         $$11 = fcg.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = fdt.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = fcg.b;
      } else if ($$7 == 2) {
         $$11 = fcg.c;
      } else if ($$7 == 3) {
         $$11 = fcg.d;
      } else {
         $$11 = fdt.a(String.valueOf(this.C.p), this.C.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * ayy.b((float)this.H * 0.2F);
         $$0.a($$17, $$17, $$17, 1.0F);
      }

      $$0.a($$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      if ($$5) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(a, $$1, $$2, 80, 80);
      $$0.a(this.p, $$6, $$1 + 40, $$2 + 66, -1);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
