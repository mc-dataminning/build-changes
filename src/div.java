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

public class div {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 1200;
   private static final int f = 100;
   public static final int a = 20;
   private static final int g = 8;
   public static final int b = 9;
   private static final int h = 20;
   private static final int i = 96;
   public static final int c = 128;
   private final Predicate<biq> j;
   private final akn k = (akn)new akn(tl.c("entity.minecraft.ender_dragon"), bgo.a.a, bgo.b.a).b(true).c(true);
   private final akq l;
   private final gw m;
   private final ObjectArrayList<Integer> n = new ObjectArrayList();
   private final dfo o;
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
   private gw y;
   @Nullable
   private diu z;
   private int A;
   @Nullable
   private List<bxg> B;

   public div(akq $$0, long $$1, div.a $$2) {
      this($$0, $$1, $$2, gw.b);
   }

   public div(akq $$0, long $$1, div.a $$2, gw $$3) {
      this.l = $$0;
      this.m = $$3;
      this.j = bit.a.and(bit.a((double)$$3.u(), (double)(128 + $$3.v()), (double)$$3.w(), 192.0));
      this.x = $$2.c;
      this.w = $$2.g.orElse(null);
      this.t = $$2.d;
      this.u = $$2.e;
      if ($$2.f) {
         this.z = diu.a;
      }

      this.y = $$2.h.orElse(null);
      this.n.addAll($$2.i.orElseGet(() -> {
         ObjectArrayList<Integer> $$1x = new ObjectArrayList(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         ac.b($$1x, asc.a($$1));
         return $$1x;
      }));
      this.o = dfp.a()
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .a('#', dfn.a(dfr.a(csw.F)))
         .b();
   }

   @Deprecated
   @VisibleForTesting
   public void a() {
      this.v = true;
   }

   public div.a b() {
      return new div.a(this.x, this.t, this.u, false, Optional.ofNullable(this.w), Optional.ofNullable(this.y), Optional.of(this.n));
   }

   public void c() {
      this.k.d(!this.t);
      if (++this.s >= 20) {
         this.o();
         this.s = 0;
      }

      if (!this.k.h().isEmpty()) {
         this.l.k().a(akv.b, new cpc(0, 0), 9, asx.a);
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
         this.l.k().b(akv.b, new cpc(0, 0), 9, asx.a);
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

      List<? extends bxh> $$1 = this.l.h();
      if ($$1.isEmpty()) {
         this.t = true;
      } else {
         bxh $$2 = $$1.get(0);
         this.w = $$2.cv();
         d.info("Found that there's a dragon still alive ({})", $$2);
         this.t = false;
         if (!$$0) {
            d.info("But we didn't have a portal, let's remove it.");
            $$2.ak();
            this.w = null;
         }
      }

      if (!this.u && this.t) {
         this.t = false;
      }
   }

   private void k() {
      List<? extends bxh> $$0 = this.l.h();
      if ($$0.isEmpty()) {
         d.debug("Haven't seen the dragon, respawning it");
         this.r();
      } else {
         d.debug("Haven't seen our dragon, but found another one to use.");
         this.w = $$0.get(0).cv();
      }
   }

   protected void a(diu $$0) {
      if (this.z == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.A = 0;
         if ($$0 == diu.e) {
            this.z = null;
            this.t = false;
            bxh $$1 = this.r();
            if ($$1 != null) {
               for (akr $$2 : this.k.h()) {
                  al.n.a($$2, $$1);
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
            dhq $$2 = this.l.d($$0, $$1);

            for (dcv $$3 : $$2.G().values()) {
               if ($$3 instanceof dek) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private dfo.b m() {
      cpc $$0 = new cpc(this.m);

      for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; $$1++) {
         for (int $$2 = -8 + $$0.f; $$2 <= 8 + $$0.f; $$2++) {
            dhq $$3 = this.l.d($$1, $$2);

            for (dcv $$4 : $$3.G().values()) {
               if ($$4 instanceof dek) {
                  dfo.b $$5 = this.o.a(this.l, $$4.p());
                  if ($$5 != null) {
                     gw $$6 = $$5.a(3, 3, 3).d();
                     if (this.y == null) {
                        this.y = $$6;
                     }

                     return $$5;
                  }
               }
            }
         }
      }

      gw $$7 = dnv.a(this.m);
      int $$8 = this.l.a(dks.a.e, $$7).v();

      for (int $$9 = $$8; $$9 >= this.l.H_(); $$9--) {
         dfo.b $$10 = this.o.a(this.l, new gw($$7.u(), $$9, $$7.w()));
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
         cpc $$0 = new cpc(this.m);

         for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; $$1++) {
            for (int $$2 = 8 + $$0.f; $$2 <= 8 + $$0.f; $$2++) {
               dhf $$3 = this.l.a($$1, $$2, dhk.n, false);
               if (!($$3 instanceof dhq)) {
                  return false;
               }

               akj $$4 = ((dhq)$$3).D();
               if (!$$4.a(akj.c)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private void o() {
      Set<akr> $$0 = Sets.newHashSet();

      for (akr $$1 : this.l.a(this.j)) {
         this.k.a($$1);
         $$0.add($$1);
      }

      Set<akr> $$2 = Sets.newHashSet(this.k.h());
      $$2.removeAll($$0);

      for (akr $$3 : $$2) {
         this.k.b($$3);
      }
   }

   private void p() {
      this.r = 0;
      this.q = 0;

      for (dpg.a $$0 : dpg.a(this.l)) {
         this.q = this.q + this.l.a(bxg.class, $$0.f()).size();
      }

      d.debug("Found {} end crystals still alive", this.q);
   }

   public void a(bxh $$0) {
      if ($$0.cv().equals(this.w)) {
         this.k.a(0.0F);
         this.k.d(false);
         this.a(true);
         this.q();
         if (!this.u) {
            this.l.b(this.l.a(dks.a.e, dnv.a(this.m)), csw.fA.n());
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
         int $$1 = arw.a(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         int $$2 = arw.a(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         this.a(new gw($$1, 75, $$2));
      }
   }

   private void a(gw $$0) {
      this.l.c(3000, $$0, 0);
      this.l.G_().c(jc.as).flatMap($$0x -> $$0x.b(oq.c)).ifPresent($$1 -> $$1.a().a(this.l, this.l.k().g(), asc.a(), $$0));
   }

   private void a(boolean $$0) {
      dnv $$1 = new dnv($$0);
      if (this.y == null) {
         this.y = this.l.a(dks.a.f, dnv.a(this.m)).d();

         while (this.l.a_(this.y).a(csw.F) && this.y.v() > this.l.y_()) {
            this.y = this.y.d();
         }
      }

      if ($$1.a(dqa.m, this.l, this.l.k().g(), asc.a(), this.y)) {
         int $$2 = arw.e(4, 16);
         this.l.k().a.a(new cpc(this.y), $$2);
      }
   }

   @Nullable
   private bxh r() {
      this.l.l(new gw(this.m.u(), 128 + this.m.v(), this.m.w()));
      bxh $$0 = biu.C.a((cpv)this.l);
      if ($$0 != null) {
         $$0.a(this);
         $$0.h(this.m);
         $$0.ga().a(bxx.a);
         $$0.b((double)this.m.u(), (double)(128 + this.m.v()), (double)this.m.w(), this.l.z.i() * 360.0F, 0.0F);
         this.l.b($$0);
         this.w = $$0.cv();
      }

      return $$0;
   }

   public void b(bxh $$0) {
      if ($$0.cv().equals(this.w)) {
         this.k.a($$0.eu() / $$0.eL());
         this.p = 0;
         if ($$0.ac()) {
            this.k.a($$0.N_());
         }
      }
   }

   public int e() {
      return this.q;
   }

   public void a(bxg $$0, bho $$1) {
      if (this.z != null && this.B.contains($$0)) {
         d.debug("Aborting respawn sequence");
         this.z = null;
         this.A = 0;
         this.h();
         this.a(true);
      } else {
         this.p();
         biq $$2 = this.l.a(this.w);
         if ($$2 instanceof bxh) {
            ((bxh)$$2).a($$0, $$0.dl(), $$1);
         }
      }
   }

   public boolean f() {
      return this.u;
   }

   public void g() {
      if (this.t && this.z == null) {
         gw $$0 = this.y;
         if ($$0 == null) {
            d.debug("Tried to respawn, but need to find the portal first.");
            dfo.b $$1 = this.m();
            if ($$1 == null) {
               d.debug("Couldn't find a portal, so we made one.");
               this.a(true);
            } else {
               d.debug("Found the exit portal & saved its location for next time.");
            }

            $$0 = this.y;
         }

         List<bxg> $$2 = Lists.newArrayList();
         gw $$3 = $$0.b(1);

         for (ha $$4 : ha.c.a) {
            List<bxg> $$5 = this.l.a(bxg.class, new ehi($$3.a($$4, 2)));
            if ($$5.isEmpty()) {
               return;
            }

            $$2.addAll($$5);
         }

         d.debug("Found all crystals, respawning dragon.");
         this.a($$2);
      }
   }

   private void a(List<bxg> $$0) {
      if (this.t && this.z == null) {
         for (dfo.b $$1 = this.m(); $$1 != null; $$1 = this.m()) {
            for (int $$2 = 0; $$2 < this.o.c(); $$2++) {
               for (int $$3 = 0; $$3 < this.o.b(); $$3++) {
                  for (int $$4 = 0; $$4 < this.o.a(); $$4++) {
                     dfn $$5 = $$1.a($$2, $$3, $$4);
                     if ($$5.a().a(csw.F) || $$5.a().a(csw.fx)) {
                        this.l.b($$5.d(), csw.fz.n());
                     }
                  }
               }
            }
         }

         this.z = diu.a;
         this.A = 0;
         this.a(false);
         this.B = $$0;
      }
   }

   public void h() {
      for (dpg.a $$0 : dpg.a(this.l)) {
         for (bxg $$2 : this.l.a(bxg.class, $$0.f())) {
            $$2.m(false);
            $$2.a(null);
         }
      }
   }

   @Nullable
   public UUID i() {
      return this.w;
   }

   public static record a(boolean c, boolean d, boolean e, boolean f, Optional<UUID> g, Optional<gw> h, Optional<List<Integer>> i) {
      public static final Codec<div.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("NeedsStateScanning").orElse(true).forGetter(div.a::a),
                  Codec.BOOL.fieldOf("DragonKilled").orElse(false).forGetter(div.a::b),
                  Codec.BOOL.fieldOf("PreviouslyKilled").orElse(false).forGetter(div.a::c),
                  Codec.BOOL.optionalFieldOf("IsRespawning", false).forGetter(div.a::d),
                  hx.a.optionalFieldOf("Dragon").forGetter(div.a::e),
                  gw.a.optionalFieldOf("ExitPortalLocation").forGetter(div.a::f),
                  Codec.list(Codec.INT).optionalFieldOf("Gateways").forGetter(div.a::g)
               )
               .apply($$0, div.a::new)
      );
      public static final div.a b = new div.a(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

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

      public Optional<gw> f() {
         return this.h;
      }

      public Optional<List<Integer>> g() {
         return this.i;
      }
   }
}
