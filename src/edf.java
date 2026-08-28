import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class edf {
   public static final int a = 8;
   private static final EnumSet<egg.a> o = EnumSet.of(egg.a.c, egg.a.a);
   public static final EnumSet<egg.a> b = EnumSet.of(egg.a.d, egg.a.b, egg.a.e, egg.a.f);
   public static final edf c = a("empty", null, o, edj.a);
   public static final edf d = a("structure_starts", c, o, edj.a);
   public static final edf e = a("structure_references", d, o, edj.a);
   public static final edf f = a("biomes", e, o, edj.a);
   public static final edf g = a("noise", f, o, edj.a);
   public static final edf h = a("surface", g, o, edj.a);
   public static final edf i = a("carvers", h, b, edj.a);
   public static final edf j = a("features", i, b, edj.a);
   public static final edf k = a("initialize_light", j, b, edj.a);
   public static final edf l = a("light", k, b, edj.a);
   public static final edf m = a("spawn", l, b, edj.a);
   public static final edf n = a("full", m, b, edj.b);
   private final int p;
   private final edf q;
   private final edj r;
   private final EnumSet<egg.a> s;

   private static edf a(String $$0, @Nullable edf $$1, EnumSet<egg.a> $$2, edj $$3) {
      return jr.a(mf.l, $$0, new edf($$1, $$2, $$3));
   }

   public static List<edf> a() {
      List<edf> $$0 = Lists.newArrayList();

      edf $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected edf(@Nullable edf $$0, EnumSet<egg.a> $$1, edj $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public edf c() {
      return this.q;
   }

   public edj d() {
      return this.r;
   }

   public static edf a(String $$0) {
      return mf.l.a(alg.c($$0));
   }

   public EnumSet<egg.a> e() {
      return this.s;
   }

   public boolean a(edf $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(edf $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(edf $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(edf $$0) {
      return this.b() < $$0.b();
   }

   public static edf a(edf $$0, edf $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return mf.l.b(this).toString();
   }
}
