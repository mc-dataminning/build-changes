import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epy extends ghe {
   private static final agg a = new agg("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final fah v;
   @Nullable
   private eor w;
   private final long x;
   private final ur[] y = new ur[]{ur.c("mco.brokenworld.message.line1"), ur.c("mco.brokenworld.message.line2")};
   private int z;
   private final List<Integer> A = Lists.newArrayList();
   private int B;

   public epy(fah $$0, long $$1, boolean $$2) {
      super($$2 ? ur.c("mco.brokenworld.minigame.title") : ur.c("mco.brokenworld.title"));
      this.v = $$0;
      this.x = $$1;
   }

   @Override
   public void aO_() {
      this.z = this.g / 2 - 150;
      this.d(eum.a(uq.k, $$0 -> this.aE_()).a((this.g - 150) / 2, h(13) - 5, 150, 20).a());
      if (this.w == null) {
         this.a(this.x);
      } else {
         this.C();
      }
   }

   @Override
   public ur h() {
      return uu.a(Stream.concat(Stream.of(this.e), Stream.of(this.y)).collect(Collectors.toList()), uq.u);
   }

   private void C() {
      for (Entry<Integer, eoy> $$0 : this.w.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.w.n || this.w.m == eor.d.b;
         eum $$3;
         if ($$2) {
            $$3 = eum.a(ur.c("mco.brokenworld.play"), $$1x -> this.f.a(new eqh(this.v, new ery(this.w.a, $$1, this::e)))).a(this.a($$1), h(8), 80, 20).a();
            $$3.i = !this.w.i.get($$1).n;
         } else {
            $$3 = eum.a(ur.c("mco.brokenworld.download"), $$1x -> {
               ur $$2x = ur.c("mco.configure.world.restore.download.question.line1");
               ur $$3x = ur.c("mco.configure.world.restore.download.question.line2");
               this.f.a(new eqg($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.f.a(this);
                  }
               }, eqg.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), h(8), 80, 20).a();
         }

         if (this.A.contains($$1)) {
            $$3.i = false;
            $$3.b(ur.c("mco.brokenworld.downloaded"));
         }

         this.d($$3);
      }
   }

   @Override
   public void d() {
      this.B++;
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.y.length; $$4++) {
         $$0.a(this.i, this.y[$$4], this.g / 2, h(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.w != null) {
         for (Entry<Integer, eoy> $$5 : this.w.i.entrySet()) {
            if ($$5.getValue().m != null && $$5.getValue().l != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  h(1) + 5,
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
                  h(1) + 5,
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
         eoa $$1 = eoa.a();

         try {
            this.w = $$1.a($$0);
            this.C();
         } catch (epn var5) {
            b.error("Couldn't get own world", var5);
            this.f.a(new eqe(var5, this.v));
         }
      }).start();
   }

   public void e() {
      new Thread(() -> {
         eoa $$0 = eoa.a();
         if (this.w.e == eor.c.a) {
            this.f.execute(() -> this.f.a(new eqh(this, new ers(this.w, this, true, this.f))));
         } else {
            try {
               eor $$1 = $$0.a(this.x);
               this.f.execute(() -> env.a($$1, this));
            } catch (epn var3) {
               b.error("Couldn't get own world", var3);
               this.f.execute(() -> this.f.a(this.v));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      eoa $$1 = eoa.a();

      try {
         eph $$2 = $$1.b(this.w.a, $$0);
         eqd $$3 = new eqd(this, $$2, this.w.a($$0), $$1x -> {
            if ($$1x) {
               this.A.add($$0);
               this.n();
               this.C();
            } else {
               this.f.a(this);
            }
         });
         this.f.a($$3);
      } catch (epn var5) {
         b.error("Couldn't download world data", var5);
         this.f.a(new eqe(var5, this));
      }
   }

   @Override
   public void aE_() {
      this.f.a(this.v);
   }

   private boolean D() {
      return this.w != null && this.w.m == eor.d.b;
   }

   private void a(eub $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      agg $$11;
      if ($$10) {
         $$11 = ept.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = erg.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = ept.b;
      } else if ($$7 == 2) {
         $$11 = ept.c;
      } else if ($$7 == 3) {
         $$11 = ept.d;
      } else {
         $$11 = erg.a(String.valueOf(this.w.p), this.w.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * ati.b((float)this.B * 0.2F);
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
