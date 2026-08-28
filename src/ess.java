import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ess(List<esh> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alk c = alk.b("jigsaw");
   private static final Map<alk, alk> d = ImmutableMap.builder()
      .put(alk.b("nvi"), c)
      .put(alk.b("pcp"), c)
      .put(alk.b("bastionremnant"), c)
      .put(alk.b("runtime"), c)
      .build();

   public ess(final List<esh> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(iw $$0) {
      for (esh $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public va a(est $$0) {
      ug $$1 = new ug();

      for (esh $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ess a(ug $$0, est $$1) {
      List<esh> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ua $$4 = $$0.b($$3);
         String $$5 = $$4.b("id", "").toLowerCase(Locale.ROOT);
         alk $$6 = alk.a($$5);
         alk $$7 = d.getOrDefault($$6, $$6);
         esu $$8 = mh.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               esh $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ess($$2);
   }

   public erv b() {
      return esh.a(this.a.stream());
   }

   public List<esh> c() {
      return this.a;
   }
}
