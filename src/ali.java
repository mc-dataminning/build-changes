import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.net.SocketAddress;
import java.time.Instant;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ali extends alf implements aaw, all, su {
   static final Logger g = LogUtils.getLogger();
   public static final double d = arp.k(6.0);
   private static final int h = -1;
   private static final int i = 4096;
   private static final tf j = tf.c("multiplayer.disconnect.chat_validation_failed");
   public akl e;
   public final ale f;
   private int k;
   private int l = -1;
   private int m;
   private int n;
   private double o;
   private double p;
   private double q;
   private double r;
   private double s;
   private double t;
   @Nullable
   private bii u;
   private double v;
   private double w;
   private double x;
   private double y;
   private double z;
   private double A;
   @Nullable
   private ehd B;
   private int C;
   private int D;
   private boolean E;
   private int F;
   private boolean G;
   private int H;
   private int I;
   private int J;
   private final AtomicReference<Instant> K = new AtomicReference<>(Instant.EPOCH);
   @Nullable
   private tv L;
   private ty.b M;
   private final tn N = new tn(20);
   private final tr O = tr.a();
   private final are P;
   private boolean Q;

   public ali(MinecraftServer $$0, sg $$1, akl $$2, int $$3) {
      super($$0, $$1, $$3);
      this.f = new ale($$1.g());
      $$1.a(this);
      this.e = $$2;
      $$2.c = this;
      $$2.V().a();
      this.M = $$0.aw() ? ty.b.a : ty.b.unsigned($$2.cv());
      this.P = new are($$0);
   }

   @Override
   public void e() {
      if (this.l > -1) {
         this.b(new wv(this.l));
         this.l = -1;
      }

      this.m();
      this.e.K = this.e.dp();
      this.e.L = this.e.dr();
      this.e.M = this.e.dv();
      this.e.m();
      this.e.a(this.o, this.p, this.q, this.e.dA(), this.e.dC());
      this.k++;
      this.J = this.I;
      if (this.E && !this.e.fB() && !this.e.bN() && !this.e.eu()) {
         if (++this.F > 80) {
            g.warn("{} was kicked for floating too long!", this.e.ab().getString());
            this.b(tf.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.E = false;
         this.F = 0;
      }

      this.u = this.e.cV();
      if (this.u != this.e && this.u.cN() == this.e) {
         this.v = this.u.dp();
         this.w = this.u.dr();
         this.x = this.u.dv();
         this.y = this.u.dp();
         this.z = this.u.dr();
         this.A = this.u.dv();
         if (this.G && this.e.cV().cN() == this.e) {
            if (++this.H > 80) {
               g.warn("{} was kicked for floating a vehicle too long!", this.e.ab().getString());
               this.b(tf.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.G = false;
            this.H = 0;
         }
      } else {
         this.u = null;
         this.G = false;
         this.H = 0;
      }

      this.f();
      if (this.m > 0) {
         this.m--;
      }

      if (this.n > 0) {
         this.n--;
      }

      if (this.e.J() > 0L && this.b.al() > 0 && ac.b() - this.e.J() > (long)this.b.al() * 1000L * 60L) {
         this.b(tf.c("multiplayer.disconnect.idling"));
      }
   }

   public void m() {
      this.o = this.e.dp();
      this.p = this.e.dr();
      this.q = this.e.dv();
      this.r = this.e.dp();
      this.s = this.e.dr();
      this.t = this.e.dv();
   }

   @Override
   public boolean c() {
      return this.c.k() && !this.Q;
   }

   @Override
   public boolean a(ux<?> $$0) {
      return super.a($$0) ? true : this.Q && this.c.k() && $$0 instanceof abk;
   }

   @Override
   protected GameProfile j() {
      return this.e.fP();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<aln, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.e.V(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            g.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<ala> a(String $$0) {
      return this.a($$0, aln::a);
   }

   private CompletableFuture<List<ala>> a(List<String> $$0) {
      return this.a($$0, aln::a);
   }

   @Override
   public void a(acb $$0) {
      uz.a($$0, this, this.e.x());
      this.e.a($$0.a(), $$0.d(), $$0.e(), $$0.f());
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return arp.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return arp.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(abu $$0) {
      uz.a($$0, this, this.e.x());
      if (b($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g())) {
         this.b(tf.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         bii $$1 = this.e.cV();
         if ($$1 != this.e && $$1.cN() == this.e && $$1 == this.u) {
            akk $$2 = this.e.x();
            double $$3 = $$1.dp();
            double $$4 = $$1.dr();
            double $$5 = $$1.dv();
            double $$6 = a($$0.a());
            double $$7 = b($$0.d());
            double $$8 = a($$0.e());
            float $$9 = arp.g($$0.f());
            float $$10 = arp.g($$0.g());
            double $$11 = $$6 - this.v;
            double $$12 = $$7 - this.w;
            double $$13 = $$8 - this.x;
            double $$14 = $$1.dn().g();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.i()) {
               g.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.ab().getString(), this.e.ab().getString(), $$11, $$12, $$13});
               this.b(new yj($$1));
               return;
            }

            boolean $$16 = $$2.a($$1, $$1.cG().h(0.0625));
            $$11 = $$6 - this.y;
            $$12 = $$7 - this.z - 1.0E-6;
            $$13 = $$8 - this.A;
            boolean $$17 = $$1.R;
            if ($$1 instanceof biy $$18 && $$18.j_()) {
               $$18.n();
            }

            $$1.a(bje.b, new ehd($$11, $$12, $$13));
            $$11 = $$6 - $$1.dp();
            $$12 = $$7 - $$1.dr();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dv();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               g.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.ab().getString(), this.e.ab().getString(), Math.sqrt($$15)});
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            boolean $$21 = $$2.a($$1, $$1.cG().h(0.0625));
            if ($$16 && ($$20 || !$$21)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(new yj($$1));
               return;
            }

            this.e.x().k().a(this.e);
            this.e.r(this.e.dp() - $$3, this.e.dr() - $$4, this.e.dv() - $$5);
            this.G = $$12 >= -0.03125 && !$$17 && !this.b.Z() && !$$1.aT() && this.a($$1);
            this.y = $$1.dp();
            this.z = $$1.dr();
            this.A = $$1.dv();
         }
      }
   }

   private boolean a(bii $$0) {
      return $$0.dK().a($$0.cG().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(dey.a::i);
   }

   @Override
   public void a(aaz $$0) {
      uz.a($$0, this, this.e.x());
      if ($$0.a() == this.C) {
         if (this.B == null) {
            this.b(tf.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.e.a(this.B.c, this.B.d, this.B.e, this.e.dA(), this.e.dC());
         this.r = this.B.c;
         this.s = this.B.d;
         this.t = this.B.e;
         if (this.e.L()) {
            this.e.M();
         }

         this.B = null;
      }
   }

   @Override
   public void a(acd $$0) {
      uz.a($$0, this, this.e.x());
      this.b.aE().a($$0.a()).ifPresent(this.e.F()::e);
   }

   @Override
   public void a(acc $$0) {
      uz.a($$0, this, this.e.x());
      this.e.F().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(acf $$0) {
      uz.a($$0, this, this.e.x());
      if ($$0.d() == acf.a.a) {
         aer $$1 = $$0.e();
         ae $$2 = this.b.az().a($$1);
         if ($$2 != null) {
            this.e.N().a($$2);
         }
      }
   }

   @Override
   public void a(abj $$0) {
      uz.a($$0, this, this.e.x());
      StringReader $$1 = new StringReader($$0.d());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<dr> $$2 = this.b.aC().a().parse($$1, this.e.dc());
      this.b.aC().a().getCompletionSuggestions($$2).thenAccept($$1x -> this.b(new xh($$0.a(), $$1x)));
   }

   @Override
   public void a(acj $$0) {
      uz.a($$0, this, this.e.x());
      if (!this.b.o()) {
         this.e.a(tf.c("advMode.notEnabled"));
      } else if (!this.e.gn()) {
         this.e.a(tf.c("advMode.notAllowed"));
      } else {
         col $$1 = null;
         dcv $$2 = null;
         gu $$3 = $$0.a();
         dcl $$4 = this.e.dK().c_($$3);
         if ($$4 instanceof dcv) {
            $$2 = (dcv)$$4;
            $$1 = $$2.c();
         }

         String $$5 = $$0.d();
         boolean $$6 = $$0.e();
         if ($$1 != null) {
            dcv.a $$7 = $$2.v();
            dez $$8 = this.e.dK().a_($$3);
            ha $$9 = $$8.c(cts.a);

            dez $$13 = (switch ($$0.h()) {
               case a -> csm.kH.n();
               case b -> csm.kG.n();
               default -> csm.fN.n();
            }).a(cts.a, $$9).a(cts.b, Boolean.valueOf($$0.f()));
            if ($$13 != $$8) {
               this.e.dK().a($$3, $$13, 2);
               $$4.b($$13);
               this.e.dK().l($$3).a($$4);
            }

            $$1.a($$5);
            $$1.a($$6);
            if (!$$6) {
               $$1.c(null);
            }

            $$2.b($$0.g());
            if ($$7 != $$0.h()) {
               $$2.g();
            }

            $$1.f();
            if (!asi.b($$5)) {
               this.e.a(tf.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ack $$0) {
      uz.a($$0, this, this.e.x());
      if (!this.b.o()) {
         this.e.a(tf.c("advMode.notEnabled"));
      } else if (!this.e.gn()) {
         this.e.a(tf.c("advMode.notAllowed"));
      } else {
         col $$1 = $$0.a(this.e.dK());
         if ($$1 != null) {
            $$1.a($$0.a());
            $$1.a($$0.d());
            if (!$$0.d()) {
               $$1.c(null);
            }

            $$1.f();
            this.e.a(tf.a("advMode.setCommand.success", $$0.a()));
         }
      }
   }

   @Override
   public void a(abw $$0) {
      uz.a($$0, this, this.e.x());
      this.e.fQ().c($$0.a());
      this.e.c.b(new xm(-2, 0, this.e.fQ().l, this.e.fQ().a(this.e.fQ().l)));
      this.e.c.b(new xm(-2, 0, $$0.a(), this.e.fQ().a($$0.a())));
      this.e.c.b(new zm(this.e.fQ().l));
   }

   @Override
   public void a(ace $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.bQ instanceof cef $$1) {
         if (!$$1.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$1);
            return;
         }

         $$1.a($$0.a());
      }
   }

   @Override
   public void a(ach $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.bQ instanceof ceg $$1) {
         if (!this.e.bQ.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bQ);
            return;
         }

         $$1.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(acn $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.gn()) {
         gu $$1 = $$0.a();
         dez $$2 = this.e.dK().a_($$1);
         if (this.e.dK().c_($$1) instanceof ddy $$4) {
            $$4.a($$0.e());
            $$4.a($$0.f());
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.j());
            $$4.b($$0.k());
            $$4.a($$0.l());
            $$4.d($$0.m());
            $$4.e($$0.n());
            $$4.a($$0.o());
            $$4.a($$0.p());
            if ($$4.g()) {
               String $$5 = $$4.d();
               if ($$0.d() == ddy.a.b) {
                  if ($$4.D()) {
                     this.e.a(tf.a("structure_block.save_success", $$5), false);
                  } else {
                     this.e.a(tf.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.d() == ddy.a.c) {
                  if (!$$4.F()) {
                     this.e.a(tf.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.e.x())) {
                     this.e.a(tf.a("structure_block.load_success", $$5), false);
                  } else {
                     this.e.a(tf.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.d() == ddy.a.d) {
                  if ($$4.C()) {
                     this.e.a(tf.a("structure_block.size_success", $$5), false);
                  } else {
                     this.e.a(tf.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.e.a(tf.a("structure_block.invalid_structure_name", $$0.f()), false);
            }

            $$4.e();
            this.e.dK().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(acm $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.gn()) {
         gu $$1 = $$0.a();
         dez $$2 = this.e.dK().a_($$1);
         if (this.e.dK().c_($$1) instanceof ddk $$4) {
            $$4.a($$0.d());
            $$4.b($$0.e());
            $$4.a(aeq.a(jc.aC, $$0.f()));
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.e();
            this.e.dK().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(abr $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.gn()) {
         gu $$1 = $$0.a();
         if (this.e.dK().c_($$1) instanceof ddk $$3) {
            $$3.a(this.e.x(), $$0.d(), $$0.e());
         }
      }
   }

   @Override
   public void a(acg $$0) {
      uz.a($$0, this, this.e.x());
      int $$1 = $$0.a();
      if (this.e.bQ instanceof cfk $$2) {
         if (!$$2.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(abo $$0) {
      int $$1 = $$0.e();
      if (cbl.d($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.d();
         $$3.ifPresent($$2::add);
         $$0.a().stream().limit(100L).forEach($$2::add);
         Consumer<List<ala>> $$4 = $$3.isPresent() ? $$1x -> this.a((ala)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.b);
      }
   }

   private void a(List<ala> $$0, int $$1) {
      cix $$2 = this.e.fQ().a($$1);
      if ($$2.a(cja.tg)) {
         this.a($$0, UnaryOperator.identity(), $$2);
      }
   }

   private void a(ala $$0, List<ala> $$1, int $$2) {
      cix $$3 = this.e.fQ().a($$2);
      if ($$3.a(cja.tg)) {
         cix $$4 = new cix(cja.th);
         qr $$5 = $$3.v();
         if ($$5 != null) {
            $$4.c($$5.h());
         }

         $$4.a("author", ri.a(this.e.ab().getString()));
         if (this.e.W()) {
            $$4.a("title", ri.a($$0.b()));
         } else {
            $$4.a("filtered_title", ri.a($$0.b()));
            $$4.a("title", ri.a($$0.d()));
         }

         this.a($$1, $$0x -> tf.a.a(tf.b($$0x)), $$4);
         this.e.fQ().a($$2, $$4);
      }
   }

   private void a(List<ala> $$0, UnaryOperator<String> $$1, cix $$2) {
      qx $$3 = new qx();
      if (this.e.W()) {
         $$0.stream().map($$1x -> ri.a($$1.apply($$1x.b()))).forEach($$3::add);
      } else {
         qr $$4 = new qr();
         int $$5 = 0;

         for (int $$6 = $$0.size(); $$5 < $$6; $$5++) {
            ala $$7 = $$0.get($$5);
            String $$8 = $$7.d();
            $$3.add(ri.a($$1.apply($$8)));
            if ($$7.c()) {
               $$4.a(String.valueOf($$5), $$1.apply($$7.b()));
            }
         }

         if (!$$4.g()) {
            $$2.a("filtered_pages", $$4);
         }
      }

      $$2.a("pages", $$3);
   }

   @Override
   public void a(abp $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.l(2)) {
         bii $$1 = this.e.dK().a($$0.d());
         if ($$1 != null) {
            qr $$2 = $$1.f(new qr());
            this.e.c.b(new aam($$0.a(), $$2));
         }
      }
   }

   @Override
   public void a(aba $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.l(2)) {
         dcl $$1 = this.e.dK().c_($$0.d());
         qr $$2 = $$1 != null ? $$1.o() : null;
         this.e.c.b(new aam($$0.a(), $$2));
      }
   }

   @Override
   public void a(abt $$0) {
      uz.a($$0, this, this.e.x());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.b(tf.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         akk $$1 = this.e.x();
         if (!this.e.f) {
            if (this.k == 0) {
               this.m();
            }

            if (this.B != null) {
               if (this.k - this.D > 20) {
                  this.D = this.k;
                  this.a(this.B.c, this.B.d, this.B.e, this.e.dA(), this.e.dC());
               }
            } else {
               this.D = this.k;
               double $$2 = a($$0.a(this.e.dp()));
               double $$3 = b($$0.b(this.e.dr()));
               double $$4 = a($$0.c(this.e.dv()));
               float $$5 = arp.g($$0.a(this.e.dA()));
               float $$6 = arp.g($$0.b(this.e.dC()));
               if (this.e.bN()) {
                  this.e.a(this.e.dp(), this.e.dr(), this.e.dv(), $$5, $$6);
                  this.e.x().k().a(this.e);
               } else {
                  double $$7 = this.e.dp();
                  double $$8 = this.e.dr();
                  double $$9 = this.e.dv();
                  double $$10 = $$2 - this.o;
                  double $$11 = $$3 - this.p;
                  double $$12 = $$4 - this.q;
                  double $$13 = this.e.dn().g();
                  double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  if (this.e.fB()) {
                     if ($$14 > 1.0) {
                        this.a(this.e.dp(), this.e.dr(), this.e.dv(), $$5, $$6);
                     }
                  } else {
                     this.I++;
                     int $$15 = this.I - this.J;
                     if ($$15 > 5) {
                        g.debug("{} is sending move packets too frequently ({} packets since last tick)", this.e.ab().getString(), $$15);
                        $$15 = 1;
                     }

                     if (!this.e.L() && (!this.e.dK().X().b(cph.s) || !this.e.fu())) {
                        float $$16 = this.e.fu() ? 300.0F : 100.0F;
                        if ($$14 - $$13 > (double)($$16 * (float)$$15) && !this.i()) {
                           g.warn("{} moved too quickly! {},{},{}", new Object[]{this.e.ab().getString(), $$10, $$11, $$12});
                           this.a(this.e.dp(), this.e.dr(), this.e.dv(), this.e.dA(), this.e.dC());
                           return;
                        }
                     }

                     egy $$17 = this.e.cG();
                     $$10 = $$2 - this.r;
                     $$11 = $$3 - this.s;
                     $$12 = $$4 - this.t;
                     boolean $$18 = $$11 > 0.0;
                     if (this.e.aA() && !$$0.a() && $$18) {
                        this.e.eZ();
                     }

                     boolean $$19 = this.e.R;
                     this.e.a(bje.b, new ehd($$10, $$11, $$12));
                     $$10 = $$2 - this.e.dp();
                     $$11 = $$3 - this.e.dr();
                     if ($$11 > -0.5 || $$11 < 0.5) {
                        $$11 = 0.0;
                     }

                     $$12 = $$4 - this.e.dv();
                     $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     boolean $$21 = false;
                     if (!this.e.L() && $$14 > 0.0625 && !this.e.fB() && !this.e.e.e() && this.e.e.b() != cpi.d) {
                        $$21 = true;
                        g.warn("{} moved wrongly!", this.e.ab().getString());
                     }

                     if (this.e.af || this.e.fB() || (!$$21 || !$$1.a(this.e, $$17)) && !this.a($$1, $$17, $$2, $$3, $$4)) {
                        this.e.a($$2, $$3, $$4, $$5, $$6);
                        this.E = $$11 >= -0.03125
                           && !$$19
                           && this.e.e.b() != cpi.d
                           && !this.b.Z()
                           && !this.e.fR().c
                           && !this.e.a(bhx.y)
                           && !this.e.fu()
                           && !this.e.fh()
                           && this.a((bii)this.e);
                        this.e.x().k().a(this.e);
                        this.e.a(this.e.dp() - $$7, this.e.dr() - $$8, this.e.dv() - $$9, $$0.a());
                        this.e.a($$0.a(), new ehd(this.e.dp() - $$7, this.e.dr() - $$8, this.e.dv() - $$9));
                        if ($$18) {
                           this.e.n();
                        }

                        this.e.r(this.e.dp() - $$7, this.e.dr() - $$8, this.e.dv() - $$9);
                        this.r = this.e.dp();
                        this.s = this.e.dr();
                        this.t = this.e.dv();
                     } else {
                        this.a($$7, $$8, $$9, $$5, $$6);
                        this.e.a(this.e.dp() - $$7, this.e.dr() - $$8, this.e.dv() - $$9, $$0.a());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cpo $$0, egy $$1, double $$2, double $$3, double $$4) {
      egy $$5 = this.e.cG().d($$2 - this.e.dp(), $$3 - this.e.dr(), $$4 - this.e.dv());
      Iterable<ehw> $$6 = $$0.d(this.e, $$5.h(1.0E-5F));
      ehw $$7 = eht.a($$1.h(1.0E-5F));

      for (ehw $$8 : $$6) {
         if (!eht.c($$8, $$7, ehh.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, Collections.emptySet());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bjm> $$5) {
      double $$6 = $$5.contains(bjm.a) ? this.e.dp() : 0.0;
      double $$7 = $$5.contains(bjm.b) ? this.e.dr() : 0.0;
      double $$8 = $$5.contains(bjm.c) ? this.e.dv() : 0.0;
      float $$9 = $$5.contains(bjm.d) ? this.e.dA() : 0.0F;
      float $$10 = $$5.contains(bjm.e) ? this.e.dC() : 0.0F;
      this.B = new ehd($$0, $$1, $$2);
      if (++this.C == Integer.MAX_VALUE) {
         this.C = 0;
      }

      this.D = this.k;
      this.e.a($$0, $$1, $$2, $$3, $$4);
      this.e.c.b(new yw($$0 - $$6, $$1 - $$7, $$2 - $$8, $$3 - $$9, $$4 - $$10, $$5, this.C));
   }

   @Override
   public void a(abz $$0) {
      uz.a($$0, this, this.e.x());
      gu $$1 = $$0.a();
      this.e.D();
      abz.a $$2 = $$0.e();
      switch ($$2) {
         case g:
            if (!this.e.G_()) {
               cix $$3 = this.e.b(bgp.b);
               this.e.a(bgp.b, this.e.b(bgp.a));
               this.e.a(bgp.a, $$3);
               this.e.fr();
            }

            return;
         case e:
            if (!this.e.G_()) {
               this.e.a(false);
            }

            return;
         case d:
            if (!this.e.G_()) {
               this.e.a(true);
            }

            return;
         case f:
            this.e.fq();
            return;
         case a:
         case b:
         case c:
            this.e.e.a($$1, $$2, $$0.d(), this.e.dK().aj(), $$0.f());
            this.e.c.a($$0.f());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean a(akl $$0, cix $$1) {
      if ($$1.b()) {
         return false;
      } else {
         cis $$2 = $$1.d();
         return ($$2 instanceof cgq || $$2 instanceof cgy) && !$$0.gl().a($$2);
      }
   }

   @Override
   public void a(acr $$0) {
      uz.a($$0, this, this.e.x());
      this.e.c.a($$0.e());
      akk $$1 = this.e.x();
      bgp $$2 = $$0.a();
      cix $$3 = this.e.b($$2);
      if ($$3.a($$1.G())) {
         egz $$4 = $$0.d();
         ehd $$5 = $$4.e();
         gu $$6 = $$4.a();
         ehd $$7 = ehd.b($$6);
         if (!(this.e.bp().g($$7) > d)) {
            ehd $$8 = $$5.d($$7);
            double $$9 = 1.0000001;
            if (Math.abs($$8.a()) < 1.0000001 && Math.abs($$8.b()) < 1.0000001 && Math.abs($$8.c()) < 1.0000001) {
               ha $$10 = $$4.b();
               this.e.D();
               int $$11 = this.e.dK().aj();
               if ($$6.v() < $$11) {
                  if (this.B == null && this.e.i((double)$$6.u() + 0.5, (double)$$6.v() + 0.5, (double)$$6.w() + 0.5) < 64.0 && $$1.a(this.e, $$6)) {
                     bgq $$12 = this.e.e.a(this.e, $$1, $$3, $$2, $$4);
                     if ($$10 == ha.b && !$$12.a() && $$6.v() >= $$11 - 1 && a(this.e, $$3)) {
                        tf $$13 = tf.a("build.tooHigh", $$11 - 1).a(n.m);
                        this.e.b($$13, true);
                     } else if ($$12.b()) {
                        this.e.a($$2, true);
                     }
                  }
               } else {
                  tf $$14 = tf.a("build.tooHigh", $$11 - 1).a(n.m);
                  this.e.b($$14, true);
               }

               this.e.c.b(new wz($$1, $$6));
               this.e.c.b(new wz($$1, $$6.a($$10)));
            } else {
               g.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.e.fP().getName(), $$5, $$6});
            }
         }
      }
   }

   @Override
   public void a(acs $$0) {
      uz.a($$0, this, this.e.x());
      this.a($$0.d());
      akk $$1 = this.e.x();
      bgp $$2 = $$0.a();
      cix $$3 = this.e.b($$2);
      this.e.D();
      if (!$$3.b() && $$3.a($$1.G())) {
         bgq $$4 = this.e.e.a(this.e, $$1, $$3, $$2);
         if ($$4.b()) {
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(acq $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.G_()) {
         for (akk $$1 : this.b.F()) {
            bii $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.e.a($$1, $$2.dp(), $$2.dr(), $$2.dv(), $$2.dA(), $$2.dC());
               return;
            }
         }
      }
   }

   @Override
   public void a(abv $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.cZ() instanceof cdf $$2) {
         $$2.a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(tf $$0) {
      g.info("{} lost connection: {}", this.e.ab().getString(), $$0.getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.P.close();
      this.b.ar();
      this.b.ac().a(tf.a("multiplayer.player.left", this.e.H_()).a(n.o), false);
      this.e.s();
      this.b.ac().c(this.e);
      this.e.V().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.l = Math.max($$0, this.l);
      }
   }

   @Override
   public void a(aci $$0) {
      uz.a($$0, this, this.e.x());
      if ($$0.a() >= 0 && $$0.a() < cbl.g()) {
         if (this.e.fQ().l != $$0.a() && this.e.fm() == bgp.a) {
            this.e.fr();
         }

         this.e.fQ().l = $$0.a();
         this.e.D();
      } else {
         g.warn("{} tried to set an invalid carried item", this.e.ab().getString());
      }
   }

   @Override
   public void a(abe $$0) {
      if (c($$0.a())) {
         this.b(tf.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<tl> $$1 = this.a($$0.a(), $$0.d(), $$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               tu $$2;
               try {
                  $$2 = this.a($$0, $$1.get());
               } catch (ty.a var6) {
                  this.a(var6);
                  return;
               }

               CompletableFuture<ala> $$5 = this.a($$2.b());
               CompletableFuture<tf> $$6 = this.b.bd().decorate(this.e, $$2.c());
               this.P.append($$3 -> CompletableFuture.allOf($$5, $$6).thenAcceptAsync($$3x -> {
                     tu $$4x = $$2.a($$6.join()).a($$5.join().e());
                     this.b($$4x);
                  }, $$3));
            });
         }
      }
   }

   @Override
   public void a(abd $$0) {
      if (c($$0.a())) {
         this.b(tf.c("multiplayer.disconnect.illegal_characters"));
      } else {
         Optional<tl> $$1 = this.a($$0.a(), $$0.d(), $$0.g());
         if ($$1.isPresent()) {
            this.b.g(() -> {
               this.a($$0, $$1.get());
               this.r();
            });
         }
      }
   }

   private void a(abd $$0, tl $$1) {
      ParseResults<dr> $$2 = this.b($$0.a());

      Map<String, tu> $$3;
      try {
         $$3 = this.a($$0, tw.a($$2), $$1);
      } catch (ty.a var6) {
         this.a(var6);
         return;
      }

      dp $$6 = new dp.a($$3);
      $$2 = ds.a($$2, $$1x -> $$1x.a($$6));
      this.b.aC().a($$2, $$0.a());
   }

   private void a(ty.a $$0) {
      if ($$0.a()) {
         this.b($$0.b());
      } else {
         this.e.a($$0.b().e().a(n.m));
      }
   }

   private Map<String, tu> a(abd $$0, tw<?> $$1, tl $$2) throws ty.a {
      Map<String, tu> $$3 = new Object2ObjectOpenHashMap();

      for (tw.a<?> $$4 : $$1.a()) {
         tq $$5 = $$0.f().a($$4.a());
         tx $$6 = new tx($$4.c(), $$0.d(), $$0.e(), $$2);
         $$3.put($$4.a(), this.M.unpack($$5, $$6));
      }

      return $$3;
   }

   private ParseResults<dr> b(String $$0) {
      CommandDispatcher<dr> $$1 = this.b.aC().a();
      return $$1.parse($$0, this.e.dc());
   }

   private Optional<tl> a(String $$0, Instant $$1, tl.b $$2) {
      if (!this.a($$1)) {
         g.warn("{} sent out-of-order chat: '{}'", this.e.ab().getString(), $$0);
         this.b(tf.c("multiplayer.disconnect.out_of_order_chat"));
         return Optional.empty();
      } else {
         Optional<tl> $$3 = this.a($$2);
         if (this.e.A() == cbk.c) {
            this.b(new aak(tf.c("chat.disabled.options").a(n.m), false));
            return Optional.empty();
         } else {
            this.e.D();
            return $$3;
         }
      }
   }

   private Optional<tl> a(tl.b $$0) {
      synchronized (this.N) {
         Optional<tl> $$1 = this.N.a($$0);
         if ($$1.isEmpty()) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ab().getString());
            this.b(j);
         }

         return $$1;
      }
   }

   private boolean a(Instant $$0) {
      Instant $$1;
      do {
         $$1 = this.K.get();
         if ($$0.isBefore($$1)) {
            return false;
         }
      } while (!this.K.compareAndSet($$1, $$0));

      return true;
   }

   private static boolean c(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!aa.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private tu a(abe $$0, tl $$1) throws ty.a {
      tx $$2 = new tx($$0.a(), $$0.d(), $$0.e(), $$1);
      return this.M.unpack($$0.f(), $$2);
   }

   private void b(tu $$0) {
      this.b.ac().a($$0, this.e, tb.a(tb.c, this.e));
      this.r();
   }

   private void r() {
      this.m += 20;
      if (this.m > 200 && !this.b.ac().g(this.e.fP())) {
         this.b(tf.c("disconnect.spam"));
      }
   }

   @Override
   public void a(abc $$0) {
      synchronized (this.N) {
         if (!this.N.a($$0.a())) {
            g.warn("Failed to validate message acknowledgements from {}", this.e.ab().getString());
            this.b(j);
         }
      }
   }

   @Override
   public void a(acp $$0) {
      uz.a($$0, this, this.e.x());
      this.e.D();
      this.e.a($$0.a());
   }

   @Override
   public void a(aca $$0) {
      uz.a($$0, this, this.e.x());
      this.e.D();
      switch ($$0.d()) {
         case a:
            this.e.f(true);
            break;
         case b:
            this.e.f(false);
            break;
         case d:
            this.e.g(true);
            break;
         case e:
            this.e.g(false);
            break;
         case c:
            if (this.e.fB()) {
               this.e.a(false, true);
               this.B = this.e.di();
            }
            break;
         case f:
            if (this.e.cZ() instanceof bjj $$1) {
               int $$2 = $$0.e();
               if ($$1.a() && $$2 > 0) {
                  $$1.c($$2);
               }
            }
            break;
         case g:
            if (this.e.cZ() instanceof bjj $$3) {
               $$3.b();
            }
            break;
         case h:
            if (this.e.cY() instanceof bir $$4) {
               $$4.b(this.e);
            }
            break;
         case i:
            if (!this.e.fV()) {
               this.e.fX();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   public void a(tu $$0) {
      tq $$1 = $$0.k();
      if ($$1 != null) {
         this.O.a($$0);
         int $$2;
         synchronized (this.N) {
            this.N.a($$1);
            $$2 = this.N.a();
         }

         if ($$2 > 4096) {
            this.b(tf.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(tu $$0, tb.a $$1) {
      this.b(new yp($$0.j().c(), $$0.j().b(), $$0.k(), $$0.l().a(this.O), $$0.m(), $$0.n(), $$1.a(this.e.dK().B_())));
      this.a($$0);
   }

   public void a(tf $$0, tb.a $$1) {
      this.b(new xr($$0, $$1.a(this.e.dK().B_())));
   }

   public SocketAddress n() {
      return this.c.f();
   }

   public void o() {
      this.Q = true;
      this.q();
      this.b(new aai());
   }

   @Override
   public void a(adw $$0) {
      this.c.a(new ads($$0.a()));
   }

   @Override
   public void a(abq $$0) {
      uz.a($$0, this, this.e.x());
      final akk $$1 = this.e.x();
      final bii $$2 = $$0.a($$1);
      this.e.D();
      this.e.f($$0.a());
      if ($$2 != null) {
         if (!$$1.w_().a($$2.dk())) {
            return;
         }

         egy $$3 = $$2.cG();
         if ($$3.e(this.e.bp()) < d) {
            $$0.a(new abq.c() {
               private void a(bgp $$0, ali.a $$1x) {
                  cix $$2 = ali.this.e.b($$0);
                  if ($$2.a($$1.G())) {
                     cix $$3 = $$2.p();
                     bgq $$4 = $$1.run(ali.this.e, $$2, $$0);
                     if ($$4.a()) {
                        ai.Q.a(ali.this.e, $$3, $$2);
                        if ($$4.b()) {
                           ali.this.e.a($$0, true);
                        }
                     }
                  }
               }

               @Override
               public void a(bgp $$0) {
                  this.a($$0, cbm::a);
               }

               @Override
               public void a(bgp $$0, ehd $$1x) {
                  this.a($$0, ($$1xxx, $$2xx, $$3) -> $$2xx.a($$1xxx, $$1, $$3));
               }

               @Override
               public void a() {
                  if (!($$2 instanceof byf) && !($$2 instanceof bio) && !($$2 instanceof cbs) && $$2 != ali.this.e) {
                     cix $$0 = ali.this.e.b(bgp.a);
                     if ($$0.a($$1.G())) {
                        ali.this.e.d($$2);
                     }
                  } else {
                     ali.this.b(tf.c("multiplayer.disconnect.invalid_entity_attacked"));
                     ali.g.warn("Player {} tried to attack an invalid entity", ali.this.e.ab().getString());
                  }
               }
            });
         }
      }
   }

   @Override
   public void a(abh $$0) {
      uz.a($$0, this, this.e.x());
      this.e.D();
      abh.a $$1 = $$0.a();
      switch ($$1) {
         case a:
            if (this.e.f) {
               this.e.f = false;
               this.e = this.b.ac().a(this.e, true);
               ai.v.a(this.e, cpl.j, cpl.h);
            } else {
               if (this.e.et() > 0.0F) {
                  return;
               }

               this.e = this.b.ac().a(this.e, false);
               if (this.b.h()) {
                  this.e.a(cpi.d);
                  this.e.dK().X().a(cph.q).a(false, this.b);
               }
            }
            break;
         case b:
            this.e.E().a(this.e);
      }
   }

   @Override
   public void a(abn $$0) {
      uz.a($$0, this, this.e.x());
      this.e.r();
   }

   @Override
   public void a(abm $$0) {
      uz.a($$0, this, this.e.x());
      this.e.D();
      if (this.e.bQ.j == $$0.a()) {
         if (this.e.G_()) {
            this.e.bQ.b();
         } else if (!this.e.bQ.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bQ);
         } else {
            int $$1 = $$0.d();
            if (!this.e.bQ.a($$1)) {
               g.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.e.ab(), $$1, this.e.bQ.i.size()});
            } else {
               boolean $$2 = $$0.i() != this.e.bQ.j();
               this.e.bQ.h();
               this.e.bQ.a($$1, $$0.e(), $$0.h(), this.e);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.g()).iterator();

               while (var4.hasNext()) {
                  Entry<cix> $$3 = (Entry<cix>)var4.next();
                  this.e.bQ.b($$3.getIntKey(), (cix)$$3.getValue());
               }

               this.e.bQ.a($$0.f());
               this.e.bQ.i();
               if ($$2) {
                  this.e.bQ.e();
               } else {
                  this.e.bQ.d();
               }
            }
         }
      }
   }

   @Override
   public void a(abx $$0) {
      uz.a($$0, this, this.e.x());
      this.e.D();
      if (!this.e.G_() && this.e.bQ.j == $$0.a() && this.e.bQ instanceof cfn) {
         if (!this.e.bQ.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bQ);
         } else {
            this.b.aE().a($$0.d()).ifPresent($$1 -> ((cfn)this.e.bQ).a($$0.e(), (cma<?>)$$1, this.e));
         }
      }
   }

   @Override
   public void a(abl $$0) {
      uz.a($$0, this, this.e.x());
      this.e.D();
      if (this.e.bQ.j == $$0.a() && !this.e.G_()) {
         if (!this.e.bQ.a(this.e)) {
            g.debug("Player {} interacted with invalid menu {}", this.e, this.e.bQ);
         } else {
            boolean $$1 = this.e.bQ.b(this.e, $$0.d());
            if ($$1) {
               this.e.bQ.d();
            }
         }
      }
   }

   @Override
   public void a(acl $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.e.e()) {
         boolean $$1 = $$0.a() < 0;
         cix $$2 = $$0.d();
         if (!$$2.a(this.e.dK().G())) {
            return;
         }

         qr $$3 = cgq.a($$2);
         if (!$$2.b() && $$3 != null && $$3.e("x") && $$3.e("y") && $$3.e("z")) {
            gu $$4 = dcl.c($$3);
            if (this.e.dK().o($$4)) {
               dcl $$5 = this.e.dK().c_($$4);
               if ($$5 != null) {
                  $$5.e($$2);
               }
            }
         }

         boolean $$6 = $$0.a() >= 1 && $$0.a() <= 45;
         boolean $$7 = $$2.b() || $$2.k() >= 0 && $$2.L() <= 64 && !$$2.b();
         if ($$6 && $$7) {
            this.e.bP.b($$0.a()).d($$2);
            this.e.bP.d();
         } else if ($$1 && $$7 && this.n < 200) {
            this.n += 20;
            this.e.a($$2, true);
         }
      }
   }

   @Override
   public void a(aco $$0) {
      List<String> $$1 = Stream.of($$0.e()).map(n::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.b);
   }

   private void a(aco $$0, List<ala> $$1) {
      this.e.D();
      akk $$2 = this.e.x();
      gu $$3 = $$0.a();
      if ($$2.A($$3)) {
         if (!($$2.c_($$3) instanceof ddt $$5)) {
            return;
         }

         $$5.a(this.e, $$0.d(), $$1);
      }
   }

   @Override
   public void a(aby $$0) {
      uz.a($$0, this, this.e.x());
      this.e.fR().b = $$0.a() && this.e.fR().c;
   }

   @Override
   public void a(abi $$0) {
      uz.a($$0, this, this.e.x());
      this.e.a($$0);
   }

   @Override
   public void a(abb $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.l(2) || this.i()) {
         this.b.a($$0.a(), false);
      }
   }

   @Override
   public void a(abs $$0) {
      uz.a($$0, this, this.e.x());
      if (this.e.l(2) || this.i()) {
         this.b.b($$0.a());
      }
   }

   @Override
   public void a(abf $$0) {
      uz.a($$0, this, this.e.x());
      tv.a $$1 = $$0.a();
      cbp.a $$2 = this.L != null ? this.L.d().b() : null;
      cbp.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.b(cbp.a);
         } else {
            try {
               arz $$4 = this.b.an();
               if ($$4 == null) {
                  g.warn("Ignoring chat session from {} due to missing Services public key", this.e.fP().getName());
                  return;
               }

               this.a($$1.a(this.e.fP(), $$4));
            } catch (cbp.b var6) {
               g.error("Failed to validate profile key: {}", var6.getMessage());
               this.b(var6.b());
            }
         }
      }
   }

   @Override
   public void a(abk $$0) {
      if (!this.Q) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.c.a(new alg(this.b, this.c, this.j()));
      }
   }

   @Override
   public void a(abg $$0) {
      uz.a($$0, this, this.e.x());
      this.f.a($$0.a());
   }

   private void a(tv $$0) {
      this.L = $$0;
      this.M = $$0.a(this.e.cv());
      this.P.append($$1 -> {
         this.e.a($$0);
         this.b.ac().a(new yu(EnumSet.of(yu.a.b), List.of(this.e)));
         return CompletableFuture.completedFuture(null);
      });
   }

   @Override
   public akl p() {
      return this.e;
   }

   @FunctionalInterface
   interface a {
      bgq run(akl var1, bii var2, bgp var3);
   }
}
