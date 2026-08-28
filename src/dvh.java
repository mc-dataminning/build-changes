import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dvh {
   public static final int a = 8;
   private static final EnumSet<dyf.a> o = EnumSet.of(dyf.a.c, dyf.a.a);
   public static final EnumSet<dyf.a> b = EnumSet.of(dyf.a.d, dyf.a.b, dyf.a.e, dyf.a.f);
   public static final dvh c = a("empty", null, o, dvl.a);
   public static final dvh d = a("structure_starts", c, o, dvl.a);
   public static final dvh e = a("structure_references", d, o, dvl.a);
   public static final dvh f = a("biomes", e, o, dvl.a);
   public static final dvh g = a("noise", f, o, dvl.a);
   public static final dvh h = a("surface", g, o, dvl.a);
   public static final dvh i = a("carvers", h, b, dvl.a);
   public static final dvh j = a("features", i, b, dvl.a);
   public static final dvh k = a("initialize_light", j, b, dvl.a);
   public static final dvh l = a("light", k, b, dvl.a);
   public static final dvh m = a("spawn", l, b, dvl.a);
   public static final dvh n = a("full", m, b, dvl.b);
   private final int p;
   private final dvh q;
   private final dvl r;
   private final EnumSet<dyf.a> s;

   private static dvh a(String $$0, @Nullable dvh $$1, EnumSet<dyf.a> $$2, dvl $$3) {
      return jw.a(lq.l, $$0, new dvh($$1, $$2, $$3));
   }

   public static List<dvh> a() {
      List<dvh> $$0 = Lists.newArrayList();

      dvh $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dvh(@Nullable dvh $$0, EnumSet<dyf.a> $$1, dvl $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dvh c() {
      return this.q;
   }

   public dvl d() {
      return this.r;
   }

   public static dvh a(String $$0) {
      return lq.l.a(akk.a($$0));
   }

   public EnumSet<dyf.a> e() {
      return this.s;
   }

   public boolean a(dvh $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dvh $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dvh $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dvh $$0) {
      return this.b() < $$0.b();
   }

   public static dvh a(dvh $$0, dvh $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return lq.l.b(this).toString();
   }
}
