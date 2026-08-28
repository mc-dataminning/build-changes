import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcv extends gvm {
   private static final akk a = new akk("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final fnd A;
   @Nullable
   private fbn B;
   private final long C;
   private final wu[] D = new wu[]{wu.c("mco.brokenworld.message.line1"), wu.c("mco.brokenworld.message.line2")};
   private int E;
   private final List<Integer> F = Lists.newArrayList();
   private int G;

   public fcv(fnd $$0, long $$1, boolean $$2) {
      super($$2 ? wu.c("mco.brokenworld.minigame.title") : wu.c("mco.brokenworld.title"));
      this.A = $$0;
      this.C = $$1;
   }

   @Override
   public void aO_() {
      this.E = this.m / 2 - 150;
      this.c(fhm.a(wt.k, $$0 -> this.d()).a((this.m - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.B == null) {
         this.a(this.C);
      } else {
         this.E();
      }
   }

   @Override
   public wu i() {
      return wx.a(Stream.concat(Stream.of(this.k), Stream.of(this.D)).collect(Collectors.toList()), wt.v);
   }

   private void E() {
      for (Entry<Integer, fbu> $$0 : this.B.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.B.n || this.B.i();
         fhm $$3;
         if ($$2) {
            $$3 = fhm.a(wu.c("mco.brokenworld.play"), $$1x -> this.l.a(new fdd(this.A, new fev(this.B.a, $$1, this::b)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.B.i.get($$1).n;
         } else {
            $$3 = fhm.a(
                  wu.c("mco.brokenworld.download"),
                  $$1x -> this.l.a(fdj.a(this, wu.c("mco.configure.world.restore.download.question.line1"), $$1xx -> this.b($$1)))
               )
               .a(this.a($$1), g(8), 80, 20)
               .a();
         }

         if (this.F.contains($$1)) {
            $$3.j = false;
            $$3.b(wu.c("mco.brokenworld.downloaded"));
         }

         this.c($$3);
      }
   }

   @Override
   public void e() {
      this.G++;
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.D.length; $$4++) {
         $$0.a(this.o, this.D[$$4], this.m / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.B != null) {
         for (Entry<Integer, fbu> $$5 : this.B.i.entrySet()) {
            if ($$5.getValue().m != null && $$5.getValue().l != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.B.n == $$5.getKey() && !this.F(),
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
                  this.B.n == $$5.getKey() && !this.F(),
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
      return this.E + ($$0 - 1) * 110;
   }

   private void a(long $$0) {
      new Thread(() -> {
         faw $$1 = faw.a();

         try {
            this.B = $$1.a($$0);
            this.E();
         } catch (fcj var5) {
            b.error("Couldn't get own world", var5);
            this.l.a(new fdb(var5, this.A));
         }
      }).start();
   }

   public void b() {
      new Thread(() -> {
         faw $$0 = faw.a();
         if (this.B.e == fbn.c.a) {
            this.l.execute(() -> this.l.a(new fdd(this, new feo(this.B, this, true, this.l))));
         } else {
            try {
               fbn $$1 = $$0.a(this.C);
               this.l.execute(() -> far.a($$1, this));
            } catch (fcj var3) {
               b.error("Couldn't get own world", var3);
               this.l.execute(() -> this.l.a(this.A));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      faw $$1 = faw.a();

      try {
         fcd $$2 = $$1.b(this.B.a, $$0);
         fda $$3 = new fda(this, $$2, this.B.a($$0), $$1x -> {
            if ($$1x) {
               this.F.add($$0);
               this.p();
               this.E();
            } else {
               this.l.a(this);
            }
         });
         this.l.a($$3);
      } catch (fcj var5) {
         b.error("Couldn't download world data", var5);
         this.l.a(new fdb(var5, this));
      }
   }

   @Override
   public void d() {
      this.l.a(this.A);
   }

   private boolean F() {
      return this.B != null && this.B.i();
   }

   private void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      akk $$11;
      if ($$10) {
         $$11 = fcp.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = fec.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = fcp.b;
      } else if ($$7 == 2) {
         $$11 = fcp.c;
      } else if ($$7 == 3) {
         $$11 = fcp.d;
      } else {
         $$11 = fec.a(String.valueOf(this.B.p), this.B.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * aye.b((float)this.G * 0.2F);
         $$0.a($$17, $$17, $$17, 1.0F);
      }

      $$0.a($$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      if ($$5) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(a, $$1, $$2, 80, 80);
      $$0.a(this.o, $$6, $$1 + 40, $$2 + 66, -1);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
