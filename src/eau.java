import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eau {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 1200;
   private static final int f = 100;
   public static final int a = 20;
   private static final int g = 8;
   public static final int b = 9;
   private static final int h = 20;
   private static final int i = 96;
   public static final int c = 128;
   private final Predicate<buk> j;
   private final aqz k = (aqz)new aqz(wp.c("entity.minecraft.ender_dragon"), brz.a.a, brz.b.a).b(true).c(true);
   private final ard l;
   private final ji m;
   private final ObjectArrayList<Integer> n = new ObjectArrayList();
   private final dxb o;
   private int p;
   private int q;
   private int r;
   private int s = 21;
   private boolean t;
   private boolean u;
   private boolean v = false;
   @Nullable
   private UUID w;
   private boolean x = true;
   @Nullable
   private ji y;
   @Nullable
   private eat z;
   private int A;
   @Nullable
   private List<cjt> B;

   public eau(ard $$0, long $$1, eau.a $$2) {
      this($$0, $$1, $$2, ji.c);
   }

   public eau(ard $$0, long $$1, eau.a $$2, ji $$3) {
      this.l = $$0;
      this.m = $$3;
      this.j = bup.a.and(bup.a((double)$$3.u(), (double)(128 + $$3.v()), (double)$$3.w(), 192.0));
      this.x = $$2.c;
      this.w = $$2.g.orElse(null);
      this.t = $$2.d;
      this.u = $$2.e;
      if ($$2.f) {
         this.z = eat.a;
      }

      this.y = $$2.h.orElse(null);
      this.n.addAll($$2.i.orElseGet(() -> {
         ObjectArrayList<Integer> $$1x = new ObjectArrayList(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         af.c($$1x, azh.a($$1));
         return $$1x;
      }));
      this.o = dxc.a()
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .a('#', dxa.a(dxe.a(djn.I)))
         .b();
   }

   @Deprecated
   @VisibleForTesting
   public void a() {
      this.v = true;
   }

   public eau.a b() {
      return new eau.a(this.x, this.t, this.u, false, Optional.ofNullable(this.w), Optional.ofNullable(this.y), Optional.of(this.n));
   }

   public void c() {
      this.k.d(!this.t);
      if (++this.s >= 20) {
         this.o();
         this.s = 0;
      }

      if (!this.k.g().isEmpty()) {
         this.l.m().a(arj.b, new dfn(0, 0), 9, baf.a);
         boolean $$0 = this.n();
         if (this.x && $$0) {
            this.j();
            this.x = false;
         }

         if (this.z != null) {
            if (this.B == null && $$0) {
               this.z = null;
               this.g();
            }

            this.z.a(this.l, this, this.B, this.A++, this.y);
         }

         if (!this.t) {
            if ((this.w == null || ++this.p >= 1200) && $$0) {
               this.k();
               this.p = 0;
            }

            if (++this.r >= 100 && $$0) {
               this.p();
               this.r = 0;
            }
         }
      } else {
         this.l.m().b(arj.b, new dfn(0, 0), 9, baf.a);
      }
   }

   private void j() {
      d.info("Scanning for legacy world dragon fight...");
      boolean $$0 = this.l();
      if ($$0) {
         d.info("Found that the dragon has been killed in this world already.");
         this.u = true;
      } else {
         d.info("Found that the dragon has not yet been killed in this world.");
         this.u = false;
         if (this.m() == null) {
            this.a(false);
         }
      }

      List<? extends cju> $$1 = this.l.j();
      if ($$1.isEmpty()) {
         this.t = true;
      } else {
         cju $$2 = $$1.get(0);
         this.w = $$2.cG();
         d.info("Found that there's a dragon still alive ({})", $$2);
         this.t = false;
         if (!$$0) {
            d.info("But we didn't have a portal, let's remove it.");
            $$2.at();
            this.w = null;
         }
      }

      if (!this.u && this.t) {
         this.t = false;
      }
   }

   private void k() {
      List<? extends cju> $$0 = this.l.j();
      if ($$0.isEmpty()) {
         d.debug("Haven't seen the dragon, respawning it");
         this.r();
      } else {
         d.debug("Haven't seen our dragon, but found another one to use.");
         this.w = $$0.get(0).cG();
      }
   }

   protected void a(eat $$0) {
      if (this.z == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.A = 0;
         if ($$0 == eat.e) {
            this.z = null;
            this.t = false;
            cju $$1 = this.r();
            if ($$1 != null) {
               for (are $$2 : this.k.g()) {
                  ap.o.a($$2, $$1);
               }
            }
         } else {
            this.z = $$0;
         }
      }
   }

   private boolean l() {
      for (int $$0 = -8; $$0 <= 8; $$0++) {
         for (int $$1 = -8; $$1 <= 8; $$1++) {
            dzb $$2 = this.l.d($$0, $$1);

            for (dty $$3 : $$2.I().values()) {
               if ($$3 instanceof dvs) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private dxb.b m() {
      dfn $$0 = new dfn(this.m);

      for (int $$1 = -8 + $$0.h; $$1 <= 8 + $$0.h; $$1++) {
         for (int $$2 = -8 + $$0.i; $$2 <= 8 + $$0.i; $$2++) {
            dzb $$3 = this.l.d($$1, $$2);

            for (dty $$4 : $$3.I().values()) {
               if ($$4 instanceof dvs) {
                  dxb.b $$5 = this.o.a(this.l, $$4.aA_());
                  if ($$5 != null) {
                     ji $$6 = $$5.a(3, 3, 3).d();
                     if (this.y == null) {
                        this.y = $$6;
                     }

                     return $$5;
                  }
               }
            }
         }
      }

      ji $$7 = efw.a(this.m);
      int $$8 = this.l.a(ecr.a.e, $$7).v();

      for (int $$9 = $$8; $$9 >= this.l.L_(); $$9--) {
         dxb.b $$10 = this.o.a(this.l, new ji($$7.u(), $$9, $$7.w()));
         if ($$10 != null) {
            if (this.y == null) {
               this.y = $$10.a(3, 3, 3).d();
            }

            return $$10;
         }
      }

      return null;
   }

   private boolean n() {
      if (this.v) {
         return true;
      } else {
         dfn $$0 = new dfn(this.m);

         for (int $$1 = -8 + $$0.h; $$1 <= 8 + $$0.h; $$1++) {
            for (int $$2 = 8 + $$0.i; $$2 <= 8 + $$0.i; $$2++) {
               dyr $$3 = this.l.a($$1, $$2, dzs.n, false);
               if (!($$3 instanceof dzb)) {
                  return false;
               }

               aqs $$4 = ((dzb)$$3).F();
               if (!$$4.a(aqs.c)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private void o() {
      Set<are> $$0 = Sets.newHashSet();

      for (are $$1 : this.l.a(this.j)) {
         this.k.a($$1);
         $$0.add($$1);
      }

      Set<are> $$2 = Sets.newHashSet(this.k.g());
      $$2.removeAll($$0);

      for (are $$3 : $$2) {
         this.k.b($$3);
      }
   }

   private void p() {
      this.r = 0;
      this.q = 0;

      for (ehh.a $$0 : ehh.a(this.l)) {
         this.q = this.q + this.l.a(cjt.class, $$0.f()).size();
      }

      d.debug("Found {} end crystals still alive", this.q);
   }

   public void a(cju $$0) {
      if ($$0.cG().equals(this.w)) {
         this.k.a(0.0F);
         this.k.d(false);
         this.a(true);
         this.q();
         if (!this.u) {
            this.l.b(this.l.a(ecr.a.e, efw.a(this.m)), djn.fV.m());
         }

         this.u = true;
         this.t = true;
      }
   }

   @Deprecated
   @VisibleForTesting
   public void d() {
      this.n.clear();
   }

   private void q() {
      if (!this.n.isEmpty()) {
         int $$0 = (Integer)this.n.remove(this.n.size() - 1);
         int $$1 = ayz.a(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         int $$2 = ayz.a(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         this.a(new ji($$1, 75, $$2));
      }
   }

   private void a(ji $$0) {
      this.l.c(3000, $$0, 0);
      this.l.K_().a(mc.aL).flatMap($$0x -> $$0x.a(re.d)).ifPresent($$1 -> $$1.a().a(this.l, this.l.m().g(), azh.a(), $$0));
   }

   private void a(boolean $$0) {
      efw $$1 = new efw($$0);
      if (this.y == null) {
         this.y = this.l.a(ecr.a.f, efw.a(this.m)).e();

         while (this.l.a_(this.y).a(djn.I) && this.y.v() > 63) {
            this.y = this.y.e();
         }
      }

      if ($$1.a(eib.m, this.l, this.l.m().g(), azh.a(), this.y)) {
         int $$2 = ayz.e(4, 16);
         this.l.m().a.a(new dfn(this.y), $$2);
      }
   }

   @Nullable
   private cju r() {
      this.l.m(new ji(this.m.u(), 128 + this.m.v(), this.m.w()));
      cju $$0 = bur.P.a(this.l, buq.h);
      if ($$0 != null) {
         $$0.a(this);
         $$0.c(this.m);
         $$0.go().a(ckk.a);
         $$0.b((double)this.m.u(), (double)(128 + this.m.v()), (double)this.m.w(), this.l.A.i() * 360.0F, 0.0F);
         this.l.b($$0);
         this.w = $$0.cG();
      }

      return $$0;
   }

   public void b(cju $$0) {
      if ($$0.cG().equals(this.w)) {
         this.k.a($$0.eD() / $$0.eS());
         this.p = 0;
         if ($$0.l_()) {
            this.k.a($$0.p_());
         }
      }
   }

   public int e() {
      return this.q;
   }

   public void a(cjt $$0, bta $$1) {
      if (this.z != null && this.B.contains($$0)) {
         d.debug("Aborting respawn sequence");
         this.z = null;
         this.A = 0;
         this.h();
         this.a(true);
      } else {
         this.p();
         if (this.l.a(this.w) instanceof cju $$3) {
            $$3.a(this.l, $$0, $$0.dv(), $$1);
         }
      }
   }

   public boolean f() {
      return this.u;
   }

   public void g() {
      if (this.t && this.z == null) {
         ji $$0 = this.y;
         if ($$0 == null) {
            d.debug("Tried to respawn, but need to find the portal first.");
            dxb.b $$1 = this.m();
            if ($$1 == null) {
               d.debug("Couldn't find a portal, so we made one.");
               this.a(true);
            } else {
               d.debug("Found the exit portal & saved its location for next time.");
            }

            $$0 = this.y;
         }

         List<cjt> $$2 = Lists.newArrayList();
         ji $$3 = $$0.b(1);

         for (jn $$4 : jn.c.a) {
            List<cjt> $$5 = this.l.a(cjt.class, new fau($$3.a($$4, 2)));
            if ($$5.isEmpty()) {
               return;
            }

            $$2.addAll($$5);
         }

         d.debug("Found all crystals, respawning dragon.");
         this.a($$2);
      }
   }

   private void a(List<cjt> $$0) {
      if (this.t && this.z == null) {
         for (dxb.b $$1 = this.m(); $$1 != null; $$1 = this.m()) {
            for (int $$2 = 0; $$2 < this.o.c(); $$2++) {
               for (int $$3 = 0; $$3 < this.o.b(); $$3++) {
                  for (int $$4 = 0; $$4 < this.o.a(); $$4++) {
                     dxa $$5 = $$1.a($$2, $$3, $$4);
                     if ($$5.a().a(djn.I) || $$5.a().a(djn.fS)) {
                        this.l.b($$5.d(), djn.fU.m());
                     }
                  }
               }
            }
         }

         this.z = eat.a;
         this.A = 0;
         this.a(false);
         this.B = $$0;
      }
   }

   public void h() {
      for (ehh.a $$0 : ehh.a(this.l)) {
         for (cjt $$2 : this.l.a(cjt.class, $$0.f())) {
            $$2.n(false);
            $$2.a(null);
         }
      }
   }

   @Nullable
   public UUID i() {
      return this.w;
   }

   public static record a(boolean c, boolean d, boolean e, boolean f, Optional<UUID> g, Optional<ji> h, Optional<List<Integer>> i) {
      public static final Codec<eau.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("NeedsStateScanning").orElse(true).forGetter(eau.a::a),
                  Codec.BOOL.fieldOf("DragonKilled").orElse(false).forGetter(eau.a::b),
                  Codec.BOOL.fieldOf("PreviouslyKilled").orElse(false).forGetter(eau.a::c),
                  Codec.BOOL.lenientOptionalFieldOf("IsRespawning", false).forGetter(eau.a::d),
                  kl.a.lenientOptionalFieldOf("Dragon").forGetter(eau.a::e),
                  ji.a.lenientOptionalFieldOf("ExitPortalLocation").forGetter(eau.a::f),
                  Codec.list(Codec.INT).lenientOptionalFieldOf("Gateways").forGetter(eau.a::g)
               )
               .apply($$0, eau.a::new)
      );
      public static final eau.a b = new eau.a(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

      public boolean a() {
         return this.c;
      }

      public boolean b() {
         return this.d;
      }

      public boolean c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public Optional<UUID> e() {
         return this.g;
      }

      public Optional<ji> f() {
         return this.h;
      }

      public Optional<List<Integer>> g() {
         return this.i;
      }
   }
}
