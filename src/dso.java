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

public class dso extends dsr {
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
   private final List<dso.a> i = Lists.newArrayList();
   @Nullable
   private jh j;

   public dso(jh $$0, dvo $$1) {
      super(dst.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aB_()), dso.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (jh $$0 : jh.c(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dli) {
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

   public void a(@Nullable cor $$0, dvo $$1, dso.b $$2) {
      List<bui> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bui $$4 : $$3) {
            if ($$4 instanceof cgw) {
               cgw $$5 = (cgw)$$4;
               if ($$0.dw().g($$4.dw()) <= 16.0) {
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

   private List<bui> a(dvo $$0, dso.b $$1) {
      List<bui> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bau
   public int f() {
      return this.i.size();
   }

   public static int a(dvo $$0) {
      return $$0.c(did.c);
   }

   @bau
   public boolean j() {
      return dix.a(this.o, this.aB_());
   }

   public void a(bui $$0) {
      if (this.i.size() < 3) {
         $$0.af();
         $$0.bR();
         this.a(dso.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof cgw $$1 && $$1.t() && (!this.k() || this.o.A.h())) {
               this.j = $$1.q();
            }

            jh $$2 = this.aB_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awo.bV, awp.e, 1.0F, 1.0F);
            this.o.a(eak.c, $$2, eak.a.a($$0, this.m()));
         }

         $$0.av();
         super.e();
      }
   }

   public void a(dso.c $$0) {
      this.i.add(new dso.a($$0));
   }

   private static boolean a(dff $$0, jh $$1, dvo $$2, dso.c $$3, @Nullable List<bui> $$4, dso.b $$5, @Nullable jh $$6) {
      if (cgw.c($$0) && $$5 != dso.b.c) {
         return false;
      } else {
         jm $$7 = $$2.c(did.b);
         jh $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dso.b.c) {
            return false;
         } else {
            bui $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cgw $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dso.b.a) {
                     $$11.gL();
                     if ($$2.a(axd.aI, $$0x -> $$0x.b(did.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(did.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dt();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.du() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dO(), $$10.dQ());
               }

               $$0.a(null, $$1, awo.bW, awp.e, 1.0F, 1.0F);
               $$0.a(eak.c, $$1, eak.a.a($$10, $$0.a_($$1)));
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

   private static void a(dff $$0, jh $$1, dvo $$2, List<dso.a> $$3, @Nullable jh $$4) {
      boolean $$5 = false;
      Iterator<dso.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dso.a $$7 = $$6.next();
         if ($$7.a()) {
            dso.b $$8 = $$7.c() ? dso.b.a : dso.b.b;
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

   public static void a(dff $$0, jh $$1, dvo $$2, dso $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awo.bY, awp.e, 1.0F, 1.0F);
      }

      agv.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dso.c.b.parse(vb.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = vc.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vk)dso.c.b.encodeStart(vb.a, this.t()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", vc.a(this.j));
      }
   }

   @Override
   protected void a(dsr.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dso.c> $$1 = $$0.a(ku.an, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.an, this.t());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dso.c> t() {
      return this.i.stream().map(dso.a::b).toList();
   }

   static class a {
      private final dso.c a;
      private int b;

      a(dso.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dso.c b() {
         return new dso.c(this.a.d, this.b, this.a.f);
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

   public static record c(cyo d, int e, int f) {
      public static final Codec<dso.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyo.b.optionalFieldOf("entity_data", cyo.a).forGetter(dso.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dso.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dso.c::c)
               )
               .apply($$0, dso.c::new)
      );
      public static final Codec<List<dso.c>> b = a.listOf();
      public static final zj<ByteBuf, dso.c> c = zj.a(cyo.d, dso.c::a, zh.h, dso.c::b, zh.h, dso.c::c, dso.c::new);

      public static dso.c a(bui $$0) {
         un $$1 = new un();
         $$0.e($$1);
         dso.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dso.c(cyo.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dso.c a(int $$0) {
         un $$1 = new un();
         $$1.a("id", lz.f.b(bup.h).toString());
         return new dso.c(cyo.a($$1), $$0, 600);
      }

      @Nullable
      public bui a(dff $$0, jh $$1) {
         un $$2 = this.d.c();
         dso.f.forEach($$2::r);
         bui $$3 = bup.a($$2, $$0, buo.r, $$0x -> $$0x);
         if ($$3 != null && $$3.ar().a(axh.e)) {
            $$3.f(true);
            if ($$3 instanceof cgw $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cgw $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.s(Math.max(0, $$1.gD() - $$0));
      }

      public cyo a() {
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
