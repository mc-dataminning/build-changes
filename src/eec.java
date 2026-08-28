import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class eec {
   public static final int a = 8;
   private static final EnumSet<ehd.a> p = EnumSet.of(ehd.a.c, ehd.a.a);
   public static final EnumSet<ehd.a> b = EnumSet.of(ehd.a.d, ehd.a.b, ehd.a.e, ehd.a.f);
   public static final eec c = a("empty", null, p, eeg.a);
   public static final eec d = a("structure_starts", c, p, eeg.a);
   public static final eec e = a("structure_references", d, p, eeg.a);
   public static final eec f = a("biomes", e, p, eeg.a);
   public static final eec g = a("noise", f, p, eeg.a);
   public static final eec h = a("surface", g, p, eeg.a);
   public static final eec i = a("carvers", h, b, eeg.a);
   public static final eec j = a("features", i, b, eeg.a);
   public static final eec k = a("initialize_light", j, b, eeg.a);
   public static final eec l = a("light", k, b, eeg.a);
   public static final eec m = a("spawn", l, b, eeg.a);
   public static final eec n = a("full", m, b, eeg.b);
   public static final Codec<eec> o = mg.l.q();
   private final int q;
   private final eec r;
   private final eeg s;
   private final EnumSet<ehd.a> t;

   private static eec a(String $$0, @Nullable eec $$1, EnumSet<ehd.a> $$2, eeg $$3) {
      return js.a(mg.l, $$0, new eec($$1, $$2, $$3));
   }

   public static List<eec> a() {
      List<eec> $$0 = Lists.newArrayList();

      eec $$1;
      for ($$1 = n; $$1.c() != $$1; $$1 = $$1.c()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   @VisibleForTesting
   protected eec(@Nullable eec $$0, EnumSet<ehd.a> $$1, eeg $$2) {
      this.r = $$0 == null ? this : $$0;
      this.s = $$2;
      this.t = $$1;
      this.q = $$0 == null ? 0 : $$0.b() + 1;
   }

   public int b() {
      return this.q;
   }

   public eec c() {
      return this.r;
   }

   public eeg d() {
      return this.s;
   }

   public static eec a(String $$0) {
      return mg.l.a(ali.c($$0));
   }

   public EnumSet<ehd.a> e() {
      return this.t;
   }

   public boolean a(eec $$0) {
      return this.b() >= $$0.b();
   }

   public boolean b(eec $$0) {
      return this.b() > $$0.b();
   }

   public boolean c(eec $$0) {
      return this.b() <= $$0.b();
   }

   public boolean d(eec $$0) {
      return this.b() < $$0.b();
   }

   public static eec a(eec $$0, eec $$1) {
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
