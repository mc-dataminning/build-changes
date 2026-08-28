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

public class dvy {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 1200;
   private static final int f = 100;
   public static final int a = 20;
   private static final int g = 8;
   public static final int b = 9;
   private static final int h = 20;
   private static final int i = 96;
   public static final int c = 128;
   private final Predicate<bsv> j;
   private final arc k = (arc)new arc(xp.c("entity.minecraft.ender_dragon"), bql.a.a, bql.b.a).b(true).c(true);
   private final arf l;
   private final iz m;
   private final ObjectArrayList<Integer> n = new ObjectArrayList();
   private final dsi o;
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
   private iz y;
   @Nullable
   private dvx z;
   private int A;
   @Nullable
   private List<cib> B;

   public dvy(arf $$0, long $$1, dvy.a $$2) {
      this($$0, $$1, $$2, iz.c);
   }

   public dvy(arf $$0, long $$1, dvy.a $$2, iz $$3) {
      this.l = $$0;
      this.m = $$3;
      this.j = bta.a.and(bta.a((double)$$3.u(), (double)(128 + $$3.v()), (double)$$3.w(), 192.0));
      this.x = $$2.c;
      this.w = $$2.g.orElse(null);
      this.t = $$2.d;
      this.u = $$2.e;
      if ($$2.f) {
         this.z = dvx.a;
      }

      this.y = $$2.h.orElse(null);
      this.n.addAll($$2.i.orElseGet(() -> {
         ObjectArrayList<Integer> $$1x = new ObjectArrayList(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         ac.c($$1x, azh.a($$1));
         return $$1x;
      }));
      this.o = dsj.a()
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .a('#', dsh.a(dsl.a(dfc.F)))
         .b();
   }

   @Deprecated
   @VisibleForTesting
   public void a() {
      this.v = true;
   }

   public dvy.a b() {
      return new dvy.a(this.x, this.t, this.u, false, Optional.ofNullable(this.w), Optional.ofNullable(this.y), Optional.of(this.n));
   }

   public void c() {
      this.k.d(!this.t);
      if (++this.s >= 20) {
         this.o();
         this.s = 0;
      }

      if (!this.k.g().isEmpty()) {
         this.l.l().a(ark.b, new dbg(0, 0), 9, bac.a);
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
         this.l.l().b(ark.b, new dbg(0, 0), 9, bac.a);
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

      List<? extends cic> $$1 = this.l.i();
      if ($$1.isEmpty()) {
         this.t = true;
      } else {
         cic $$2 = $$1.get(0);
         this.w = $$2.cz();
         d.info("Found that there's a dragon still alive ({})", $$2);
         this.t = false;
         if (!$$0) {
            d.info("But we didn't have a portal, let's remove it.");
            $$2.ao();
            this.w = null;
         }
      }

      if (!this.u && this.t) {
         this.t = false;
      }
   }

   private void k() {
      List<? extends cic> $$0 = this.l.i();
      if ($$0.isEmpty()) {
         d.debug("Haven't seen the dragon, respawning it");
         this.r();
      } else {
         d.debug("Haven't seen our dragon, but found another one to use.");
         this.w = $$0.get(0).cz();
      }
   }

   protected void a(dvx $$0) {
      if (this.z == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.A = 0;
         if ($$0 == dvx.e) {
            this.z = null;
            this.t = false;
            cic $$1 = this.r();
            if ($$1 != null) {
               for (arg $$2 : this.k.g()) {
                  am.o.a($$2, $$1);
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
            duj $$2 = this.l.d($$0, $$1);

            for (dpi $$3 : $$2.G().values()) {
               if ($$3 instanceof dqz) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private dsi.b m() {
      dbg $$0 = new dbg(this.m);

      for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; $$1++) {
         for (int $$2 = -8 + $$0.f; $$2 <= 8 + $$0.f; $$2++) {
            duj $$3 = this.l.d($$1, $$2);

            for (dpi $$4 : $$3.G().values()) {
               if ($$4 instanceof dqz) {
                  dsi.b $$5 = this.o.a(this.l, $$4.ay_());
                  if ($$5 != null) {
                     iz $$6 = $$5.a(3, 3, 3).d();
                     if (this.y == null) {
                        this.y = $$6;
                     }

                     return $$5;
                  }
               }
            }
         }
      }

      iz $$7 = eay.a(this.m);
      int $$8 = this.l.a(dxv.a.e, $$7).v();

      for (int $$9 = $$8; $$9 >= this.l.I_(); $$9--) {
         dsi.b $$10 = this.o.a(this.l, new iz($$7.u(), $$9, $$7.w()));
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
         dbg $$0 = new dbg(this.m);

         for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; $$1++) {
            for (int $$2 = 8 + $$0.f; $$2 <= 8 + $$0.f; $$2++) {
               dtz $$3 = this.l.a($$1, $$2, duy.n, false);
               if (!($$3 instanceof duj)) {
                  return false;
               }

               aqy $$4 = ((duj)$$3).D();
               if (!$$4.a(aqy.c)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private void o() {
      Set<arg> $$0 = Sets.newHashSet();

      for (arg $$1 : this.l.a(this.j)) {
         this.k.a($$1);
         $$0.add($$1);
      }

      Set<arg> $$2 = Sets.newHashSet(this.k.g());
      $$2.removeAll($$0);

      for (arg $$3 : $$2) {
         this.k.b($$3);
      }
   }

   private void p() {
      this.r = 0;
      this.q = 0;

      for (ecj.a $$0 : ecj.a(this.l)) {
         this.q = this.q + this.l.a(cib.class, $$0.f()).size();
      }

      d.debug("Found {} end crystals still alive", this.q);
   }

   public void a(cic $$0) {
      if ($$0.cz().equals(this.w)) {
         this.k.a(0.0F);
         this.k.d(false);
         this.a(true);
         this.q();
         if (!this.u) {
            this.l.b(this.l.a(dxv.a.e, eay.a(this.m)), dfc.fA.o());
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
         this.a(new iz($$1, 75, $$2));
      }
   }

   private void a(iz $$0) {
      this.l.c(3000, $$0, 0);
      this.l.H_().c(lq.aC).flatMap($$0x -> $$0x.b(sh.c)).ifPresent($$1 -> $$1.a().a(this.l, this.l.l().g(), azh.a(), $$0));
   }

   private void a(boolean $$0) {
      eay $$1 = new eay($$0);
      if (this.y == null) {
         this.y = this.l.a(dxv.a.f, eay.a(this.m)).d();

         while (this.l.a_(this.y).a(dfc.F) && this.y.v() > this.l.z_()) {
            this.y = this.y.d();
         }
      }

      if ($$1.a(edd.m, this.l, this.l.l().g(), azh.a(), this.y)) {
         int $$2 = ayz.e(4, 16);
         this.l.l().a.a(new dbg(this.y), $$2);
      }
   }

   @Nullable
   private cic r() {
      this.l.m(new iz(this.m.u(), 128 + this.m.v(), this.m.w()));
      cic $$0 = btb.F.a((dbz)this.l);
      if ($$0 != null) {
         $$0.a(this);
         $$0.d(this.m);
         $$0.gn().a(cis.a);
         $$0.b((double)this.m.u(), (double)(128 + this.m.v()), (double)this.m.w(), this.l.z.i() * 360.0F, 0.0F);
         this.l.b($$0);
         this.w = $$0.cz();
      }

      return $$0;
   }

   public void b(cic $$0) {
      if ($$0.cz().equals(this.w)) {
         this.k.a($$0.eA() / $$0.eR());
         this.p = 0;
         if ($$0.ag()) {
            this.k.a($$0.O_());
         }
      }
   }

   public int e() {
      return this.q;
   }

   public void a(cib $$0, bro $$1) {
      if (this.z != null && this.B.contains($$0)) {
         d.debug("Aborting respawn sequence");
         this.z = null;
         this.A = 0;
         this.h();
         this.a(true);
      } else {
         this.p();
         bsv $$2 = this.l.a(this.w);
         if ($$2 instanceof cic) {
            ((cic)$$2).a($$0, $$0.dp(), $$1);
         }
      }
   }

   public boolean f() {
      return this.u;
   }

   public void g() {
      if (this.t && this.z == null) {
         iz $$0 = this.y;
         if ($$0 == null) {
            d.debug("Tried to respawn, but need to find the portal first.");
            dsi.b $$1 = this.m();
            if ($$1 == null) {
               d.debug("Couldn't find a portal, so we made one.");
               this.a(true);
            } else {
               d.debug("Found the exit portal & saved its location for next time.");
            }

            $$0 = this.y;
         }

         List<cib> $$2 = Lists.newArrayList();
         iz $$3 = $$0.b(1);

         for (je $$4 : je.c.a) {
            List<cib> $$5 = this.l.a(cib.class, new evn($$3.a($$4, 2)));
            if ($$5.isEmpty()) {
               return;
            }

            $$2.addAll($$5);
         }

         d.debug("Found all crystals, respawning dragon.");
         this.a($$2);
      }
   }

   private void a(List<cib> $$0) {
      if (this.t && this.z == null) {
         for (dsi.b $$1 = this.m(); $$1 != null; $$1 = this.m()) {
            for (int $$2 = 0; $$2 < this.o.c(); $$2++) {
               for (int $$3 = 0; $$3 < this.o.b(); $$3++) {
                  for (int $$4 = 0; $$4 < this.o.a(); $$4++) {
                     dsh $$5 = $$1.a($$2, $$3, $$4);
                     if ($$5.a().a(dfc.F) || $$5.a().a(dfc.fx)) {
                        this.l.b($$5.d(), dfc.fz.o());
                     }
                  }
               }
            }
         }

         this.z = dvx.a;
         this.A = 0;
         this.a(false);
         this.B = $$0;
      }
   }

   public void h() {
      for (ecj.a $$0 : ecj.a(this.l)) {
         for (cib $$2 : this.l.a(cib.class, $$0.f())) {
            $$2.n(false);
            $$2.a(null);
         }
      }
   }

   @Nullable
   public UUID i() {
      return this.w;
   }

   public static record a(boolean c, boolean d, boolean e, boolean f, Optional<UUID> g, Optional<iz> h, Optional<List<Integer>> i) {
      public static final Codec<dvy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("NeedsStateScanning").orElse(true).forGetter(dvy.a::a),
                  Codec.BOOL.fieldOf("DragonKilled").orElse(false).forGetter(dvy.a::b),
                  Codec.BOOL.fieldOf("PreviouslyKilled").orElse(false).forGetter(dvy.a::c),
                  Codec.BOOL.lenientOptionalFieldOf("IsRespawning", false).forGetter(dvy.a::d),
                  kc.a.lenientOptionalFieldOf("Dragon").forGetter(dvy.a::e),
                  iz.a.lenientOptionalFieldOf("ExitPortalLocation").forGetter(dvy.a::f),
                  Codec.list(Codec.INT).lenientOptionalFieldOf("Gateways").forGetter(dvy.a::g)
               )
               .apply($$0, dvy.a::new)
      );
      public static final dvy.a b = new dvy.a(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

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

      public Optional<iz> f() {
         return this.h;
      }

      public Optional<List<Integer>> g() {
         return this.i;
      }
   }
}
