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

public class dpy extends dqc {
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
   private final List<dpy.a> i = Lists.newArrayList();
   @Nullable
   private ir j;

   public dpy(ir $$0, dtc $$1) {
      super(dqe.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.az_()), dpy.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (ir $$0 : ir.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dif) {
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

   public void a(@Nullable cly $$0, dtc $$1, dpy.b $$2) {
      List<brv> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (brv $$4 : $$3) {
            if ($$4 instanceof cef) {
               cef $$5 = (cef)$$4;
               if ($$0.ds().g($$4.ds()) <= 16.0) {
                  if (!this.j()) {
                     $$5.h($$0);
                  } else {
                     $$5.v(400);
                  }
               }
            }
         }
      }
   }

   private List<brv> a(dtc $$0, dpy.b $$1) {
      List<brv> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @azp
   public int f() {
      return this.i.size();
   }

   public static int a(dtc $$0) {
      return $$0.c(dev.c);
   }

   @azp
   public boolean j() {
      return dfq.a(this.n, this.az_());
   }

   public void a(brv $$0) {
      if (this.i.size() < 3) {
         $$0.ae();
         $$0.bM();
         this.a(dpy.c.a($$0));
         if (this.n != null) {
            if ($$0 instanceof cef $$1 && $$1.t() && (!this.k() || this.n.A.h())) {
               this.j = $$1.r();
            }

            ir $$2 = this.az_();
            this.n.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avo.ca, avq.e, 1.0F, 1.0F);
            this.n.a(dxv.c, $$2, dxv.a.a($$0, this.n()));
         }

         $$0.ao();
         super.e();
      }
   }

   public void a(dpy.c $$0) {
      this.i.add(new dpy.a($$0));
   }

   private static boolean a(dca $$0, ir $$1, dtc $$2, dpy.c $$3, @Nullable List<brv> $$4, dpy.b $$5, @Nullable ir $$6) {
      if (($$0.S() || $$0.ad()) && $$5 != dpy.b.c) {
         return false;
      } else {
         iw $$7 = $$2.c(dev.b);
         ir $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dpy.b.c) {
            return false;
         } else {
            brv $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cef $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.e($$6);
                  }

                  if ($$5 == dpy.b.a) {
                     $$11.gM();
                     if ($$2.a(awe.aH, $$0x -> $$0x.b(dev.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dev.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.do();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dp() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dK(), $$10.dM());
               }

               $$0.a(null, $$1, avo.cb, avq.e, 1.0F, 1.0F);
               $$0.a(dxv.c, $$1, dxv.a.a($$10, $$0.a_($$1)));
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

   private static void a(dca $$0, ir $$1, dtc $$2, List<dpy.a> $$3, @Nullable ir $$4) {
      boolean $$5 = false;
      Iterator<dpy.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dpy.a $$7 = $$6.next();
         if ($$7.a()) {
            dpy.b $$8 = $$7.c() ? dpy.b.a : dpy.b.b;
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

   public static void a(dca $$0, ir $$1, dtc $$2, dpy $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.F_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, avo.cd, avq.e, 1.0F, 1.0F);
      }

      agi.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dpy.c.b.parse(uy.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = uz.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", ad.a(dpy.c.b.encodeStart(uy.a, this.l()), IllegalStateException::new));
      if (this.k()) {
         $$0.a("flower_pos", uz.a(this.j));
      }
   }

   @Override
   public void a(ka $$0) {
      super.a($$0);
      this.i.clear();
      List<dpy.c> $$1 = $$0.a(ke.ab, List.of());
      $$1.forEach(this::a);
   }

   @Override
   public void a(ka.a $$0) {
      super.a($$0);
      $$0.a(ke.ab, this.l());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dpy.c> l() {
      return this.i.stream().map(dpy.a::b).toList();
   }

   static class a {
      private final dpy.c a;
      private int b;

      a(dpy.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dpy.c b() {
         return new dpy.c(this.a.d, this.b, this.a.f);
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

   public static record c(cxf d, int e, int f) {
      public static final Codec<dpy.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(cxf.b, "entity_data", cxf.a).forGetter(dpy.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dpy.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dpy.c::c)
               )
               .apply($$0, dpy.c::new)
      );
      public static final Codec<List<dpy.c>> b = a.listOf();
      public static final zc<ByteBuf, dpy.c> c = zc.a(cxf.d, dpy.c::a, za.g, dpy.c::b, za.g, dpy.c::c, dpy.c::new);

      public static dpy.c a(brv $$0) {
         uk $$1 = new uk();
         $$0.e($$1);
         dpy.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dpy.c(cxf.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dpy.c a(int $$0) {
         uk $$1 = new uk();
         $$1.a("id", lh.g.b(bsb.j).toString());
         return new dpy.c(cxf.a($$1), $$0, 600);
      }

      @Nullable
      public brv a(dca $$0, ir $$1) {
         uk $$2 = this.d.c();
         dpy.f.forEach($$2::r);
         brv $$3 = bsb.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.ak().a(awh.e)) {
            $$3.f(true);
            if ($$3 instanceof cef $$4) {
               $$4.j($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cef $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.u(Math.max(0, $$1.gA() - $$0));
      }

      public cxf a() {
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
