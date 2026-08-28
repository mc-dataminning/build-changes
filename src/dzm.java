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

public class dzm {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 1200;
   private static final int f = 100;
   public static final int a = 20;
   private static final int g = 8;
   public static final int b = 9;
   private static final int h = 20;
   private static final int i = 96;
   public static final int c = 128;
   private final Predicate<bui> j;
   private final arn k = (arn)new arn(xl.c("entity.minecraft.ender_dragon"), brx.a.a, brx.b.a).b(true).c(true);
   private final arq l;
   private final jh m;
   private final ObjectArrayList<Integer> n = new ObjectArrayList();
   private final dvt o;
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
   private jh y;
   @Nullable
   private dzl z;
   private int A;
   @Nullable
   private List<cjr> B;

   public dzm(arq $$0, long $$1, dzm.a $$2) {
      this($$0, $$1, $$2, jh.c);
   }

   public dzm(arq $$0, long $$1, dzm.a $$2, jh $$3) {
      this.l = $$0;
      this.m = $$3;
      this.j = bun.a.and(bun.a((double)$$3.u(), (double)(128 + $$3.v()), (double)$$3.w(), 192.0));
      this.x = $$2.c;
      this.w = $$2.g.orElse(null);
      this.t = $$2.d;
      this.u = $$2.e;
      if ($$2.f) {
         this.z = dzl.a;
      }

      this.y = $$2.h.orElse(null);
      this.n.addAll($$2.i.orElseGet(() -> {
         ObjectArrayList<Integer> $$1x = new ObjectArrayList(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         ae.c($$1x, azv.a($$1));
         return $$1x;
      }));
      this.o = dvu.a()
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .a('#', dvs.a(dvw.a(dil.F)))
         .b();
   }

   @Deprecated
   @VisibleForTesting
   public void a() {
      this.v = true;
   }

   public dzm.a b() {
      return new dzm.a(this.x, this.t, this.u, false, Optional.ofNullable(this.w), Optional.ofNullable(this.y), Optional.of(this.n));
   }

   public void c() {
      this.k.d(!this.t);
      if (++this.s >= 20) {
         this.o();
         this.s = 0;
      }

      if (!this.k.g().isEmpty()) {
         this.l.l().a(arw.b, new del(0, 0), 9, bat.a);
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
         this.l.l().b(arw.b, new del(0, 0), 9, bat.a);
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

      List<? extends cjs> $$1 = this.l.i();
      if ($$1.isEmpty()) {
         this.t = true;
      } else {
         cjs $$2 = $$1.get(0);
         this.w = $$2.cI();
         d.info("Found that there's a dragon still alive ({})", $$2);
         this.t = false;
         if (!$$0) {
            d.info("But we didn't have a portal, let's remove it.");
            $$2.av();
            this.w = null;
         }
      }

      if (!this.u && this.t) {
         this.t = false;
      }
   }

   private void k() {
      List<? extends cjs> $$0 = this.l.i();
      if ($$0.isEmpty()) {
         d.debug("Haven't seen the dragon, respawning it");
         this.r();
      } else {
         d.debug("Haven't seen our dragon, but found another one to use.");
         this.w = $$0.get(0).cI();
      }
   }

   protected void a(dzl $$0) {
      if (this.z == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.A = 0;
         if ($$0 == dzl.e) {
            this.z = null;
            this.t = false;
            cjs $$1 = this.r();
            if ($$1 != null) {
               for (arr $$2 : this.k.g()) {
                  ao.o.a($$2, $$1);
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
            dxt $$2 = this.l.d($$0, $$1);

            for (dsr $$3 : $$2.F().values()) {
               if ($$3 instanceof duk) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private dvt.b m() {
      del $$0 = new del(this.m);

      for (int $$1 = -8 + $$0.g; $$1 <= 8 + $$0.g; $$1++) {
         for (int $$2 = -8 + $$0.h; $$2 <= 8 + $$0.h; $$2++) {
            dxt $$3 = this.l.d($$1, $$2);

            for (dsr $$4 : $$3.F().values()) {
               if ($$4 instanceof duk) {
                  dvt.b $$5 = this.o.a(this.l, $$4.aB_());
                  if ($$5 != null) {
                     jh $$6 = $$5.a(3, 3, 3).d();
                     if (this.y == null) {
                        this.y = $$6;
                     }

                     return $$5;
                  }
               }
            }
         }
      }

      jh $$7 = eeo.a(this.m);
      int $$8 = this.l.a(ebj.a.e, $$7).v();

      for (int $$9 = $$8; $$9 >= this.l.I_(); $$9--) {
         dvt.b $$10 = this.o.a(this.l, new jh($$7.u(), $$9, $$7.w()));
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
         del $$0 = new del(this.m);

         for (int $$1 = -8 + $$0.g; $$1 <= 8 + $$0.g; $$1++) {
            for (int $$2 = 8 + $$0.h; $$2 <= 8 + $$0.h; $$2++) {
               dxj $$3 = this.l.a($$1, $$2, dyk.n, false);
               if (!($$3 instanceof dxt)) {
                  return false;
               }

               arg $$4 = ((dxt)$$3).C();
               if (!$$4.a(arg.c)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private void o() {
      Set<arr> $$0 = Sets.newHashSet();

      for (arr $$1 : this.l.a(this.j)) {
         this.k.a($$1);
         $$0.add($$1);
      }

      Set<arr> $$2 = Sets.newHashSet(this.k.g());
      $$2.removeAll($$0);

      for (arr $$3 : $$2) {
         this.k.b($$3);
      }
   }

   private void p() {
      this.r = 0;
      this.q = 0;

      for (efz.a $$0 : efz.a(this.l)) {
         this.q = this.q + this.l.a(cjr.class, $$0.f()).size();
      }

      d.debug("Found {} end crystals still alive", this.q);
   }

   public void a(cjs $$0) {
      if ($$0.cI().equals(this.w)) {
         this.k.a(0.0F);
         this.k.d(false);
         this.a(true);
         this.q();
         if (!this.u) {
            this.l.b(this.l.a(ebj.a.e, eeo.a(this.m)), dil.fA.m());
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
         int $$1 = azn.a(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         int $$2 = azn.a(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         this.a(new jh($$1, 75, $$2));
      }
   }

   private void a(jh $$0) {
      this.l.c(3000, $$0, 0);
      this.l.H_().a(ma.aJ).flatMap($$0x -> $$0x.a(sb.d)).ifPresent($$1 -> $$1.a().a(this.l, this.l.l().g(), azv.a(), $$0));
   }

   private void a(boolean $$0) {
      eeo $$1 = new eeo($$0);
      if (this.y == null) {
         this.y = this.l.a(ebj.a.f, eeo.a(this.m)).e();

         while (this.l.a_(this.y).a(dil.F) && this.y.v() > 63) {
            this.y = this.y.e();
         }
      }

      if ($$1.a(egt.m, this.l, this.l.l().g(), azv.a(), this.y)) {
         int $$2 = azn.e(4, 16);
         this.l.l().a.a(new del(this.y), $$2);
      }
   }

   @Nullable
   private cjs r() {
      this.l.m(new jh(this.m.u(), 128 + this.m.v(), this.m.w()));
      cjs $$0 = bup.F.a(this.l, buo.h);
      if ($$0 != null) {
         $$0.a(this);
         $$0.c(this.m);
         $$0.gs().a(cki.a);
         $$0.b((double)this.m.u(), (double)(128 + this.m.v()), (double)this.m.w(), this.l.A.i() * 360.0F, 0.0F);
         this.l.b($$0);
         this.w = $$0.cI();
      }

      return $$0;
   }

   public void b(cjs $$0) {
      if ($$0.cI().equals(this.w)) {
         this.k.a($$0.eH() / $$0.eW());
         this.p = 0;
         if ($$0.an()) {
            this.k.a($$0.S_());
         }
      }
   }

   public int e() {
      return this.q;
   }

   public void a(cjr $$0, bsy $$1) {
      if (this.z != null && this.B.contains($$0)) {
         d.debug("Aborting respawn sequence");
         this.z = null;
         this.A = 0;
         this.h();
         this.a(true);
      } else {
         this.p();
         bui $$2 = this.l.a(this.w);
         if ($$2 instanceof cjs) {
            ((cjs)$$2).a($$0, $$0.dy(), $$1);
         }
      }
   }

   public boolean f() {
      return this.u;
   }

   public void g() {
      if (this.t && this.z == null) {
         jh $$0 = this.y;
         if ($$0 == null) {
            d.debug("Tried to respawn, but need to find the portal first.");
            dvt.b $$1 = this.m();
            if ($$1 == null) {
               d.debug("Couldn't find a portal, so we made one.");
               this.a(true);
            } else {
               d.debug("Found the exit portal & saved its location for next time.");
            }

            $$0 = this.y;
         }

         List<cjr> $$2 = Lists.newArrayList();
         jh $$3 = $$0.b(1);

         for (jm $$4 : jm.c.a) {
            List<cjr> $$5 = this.l.a(cjr.class, new ezm($$3.a($$4, 2)));
            if ($$5.isEmpty()) {
               return;
            }

            $$2.addAll($$5);
         }

         d.debug("Found all crystals, respawning dragon.");
         this.a($$2);
      }
   }

   private void a(List<cjr> $$0) {
      if (this.t && this.z == null) {
         for (dvt.b $$1 = this.m(); $$1 != null; $$1 = this.m()) {
            for (int $$2 = 0; $$2 < this.o.c(); $$2++) {
               for (int $$3 = 0; $$3 < this.o.b(); $$3++) {
                  for (int $$4 = 0; $$4 < this.o.a(); $$4++) {
                     dvs $$5 = $$1.a($$2, $$3, $$4);
                     if ($$5.a().a(dil.F) || $$5.a().a(dil.fx)) {
                        this.l.b($$5.d(), dil.fz.m());
                     }
                  }
               }
            }
         }

         this.z = dzl.a;
         this.A = 0;
         this.a(false);
         this.B = $$0;
      }
   }

   public void h() {
      for (efz.a $$0 : efz.a(this.l)) {
         for (cjr $$2 : this.l.a(cjr.class, $$0.f())) {
            $$2.n(false);
            $$2.a(null);
         }
      }
   }

   @Nullable
   public UUID i() {
      return this.w;
   }

   public static record a(boolean c, boolean d, boolean e, boolean f, Optional<UUID> g, Optional<jh> h, Optional<List<Integer>> i) {
      public static final Codec<dzm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("NeedsStateScanning").orElse(true).forGetter(dzm.a::a),
                  Codec.BOOL.fieldOf("DragonKilled").orElse(false).forGetter(dzm.a::b),
                  Codec.BOOL.fieldOf("PreviouslyKilled").orElse(false).forGetter(dzm.a::c),
                  Codec.BOOL.lenientOptionalFieldOf("IsRespawning", false).forGetter(dzm.a::d),
                  kk.a.lenientOptionalFieldOf("Dragon").forGetter(dzm.a::e),
                  jh.a.lenientOptionalFieldOf("ExitPortalLocation").forGetter(dzm.a::f),
                  Codec.list(Codec.INT).lenientOptionalFieldOf("Gateways").forGetter(dzm.a::g)
               )
               .apply($$0, dzm.a::new)
      );
      public static final dzm.a b = new dzm.a(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

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

      public Optional<jh> f() {
         return this.h;
      }

      public Optional<List<Integer>> g() {
         return this.i;
      }
   }
}
