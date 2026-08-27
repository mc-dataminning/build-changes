import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ecv(List<eck> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ajc c = new ajc("jigsaw");
   private static final Map<ajc, ajc> d = ImmutableMap.builder()
      .put(new ajc("nvi"), c)
      .put(new ajc("pcp"), c)
      .put(new ajc("bastionremnant"), c)
      .put(new ajc("runtime"), c)
      .build();

   public ecv(List<eck> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ib $$0) {
      for (eck $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public tv a(ecw $$0) {
      te $$1 = new te();

      for (eck $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ecv a(te $$0, ecw $$1) {
      List<eck> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         sy $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ajc $$6 = new ajc($$5);
         ajc $$7 = d.getOrDefault($$6, $$6);
         ecx $$8 = kh.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eck $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ecv($$2);
   }

   public eby b() {
      return eck.a(this.a.stream());
   }

   public List<eck> c() {
      return this.a;
   }
}
