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

public class esp {
   private static final int a = 14737632;
   private static final int b = 2;
   private static final int c = 2;
   private static final int d = 2;
   private static final Map<dkj.a, String> e = ac.a(new EnumMap<>(dkj.a.class), $$0 -> {
      $$0.put(dkj.a.a, "SW");
      $$0.put(dkj.a.b, "S");
      $$0.put(dkj.a.c, "OW");
      $$0.put(dkj.a.d, "O");
      $$0.put(dkj.a.e, "M");
      $$0.put(dkj.a.f, "ML");
   });
   private final eqm f;
   private final esp.a g;
   private final eru h;
   private ehc i;
   private ehc j;
   @Nullable
   private cot k;
   @Nullable
   private dhh l;
   @Nullable
   private CompletableFuture<dhh> m;
   private final etv n;
   private final etw o;
   private final etu p;
   @Nullable
   private etx q;

   public esp(eqm $$0) {
      this.f = $$0;
      this.g = new esp.a();
      this.h = $$0.h;
      this.n = new etv(this.h, $$0.q);
      this.o = new etw(this.h, $$0.r);
      this.p = new etu(this.h, $$0.s);
   }

   public void a() {
      this.m = null;
      this.l = null;
   }

   public void a(erw $$0) {
      this.f.aH().a("debug");
      bii $$1 = this.f.am();
      this.i = $$1.a(20.0, 0.0F, false);
      this.j = $$1.a(20.0, 0.0F, true);
      $$0.a(() -> {
         this.b($$0);
         this.c($$0);
         if (this.f.m.ac) {
            int $$1x = $$0.a();
            int $$2 = $$1x / 2;
            this.n.a($$0, 0, this.n.a($$2));
            etx $$3 = this.d();
            if ($$3 != null) {
               int $$4 = $$3.a($$2);
               $$3.a($$0, $$1x - $$4, $$4);
            }
         }

         if (this.f.m.ad) {
            int $$5 = $$0.a();
            int $$6 = $$5 / 2;
            if (!this.f.R()) {
               this.p.a($$0, 0, this.p.a($$6));
            }

            int $$7 = this.o.a($$6);
            this.o.a($$0, $$5 - $$7, $$7);
         }
      });
      this.f.aH().c();
   }

   @Nullable
   private etx d() {
      if (this.q != null) {
         return this.q;
      } else {
         gck $$0 = this.f.T();
         if ($$0 != null) {
            this.q = new etx(this.h, $$0.aM());
         }

         return this.q;
      }
   }

   protected void b(erw $$0) {
      List<String> $$1 = this.b();
      $$1.add("");
      boolean $$2 = this.f.T() != null;
      $$1.add("Debug: Pie [shift]: " + (this.f.m.ab ? "visible" : "hidden") + ($$2 ? " FPS + TPS" : " FPS") + " [alt]: " + (this.f.m.ac ? "visible" : "hidden"));
      $$1.add("For help: press F3 + Q");
      this.a($$0, $$1, true);
   }

   protected void c(erw $$0) {
      List<String> $$1 = this.c();
      this.a($$0, $$1, false);
   }

