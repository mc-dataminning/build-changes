import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dzu {
   public static final int a = 8;
   private static final EnumSet<ect.a> o = EnumSet.of(ect.a.c, ect.a.a);
   public static final EnumSet<ect.a> b = EnumSet.of(ect.a.d, ect.a.b, ect.a.e, ect.a.f);
   public static final dzu c = a("empty", null, o, dzy.a);
   public static final dzu d = a("structure_starts", c, o, dzy.a);
   public static final dzu e = a("structure_references", d, o, dzy.a);
   public static final dzu f = a("biomes", e, o, dzy.a);
   public static final dzu g = a("noise", f, o, dzy.a);
   public static final dzu h = a("surface", g, o, dzy.a);
   public static final dzu i = a("carvers", h, b, dzy.a);
   public static final dzu j = a("features", i, b, dzy.a);
   public static final dzu k = a("initialize_light", j, b, dzy.a);
   public static final dzu l = a("light", k, b, dzy.a);
   public static final dzu m = a("spawn", l, b, dzy.a);
   public static final dzu n = a("full", m, b, dzy.b);
   private final int p;
   private final dzu q;
   private final dzy r;
   private final EnumSet<ect.a> s;

   private static dzu a(String $$0, @Nullable dzu $$1, EnumSet<ect.a> $$2, dzy $$3) {
      return ke.a(mb.l, $$0, new dzu($$1, $$2, $$3));
   }

   public static List<dzu> a() {
      List<dzu> $$0 = Lists.newArrayList();

      dzu $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dzu(@Nullable dzu $$0, EnumSet<ect.a> $$1, dzy $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dzu c() {
      return this.q;
   }

   public dzy d() {
      return this.r;
   }

   public static dzu a(String $$0) {
      return mb.l.a(akv.c($$0));
   }

   public EnumSet<ect.a> e() {
      return this.s;
   }

   public boolean a(dzu $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dzu $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dzu $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dzu $$0) {
      return this.b() < $$0.b();
   }

   public static dzu a(dzu $$0, dzu $$1) {
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
