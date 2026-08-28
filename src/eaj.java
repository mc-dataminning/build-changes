import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class eaj {
   public static final int a = 8;
   private static final EnumSet<edi.a> o = EnumSet.of(edi.a.c, edi.a.a);
   public static final EnumSet<edi.a> b = EnumSet.of(edi.a.d, edi.a.b, edi.a.e, edi.a.f);
   public static final eaj c = a("empty", null, o, ean.a);
   public static final eaj d = a("structure_starts", c, o, ean.a);
   public static final eaj e = a("structure_references", d, o, ean.a);
   public static final eaj f = a("biomes", e, o, ean.a);
   public static final eaj g = a("noise", f, o, ean.a);
   public static final eaj h = a("surface", g, o, ean.a);
   public static final eaj i = a("carvers", h, b, ean.a);
   public static final eaj j = a("features", i, b, ean.a);
   public static final eaj k = a("initialize_light", j, b, ean.a);
   public static final eaj l = a("light", k, b, ean.a);
   public static final eaj m = a("spawn", l, b, ean.a);
   public static final eaj n = a("full", m, b, ean.b);
   private final int p;
   private final eaj q;
   private final ean r;
   private final EnumSet<edi.a> s;

   private static eaj a(String $$0, @Nullable eaj $$1, EnumSet<edi.a> $$2, ean $$3) {
      return kd.a(ma.l, $$0, new eaj($$1, $$2, $$3));
   }

   public static List<eaj> a() {
      List<eaj> $$0 = Lists.newArrayList();

      eaj $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected eaj(@Nullable eaj $$0, EnumSet<edi.a> $$1, ean $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public eaj c() {
      return this.q;
   }

   public ean d() {
      return this.r;
   }

   public static eaj a(String $$0) {
      return ma.l.a(alz.c($$0));
   }

   public EnumSet<edi.a> e() {
      return this.s;
   }

   public boolean a(eaj $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(eaj $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(eaj $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(eaj $$0) {
      return this.b() < $$0.b();
   }

   public static eaj a(eaj $$0, eaj $$1) {
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
