import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dun extends duq {
   private static final Logger c = LogUtils.getLogger();
   private static final String d = "flower_pos";
   private static final String e = "bees";
   static final List<String> f = Arrays.asList(
      "Air",
      "ArmorDropChances",
      "ArmorItems",
      "Brain",
      "CanPickUpLoot",
      "DeathTime",
      "FallDistance",
      "FallFlying",
      "Fire",
      "HandDropChances",
      "HandItems",
      "HurtByTimestamp",
      "HurtTime",
      "LeftHanded",
      "Motion",
      "NoGravity",
      "OnGround",
      "PortalCooldown",
      "Pos",
      "Rotation",
      "SleepingX",
      "SleepingY",
      "SleepingZ",
      "CannotEnterHiveTicks",
      "TicksSincePollination",
      "CropsGrownSincePollination",
      "hive_pos",
      "Passengers",
      "leash",
      "UUID"
   );
   public static final int a = 3;
   private static final int g = 400;
   private static final int h = 2400;
   public static final int b = 600;
   private final List<dun.a> i = Lists.newArrayList();
   @Nullable
   private jh j;

   public dun(jh $$0, dxo $$1) {
      super(dus.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aB_()), dun.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (jh $$0 : jh.c(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dne) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean c() {
      return this.i.isEmpty();
   }

   public boolean d() {
      return this.i.size() == 3;
   }

   public void a(@Nullable cpo $$0, dxo $$1, dun.b $$2) {
      List<bvb> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bvb $$4 : $$3) {
            if ($$4 instanceof chp) {
               chp $$5 = (chp)$$4;
               if ($$0.du().g($$4.du()) <= 16.0) {
                  if (!this.j()) {
                     $$5.h($$0);
                  } else {
                     $$5.s(400);
                  }
               }
            }
         }
      }
   }

   private List<bvb> a(dxo $$0, dun.b $$1) {
      List<bvb> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bbb
   public int f() {
      return this.i.size();
   }

   public static int a(dxo $$0) {
      return $$0.c(djx.c);
   }

   @bbb
   public boolean j() {
      return dks.a(this.o, this.aB_());
   }

   public void a(bvb $$0) {
      if (this.i.size() < 3) {
         $$0.ae();
         $$0.bP();
         this.a(dun.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof chp $$1 && $$1.t() && (!this.k() || this.o.A.h())) {
               this.j = $$1.p();
            }

            jh $$2 = this.aB_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awv.bV, aww.e, 1.0F, 1.0F);
            this.o.a(eck.c, $$2, eck.a.a($$0, this.m()));
         }

         $$0.at();
         super.e();
      }
   }

   public void a(dun.c $$0) {
      this.i.add(new dun.a($$0));
   }

   private static boolean a(dgz $$0, jh $$1, dxo $$2, dun.c $$3, @Nullable List<bvb> $$4, dun.b $$5, @Nullable jh $$6) {
      if (chp.c($$0) && $$5 != dun.b.c) {
         return false;
      } else {
         jm $$7 = $$2.c(djx.b);
         jh $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dun.b.c) {
            return false;
         } else {
            bvb $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof chp $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dun.b.a) {
                     $$11.gE();
                     if ($$2.a(axk.aJ, $$0x -> $$0x.b(djx.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(djx.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dr();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.ds() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dM(), $$10.dO());
               }

               $$0.a(null, $$1, awv.bW, aww.e, 1.0F, 1.0F);
               $$0.a(eck.c, $$1, eck.a.a($$10, $$0.a_($$1)));
               return $$0.b($$10);
            } else {
               return false;
            }
         }
      }
   }

   private boolean k() {
      return this.j != null;
   }

   private static void a(dgz $$0, jh $$1, dxo $$2, List<dun.a> $$3, @Nullable jh $$4) {
      boolean $$5 = false;
      Iterator<dun.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dun.a $$7 = $$6.next();
         if ($$7.a()) {
            dun.b $$8 = $$7.c() ? dun.b.a : dun.b.b;
            if (a($$0, $$1, $$2, $$7.b(), null, $$8, $$4)) {
               $$5 = true;
               $$6.remove();
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, dun $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.H_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awv.bY, aww.e, 1.0F, 1.0F);
      }

      agy.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dun.c.b.parse(va.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = vb.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vj)dun.c.b.encodeStart(va.a, this.s()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", vb.a(this.j));
      }
   }

   @Override
   protected void a(duq.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dun.c> $$1 = $$0.a(ku.an, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.an, this.s());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dun.c> s() {
      return this.i.stream().map(dun.a::b).toList();
   }

   static class a {
      private final dun.c a;
      private int b;

      a(dun.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dun.c b() {
         return new dun.c(this.a.d, this.b, this.a.f);
      }

      public boolean c() {
         return this.a.d.e().q("HasNectar");
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   public static record c(czp d, int e, int f) {
      public static final Codec<dun.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  czp.b.optionalFieldOf("entity_data", czp.a).forGetter(dun.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dun.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dun.c::c)
               )
               .apply($$0, dun.c::new)
      );
      public static final Codec<List<dun.c>> b = a.listOf();
      public static final zi<ByteBuf, dun.c> c = zi.a(czp.d, dun.c::a, zg.h, dun.c::b, zg.h, dun.c::c, dun.c::new);

      public static dun.c a(bvb $$0) {
         um $$1 = new um();
         $$0.e($$1);
         dun.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dun.c(czp.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dun.c a(int $$0) {
         um $$1 = new um();
         $$1.a("id", ma.f.b(bvi.l).toString());
         return new dun.c(czp.a($$1), $$0, 600);
      }

      @Nullable
      public bvb a(dgz $$0, jh $$1) {
         um $$2 = this.d.d();
         dun.f.forEach($$2::r);
         bvb $$3 = bvi.a($$2, $$0, bvh.r, $$0x -> $$0x);
         if ($$3 != null && $$3.aq().a(axo.e)) {
            $$3.f(true);
            if ($$3 instanceof chp $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, chp $$1) {
         int $$2 = $$1.Z_();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gw() - $$0));
      }

      public czp a() {
         return this.d;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.f;
      }
   }
}
