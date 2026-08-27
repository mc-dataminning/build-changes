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

public class dwx {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 1200;
   private static final int f = 100;
   public static final int a = 20;
   private static final int g = 8;
   public static final int b = 9;
   private static final int h = 20;
   private static final int i = 96;
   public static final int c = 128;
   private final Predicate<brv> j;
   private final aqq k = (aqq)new aqq(xe.c("entity.minecraft.ender_dragon"), bpq.a.a, bpq.b.a).b(true).c(true);
   private final aqt l;
   private final ir m;
   private final ObjectArrayList<Integer> n = new ObjectArrayList();
   private final dth o;
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
   private ir y;
   @Nullable
   private dww z;
   private int A;
   @Nullable
   private List<cgz> B;

   public dwx(aqt $$0, long $$1, dwx.a $$2) {
      this($$0, $$1, $$2, ir.c);
   }

   public dwx(aqt $$0, long $$1, dwx.a $$2, ir $$3) {
      this.l = $$0;
      this.m = $$3;
      this.j = bsa.a.and(bsa.a((double)$$3.u(), (double)(128 + $$3.v()), (double)$$3.w(), 192.0));
      this.x = $$2.c;
      this.w = $$2.g.orElse(null);
      this.t = $$2.d;
      this.u = $$2.e;
      if ($$2.f) {
         this.z = dww.a;
      }

      this.y = $$2.h.orElse(null);
      this.n.addAll($$2.i.orElseGet(() -> {
         ObjectArrayList<Integer> $$1x = new ObjectArrayList(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         ad.c($$1x, ayt.a($$1));
         return $$1x;
      }));
      this.o = dti.a()
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .a('#', dtg.a(dtk.a(dfe.ak)))
         .b();
   }

   @Deprecated
   @VisibleForTesting
   public void a() {
      this.v = true;
   }

   public dwx.a b() {
      return new dwx.a(this.x, this.t, this.u, false, Optional.ofNullable(this.w), Optional.ofNullable(this.y), Optional.of(this.n));
   }

   public void c() {
      this.k.d(!this.t);
      if (++this.s >= 20) {
         this.o();
         this.s = 0;
      }

      if (!this.k.g().isEmpty()) {
         this.l.l().a(aqy.b, new dbh(0, 0), 9, azo.a);
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
         this.l.l().b(aqy.b, new dbh(0, 0), 9, azo.a);
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

      List<? extends cha> $$1 = this.l.i();
      if ($$1.isEmpty()) {
         this.t = true;
      } else {
         cha $$2 = $$1.get(0);
         this.w = $$2.cE();
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
      List<? extends cha> $$0 = this.l.i();
      if ($$0.isEmpty()) {
         d.debug("Haven't seen the dragon, respawning it");
         this.r();
      } else {
         d.debug("Haven't seen our dragon, but found another one to use.");
         this.w = $$0.get(0).cE();
      }
   }

   protected void a(dww $$0) {
      if (this.z == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.A = 0;
         if ($$0 == dww.e) {
            this.z = null;
            this.t = false;
            cha $$1 = this.r();
            if ($$1 != null) {
               for (aqu $$2 : this.k.g()) {
                  an.o.a($$2, $$1);
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
            dvi $$2 = this.l.c($$0, $$1);

            for (dqc $$3 : $$2.H().values()) {
               if ($$3 instanceof dry) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private dth.b m() {
      dbh $$0 = new dbh(this.m);

      for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; $$1++) {
         for (int $$2 = -8 + $$0.f; $$2 <= 8 + $$0.f; $$2++) {
            dvi $$3 = this.l.c($$1, $$2);

            for (dqc $$4 : $$3.H().values()) {
               if ($$4 instanceof dry) {
                  dth.b $$5 = this.o.a(this.l, $$4.az_());
                  if ($$5 != null) {
                     ir $$6 = $$5.a(3, 3, 3).d();
                     if (this.y == null) {
                        this.y = $$6;
                     }

                     return $$5;
                  }
               }
            }
         }
      }

      ir $$7 = ebz.a(this.m);
      int $$8 = this.l.a(dyu.a.e, $$7).v();

      for (int $$9 = $$8; $$9 >= this.l.J_(); $$9--) {
         dth.b $$10 = this.o.a(this.l, new ir($$7.u(), $$9, $$7.w()));
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
         dbh $$0 = new dbh(this.m);

         for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; $$1++) {
            for (int $$2 = 8 + $$0.f; $$2 <= 8 + $$0.f; $$2++) {
               duy $$3 = this.l.a($$1, $$2, dvx.n, false);
               if (!($$3 instanceof dvi)) {
                  return false;
               }

               aqm $$4 = ((dvi)$$3).E();
               if (!$$4.a(aqm.c)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private void o() {
      Set<aqu> $$0 = Sets.newHashSet();

      for (aqu $$1 : this.l.a(this.j)) {
         this.k.a($$1);
         $$0.add($$1);
      }

      Set<aqu> $$2 = Sets.newHashSet(this.k.g());
      $$2.removeAll($$0);

      for (aqu $$3 : $$2) {
         this.k.b($$3);
      }
   }

   private void p() {
      this.r = 0;
      this.q = 0;

      for (edp.a $$0 : edp.a(this.l)) {
         this.q = this.q + this.l.a(cgz.class, $$0.f()).size();
      }

      d.debug("Found {} end crystals still alive", this.q);
   }

   public void a(cha $$0) {
      if ($$0.cE().equals(this.w)) {
         this.k.a(0.0F);
         this.k.d(false);
         this.a(true);
         this.q();
         if (!this.u) {
            this.l.b(this.l.a(dyu.a.e, ebz.a(this.m)), dfe.gs.n());
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
         int $$1 = aym.a(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         int $$2 = aym.a(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         this.a(new ir($$1, 75, $$2));
      }
   }

   private void a(ir $$0) {
      this.l.c(3000, $$0, 0);
      this.l.I_().c(li.aC).flatMap($$0x -> $$0x.b(rz.c)).ifPresent($$1 -> $$1.a().a(this.l, this.l.l().g(), ayt.a(), $$0));
   }

   private void a(boolean $$0) {
      ebz $$1 = new ebz($$0);
      if (this.y == null) {
         this.y = this.l.a(dyu.a.f, ebz.a(this.m)).d();

         while (this.l.a_(this.y).a(dfe.ak) && this.y.v() > this.l.A_()) {
            this.y = this.y.d();
         }
      }

      if ($$1.a(eek.m, this.l, this.l.l().g(), ayt.a(), this.y)) {
         int $$2 = aym.e(4, 16);
         this.l.l().a.a(new dbh(this.y), $$2);
      }
   }

   @Nullable
   private cha r() {
      this.l.m(new ir(this.m.u(), 128 + this.m.v(), this.m.w()));
      cha $$0 = bsb.H.a((dca)this.l);
      if ($$0 != null) {
         $$0.a(this);
         $$0.d(this.m);
         $$0.gv().a(chq.a);
         $$0.b((double)this.m.u(), (double)(128 + this.m.v()), (double)this.m.w(), this.l.A.i() * 360.0F, 0.0F);
         this.l.b($$0);
         this.w = $$0.cE();
      }

      return $$0;
   }

   public void b(cha $$0) {
      if ($$0.cE().equals(this.w)) {
         this.k.a($$0.eI() / $$0.eZ());
         this.p = 0;
         if ($$0.ag()) {
            this.k.a($$0.P_());
         }
      }
   }

   public int e() {
      return this.q;
   }

   public void a(cgz $$0, bqt $$1) {
      if (this.z != null && this.B.contains($$0)) {
         d.debug("Aborting respawn sequence");
         this.z = null;
         this.A = 0;
         this.h();
         this.a(true);
      } else {
         this.p();
         brv $$2 = this.l.a(this.w);
         if ($$2 instanceof cha) {
            ((cha)$$2).a($$0, $$0.du(), $$1);
         }
      }
   }

   public boolean f() {
      return this.u;
   }

   public void g() {
      if (this.t && this.z == null) {
         ir $$0 = this.y;
         if ($$0 == null) {
            d.debug("Tried to respawn, but need to find the portal first.");
            dth.b $$1 = this.m();
            if ($$1 == null) {
               d.debug("Couldn't find a portal, so we made one.");
               this.a(true);
            } else {
               d.debug("Found the exit portal & saved its location for next time.");
            }

            $$0 = this.y;
         }

         List<cgz> $$2 = Lists.newArrayList();
         ir $$3 = $$0.b(1);

         for (iw $$4 : iw.c.a) {
            List<cgz> $$5 = this.l.a(cgz.class, new ewp($$3.a($$4, 2)));
            if ($$5.isEmpty()) {
               return;
            }

            $$2.addAll($$5);
         }

         d.debug("Found all crystals, respawning dragon.");
         this.a($$2);
      }
   }

   private void a(List<cgz> $$0) {
      if (this.t && this.z == null) {
         for (dth.b $$1 = this.m(); $$1 != null; $$1 = this.m()) {
            for (int $$2 = 0; $$2 < this.o.c(); $$2++) {
               for (int $$3 = 0; $$3 < this.o.b(); $$3++) {
                  for (int $$4 = 0; $$4 < this.o.a(); $$4++) {
                     dtg $$5 = $$1.a($$2, $$3, $$4);
                     if ($$5.a().a(dfe.ak) || $$5.a().a(dfe.gp)) {
                        this.l.b($$5.d(), dfe.gr.n());
                     }
                  }
               }
            }
         }

         this.z = dww.a;
         this.A = 0;
         this.a(false);
         this.B = $$0;
      }
   }

   public void h() {
      for (edp.a $$0 : edp.a(this.l)) {
         for (cgz $$2 : this.l.a(cgz.class, $$0.f())) {
            $$2.n(false);
            $$2.a(null);
         }
      }
   }

   @Nullable
   public UUID i() {
      return this.w;
   }

   public static record a(boolean c, boolean d, boolean e, boolean f, Optional<UUID> g, Optional<ir> h, Optional<List<Integer>> i) {
      public static final Codec<dwx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("NeedsStateScanning").orElse(true).forGetter(dwx.a::a),
                  Codec.BOOL.fieldOf("DragonKilled").orElse(false).forGetter(dwx.a::b),
                  Codec.BOOL.fieldOf("PreviouslyKilled").orElse(false).forGetter(dwx.a::c),
                  Codec.BOOL.optionalFieldOf("IsRespawning", false).forGetter(dwx.a::d),
                  ju.a.optionalFieldOf("Dragon").forGetter(dwx.a::e),
                  ir.a.optionalFieldOf("ExitPortalLocation").forGetter(dwx.a::f),
                  Codec.list(Codec.INT).optionalFieldOf("Gateways").forGetter(dwx.a::g)
               )
               .apply($$0, dwx.a::new)
      );
      public static final dwx.a b = new dwx.a(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

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

      public Optional<ir> f() {
         return this.h;
      }

      public Optional<List<Integer>> g() {
         return this.i;
      }
   }
}
