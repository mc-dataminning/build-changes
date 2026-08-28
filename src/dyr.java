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

public class dyr {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 1200;
   private static final int f = 100;
   public static final int a = 20;
   private static final int g = 8;
   public static final int b = 9;
   private static final int h = 20;
   private static final int i = 96;
   public static final int c = 128;
   private final Predicate<btr> j;
   private final arg k = (arg)new arg(xe.c("entity.minecraft.ender_dragon"), bri.a.a, bri.b.a).b(true).c(true);
   private final arj l;
   private final jf m;
   private final ObjectArrayList<Integer> n = new ObjectArrayList();
   private final dux o;
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
   private jf y;
   @Nullable
   private dyq z;
   private int A;
   @Nullable
   private List<ciz> B;

   public dyr(arj $$0, long $$1, dyr.a $$2) {
      this($$0, $$1, $$2, jf.c);
   }

   public dyr(arj $$0, long $$1, dyr.a $$2, jf $$3) {
      this.l = $$0;
      this.m = $$3;
      this.j = btw.a.and(btw.a((double)$$3.u(), (double)(128 + $$3.v()), (double)$$3.w(), 192.0));
      this.x = $$2.c;
      this.w = $$2.g.orElse(null);
      this.t = $$2.d;
      this.u = $$2.e;
      if ($$2.f) {
         this.z = dyq.a;
      }

      this.y = $$2.h.orElse(null);
      this.n.addAll($$2.i.orElseGet(() -> {
         ObjectArrayList<Integer> $$1x = new ObjectArrayList(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         ad.c($$1x, azn.a($$1));
         return $$1x;
      }));
      this.o = duy.a()
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .a('#', duw.a(dva.a(dho.F)))
         .b();
   }

   @Deprecated
   @VisibleForTesting
   public void a() {
      this.v = true;
   }

   public dyr.a b() {
      return new dyr.a(this.x, this.t, this.u, false, Optional.ofNullable(this.w), Optional.ofNullable(this.y), Optional.of(this.n));
   }

   public void c() {
      this.k.d(!this.t);
      if (++this.s >= 20) {
         this.o();
         this.s = 0;
      }

      if (!this.k.g().isEmpty()) {
         this.l.l().a(aro.b, new ddp(0, 0), 9, bak.a);
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
         this.l.l().b(aro.b, new ddp(0, 0), 9, bak.a);
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

      List<? extends cja> $$1 = this.l.i();
      if ($$1.isEmpty()) {
         this.t = true;
      } else {
         cja $$2 = $$1.get(0);
         this.w = $$2.cD();
         d.info("Found that there's a dragon still alive ({})", $$2);
         this.t = false;
         if (!$$0) {
            d.info("But we didn't have a portal, let's remove it.");
            $$2.as();
            this.w = null;
         }
      }

      if (!this.u && this.t) {
         this.t = false;
      }
   }

   private void k() {
      List<? extends cja> $$0 = this.l.i();
      if ($$0.isEmpty()) {
         d.debug("Haven't seen the dragon, respawning it");
         this.r();
      } else {
         d.debug("Haven't seen our dragon, but found another one to use.");
         this.w = $$0.get(0).cD();
      }
   }

   protected void a(dyq $$0) {
      if (this.z == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.A = 0;
         if ($$0 == dyq.e) {
            this.z = null;
            this.t = false;
            cja $$1 = this.r();
            if ($$1 != null) {
               for (ark $$2 : this.k.g()) {
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
            dwy $$2 = this.l.d($$0, $$1);

            for (drv $$3 : $$2.F().values()) {
               if ($$3 instanceof dto) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private dux.b m() {
      ddp $$0 = new ddp(this.m);

      for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; $$1++) {
         for (int $$2 = -8 + $$0.f; $$2 <= 8 + $$0.f; $$2++) {
            dwy $$3 = this.l.d($$1, $$2);

            for (drv $$4 : $$3.F().values()) {
               if ($$4 instanceof dto) {
                  dux.b $$5 = this.o.a(this.l, $$4.aC_());
                  if ($$5 != null) {
                     jf $$6 = $$5.a(3, 3, 3).d();
                     if (this.y == null) {
                        this.y = $$6;
                     }

                     return $$5;
                  }
               }
            }
         }
      }

      jf $$7 = edt.a(this.m);
      int $$8 = this.l.a(eao.a.e, $$7).v();

      for (int $$9 = $$8; $$9 >= this.l.H_(); $$9--) {
         dux.b $$10 = this.o.a(this.l, new jf($$7.u(), $$9, $$7.w()));
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
         ddp $$0 = new ddp(this.m);

         for (int $$1 = -8 + $$0.e; $$1 <= 8 + $$0.e; $$1++) {
            for (int $$2 = 8 + $$0.f; $$2 <= 8 + $$0.f; $$2++) {
               dwo $$3 = this.l.a($$1, $$2, dxp.n, false);
               if (!($$3 instanceof dwy)) {
                  return false;
               }

               aqz $$4 = ((dwy)$$3).C();
               if (!$$4.a(aqz.c)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private void o() {
      Set<ark> $$0 = Sets.newHashSet();

      for (ark $$1 : this.l.a(this.j)) {
         this.k.a($$1);
         $$0.add($$1);
      }

      Set<ark> $$2 = Sets.newHashSet(this.k.g());
      $$2.removeAll($$0);

      for (ark $$3 : $$2) {
         this.k.b($$3);
      }
   }

   private void p() {
      this.r = 0;
      this.q = 0;

      for (efe.a $$0 : efe.a(this.l)) {
         this.q = this.q + this.l.a(ciz.class, $$0.f()).size();
      }

      d.debug("Found {} end crystals still alive", this.q);
   }

   public void a(cja $$0) {
      if ($$0.cD().equals(this.w)) {
         this.k.a(0.0F);
         this.k.d(false);
         this.a(true);
         this.q();
         if (!this.u) {
            this.l.b(this.l.a(eao.a.e, edt.a(this.m)), dho.fA.n());
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
         int $$1 = azf.a(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         int $$2 = azf.a(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)$$0)));
         this.a(new jf($$1, 75, $$2));
      }
   }

   private void a(jf $$0) {
      this.l.c(3000, $$0, 0);
      this.l.G_().a(lw.aK).flatMap($$0x -> $$0x.a(ru.d)).ifPresent($$1 -> $$1.a().a(this.l, this.l.l().g(), azn.a(), $$0));
   }

   private void a(boolean $$0) {
      edt $$1 = new edt($$0);
      if (this.y == null) {
         this.y = this.l.a(eao.a.f, edt.a(this.m)).e();

         while (this.l.a_(this.y).a(dho.F) && this.y.v() > 63) {
            this.y = this.y.e();
         }
      }

      if ($$1.a(efy.m, this.l, this.l.l().g(), azn.a(), this.y)) {
         int $$2 = azf.e(4, 16);
         this.l.l().a.a(new ddp(this.y), $$2);
      }
   }

   @Nullable
   private cja r() {
      this.l.m(new jf(this.m.u(), 128 + this.m.v(), this.m.w()));
      cja $$0 = bty.F.a(this.l, btx.h);
      if ($$0 != null) {
         $$0.a(this);
         $$0.c(this.m);
         $$0.gl().a(cjq.a);
         $$0.b((double)this.m.u(), (double)(128 + this.m.v()), (double)this.m.w(), this.l.z.i() * 360.0F, 0.0F);
         this.l.b($$0);
         this.w = $$0.cD();
      }

      return $$0;
   }

   public void b(cja $$0) {
      if ($$0.cD().equals(this.w)) {
         this.k.a($$0.eB() / $$0.eQ());
         this.p = 0;
         if ($$0.ak()) {
            this.k.a($$0.R_());
         }
      }
   }

   public int e() {
      return this.q;
   }

   public void a(ciz $$0, bsj $$1) {
      if (this.z != null && this.B.contains($$0)) {
         d.debug("Aborting respawn sequence");
         this.z = null;
         this.A = 0;
         this.h();
         this.a(true);
      } else {
         this.p();
         btr $$2 = this.l.a(this.w);
         if ($$2 instanceof cja) {
            ((cja)$$2).a($$0, $$0.ds(), $$1);
         }
      }
   }

   public boolean f() {
      return this.u;
   }

   public void g() {
      if (this.t && this.z == null) {
         jf $$0 = this.y;
         if ($$0 == null) {
            d.debug("Tried to respawn, but need to find the portal first.");
            dux.b $$1 = this.m();
            if ($$1 == null) {
               d.debug("Couldn't find a portal, so we made one.");
               this.a(true);
            } else {
               d.debug("Found the exit portal & saved its location for next time.");
            }

            $$0 = this.y;
         }

         List<ciz> $$2 = Lists.newArrayList();
         jf $$3 = $$0.b(1);

         for (jk $$4 : jk.c.a) {
            List<ciz> $$5 = this.l.a(ciz.class, new eyr($$3.a($$4, 2)));
            if ($$5.isEmpty()) {
               return;
            }

            $$2.addAll($$5);
         }

         d.debug("Found all crystals, respawning dragon.");
         this.a($$2);
      }
   }

   private void a(List<ciz> $$0) {
      if (this.t && this.z == null) {
         for (dux.b $$1 = this.m(); $$1 != null; $$1 = this.m()) {
            for (int $$2 = 0; $$2 < this.o.c(); $$2++) {
               for (int $$3 = 0; $$3 < this.o.b(); $$3++) {
                  for (int $$4 = 0; $$4 < this.o.a(); $$4++) {
                     duw $$5 = $$1.a($$2, $$3, $$4);
                     if ($$5.a().a(dho.F) || $$5.a().a(dho.fx)) {
                        this.l.b($$5.d(), dho.fz.n());
                     }
                  }
               }
            }
         }

         this.z = dyq.a;
         this.A = 0;
         this.a(false);
         this.B = $$0;
      }
   }

   public void h() {
      for (efe.a $$0 : efe.a(this.l)) {
         for (ciz $$2 : this.l.a(ciz.class, $$0.f())) {
            $$2.n(false);
            $$2.a(null);
         }
      }
   }

   @Nullable
   public UUID i() {
      return this.w;
   }

   public static record a(boolean c, boolean d, boolean e, boolean f, Optional<UUID> g, Optional<jf> h, Optional<List<Integer>> i) {
      public static final Codec<dyr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("NeedsStateScanning").orElse(true).forGetter(dyr.a::a),
                  Codec.BOOL.fieldOf("DragonKilled").orElse(false).forGetter(dyr.a::b),
                  Codec.BOOL.fieldOf("PreviouslyKilled").orElse(false).forGetter(dyr.a::c),
                  Codec.BOOL.lenientOptionalFieldOf("IsRespawning", false).forGetter(dyr.a::d),
                  ki.a.lenientOptionalFieldOf("Dragon").forGetter(dyr.a::e),
                  jf.a.lenientOptionalFieldOf("ExitPortalLocation").forGetter(dyr.a::f),
                  Codec.list(Codec.INT).lenientOptionalFieldOf("Gateways").forGetter(dyr.a::g)
               )
               .apply($$0, dyr.a::new)
      );
      public static final dyr.a b = new dyr.a(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

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

      public Optional<jf> f() {
         return this.h;
      }

      public Optional<List<Integer>> g() {
         return this.i;
      }
   }
}
