import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;

public class evm {
   private static final int a = 14737632;
   private static final int b = 2;
   private static final int c = 2;
   private static final int d = 2;
   private static final Map<dmw.a, String> e = ac.a(new EnumMap<>(dmw.a.class), $$0 -> {
      $$0.put(dmw.a.a, "SW");
      $$0.put(dmw.a.b, "S");
      $$0.put(dmw.a.c, "OW");
      $$0.put(dmw.a.d, "O");
      $$0.put(dmw.a.e, "M");
      $$0.put(dmw.a.f, "ML");
   });
   private final eti f;
   private final evm.a g;
   private final eur h;
   private ejx i;
   private ejx j;
   @Nullable
   private crm k;
   @Nullable
   private dju l;
   @Nullable
   private CompletableFuture<dju> m;
   private boolean n;
   private boolean o;
   private boolean p;
   private boolean q;
   private final aty r = new aty();
   private final aty s = new aty();
   private final aty t = new aty();
   private final aty u = new aty();
   private final ewu v;
   private final eww w;
   private final ewv x;
   private final ewt y;

   public evm(eti $$0) {
      this.f = $$0;
      this.g = new evm.a();
      this.h = $$0.h;
      this.v = new ewu(this.h, this.r);
      this.w = new eww(this.h, this.s, () -> $$0.r.r().g());
      this.x = new ewv(this.h, this.t);
      this.y = new ewt(this.h, this.u);
   }

   public void a() {
      this.m = null;
      this.l = null;
   }

   public void a(eut $$0) {
      this.f.aF().a("debug");
      bkv $$1 = this.f.al();
      this.i = $$1.a(20.0, 0.0F, false);
      this.j = $$1.a(20.0, 0.0F, true);
      $$0.a(() -> {
         this.b($$0);
         this.c($$0);
         if (this.p) {
            int $$1x = $$0.a();
            int $$2 = $$1x / 2;
            this.v.a($$0, 0, this.v.a($$2));
            if (this.f.S() != null) {
               int $$3 = this.w.a($$2);
               this.w.a($$0, $$1x - $$3, $$3);
            }
         }

         if (this.q) {
            int $$4 = $$0.a();
            int $$5 = $$4 / 2;
            if (!this.f.Q()) {
               this.y.a($$0, 0, this.y.a($$5));
            }

            int $$6 = this.x.a($$5);
            this.x.a($$0, $$4 - $$6, $$6);
         }
      });
      this.f.aF().c();
   }

   protected void b(eut $$0) {
      List<String> $$1 = this.b();
      $$1.add("");
      boolean $$2 = this.f.S() != null;
      $$1.add(
         "Debug charts: [F3+1] Profiler "
            + (this.o ? "visible" : "hidden")
            + "; [F3+2] "
            + ($$2 ? "FPS + TPS " : "FPS ")
            + (this.p ? "visible" : "hidden")
            + "; [F3+3] "
            + (!this.f.Q() ? "Bandwidth + Ping" : "Ping")
            + (this.q ? " visible" : " hidden")
      );
      $$1.add("For help: press F3 + Q");
      this.a($$0, $$1, true);
   }

   protected void c(eut $$0) {
      List<String> $$1 = this.c();
      this.a($$0, $$1, false);
   }

   private void a(eut $$0, List<String> $$1, boolean $$2) {
      int $$3 = 9;

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         String $$5 = $$1.get($$4);
         if (!Strings.isNullOrEmpty($$5)) {
            int $$6 = this.h.b($$5);
            int $$7 = $$2 ? 2 : $$0.a() - 2 - $$6;
            int $$8 = 2 + $$3 * $$4;
            $$0.a($$7 - 1, $$8 - 1, $$7 + $$6 + 1, $$8 + $$3 - 1, -1873784752);
         }
      }

