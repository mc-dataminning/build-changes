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

public class dpm extends dpp {
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
   private final List<dpm.a> i = Lists.newArrayList();
   @Nullable
   private ja j;

   public dpm(ja $$0, dsk $$1) {
      super(dpr.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.az_()), dpm.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (ja $$0 : ja.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dih) {
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

   public void a(@Nullable cmk $$0, dsk $$1, dpm.b $$2) {
      List<bsg> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bsg $$4 : $$3) {
            if ($$4 instanceof ces) {
               ces $$5 = (ces)$$4;
               if ($$0.do().g($$4.do()) <= 16.0) {
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

   private List<bsg> a(dsk $$0, dpm.b $$1) {
      List<bsg> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @azl
   public int f() {
      return this.i.size();
   }

   public static int a(dsk $$0) {
      return $$0.c(dfb.c);
   }

   @azl
   public boolean j() {
      return dfv.a(this.n, this.az_());
   }

   public void a(bsg $$0) {
      if (this.i.size() < 3) {
         $$0.ac();
         $$0.bI();
         this.a(dpm.c.a($$0));
         if (this.n != null) {
            if ($$0 instanceof ces $$1 && $$1.u() && (!this.k() || this.n.z.h())) {
               this.j = $$1.s();
            }

            ja $$2 = this.az_();
            this.n.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avh.bV, avi.e, 1.0F, 1.0F);
            this.n.a(dxg.c, $$2, dxg.a.a($$0, this.n()));
         }

         $$0.ap();
         super.e();
      }
   }

   public void a(dpm.c $$0) {
      this.i.add(new dpm.a($$0));
   }

   private static boolean a(dcf $$0, ja $$1, dsk $$2, dpm.c $$3, @Nullable List<bsg> $$4, dpm.b $$5, @Nullable ja $$6) {
      if (($$0.S() || $$0.ad()) && $$5 != dpm.b.c) {
         return false;
      } else {
         jf $$7 = $$2.c(dfb.b);
         ja $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dpm.b.c) {
            return false;
         } else {
            bsg $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof ces $$11) {
                  if ($$6 != null && !$$11.u() && $$0.z.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dpm.b.a) {
                     $$11.gC();
                     if ($$2.a(avw.aG, $$0x -> $$0x.b(dfb.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dfb.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dk();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dl() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dG(), $$10.dI());
               }

               $$0.a(null, $$1, avh.bW, avi.e, 1.0F, 1.0F);
               $$0.a(dxg.c, $$1, dxg.a.a($$10, $$0.a_($$1)));
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

   private static void a(dcf $$0, ja $$1, dsk $$2, List<dpm.a> $$3, @Nullable ja $$4) {
      boolean $$5 = false;
      Iterator<dpm.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dpm.a $$7 = $$6.next();
         if ($$7.a()) {
            dpm.b $$8 = $$7.c() ? dpm.b.a : dpm.b.b;
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

   public static void a(dcf $$0, ja $$1, dsk $$2, dpm $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, avh.bY, avi.e, 1.0F, 1.0F);
      }

      afy.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dpm.c.b.parse(ul.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = um.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (uu)dpm.c.b.encodeStart(ul.a, this.l()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", um.a(this.j));
      }
   }

   @Override
   protected void a(dpp.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dpm.c> $$1 = $$0.a(kn.ac, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      $$0.a(kn.ac, this.l());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dpm.c> l() {
      return this.i.stream().map(dpm.a::b).toList();
   }

   static class a {
      private final dpm.c a;
      private int b;

      a(dpm.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dpm.c b() {
         return new dpm.c(this.a.d, this.b, this.a.f);
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

   public static record c(cwq d, int e, int f) {
      public static final Codec<dpm.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cwq.b.optionalFieldOf("entity_data", cwq.a).forGetter(dpm.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dpm.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dpm.c::c)
               )
               .apply($$0, dpm.c::new)
      );
      public static final Codec<List<dpm.c>> b = a.listOf();
      public static final ys<ByteBuf, dpm.c> c = ys.a(cwq.d, dpm.c::a, yq.g, dpm.c::b, yq.g, dpm.c::c, dpm.c::new);

      public static dpm.c a(bsg $$0) {
         tx $$1 = new tx();
         $$0.e($$1);
         dpm.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dpm.c(cwq.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dpm.c a(int $$0) {
         tx $$1 = new tx();
         $$1.a("id", lq.f.b(bsm.h).toString());
         return new dpm.c(cwq.a($$1), $$0, 600);
      }

      @Nullable
      public bsg a(dcf $$0, ja $$1) {
         tx $$2 = this.d.c();
         dpm.f.forEach($$2::r);
         bsg $$3 = bsm.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.al().a(awa.e)) {
            $$3.f(true);
            if ($$3 instanceof ces $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, ces $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.s(Math.max(0, $$1.gq() - $$0));
      }

      public cwq a() {
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
