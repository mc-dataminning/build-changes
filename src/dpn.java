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

public class dpn extends dpq {
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
   private final List<dpn.a> i = Lists.newArrayList();
   @Nullable
   private ja j;

   public dpn(ja $$0, dsl $$1) {
      super(dps.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.az_()), dpn.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (ja $$0 : ja.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dii) {
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

   public void a(@Nullable cml $$0, dsl $$1, dpn.b $$2) {
      List<bsh> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bsh $$4 : $$3) {
            if ($$4 instanceof cet) {
               cet $$5 = (cet)$$4;
               if ($$0.dp().g($$4.dp()) <= 16.0) {
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

   private List<bsh> a(dsl $$0, dpn.b $$1) {
      List<bsh> $$2 = Lists.newArrayList();
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

   public static int a(dsl $$0) {
      return $$0.c(dfc.c);
   }

   @azl
   public boolean j() {
      return dfw.a(this.n, this.az_());
   }

   public void a(bsh $$0) {
      if (this.i.size() < 3) {
         $$0.ad();
         $$0.bJ();
         this.a(dpn.c.a($$0));
         if (this.n != null) {
            if ($$0 instanceof cet $$1 && $$1.t() && (!this.k() || this.n.z.h())) {
               this.j = $$1.s();
            }

            ja $$2 = this.az_();
            this.n.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avh.bV, avi.e, 1.0F, 1.0F);
            this.n.a(dxh.c, $$2, dxh.a.a($$0, this.n()));
         }

         $$0.aq();
         super.e();
      }
   }

   public void a(dpn.c $$0) {
      this.i.add(new dpn.a($$0));
   }

   private static boolean a(dcg $$0, ja $$1, dsl $$2, dpn.c $$3, @Nullable List<bsh> $$4, dpn.b $$5, @Nullable ja $$6) {
      if (($$0.S() || $$0.ad()) && $$5 != dpn.b.c) {
         return false;
      } else {
         jf $$7 = $$2.c(dfc.b);
         ja $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dpn.b.c) {
            return false;
         } else {
            bsh $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cet $$11) {
                  if ($$6 != null && !$$11.t() && $$0.z.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dpn.b.a) {
                     $$11.gB();
                     if ($$2.a(avw.aG, $$0x -> $$0x.b(dfc.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dfc.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dl();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dm() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dH(), $$10.dJ());
               }

               $$0.a(null, $$1, avh.bW, avi.e, 1.0F, 1.0F);
               $$0.a(dxh.c, $$1, dxh.a.a($$10, $$0.a_($$1)));
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

   private static void a(dcg $$0, ja $$1, dsl $$2, List<dpn.a> $$3, @Nullable ja $$4) {
      boolean $$5 = false;
      Iterator<dpn.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dpn.a $$7 = $$6.next();
         if ($$7.a()) {
            dpn.b $$8 = $$7.c() ? dpn.b.a : dpn.b.b;
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

   public static void a(dcg $$0, ja $$1, dsl $$2, dpn $$3) {
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
         dpn.c.b.parse(ul.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = um.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (uu)dpn.c.b.encodeStart(ul.a, this.l()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", um.a(this.j));
      }
   }

   @Override
   protected void a(dpq.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dpn.c> $$1 = $$0.a(kn.ac, List.of());
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

   private List<dpn.c> l() {
      return this.i.stream().map(dpn.a::b).toList();
   }

   static class a {
      private final dpn.c a;
      private int b;

      a(dpn.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dpn.c b() {
         return new dpn.c(this.a.d, this.b, this.a.f);
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

   public static record c(cwr d, int e, int f) {
      public static final Codec<dpn.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cwr.b.optionalFieldOf("entity_data", cwr.a).forGetter(dpn.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dpn.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dpn.c::c)
               )
               .apply($$0, dpn.c::new)
      );
      public static final Codec<List<dpn.c>> b = a.listOf();
      public static final ys<ByteBuf, dpn.c> c = ys.a(cwr.d, dpn.c::a, yq.g, dpn.c::b, yq.g, dpn.c::c, dpn.c::new);

      public static dpn.c a(bsh $$0) {
         tx $$1 = new tx();
         $$0.e($$1);
         dpn.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dpn.c(cwr.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dpn.c a(int $$0) {
         tx $$1 = new tx();
         $$1.a("id", lq.f.b(bsn.h).toString());
         return new dpn.c(cwr.a($$1), $$0, 600);
      }

      @Nullable
      public bsh a(dcg $$0, ja $$1) {
         tx $$2 = this.d.c();
         dpn.f.forEach($$2::r);
         bsh $$3 = bsn.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.am().a(awa.e)) {
            $$3.g(true);
            if ($$3 instanceof cet $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cet $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.s(Math.max(0, $$1.gp() - $$0));
      }

      public cwr a() {
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
