import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eiy(List<ein> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ale c = new ale("jigsaw");
   private static final Map<ale, ale> d = ImmutableMap.builder()
      .put(new ale("nvi"), c)
      .put(new ale("pcp"), c)
      .put(new ale("bastionremnant"), c)
      .put(new ale("runtime"), c)
      .build();

   public eiy(final List<ein> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(iz $$0) {
      for (ein $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vo a(eiz $$0) {
      ux $$1 = new ux();

      for (ein $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eiy a(ux $$0, eiz $$1) {
      List<ein> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ur $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ale $$6 = new ale($$5);
         ale $$7 = d.getOrDefault($$6, $$6);
         eja $$8 = lp.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               ein $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eiy($$2);
   }

   public eib b() {
      return ein.a(this.a.stream());
   }

   public List<ein> c() {
      return this.a;
   }
}
