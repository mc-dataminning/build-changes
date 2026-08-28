import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class edm {
   public static final int a = 8;
   private static final EnumSet<egn.a> p = EnumSet.of(egn.a.c, egn.a.a);
   public static final EnumSet<egn.a> b = EnumSet.of(egn.a.d, egn.a.b, egn.a.e, egn.a.f);
   public static final edm c = a("empty", null, p, edq.a);
   public static final edm d = a("structure_starts", c, p, edq.a);
   public static final edm e = a("structure_references", d, p, edq.a);
   public static final edm f = a("biomes", e, p, edq.a);
   public static final edm g = a("noise", f, p, edq.a);
   public static final edm h = a("surface", g, p, edq.a);
   public static final edm i = a("carvers", h, b, edq.a);
   public static final edm j = a("features", i, b, edq.a);
   public static final edm k = a("initialize_light", j, b, edq.a);
   public static final edm l = a("light", k, b, edq.a);
   public static final edm m = a("spawn", l, b, edq.a);
   public static final edm n = a("full", m, b, edq.b);
   public static final Codec<edm> o = mg.l.q();
   private final int q;
   private final edm r;
   private final edq s;
   private final EnumSet<egn.a> t;

   private static edm a(String $$0, @Nullable edm $$1, EnumSet<egn.a> $$2, edq $$3) {
      return js.a(mg.l, $$0, new edm($$1, $$2, $$3));
   }

   public static List<edm> a() {
      List<edm> $$0 = Lists.newArrayList();

      edm $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected edm(@Nullable edm $$0, EnumSet<egn.a> $$1, edq $$2) {
      this.r = $$0 == null ? this : $$0;
      this.s = $$2;
      this.t = $$1;
      this.q = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.q;
   }

   public edm c() {
      return this.r;
   }

   public edq d() {
      return this.s;
   }

   public static edm a(String $$0) {
      return mg.l.a(alg.c($$0));
   }

   public EnumSet<egn.a> e() {
      return this.t;
   }

   public boolean a(edm $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(edm $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(edm $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(edm $$0) {
      return this.b() < $$0.b();
   }

   public static edm a(edm $$0, edm $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return mg.l.b(this).toString();
   }
}
