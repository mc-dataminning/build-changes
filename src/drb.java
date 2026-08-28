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

public class drb extends dre {
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
   private final List<drb.a> i = Lists.newArrayList();
   @Nullable
   private je j;

   public drb(je $$0, dua $$1) {
      super(drg.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aD_()), drb.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (je $$0 : je.c(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof djv) {
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

   public void a(@Nullable cnp $$0, dua $$1, drb.b $$2) {
      List<btj> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (btj $$4 : $$3) {
            if ($$4 instanceof cfw) {
               cfw $$5 = (cfw)$$4;
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

   private List<btj> a(dua $$0, drb.b $$1) {
      List<btj> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bai
   public int f() {
      return this.i.size();
   }

   public static int a(dua $$0) {
      return $$0.c(dgp.c);
   }

   @bai
   public boolean j() {
      return dhj.a(this.o, this.aD_());
   }

   public void a(btj $$0) {
      if (this.i.size() < 3) {
         $$0.af();
         $$0.bM();
         this.a(drb.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof cfw $$1 && $$1.t() && (!this.k() || this.o.z.h())) {
               this.j = $$1.q();
            }

            je $$2 = this.aD_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awd.bV, awe.e, 1.0F, 1.0F);
            this.o.a(dyx.c, $$2, dyx.a.a($$0, this.m()));
         }

         $$0.as();
         super.e();
      }
   }

   public void a(drb.c $$0) {
      this.i.add(new drb.a($$0));
   }

   private static boolean a(dds $$0, je $$1, dua $$2, drb.c $$3, @Nullable List<btj> $$4, drb.b $$5, @Nullable je $$6) {
      if (($$0.T() || $$0.ae()) && $$5 != drb.b.c) {
         return false;
      } else {
         jj $$7 = $$2.c(dgp.b);
         je $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != drb.b.c) {
            return false;
         } else {
            btj $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cfw $$11) {
                  if ($$6 != null && !$$11.t() && $$0.z.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == drb.b.a) {
                     $$11.gE();
                     if ($$2.a(aws.aH, $$0x -> $$0x.b(dgp.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dgp.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, awd.bW, awe.e, 1.0F, 1.0F);
               $$0.a(dyx.c, $$1, dyx.a.a($$10, $$0.a_($$1)));
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

   private static void a(dds $$0, je $$1, dua $$2, List<drb.a> $$3, @Nullable je $$4) {
      boolean $$5 = false;
      Iterator<drb.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         drb.a $$7 = $$6.next();
         if ($$7.a()) {
            drb.b $$8 = $$7.c() ? drb.b.a : drb.b.b;
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

   public static void a(dds $$0, je $$1, dua $$2, drb $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.C_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awd.bY, awe.e, 1.0F, 1.0F);
      }

      agn.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         drb.c.b.parse(ut.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = uu.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vc)drb.c.b.encodeStart(ut.a, this.t()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", uu.a(this.j));
      }
   }

   @Override
   protected void a(dre.b $$0) {
      super.a($$0);
      this.i.clear();
      List<drb.c> $$1 = $$0.a(kr.af, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.af, this.t());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<drb.c> t() {
      return this.i.stream().map(drb.a::b).toList();
   }

   static class a {
      private final drb.c a;
      private int b;

      a(drb.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public drb.c b() {
         return new drb.c(this.a.d, this.b, this.a.f);
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

   public static record c(cya d, int e, int f) {
      public static final Codec<drb.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cya.b.optionalFieldOf("entity_data", cya.a).forGetter(drb.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(drb.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(drb.c::c)
               )
               .apply($$0, drb.c::new)
      );
      public static final Codec<List<drb.c>> b = a.listOf();
      public static final zb<ByteBuf, drb.c> c = zb.a(cya.d, drb.c::a, yz.g, drb.c::b, yz.g, drb.c::c, drb.c::new);

      public static drb.c a(btj $$0) {
         uf $$1 = new uf();
         $$0.e($$1);
         drb.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new drb.c(cya.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static drb.c a(int $$0) {
         uf $$1 = new uf();
         $$1.a("id", lu.f.b(btq.h).toString());
         return new drb.c(cya.a($$1), $$0, 600);
      }

      @Nullable
      public btj a(dds $$0, je $$1) {
         uf $$2 = this.d.c();
         drb.f.forEach($$2::r);
         btj $$3 = btq.a($$2, $$0, btp.r, $$0x -> $$0x);
         if ($$3 != null && $$3.ao().a(aww.e)) {
            $$3.f(true);
            if ($$3 instanceof cfw $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cfw $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.s(Math.max(0, $$1.gw() - $$0));
      }

      public cya a() {
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
