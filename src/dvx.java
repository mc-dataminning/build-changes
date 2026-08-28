import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dvx {
   public static final int a = 8;
   private static final EnumSet<dyv.a> o = EnumSet.of(dyv.a.c, dyv.a.a);
   public static final EnumSet<dyv.a> b = EnumSet.of(dyv.a.d, dyv.a.b, dyv.a.e, dyv.a.f);
   public static final dvx c = a("empty", null, o, dwb.a);
   public static final dvx d = a("structure_starts", c, o, dwb.a);
   public static final dvx e = a("structure_references", d, o, dwb.a);
   public static final dvx f = a("biomes", e, o, dwb.a);
   public static final dvx g = a("noise", f, o, dwb.a);
   public static final dvx h = a("surface", g, o, dwb.a);
   public static final dvx i = a("carvers", h, b, dwb.a);
   public static final dvx j = a("features", i, b, dwb.a);
   public static final dvx k = a("initialize_light", j, b, dwb.a);
   public static final dvx l = a("light", k, b, dwb.a);
   public static final dvx m = a("spawn", l, b, dwb.a);
   public static final dvx n = a("full", m, b, dwb.b);
   private final int p;
   private final dvx q;
   private final dwb r;
   private final EnumSet<dyv.a> s;

   private static dvx a(String $$0, @Nullable dvx $$1, EnumSet<dyv.a> $$2, dwb $$3) {
      return jz.a(lt.l, $$0, new dvx($$1, $$2, $$3));
   }

   public static List<dvx> a() {
      List<dvx> $$0 = Lists.newArrayList();

      dvx $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dvx(@Nullable dvx $$0, EnumSet<dyv.a> $$1, dwb $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dvx c() {
      return this.q;
   }

   public dwb d() {
      return this.r;
   }

   public static dvx a(String $$0) {
      return lt.l.a(akq.c($$0));
   }

   public EnumSet<dyv.a> e() {
      return this.s;
   }

   public boolean a(dvx $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dvx $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dvx $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dvx $$0) {
      return this.b() < $$0.b();
   }

   public static dvx a(dvx $$0, dvx $$1) {
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
