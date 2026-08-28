import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dzs {
   public static final int a = 8;
   private static final EnumSet<ecr.a> o = EnumSet.of(ecr.a.c, ecr.a.a);
   public static final EnumSet<ecr.a> b = EnumSet.of(ecr.a.d, ecr.a.b, ecr.a.e, ecr.a.f);
   public static final dzs c = a("empty", null, o, dzw.a);
   public static final dzs d = a("structure_starts", c, o, dzw.a);
   public static final dzs e = a("structure_references", d, o, dzw.a);
   public static final dzs f = a("biomes", e, o, dzw.a);
   public static final dzs g = a("noise", f, o, dzw.a);
   public static final dzs h = a("surface", g, o, dzw.a);
   public static final dzs i = a("carvers", h, b, dzw.a);
   public static final dzs j = a("features", i, b, dzw.a);
   public static final dzs k = a("initialize_light", j, b, dzw.a);
   public static final dzs l = a("light", k, b, dzw.a);
   public static final dzs m = a("spawn", l, b, dzw.a);
   public static final dzs n = a("full", m, b, dzw.b);
   private final int p;
   private final dzs q;
   private final dzw r;
   private final EnumSet<ecr.a> s;

   private static dzs a(String $$0, @Nullable dzs $$1, EnumSet<ecr.a> $$2, dzw $$3) {
      return ke.a(mb.l, $$0, new dzs($$1, $$2, $$3));
   }

   public static List<dzs> a() {
      List<dzs> $$0 = Lists.newArrayList();

      dzs $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dzs(@Nullable dzs $$0, EnumSet<ecr.a> $$1, dzw $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dzs c() {
      return this.q;
   }

   public dzw d() {
      return this.r;
   }

   public static dzs a(String $$0) {
      return mb.l.a(akv.c($$0));
   }

   public EnumSet<ecr.a> e() {
      return this.s;
   }

   public boolean a(dzs $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dzs $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dzs $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dzs $$0) {
      return this.b() < $$0.b();
   }

   public static dzs a(dzs $$0, dzs $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return mb.l.b(this).toString();
   }
}
