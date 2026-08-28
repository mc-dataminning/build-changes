import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dxl {
   public static final int a = 8;
   private static final EnumSet<eak.a> o = EnumSet.of(eak.a.c, eak.a.a);
   public static final EnumSet<eak.a> b = EnumSet.of(eak.a.d, eak.a.b, eak.a.e, eak.a.f);
   public static final dxl c = a("empty", null, o, dxp.a);
   public static final dxl d = a("structure_starts", c, o, dxp.a);
   public static final dxl e = a("structure_references", d, o, dxp.a);
   public static final dxl f = a("biomes", e, o, dxp.a);
   public static final dxl g = a("noise", f, o, dxp.a);
   public static final dxl h = a("surface", g, o, dxp.a);
   public static final dxl i = a("carvers", h, b, dxp.a);
   public static final dxl j = a("features", i, b, dxp.a);
   public static final dxl k = a("initialize_light", j, b, dxp.a);
   public static final dxl l = a("light", k, b, dxp.a);
   public static final dxl m = a("spawn", l, b, dxp.a);
   public static final dxl n = a("full", m, b, dxp.b);
   private final int p;
   private final dxl q;
   private final dxp r;
   private final EnumSet<eak.a> s;

   private static dxl a(String $$0, @Nullable dxl $$1, EnumSet<eak.a> $$2, dxp $$3) {
      return ka.a(lu.l, $$0, new dxl($$1, $$2, $$3));
   }

   public static List<dxl> a() {
      List<dxl> $$0 = Lists.newArrayList();

      dxl $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dxl(@Nullable dxl $$0, EnumSet<eak.a> $$1, dxp $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dxl c() {
      return this.q;
   }

   public dxp d() {
      return this.r;
   }

   public static dxl a(String $$0) {
      return lu.l.a(alc.c($$0));
   }

   public EnumSet<eak.a> e() {
      return this.s;
   }

   public boolean a(dxl $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dxl $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dxl $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dxl $$0) {
      return this.b() < $$0.b();
   }

   public static dxl a(dxl $$0, dxl $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return lu.l.b(this).toString();
   }
}
