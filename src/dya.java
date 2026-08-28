import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dya {
   public static final int a = 8;
   private static final EnumSet<eaz.a> o = EnumSet.of(eaz.a.c, eaz.a.a);
   public static final EnumSet<eaz.a> b = EnumSet.of(eaz.a.d, eaz.a.b, eaz.a.e, eaz.a.f);
   public static final dya c = a("empty", null, o, dye.a);
   public static final dya d = a("structure_starts", c, o, dye.a);
   public static final dya e = a("structure_references", d, o, dye.a);
   public static final dya f = a("biomes", e, o, dye.a);
   public static final dya g = a("noise", f, o, dye.a);
   public static final dya h = a("surface", g, o, dye.a);
   public static final dya i = a("carvers", h, b, dye.a);
   public static final dya j = a("features", i, b, dye.a);
   public static final dya k = a("initialize_light", j, b, dye.a);
   public static final dya l = a("light", k, b, dye.a);
   public static final dya m = a("spawn", l, b, dye.a);
   public static final dya n = a("full", m, b, dye.b);
   private final int p;
   private final dya q;
   private final dye r;
   private final EnumSet<eaz.a> s;

   private static dya a(String $$0, @Nullable dya $$1, EnumSet<eaz.a> $$2, dye $$3) {
      return kc.a(lx.l, $$0, new dya($$1, $$2, $$3));
   }

   public static List<dya> a() {
      List<dya> $$0 = Lists.newArrayList();

      dya $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dya(@Nullable dya $$0, EnumSet<eaz.a> $$1, dye $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dya c() {
      return this.q;
   }

   public dye d() {
      return this.r;
   }

   public static dya a(String $$0) {
      return lx.l.a(alh.c($$0));
   }

   public EnumSet<eaz.a> e() {
      return this.s;
   }

   public boolean a(dya $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dya $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dya $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dya $$0) {
      return this.b() < $$0.b();
   }

   public static dya a(dya $$0, dya $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return lx.l.b(this).toString();
   }
}
