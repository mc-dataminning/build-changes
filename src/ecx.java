import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class ecx {
   public static final int a = 8;
   private static final EnumSet<efy.a> o = EnumSet.of(efy.a.c, efy.a.a);
   public static final EnumSet<efy.a> b = EnumSet.of(efy.a.d, efy.a.b, efy.a.e, efy.a.f);
   public static final ecx c = a("empty", null, o, edb.a);
   public static final ecx d = a("structure_starts", c, o, edb.a);
   public static final ecx e = a("structure_references", d, o, edb.a);
   public static final ecx f = a("biomes", e, o, edb.a);
   public static final ecx g = a("noise", f, o, edb.a);
   public static final ecx h = a("surface", g, o, edb.a);
   public static final ecx i = a("carvers", h, b, edb.a);
   public static final ecx j = a("features", i, b, edb.a);
   public static final ecx k = a("initialize_light", j, b, edb.a);
   public static final ecx l = a("light", k, b, edb.a);
   public static final ecx m = a("spawn", l, b, edb.a);
   public static final ecx n = a("full", m, b, edb.b);
   private final int p;
   private final ecx q;
   private final edb r;
   private final EnumSet<efy.a> s;

   private static ecx a(String $$0, @Nullable ecx $$1, EnumSet<efy.a> $$2, edb $$3) {
      return jr.a(mf.l, $$0, new ecx($$1, $$2, $$3));
   }

   public static List<ecx> a() {
      List<ecx> $$0 = Lists.newArrayList();

      ecx $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected ecx(@Nullable ecx $$0, EnumSet<efy.a> $$1, edb $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public ecx c() {
      return this.q;
   }

   public edb d() {
      return this.r;
   }

   public static ecx a(String $$0) {
      return mf.l.a(alg.c($$0));
   }

   public EnumSet<efy.a> e() {
      return this.s;
   }

   public boolean a(ecx $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(ecx $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(ecx $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(ecx $$0) {
      return this.b() < $$0.b();
   }

   public static ecx a(ecx $$0, ecx $$1) {
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
