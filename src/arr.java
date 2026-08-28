import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class arr extends crm {
   private static final Logger cq = LogUtils.getLogger();
   private static final int cr = 32;
   private static final int cs = 10;
   private static final int ct = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final byn cu = new byn(alg.b("creative_mode_block_range"), 0.5, byn.a.a);
   private static final byn cv = new byn(alg.b("creative_mode_entity_range"), 2.0, byn.a.a);
   private static final wy cw = wy.c("block.minecraft.set_spawn");
   public ast f;
   public final MinecraftServer g;
   public final ars h;
   private final alo cx;
   private final awt cy;
   private float cz = Float.MIN_VALUE;
   private int cA = Integer.MIN_VALUE;
   private int cB = Integer.MIN_VALUE;
   private int cC = Integer.MIN_VALUE;
   private int cD = Integer.MIN_VALUE;
   private int cE = Integer.MIN_VALUE;
   private float cF = -1.0E8F;
   private int cG = -99999999;
   private boolean cH = true;
   private int cI = -99999999;
   private crj cJ = crj.a;
   private ari cK = ari.a;
   private boolean cL = true;
   private long cM = ag.c();
   @Nullable
   private bwi cN;
   private boolean cO;
   public boolean i;
   private final aws cP;
   @Nullable
   private ffc cQ;
   private int cR;
   private boolean cS;
   private int cT = 2;
   private String cU = "en_us";
   @Nullable
   private ffc cV;
   @Nullable
   private ffc cW;
   @Nullable
   private ffc cX;
   private jy cY = jy.a(0, 0, 0);
   private aqz cZ = aqz.a;
   @Nullable
   private arr.a da;
   private final asz db;
   private boolean dc;
   private boolean dd;
   private boolean de;
   private cqr df = new cqr();
   @Nullable
   private iv dg;
   private ffc dh = ffc.c;
   private crk di = crk.b;
   private final Set<csr> dj = new HashSet<>();
   private final cvu dk = new cvu() {
      @Override
      public void a(cvf $$0, jo<czn> $$1, czn $$2, int[] $$3) {
         arr.this.f.b(new aco($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cvf $$0, int $$1, czn $$2) {
         arr.this.f.b(new acq($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cvf $$0, czn $$1) {
         arr.this.f.b(new afa($$1.v()));
      }

      @Override
      public void a(cvf $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cvf $$0, int $$1, int $$2) {
         arr.this.f.b(new acp($$0.l, $$1, $$2));
      }
   };
   private final cvt dl = new cvt() {
      @Override
      public void a(cvf $$0, int $$1, czn $$2) {
         cxc $$3 = $$0.b($$1);
         if (!($$3 instanceof cwy)) {
            if ($$3.c == arr.this.gi()) {
               aq.f.a(arr.this, arr.this.gi(), $$2);
            }
         }
      }

      @Override
      public void a(cvf $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xp dm;
   @Nullable
   public final Object j;
   private final ei dn = new ei() {
      @Override
      public boolean t_() {
         return arr.this.y().O().c(dji.q);
      }

      @Override
      public boolean u_() {
         return true;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public void a(wy $$0) {
         arr.this.a($$0);
      }
   };
   private int do;
   public boolean k;

   public arr(MinecraftServer $$0, arq $$1, GameProfile $$2, ara $$3) {
      super($$1, $$1.aa(), $$1.ab(), $$2);
      this.db = $$0.a(this);
      this.h = $$0.b(this);
      this.cP = new aws(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cy = $$0.ag().a((crm)this);
      this.cx = $$0.ag().g(this);
      this.b(this.a($$1, $$1.aa()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public iv a(arq $$0, iv $$1) {
      fex $$2 = this.a(bxv.a).a(ffc.c);
      iv $$3 = $$1;
      if ($$0.B_().g() && $$0.p().aZ().k() != djj.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = azm.a($$0.A_().b((double)$$1.u(), (double)$$1.w()));
         if ($$5 < $$4) {
            $$4 = $$5;
         }

         if ($$5 <= 1) {
            $$4 = 1;
         }

         long $$6 = (long)($$4 * 2 + 1);
         long $$7 = $$6 * $$6;
         int $$8 = $$7 > 2147483647L ? Integer.MAX_VALUE : (int)$$7;
         int $$9 = this.t($$8);
         int $$10 = azv.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = ark.a($$0, $$15, $$16);
               if ($$3 != null && this.a($$0, $$2.c($$3.c()))) {
                  return $$3;
               }
            } catch (Exception var25) {
               int $$18 = $$11;
               int $$19 = $$4;
               p $$20 = p.a(var25, "Searching for spawn");
               q $$21 = $$20.a("Spawn Lookup");
               $$21.a("Origin", $$1::toString);
               $$21.a("Radius", () -> Integer.toString($$19));
               $$21.a("Candidate", () -> "[" + $$15 + "," + $$16 + "]");
               $$21.a("Progress", () -> $$18 + " out of " + $$8);
               throw new aa($$20);
            }
         }

         $$3 = $$1;
      }

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.ao()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.G_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(arq $$0, fex $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.df = $$0.<cqr>a("warden_spawn_tracker", cqr.a).orElseGet(cqr::new);
      this.cW = $$0.<ffc>a("entered_nether_pos", ffc.a).orElse(null);
      this.i = $$0.o("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cP.a($$0.n("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      }

      if (this.fQ()) {
         this.fR();
      }

      this.da = $$0.<arr.a>a("respawn", arr.a.a).orElse(null);
      this.de = $$0.o("spawn_extra_particles_on_fall");
      this.dg = $$0.<iv>a("raid_omen_position", iv.a).orElse(null);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("warden_spawn_tracker", cqr.a, this.df);
      this.m($$0);
      $$0.a("seenCredits", this.i);
      $$0.b("entered_nether_pos", ffc.a, this.cW);
      this.k($$0);
      $$0.a("recipeBook", this.cP.b());
      $$0.a("Dimension", this.dU().aj().a().toString());
      $$0.b("respawn", arr.a.a, this.da);
      $$0.a("spawn_extra_particles_on_fall", this.de);
      $$0.b("raid_omen_position", iv.a, this.dg);
      this.l($$0);
   }

   private void k(tz $$0) {
      bwi $$1 = this.de();
      bwi $$2 = this.dj();
      if ($$2 != null && $$1 != this && $$1.dd()) {
         tz $$3 = new tz();
         tz $$4 = new tz();
         $$1.e($$4);
         $$3.a("Attach", jz.a, $$2.cF());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<tz> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dU() instanceof arq $$1) {
         tz $$2 = $$0.get().n("RootVehicle");
         bwi $$3 = bwr.a($$2.n("Entity"), $$1, bwq.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
         if ($$3 == null) {
            return;
         }

         UUID $$4 = $$2.<UUID>a("Attach", jz.a).orElse(null);
         if ($$3.cF().equals($$4)) {
            this.a($$3, true);
         } else {
            for (bwi $$5 : $$3.db()) {
               if ($$5.cF().equals($$4)) {
                  this.a($$5, true);
                  break;
               }
            }
         }

         if (!this.bX()) {
            cq.warn("Couldn't reattach entity to player");
            $$3.aq();

            for (bwi $$6 : $$3.db()) {
               $$6.aq();
            }
         }
      }
   }

   private void l(tz $$0) {
      if (!this.dj.isEmpty()) {
         uf $$1 = new uf();

         for (csr $$2 : this.dj) {
            if ($$2.dP()) {
               cq.warn("Trying to save removed ender pearl, skipping");
            } else {
               tz $$3 = new tz();
               $$2.e($$3);
               $$3.a("ender_pearl_dimension", djm.h, $$2.dU().aj());
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   public void b(Optional<tz> $$0) {
      if ($$0.isPresent() && $$0.get().b("ender_pearls", 9) && $$0.get().a("ender_pearls") instanceof uf $$2) {
         $$2.forEach($$0x -> {
            if ($$0x instanceof tz $$1 && $$1.c("ender_pearl_dimension")) {
               Optional<alf<djm>> $$2x = $$1.a("ender_pearl_dimension", djm.h);
               if ($$2x.isEmpty()) {
                  cq.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               arq $$3 = this.dU().p().a($$2x.get());
               if ($$3 != null) {
                  bwi $$4 = bwr.a($$1, $$3, bwq.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dw());
                  } else {
                     cq.warn("Failed to spawn player ender pearl in level ({}), skipping", $$2x.get());
                  }
               } else {
                  cq.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$2x.get());
               }
            }
         });
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gs();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ch = azm.a((float)$$0 / $$1, 0.0F, $$2);
      this.cI = -1;
   }

   public void b(int $$0) {
      this.cf = $$0;
      this.cI = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cI = -1;
   }

   @Override
   public void a(czn $$0, int $$1) {
      super.a($$0, $$1);
      this.cI = -1;
   }

   private void a(cvf $$0) {
      $$0.a(this.dl);
      $$0.a(this.dk);
   }

   public void d() {
      this.a(this.bQ);
   }

   @Override
   public void e_() {
      super.e_();
      this.f.b(ady.a);
   }

   @Override
   public void J_() {
      super.J_();
      this.f.b(new adx(this.eR()));
   }

   @Override
   public void a(eat $$0) {
      aq.e.a(this, $$0);
   }

   @Override
   protected czk g() {
      return new dal(this);
   }

   @Override
   public void h() {
      this.gJ();
      this.h.a();
      this.df.a();
      if (this.aj > 0) {
         this.aj--;
      }

      this.bR.d();
      if (!this.bR.b(this)) {
         this.p();
         this.bR = this.bQ;
      }

      bwi $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bI()) {
            this.a($$0.dz(), $$0.dB(), $$0.dF(), $$0.dK(), $$0.dM());
            this.y().m().a(this);
            if (this.fY()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      aq.x.a(this);
      if (this.cQ != null) {
         aq.v.a(this, this.cQ, this.af - this.cR);
      }

      this.l();
      this.m();
      this.gQ();
      this.cx.a(this, true);
   }

   private void gQ() {
      byl $$0 = this.g(byp.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(cu);
         } else {
            $$0.e(cu);
         }
      }

      byl $$1 = this.g(byp.j);
      if ($$1 != null) {
         if (this.b()) {
            $$1.a(cv);
         } else {
            $$1.e(cv);
         }
      }
   }

   public void i() {
      try {
         if (!this.V_() || !this.dn()) {
            super.h();
         }

         for (int $$0 = 0; $$0 < this.gi().b(); $$0++) {
            czn $$1 = this.gi().a($$0);
            if (!$$1.f()) {
               this.i($$1);
            }
         }

         if (this.eF() != this.cF || this.cG != this.bS.a() || this.bS.c() == 0.0F != this.cH) {
            this.f.b(new afi(this.eF(), this.bS.a(), this.bS.c()));
            this.cF = this.eF();
            this.cG = this.bS.a();
            this.cH = this.bS.c() == 0.0F;
         }

         if (this.eF() + this.fv() != this.cz) {
            this.cz = this.eF() + this.fv();
            this.a(fgk.h, azm.f(this.cz));
         }

         if (this.bS.a() != this.cA) {
            this.cA = this.bS.a();
            this.a(fgk.i, azm.f((float)this.cA));
         }

         if (this.cr() != this.cB) {
            this.cB = this.cr();
            this.a(fgk.j, azm.f((float)this.cB));
         }

         if (this.eQ() != this.cC) {
            this.cC = this.eQ();
            this.a(fgk.k, azm.f((float)this.cC));
         }

         if (this.cg != this.cE) {
            this.cE = this.cg;
            this.a(fgk.l, azm.f((float)this.cE));
         }

         if (this.cf != this.cD) {
            this.cD = this.cf;
            this.a(fgk.m, azm.f((float)this.cD));
         }

         if (this.cg != this.cI) {
            this.cI = this.cg;
            this.f.b(new afh(this.ch, this.cg, this.cf));
         }

         if (this.af % 20 == 0) {
            aq.q.a(this);
         }
      } catch (Throwable var4) {
         p $$3 = p.a(var4, "Ticking player");
         q $$4 = $$3.a("Player being ticked");
         this.a($$4);
         throw new aa($$3);
      }
   }

   private void i(czn $$0) {
      eyt $$1 = $$0.a(kk.M);
      eyv $$2 = daa.a($$1, this.dU());
      if ($$2 != null) {
         zf<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dU().an() == bud.a && this.y().O().c(dji.l)) {
         if (this.af % 20 == 0) {
            if (this.eF() < this.eT()) {
               this.c(1.0F);
            }

            float $$0 = this.bS.c();
            if ($$0 < 20.0F) {
               this.bS.b($$0 + 1.0F);
            }
         }

         if (this.af % 10 == 0 && this.bS.b()) {
            this.bS.a(this.bS.a() + 1);
         }
      }
   }

   @Override
   public void k() {
      if (this.eF() > 0.0F && this.cV != null) {
         aq.X.a(this, this.cV);
      }

      this.cV = null;
      super.k();
   }

   public void l() {
      if (this.Z > 0.0 && this.cV == null) {
         this.cV = this.ds();
         if (this.cm != null && this.cm.e <= this.cV.e) {
            aq.ae.a(this, this.cm, this.cn);
         }
      }
   }

   @Override
   public void m() {
      if (this.dj() != null && this.dj().bu()) {
         if (this.cX == null) {
            this.cX = this.ds();
         } else {
            aq.Y.a(this, this.cX);
         }
      }

      if (this.cX != null && (this.dj() == null || !this.dj().bu())) {
         this.cX = null;
      }
   }

   private void a(fgk $$0, int $$1) {
      this.gy().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bux $$0) {
      this.a(eft.p);
      boolean $$1 = this.y().O().c(dji.o);
      if ($$1) {
         wy $$2 = this.eR().a();
         this.f.a(new adz(this.ao(), $$2), wf.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wy $$3x = wy.a("death.attack.message_too_long", wy.b($$2x).a(o.o));
            wy $$4x = wy.a("death.attack.even_more_magic", this.m_()).a($$1xx -> $$1xx.a(new xe.e($$3x)));
            return new adz(this.ao(), $$4x);
         }));
         fgj $$3 = this.cp();
         if ($$3 == null || $$3.l() == fgj.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.l() == fgj.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.l() == fgj.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new adz(this.ao(), wx.a));
      }

      this.gx();
      if (this.y().O().c(dji.P)) {
         this.gR();
      }

      if (!this.V_()) {
         this.b(this.y(), $$0);
      }

      this.gy().a(fgk.e, this, fgf::b);
      bxj $$4 = this.eS();
      if ($$4 != null) {
         this.b(awx.h.b($$4.an()));
         $$4.a(this, $$0);
         this.e($$4);
      }

      this.dU().a(this, (byte)3);
      this.a(awx.N);
      this.a(awx.i.b(awx.m));
      this.a(awx.i.b(awx.n));
      this.aF();
      this.k(0);
      this.c(false);
      this.eR().c();
      this.c(Optional.of(je.a(this.dU().aj(), this.du())));
      this.v(false);
   }

   private void gR() {
      fex $$0 = new fex(this.du()).c(32.0, 10.0, 32.0);
      this.dU().a(bxl.class, $$0, bwp.f).stream().filter($$0x -> $$0x instanceof bxo).forEach($$0x -> ((bxo)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bwi $$0, bux $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gy().a(fgk.g, this, fgf::b);
         if ($$0 instanceof crm) {
            this.a(awx.Q);
            this.gy().a(fgk.f, this, fgf::b);
         } else {
            this.a(awx.O);
         }

         this.a(this, $$0, fgk.n);
         this.a($$0, this, fgk.o);
         aq.c.a(this, $$0, $$1);
      }
   }

   private void a(fgg $$0, fgg $$1, fgk[] $$2) {
      fgc $$3 = this.gy().e($$1.cH());
      if ($$3 != null) {
         int $$4 = $$3.o().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gy().a($$2[$$4], $$0, fgf::b);
         }
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bwi $$3 = $$1.d();
         if ($$3 instanceof crm $$4 && !this.a($$4)) {
            return false;
         }

         if ($$3 instanceof cru $$5 && $$5.q() instanceof crm $$7 && !this.a($$7)) {
            return false;
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(crm $$0) {
      return !this.gS() ? false : super.a($$0);
   }

   private boolean gS() {
      return this.g.ac();
   }

   public eya a(boolean $$0, eya.a $$1) {
      arr.a $$2 = this.T();
      arq $$3 = this.g.a(arr.a.b($$2));
      if ($$3 != null && $$2 != null) {
         Optional<arr.b> $$4 = a($$3, $$2, $$0);
         if ($$4.isPresent()) {
            arr.b $$5 = $$4.get();
            return new eya($$3, $$5.a(), ffc.c, $$5.b(), 0.0F, $$1);
         } else {
            return eya.a(this.g.J(), this, $$1);
         }
      } else {
         return new eya(this.g.J(), this, $$1);
      }
   }

   private static Optional<arr.b> a(arq $$0, arr.a $$1, boolean $$2) {
      iv $$3 = $$1.c;
      float $$4 = $$1.d;
      boolean $$5 = $$1.e;
      eat $$6 = $$0.a_($$3);
      dmr $$7 = $$6.b();
      if ($$7 instanceof dtg && ($$5 || $$6.c(dtg.d) > 0) && dtg.a($$0)) {
         Optional<ffc> $$8 = dtg.a(bwr.bS, $$0, $$3);
         if (!$$5 && $$2 && $$8.isPresent()) {
            $$0.a($$3, $$6.b(dtg.d, Integer.valueOf($$6.c(dtg.d) - 1)), 3);
         }

         return $$8.map($$1x -> arr.b.a($$1x, $$3));
      } else if ($$7 instanceof dmk && dmk.a($$0)) {
         return dmk.a(bwr.bS, $$0, $$3, $$6.c(dmk.e), $$4).map($$1x -> arr.b.a($$1x, $$3));
      } else if (!$$5) {
         return Optional.empty();
      } else {
         boolean $$9 = $$7.a($$6);
         eat $$10 = $$0.a_($$3.d());
         boolean $$11 = $$10.b().a($$10);
         return $$9 && $$11 ? Optional.of(new arr.b(new ffc((double)$$3.u() + 0.5, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5), $$4)) : Optional.empty();
      }
   }

   @Override
   public void n() {
      this.al();
      this.y().a(this, bwi.d.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new adb(adb.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public arr a(eya $$0) {
      if (this.dP()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new adb(adb.b, 0.0F));
         }

         arq $$1 = $$0.b();
         arq $$2 = this.y();
         alf<djm> $$3 = $$2.aj();
         if (!$$0.h()) {
            this.ab();
         }

         if ($$1.aj() == $$3) {
            this.f.a(bxw.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cO = true;
            ezd $$4 = $$1.y_();
            this.f.b(new aem(this.b($$1), (byte)3));
            this.f.b(new acg($$4.q(), $$4.r()));
            avq $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bwi.d.e);
            this.dR();
            bqq $$6 = bqp.a();
            $$6.a("moving");
            if ($$3 == djm.i && $$1.aj() == djm.j) {
               this.cW = this.ds();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bxw.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fE();
            this.f.b(new adv(this.gj()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.j().onTransition(this);
            this.cI = -1;
            this.cF = -1.0F;
            this.cG = -1;
            return this;
         }
      }
   }

   @Override
   public void a(float $$0, float $$1) {
      this.f.b(new aee($$0, $$1));
   }

   private void g(arq $$0) {
      alf<djm> $$1 = $$0.aj();
      alf<djm> $$2 = this.dU().aj();
      aq.w.a(this, $$1, $$2);
      if ($$1 == djm.j && $$2 == djm.i && this.cW != null) {
         aq.D.a(this, this.cW);
      }

      if ($$2 != djm.j) {
         this.cW = null;
      }
   }

   @Override
   public boolean a(arr $$0) {
      if ($$0.V_()) {
         return this.L() == this;
      } else {
         return this.V_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bwi $$0, int $$1) {
      super.a($$0, $$1);
      this.bR.d();
   }

   @Override
   public Either<crm.a, bau> a(iv $$0) {
      jb $$1 = this.dU().a_($$0).c(dqs.e);
      if (this.fQ() || !this.bI()) {
         return Either.left(crm.a.e);
      } else if (!this.dU().B_().j()) {
         return Either.left(crm.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(crm.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(crm.a.d);
      } else {
         this.a(new arr.a(this.dU().aj(), $$0, this.dK(), false), true);
         if (this.dU().V()) {
            return Either.left(crm.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ffc $$4 = ffc.c($$0);
               List<coo> $$5 = this.dU()
                  .a(
                     coo.class,
                     new fex($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(crm.a.f);
               }
            }

            Either<crm.a, bau> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awx.ap);
               aq.r.a(this);
            });
            if (!this.y().e()) {
               this.a(wy.c("sleep.not_possible"), true);
            }

            ((arq)this.dU()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(iv $$0) {
      this.a(awx.i.b(awx.n));
      super.b($$0);
   }

   private boolean a(iv $$0, jb $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(iv $$0) {
      ffc $$1 = ffc.c($$0);
      return Math.abs(this.dz() - $$1.a()) <= 3.0 && Math.abs(this.dB() - $$1.b()) <= 2.0 && Math.abs(this.dF() - $$1.c()) <= 3.0;
   }

   private boolean b(iv $$0, jb $$1) {
      iv $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fQ()) {
         this.y().m().a(this, new abw(this, 2));
      }

      super.a($$0, $$1);
      if (this.f != null) {
         this.f.a(this.dz(), this.dB(), this.dF(), this.dK(), this.dM());
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bva.m) || !this.gI();
   }

   @Override
   protected void b(arq $$0, iv $$1) {
      if (!this.V_()) {
         super.b($$0, $$1);
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, eat $$2, iv $$3) {
      if (this.de && $$1 && this.Z > 0.0) {
         ffc $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)azm.a(50.0 * this.Z, 0.0, 200.0);
         this.y().a(new lq(ly.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.de = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b_(@Nullable bwi $$0) {
      super.b_($$0);
      this.cm = this.ds();
      this.cn = $$0;
      this.w($$0 != null && $$0.an() == bwr.bH);
   }

   @Override
   protected void o() {
      if (this.dU().u().i()) {
         super.o();
      }
   }

   @Override
   public void a(dzf $$0, boolean $$1) {
      this.f.b(new acc(this.dU(), $$0.ax_()));
      this.f.b(new adt($$0.ax_(), $$1));
   }

   private void gT() {
      this.do = this.do % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bui $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bR != this.bQ) {
            this.p();
         }

         this.gT();
         cvf $$1 = $$0.createMenu(this.do, this.gi(), this);
         if ($$1 == null) {
            if (this.V_()) {
               this.a(wy.c("container.spectatorCantOpen").a(o.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new ads($$1.l, $$1.a(), $$0.m_()));
            this.a($$1);
            this.bR = $$1;
            return OptionalInt.of(this.do);
         }
      }
   }

   @Override
   public void a(int $$0, dij $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new adn($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cli $$0, btz $$1) {
      if (this.bR != this.bQ) {
         this.p();
      }

      this.gT();
      int $$2 = $$0.Z_();
      this.f.b(new adc(this.do, $$2, $$0.ao()));
      this.bR = new cwh(this.do, this.gi(), $$1, $$0, $$2);
      this.a(this.bR);
   }

   @Override
   public void a(czn $$0, buf $$1) {
      if ($$0.c(kk.V)) {
         if (dcx.a($$0, this.A(), this)) {
            this.bR.d();
         }

         this.f.b(new adr($$1));
      }
   }

   @Override
   public void a(dyc $$0) {
      this.f.b(aca.a($$0, dxr::e));
   }

   @Override
   public void p() {
      this.f.b(new acn(this.bR.l));
      this.q();
   }

   @Override
   public void q() {
      this.bR.a(this);
      this.bQ.a(this.bR);
      this.bR = this.bQ;
   }

   @Override
   public void r() {
      double $$0 = this.dz();
      double $$1 = this.dB();
      double $$2 = this.dF();
      super.r();
      this.q(this.dz() - $$0, this.dB() - $$1, this.dF() - $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      if (!this.bX() && !r($$0, $$1, $$2)) {
         if (this.ci()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(awx.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axh.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awx.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bh()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awx.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.d_()) {
            if ($$1 > 0.0) {
               this.a(awx.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aH()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.ch()) {
                  this.a(awx.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.cg()) {
                  this.a(awx.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awx.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fI()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awx.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awx.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bX() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bwi $$4 = this.dj();
         if ($$4 instanceof ctz) {
            this.a(awx.x, $$3);
         } else if ($$4 instanceof ctx) {
            this.a(awx.y, $$3);
         } else if ($$4 instanceof cju) {
            this.a(awx.z, $$3);
         } else if ($$4 instanceof cli) {
            this.a(awx.A, $$3);
         } else if ($$4 instanceof cpb) {
            this.a(awx.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awu<?> $$0, int $$1) {
      this.cy.b(this, $$0, $$1);
      this.gy().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awu<?> $$0) {
      this.cy.a(this, $$0, 0);
      this.gy().a($$0, this, fgf::c);
   }

   @Override
   public int a(Collection<dej<?>> $$0) {
      return this.cP.a($$0, this);
   }

   @Override
   public void a(dej<?> $$0, List<czn> $$1) {
      aq.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alf<dee<?>>> $$0) {
      List<dej<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dej<?>> $$0) {
      return this.cP.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(awx.E);
      if (this.ch()) {
         this.G(0.2F);
      } else {
         this.G(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cI = -1;
   }

   public void t() {
      this.cS = true;
      this.bM();
      if (this.fQ()) {
         this.a(true, false);
      }
   }

   public boolean u() {
      return this.cS;
   }

   @Override
   public void v() {
      this.cF = -1.0E8F;
   }

   @Override
   public void a(wy $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void K_() {
      if (!this.bm.f() && this.fy()) {
         this.f.b(new acx(this, (byte)9));
         super.K_();
      }
   }

   @Override
   public void a(ev.a $$0, ffc $$1) {
      super.a($$0, $$1);
      this.f.b(new aec($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(ev.a $$0, bwi $$1, ev.a $$2) {
      ffc $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new aec($$0, $$1, $$2));
   }

   public void a(arr $$0, boolean $$1) {
      this.df = $$0.df;
      this.dm = $$0.dm;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.eZ().b($$0.eZ());
         this.eZ().c($$0.eZ());
         this.d($$0.eF());
         this.bS = $$0.bS;

         for (bvm $$2 : $$0.eC()) {
            this.a(new bvm($$2));
         }

         this.gi().a($$0.gi());
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.q($$0.gc());
         this.as = $$0.as;
      } else {
         this.eZ().b($$0.eZ());
         this.d(this.eT());
         if (this.y().O().c(dji.e) || $$0.V_()) {
            this.gi().a($$0.gi());
            this.cf = $$0.cf;
            this.cg = $$0.cg;
            this.ch = $$0.ch;
            this.q($$0.gc());
         }
      }

      this.ci = $$0.ci;
      this.bP = $$0.bP;
      this.ar().a(bK, $$0.ar().a(bK));
      this.cI = -1;
      this.cF = -1.0F;
      this.cG = -1;
      this.cP.a($$0.cP);
      this.i = $$0.i;
      this.cW = $$0.cW;
      this.cZ = $$0.cZ;
      this.i($$0.gA());
      this.j($$0.gB());
      this.c($$0.gH());
   }

   @Override
   protected void a(bvm $$0, @Nullable bwi $$1) {
      super.a($$0, $$1);
      this.f.b(new agi(this.ao(), $$0, true));
      if ($$0.a(bvo.y)) {
         this.cR = this.af;
         this.cQ = this.ds();
      }

      aq.B.a(this, $$1);
   }

   @Override
   protected void a(bvm $$0, boolean $$1, @Nullable bwi $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new agi(this.ao(), $$0, false));
      aq.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bvm> $$0) {
      super.c($$0);

      for (bvm $$1 : $$0) {
         this.f.b(new aek(this.ao(), $$1.c()));
         if ($$1.a(bvo.y)) {
            this.cQ = null;
         }
      }

      aq.B.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.f.a(new bxw(new ffc($$0, $$1, $$2), ffc.c, 0.0F, 0.0F), bxx.a(bxx.l, bxx.k));
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bxw(new ffc($$0, $$1, $$2), ffc.c, 0.0F, 0.0F), bxx.j);
   }

   @Override
   public boolean a(arq $$0, double $$1, double $$2, double $$3, Set<bxx> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fQ()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.r($$4.contains(bxx.d) ? this.cz() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      super.d($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bwi $$0) {
      this.y().m().a(this, new abw($$0, 4));
   }

   @Override
   public void c(bwi $$0) {
      this.y().m().a(this, new abw($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new adv(this.gj()));
         this.K();
      }
   }

   public arq y() {
      return (arq)this.dU();
   }

   public boolean a(djj $$0) {
      boolean $$1 = this.V_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new adb(adb.e, (float)$$0.a()));
         if ($$0 == djj.d) {
            this.gx();
            this.bN();
            dgc.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dgc.a(this.y(), this);
            }
         }

         this.x();
         this.fw();
         return true;
      }
   }

   @Override
   public boolean V_() {
      return this.h.b() == djj.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == djj.b;
   }

   public ei z() {
      return this.dn;
   }

   public ej A() {
      return new ej(this.z(), this.ds(), this.bS(), this.y(), this.G(), this.ai().getString(), this.m_(), this.g, this);
   }

   public void a(wy $$0) {
      this.b($$0, false);
   }

   public void b(wy $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new afy($$0, $$1), wf.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wy $$3 = wy.b($$2).a(o.o);
               return new afy(wy.a("multiplayer.message_not_delivered", $$3).a(o.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xn $$0, boolean $$1, wu.a $$2) {
      if (this.gU()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(ara $$0) {
      this.cU = $$0.b();
      this.cT = $$0.c();
      this.cJ = $$0.d();
      this.cL = $$0.e();
      this.dc = $$0.h();
      this.dd = $$0.i();
      this.cK = $$0.j();
      this.ar().a(bK, (byte)$$0.f());
      this.ar().a(bL, (byte)$$0.g().b());
   }

   public ara C() {
      int $$0 = this.ar().a(bK);
      bxa $$1 = bxa.d.apply(this.ar().a(bL));
      return new ara(this.cU, this.cT, this.cJ, this.cL, $$0, $$1, this.dc, this.dd, this.cK);
   }

   public boolean D() {
      return this.cL;
   }

   public crj E() {
      return this.cJ;
   }

   private boolean x(boolean $$0) {
      return this.cJ == crj.c ? $$0 : true;
   }

   private boolean gU() {
      return this.cJ == crj.a;
   }

   public int F() {
      return this.cT;
   }

   public void a(akd $$0) {
      this.f.b(new aeq($$0.a(), $$0.d().map(akd.a::a)));
   }

   @Override
   public int G() {
      return this.g.c(this.gh());
   }

   public void H() {
      this.cM = ag.c();
   }

   public awt I() {
      return this.cy;
   }

   public aws J() {
      return this.cP;
   }

   @Override
   protected void K() {
      if (this.V_()) {
         this.eA();
         this.k(true);
      } else {
         super.K();
      }
   }

   public bwi L() {
      return (bwi)(this.cN == null ? this : this.cN);
   }

   @Override
   public void d(@Nullable bwi $$0) {
      bwi $$1 = this.L();
      this.cN = (bwi)($$0 == null ? this : $$0);
      if ($$1 != this.cN) {
         if (this.cN.dU() instanceof arq $$2) {
            this.a($$2, this.cN.dz(), this.cN.dB(), this.cN.dF(), Set.of(), this.dK(), this.dM(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new aex(this.cN));
         this.f.l();
      }
   }

   @Override
   protected void M() {
      if (!this.cO) {
         super.M();
      }
   }

   @Override
   public void e(bwi $$0) {
      if (this.h.b() == djj.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cM;
   }

   @Nullable
   public wy O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(buf $$0) {
      super.a($$0);
      this.gD();
   }

   public boolean Q() {
      return this.cO;
   }

   public void R() {
      this.cO = false;
   }

   public alo S() {
      return this.cx;
   }

   @Nullable
   public arr.a T() {
      return this.da;
   }

   public void b(arr $$0) {
      this.a($$0.da, false);
   }

   public void a(@Nullable arr.a $$0, boolean $$1) {
      if ($$1 && $$0 != null && !$$0.a(this.da)) {
         this.a(cw);
      }

      this.da = $$0;
   }

   public jy U() {
      return this.cY;
   }

   public void a(jy $$0) {
      this.cY = $$0;
   }

   public aqz V() {
      return this.cZ;
   }

   public void a(aqz $$0) {
      this.cZ = $$0;
   }

   @Override
   public void a(awm $$0, awo $$1, float $$2, float $$3) {
      this.f.b(new afv(mg.b.e($$0), $$1, this.dz(), this.dB(), this.dF(), $$2, $$3, this.ae.g()));
   }

   @Override
   public cnr a(czn $$0, boolean $$1, boolean $$2) {
      cnr $$3 = super.a($$0, $$1, $$2);
      if ($$2) {
         czn $$4 = $$3 != null ? $$3.f() : czn.k;
         if (!$$4.f()) {
            this.a(awx.f.b($$4.h()), $$0.M());
            this.a(awx.F);
         }
      }

      return $$3;
   }

   public asz W() {
      return this.db;
   }

   public void a(arq $$0) {
      this.a((djm)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static djj a(@Nullable tz $$0, String $$1) {
      return $$0 != null ? $$0.<djj>a($$1, djj.g).orElse(null) : null;
   }

   private djj b(@Nullable djj $$0) {
      djj $$1 = this.g.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.g.u();
      }
   }

   @Override
   public void c(@Nullable tz $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(tz $$0) {
      $$0.a("playerGameType", djj.g, this.h.b());
      djj $$1 = this.h.c();
      $$0.b("previousPlayerGameType", djj.g, $$1);
   }

   @Override
   public boolean X() {
      return this.dc;
   }

   public boolean c(arr $$0) {
      return $$0 == this ? false : this.dc || $$0.dc;
   }

   @Override
   public boolean c(arq $$0, iv $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(czn $$0) {
      aq.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      crl $$1 = this.gi();
      czn $$2 = $$1.a($$0);
      this.bR.b($$1, $$1.f()).ifPresent($$1x -> this.bR.a($$1x, $$1.g()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(czn $$0) {
      if (!this.gi().g($$0)) {
         this.a($$0, false);
      }
   }

   public boolean Y() {
      return this.dd;
   }

   @Override
   public Optional<cqr> Z() {
      return Optional.of(this.df);
   }

   public void b(boolean $$0) {
      this.de = $$0;
   }

   @Override
   public void a(cnr $$0) {
      super.a($$0);
      bwi $$1 = $$0.q();
      if ($$1 != null) {
         aq.S.a(this, $$0.f(), $$1);
      }
   }

   public void a(xp $$0) {
      this.dm = $$0;
   }

   @Nullable
   public xp aa() {
      return this.dm != null && this.dm.b() ? null : this.dm;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(azm.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dK());
      this.f.b(new add(this));
   }

   @Override
   public boolean a(bwi $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bxw(this.ds(), ffc.c, 0.0F, 0.0F), bxx.k);
         if ($$0 instanceof bxj $$2) {
            this.g.ag().a($$2, this.f);
         }

         this.f.b(new afl($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ab() {
      bwi $$0 = this.dj();
      super.ab();
      if ($$0 instanceof bxj $$1) {
         for (bvm $$2 : $$1.eC()) {
            this.f.b(new aek($$0.ao(), $$2.c()));
         }
      }

      if ($$0 != null) {
         this.f.b(new afl($$0));
      }
   }

   public agk b(arq $$0) {
      return new agk($$0.ai(), $$0.aj(), dkr.a($$0.E()), this.h.b(), this.h.c(), $$0.ak(), $$0.D(), this.gH(), this.az(), $$0.P());
   }

   @Override
   public void c(iv $$0) {
      this.dg = $$0;
   }

   public void ac() {
      this.dg = null;
   }

   @Nullable
   public iv ad() {
      return this.dg;
   }

   @Override
   public ffc ae() {
      bwi $$0 = this.dj();
      return $$0 != null && $$0.cV() != this ? $$0.ae() : this.dh;
   }

   public void a(ffc $$0) {
      this.dh = $$0;
   }

   @Override
   protected float a(bwi $$0, float $$1, bux $$2) {
      return dgc.a(this.y(), this.dY(), $$0, $$2, $$1);
   }

   @Override
   public void a(czj $$0, bws $$1) {
      super.a($$0, $$1);
      this.b(awx.d.b($$0));
   }

   public crk af() {
      return this.di;
   }

   public void a(crk $$0) {
      this.di = $$0;
   }

   public ffc ag() {
      float $$0 = this.di.c() == this.di.d() ? 0.0F : (this.di.c() ? 1.0F : -1.0F);
      float $$1 = this.di.a() == this.di.b() ? 0.0F : (this.di.a() ? 1.0F : -1.0F);
      return a(new ffc((double)$$0, 0.0, (double)$$1), 1.0F, this.dK());
   }

   public void a(csr $$0) {
      this.dj.add($$0);
   }

   public void b(csr $$0) {
      this.dj.remove($$0);
   }

   public Set<csr> ah() {
      return this.dj;
   }

   public long c(csr $$0) {
      if ($$0.dU() instanceof arq $$1) {
         dir $$2 = $$0.dw();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(arq $$0, dir $$1) {
      $$0.m().a(arx.h, $$1, 2);
      return arx.h.d();
   }

   public static record a(alf<djm> b, iv c, float d, boolean e) {
      public static final Codec<arr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  djm.h.optionalFieldOf("dimension", djm.i).forGetter(arr.a::a),
                  iv.a.fieldOf("pos").forGetter(arr.a::b),
                  Codec.FLOAT.optionalFieldOf("angle", 0.0F).forGetter(arr.a::c),
                  Codec.BOOL.optionalFieldOf("forced", false).forGetter(arr.a::d)
               )
               .apply($$0, arr.a::new)
      );

      static alf<djm> b(@Nullable arr.a $$0) {
         return $$0 != null ? $$0.a() : djm.i;
      }

      public boolean a(@Nullable arr.a $$0) {
         return $$0 != null && this.b == $$0.b && this.c.equals($$0.c);
      }

      public alf<djm> a() {
         return this.b;
      }

      public iv b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }
   }

   static record b(ffc a, float b) {
      public static arr.b a(ffc $$0, iv $$1) {
         return new arr.b($$0, b($$0, $$1));
      }

      private static float b(ffc $$0, iv $$1) {
         ffc $$2 = ffc.c($$1).d($$0).d();
         return (float)azm.d(azm.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
