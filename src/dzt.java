import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class dzt {
   public static final int a = 8;
   private static final EnumSet<ecs.a> o = EnumSet.of(ecs.a.c, ecs.a.a);
   public static final EnumSet<ecs.a> b = EnumSet.of(ecs.a.d, ecs.a.b, ecs.a.e, ecs.a.f);
   public static final dzt c = a("empty", null, o, dzx.a);
   public static final dzt d = a("structure_starts", c, o, dzx.a);
   public static final dzt e = a("structure_references", d, o, dzx.a);
   public static final dzt f = a("biomes", e, o, dzx.a);
   public static final dzt g = a("noise", f, o, dzx.a);
   public static final dzt h = a("surface", g, o, dzx.a);
   public static final dzt i = a("carvers", h, b, dzx.a);
   public static final dzt j = a("features", i, b, dzx.a);
   public static final dzt k = a("initialize_light", j, b, dzx.a);
   public static final dzt l = a("light", k, b, dzx.a);
   public static final dzt m = a("spawn", l, b, dzx.a);
   public static final dzt n = a("full", m, b, dzx.b);
   private final int p;
   private final dzt q;
   private final dzx r;
   private final EnumSet<ecs.a> s;

   private static dzt a(String $$0, @Nullable dzt $$1, EnumSet<ecs.a> $$2, dzx $$3) {
      return ke.a(mb.l, $$0, new dzt($$1, $$2, $$3));
   }

   public static List<dzt> a() {
      List<dzt> $$0 = Lists.newArrayList();

      dzt $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected dzt(@Nullable dzt $$0, EnumSet<ecs.a> $$1, dzx $$2) {
      this.q = $$0 == null ? this : $$0;
      this.r = $$2;
      this.s = $$1;
      this.p = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.p;
   }

   public dzt c() {
      return this.q;
   }

   public dzx d() {
      return this.r;
   }

   public static dzt a(String $$0) {
      return mb.l.a(aku.c($$0));
   }

   public EnumSet<ecs.a> e() {
      return this.s;
   }

   public boolean a(dzt $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(dzt $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(dzt $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(dzt $$0) {
      return this.b() < $$0.b();
   }

   public static dzt a(dzt $$0, dzt $$1) {
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
