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

public class dod extends dog {
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
   private final List<dod.a> i = Lists.newArrayList();
   @Nullable
   private io j;

   public dod(io $$0, drb $$1) {
      super(doi.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.az_()), dod.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (io $$0 : io.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dgy) {
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

   public void a(@Nullable clw $$0, drb $$1, dod.b $$2) {
      List<bru> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bru $$4 : $$3) {
            if ($$4 instanceof cef) {
               cef $$5 = (cef)$$4;
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

   private List<bru> a(drb $$0, dod.b $$1) {
      List<bru> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @azg
   public int f() {
      return this.i.size();
   }

   public static int a(drb $$0) {
      return $$0.c(dds.c);
   }

   @azg
   public boolean j() {
      return dem.a(this.n, this.az_());
   }

   public void a(bru $$0) {
      if (this.i.size() < 3) {
         $$0.ac();
         $$0.bH();
         this.a(dod.c.a($$0));
         if (this.n != null) {
            if ($$0 instanceof cef $$1 && $$1.u() && (!this.k() || this.n.z.h())) {
               this.j = $$1.s();
            }

            io $$2 = this.az_();
            this.n.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avh.bV, avi.e, 1.0F, 1.0F);
            this.n.a(dvu.c, $$2, dvu.a.a($$0, this.n()));
         }

         $$0.ao();
         super.e();
      }
   }

   public void a(dod.c $$0) {
      this.i.add(new dod.a($$0));
   }

   private static boolean a(dax $$0, io $$1, drb $$2, dod.c $$3, @Nullable List<bru> $$4, dod.b $$5, @Nullable io $$6) {
      if (($$0.R() || $$0.ac()) && $$5 != dod.b.c) {
         return false;
      } else {
         it $$7 = $$2.c(dds.b);
         io $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dod.b.c) {
            return false;
         } else {
            bru $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cef $$11) {
                  if ($$6 != null && !$$11.u() && $$0.z.i() < 0.9F) {
                     $$11.i($$6);
                  }

                  if ($$5 == dod.b.a) {
                     $$11.gD();
                     if ($$2.a(avw.aG, $$0x -> $$0x.b(dds.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dds.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, avh.bW, avi.e, 1.0F, 1.0F);
               $$0.a(dvu.c, $$1, dvu.a.a($$10, $$0.a_($$1)));
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

   private static void a(dax $$0, io $$1, drb $$2, List<dod.a> $$3, @Nullable io $$4) {
      boolean $$5 = false;
      Iterator<dod.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dod.a $$7 = $$6.next();
         if ($$7.a()) {
            dod.b $$8 = $$7.c() ? dod.b.a : dod.b.b;
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

   public static void a(dax $$0, io $$1, drb $$2, dod $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, avh.bY, avi.e, 1.0F, 1.0F);
      }

      aga.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dod.c.b.parse(ur.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = us.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (va)dod.c.b.encodeStart(ur.a, this.l()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", us.a(this.j));
      }
   }

   @Override
   protected void a(dog.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dod.c> $$1 = $$0.a(kb.ab, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(jx.a $$0) {
      super.a($$0);
      $$0.a(kb.ab, this.l());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dod.c> l() {
      return this.i.stream().map(dod.a::b).toList();
   }

   static class a {
      private final dod.c a;
      private int b;

      a(dod.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dod.c b() {
         return new dod.c(this.a.d, this.b, this.a.f);
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

   public static record c(cwd d, int e, int f) {
      public static final Codec<dod.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cwd.b.optionalFieldOf("entity_data", cwd.a).forGetter(dod.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dod.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dod.c::c)
               )
               .apply($$0, dod.c::new)
      );
      public static final Codec<List<dod.c>> b = a.listOf();
      public static final yv<ByteBuf, dod.c> c = yv.a(cwd.d, dod.c::a, yt.f, dod.c::b, yt.f, dod.c::c, dod.c::new);

      public static dod.c a(bru $$0) {
         ud $$1 = new ud();
         $$0.e($$1);
         dod.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dod.c(cwd.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dod.c a(int $$0) {
         ud $$1 = new ud();
         $$1.a("id", le.g.b(bsa.h).toString());
         return new dod.c(cwd.a($$1), $$0, 600);
      }

      @Nullable
      public bru a(dax $$0, io $$1) {
         ud $$2 = this.d.c();
         dod.f.forEach($$2::r);
         bru $$3 = bsa.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.ak().a(avz.e)) {
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

         $$1.t(Math.max(0, $$1.gr() - $$0));
      }

      public cwd a() {
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
