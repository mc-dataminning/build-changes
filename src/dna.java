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

public class dna extends dnd {
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
   private final List<dna.a> i = Lists.newArrayList();
   @Nullable
   private im j;

   public dna(im $$0, dpy $$1) {
      super(dnf.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.az_()), dna.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (im $$0 : im.c(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dfv) {
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

   public void a(@Nullable ckl $$0, dpy $$1, dna.b $$2) {
      List<bql> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bql $$4 : $$3) {
            if ($$4 instanceof ccu) {
               ccu $$5 = (ccu)$$4;
               if ($$0.dl().g($$4.dl()) <= 16.0) {
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

   private List<bql> a(dpy $$0, dna.b $$1) {
      List<bql> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @ayz
   public int f() {
      return this.i.size();
   }

   public static int a(dpy $$0) {
      return $$0.c(dcp.c);
   }

   @ayz
   public boolean j() {
      return ddj.a(this.o, this.az_());
   }

   public void a(bql $$0) {
      if (this.i.size() < 3) {
         $$0.ac();
         $$0.bF();
         this.a(dna.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof ccu $$1 && $$1.u() && (!this.k() || this.o.z.h())) {
               this.j = $$1.r();
            }

            im $$2 = this.az_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), auz.bV, ava.e, 1.0F, 1.0F);
            this.o.a(dur.c, $$2, dur.a.a($$0, this.n()));
         }

         $$0.am();
         super.e();
      }
   }

   public void a(dna.c $$0) {
      this.i.add(new dna.a($$0));
   }

   private static boolean a(czu $$0, im $$1, dpy $$2, dna.c $$3, @Nullable List<bql> $$4, dna.b $$5, @Nullable im $$6) {
      if (($$0.R() || $$0.ac()) && $$5 != dna.b.c) {
         return false;
      } else {
         ir $$7 = $$2.c(dcp.b);
         im $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dna.b.c) {
            return false;
         } else {
            bql $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof ccu $$11) {
                  if ($$6 != null && !$$11.u() && $$0.z.i() < 0.9F) {
                     $$11.i($$6);
                  }

                  if ($$5 == dna.b.a) {
                     $$11.gD();
                     if ($$2.a(avo.aG, $$0x -> $$0x.b(dcp.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dcp.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dh();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.di() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dD(), $$10.dF());
               }

               $$0.a(null, $$1, auz.bW, ava.e, 1.0F, 1.0F);
               $$0.a(dur.c, $$1, dur.a.a($$10, $$0.a_($$1)));
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

   private static void a(czu $$0, im $$1, dpy $$2, List<dna.a> $$3, @Nullable im $$4) {
      boolean $$5 = false;
      Iterator<dna.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dna.a $$7 = $$6.next();
         if ($$7.a()) {
            dna.b $$8 = $$7.c() ? dna.b.a : dna.b.b;
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

   public static void a(czu $$0, im $$1, dpy $$2, dna $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, auz.bY, ava.e, 1.0F, 1.0F);
      }

      afu.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dna.c.b.parse(um.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = un.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", ac.a(dna.c.b.encodeStart(um.a, this.l()), IllegalStateException::new));
      if (this.k()) {
         $$0.a("flower_pos", un.a(this.j));
      }
   }

   @Override
   public void a(jv $$0) {
      super.a($$0);
      this.i.clear();
      List<dna.c> $$1 = $$0.a(jz.S, List.of());
      $$1.forEach(this::a);
   }

   @Override
   public void a(jv.a $$0) {
      super.a($$0);
      $$0.a(jz.S, this.l());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dna.c> l() {
      return this.i.stream().map(dna.a::b).toList();
   }

   static class a {
      private final dna.c a;
      private int b;

      a(dna.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dna.c b() {
         return new dna.c(this.a.d, this.b, this.a.f);
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

   public static record c(cuq d, int e, int f) {
      public static final Codec<dna.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(cuq.b, "entity_data", cuq.a).forGetter(dna.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dna.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dna.c::c)
               )
               .apply($$0, dna.c::new)
      );
      public static final Codec<List<dna.c>> b = a.listOf();
      public static final yq<ByteBuf, dna.c> c = yq.a(cuq.d, dna.c::a, yo.f, dna.c::b, yo.f, dna.c::c, dna.c::new);

      public static dna.c a(bql $$0) {
         ty $$1 = new ty();
         $$0.e($$1);
         dna.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dna.c(cuq.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dna.c a(int $$0) {
         ty $$1 = new ty();
         $$1.a("id", lc.g.b(bqr.h).toString());
         return new dna.c(cuq.a($$1), $$0, 600);
      }

      @Nullable
      public bql a(czu $$0, im $$1) {
         ty $$2 = this.d.c();
         dna.f.forEach($$2::r);
         bql $$3 = bqr.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.ai().a(avr.e)) {
            $$3.f(true);
            if ($$3 instanceof ccu $$4) {
               $$4.j($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, ccu $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.t(Math.max(0, $$1.gr() - $$0));
      }

      public cuq a() {
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
