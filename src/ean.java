import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class ean {
   public static final int a = 8;
   private static final EnumSet<edo.a> o = EnumSet.of(edo.a.c, edo.a.a);
   public static final EnumSet<edo.a> b = EnumSet.of(edo.a.d, edo.a.b, edo.a.e, edo.a.f);
   public static final ean c = a("empty", null, o, ear.a);
   public static final ean d = a("structure_starts", c, o, ear.a);
   public static final ean e = a("structure_references", d, o, ear.a);
   public static final ean f = a("biomes", e, o, ear.a);
   public static final ean g = a("noise", f, o, ear.a);
   public static final ean h = a("surface", g, o, ear.a);
   public static final ean i = a("carvers", h, b, ear.a);
   public static final ean j = a("features", i, b, ear.a);
   public static final ean k = a("initialize_light", j, b, ear.a);
   public static final ean l = a("light", k, b, ear.a);
   public static final ean m = a("spawn", l, b, ear.a);
   public static final ean n = a("full", m, b, ear.b);
   private final int p;
   private final ean q;
   private final ear r;
   private final EnumSet<edo.a> s;

   private static ean a(String $$0, @Nullable ean $$1, EnumSet<edo.a> $$2, ear $$3) {
      return ke.a(mb.l, $$0, new ean($$1, $$2, $$3));
   }

   public static List<ean> a() {
      List<ean> $$0 = Lists.newArrayList();

      ean $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected ean(@Nullable ean $$0, EnumSet<edo.a> $$1, ear $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public ean c() {
      return this.q;
   }

   public ear d() {
      return this.r;
   }

   public static ean a(String $$0) {
      return mb.l.a(aku.c($$0));
   }

   public EnumSet<edo.a> e() {
      return this.s;
   }

   public boolean a(ean $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(ean $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(ean $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(ean $$0) {
      return this.b() < $$0.b();
   }

   public static ean a(ean $$0, ean $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return mb.l.b(this).toString();
   }
}
