import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class edr {
   public static final int a = 8;
   private static final EnumSet<egs.a> p = EnumSet.of(egs.a.c, egs.a.a);
   public static final EnumSet<egs.a> b = EnumSet.of(egs.a.d, egs.a.b, egs.a.e, egs.a.f);
   public static final edr c = a("empty", null, p, edv.a);
   public static final edr d = a("structure_starts", c, p, edv.a);
   public static final edr e = a("structure_references", d, p, edv.a);
   public static final edr f = a("biomes", e, p, edv.a);
   public static final edr g = a("noise", f, p, edv.a);
   public static final edr h = a("surface", g, p, edv.a);
   public static final edr i = a("carvers", h, b, edv.a);
   public static final edr j = a("features", i, b, edv.a);
   public static final edr k = a("initialize_light", j, b, edv.a);
   public static final edr l = a("light", k, b, edv.a);
   public static final edr m = a("spawn", l, b, edv.a);
   public static final edr n = a("full", m, b, edv.b);
   public static final Codec<edr> o = mg.l.q();
   private final int q;
   private final edr r;
   private final edv s;
   private final EnumSet<egs.a> t;

   private static edr a(String $$0, @Nullable edr $$1, EnumSet<egs.a> $$2, edv $$3) {
      return js.a(mg.l, $$0, new edr($$1, $$2, $$3));
   }

   public static List<edr> a() {
      List<edr> $$0 = Lists.newArrayList();

      edr $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected edr(@Nullable edr $$0, EnumSet<egs.a> $$1, edv $$2) {
      this.r = $$0 == null ? this : $$0;
      this.s = $$2;
      this.t = $$1;
      this.q = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.q;
   }

   public edr c() {
      return this.r;
   }

   public edv d() {
      return this.s;
   }

   public static edr a(String $$0) {
      return mg.l.a(alg.c($$0));
   }

   public EnumSet<egs.a> e() {
      return this.t;
   }

   public boolean a(edr $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(edr $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(edr $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(edr $$0) {
      return this.b() < $$0.b();
   }

   public static edr a(edr $$0, edr $$1) {
      return $$0.b($$1) ? $$0 : $$1;
   }

   @Override
   public String toString() {
      return this.f();
   }

   public String f() {
      return mg.l.b(this).toString();
   }
}
