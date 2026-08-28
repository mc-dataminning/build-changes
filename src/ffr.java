import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffr extends hdk {
   private static final alc a = alc.b("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final fqd B;
   @Nullable
   private fel C;
   private final long D;
   private final xd[] E = new xd[]{xd.c("mco.brokenworld.message.line1"), xd.c("mco.brokenworld.message.line2")};
   private int F;
   private final List<Integer> G = Lists.newArrayList();
   private int H;

   public ffr(fqd $$0, long $$1, boolean $$2) {
      super($$2 ? xd.c("mco.brokenworld.minigame.title") : xd.c("mco.brokenworld.title"));
      this.B = $$0;
      this.D = $$1;
   }

   @Override
   public void aR_() {
      this.F = this.n / 2 - 150;
      this.c(fkk.a(xc.k, $$0 -> this.d()).a((this.n - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.C == null) {
         this.a(this.D);
      } else {
         this.D();
      }
   }

   @Override
   public xd i() {
      return xg.a(Stream.concat(Stream.of(this.l), Stream.of(this.E)).collect(Collectors.toList()), xc.v);
   }

   private void D() {
      for (Entry<Integer, feq> $$0 : this.C.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.C.n || this.C.i();
         fkk $$3;
         if ($$2) {
            $$3 = fkk.a(xd.c("mco.brokenworld.play"), $$1x -> this.m.a(new ffz(this.B, new fhr(this.C.a, $$1, this::b)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.C.i.get($$1).l;
         } else {
            $$3 = fkk.a(
                  xd.c("mco.brokenworld.download"),
                  $$1x -> this.m.a(fgf.a(this, xd.c("mco.configure.world.restore.download.question.line1"), $$1xx -> this.b($$1)))
               )
               .a(this.a($$1), g(8), 80, 20)
               .a();
         }

         if (this.G.contains($$1)) {
            $$3.j = false;
            $$3.b(xd.c("mco.brokenworld.downloaded"));
         }

         this.c($$3);
      }
   }

   @Override
   public void e() {
      this.H++;
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.E.length; $$4++) {
         $$0.a(this.p, this.E[$$4], this.n / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.C != null) {
         for (Entry<Integer, feq> $$5 : this.C.i.entrySet()) {
            if ($$5.getValue().k != null && $$5.getValue().j != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.C.n == $$5.getKey() && !this.E(),
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
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.C.n == $$5.getKey() && !this.E(),
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
      return this.F + ($$0 - 1) * 110;
   }

   private void a(long $$0) {
      new Thread(() -> {
         fdu $$1 = fdu.a();

         try {
            this.C = $$1.a($$0);
            this.D();
         } catch (fff var5) {
            b.error("Couldn't get own world", var5);
            this.m.a(new ffx(var5, this.B));
         }
      }).start();
   }

   public void b() {
      new Thread(() -> {
         fdu $$0 = fdu.a();
         if (this.C.e == fel.c.a) {
            this.m.execute(() -> this.m.a(new ffz(this, new fhk(this.C, this, true, this.m))));
         } else {
            try {
               fel $$1 = $$0.a(this.D);
               this.m.execute(() -> fdp.a($$1, this));
            } catch (fff var3) {
               b.error("Couldn't get own world", var3);
               this.m.execute(() -> this.m.a(this.B));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      fdu $$1 = fdu.a();

      try {
         fez $$2 = $$1.b(this.C.a, $$0);
         ffw $$3 = new ffw(this, $$2, this.C.a($$0), $$1x -> {
            if ($$1x) {
               this.G.add($$0);
               this.p();
               this.D();
            } else {
               this.m.a(this);
            }
         });
         this.m.a($$3);
      } catch (fff var5) {
         b.error("Couldn't download world data", var5);
         this.m.a(new ffx(var5, this));
      }
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   private boolean E() {
      return this.C != null && this.C.i();
   }

   private void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      alc $$11;
      if ($$10) {
         $$11 = ffl.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = fgy.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = ffl.b;
      } else if ($$7 == 2) {
         $$11 = ffl.c;
      } else if ($$7 == 3) {
         $$11 = ffl.d;
      } else {
         $$11 = fgy.a(String.valueOf(this.C.p), this.C.q);
      }

      if ($$5) {
         float $$17 = 0.9F + 0.1F * azd.b((float)this.H * 0.2F);
         $$0.a(ghq::B, $$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, axo.a(1.0F, $$17, $$17, $$17));
         $$0.a(ghq::B, a, $$1, $$2, 80, 80);
      } else {
         int $$18 = axo.a(1.0F, 0.56F, 0.56F, 0.56F);
         $$0.a(ghq::B, $$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$18);
         $$0.a(ghq::B, a, $$1, $$2, 80, 80, $$18);
      }

      $$0.a(this.p, $$6, $$1 + 40, $$2 + 66, -1);
   }
}
