import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.io.File;
import java.net.SocketAddress;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class apu {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final ur f = ur.c("chat.filtered_full");
   public static final ur g = ur.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<amf> l = Lists.newArrayList();
   private final Map<UUID, amf> m = Maps.newHashMap();
   private final aqa n = new aqa(b);
   private final apr o = new apr(c);
   private final apv p = new apv(d);
   private final aqc q = new aqc(e);
   private final Map<UUID, aqx> r = Maps.newHashMap();
   private final Map<UUID, agq> s = Maps.newHashMap();
   private final eeq t;
   private boolean u;
   private final ij<agr> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public apu(MinecraftServer $$0, ij<agr> $$1, eeq $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(ts $$0, amf $$1, amt $$2) {
      GameProfile $$3 = $$1.fS();
      apq $$4 = this.k.ar();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      rz $$8 = this.a($$1);
      agh<csa> $$9 = $$8 != null ? dkr.a(new Dynamic(sn.a, $$8.c("Dimension"))).resultOrPartial(a::error).orElse(csa.h) : csa.h;
      ame $$10 = this.k.a($$9);
      ame $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.F();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bj());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ad().getString(), $$13, $$1.aj(), $$1.ds(), $$1.du(), $$1.dy()});
      eej $$14 = $$11.A_();
      $$1.c($$8);
      and $$15 = new and(this.k, $$0, $$1, $$2);
      crw $$16 = $$11.Y();
      boolean $$17 = $$16.b(crw.D);
      boolean $$18 = $$16.b(crw.q);
      boolean $$19 = $$16.b(crw.w);
      $$15.b(new zs($$1.aj(), $$14.n(), this.k.G(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11)));
      $$15.b(new yp($$14.s(), $$14.t()));
      $$15.b(new aab($$1.fU()));
      $$15.b(new aaz($$1.fT().l));
      $$15.b(new ach(this.k.aG().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.at();
      vf $$20;
      if ($$1.fS().getName().equalsIgnoreCase($$6)) {
         $$20 = ur.a("multiplayer.player.joined", $$1.P_());
      } else {
         $$20 = ur.a("multiplayer.player.joined.renamed", $$1.P_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.ds(), $$1.du(), $$1.dy(), $$1.dD(), $$1.dF());
      afj $$22 = this.k.as();
      if ($$22 != null) {
         $$1.a($$22);
      }

      $$1.c.b(aah.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cw(), $$1);
      this.a(aah.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aL().a($$1);

      for (bkd $$23 : $$1.et()) {
         $$15.b(new acg($$1.aj(), $$23));
      }

      if ($$8 != null && $$8.b("RootVehicle", 10)) {
         rz $$24 = $$8.p("RootVehicle");
         bkq $$25 = bku.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.cw().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (bkq $$28 : $$25.cU()) {
                  if ($$28.cw().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bO()) {
               a.warn("Couldn't reattach entity to player");
               $$25.am();

               for (bkq $$29 : $$25.cU()) {
                  $$29.am();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(agz $$0, amf $$1) {
      Set<ekq> $$2 = Sets.newHashSet();

      for (ekr $$3 : $$0.g()) {
         $$1.c.b(abm.a($$3, true));
      }

      for (ekp $$4 : ekp.values()) {
         ekq $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (wk<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(ame $$0) {
      $$0.C_().a(new dix() {
         @Override
         public void a(diz $$0, double $$1) {
            apu.this.a(new aav($$0));
         }

         @Override
         public void a(diz $$0, double $$1, double $$2, long $$3) {
            apu.this.a(new aau($$0));
         }

         @Override
         public void a(diz $$0, double $$1, double $$2) {
            apu.this.a(new aat($$0));
         }

         @Override
         public void a(diz $$0, int $$1) {
            apu.this.a(new aaw($$0));
         }

         @Override
         public void b(diz $$0, int $$1) {
            apu.this.a(new aax($$0));
         }

         @Override
         public void b(diz $$0, double $$1) {
         }

         @Override
         public void c(diz $$0, double $$1) {
         }
      });
   }

   @Nullable
   public rz a(amf $$0) {
      rz $$1 = this.k.aY().y();
      rz $$2;
      if (this.k.a($$0.fS()) && $$1 != null) {
         $$2 = $$1;
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(amf $$0) {
      this.t.a($$0);
      aqx $$1 = this.r.get($$0.cw());
      if ($$1 != null) {
         $$1.a();
      }

      agq $$2 = this.s.get($$0.cw());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(amf $$0) {
      ame $$1 = $$0.z();
      $$0.a(arb.j);
      this.b($$0);
      if ($$0.bO()) {
         bkq $$2 = $$0.cX();
         if ($$2.cW()) {
            a.debug("Removing player mount");
            $$0.ac();
            $$2.cT().forEach($$0x -> $$0x.b(bkq.c.d));
         }
      }

      $$0.ag();
      $$1.a($$0, bkq.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aL().b($$0);
      UUID $$3 = $$0.cw();
      amf $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new aag(List.of($$0.cw())));
   }

   @Nullable
   public ur a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         aqb $$2 = this.n.b($$1);
         vf $$3 = ur.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(ur.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return ur.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         aps $$4 = this.o.b($$0);
         vf $$5 = ur.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(ur.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? ur.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public amf a(GameProfile $$0, alt $$1) {
      return new amf(this.k, this.k.F(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<amf> $$2 = Sets.newIdentityHashSet();

      for (amf $$3 : this.l) {
         if ($$3.cw().equals($$1)) {
            $$2.add($$3);
         }
      }

      amf $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (amf $$5 : $$2) {
         $$5.c.b(g);
      }

      return !$$2.isEmpty();
   }

   public amf a(amf $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, bkq.c.b);
      ht $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      ame $$5 = this.k.a($$0.T());
      Optional<eju> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cdu.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      ame $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.F();
      amf $$9 = new amf(this.k, $$8, $$0.fS(), $$0.B());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.aj());
      $$9.a($$0.fn());

      for (String $$10 : $$0.ak()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dhi $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(cvc.pl);
         eju $$14 = $$6.get();
         float $$17;
         if (!$$12.a(arg.R) && !$$13) {
            $$17 = $$3;
         } else {
            eju $$15 = eju.c($$2).d($$14).d();
            $$17 = (float)atm.d(atm.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ad(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new zi(zi.a, 0.0F));
      }

      while (!$$8.g($$9) && $$9.du() < (double)$$8.ak()) {
         $$9.a_($$9.ds(), $$9.du() + 1.0, $$9.dy());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      ame $$19 = $$9.z();
      eej $$20 = $$19.A_();
      $$9.c.b(new aan($$9.d($$19), $$18));
      $$9.c.a($$9.ds(), $$9.du(), $$9.dy(), $$9.dD(), $$9.dF());
      $$9.c.b(new abc($$8.S(), $$8.T()));
      $$9.c.b(new yp($$20.s(), $$20.t()));
      $$9.c.b(new abi($$9.ch, $$9.cg, $$9.cf));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cw(), $$9);
      $$9.h();
      $$9.c($$9.ew());
      if ($$11) {
         $$9.c.b(new abu(aqr.ug, aqs.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.E_().g()));
      }

      return $$9;
   }

   public void d(amf $$0) {
      GameProfile $$1 = $$0.fS();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aah(EnumSet.of(aah.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(wk<?> $$0) {
      for (amf $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(wk<?> $$0, agh<csa> $$1) {
      for (amf $$2 : this.l) {
         if ($$2.dN().ad() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cdu $$0, ur $$1) {
      ekv $$2 = $$0.cg();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            amf $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cdu $$0, ur $$1) {
      ekv $$2 = $$0.cg();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            amf $$4 = this.l.get($$3);
            if ($$4.cg() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fS().getName();
      }

      return $$0;
   }

   public aqa f() {
      return this.n;
   }

   public apr g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new apw($$0, this.k.i(), this.p.a($$0)));
      amf $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      amf $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(amf $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new zf($$0, $$2));
      }

      this.k.aE().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.aY().o() || this.y;
   }

   @Nullable
   public amf a(String $$0) {
      for (amf $$1 : this.l) {
         if ($$1.fS().getName().equalsIgnoreCase($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(@Nullable cdu $$0, double $$1, double $$2, double $$3, double $$4, agh<csa> $$5, wk<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         amf $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dN().ad() == $$5) {
            double $$9 = $$1 - $$8.ds();
            double $$10 = $$2 - $$8.du();
            double $$11 = $$3 - $$8.dy();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.c.b($$6);
            }
         }
      }
   }

   public void h() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.b(this.l.get($$0));
      }
   }

   public aqc i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public apv k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(amf $$0, ame $$1) {
      diz $$2 = this.k.F().C_();
      $$0.c.b(new zl($$2));
      $$0.c.b(new abq($$1.W(), $$1.X(), $$1.Y().b(crw.l)));
      $$0.c.b(new abc($$1.S(), $$1.T()));
      if ($$1.aa()) {
         $$0.c.b(new zi(zi.b, 0.0F));
         $$0.c.b(new zi(zi.h, $$1.d(1.0F)));
         $$0.c.b(new zi(zi.i, $$1.b(1.0F)));
      }

      $$0.c.b(new zi(zi.n, 0.0F));
      this.k.aO().a($$0);
   }

   public void e(amf $$0) {
      $$0.bR.b();
      $$0.w();
      $$0.c.b(new aaz($$0.fT().l));
   }

   public int m() {
      return this.l.size();
   }

   public int n() {
      return this.h;
   }

   public boolean o() {
      return this.u;
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public List<amf> b(String $$0) {
      List<amf> $$1 = Lists.newArrayList();

      for (amf $$2 : this.l) {
         if ($$2.A().equals($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public int p() {
      return this.w;
   }

   public int q() {
      return this.x;
   }

   public MinecraftServer c() {
      return this.k;
   }

   @Nullable
   public rz r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(ur.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(ur $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(ur $$0, Function<amf, ur> $$1, boolean $$2) {
      this.k.a($$0);

      for (amf $$3 : this.l) {
         ur $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(vh $$0, du $$1, un.a $$2) {
      this.a($$0, $$1::a, $$1.j(), $$2);
   }

   public void a(vh $$0, amf $$1, un.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(vh $$0, Predicate<amf> $$1, @Nullable amf $$2, un.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.c(), $$3, $$4 ? null : "Not Secure");
      vg $$5 = vg.a($$0);
      boolean $$6 = false;

      for (amf $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.i();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(vh $$0) {
      return $$0.h() && !$$0.a(Instant.now());
   }

   public aqx a(cdu $$0) {
      UUID $$1 = $$0.cw();
      aqx $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(eel.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ad().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new aqx(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public agq f(amf $$0) {
      UUID $$1 = $$0.cw();
      agq $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(eel.a).resolve($$1 + ".json");
         $$2 = new agq(this.k.aA(), this, this.k.aB(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new abb($$0));

      for (ame $$1 : this.k.H()) {
         if ($$1 != null) {
            $$1.k().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new abo($$0));

      for (ame $$1 : this.k.H()) {
         if ($$1 != null) {
            $$1.k().b($$0);
         }
      }
   }

   public List<amf> t() {
      return this.l;
   }

   @Nullable
   public amf a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (agq $$0 : this.s.values()) {
         $$0.a(this.k.aB());
      }

      this.a(new wt(ary.a(this.v)));
      ach $$1 = new ach(this.k.aG().b());

      for (amf $$2 : this.l) {
         $$2.c.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
