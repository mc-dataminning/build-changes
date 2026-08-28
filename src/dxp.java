import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dxp {
   public static final int a = 8;
   private static final EnumSet<eao.a> o = EnumSet.of(eao.a.c, eao.a.a);
   public static final EnumSet<eao.a> b = EnumSet.of(eao.a.d, eao.a.b, eao.a.e, eao.a.f);
   public static final dxp c = a("empty", null, o, dxt.a);
   public static final dxp d = a("structure_starts", c, o, dxt.a);
   public static final dxp e = a("structure_references", d, o, dxt.a);
   public static final dxp f = a("biomes", e, o, dxt.a);
   public static final dxp g = a("noise", f, o, dxt.a);
   public static final dxp h = a("surface", g, o, dxt.a);
   public static final dxp i = a("carvers", h, b, dxt.a);
   public static final dxp j = a("features", i, b, dxt.a);
   public static final dxp k = a("initialize_light", j, b, dxt.a);
   public static final dxp l = a("light", k, b, dxt.a);
   public static final dxp m = a("spawn", l, b, dxt.a);
   public static final dxp n = a("full", m, b, dxt.b);
   private final int p;
   private final dxp q;
   private final dxt r;
   private final EnumSet<eao.a> s;

   private static dxp a(String $$0, @Nullable dxp $$1, EnumSet<eao.a> $$2, dxt $$3) {
      return kb.a(lv.l, $$0, new dxp($$1, $$2, $$3));
   }

   public static List<dxp> a() {
      List<dxp> $$0 = Lists.newArrayList();

      dxp $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dxp(@Nullable dxp $$0, EnumSet<eao.a> $$1, dxt $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dxp c() {
      return this.q;
   }

   public dxt d() {
      return this.r;
   }

   public static dxp a(String $$0) {
      return lv.l.a(ale.c($$0));
   }

   public EnumSet<eao.a> e() {
      return this.s;
   }

   public boolean a(dxp $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dxp $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dxp $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dxp $$0) {
      return this.b() < $$0.b();
   }

   public static dxp a(dxp $$0, dxp $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return lv.l.b(this).toString();
   }
}
