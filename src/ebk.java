import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class ebk {
   public static final int a = 8;
   private static final EnumSet<eel.a> o = EnumSet.of(eel.a.c, eel.a.a);
   public static final EnumSet<eel.a> b = EnumSet.of(eel.a.d, eel.a.b, eel.a.e, eel.a.f);
   public static final ebk c = a("empty", null, o, ebo.a);
   public static final ebk d = a("structure_starts", c, o, ebo.a);
   public static final ebk e = a("structure_references", d, o, ebo.a);
   public static final ebk f = a("biomes", e, o, ebo.a);
   public static final ebk g = a("noise", f, o, ebo.a);
   public static final ebk h = a("surface", g, o, ebo.a);
   public static final ebk i = a("carvers", h, b, ebo.a);
   public static final ebk j = a("features", i, b, ebo.a);
   public static final ebk k = a("initialize_light", j, b, ebo.a);
   public static final ebk l = a("light", k, b, ebo.a);
   public static final ebk m = a("spawn", l, b, ebo.a);
   public static final ebk n = a("full", m, b, ebo.b);
   private final int p;
   private final ebk q;
   private final ebo r;
   private final EnumSet<eel.a> s;

   private static ebk a(String $$0, @Nullable ebk $$1, EnumSet<eel.a> $$2, ebo $$3) {
      return kf.a(md.l, $$0, new ebk($$1, $$2, $$3));
   }

   public static List<ebk> a() {
      List<ebk> $$0 = Lists.newArrayList();

      ebk $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected ebk(@Nullable ebk $$0, EnumSet<eel.a> $$1, ebo $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public ebk c() {
      return this.q;
   }

   public ebo d() {
      return this.r;
   }

   public static ebk a(String $$0) {
      return md.l.a(ald.c($$0));
   }

   public EnumSet<eel.a> e() {
      return this.s;
   }

   public boolean a(ebk $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(ebk $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(ebk $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(ebk $$0) {
      return this.b() < $$0.b();
   }

   public static ebk a(ebk $$0, ebk $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return md.l.b(this).toString();
   }
}
