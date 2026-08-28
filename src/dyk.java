import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dyk {
   public static final int a = 8;
   private static final EnumSet<ebj.a> o = EnumSet.of(ebj.a.c, ebj.a.a);
   public static final EnumSet<ebj.a> b = EnumSet.of(ebj.a.d, ebj.a.b, ebj.a.e, ebj.a.f);
   public static final dyk c = a("empty", null, o, dyo.a);
   public static final dyk d = a("structure_starts", c, o, dyo.a);
   public static final dyk e = a("structure_references", d, o, dyo.a);
   public static final dyk f = a("biomes", e, o, dyo.a);
   public static final dyk g = a("noise", f, o, dyo.a);
   public static final dyk h = a("surface", g, o, dyo.a);
   public static final dyk i = a("carvers", h, b, dyo.a);
   public static final dyk j = a("features", i, b, dyo.a);
   public static final dyk k = a("initialize_light", j, b, dyo.a);
   public static final dyk l = a("light", k, b, dyo.a);
   public static final dyk m = a("spawn", l, b, dyo.a);
   public static final dyk n = a("full", m, b, dyo.b);
   private final int p;
   private final dyk q;
   private final dyo r;
   private final EnumSet<ebj.a> s;

   private static dyk a(String $$0, @Nullable dyk $$1, EnumSet<ebj.a> $$2, dyo $$3) {
      return kd.a(lz.l, $$0, new dyk($$1, $$2, $$3));
   }

   public static List<dyk> a() {
      List<dyk> $$0 = Lists.newArrayList();

      dyk $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dyk(@Nullable dyk $$0, EnumSet<ebj.a> $$1, dyo $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dyk c() {
      return this.q;
   }

   public dyo d() {
      return this.r;
   }

   public static dyk a(String $$0) {
      return lz.l.a(all.c($$0));
   }

   public EnumSet<ebj.a> e() {
      return this.s;
   }

   public boolean a(dyk $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dyk $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dyk $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dyk $$0) {
      return this.b() < $$0.b();
   }

   public static dyk a(dyk $$0, dyk $$1) {
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
