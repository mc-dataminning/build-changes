import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dvx(List<dvm> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final aex c = new aex("jigsaw");
   private static final Map<aex, aex> d = ImmutableMap.builder()
      .put(new aex("nvi"), c)
      .put(new aex("pcp"), c)
      .put(new aex("bastionremnant"), c)
      .put(new aex("runtime"), c)
      .build();

   public dvx(List<dvm> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(gw $$0) {
      for (dvm $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public rr a(dvy $$0) {
      re $$1 = new re();

      for (dvm $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dvx a(re $$0, dvy $$1) {
      List<dvm> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         qy $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         aex $$6 = new aex($$5);
         aex $$7 = d.getOrDefault($$6, $$6);
         dvz $$8 = jd.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dvm $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dvx($$2);
   }

   public dva b() {
      return dvm.a(this.a.stream());
   }

   public List<dvm> c() {
      return this.a;
   }
}
