import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dzr {
   public static final int a = 8;
   private static final EnumSet<ecq.a> o = EnumSet.of(ecq.a.c, ecq.a.a);
   public static final EnumSet<ecq.a> b = EnumSet.of(ecq.a.d, ecq.a.b, ecq.a.e, ecq.a.f);
   public static final dzr c = a("empty", null, o, dzv.a);
   public static final dzr d = a("structure_starts", c, o, dzv.a);
   public static final dzr e = a("structure_references", d, o, dzv.a);
   public static final dzr f = a("biomes", e, o, dzv.a);
   public static final dzr g = a("noise", f, o, dzv.a);
   public static final dzr h = a("surface", g, o, dzv.a);
   public static final dzr i = a("carvers", h, b, dzv.a);
   public static final dzr j = a("features", i, b, dzv.a);
   public static final dzr k = a("initialize_light", j, b, dzv.a);
   public static final dzr l = a("light", k, b, dzv.a);
   public static final dzr m = a("spawn", l, b, dzv.a);
   public static final dzr n = a("full", m, b, dzv.b);
   private final int p;
   private final dzr q;
   private final dzv r;
   private final EnumSet<ecq.a> s;

   private static dzr a(String $$0, @Nullable dzr $$1, EnumSet<ecq.a> $$2, dzv $$3) {
      return ke.a(mb.l, $$0, new dzr($$1, $$2, $$3));
   }

   public static List<dzr> a() {
      List<dzr> $$0 = Lists.newArrayList();

      dzr $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dzr(@Nullable dzr $$0, EnumSet<ecq.a> $$1, dzv $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dzr c() {
      return this.q;
   }

   public dzv d() {
      return this.r;
   }

   public static dzr a(String $$0) {
      return mb.l.a(aku.c($$0));
   }

   public EnumSet<ecq.a> e() {
      return this.s;
   }

   public boolean a(dzr $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dzr $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dzr $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dzr $$0) {
      return this.b() < $$0.b();
   }

   public static dzr a(dzr $$0, dzr $$1) {
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
