import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class eak {
   public static final int a = 8;
   private static final EnumSet<edj.a> o = EnumSet.of(edj.a.c, edj.a.a);
   public static final EnumSet<edj.a> b = EnumSet.of(edj.a.d, edj.a.b, edj.a.e, edj.a.f);
   public static final eak c = a("empty", null, o, eao.a);
   public static final eak d = a("structure_starts", c, o, eao.a);
   public static final eak e = a("structure_references", d, o, eao.a);
   public static final eak f = a("biomes", e, o, eao.a);
   public static final eak g = a("noise", f, o, eao.a);
   public static final eak h = a("surface", g, o, eao.a);
   public static final eak i = a("carvers", h, b, eao.a);
   public static final eak j = a("features", i, b, eao.a);
   public static final eak k = a("initialize_light", j, b, eao.a);
   public static final eak l = a("light", k, b, eao.a);
   public static final eak m = a("spawn", l, b, eao.a);
   public static final eak n = a("full", m, b, eao.b);
   private final int p;
   private final eak q;
   private final eao r;
   private final EnumSet<edj.a> s;

   private static eak a(String $$0, @Nullable eak $$1, EnumSet<edj.a> $$2, eao $$3) {
      return kd.a(ma.l, $$0, new eak($$1, $$2, $$3));
   }

   public static List<eak> a() {
      List<eak> $$0 = Lists.newArrayList();

      eak $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected eak(@Nullable eak $$0, EnumSet<edj.a> $$1, eao $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public eak c() {
      return this.q;
   }

   public eao d() {
      return this.r;
   }

   public static eak a(String $$0) {
      return ma.l.a(alp.c($$0));
   }

   public EnumSet<edj.a> e() {
      return this.s;
   }

   public boolean a(eak $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(eak $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(eak $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(eak $$0) {
      return this.b() < $$0.b();
   }

   public static eak a(eak $$0, eak $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return ma.l.b(this).toString();
   }
}
