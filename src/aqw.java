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

public abstract class aqw {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final vg f = vg.c("chat.filtered_full");
   public static final vg g = vg.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<anf> l = Lists.newArrayList();
   private final Map<UUID, anf> m = Maps.newHashMap();
   private final arc n = new arc(b);
   private final aqt o = new aqt(c);
   private final aqx p = new aqx(d);
   private final are q = new are(e);
   private final Map<UUID, arz> r = Maps.newHashMap();
   private final Map<UUID, ahp> s = Maps.newHashMap();
   private final egy t;
   private boolean u;
   private final io<ahq> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public aqw(MinecraftServer $$0, io<ahq> $$1, egy $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(uh $$0, anf $$1, ant $$2) {
      GameProfile $$3 = $$1.fR();
      aqs $$4 = this.k.ar();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<so> $$8 = this.a($$1);
      ahg<ctx> $$9 = $$8.<ahg<ctx>>flatMap($$0x -> dmy.a(new Dynamic(tc.a, $$0x.c("Dimension"))).resultOrPartial(a::error)).orElse(ctx.h);
      ane $$10 = this.k.a($$9);
      ane $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.F();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bj());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ad().getString(), $$13, $$1.aj(), $$1.dq(), $$1.ds(), $$1.dw()});
      egr $$14 = $$11.B_();
      $$1.c($$8.orElse(null));
      aod $$15 = new aod(this.k, $$0, $$1, $$2);
      ctt $$16 = $$11.Z();
      boolean $$17 = $$16.b(ctt.D);
      boolean $$18 = $$16.b(ctt.q);
      boolean $$19 = $$16.b(ctt.w);
      $$15.b(new aaq($$1.aj(), $$14.n(), this.k.G(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11)));
      $$15.b(new zn($$14.s(), $$14.t()));
      $$15.b(new aaz($$1.fT()));
      $$15.b(new aby($$1.fS().l));
      $$15.b(new adg(this.k.aG().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.at();
      vu $$20;
      if ($$1.fR().getName().equalsIgnoreCase($$6)) {
         $$20 = vg.a("multiplayer.player.joined", $$1.Q_());
      } else {
         $$20 = vg.a("multiplayer.player.joined.renamed", $$1.Q_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dq(), $$1.ds(), $$1.dw(), $$1.dB(), $$1.dD());
      agi $$22 = this.k.as();
      if ($$22 != null) {
         $$1.a($$22);
      }

      $$1.c.b(abf.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cw(), $$1);
      this.a(abf.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aL().a($$1);

      for (blj $$23 : $$1.es()) {
         $$15.b(new adf($$1.aj(), $$23, false));
      }

      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         so $$24 = $$8.get().p("RootVehicle");
         blw $$25 = bmc.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
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
               for (blw $$28 : $$25.cT()) {
                  if ($$28.cw().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bO()) {
               a.warn("Couldn't reattach entity to player");
               $$25.am();

               for (blw $$29 : $$25.cT()) {
                  $$29.am();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(ahy $$0, anf $$1) {
      Set<emy> $$2 = Sets.newHashSet();

      for (enb $$3 : $$0.g()) {
         $$1.c.b(acl.a($$3, true));
      }

      for (emx $$4 : emx.values()) {
         emy $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (xg<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(ane $$0) {
      $$0.D_().a(new dle() {
         @Override
         public void a(dlg $$0, double $$1) {
            aqw.this.a(new abu($$0));
         }

         @Override
         public void a(dlg $$0, double $$1, double $$2, long $$3) {
            aqw.this.a(new abt($$0));
         }

         @Override
         public void a(dlg $$0, double $$1, double $$2) {
            aqw.this.a(new abs($$0));
         }

         @Override
         public void a(dlg $$0, int $$1) {
            aqw.this.a(new abv($$0));
         }

         @Override
         public void b(dlg $$0, int $$1) {
            aqw.this.a(new abw($$0));
         }

         @Override
         public void b(dlg $$0, double $$1) {
         }

         @Override
         public void c(dlg $$0, double $$1) {
         }
      });
   }

   public Optional<so> a(anf $$0) {
      so $$1 = this.k.aY().y();
      Optional<so> $$2;
      if (this.k.a($$0.fR()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(anf $$0) {
      this.t.a($$0);
      arz $$1 = this.r.get($$0.cw());
      if ($$1 != null) {
         $$1.a();
      }

      ahp $$2 = this.s.get($$0.cw());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(anf $$0) {
      ane $$1 = $$0.z();
      $$0.a(asd.j);
      this.b($$0);
      if ($$0.bO()) {
         blw $$2 = $$0.cW();
         if ($$2.cV()) {
            a.debug("Removing player mount");
            $$0.ac();
            $$2.cS().forEach($$0x -> $$0x.b(blw.c.d));
         }
      }

      $$0.ag();
      $$1.a($$0, blw.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aL().b($$0);
      UUID $$3 = $$0.cw();
      anf $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new abe(List.of($$0.cw())));
   }

   @Nullable
   public vg a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         ard $$2 = this.n.b($$1);
         vu $$3 = vg.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(vg.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return vg.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         aqu $$4 = this.o.b($$0);
         vu $$5 = vg.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(vg.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? vg.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public anf a(GameProfile $$0, amt $$1) {
      return new anf(this.k, this.k.F(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<anf> $$2 = Sets.newIdentityHashSet();

      for (anf $$3 : this.l) {
         if ($$3.cw().equals($$1)) {
            $$2.add($$3);
         }
      }

      anf $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (anf $$5 : $$2) {
         $$5.c.b(g);
      }

      return !$$2.isEmpty();
   }

   public anf a(anf $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, blw.c.b);
      hx $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      ane $$5 = this.k.a($$0.T());
      Optional<emc> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cfq.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      ane $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.F();
      anf $$9 = new anf(this.k, $$8, $$0.fR(), $$0.B());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.aj());
      $$9.a($$0.fm());

      for (String $$10 : $$0.ak()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         djp $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(cxa.pl);
         emc $$14 = $$6.get();
         float $$17;
         if (!$$12.a(asi.R) && !$$13) {
            $$17 = $$3;
         } else {
            emc $$15 = emc.c($$2).d($$14).d();
            $$17 = (float)aup.d(aup.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ae(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new aag(aag.a, 0.0F));
      }

      while (!$$8.g($$9) && $$9.ds() < (double)$$8.al()) {
         $$9.a_($$9.dq(), $$9.ds() + 1.0, $$9.dw());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      ane $$19 = $$9.z();
      egr $$20 = $$19.B_();
      $$9.c.b(new abm($$9.d($$19), $$18));
      $$9.c.a($$9.dq(), $$9.ds(), $$9.dw(), $$9.dB(), $$9.dD());
      $$9.c.b(new acb($$8.T(), $$8.U()));
      $$9.c.b(new zn($$20.s(), $$20.t()));
      $$9.c.b(new ach($$9.cl, $$9.ck, $$9.cj));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cw(), $$9);
      $$9.h();
      $$9.c($$9.ev());
      if ($$11) {
         $$9.c.b(new act(art.uQ, aru.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.F_().g()));
      }

      return $$9;
   }

   public void d(anf $$0) {
      GameProfile $$1 = $$0.fR();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new abf(EnumSet.of(abf.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(xg<?> $$0) {
      for (anf $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(xg<?> $$0, ahg<ctx> $$1) {
      for (anf $$2 : this.l) {
         if ($$2.dL().ae() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cfq $$0, vg $$1) {
      eni $$2 = $$0.cg();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            anf $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cfq $$0, vg $$1) {
      eni $$2 = $$0.cg();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            anf $$4 = this.l.get($$3);
            if ($$4.cg() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fR().getName();
      }

      return $$0;
   }

   public arc f() {
      return this.n;
   }

   public aqt g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aqy($$0, this.k.i(), this.p.a($$0)));
      anf $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      anf $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(anf $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new aad($$0, $$2));
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
   public anf a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         anf $$3 = this.l.get($$2);
         if ($$3.fR().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cfq $$0, double $$1, double $$2, double $$3, double $$4, ahg<ctx> $$5, xg<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         anf $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dL().ae() == $$5) {
            double $$9 = $$1 - $$8.dq();
            double $$10 = $$2 - $$8.ds();
            double $$11 = $$3 - $$8.dw();
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

   public are i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public aqx k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(anf $$0, ane $$1) {
      dlg $$2 = this.k.F().D_();
      $$0.c.b(new aaj($$2));
      $$0.c.b(new acp($$1.X(), $$1.Y(), $$1.Z().b(ctt.l)));
      $$0.c.b(new acb($$1.T(), $$1.U()));
      if ($$1.ab()) {
         $$0.c.b(new aag(aag.b, 0.0F));
         $$0.c.b(new aag(aag.h, $$1.d(1.0F)));
         $$0.c.b(new aag(aag.i, $$1.b(1.0F)));
      }

      $$0.c.b(new aag(aag.n, 0.0F));
      this.k.aO().a($$0);
   }

   public void e(anf $$0) {
      $$0.bV.b();
      $$0.w();
      $$0.c.b(new aby($$0.fS().l));
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

   public List<anf> b(String $$0) {
      List<anf> $$1 = Lists.newArrayList();

      for (anf $$2 : this.l) {
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
   public so r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(vg.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(vg $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(vg $$0, Function<anf, vg> $$1, boolean $$2) {
      this.k.a($$0);

      for (anf $$3 : this.l) {
         vg $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(vw $$0, ds $$1, vc.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(vw $$0, anf $$1, vc.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(vw $$0, Predicate<anf> $$1, @Nullable anf $$2, vc.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      vv $$5 = vv.a($$0);
      boolean $$6 = false;

      for (anf $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(vw $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public arz a(cfq $$0) {
      UUID $$1 = $$0.cw();
      arz $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(egt.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ad().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new arz(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public ahp f(anf $$0) {
      UUID $$1 = $$0.cw();
      ahp $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(egt.a).resolve($$1 + ".json");
         $$2 = new ahp(this.k.aA(), this, this.k.aB(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aca($$0));

      for (ane $$1 : this.k.H()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new acn($$0));

      for (ane $$1 : this.k.H()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<anf> t() {
      return this.l;
   }

   @Nullable
   public anf a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (ahp $$0 : this.s.values()) {
         $$0.a(this.k.aB());
      }

      this.a(new xq(ata.a(this.v)));
      adg $$1 = new adg(this.k.aG().b());

      for (anf $$2 : this.l) {
         $$2.c.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
