import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class eaq {
   public static final int a = 8;
   private static final EnumSet<edp.a> o = EnumSet.of(edp.a.c, edp.a.a);
   public static final EnumSet<edp.a> b = EnumSet.of(edp.a.d, edp.a.b, edp.a.e, edp.a.f);
   public static final eaq c = a("empty", null, o, eau.a);
   public static final eaq d = a("structure_starts", c, o, eau.a);
   public static final eaq e = a("structure_references", d, o, eau.a);
   public static final eaq f = a("biomes", e, o, eau.a);
   public static final eaq g = a("noise", f, o, eau.a);
   public static final eaq h = a("surface", g, o, eau.a);
   public static final eaq i = a("carvers", h, b, eau.a);
   public static final eaq j = a("features", i, b, eau.a);
   public static final eaq k = a("initialize_light", j, b, eau.a);
   public static final eaq l = a("light", k, b, eau.a);
   public static final eaq m = a("spawn", l, b, eau.a);
   public static final eaq n = a("full", m, b, eau.b);
   private final int p;
   private final eaq q;
   private final eau r;
   private final EnumSet<edp.a> s;

   private static eaq a(String $$0, @Nullable eaq $$1, EnumSet<edp.a> $$2, eau $$3) {
      return kd.a(ma.l, $$0, new eaq($$1, $$2, $$3));
   }

   public static List<eaq> a() {
      List<eaq> $$0 = Lists.newArrayList();

      eaq $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected eaq(@Nullable eaq $$0, EnumSet<edp.a> $$1, eau $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public eaq c() {
      return this.q;
   }

   public eau d() {
      return this.r;
   }

   public static eaq a(String $$0) {
      return ma.l.a(alz.c($$0));
   }

   public EnumSet<edp.a> e() {
      return this.s;
   }

   public boolean a(eaq $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(eaq $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(eaq $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(eaq $$0) {
      return this.b() < $$0.b();
   }

   public static eaq a(eaq $$0, eaq $$1) {
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
