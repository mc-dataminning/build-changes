import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fmy implements fnd.a {
   private static final boolean a = true;
   private static final boolean b = true;
   private static final boolean c = true;
   private static final boolean d = true;
   private static final boolean e = true;
   private static final boolean f = false;
   private static final boolean g = true;
   private static final boolean h = true;
   private static final boolean i = true;
   private static final boolean j = true;
   private static final boolean k = true;
   private static final boolean l = true;
   private static final boolean m = true;
   private static final boolean n = true;
   private static final int o = 30;
   private static final int p = 30;
   private static final int q = 8;
   private static final int r = 20;
   private static final float s = 0.02F;
   private static final int t = -1;
   private static final int u = -256;
   private static final int v = -23296;
   private static final int w = -16711936;
   private static final int x = -3355444;
   private static final int y = -98404;
   private static final int z = -65536;
   private final enn A;
   private final Map<gu, fmy.b> B = Maps.newHashMap();
   private final Map<UUID, fmy.a> C = Maps.newHashMap();
   private UUID D;

   public fmy(enn $$0) {
      this.A = $$0;
   }

   @Override
   public void a() {
      this.B.clear();
      this.C.clear();
      this.D = null;
   }

   public void a(fmy.b $$0) {
      this.B.put($$0.a, $$0);
   }

   public void a(fmy.a $$0) {
      this.C.put($$0.a, $$0);
   }

   public void a(int $$0) {
      this.C.values().removeIf($$1 -> $$1.b == $$0);
   }

   @Override
   public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
      this.c();
      this.b();
      this.a($$0, $$1);
      if (!this.A.t.G_()) {
         this.g();
      }
   }

   private void b() {
      this.C.entrySet().removeIf($$0 -> this.A.s.a($$0.getValue().b) == null);
   }

   private void c() {
      long $$0 = this.A.s.V() - 20L;
      this.B.entrySet().removeIf($$1 -> $$1.getValue().f < $$0);
   }

   private void a(eij $$0, fjx $$1) {
      gu $$2 = this.e().c();
      this.C.values().forEach($$2x -> {
         if (this.c($$2x)) {
            this.b($$0, $$1, $$2x);
         }
      });
      this.b($$0, $$1);

      for (gu $$3 : this.B.keySet()) {
         if ($$2.a($$3, 30.0)) {
            a($$0, $$1, $$3);
         }
      }

      Map<gu, Set<UUID>> $$4 = this.d();
      this.B.values().forEach($$4x -> {
         if ($$2.a($$4x.a, 30.0)) {
            Set<UUID> $$5 = $$4.get($$4x.a);
            this.a($$0, $$1, $$4x, (Collection<UUID>)($$5 == null ? Sets.newHashSet() : $$5));
         }
      });
      this.f().forEach(($$3x, $$4x) -> {
         if ($$2.a($$3x, 30.0)) {
            this.a($$0, $$1, $$3x, (List<String>)$$4x);
         }
      });
   }

   private Map<gu, Set<UUID>> d() {
      Map<gu, Set<UUID>> $$0 = Maps.newHashMap();
      this.C.values().forEach($$1 -> $$1.i.forEach($$2 -> $$0.computeIfAbsent($$2, $$0xxx -> Sets.newHashSet()).add($$1.a())));
      return $$0;
   }

   private void b(eij $$0, fjx $$1) {
      Map<gu, Set<UUID>> $$2 = Maps.newHashMap();
      this.C.values().stream().filter(fmy.a::c).forEach($$1x -> $$2.computeIfAbsent($$1x.f, $$0xx -> Sets.newHashSet()).add($$1x.a()));
      $$2.entrySet().forEach($$2x -> {
         gu $$3 = (gu)$$2x.getKey();
         Set<UUID> $$4 = (Set<UUID>)$$2x.getValue();
         Set<String> $$5 = $$4.stream().map(yz::a).collect(Collectors.toSet());
         int $$6 = 1;
         a($$0, $$1, $$5.toString(), $$3, $$6++, -256);
         a($$0, $$1, "Flower", $$3, $$6++, -1);
         float $$7 = 0.05F;
         fnd.a($$0, $$1, $$3, 0.05F, 0.8F, 0.8F, 0.0F, 0.3F);
      });
   }

   private static String a(Collection<UUID> $$0) {
      if ($$0.isEmpty()) {
         return "-";
      } else {
         return $$0.size() > 3 ? $$0.size() + " bees" : $$0.stream().map(yz::a).collect(Collectors.toSet()).toString();
      }
   }

   private static void a(eij $$0, fjx $$1, gu $$2) {
      float $$3 = 0.05F;
      fnd.a($$0, $$1, $$2, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
   }

   private void a(eij $$0, fjx $$1, gu $$2, List<String> $$3) {
      float $$4 = 0.05F;
      fnd.a($$0, $$1, $$2, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
      a($$0, $$1, $$3 + "", $$2, 0, -256);
      a($$0, $$1, "Ghost Hive", $$2, 1, -65536);
   }

   private void a(eij $$0, fjx $$1, fmy.b $$2, Collection<UUID> $$3) {
      int $$4 = 0;
      if (!$$3.isEmpty()) {
         a($$0, $$1, "Blacklisted by " + a($$3), $$2, $$4++, -65536);
      }

      a($$0, $$1, "Out: " + a(this.a($$2.a)), $$2, $$4++, -3355444);
      if ($$2.c == 0) {
         a($$0, $$1, "In: -", $$2, $$4++, -256);
      } else if ($$2.c == 1) {
         a($$0, $$1, "In: 1 bee", $$2, $$4++, -256);
      } else {
         a($$0, $$1, "In: " + $$2.c + " bees", $$2, $$4++, -256);
      }

      a($$0, $$1, "Honey: " + $$2.d, $$2, $$4++, -23296);
      a($$0, $$1, $$2.b + ($$2.e ? " (sedated)" : ""), $$2, $$4++, -1);
   }

   private void a(eij $$0, fjx $$1, fmy.a $$2) {
      if ($$2.d != null) {
         fnl.a($$0, $$1, $$2.d, 0.5F, false, false, this.e().b().a(), this.e().b().b(), this.e().b().c());
      }
   }

   private void b(eij $$0, fjx $$1, fmy.a $$2) {
      boolean $$3 = this.b($$2);
      int $$4 = 0;
      a($$0, $$1, $$2.c, $$4++, $$2.toString(), -1, 0.03F);
      if ($$2.e == null) {
         a($$0, $$1, $$2.c, $$4++, "No hive", -98404, 0.02F);
      } else {
         a($$0, $$1, $$2.c, $$4++, "Hive: " + this.a($$2, $$2.e), -256, 0.02F);
      }

      if ($$2.f == null) {
         a($$0, $$1, $$2.c, $$4++, "No flower", -98404, 0.02F);
      } else {
         a($$0, $$1, $$2.c, $$4++, "Flower: " + this.a($$2, $$2.f), -256, 0.02F);
      }

      for (String $$5 : $$2.h) {
         a($$0, $$1, $$2.c, $$4++, $$5, -16711936, 0.02F);
      }

      if ($$3) {
         this.a($$0, $$1, $$2);
      }

      if ($$2.g > 0) {
         int $$6 = $$2.g < 600 ? -3355444 : -23296;
         a($$0, $$1, $$2.c, $$4++, "Travelling: " + $$2.g + " ticks", $$6, 0.02F);
      }
   }

   private static void a(eij $$0, fjx $$1, String $$2, fmy.b $$3, int $$4, int $$5) {
      gu $$6 = $$3.a;
      a($$0, $$1, $$2, $$6, $$4, $$5);
   }

   private static void a(eij $$0, fjx $$1, String $$2, gu $$3, int $$4, int $$5) {
      double $$6 = 1.3;
      double $$7 = 0.2;
      double $$8 = (double)$$3.u() + 0.5;
      double $$9 = (double)$$3.v() + 1.3 + (double)$$4 * 0.2;
      double $$10 = (double)$$3.w() + 0.5;
      fnd.a($$0, $$1, $$2, $$8, $$9, $$10, $$5, 0.02F, true, 0.0F, true);
   }

   private static void a(eij $$0, fjx $$1, ho $$2, int $$3, String $$4, int $$5, float $$6) {
      double $$7 = 2.4;
      double $$8 = 0.25;
      gu $$9 = gu.a($$2);
      double $$10 = (double)$$9.u() + 0.5;
      double $$11 = $$2.b() + 2.4 + (double)$$3 * 0.25;
      double $$12 = (double)$$9.w() + 0.5;
      float $$13 = 0.5F;
      fnd.a($$0, $$1, $$4, $$10, $$11, $$12, $$5, $$6, false, 0.5F, true);
   }

   private emz e() {
      return this.A.j.m();
   }

   private Set<String> b(fmy.b $$0) {
      return this.a($$0.a).stream().map(yz::a).collect(Collectors.toSet());
   }

   private String a(fmy.a $$0, gu $$1) {
      double $$2 = Math.sqrt($$1.b($$0.c));
      double $$3 = (double)Math.round($$2 * 10.0) / 10.0;
      return $$1.x() + " (dist " + $$3 + ")";
   }

   private boolean b(fmy.a $$0) {
      return Objects.equals(this.D, $$0.a);
   }

   private boolean c(fmy.a $$0) {
      byo $$1 = this.A.t;
      gu $$2 = gu.a($$1.dn(), $$0.c.b(), $$1.dt());
      gu $$3 = gu.a($$0.c);
      return $$2.a($$3, 30.0);
   }

   private Collection<UUID> a(gu $$0) {
      return this.C.values().stream().filter($$1 -> $$1.a($$0)).map(fmy.a::a).collect(Collectors.toSet());
   }

   private Map<gu, List<String>> f() {
      Map<gu, List<String>> $$0 = Maps.newHashMap();

      for (fmy.a $$1 : this.C.values()) {
         if ($$1.e != null && !this.B.containsKey($$1.e)) {
            $$0.computeIfAbsent($$1.e, $$0x -> Lists.newArrayList()).add($$1.b());
         }
      }

      return $$0;
   }

   private void g() {
      fnd.a(this.A.al(), 8).ifPresent($$0 -> this.D = $$0.ct());
   }

   public static class a {
      public final UUID a;
      public final int b;
      public final ho c;
      @Nullable
      public final dxt d;
      @Nullable
      public final gu e;
      @Nullable
      public final gu f;
      public final int g;
      public final List<String> h = Lists.newArrayList();
      public final Set<gu> i = Sets.newHashSet();

      public a(UUID $$0, int $$1, ho $$2, @Nullable dxt $$3, @Nullable gu $$4, @Nullable gu $$5, int $$6) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
      }

      public boolean a(gu $$0) {
         return this.e != null && this.e.equals($$0);
      }

      public UUID a() {
         return this.a;
      }

      public String b() {
         return yz.a(this.a);
      }

      @Override
      public String toString() {
         return this.b();
      }

      public boolean c() {
         return this.f != null;
      }
   }

   public static class b {
      public final gu a;
      public final String b;
      public final int c;
      public final int d;
      public final boolean e;
      public final long f;

      public b(gu $$0, String $$1, int $$2, int $$3, boolean $$4, long $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }
   }
}
