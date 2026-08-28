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

public class drs extends drv {
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
   private final List<drs.a> i = Lists.newArrayList();
   @Nullable
   private jf j;

   public drs(jf $$0, dus $$1) {
      super(drx.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aC_()), drs.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (jf $$0 : jf.c(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dkm) {
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

   public void a(@Nullable cnx $$0, dus $$1, drs.b $$2) {
      List<btr> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (btr $$4 : $$3) {
            if ($$4 instanceof cge) {
               cge $$5 = (cge)$$4;
               if ($$0.dq().g($$4.dq()) <= 16.0) {
                  if (!this.j()) {
                     $$5.h($$0);
                  } else {
                     $$5.t(400);
                  }
               }
            }
         }
      }
   }

   private List<btr> a(dus $$0, drs.b $$1) {
      List<btr> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bal
   public int f() {
      return this.i.size();
   }

   public static int a(dus $$0) {
      return $$0.c(dhg.c);
   }

   @bal
   public boolean j() {
      return dia.a(this.o, this.aC_());
   }

   public void a(btr $$0) {
      if (this.i.size() < 3) {
         $$0.af();
         $$0.bM();
         this.a(drs.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof cge $$1 && $$1.t() && (!this.k() || this.o.z.h())) {
               this.j = $$1.q();
            }

            jf $$2 = this.aC_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awg.bV, awh.e, 1.0F, 1.0F);
            this.o.a(dzp.c, $$2, dzp.a.a($$0, this.m()));
         }

         $$0.as();
         super.e();
      }
   }

   public void a(drs.c $$0) {
      this.i.add(new drs.a($$0));
   }

   private static boolean a(dej $$0, jf $$1, dus $$2, drs.c $$3, @Nullable List<btr> $$4, drs.b $$5, @Nullable jf $$6) {
      if (cge.c($$0) && $$5 != drs.b.c) {
         return false;
      } else {
         jk $$7 = $$2.c(dhg.b);
         jf $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != drs.b.c) {
            return false;
         } else {
            btr $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cge $$11) {
                  if ($$6 != null && !$$11.t() && $$0.z.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == drs.b.a) {
                     $$11.gE();
                     if ($$2.a(awv.aH, $$0x -> $$0x.b(dhg.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dhg.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dn();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.do() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dI(), $$10.dK());
               }

               $$0.a(null, $$1, awg.bW, awh.e, 1.0F, 1.0F);
               $$0.a(dzp.c, $$1, dzp.a.a($$10, $$0.a_($$1)));
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

   private static void a(dej $$0, jf $$1, dus $$2, List<drs.a> $$3, @Nullable jf $$4) {
      boolean $$5 = false;
      Iterator<drs.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         drs.a $$7 = $$6.next();
         if ($$7.a()) {
            drs.b $$8 = $$7.c() ? drs.b.a : drs.b.b;
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

   public static void a(dej $$0, jf $$1, dus $$2, drs $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.D_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awg.bY, awh.e, 1.0F, 1.0F);
      }

      ago.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         drs.c.b.parse(uu.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = uv.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vd)drs.c.b.encodeStart(uu.a, this.t()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", uv.a(this.j));
      }
   }

   @Override
   protected void a(drv.b $$0) {
      super.a($$0);
      this.i.clear();
      List<drs.c> $$1 = $$0.a(ks.ai, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(ko.a $$0) {
      super.a($$0);
      $$0.a(ks.ai, this.t());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<drs.c> t() {
      return this.i.stream().map(drs.a::b).toList();
   }

   static class a {
      private final drs.c a;
      private int b;

      a(drs.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public drs.c b() {
         return new drs.c(this.a.d, this.b, this.a.f);
      }

      public boolean c() {
         return this.a.d.d().q("HasNectar");
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   public static record c(cyh d, int e, int f) {
      public static final Codec<drs.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyh.b.optionalFieldOf("entity_data", cyh.a).forGetter(drs.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(drs.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(drs.c::c)
               )
               .apply($$0, drs.c::new)
      );
      public static final Codec<List<drs.c>> b = a.listOf();
      public static final zc<ByteBuf, drs.c> c = zc.a(cyh.d, drs.c::a, za.h, drs.c::b, za.h, drs.c::c, drs.c::new);

      public static drs.c a(btr $$0) {
         ug $$1 = new ug();
         $$0.e($$1);
         drs.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new drs.c(cyh.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static drs.c a(int $$0) {
         ug $$1 = new ug();
         $$1.a("id", lv.f.b(bty.h).toString());
         return new drs.c(cyh.a($$1), $$0, 600);
      }

      @Nullable
      public btr a(dej $$0, jf $$1) {
         ug $$2 = this.d.c();
         drs.f.forEach($$2::r);
         btr $$3 = bty.a($$2, $$0, btx.r, $$0x -> $$0x);
         if ($$3 != null && $$3.ao().a(awz.e)) {
            $$3.f(true);
            if ($$3 instanceof cge $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cge $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.s(Math.max(0, $$1.gw() - $$0));
      }

      public cyh a() {
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
