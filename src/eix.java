import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eix(List<eim> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ale c = new ale("jigsaw");
   private static final Map<ale, ale> d = ImmutableMap.builder()
      .put(new ale("nvi"), c)
      .put(new ale("pcp"), c)
      .put(new ale("bastionremnant"), c)
      .put(new ale("runtime"), c)
      .build();

   public eix(final List<eim> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(iz $$0) {
      for (eim $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vo a(eiy $$0) {
      ux $$1 = new ux();

      for (eim $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eix a(ux $$0, eiy $$1) {
      List<eim> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ur $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ale $$6 = new ale($$5);
         ale $$7 = d.getOrDefault($$6, $$6);
         eiz $$8 = lp.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eim $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eix($$2);
   }

   public eia b() {
      return eim.a(this.a.stream());
   }

   public List<eim> c() {
      return this.a;
   }
}
