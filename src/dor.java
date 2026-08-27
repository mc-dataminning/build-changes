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

public class dor {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 1200;
   private static final int f = 100;
   public static final int a = 20;
   private static final int g = 8;
   public static final int b = 9;
   private static final int h = 20;
   private static final int i = 96;
   public static final int c = 128;
   private final Predicate<bno> j;
   private final aos k = (aos)new aos(vq.c("entity.minecraft.ender_dragon"), blk.a.a, blk.b.a).b(true).c(true);
   private final aov l;
   private final hz m;
   private final ObjectArrayList<Integer> n = new ObjectArrayList();
   private final dlk o;
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
   private hz y;
   @Nullable
   private doq z;
   private int A;
   @Nullable
   private List<ccl> B;

   public dor(aov $$0, long $$1, dor.a $$2) {
      this($$0, $$1, $$2, hz.c);
   }

   public dor(aov $$0, long $$1, dor.a $$2, hz $$3) {
      this.l = $$0;
      this.m = $$3;
      this.j = bnt.a.and(bnt.a((double)$$3.u(), (double)(128 + $$3.v()), (double)$$3.w(), 192.0));
      this.x = $$2.c;
      this.w = $$2.g.orElse(null);
      this.t = $$2.d;
      this.u = $$2.e;
      if ($$2.f) {
         this.z = doq.a;
      }

      this.y = $$2.h.orElse(null);
      this.n.addAll($$2.i.orElseGet(() -> {
         ObjectArrayList<Integer> $$1x = new ObjectArrayList(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         ac.c($$1x, awo.a($$1));
         return $$1x;
      }));
      this.o = dll.a()
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .a('#', dlj.a(dln.a(cyq.F)))
         .b();
   }

   @Deprecated
   @VisibleForTesting
   public void a() {
      this.v = true;
   }

   public dor.a b() {
      return new dor.a(this.x, this.t, this.u, false, Optional.ofNullable(this.w), Optional.ofNullable(this.y), Optional.of(this.n));
   }

   public void c() {
      this.k.d(!this.t);
      if (++this.s >= 20) {
         this.o();
         this.s = 0;
      }

      if (!this.k.h().isEmpty()) {
         this.l.l().a(apa.b, new cuu(0, 0), 9, axk.a);
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
         this.l.l().b(apa.b, new cuu(0, 0), 9, axk.a);
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

      List<? extends ccm> $$1 = this.l.i();
      if ($$1.isEmpty()) {
         this.t = true;
      } else {
         ccm $$2 = $$1.get(0);
         this.w = $$2.cw();
         d.info("Found that there's a dragon still alive ({})", $$2);
         this.t = false;
         if (!$$0) {
            d.info("But we didn't have a portal, let's remove it.");
            $$2.am();
            this.w = null;
         }
      }

      if (!this.u && this.t) {
         this.t = false;
      }
   }

   private void k() {
      List<? extends ccm> $$0 = this.l.i();
      if ($$0.isEmpty()) {
         d.debug("Haven't seen the dragon, respawning it");
         this.r();
      } else {
         d.debug("Haven't seen our dragon, but found another one to use.");
         this.w = $$0.get(0).cw();
      }
   }

   protected void a(doq $$0) {
      if (this.z == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.A = 0;
         if ($$0 == doq.e) {
            this.z = null;
            this.t = false;
            ccm $$1 = this.r();
            if ($$1 != null) {
               for (aow $$2 : this.k.h()) {
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
            dnm $$2 = this.l.d($$0, $$1);

            for (dit $$3 : $$2.G().values()) {
               if ($$3 instanceof dkj) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private dlk.b m() {
      cuu $$0 = new cuu(this.m);

      for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; $$1++) {
         for (int $$2 = -8 + $$0.f; $$2 <= 8 + $$0.f; $$2++) {
            dnm $$3 = this.l.d($$1, $$2);

            for (dit $$4 : $$3.G().values()) {
               if ($$4 instanceof dkj) {
                  dlk.b $$5 = this.o.a(this.l, $$4.aE_());
                  if ($$5 != null) {
                     hz $$6 = $$5.a(3, 3, 3).d();
                     if (this.y == null) {
                        this.y = $$6;
                     }

                     return $$5;
                  }
               }
            }
         }
      }

      hz $$7 = dtr.a(this.m);
      int $$8 = this.l.a(dqo.a.e, $$7).v();

      for (int $$9 = $$8; $$9 >= this.l.J_(); $$9--) {
         dlk.b $$10 = this.o.a(this.l, new hz($$7.u(), $$9, $$7.w()));
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
         cuu $$0 = new cuu(this.m);

         for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; $$1++) {
            for (int $$2 = 8 + $$0.f; $$2 <= 8 + $$0.f; $$2++) {
               dnb $$3 = this.l.a($$1, $$2, dng.n, false);
               if (!($$3 instanceof dnm)) {
                  return false;
               }

               aoo $$4 = ((dnm)$$3).D();
               if (!$$4.a(aoo.c)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private void o() {
      Set<aow> $$0 = Sets.newHashSet();

      for (aow $$1 : this.l.a(this.j)) {
         this.k.a($$1);
         $$0.add($$1);
      }

      Set<aow> $$2 = Sets.newHashSet(this.k.h());
      $$2.removeAll($$0);

      for (aow $$3 : $$2) {
         this.k.b($$3);
      }
   }

   private void p() {
      this.r = 0;
      this.q = 0;

      for (dvc.a $$0 : dvc.a(this.l)) {
         this.q = this.q + this.l.a(ccl.class, $$0.f()).size();
      }

      d.debug("Found {} end crystals still alive", this.q);
   }

   public void a(ccm $$0) {
      if ($$0.cw().equals(this.w)) {
         this.k.a(0.0F);
         this.k.d(false);
         this.a(true);
         this.q();
         if (!this.u) {
            this.l.b(this.l.a(dqo.a.e, dtr.a(this.m)), cyq.fA.o());
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
         int $$1 = awh.a(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         int $$2 = awh.a(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         this.a(new hz($$1, 75, $$2));
      }
   }

   private void a(hz $$0) {
      this.l.c(3000, $$0, 0);
      this.l.I_().c(kg.aw).flatMap($$0x -> $$0x.b(ql.c)).ifPresent($$1 -> $$1.a().a(this.l, this.l.l().g(), awo.a(), $$0));
   }

   private void a(boolean $$0) {
      dtr $$1 = new dtr($$0);
      if (this.y == null) {
         this.y = this.l.a(dqo.a.f, dtr.a(this.m)).d();

         while (this.l.a_(this.y).a(cyq.F) && this.y.v() > this.l.A_()) {
            this.y = this.y.d();
         }
      }

      if ($$1.a(dvw.m, this.l, this.l.l().g(), awo.a(), this.y)) {
         int $$2 = awh.e(4, 16);
         this.l.l().a.a(new cuu(this.y), $$2);
      }
   }

   @Nullable
   private ccm r() {
      this.l.m(new hz(this.m.u(), 128 + this.m.v(), this.m.w()));
      ccm $$0 = bnu.E.a((cvn)this.l);
      if ($$0 != null) {
         $$0.a(this);
         $$0.h(this.m);
         $$0.gd().a(cdc.a);
         $$0.b((double)this.m.u(), (double)(128 + this.m.v()), (double)this.m.w(), this.l.z.i() * 360.0F, 0.0F);
         this.l.b($$0);
         this.w = $$0.cw();
      }

      return $$0;
   }

   public void b(ccm $$0) {
      if ($$0.cw().equals(this.w)) {
         this.k.a($$0.ew() / $$0.eN());
         this.p = 0;
         if ($$0.ae()) {
            this.k.a($$0.Q_());
         }
      }
   }

   public int e() {
      return this.q;
   }

   public void a(ccl $$0, bmn $$1) {
      if (this.z != null && this.B.contains($$0)) {
         d.debug("Aborting respawn sequence");
         this.z = null;
         this.A = 0;
         this.h();
         this.a(true);
      } else {
         this.p();
         bno $$2 = this.l.a(this.w);
         if ($$2 instanceof ccm) {
            ((ccm)$$2).a($$0, $$0.dm(), $$1);
         }
      }
   }

   public boolean f() {
      return this.u;
   }

   public void g() {
      if (this.t && this.z == null) {
         hz $$0 = this.y;
         if ($$0 == null) {
            d.debug("Tried to respawn, but need to find the portal first.");
            dlk.b $$1 = this.m();
            if ($$1 == null) {
               d.debug("Couldn't find a portal, so we made one.");
               this.a(true);
            } else {
               d.debug("Found the exit portal & saved its location for next time.");
            }

            $$0 = this.y;
         }

         List<ccl> $$2 = Lists.newArrayList();
         hz $$3 = $$0.b(1);

         for (ie $$4 : ie.c.a) {
            List<ccl> $$5 = this.l.a(ccl.class, new enn($$3.a($$4, 2)));
            if ($$5.isEmpty()) {
               return;
            }

            $$2.addAll($$5);
         }

         d.debug("Found all crystals, respawning dragon.");
         this.a($$2);
      }
   }

   private void a(List<ccl> $$0) {
      if (this.t && this.z == null) {
         for (dlk.b $$1 = this.m(); $$1 != null; $$1 = this.m()) {
            for (int $$2 = 0; $$2 < this.o.c(); $$2++) {
               for (int $$3 = 0; $$3 < this.o.b(); $$3++) {
                  for (int $$4 = 0; $$4 < this.o.a(); $$4++) {
                     dlj $$5 = $$1.a($$2, $$3, $$4);
                     if ($$5.a().a(cyq.F) || $$5.a().a(cyq.fx)) {
                        this.l.b($$5.d(), cyq.fz.o());
                     }
                  }
               }
            }
         }

         this.z = doq.a;
         this.A = 0;
         this.a(false);
         this.B = $$0;
      }
   }

   public void h() {
      for (dvc.a $$0 : dvc.a(this.l)) {
         for (ccl $$2 : this.l.a(ccl.class, $$0.f())) {
            $$2.m(false);
            $$2.a(null);
         }
      }
   }

   @Nullable
   public UUID i() {
      return this.w;
   }

   public static record a(boolean c, boolean d, boolean e, boolean f, Optional<UUID> g, Optional<hz> h, Optional<List<Integer>> i) {
      public static final Codec<dor.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("NeedsStateScanning").orElse(true).forGetter(dor.a::a),
                  Codec.BOOL.fieldOf("DragonKilled").orElse(false).forGetter(dor.a::b),
                  Codec.BOOL.fieldOf("PreviouslyKilled").orElse(false).forGetter(dor.a::c),
                  Codec.BOOL.optionalFieldOf("IsRespawning", false).forGetter(dor.a::d),
                  jc.a.optionalFieldOf("Dragon").forGetter(dor.a::e),
                  hz.a.optionalFieldOf("ExitPortalLocation").forGetter(dor.a::f),
                  Codec.list(Codec.INT).optionalFieldOf("Gateways").forGetter(dor.a::g)
               )
               .apply($$0, dor.a::new)
      );
      public static final dor.a b = new dor.a(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

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

      public Optional<hz> f() {
         return this.h;
      }

      public Optional<List<Integer>> g() {
         return this.i;
      }
   }
}
