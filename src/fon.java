import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fon extends hro {
   private static final alk a = alk.b("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final gaf C;
   @Nullable
   private fng D;
   private final long E;
   private final xc[] F = new xc[]{xc.c("mco.brokenworld.message.line1"), xc.c("mco.brokenworld.message.line2")};
   private int G;
   private final List<Integer> H = Lists.newArrayList();
   private int I;

   public fon(gaf $$0, long $$1, boolean $$2) {
      super($$2 ? xc.c("mco.brokenworld.minigame.title") : xc.c("mco.brokenworld.title"));
      this.C = $$0;
      this.E = $$1;
   }

   @Override
   public void aS_() {
      this.G = this.n / 2 - 150;
      this.c(fun.a(xb.k, $$0 -> this.aP_()).a((this.n - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.D == null) {
         this.a(this.E);
      } else {
         this.E();
      }
   }

   @Override
   public xc i() {
      return xf.a(Stream.concat(Stream.of(this.l), Stream.of(this.F)).collect(Collectors.toList()), xb.v);
   }

   private void E() {
      for (Entry<Integer, fnm> $$0 : this.D.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.D.p || this.D.i();
         fun $$3;
         if ($$2) {
            $$3 = fun.a(xc.c("mco.brokenworld.play"), $$1x -> this.m.a(new fow(this.C, new fqk(this.D.a, $$1, this::b)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.D.i.get($$1).m;
         } else {
            $$3 = fun.a(
                  xc.c("mco.brokenworld.download"),
                  $$1x -> this.m.a(fpc.a(this, xc.c("mco.configure.world.restore.download.question.line1"), $$1xx -> this.b($$1)))
               )
               .a(this.a($$1), g(8), 80, 20)
               .a();
         }

         if (this.H.contains($$1)) {
            $$3.j = false;
            $$3.b(xc.c("mco.brokenworld.downloaded"));
         }

         this.c($$3);
      }
   }

   @Override
   public void e() {
      this.I++;
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.F.length; $$4++) {
         $$0.a(this.p, this.F[$$4], this.n / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.D != null) {
         for (Entry<Integer, fnm> $$5 : this.D.i.entrySet()) {
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
         fmf $$1 = fmf.a();

         try {
            this.D = $$1.a($$0);
            this.E();
         } catch (fob var5) {
            b.error("Couldn't get own world", var5);
            this.m.a(new fou(var5, this.C));
         }
      }).start();
   }

   public void b() {
      new Thread(() -> {
         fmf $$0 = fmf.a();
         if (this.D.e == fng.c.a) {
            this.m.execute(() -> this.m.a(new fow(this, new fqe(this.D, this, true, this.m))));
         } else {
            try {
               fng $$1 = $$0.a(this.E);
               this.m.execute(() -> fma.a($$1, this));
            } catch (fob var3) {
               b.error("Couldn't get own world", var3);
               this.m.execute(() -> this.m.a(this.C));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      fmf $$1 = fmf.a();

      try {
         fnv $$2 = $$1.b(this.D.a, $$0);
         fot $$3 = new fot(this, $$2, this.D.a($$0), $$1x -> {
            if ($$1x) {
               this.H.add($$0);
               this.p();
               this.E();
            } else {
               this.m.a(this);
            }
         });
         this.m.a($$3);
      } catch (fob var5) {
         b.error("Couldn't download world data", var5);
         this.m.a(new fou(var5, this));
      }
   }

   @Override
   public void aP_() {
      this.m.a(this.C);
   }

   private boolean F() {
      return this.D != null && this.D.i();
   }

   private void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      alk $$11;
      if ($$10) {
         $$11 = foh.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = fpu.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = foh.b;
      } else if ($$7 == 2) {
         $$11 = foh.c;
      } else if ($$7 == 3) {
         $$11 = foh.d;
      } else {
         $$11 = fpu.a(String.valueOf(this.D.r), this.D.s);
      }

      if ($$5) {
         float $$17 = 0.9F + 0.1F * azq.b((float)this.I * 0.2F);
         $$0.a(gsn::H, $$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, aya.a(1.0F, $$17, $$17, $$17));
         $$0.a(gsn::H, a, $$1, $$2, 80, 80);
      } else {
         int $$18 = aya.a(1.0F, 0.56F, 0.56F, 0.56F);
         $$0.a(gsn::H, $$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$18);
         $$0.a(gsn::H, a, $$1, $$2, 80, 80, $$18);
      }

      $$0.a(this.p, $$6, $$1 + 40, $$2 + 66, -1);
   }
}
