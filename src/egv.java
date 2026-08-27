import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record egv(List<egk> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akf c = new akf("jigsaw");
   private static final Map<akf, akf> d = ImmutableMap.builder()
      .put(new akf("nvi"), c)
      .put(new akf("pcp"), c)
      .put(new akf("bastionremnant"), c)
      .put(new akf("runtime"), c)
      .build();

   public egv(List<egk> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(im $$0) {
      for (egk $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public uv a(egw $$0) {
      ue $$1 = new ue();

      for (egk $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static egv a(ue $$0, egw $$1) {
      List<egk> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ty $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akf $$6 = new akf($$5);
         akf $$7 = d.getOrDefault($$6, $$6);
         egx $$8 = lc.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               egk $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new egv($$2);
   }

   public efy b() {
      return egk.a(this.a.stream());
   }

   public List<egk> c() {
      return this.a;
   }
}
