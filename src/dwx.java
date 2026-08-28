import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dwx {
   public static final int a = 8;
   private static final EnumSet<dzw.a> o = EnumSet.of(dzw.a.c, dzw.a.a);
   public static final EnumSet<dzw.a> b = EnumSet.of(dzw.a.d, dzw.a.b, dzw.a.e, dzw.a.f);
   public static final dwx c = a("empty", null, o, dxb.a);
   public static final dwx d = a("structure_starts", c, o, dxb.a);
   public static final dwx e = a("structure_references", d, o, dxb.a);
   public static final dwx f = a("biomes", e, o, dxb.a);
   public static final dwx g = a("noise", f, o, dxb.a);
   public static final dwx h = a("surface", g, o, dxb.a);
   public static final dwx i = a("carvers", h, b, dxb.a);
   public static final dwx j = a("features", i, b, dxb.a);
   public static final dwx k = a("initialize_light", j, b, dxb.a);
   public static final dwx l = a("light", k, b, dxb.a);
   public static final dwx m = a("spawn", l, b, dxb.a);
   public static final dwx n = a("full", m, b, dxb.b);
   private final int p;
   private final dwx q;
   private final dxb r;
   private final EnumSet<dzw.a> s;

   private static dwx a(String $$0, @Nullable dwx $$1, EnumSet<dzw.a> $$2, dxb $$3) {
      return ka.a(lu.l, $$0, new dwx($$1, $$2, $$3));
   }

   public static List<dwx> a() {
      List<dwx> $$0 = Lists.newArrayList();

      dwx $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dwx(@Nullable dwx $$0, EnumSet<dzw.a> $$1, dxb $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dwx c() {
      return this.q;
   }

   public dxb d() {
      return this.r;
   }

   public static dwx a(String $$0) {
      return lu.l.a(alb.c($$0));
   }

   public EnumSet<dzw.a> e() {
      return this.s;
   }

   public boolean a(dwx $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dwx $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dwx $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dwx $$0) {
      return this.b() < $$0.b();
   }

   public static dwx a(dwx $$0, dwx $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return lu.l.b(this).toString();
   }
}
