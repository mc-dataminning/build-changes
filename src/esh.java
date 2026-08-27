import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esh extends gkc {
   private static final ahd a = new ahd("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final fct v;
   @Nullable
   private era w;
   private final long x;
   private final vd[] y = new vd[]{vd.c("mco.brokenworld.message.line1"), vd.c("mco.brokenworld.message.line2")};
   private int z;
   private final List<Integer> A = Lists.newArrayList();
   private int B;

   public esh(fct $$0, long $$1, boolean $$2) {
      super($$2 ? vd.c("mco.brokenworld.minigame.title") : vd.c("mco.brokenworld.title"));
      this.v = $$0;
      this.x = $$1;
   }

   @Override
   public void aN_() {
      this.z = this.g / 2 - 150;
      this.d(ewy.a(vc.k, $$0 -> this.aE_()).a((this.g - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.w == null) {
         this.a(this.x);
      } else {
         this.C();
      }
   }

   @Override
   public vd h() {
      return vg.a(Stream.concat(Stream.of(this.e), Stream.of(this.y)).collect(Collectors.toList()), vc.u);
   }

   private void C() {
      for (Entry<Integer, erh> $$0 : this.w.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.w.n || this.w.m == era.d.b;
         ewy $$3;
         if ($$2) {
            $$3 = ewy.a(vd.c("mco.brokenworld.play"), $$1x -> this.f.a(new esq(this.v, new euh(this.w.a, $$1, this::e)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.w.i.get($$1).n;
         } else {
            $$3 = ewy.a(vd.c("mco.brokenworld.download"), $$1x -> {
               vd $$2x = vd.c("mco.configure.world.restore.download.question.line1");
               vd $$3x = vd.c("mco.configure.world.restore.download.question.line2");
               this.f.a(new esp($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.f.a(this);
                  }
               }, esp.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), g(8), 80, 20).a();
         }

         if (this.A.contains($$1)) {
            $$3.j = false;
            $$3.b(vd.c("mco.brokenworld.downloaded"));
         }

         this.d($$3);
      }
   }

   @Override
   public void d() {
      this.B++;
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.y.length; $$4++) {
         $$0.a(this.i, this.y[$$4], this.g / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.w != null) {
         for (Entry<Integer, erh> $$5 : this.w.i.entrySet()) {
            if ($$5.getValue().m != null && $$5.getValue().l != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.w.n == $$5.getKey() && !this.D(),
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
                  this.w.n == $$5.getKey() && !this.D(),
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
         eqj $$1 = eqj.a();

         try {
            this.w = $$1.a($$0);
            this.C();
         } catch (erw var5) {
            b.error("Couldn't get own world", var5);
            this.f.a(new esn(var5, this.v));
         }
      }).start();
   }

   public void e() {
      new Thread(() -> {
         eqj $$0 = eqj.a();
         if (this.w.e == era.c.a) {
            this.f.execute(() -> this.f.a(new esq(this, new eub(this.w, this, true, this.f))));
         } else {
            try {
               era $$1 = $$0.a(this.x);
               this.f.execute(() -> eqe.a($$1, this));
            } catch (erw var3) {
               b.error("Couldn't get own world", var3);
               this.f.execute(() -> this.f.a(this.v));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      eqj $$1 = eqj.a();

      try {
         erq $$2 = $$1.b(this.w.a, $$0);
         esm $$3 = new esm(this, $$2, this.w.a($$0), $$1x -> {
            if ($$1x) {
               this.A.add($$0);
               this.p();
               this.C();
            } else {
               this.f.a(this);
            }
         });
         this.f.a($$3);
      } catch (erw var5) {
         b.error("Couldn't download world data", var5);
         this.f.a(new esn(var5, this));
      }
   }

   @Override
   public void aE_() {
      this.f.a(this.v);
   }

   private boolean D() {
      return this.w != null && this.w.m == era.d.b;
   }

   private void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      ahd $$11;
      if ($$10) {
         $$11 = esc.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = etp.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = esc.b;
      } else if ($$7 == 2) {
         $$11 = esc.c;
      } else if ($$7 == 3) {
         $$11 = esc.d;
      } else {
         $$11 = etp.a(String.valueOf(this.w.p), this.w.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * aui.b((float)this.B * 0.2F);
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