   private void a(erw $$0, List<String> $$1, boolean $$2) {
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
      gck $$0 = this.f.T();
      fij $$1 = this.f.J();
      sg $$2 = $$1.l();
      float $$3 = $$2.r();
      float $$4 = $$2.q();
      String $$5;
      if ($$0 != null) {
         $$5 = String.format(Locale.ROOT, "Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", $$0.aL(), $$3, $$4);
      } else {
         $$5 = String.format(Locale.ROOT, "\"%s\" server, %.0f tx, %.0f rx", $$1.h(), $$3, $$4);
      }

      gu $$7 = this.f.am().dk();
      if (this.f.ay()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + aa.b().c() + " (" + this.f.h() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.f.C,
               $$5,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.u.h(),
               this.f.u.F(),
               "",
               String.format(Locale.ROOT, "Chunk-relative: %d %d %d", $$7.u() & 15, $$7.v() & 15, $$7.w() & 15)
            }
         );
      } else {
         bii $$8 = this.f.am();
         ha $$9 = $$8.cD();

         String $$14 = switch ($$9) {
            case c -> "Towards negative Z";
            case d -> "Towards positive Z";
            case e -> "Towards negative X";
            case f -> "Towards positive X";
            default -> "Invalid";
         };
         cot $$15 = new cot($$7);
         if (!Objects.equals(this.k, $$15)) {
            this.k = $$15;
            this.a();
         }

         cpm $$16 = this.g();
         LongSet $$17 = (LongSet)($$16 instanceof akk ? ((akk)$$16).u() : LongSets.EMPTY_SET);
         List<String> $$18 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + aa.b().c()
                  + " ("
                  + this.f.h()
                  + "/"
                  + ClientBrandRetriever.getClientModName()
                  + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i())
                  + ")",
               this.f.C,
               $$5,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.u.h(),
               this.f.u.F()
            }
         );
         String $$19 = this.f();
         if ($$19 != null) {
            $$18.add($$19);
         }

         $$18.add(this.f.u.ac().a() + " FC: " + $$17.size());
         $$18.add("");
         $$18.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.f.am().dp(), this.f.am().dr(), this.f.am().dv()));
         $$18.add(String.format(Locale.ROOT, "Block: %d %d %d [%d %d %d]", $$7.u(), $$7.v(), $$7.w(), $$7.u() & 15, $$7.v() & 15, $$7.w() & 15));
         $$18.add(String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$15.e, hx.a($$7.v()), $$15.f, $$15.j(), $$15.k(), $$15.h(), $$15.i()));
         $$18.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$9, $$14, arp.g($$8.dA()), arp.g($$8.dC())));
         dhh $$20 = this.i();
         if ($$20.C()) {
            $$18.add("Waiting for chunk...");
         } else {
            int $$21 = this.f.u.i().p().a($$7, 0);
            int $$22 = this.f.u.a(cpv.a, $$7);
            int $$23 = this.f.u.a(cpv.b, $$7);
            $$18.add("Client Light: " + $$21 + " (" + $$22 + " sky, " + $$23 + " block)");
            dhh $$24 = this.h();
            StringBuilder $$25 = new StringBuilder("CH");

            for (dkj.a $$26 : dkj.a.values()) {
               if ($$26.b()) {
                  $$25.append(" ").append(e.get($$26)).append(": ").append($$20.a($$26, $$7.u(), $$7.w()));
               }
            }

            $$18.add($$25.toString());
            $$25.setLength(0);
            $$25.append("SH");

            for (dkj.a $$27 : dkj.a.values()) {
               if ($$27.d()) {
                  $$25.append(" ").append(e.get($$27)).append(": ");
                  if ($$24 != null) {
                     $$25.append($$24.a($$27, $$7.u(), $$7.w()));
                  } else {
                     $$25.append("??");
                  }
               }
            }

            $$18.add($$25.toString());
            if ($$7.v() >= this.f.u.C_() && $$7.v() < this.f.u.aj()) {
               $$18.add("Biome: " + a(this.f.u.s($$7)));
               if ($$24 != null) {
                  float $$28 = $$16.an();
                  long $$29 = $$24.u();
                  bgo $$30 = new bgo($$16.ai(), $$16.W(), $$29, $$28);
                  $$18.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", $$30.b(), $$30.d(), this.f.u.W() / 24000L));
               } else {
                  $$18.add("Local Difficulty: ??");
               }
            }

            if ($$24 != null && $$24.s()) {
               $$18.add("Blending: Old");
            }
         }

         akk $$31 = this.e();
         if ($$31 != null) {
            aki $$32 = $$31.k();
            dgx $$33 = $$32.g();
            dkx $$34 = $$32.i();
            $$33.a($$18, $$34, $$7);
            cqt.f $$35 = $$34.b();
            cqo $$36 = $$33.c();
            $$36.a($$18, $$7, $$35);
            cpx.d $$37 = $$32.n();
            if ($$37 != null) {
               Object2IntMap<bjb> $$38 = $$37.b();
               int $$39 = $$37.a();
               $$18.add(
                  "SC: "
                     + $$39
                     + ", "
                     + Stream.of(bjb.values())
                        .map($$1x -> Character.toUpperCase($$1x.a().charAt(0)) + ": " + $$38.getInt($$1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               $$18.add("SC: N/A");
            }
         }

         fno $$40 = this.f.j.g();
         if ($$40 != null) {
            $$18.add("Shader: " + $$40.a());
         }

         $$18.add(this.f.ai().h() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(this.f.v.d() * 100.0F)));
         return $$18;
      }
   }

   private static String a(he<cqk> $$0) {
      return (String)$$0.d().map($$0x -> $$0x.a().toString(), $$0x -> "[unregistered " + $$0x + "]");
   }

   @Nullable
   private akk e() {
      gck $$0 = this.f.T();
      return $$0 != null ? $$0.a(this.f.u.ac()) : null;
   }

   @Nullable
   private String f() {
      akk $$0 = this.e();
      return $$0 != null ? $$0.F() : null;
   }

   private cpm g() {
      return (cpm)DataFixUtils.orElse(Optional.ofNullable(this.f.T()).flatMap($$0 -> Optional.ofNullable($$0.a(this.f.u.ac()))), this.f.u);
   }

   @Nullable
   private dhh h() {
      if (this.m == null) {
         akk $$0 = this.e();
         if ($$0 == null) {
            return null;
         }

         this.m = $$0.k().b(this.k.e, this.k.f, dhb.n, false).thenApply($$0x -> (dhh)$$0x.map($$0xx -> (dhh)$$0xx, $$0xx -> null));
      }

      return this.m.getNow(null);
   }

   private dhh i() {
      if (this.l == null) {
         this.l = this.f.u.d(this.k.e, this.k.f);
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
            String.format(Locale.ROOT, "Java: %s %dbit", System.getProperty("java.version"), this.f.af() ? 64 : 32),
            String.format(Locale.ROOT, "Mem: % 2d%% %03d/%03dMB", $$3 * 100L / $$0, a($$3), a($$0)),
            String.format(Locale.ROOT, "Allocation rate: %03dMB /s", a(this.g.a($$3))),
            String.format(Locale.ROOT, "Allocated: % 2d%% %03dMB", $$1 * 100L / $$0, a($$1)),
            "",
            String.format(Locale.ROOT, "CPU: %s", ejz.b()),
            "",
            String.format(Locale.ROOT, "Display: %dx%d (%s)", eqm.O().aN().k(), eqm.O().aN().l(), ejz.a()),
            ejz.c(),
            ejz.d()
         }
      );
      if (this.f.ay()) {
         return $$4;
      } else {
         if (this.i.c() == ehc.a.b) {
            gu $$5 = ((eha)this.i).a();
            dfa $$6 = this.f.u.a_($$5);
            $$4.add("");
            $$4.add(n.t + "Targeted Block: " + $$5.u() + ", " + $$5.v() + ", " + $$5.w());
            $$4.add(String.valueOf(jb.f.b($$6.b())));
            UnmodifiableIterator var12 = $$6.C().entrySet().iterator();

            while (var12.hasNext()) {
               Entry<dgd<?>, Comparable<?>> $$7 = (Entry<dgd<?>, Comparable<?>>)var12.next();
               $$4.add(this.a($$7));
            }

            $$6.s().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         if (this.j.c() == ehc.a.b) {
            gu $$8 = ((eha)this.j).a();
            ead $$9 = this.f.u.b_($$8);
            $$4.add("");
            $$4.add(n.t + "Targeted Fluid: " + $$8.u() + ", " + $$8.v() + ", " + $$8.w());
            $$4.add(String.valueOf(jb.d.b($$9.a())));
            UnmodifiableIterator var17 = $$9.C().entrySet().iterator();

            while (var17.hasNext()) {
               Entry<dgd<?>, Comparable<?>> $$10 = (Entry<dgd<?>, Comparable<?>>)var17.next();
               $$4.add(this.a($$10));
            }

            $$9.k().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         bii $$11 = this.f.x;
         if ($$11 != null) {
            $$4.add("");
            $$4.add(n.t + "Targeted Entity");
            $$4.add(String.valueOf(jb.h.b($$11.ag())));
         }

         return $$4;
      }
   }

   private String a(Entry<dgd<?>, Comparable<?>> $$0) {
      dgd<?> $$1 = $$0.getKey();
      Comparable<?> $$2 = $$0.getValue();
      String $$3 = ac.a($$1, $$2);
      if (Boolean.TRUE.equals($$2)) {
         $$3 = n.k + $$3;
      } else if (Boolean.FALSE.equals($$2)) {
         $$3 = n.m + $$3;
      }

      return $$1.f() + ": " + $$3;
   }

   private static long a(long $$0) {
      return $$0 / 1024L / 1024L;
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
