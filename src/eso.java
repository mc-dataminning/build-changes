import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eso extends gko {
   private static final ahg a = new ahg("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final fda v;
   @Nullable
   private erh w;
   private final long x;
   private final vf[] y = new vf[]{vf.c("mco.brokenworld.message.line1"), vf.c("mco.brokenworld.message.line2")};
   private int z;
   private final List<Integer> A = Lists.newArrayList();
   private int B;

   public eso(fda $$0, long $$1, boolean $$2) {
      super($$2 ? vf.c("mco.brokenworld.minigame.title") : vf.c("mco.brokenworld.title"));
      this.v = $$0;
      this.x = $$1;
   }

   @Override
   public void aN_() {
      this.z = this.g / 2 - 150;
      this.d(exf.a(ve.k, $$0 -> this.aE_()).a((this.g - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.w == null) {
         this.a(this.x);
      } else {
         this.D();
      }
   }

   @Override
   public vf h() {
      return vi.a(Stream.concat(Stream.of(this.e), Stream.of(this.y)).collect(Collectors.toList()), ve.u);
   }

   private void D() {
      for (Entry<Integer, ero> $$0 : this.w.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.w.n || this.w.m == erh.d.b;
         exf $$3;
         if ($$2) {
            $$3 = exf.a(vf.c("mco.brokenworld.play"), $$1x -> this.f.a(new esx(this.v, new euo(this.w.a, $$1, this::e)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.w.i.get($$1).n;
         } else {
            $$3 = exf.a(vf.c("mco.brokenworld.download"), $$1x -> {
               vf $$2x = vf.c("mco.configure.world.restore.download.question.line1");
               vf $$3x = vf.c("mco.configure.world.restore.download.question.line2");
               this.f.a(new esw($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.f.a(this);
                  }
               }, esw.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), g(8), 80, 20).a();
         }

         if (this.A.contains($$1)) {
            $$3.j = false;
            $$3.b(vf.c("mco.brokenworld.downloaded"));
         }

         this.d($$3);
      }
   }

   @Override
   public void d() {
      this.B++;
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.y.length; $$4++) {
         $$0.a(this.i, this.y[$$4], this.g / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.w != null) {
         for (Entry<Integer, ero> $$5 : this.w.i.entrySet()) {
            if ($$5.getValue().m != null && $$5.getValue().l != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.w.n == $$5.getKey() && !this.E(),
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
                  this.w.n == $$5.getKey() && !this.E(),
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
      return this.z + ($$0 - 1) * 110;
   }

   private void a(long $$0) {
      new Thread(() -> {
         eqq $$1 = eqq.a();

         try {
            this.w = $$1.a($$0);
            this.D();
         } catch (esd var5) {
            b.error("Couldn't get own world", var5);
            this.f.a(new esu(var5, this.v));
         }
      }).start();
   }

   public void e() {
      new Thread(() -> {
         eqq $$0 = eqq.a();
         if (this.w.e == erh.c.a) {
            this.f.execute(() -> this.f.a(new esx(this, new eui(this.w, this, true, this.f))));
         } else {
            try {
               erh $$1 = $$0.a(this.x);
               this.f.execute(() -> eql.a($$1, this));
            } catch (esd var3) {
               b.error("Couldn't get own world", var3);
               this.f.execute(() -> this.f.a(this.v));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      eqq $$1 = eqq.a();

      try {
         erx $$2 = $$1.b(this.w.a, $$0);
         est $$3 = new est(this, $$2, this.w.a($$0), $$1x -> {
            if ($$1x) {
               this.A.add($$0);
               this.q();
               this.D();
            } else {
               this.f.a(this);
            }
         });
         this.f.a($$3);
      } catch (esd var5) {
         b.error("Couldn't download world data", var5);
         this.f.a(new esu(var5, this));
      }
   }

   @Override
   public void aE_() {
      this.f.a(this.v);
   }

   private boolean E() {
      return this.w != null && this.w.m == erh.d.b;
   }

   private void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      ahg $$11;
      if ($$10) {
         $$11 = esj.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = etw.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = esj.b;
      } else if ($$7 == 2) {
         $$11 = esj.c;
      } else if ($$7 == 3) {
         $$11 = esj.d;
      } else {
         $$11 = etw.a(String.valueOf(this.w.p), this.w.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * aun.b((float)this.B * 0.2F);
         $$0.a($$17, $$17, $$17, 1.0F);
      }

      $$0.a($$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      if ($$5) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(a, $$1, $$2, 80, 80);
      $$0.a(this.i, $$6, $$1 + 40, $$2 + 66, -1);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
