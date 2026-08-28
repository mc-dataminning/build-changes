import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class ear {
   public static final int a = 8;
   private static final EnumSet<edq.a> o = EnumSet.of(edq.a.c, edq.a.a);
   public static final EnumSet<edq.a> b = EnumSet.of(edq.a.d, edq.a.b, edq.a.e, edq.a.f);
   public static final ear c = a("empty", null, o, eav.a);
   public static final ear d = a("structure_starts", c, o, eav.a);
   public static final ear e = a("structure_references", d, o, eav.a);
   public static final ear f = a("biomes", e, o, eav.a);
   public static final ear g = a("noise", f, o, eav.a);
   public static final ear h = a("surface", g, o, eav.a);
   public static final ear i = a("carvers", h, b, eav.a);
   public static final ear j = a("features", i, b, eav.a);
   public static final ear k = a("initialize_light", j, b, eav.a);
   public static final ear l = a("light", k, b, eav.a);
   public static final ear m = a("spawn", l, b, eav.a);
   public static final ear n = a("full", m, b, eav.b);
   private final int p;
   private final ear q;
   private final eav r;
   private final EnumSet<edq.a> s;

   private static ear a(String $$0, @Nullable ear $$1, EnumSet<edq.a> $$2, eav $$3) {
      return kd.a(ma.l, $$0, new ear($$1, $$2, $$3));
   }

   public static List<ear> a() {
      List<ear> $$0 = Lists.newArrayList();

      ear $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected ear(@Nullable ear $$0, EnumSet<edq.a> $$1, eav $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public ear c() {
      return this.q;
   }

   public eav d() {
      return this.r;
   }

   public static ear a(String $$0) {
      return ma.l.a(alz.c($$0));
   }

   public EnumSet<edq.a> e() {
      return this.s;
   }

   public boolean a(ear $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(ear $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(ear $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(ear $$0) {
      return this.b() < $$0.b();
   }

   public static ear a(ear $$0, ear $$1) {
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
