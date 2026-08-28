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

public abstract class auj {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final wu e = wu.c("chat.filtered_full");
   public static final wu f = wu.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aqn> l = Lists.newArrayList();
   private final Map<UUID, aqn> m = Maps.newHashMap();
   private final aup n = new aup(a);
   private final aug o = new aug(b);
   private final auk p = new auk(c);
   private final aur q = new aur(d);
   private final Map<UUID, avn> r = Maps.newHashMap();
   private final Map<UUID, aks> s = Maps.newHashMap();
   private final eql t;
   private boolean u;
   private final jq<akt> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public auj(MinecraftServer $$0, jq<akt> $$1, eql $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(vp $$0, aqn $$1, arb $$2) {
      GameProfile $$3 = $$1.fY();
      auf $$4 = this.k.av();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<tx> $$8 = this.a($$1);
      akj<dcf> $$9 = $$8.<akj<dcf>>flatMap($$0x -> dwf.a(new Dynamic(ul.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(dcf.h);
      aqm $$10 = this.k.a($$9);
      aqm $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.J();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bo());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ag().getString(), $$13, $$1.am(), $$1.dv(), $$1.dx(), $$1.dB()});
      eqe $$14 = $$11.A_();
      $$1.c($$8.orElse(null));
      arm $$15 = new arm(this.k, $$0, $$1, $$2);
      $$0.a(aga.a.bind(wf.a(this.k.bd())), $$15);
      dcb $$16 = $$11.ab();
      boolean $$17 = $$16.b(dcb.D);
      boolean $$18 = $$16.b(dcb.q);
      boolean $$19 = $$16.b(dcb.w);
      $$15.b(new ade($$1.am(), $$14.l(), this.k.K(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11), this.k.aC()));
      $$15.b(new aca($$14.q(), $$14.r()));
      $$15.b(new adn($$1.ga()));
      $$15.b(new aen($$1.fZ().k));
      $$15.b(new afv(this.k.aK().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.ax();
      xi $$20;
      if ($$1.fY().getName().equalsIgnoreCase($$6)) {
         $$20 = wu.a("multiplayer.player.joined", $$1.O_());
      } else {
         $$20 = wu.a("multiplayer.player.joined.renamed", $$1.O_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dv(), $$1.dx(), $$1.dB(), $$1.dG(), $$1.dI());
      ajj $$22 = this.k.aw();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.c.b(adt.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cA(), $$1);
      this.a(adt.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aO().a($$1);

      for (bro $$23 : $$1.eu()) {
         $$15.b(new afu($$1.am(), $$23, false));
      }

      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         tx $$24 = $$8.get().p("RootVehicle");
         bsg $$25 = bsm.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.cA().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (bsg $$28 : $$25.cX()) {
                  if ($$28.cA().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bS()) {
               h.warn("Couldn't reattach entity to player");
               $$25.ap();

               for (bsg $$29 : $$25.cX()) {
                  $$29.ap();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(alc $$0, aqn $$1) {
      Set<exb> $$2 = Sets.newHashSet();

      for (exe $$3 : $$0.g()) {
         $$1.c.b(afa.a($$3, true));
      }

      for (exa $$4 : exa.values()) {
         exb $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zb<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(aqm $$0) {
      $$0.C_().a(new dtz() {
         @Override
         public void a(dub $$0, double $$1) {
            auj.this.a(new aej($$0));
         }

         @Override
         public void a(dub $$0, double $$1, double $$2, long $$3) {
            auj.this.a(new aei($$0));
         }

         @Override
         public void a(dub $$0, double $$1, double $$2) {
            auj.this.a(new aeh($$0));
         }

         @Override
         public void a(dub $$0, int $$1) {
            auj.this.a(new aek($$0));
         }

         @Override
         public void b(dub $$0, int $$1) {
            auj.this.a(new ael($$0));
         }

         @Override
         public void b(dub $$0, double $$1) {
         }

         @Override
         public void c(dub $$0, double $$1) {
         }
      });
   }

   public Optional<tx> a(aqn $$0) {
      tx $$1 = this.k.bc().w();
      Optional<tx> $$2;
      if (this.k.a($$0.fY()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(aqn $$0) {
      this.t.a($$0);
      avn $$1 = this.r.get($$0.cA());
      if ($$1 != null) {
         $$1.a();
      }

      aks $$2 = this.s.get($$0.cA());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aqn $$0) {
      aqm $$1 = $$0.z();
      $$0.a(avr.j);
      this.b($$0);
      if ($$0.bS()) {
         bsg $$2 = $$0.da();
         if ($$2.cZ()) {
            h.debug("Removing player mount");
            $$0.ac();
            $$2.cW().forEach($$0x -> $$0x.b(bsg.c.d));
         }
      }

      $$0.aj();
      $$1.a($$0, bsg.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aO().b($$0);
      UUID $$3 = $$0.cA();
      aqn $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new ads(List.of($$0.cA())));
   }

   @Nullable
   public wu a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         auq $$2 = this.n.b($$1);
         xi $$3 = wu.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(wu.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return wu.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         auh $$4 = this.o.b($$0);
         xi $$5 = wu.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(wu.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? wu.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aqn a(GameProfile $$0, apz $$1) {
      return new aqn(this.k, this.k.J(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aqn> $$2 = Sets.newIdentityHashSet();

      for (aqn $$3 : this.l) {
         if ($$3.cA().equals($$1)) {
            $$2.add($$3);
         }
      }

      aqn $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aqn $$5 : $$2) {
         $$5.c.b(f);
      }

      return !$$2.isEmpty();
   }

   public aqn a(aqn $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, bsg.c.b);
      ja $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      aqm $$5 = this.k.a($$0.T());
      Optional<ewf> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cmk.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      aqm $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.J();
      aqn $$9 = new aqn(this.k, $$8, $$0.fY(), $$0.B());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.am());
      $$9.a($$0.fr());

      for (String $$10 : $$0.an()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dsk $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(dfj.pl);
         ewf $$14 = $$6.get();
         float $$17;
         if (!$$12.a(avw.R) && !$$13) {
            $$17 = $$3;
         } else {
            ewf $$15 = ewf.c($$2).d($$14).d();
            $$17 = (float)ayg.d(ayg.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.af(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new acu(acu.b, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dx() < (double)$$8.am()) {
         $$9.a_($$9.dv(), $$9.dx() + 1.0, $$9.dB());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      aqm $$19 = $$9.z();
      eqe $$20 = $$19.A_();
      $$9.c.b(new aeb($$9.d($$19), $$18));
      $$9.c.a($$9.dv(), $$9.dx(), $$9.dB(), $$9.dG(), $$9.dI());
      $$9.c.b(new aeq($$8.V(), $$8.W()));
      $$9.c.b(new aca($$20.q(), $$20.r()));
      $$9.c.b(new aew($$9.cs, $$9.cr, $$9.cq));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cA(), $$9);
      $$9.h();
      $$9.u($$9.ex());
      if ($$11) {
         $$9.c.b(new afi(avh.vy, avi.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.E_().g()));
      }

      return $$9;
   }

   public void d(aqn $$0) {
      GameProfile $$1 = $$0.fY();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new adt(EnumSet.of(adt.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zb<?> $$0) {
      for (aqn $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(zb<?> $$0, akj<dcf> $$1) {
      for (aqn $$2 : this.l) {
         if ($$2.dQ().af() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cmk $$0, wu $$1) {
      exl $$2 = $$0.ck();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aqn $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cmk $$0, wu $$1) {
      exl $$2 = $$0.ck();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aqn $$4 = this.l.get($$3);
            if ($$4.ck() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fY().getName();
      }

      return $$0;
   }

   public aup f() {
      return this.n;
   }

   public aug g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aul($$0, this.k.k(), this.p.a($$0)));
      aqn $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      aqn $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(aqn $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new acr($$0, $$2));
      }

      this.k.aI().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.bc().m() || this.y;
   }

   @Nullable
   public aqn a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         aqn $$3 = this.l.get($$2);
         if ($$3.fY().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cmk $$0, double $$1, double $$2, double $$3, double $$4, akj<dcf> $$5, zb<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aqn $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dQ().af() == $$5) {
            double $$9 = $$1 - $$8.dv();
            double $$10 = $$2 - $$8.dx();
            double $$11 = $$3 - $$8.dB();
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

   public aur i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public auk k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aqn $$0, aqm $$1) {
      dub $$2 = this.k.J().C_();
      $$0.c.b(new acx($$2));
      $$0.c.b(new afe($$1.Z(), $$1.aa(), $$1.ab().b(dcb.l)));
      $$0.c.b(new aeq($$1.V(), $$1.W()));
      if ($$1.ad()) {
         $$0.c.b(new acu(acu.c, 0.0F));
         $$0.c.b(new acu(acu.i, $$1.d(1.0F)));
         $$0.c.b(new acu(acu.j, $$1.b(1.0F)));
      }

      $$0.c.b(new acu(acu.o, 0.0F));
      this.k.aR().a($$0);
   }

   public void e(aqn $$0) {
      $$0.cc.b();
      $$0.w();
      $$0.c.b(new aen($$0.fZ().k));
   }

   public int m() {
      return this.l.size();
   }

   public int n() {
      return this.g;
   }

   public boolean o() {
      return this.u;
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public List<aqn> b(String $$0) {
      List<aqn> $$1 = Lists.newArrayList();

      for (aqn $$2 : this.l) {
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
   public tx r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(wu.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(wu $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(wu $$0, Function<aqn, wu> $$1, boolean $$2) {
      this.k.a($$0);

      for (aqn $$3 : this.l) {
         wu $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xk $$0, eq $$1, wq.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xk $$0, aqn $$1, wq.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(xk $$0, Predicate<aqn> $$1, @Nullable aqn $$2, wq.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xj $$5 = xj.a($$0);
      boolean $$6 = false;

      for (aqn $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xk $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public avn a(cmk $$0) {
      UUID $$1 = $$0.cA();
      avn $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(eqg.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ag().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new avn(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public aks f(aqn $$0) {
      UUID $$1 = $$0.cA();
      aks $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(eqg.a).resolve($$1 + ".json");
         $$2 = new aks(this.k.aE(), this, this.k.aF(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aep($$0));

      for (aqm $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afc($$0));

      for (aqm $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<aqn> t() {
      return this.l;
   }

   @Nullable
   public aqn a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (aks $$0 : this.s.values()) {
         $$0.a(this.k.aF());
      }

      this.a(new zq(awp.a(this.v)));
      afv $$1 = new afv(this.k.aK().b());

      for (aqn $$2 : this.l) {
         $$2.c.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
