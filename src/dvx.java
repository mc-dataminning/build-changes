import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dvx(List<dvm> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final aew c = new aew("jigsaw");
   private static final Map<aew, aew> d = ImmutableMap.builder()
      .put(new aew("nvi"), c)
      .put(new aew("pcp"), c)
      .put(new aew("bastionremnant"), c)
      .put(new aew("runtime"), c)
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

   public rq a(dvy $$0) {
      rc $$1 = new rc();

      for (dvm $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dvx a(rc $$0, dvy $$1) {
      List<dvm> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         qw $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         aew $$6 = new aew($$5);
         aew $$7 = d.getOrDefault($$6, $$6);
         dvz $$8 = jb.T.a($$7);
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
