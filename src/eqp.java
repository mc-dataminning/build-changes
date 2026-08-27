import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqp extends ghw {
   private static final agm a = new agm("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final faz v;
   @Nullable
   private epi w;
   private final long x;
   private final uv[] y = new uv[]{uv.c("mco.brokenworld.message.line1"), uv.c("mco.brokenworld.message.line2")};
   private int z;
   private final List<Integer> A = Lists.newArrayList();
   private int B;

   public eqp(faz $$0, long $$1, boolean $$2) {
      super($$2 ? uv.c("mco.brokenworld.minigame.title") : uv.c("mco.brokenworld.title"));
      this.v = $$0;
      this.x = $$1;
   }

   @Override
   public void aQ_() {
      this.z = this.g / 2 - 150;
      this.d(eve.a(uu.k, $$0 -> this.aG_()).a((this.g - 150) / 2, h(13) - 5, 150, 20).a());
      if (this.w == null) {
         this.a(this.x);
      } else {
         this.C();
      }
   }

   @Override
   public uv h() {
      return uy.a(Stream.concat(Stream.of(this.e), Stream.of(this.y)).collect(Collectors.toList()), uu.u);
   }

   private void C() {
      for (Entry<Integer, epp> $$0 : this.w.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.w.n || this.w.m == epi.d.b;
         eve $$3;
         if ($$2) {
            $$3 = eve.a(uv.c("mco.brokenworld.play"), $$1x -> this.f.a(new eqy(this.v, new esp(this.w.a, $$1, this::e)))).a(this.a($$1), h(8), 80, 20).a();
            $$3.i = !this.w.i.get($$1).n;
         } else {
            $$3 = eve.a(uv.c("mco.brokenworld.download"), $$1x -> {
               uv $$2x = uv.c("mco.configure.world.restore.download.question.line1");
               uv $$3x = uv.c("mco.configure.world.restore.download.question.line2");
               this.f.a(new eqx($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.f.a(this);
                  }
               }, eqx.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), h(8), 80, 20).a();
         }

         if (this.A.contains($$1)) {
            $$3.i = false;
            $$3.b(uv.c("mco.brokenworld.downloaded"));
         }

         this.d($$3);
      }
   }

   @Override
   public void d() {
      this.B++;
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.y.length; $$4++) {
         $$0.a(this.i, this.y[$$4], this.g / 2, h(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.w != null) {
         for (Entry<Integer, epp> $$5 : this.w.i.entrySet()) {
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
         eor $$1 = eor.a();

         try {
            this.w = $$1.a($$0);
            this.C();
         } catch (eqe var5) {
            b.error("Couldn't get own world", var5);
            this.f.a(new eqv(var5, this.v));
         }
      }).start();
   }

   public void e() {
      new Thread(() -> {
         eor $$0 = eor.a();
         if (this.w.e == epi.c.a) {
            this.f.execute(() -> this.f.a(new eqy(this, new esj(this.w, this, true, this.f))));
         } else {
            try {
               epi $$1 = $$0.a(this.x);
               this.f.execute(() -> eom.a($$1, this));
            } catch (eqe var3) {
               b.error("Couldn't get own world", var3);
               this.f.execute(() -> this.f.a(this.v));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      eor $$1 = eor.a();

      try {
         epy $$2 = $$1.b(this.w.a, $$0);
         equ $$3 = new equ(this, $$2, this.w.a($$0), $$1x -> {
            if ($$1x) {
               this.A.add($$0);
               this.n();
               this.C();
            } else {
               this.f.a(this);
            }
         });
         this.f.a($$3);
      } catch (eqe var5) {
         b.error("Couldn't download world data", var5);
         this.f.a(new eqv(var5, this));
      }
   }

   @Override
   public void aG_() {
      this.f.a(this.v);
   }

   private boolean D() {
      return this.w != null && this.w.m == epi.d.b;
   }

   private void a(eut $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      agm $$11;
      if ($$10) {
         $$11 = eqk.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = erx.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = eqk.b;
      } else if ($$7 == 2) {
         $$11 = eqk.c;
      } else if ($$7 == 3) {
         $$11 = eqk.d;
      } else {
         $$11 = erx.a(String.valueOf(this.w.p), this.w.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * atq.b((float)this.B * 0.2F);
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
