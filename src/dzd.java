import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dzd(List<dys> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final agt c = new agt("jigsaw");
   private static final Map<agt, agt> d = ImmutableMap.builder()
      .put(new agt("nvi"), c)
      .put(new agt("pcp"), c)
      .put(new agt("bastionremnant"), c)
      .put(new agt("runtime"), c)
      .build();

   public dzd(List<dys> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(hv $$0) {
      for (dys $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public tg a(dze $$0) {
      sp $$1 = new sp();

      for (dys $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dzd a(sp $$0, dze $$1) {
      List<dys> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         sj $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         agt $$6 = new agt($$5);
         agt $$7 = d.getOrDefault($$6, $$6);
         dzf $$8 = kb.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dys $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dzd($$2);
   }

   public dyg b() {
      return dys.a(this.a.stream());
   }

   public List<dys> c() {
      return this.a;
   }
}
