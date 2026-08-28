import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class eeo {
   public static final int a = 8;
   private static final EnumSet<ehp.a> p = EnumSet.of(ehp.a.c, ehp.a.a);
   public static final EnumSet<ehp.a> b = EnumSet.of(ehp.a.d, ehp.a.b, ehp.a.e, ehp.a.f);
   public static final eeo c = a("empty", null, p, ees.a);
   public static final eeo d = a("structure_starts", c, p, ees.a);
   public static final eeo e = a("structure_references", d, p, ees.a);
   public static final eeo f = a("biomes", e, p, ees.a);
   public static final eeo g = a("noise", f, p, ees.a);
   public static final eeo h = a("surface", g, p, ees.a);
   public static final eeo i = a("carvers", h, b, ees.a);
   public static final eeo j = a("features", i, b, ees.a);
   public static final eeo k = a("initialize_light", j, b, ees.a);
   public static final eeo l = a("light", k, b, ees.a);
   public static final eeo m = a("spawn", l, b, ees.a);
   public static final eeo n = a("full", m, b, ees.b);
   public static final Codec<eeo> o = mh.l.q();
   private final int q;
   private final eeo r;
   private final ees s;
   private final EnumSet<ehp.a> t;

   private static eeo a(String $$0, @Nullable eeo $$1, EnumSet<ehp.a> $$2, ees $$3) {
      return jt.a(mh.l, $$0, new eeo($$1, $$2, $$3));
   }

   public static List<eeo> a() {
      List<eeo> $$0 = Lists.newArrayList();

      eeo $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected eeo(@Nullable eeo $$0, EnumSet<ehp.a> $$1, ees $$2) {
      this.r = $$0 == null ? this : $$0;
      this.s = $$2;
      this.t = $$1;
      this.q = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.q;
   }

   public eeo c() {
      return this.r;
   }

   public ees d() {
      return this.s;
   }

   public static eeo a(String $$0) {
      return mh.l.a(alr.c($$0));
   }

   public EnumSet<ehp.a> e() {
      return this.t;
   }

   public boolean a(eeo $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(eeo $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(eeo $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(eeo $$0) {
      return this.b() < $$0.b();
   }

   public static eeo a(eeo $$0, eeo $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return mh.l.b(this).toString();
   }
}
