import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dvz {
   public static final int a = 8;
   private static final EnumSet<dyy.a> o = EnumSet.of(dyy.a.c, dyy.a.a);
   public static final EnumSet<dyy.a> b = EnumSet.of(dyy.a.d, dyy.a.b, dyy.a.e, dyy.a.f);
   public static final dvz c = a("empty", null, o, dwd.a);
   public static final dvz d = a("structure_starts", c, o, dwd.a);
   public static final dvz e = a("structure_references", d, o, dwd.a);
   public static final dvz f = a("biomes", e, o, dwd.a);
   public static final dvz g = a("noise", f, o, dwd.a);
   public static final dvz h = a("surface", g, o, dwd.a);
   public static final dvz i = a("carvers", h, b, dwd.a);
   public static final dvz j = a("features", i, b, dwd.a);
   public static final dvz k = a("initialize_light", j, b, dwd.a);
   public static final dvz l = a("light", k, b, dwd.a);
   public static final dvz m = a("spawn", l, b, dwd.a);
   public static final dvz n = a("full", m, b, dwd.b);
   private final int p;
   private final dvz q;
   private final dwd r;
   private final EnumSet<dyy.a> s;

   private static dvz a(String $$0, @Nullable dvz $$1, EnumSet<dyy.a> $$2, dwd $$3) {
      return jz.a(lt.l, $$0, new dvz($$1, $$2, $$3));
   }

   public static List<dvz> a() {
      List<dvz> $$0 = Lists.newArrayList();

      dvz $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dvz(@Nullable dvz $$0, EnumSet<dyy.a> $$1, dwd $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dvz c() {
      return this.q;
   }

   public dwd d() {
      return this.r;
   }

   public static dvz a(String $$0) {
      return lt.l.a(akr.c($$0));
   }

   public EnumSet<dyy.a> e() {
      return this.s;
   }

   public boolean a(dvz $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dvz $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dvz $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dvz $$0) {
      return this.b() < $$0.b();
   }

   public static dvz a(dvz $$0, dvz $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return lt.l.b(this).toString();
   }
}
