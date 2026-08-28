import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dvi {
   public static final int a = 8;
   private static final EnumSet<dyg.a> o = EnumSet.of(dyg.a.c, dyg.a.a);
   public static final EnumSet<dyg.a> b = EnumSet.of(dyg.a.d, dyg.a.b, dyg.a.e, dyg.a.f);
   public static final dvi c = a("empty", null, o, dvm.a);
   public static final dvi d = a("structure_starts", c, o, dvm.a);
   public static final dvi e = a("structure_references", d, o, dvm.a);
   public static final dvi f = a("biomes", e, o, dvm.a);
   public static final dvi g = a("noise", f, o, dvm.a);
   public static final dvi h = a("surface", g, o, dvm.a);
   public static final dvi i = a("carvers", h, b, dvm.a);
   public static final dvi j = a("features", i, b, dvm.a);
   public static final dvi k = a("initialize_light", j, b, dvm.a);
   public static final dvi l = a("light", k, b, dvm.a);
   public static final dvi m = a("spawn", l, b, dvm.a);
   public static final dvi n = a("full", m, b, dvm.b);
   private final int p;
   private final dvi q;
   private final dvm r;
   private final EnumSet<dyg.a> s;

   private static dvi a(String $$0, @Nullable dvi $$1, EnumSet<dyg.a> $$2, dvm $$3) {
      return jw.a(lq.l, $$0, new dvi($$1, $$2, $$3));
   }

   public static List<dvi> a() {
      List<dvi> $$0 = Lists.newArrayList();

      dvi $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dvi(@Nullable dvi $$0, EnumSet<dyg.a> $$1, dvm $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dvi c() {
      return this.q;
   }

   public dvm d() {
      return this.r;
   }

   public static dvi a(String $$0) {
      return lq.l.a(akk.a($$0));
   }

   public EnumSet<dyg.a> e() {
      return this.s;
   }

   public boolean a(dvi $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dvi $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dvi $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dvi $$0) {
      return this.b() < $$0.b();
   }

   public static dvi a(dvi $$0, dvi $$1) {
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