      for (int $$9 = 0; $$9 < $$1.size(); $$9++) {
         String $$10 = $$1.get($$9);
         if (!Strings.isNullOrEmpty($$10)) {
            int $$11 = this.h.b($$10);
            int $$12 = $$2 ? 2 : $$0.a() - 2 - $$11;
            int $$13 = 2 + $$3 * $$9;
            $$0.a(this.h, $$10, $$12, $$13, 14737632, false);
         }
      }
   }

   protected List<String> b() {
      gfy $$0 = this.f.S();
      flp $$1 = this.f.I();
      tw $$2 = $$1.m();
      float $$3 = $$2.r();
      float $$4 = $$2.q();
      bjl $$5 = this.p().r();
      String $$6;
      if ($$5.j()) {
         $$6 = " (frozen - stepping)";
      } else if ($$5.l()) {
         $$6 = " (frozen)";
      } else {
         $$6 = "";
      }

      String $$12;
      if ($$0 != null) {
         ahe $$9 = $$0.aO();
         boolean $$10 = $$9.a();
         if ($$10) {
            $$6 = " (sprinting)";
         }

         String $$11 = $$10 ? "-" : String.format(Locale.ROOT, "%.1f", $$5.g());
         $$12 = String.format(Locale.ROOT, "Integrated server @ %.1f/%s ms%s, %.0f tx, %.0f rx", $$0.aN(), $$11, $$6, $$3, $$4);
      } else {
         $$12 = String.format(Locale.ROOT, "\"%s\" server%s, %.0f tx, %.0f rx", $$1.h(), $$6, $$3, $$4);
      }

      hx $$14 = this.f.al().dn();
      if (this.f.au()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + aa.b().c() + " (" + this.f.h() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.f.z,
               $$12,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.r.h(),
               this.f.r.G(),
               "",
               String.format(Locale.ROOT, "Chunk-relative: %d %d %d", $$14.u() & 15, $$14.v() & 15, $$14.w() & 15)
            }
         );
      } else {
         bkv $$15 = this.f.al();
         ib $$16 = $$15.cE();

         String $$21 = switch ($$16) {
            case c -> "Towards negative Z";
            case d -> "Towards positive Z";
            case e -> "Towards negative X";
            case f -> "Towards positive X";
            default -> "Invalid";
         };
         crm $$22 = new crm($$14);
         if (!Objects.equals(this.k, $$22)) {
            this.k = $$22;
            this.a();
         }

         csf $$23 = this.p();
         LongSet $$24 = (LongSet)($$23 instanceof ami ? ((ami)$$23).v() : LongSets.EMPTY_SET);
         List<String> $$25 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + aa.b().c()
                  + " ("
                  + this.f.h()
                  + "/"
                  + ClientBrandRetriever.getClientModName()
                  + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i())
                  + ")",
               this.f.z,
               $$12,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.r.h(),
               this.f.r.G()
            }
         );
         String $$26 = this.o();
         if ($$26 != null) {
            $$25.add($$26);
         }

         $$25.add(this.f.r.ad().a() + " FC: " + $$24.size());
         $$25.add("");
         $$25.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.f.al().ds(), this.f.al().du(), this.f.al().dy()));
         $$25.add(String.format(Locale.ROOT, "Block: %d %d %d [%d %d %d]", $$14.u(), $$14.v(), $$14.w(), $$14.u() & 15, $$14.v() & 15, $$14.w() & 15));
         $$25.add(String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$22.e, iy.a($$14.v()), $$22.f, $$22.j(), $$22.k(), $$22.h(), $$22.i()));
         $$25.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$16, $$21, atq.g($$15.dD()), atq.g($$15.dF())));
         dju $$27 = this.r();
         if ($$27.C()) {
            $$25.add("Waiting for chunk...");
         } else {
            int $$28 = this.f.r.i().p().a($$14, 0);
            int $$29 = this.f.r.a(cso.a, $$14);
            int $$30 = this.f.r.a(cso.b, $$14);
            $$25.add("Client Light: " + $$28 + " (" + $$29 + " sky, " + $$30 + " block)");
            dju $$31 = this.q();
            StringBuilder $$32 = new StringBuilder("CH");

            for (dmw.a $$33 : dmw.a.values()) {
               if ($$33.b()) {
                  $$32.append(" ").append(e.get($$33)).append(": ").append($$27.a($$33, $$14.u(), $$14.w()));
               }
            }

            $$25.add($$32.toString());
            $$32.setLength(0);
            $$32.append("SH");

            for (dmw.a $$34 : dmw.a.values()) {
               if ($$34.d()) {
                  $$32.append(" ").append(e.get($$34)).append(": ");
                  if ($$31 != null) {
                     $$32.append($$31.a($$34, $$14.u(), $$14.w()));
                  } else {
                     $$32.append("??");
                  }
               }
            }

            $$25.add($$32.toString());
            if ($$14.v() >= this.f.r.J_() && $$14.v() < this.f.r.ak()) {
               $$25.add("Biome: " + a(this.f.r.s($$14)));
               if ($$31 != null) {
                  float $$35 = $$23.ao();
                  long $$36 = $$31.u();
                  biz $$37 = new biz($$23.aj(), $$23.X(), $$36, $$35);
                  $$25.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", $$37.b(), $$37.d(), this.f.r.X() / 24000L));
               } else {
                  $$25.add("Local Difficulty: ??");
               }
            }

            if ($$31 != null && $$31.s()) {
               $$25.add("Blending: Old");
            }
         }

         ami $$38 = this.n();
         if ($$38 != null) {
            amg $$39 = $$38.k();
            djk $$40 = $$39.g();
            dnk $$41 = $$39.i();
            $$40.a($$25, $$41, $$14);
            ctm.f $$42 = $$41.b();
            cth $$43 = $$40.c();
            $$43.a($$25, $$14, $$42);
            csq.d $$44 = $$39.n();
            if ($$44 != null) {
               Object2IntMap<blo> $$45 = $$44.b();
               int $$46 = $$44.a();
               $$25.add(
                  "SC: "
                     + $$46
                     + ", "
                     + Stream.of(blo.values())
                        .map($$1x -> Character.toUpperCase($$1x.a().charAt(0)) + ": " + $$45.getInt($$1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               $$25.add("SC: N/A");
            }
         }

         frc $$47 = this.f.j.g();
         if ($$47 != null) {
            $$25.add("Shader: " + $$47.a());
         }

         $$25.add(this.f.ah().i() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(this.f.s.d() * 100.0F)));
         return $$25;
      }
   }

   private static String a(ig<ctd> $$0) {
      return (String)$$0.d().map($$0x -> $$0x.a().toString(), $$0x -> "[unregistered " + $$0x + "]");
   }

   @Nullable
   private ami n() {
      gfy $$0 = this.f.S();
      return $$0 != null ? $$0.a(this.f.r.ad()) : null;
   }

   @Nullable
   private String o() {
      ami $$0 = this.n();
      return $$0 != null ? $$0.G() : null;
   }

   private csf p() {
      return (csf)DataFixUtils.orElse(Optional.ofNullable(this.f.S()).flatMap($$0 -> Optional.ofNullable($$0.a(this.f.r.ad()))), this.f.r);
   }

   @Nullable
   private dju q() {
      if (this.m == null) {
         ami $$0 = this.n();
         if ($$0 == null) {
            return null;
         }

         this.m = $$0.k().b(this.k.e, this.k.f, djo.n, false).thenApply($$0x -> (dju)$$0x.map($$0xx -> (dju)$$0xx, $$0xx -> null));
      }

      return this.m.getNow(null);
   }

   private dju r() {
      if (this.l == null) {
         this.l = this.f.r.d(this.k.e, this.k.f);
      }

      return this.l;
   }

   protected List<String> c() {
      long $$0 = Runtime.getRuntime().maxMemory();
      long $$1 = Runtime.getRuntime().totalMemory();
      long $$2 = Runtime.getRuntime().freeMemory();
      long $$3 = $$1 - $$2;
      List<String> $$4 = Lists.newArrayList(
         new String[]{
            String.format(Locale.ROOT, "Java: %s %dbit", System.getProperty("java.version"), this.f.ae() ? 64 : 32),
            String.format(Locale.ROOT, "Mem: % 2d%% %03d/%03dMB", $$3 * 100L / $$0, c($$3), c($$0)),
            String.format(Locale.ROOT, "Allocation rate: %03dMB /s", c(this.g.a($$3))),
            String.format(Locale.ROOT, "Allocated: % 2d%% %03dMB", $$1 * 100L / $$0, c($$1)),
            "",
            String.format(Locale.ROOT, "CPU: %s", emu.b()),
            "",
            String.format(Locale.ROOT, "Display: %dx%d (%s)", eti.N().aL().k(), eti.N().aL().l(), emu.a()),
            emu.c(),
            emu.d()
         }
      );
      if (this.f.au()) {
         return $$4;
      } else {
         if (this.i.c() == ejx.a.b) {
            hx $$5 = ((ejv)this.i).a();
            dhn $$6 = this.f.r.a_($$5);
            $$4.add("");
            $$4.add(n.t + "Targeted Block: " + $$5.u() + ", " + $$5.v() + ", " + $$5.w());
            $$4.add(String.valueOf(kc.f.b($$6.b())));
            UnmodifiableIterator var12 = $$6.C().entrySet().iterator();

            while (var12.hasNext()) {
               Entry<diq<?>, Comparable<?>> $$7 = (Entry<diq<?>, Comparable<?>>)var12.next();
               $$4.add(this.a($$7));
            }

            $$6.s().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         if (this.j.c() == ejx.a.b) {
            hx $$8 = ((ejv)this.j).a();
            ecx $$9 = this.f.r.b_($$8);
            $$4.add("");
            $$4.add(n.t + "Targeted Fluid: " + $$8.u() + ", " + $$8.v() + ", " + $$8.w());
            $$4.add(String.valueOf(kc.d.b($$9.a())));
            UnmodifiableIterator var17 = $$9.C().entrySet().iterator();

            while (var17.hasNext()) {
               Entry<diq<?>, Comparable<?>> $$10 = (Entry<diq<?>, Comparable<?>>)var17.next();
               $$4.add(this.a($$10));
            }

            $$9.k().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         bkv $$11 = this.f.u;
         if ($$11 != null) {
            $$4.add("");
            $$4.add(n.t + "Targeted Entity");
            $$4.add(String.valueOf(kc.h.b($$11.ai())));
         }

         return $$4;
      }
   }

   private String a(Entry<diq<?>, Comparable<?>> $$0) {
      diq<?> $$1 = $$0.getKey();
      Comparable<?> $$2 = $$0.getValue();
      String $$3 = ac.a($$1, $$2);
      if (Boolean.TRUE.equals($$2)) {
         $$3 = n.k + $$3;
      } else if (Boolean.FALSE.equals($$2)) {
         $$3 = n.m + $$3;
      }

      return $$1.f() + ": " + $$3;
   }

   private static long c(long $$0) {
      return $$0 / 1024L / 1024L;
   }

   public boolean d() {
      return this.n && !this.f.m.Z;
   }

   public boolean e() {
      return this.d() && this.o;
   }

   public boolean f() {
      return this.d() && this.q;
   }

   public void g() {
      this.n = !this.n;
   }

   public void h() {
      this.q = !this.n || !this.q;
      if (this.q) {
         this.n = true;
         this.p = false;
      }
   }

   public void i() {
      this.p = !this.n || !this.p;
      if (this.p) {
         this.n = true;
         this.q = false;
      }
   }

   public void j() {
      this.o = !this.n || !this.o;
      if (this.o) {
         this.n = true;
      }
   }

   public void a(long $$0) {
      this.r.a($$0);
   }

   public void b(long $$0) {
      this.s.a($$0);
   }

   public aty k() {
      return this.t;
   }

   public aty l() {
      return this.u;
   }

   public void m() {
      this.n = false;
      this.s.c();
      this.t.c();
      this.u.c();
   }

   static class a {
      private static final int a = 500;
      private static final List<GarbageCollectorMXBean> b = ManagementFactory.getGarbageCollectorMXBeans();
      private long c = 0L;
      private long d = -1L;
      private long e = -1L;
      private long f = 0L;

      long a(long $$0) {
         long $$1 = System.currentTimeMillis();
         if ($$1 - this.c < 500L) {
            return this.f;
         } else {
            long $$2 = a();
            if (this.c != 0L && $$2 == this.e) {
               double $$3 = (double)TimeUnit.SECONDS.toMillis(1L) / (double)($$1 - this.c);
               long $$4 = $$0 - this.d;
               this.f = Math.round((double)$$4 * $$3);
            }

            this.c = $$1;
            this.d = $$0;
            this.e = $$2;
            return this.f;
         }
      }

      private static long a() {
         long $$0 = 0L;

         for (GarbageCollectorMXBean $$1 : b) {
            $$0 += $$1.getCollectionCount();
         }

         return $$0;
      }
   }
}
