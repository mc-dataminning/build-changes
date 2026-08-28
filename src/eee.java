import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class eee {
   public static final int a = 8;
   private static final EnumSet<ehf.a> p = EnumSet.of(ehf.a.c, ehf.a.a);
   public static final EnumSet<ehf.a> b = EnumSet.of(ehf.a.d, ehf.a.b, ehf.a.e, ehf.a.f);
   public static final eee c = a("empty", null, p, eei.a);
   public static final eee d = a("structure_starts", c, p, eei.a);
   public static final eee e = a("structure_references", d, p, eei.a);
   public static final eee f = a("biomes", e, p, eei.a);
   public static final eee g = a("noise", f, p, eei.a);
   public static final eee h = a("surface", g, p, eei.a);
   public static final eee i = a("carvers", h, b, eei.a);
   public static final eee j = a("features", i, b, eei.a);
   public static final eee k = a("initialize_light", j, b, eei.a);
   public static final eee l = a("light", k, b, eei.a);
   public static final eee m = a("spawn", l, b, eei.a);
   public static final eee n = a("full", m, b, eei.b);
   public static final Codec<eee> o = mh.l.q();
   private final int q;
   private final eee r;
   private final eei s;
   private final EnumSet<ehf.a> t;

   private static eee a(String $$0, @Nullable eee $$1, EnumSet<ehf.a> $$2, eei $$3) {
      return jt.a(mh.l, $$0, new eee($$1, $$2, $$3));
   }

   public static List<eee> a() {
      List<eee> $$0 = Lists.newArrayList();

      eee $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected eee(@Nullable eee $$0, EnumSet<ehf.a> $$1, eei $$2) {
      this.r = $$0 == null ? this : $$0;
      this.s = $$2;
      this.t = $$1;
      this.q = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.q;
   }

   public eee c() {
      return this.r;
   }

   public eei d() {
      return this.s;
   }

   public static eee a(String $$0) {
      return mh.l.a(alk.c($$0));
   }

   public EnumSet<ehf.a> e() {
      return this.t;
   }

   public boolean a(eee $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(eee $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(eee $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(eee $$0) {
      return this.b() < $$0.b();
   }

   public static eee a(eee $$0, eee $$1) {
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
