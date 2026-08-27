import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dvs(List<dvh> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final aeu c = new aeu("jigsaw");
   private static final Map<aeu, aeu> d = ImmutableMap.builder()
      .put(new aeu("nvi"), c)
      .put(new aeu("pcp"), c)
      .put(new aeu("bastionremnant"), c)
      .put(new aeu("runtime"), c)
      .build();

   public dvs(List<dvh> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(gw $$0) {
      for (dvh $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public rn a(dvt $$0) {
      ra $$1 = new ra();

      for (dvh $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dvs a(ra $$0, dvt $$1) {
      List<dvh> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         qu $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         aeu $$6 = new aeu($$5);
         aeu $$7 = d.getOrDefault($$6, $$6);
         dvu $$8 = jd.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dvh $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dvs($$2);
   }

   public duv b() {
      return dvh.a(this.a.stream());
   }

   public List<dvh> c() {
      return this.a;
   }
}
