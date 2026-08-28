import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dyg {
   public static final int a = 8;
   private static final EnumSet<ebf.a> o = EnumSet.of(ebf.a.c, ebf.a.a);
   public static final EnumSet<ebf.a> b = EnumSet.of(ebf.a.d, ebf.a.b, ebf.a.e, ebf.a.f);
   public static final dyg c = a("empty", null, o, dyk.a);
   public static final dyg d = a("structure_starts", c, o, dyk.a);
   public static final dyg e = a("structure_references", d, o, dyk.a);
   public static final dyg f = a("biomes", e, o, dyk.a);
   public static final dyg g = a("noise", f, o, dyk.a);
   public static final dyg h = a("surface", g, o, dyk.a);
   public static final dyg i = a("carvers", h, b, dyk.a);
   public static final dyg j = a("features", i, b, dyk.a);
   public static final dyg k = a("initialize_light", j, b, dyk.a);
   public static final dyg l = a("light", k, b, dyk.a);
   public static final dyg m = a("spawn", l, b, dyk.a);
   public static final dyg n = a("full", m, b, dyk.b);
   private final int p;
   private final dyg q;
   private final dyk r;
   private final EnumSet<ebf.a> s;

   private static dyg a(String $$0, @Nullable dyg $$1, EnumSet<ebf.a> $$2, dyk $$3) {
      return kd.a(ly.l, $$0, new dyg($$1, $$2, $$3));
   }

   public static List<dyg> a() {
      List<dyg> $$0 = Lists.newArrayList();

      dyg $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dyg(@Nullable dyg $$0, EnumSet<ebf.a> $$1, dyk $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dyg c() {
      return this.q;
   }

   public dyk d() {
      return this.r;
   }

   public static dyg a(String $$0) {
      return ly.l.a(ali.c($$0));
   }

   public EnumSet<ebf.a> e() {
      return this.s;
   }

   public boolean a(dyg $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dyg $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dyg $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dyg $$0) {
      return this.b() < $$0.b();
   }

   public static dyg a(dyg $$0, dyg $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return ly.l.b(this).toString();
   }
}
