import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class ecm {
   public static final int a = 8;
   private static final EnumSet<efn.a> o = EnumSet.of(efn.a.c, efn.a.a);
   public static final EnumSet<efn.a> b = EnumSet.of(efn.a.d, efn.a.b, efn.a.e, efn.a.f);
   public static final ecm c = a("empty", null, o, ecq.a);
   public static final ecm d = a("structure_starts", c, o, ecq.a);
   public static final ecm e = a("structure_references", d, o, ecq.a);
   public static final ecm f = a("biomes", e, o, ecq.a);
   public static final ecm g = a("noise", f, o, ecq.a);
   public static final ecm h = a("surface", g, o, ecq.a);
   public static final ecm i = a("carvers", h, b, ecq.a);
   public static final ecm j = a("features", i, b, ecq.a);
   public static final ecm k = a("initialize_light", j, b, ecq.a);
   public static final ecm l = a("light", k, b, ecq.a);
   public static final ecm m = a("spawn", l, b, ecq.a);
   public static final ecm n = a("full", m, b, ecq.b);
   private final int p;
   private final ecm q;
   private final ecq r;
   private final EnumSet<efn.a> s;

   private static ecm a(String $$0, @Nullable ecm $$1, EnumSet<efn.a> $$2, ecq $$3) {
      return jr.a(mf.l, $$0, new ecm($$1, $$2, $$3));
   }

   public static List<ecm> a() {
      List<ecm> $$0 = Lists.newArrayList();

      ecm $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected ecm(@Nullable ecm $$0, EnumSet<efn.a> $$1, ecq $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public ecm c() {
      return this.q;
   }

   public ecq d() {
      return this.r;
   }

   public static ecm a(String $$0) {
      return mf.l.a(ale.c($$0));
   }

   public EnumSet<efn.a> e() {
      return this.s;
   }

   public boolean a(ecm $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(ecm $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(ecm $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(ecm $$0) {
      return this.b() < $$0.b();
   }

   public static ecm a(ecm $$0, ecm $$1) {
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
