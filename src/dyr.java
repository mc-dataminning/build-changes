import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dyr {
   public static final int a = 8;
   private static final EnumSet<ebq.a> o = EnumSet.of(ebq.a.c, ebq.a.a);
   public static final EnumSet<ebq.a> b = EnumSet.of(ebq.a.d, ebq.a.b, ebq.a.e, ebq.a.f);
   public static final dyr c = a("empty", null, o, dyv.a);
   public static final dyr d = a("structure_starts", c, o, dyv.a);
   public static final dyr e = a("structure_references", d, o, dyv.a);
   public static final dyr f = a("biomes", e, o, dyv.a);
   public static final dyr g = a("noise", f, o, dyv.a);
   public static final dyr h = a("surface", g, o, dyv.a);
   public static final dyr i = a("carvers", h, b, dyv.a);
   public static final dyr j = a("features", i, b, dyv.a);
   public static final dyr k = a("initialize_light", j, b, dyv.a);
   public static final dyr l = a("light", k, b, dyv.a);
   public static final dyr m = a("spawn", l, b, dyv.a);
   public static final dyr n = a("full", m, b, dyv.b);
   private final int p;
   private final dyr q;
   private final dyv r;
   private final EnumSet<ebq.a> s;

   private static dyr a(String $$0, @Nullable dyr $$1, EnumSet<ebq.a> $$2, dyv $$3) {
      return kd.a(lz.l, $$0, new dyr($$1, $$2, $$3));
   }

   public static List<dyr> a() {
      List<dyr> $$0 = Lists.newArrayList();

      dyr $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dyr(@Nullable dyr $$0, EnumSet<ebq.a> $$1, dyv $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dyr c() {
      return this.q;
   }

   public dyv d() {
      return this.r;
   }

   public static dyr a(String $$0) {
      return lz.l.a(alj.c($$0));
   }

   public EnumSet<ebq.a> e() {
      return this.s;
   }

   public boolean a(dyr $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dyr $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dyr $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dyr $$0) {
      return this.b() < $$0.b();
   }

   public static dyr a(dyr $$0, dyr $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return lz.l.b(this).toString();
   }
}
