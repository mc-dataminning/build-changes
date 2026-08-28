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

public class dpc extends dpf {
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
   private final List<dpc.a> i = Lists.newArrayList();
   @Nullable
   private iz j;

   public dpc(iz $$0, dsa $$1) {
      super(dph.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.az_()), dpc.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (iz $$0 : iz.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dhx) {
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

   public void a(@Nullable cmv $$0, dsa $$1, dpc.b $$2) {
      List<bss> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bss $$4 : $$3) {
            if ($$4 instanceof cfe) {
               cfe $$5 = (cfe)$$4;
               if ($$0.dn().g($$4.dn()) <= 16.0) {
                  if (!this.j()) {
                     $$5.h($$0);
                  } else {
                     $$5.u(400);
                  }
               }
            }
         }
      }
   }

   private List<bss> a(dsa $$0, dpc.b $$1) {
      List<bss> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bab
   public int f() {
      return this.i.size();
   }

   public static int a(dsa $$0) {
      return $$0.c(der.c);
   }

   @bab
   public boolean j() {
      return dfl.a(this.n, this.az_());
   }

   public void a(bss $$0) {
      if (this.i.size() < 3) {
         $$0.ac();
         $$0.bH();
         this.a(dpc.c.a($$0));
         if (this.n != null) {
            if ($$0 instanceof cfe $$1 && $$1.u() && (!this.k() || this.n.z.h())) {
               this.j = $$1.s();
            }

            iz $$2 = this.az_();
            this.n.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avz.bV, awa.e, 1.0F, 1.0F);
            this.n.a(dwt.c, $$2, dwt.a.a($$0, this.n()));
         }

         $$0.ao();
         super.e();
      }
   }

   public void a(dpc.c $$0) {
      this.i.add(new dpc.a($$0));
   }

   private static boolean a(dbw $$0, iz $$1, dsa $$2, dpc.c $$3, @Nullable List<bss> $$4, dpc.b $$5, @Nullable iz $$6) {
      if (($$0.S() || $$0.ad()) && $$5 != dpc.b.c) {
         return false;
      } else {
         je $$7 = $$2.c(der.b);
         iz $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dpc.b.c) {
            return false;
         } else {
            bss $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cfe $$11) {
                  if ($$6 != null && !$$11.u() && $$0.z.i() < 0.9F) {
                     $$11.i($$6);
                  }

                  if ($$5 == dpc.b.a) {
                     $$11.gE();
                     if ($$2.a(awo.aG, $$0x -> $$0x.b(der.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(der.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dj();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dk() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dF(), $$10.dH());
               }

               $$0.a(null, $$1, avz.bW, awa.e, 1.0F, 1.0F);
               $$0.a(dwt.c, $$1, dwt.a.a($$10, $$0.a_($$1)));
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

   private static void a(dbw $$0, iz $$1, dsa $$2, List<dpc.a> $$3, @Nullable iz $$4) {
      boolean $$5 = false;
      Iterator<dpc.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dpc.a $$7 = $$6.next();
         if ($$7.a()) {
            dpc.b $$8 = $$7.c() ? dpc.b.a : dpc.b.b;
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

   public static void a(dbw $$0, iz $$1, dsa $$2, dpc $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, avz.bY, awa.e, 1.0F, 1.0F);
      }

      ags.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dpc.c.b.parse(vf.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = vg.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vo)dpc.c.b.encodeStart(vf.a, this.l()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", vg.a(this.j));
      }
   }

   @Override
   protected void a(dpf.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dpc.c> $$1 = $$0.a(km.ab, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.ab, this.l());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dpc.c> l() {
      return this.i.stream().map(dpc.a::b).toList();
   }

   static class a {
      private final dpc.c a;
      private int b;

      a(dpc.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dpc.c b() {
         return new dpc.c(this.a.d, this.b, this.a.f);
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

   public static record c(cxc d, int e, int f) {
      public static final Codec<dpc.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cxc.b.optionalFieldOf("entity_data", cxc.a).forGetter(dpc.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dpc.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dpc.c::c)
               )
               .apply($$0, dpc.c::new)
      );
      public static final Codec<List<dpc.c>> b = a.listOf();
      public static final zm<ByteBuf, dpc.c> c = zm.a(cxc.d, dpc.c::a, zk.g, dpc.c::b, zk.g, dpc.c::c, dpc.c::new);

      public static dpc.c a(bss $$0) {
         ur $$1 = new ur();
         $$0.e($$1);
         dpc.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dpc.c(cxc.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dpc.c a(int $$0) {
         ur $$1 = new ur();
         $$1.a("id", lp.g.b(bsy.h).toString());
         return new dpc.c(cxc.a($$1), $$0, 600);
      }

      @Nullable
      public bss a(dbw $$0, iz $$1) {
         ur $$2 = this.d.c();
         dpc.f.forEach($$2::r);
         bss $$3 = bsy.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.ak().a(aws.e)) {
            $$3.f(true);
            if ($$3 instanceof cfe $$4) {
               $$4.j($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cfe $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.t(Math.max(0, $$1.gs() - $$0));
      }

      public cxc a() {
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
