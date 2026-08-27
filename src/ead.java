import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ead(List<dzs> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ahh c = new ahh("jigsaw");
   private static final Map<ahh, ahh> d = ImmutableMap.builder()
      .put(new ahh("nvi"), c)
      .put(new ahh("pcp"), c)
      .put(new ahh("bastionremnant"), c)
      .put(new ahh("runtime"), c)
      .build();

   public ead(List<dzs> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(hx $$0) {
      for (dzs $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public tl a(eae $$0) {
      su $$1 = new su();

      for (dzs $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ead a(su $$0, eae $$1) {
      List<dzs> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         so $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ahh $$6 = new ahh($$5);
         ahh $$7 = d.getOrDefault($$6, $$6);
         eaf $$8 = kd.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dzs $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ead($$2);
   }

   public dzg b() {
      return dzs.a(this.a.stream());
   }

   public List<dzs> c() {
      return this.a;
   }
}
